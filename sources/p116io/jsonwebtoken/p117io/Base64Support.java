package p116io.jsonwebtoken.p117io;

import p116io.jsonwebtoken.lang.Assert;

/* renamed from: io.jsonwebtoken.io.Base64Support */
public class Base64Support {
    public final Base64 base64;

    public Base64Support(Base64 base642) {
        Assert.notNull(base642, "Base64 argument cannot be null");
        this.base64 = base642;
    }
}
