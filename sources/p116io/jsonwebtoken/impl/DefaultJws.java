package p116io.jsonwebtoken.impl;

import p116io.jsonwebtoken.Jws;
import p116io.jsonwebtoken.JwsHeader;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.impl.DefaultJws */
public class DefaultJws<B> implements Jws<B> {
    public final B body;
    public final JwsHeader header;
    public final String signature;

    public DefaultJws(JwsHeader jwsHeader, B b, String str) {
        this.header = jwsHeader;
        this.body = b;
        this.signature = str;
    }

    public B getBody() {
        return this.body;
    }

    public JwsHeader getHeader() {
        return this.header;
    }

    public String getSignature() {
        return this.signature;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("header=");
        a.append(this.header);
        a.append(",body=");
        a.append(this.body);
        a.append(",signature=");
        a.append(this.signature);
        return a.toString();
    }
}
