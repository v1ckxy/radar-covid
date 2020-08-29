package p116io.jsonwebtoken.impl.compression;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p116io.jsonwebtoken.CompressionCodec;
import p116io.jsonwebtoken.impl.compression.AbstractCompressionCodec.StreamWrapper;

/* renamed from: io.jsonwebtoken.impl.compression.GzipCompressionCodec */
public class GzipCompressionCodec extends AbstractCompressionCodec implements CompressionCodec {
    public static final String GZIP = "GZIP";
    public static final StreamWrapper WRAPPER = new StreamWrapper() {
        public OutputStream wrap(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }
    };

    public byte[] doCompress(byte[] bArr) {
        return writeAndClose(bArr, WRAPPER);
    }

    public byte[] doDecompress(byte[] bArr) {
        return readAndClose(new GZIPInputStream(new ByteArrayInputStream(bArr)));
    }

    public String getAlgorithmName() {
        return GZIP;
    }
}
