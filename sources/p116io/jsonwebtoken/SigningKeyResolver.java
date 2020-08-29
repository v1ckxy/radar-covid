package p116io.jsonwebtoken;

import java.security.Key;

/* renamed from: io.jsonwebtoken.SigningKeyResolver */
public interface SigningKeyResolver {
    Key resolveSigningKey(JwsHeader jwsHeader, Claims claims);

    Key resolveSigningKey(JwsHeader jwsHeader, String str);
}
