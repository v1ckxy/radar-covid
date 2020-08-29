package p116io.jsonwebtoken.impl.compression;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p116io.jsonwebtoken.CompressionCodec;
import p116io.jsonwebtoken.CompressionException;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.lang.Objects;

/* renamed from: io.jsonwebtoken.impl.compression.AbstractCompressionCodec */
public abstract class AbstractCompressionCodec implements CompressionCodec {

    /* renamed from: io.jsonwebtoken.impl.compression.AbstractCompressionCodec$StreamWrapper */
    public interface StreamWrapper {
        OutputStream wrap(OutputStream outputStream);
    }

    public final byte[] compress(byte[] bArr) {
        Assert.notNull(bArr, "payload cannot be null.");
        try {
            return doCompress(bArr);
        } catch (IOException e) {
            throw new CompressionException("Unable to compress payload.", e);
        }
    }

    public final byte[] decompress(byte[] bArr) {
        Assert.notNull(bArr, "compressed bytes cannot be null.");
        try {
            return doDecompress(bArr);
        } catch (IOException e) {
            throw new CompressionException("Unable to decompress bytes.", e);
        }
    }

    public abstract byte[] doCompress(byte[] bArr);

    public abstract byte[] doDecompress(byte[] bArr);

    /* JADX INFO: finally extract failed */
    public byte[] readAndClose(InputStream inputStream) {
        byte[] bArr = new byte[512];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        try {
            int read = inputStream.read(bArr);
            while (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            Objects.nullSafeClose(inputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            Objects.nullSafeClose(inputStream);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public byte[] writeAndClose(byte[] bArr, StreamWrapper streamWrapper) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        OutputStream wrap = streamWrapper.wrap(byteArrayOutputStream);
        try {
            wrap.write(bArr);
            wrap.flush();
            Objects.nullSafeClose(wrap);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            Objects.nullSafeClose(wrap);
            throw th;
        }
    }
}
