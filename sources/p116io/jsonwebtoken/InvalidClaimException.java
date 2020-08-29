package p116io.jsonwebtoken;

/* renamed from: io.jsonwebtoken.InvalidClaimException */
public class InvalidClaimException extends ClaimJwtException {
    public String claimName;
    public Object claimValue;

    public InvalidClaimException(Header header, Claims claims, String str) {
        super(header, claims, str);
    }

    public InvalidClaimException(Header header, Claims claims, String str, Throwable th) {
        super(header, claims, str, th);
    }

    public String getClaimName() {
        return this.claimName;
    }

    public Object getClaimValue() {
        return this.claimValue;
    }

    public void setClaimName(String str) {
        this.claimName = str;
    }

    public void setClaimValue(Object obj) {
        this.claimValue = obj;
    }
}
