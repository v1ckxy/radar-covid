package p116io.jsonwebtoken.impl;

@Deprecated
/* renamed from: io.jsonwebtoken.impl.TextCodec */
public interface TextCodec {
    @Deprecated
    public static final TextCodec BASE64 = new Base64Codec();
    @Deprecated
    public static final TextCodec BASE64URL = new Base64UrlCodec();

    byte[] decode(String str);

    String decodeToString(String str);

    String encode(String str);

    String encode(byte[] bArr);
}
