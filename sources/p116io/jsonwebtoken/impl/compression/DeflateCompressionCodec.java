package p116io.jsonwebtoken.impl.compression;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.InflaterOutputStream;
import p116io.jsonwebtoken.impl.compression.AbstractCompressionCodec.StreamWrapper;
import p116io.jsonwebtoken.lang.Objects;

/* renamed from: io.jsonwebtoken.impl.compression.DeflateCompressionCodec */
public class DeflateCompressionCodec extends AbstractCompressionCodec {
    public static final String DEFLATE = "DEF";
    public static final StreamWrapper WRAPPER = new StreamWrapper() {
        public OutputStream wrap(OutputStream outputStream) {
            return new DeflaterOutputStream(outputStream);
        }
    };

    public byte[] doCompress(byte[] bArr) {
        return writeAndClose(bArr, WRAPPER);
    }

    public byte[] doDecompress(byte[] bArr) {
        try {
            return readAndClose(new InflaterInputStream(new ByteArrayInputStream(bArr)));
        } catch (IOException e) {
            try {
                return doDecompressBackCompat(bArr);
            } catch (IOException unused) {
                throw e;
            }
        }
    }

    public byte[] doDecompressBackCompat(byte[] bArr) {
        InflaterOutputStream inflaterOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream2);
                try {
                    inflaterOutputStream.write(bArr);
                    inflaterOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    Objects.nullSafeClose(byteArrayOutputStream2, inflaterOutputStream);
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    Objects.nullSafeClose(byteArrayOutputStream, inflaterOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inflaterOutputStream = null;
                byteArrayOutputStream = byteArrayOutputStream2;
                Objects.nullSafeClose(byteArrayOutputStream, inflaterOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inflaterOutputStream = null;
            Objects.nullSafeClose(byteArrayOutputStream, inflaterOutputStream);
            throw th;
        }
    }

    public String getAlgorithmName() {
        return DEFLATE;
    }
}
