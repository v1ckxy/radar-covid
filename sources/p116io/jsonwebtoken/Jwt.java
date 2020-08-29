package p116io.jsonwebtoken;

import p116io.jsonwebtoken.Header;

/* renamed from: io.jsonwebtoken.Jwt */
public interface Jwt<H extends Header, B> {
    B getBody();

    H getHeader();
}
