package p116io.jsonwebtoken.impl;

import p116io.jsonwebtoken.p117io.Decoders;
import p116io.jsonwebtoken.p117io.Encoders;

@Deprecated
/* renamed from: io.jsonwebtoken.impl.Base64UrlCodec */
public class Base64UrlCodec extends AbstractTextCodec {
    public byte[] decode(String str) {
        return (byte[]) Decoders.BASE64URL.decode(str);
    }

    public String encode(byte[] bArr) {
        return (String) Encoders.BASE64URL.encode(bArr);
    }
}
