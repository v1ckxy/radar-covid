package p116io.jsonwebtoken.p117io;

import p116io.jsonwebtoken.lang.Assert;

/* renamed from: io.jsonwebtoken.io.Base64Encoder */
public class Base64Encoder extends Base64Support implements Encoder<byte[], String> {
    public Base64Encoder() {
        super(Base64.DEFAULT);
    }

    public Base64Encoder(Base64 base64) {
        super(base64);
    }

    public String encode(byte[] bArr) {
        Assert.notNull(bArr, "byte array argument cannot be null");
        return this.base64.encodeToString(bArr, false);
    }
}
