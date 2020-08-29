package p116io.jsonwebtoken.impl;

import p116io.jsonwebtoken.Header;
import p116io.jsonwebtoken.Jwt;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.impl.DefaultJwt */
public class DefaultJwt<B> implements Jwt<Header, B> {
    public final B body;
    public final Header header;

    public DefaultJwt(Header header2, B b) {
        this.header = header2;
        this.body = b;
    }

    public B getBody() {
        return this.body;
    }

    public Header getHeader() {
        return this.header;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("header=");
        a.append(this.header);
        a.append(",body=");
        a.append(this.body);
        return a.toString();
    }
}
