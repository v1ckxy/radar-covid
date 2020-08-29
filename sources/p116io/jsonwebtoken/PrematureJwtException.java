package p116io.jsonwebtoken;

/* renamed from: io.jsonwebtoken.PrematureJwtException */
public class PrematureJwtException extends ClaimJwtException {
    public PrematureJwtException(Header header, Claims claims, String str) {
        super(header, claims, str);
    }

    public PrematureJwtException(Header header, Claims claims, String str, Throwable th) {
        super(header, claims, str, th);
    }
}
