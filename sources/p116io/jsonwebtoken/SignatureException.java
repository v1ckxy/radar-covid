package p116io.jsonwebtoken;

import p116io.jsonwebtoken.security.SecurityException;

@Deprecated
/* renamed from: io.jsonwebtoken.SignatureException */
public class SignatureException extends SecurityException {
    public SignatureException(String str) {
        super(str);
    }

    public SignatureException(String str, Throwable th) {
        super(str, th);
    }
}
