package p116io.jsonwebtoken.p117io;

/* renamed from: io.jsonwebtoken.io.Encoders */
public final class Encoders {
    public static final Encoder<byte[], String> BASE64 = new ExceptionPropagatingEncoder(new Base64Encoder());
    public static final Encoder<byte[], String> BASE64URL = new ExceptionPropagatingEncoder(new Base64UrlEncoder());
}
