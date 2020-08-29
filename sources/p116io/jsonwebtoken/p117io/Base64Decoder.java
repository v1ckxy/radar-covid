package p116io.jsonwebtoken.p117io;

import p116io.jsonwebtoken.lang.Assert;

/* renamed from: io.jsonwebtoken.io.Base64Decoder */
public class Base64Decoder extends Base64Support implements Decoder<String, byte[]> {
    public Base64Decoder() {
        super(Base64.DEFAULT);
    }

    public Base64Decoder(Base64 base64) {
        super(base64);
    }

    public byte[] decode(String str) {
        Assert.notNull(str, "String argument cannot be null");
        return this.base64.decodeFast(str.toCharArray());
    }
}
