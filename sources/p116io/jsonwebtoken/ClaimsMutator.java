package p116io.jsonwebtoken;

import java.util.Date;
import p116io.jsonwebtoken.ClaimsMutator;

/* renamed from: io.jsonwebtoken.ClaimsMutator */
public interface ClaimsMutator<T extends ClaimsMutator> {
    T setAudience(String str);

    T setExpiration(Date date);

    T setId(String str);

    T setIssuedAt(Date date);

    T setIssuer(String str);

    T setNotBefore(Date date);

    T setSubject(String str);
}
