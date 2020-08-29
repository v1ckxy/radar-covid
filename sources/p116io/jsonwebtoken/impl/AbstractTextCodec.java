package p116io.jsonwebtoken.impl;

import java.nio.charset.Charset;
import p116io.jsonwebtoken.lang.Assert;

@Deprecated
/* renamed from: io.jsonwebtoken.impl.AbstractTextCodec */
public abstract class AbstractTextCodec implements TextCodec {
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset UTF8 = Charset.forName("UTF-8");

    public String decodeToString(String str) {
        return new String(decode(str), UTF8);
    }

    public String encode(String str) {
        Assert.hasText(str, "String argument to encode cannot be null or empty.");
        return encode(str.getBytes(UTF8));
    }
}
