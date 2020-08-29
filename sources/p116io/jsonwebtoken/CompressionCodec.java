package p116io.jsonwebtoken;

/* renamed from: io.jsonwebtoken.CompressionCodec */
public interface CompressionCodec {
    byte[] compress(byte[] bArr);

    byte[] decompress(byte[] bArr);

    String getAlgorithmName();
}
