package p116io.jsonwebtoken.security;

import p116io.jsonwebtoken.JwtException;

/* renamed from: io.jsonwebtoken.security.SecurityException */
public class SecurityException extends JwtException {
    public SecurityException(String str) {
        super(str);
    }

    public SecurityException(String str, Throwable th) {
        super(str, th);
    }
}
