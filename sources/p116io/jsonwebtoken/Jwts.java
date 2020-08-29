package p116io.jsonwebtoken;

import java.util.Map;
import p116io.jsonwebtoken.lang.Classes;

/* renamed from: io.jsonwebtoken.Jwts */
public final class Jwts {
    public static final Class[] MAP_ARG = {Map.class};

    public static JwtBuilder builder() {
        return (JwtBuilder) Classes.newInstance("io.jsonwebtoken.impl.DefaultJwtBuilder");
    }

    public static Claims claims() {
        return (Claims) Classes.newInstance("io.jsonwebtoken.impl.DefaultClaims");
    }

    public static Claims claims(Map<String, Object> map) {
        return (Claims) Classes.newInstance("io.jsonwebtoken.impl.DefaultClaims", MAP_ARG, map);
    }

    public static Header header() {
        return (Header) Classes.newInstance("io.jsonwebtoken.impl.DefaultHeader");
    }

    public static Header header(Map<String, Object> map) {
        return (Header) Classes.newInstance("io.jsonwebtoken.impl.DefaultHeader", MAP_ARG, map);
    }

    public static JwsHeader jwsHeader() {
        return (JwsHeader) Classes.newInstance("io.jsonwebtoken.impl.DefaultJwsHeader");
    }

    public static JwsHeader jwsHeader(Map<String, Object> map) {
        return (JwsHeader) Classes.newInstance("io.jsonwebtoken.impl.DefaultJwsHeader", MAP_ARG, map);
    }

    @Deprecated
    public static JwtParser parser() {
        return (JwtParser) Classes.newInstance("io.jsonwebtoken.impl.DefaultJwtParser");
    }

    public static JwtParserBuilder parserBuilder() {
        return (JwtParserBuilder) Classes.newInstance("io.jsonwebtoken.impl.DefaultJwtParserBuilder");
    }
}
