package p116io.jsonwebtoken.impl;

import p116io.jsonwebtoken.p117io.Decoders;
import p116io.jsonwebtoken.p117io.Encoders;

@Deprecated
/* renamed from: io.jsonwebtoken.impl.AndroidBase64Codec */
public class AndroidBase64Codec extends AbstractTextCodec {
    public byte[] decode(String str) {
        return (byte[]) Decoders.BASE64.decode(str);
    }

    public String encode(byte[] bArr) {
        return (String) Encoders.BASE64.encode(bArr);
    }
}
