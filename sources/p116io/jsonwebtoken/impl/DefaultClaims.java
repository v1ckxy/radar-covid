package p116io.jsonwebtoken.impl;

import java.util.Date;
import java.util.Map;
import p116io.jsonwebtoken.Claims;
import p116io.jsonwebtoken.RequiredTypeException;

/* renamed from: io.jsonwebtoken.impl.DefaultClaims */
public class DefaultClaims extends JwtMap implements Claims {
    public static final String CONVERSION_ERROR_MSG = "Cannot convert existing claim value of type '%s' to desired type '%s'. JJWT only converts simple String, Date, Long, Integer, Short and Byte types automatically. Anything more complex is expected to be already converted to your desired type by the JSON Deserializer implementation. You may specify a custom Deserializer for a JwtParser with the desired conversion configuration via the JwtParserBuilder.deserializeJsonWith() method. See https://github.com/jwtk/jjwt#custom-json-processor for more information. If using Jackson, you can specify custom claim POJO types as described in https://github.com/jwtk/jjwt#json-jackson-custom-types";

    public DefaultClaims() {
    }

    public DefaultClaims(Map<String, ?> map) {
        super(map);
    }

    private <T> T castClaimValue(Object obj, Class<T> cls) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            if (cls == Long.class) {
                obj = Long.valueOf((long) intValue);
            } else if (cls == Short.class && -32768 <= intValue && intValue <= 32767) {
                obj = Short.valueOf((short) intValue);
            } else if (cls == Byte.class && -128 <= intValue && intValue <= 127) {
                obj = Byte.valueOf((byte) intValue);
            }
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        throw new RequiredTypeException(String.format(CONVERSION_ERROR_MSG, new Object[]{obj.getClass(), cls}));
    }

    public static boolean isSpecDate(String str) {
        return Claims.EXPIRATION.equals(str) || Claims.ISSUED_AT.equals(str) || Claims.NOT_BEFORE.equals(str);
    }

    public <T> T get(String str, Class<T> cls) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        if (Date.class.equals(cls)) {
            obj = isSpecDate(str) ? JwtMap.toSpecDate(obj, str) : JwtMap.toDate(obj, str);
        }
        return castClaimValue(obj, cls);
    }

    public String getAudience() {
        return getString(Claims.AUDIENCE);
    }

    public Date getExpiration() {
        return (Date) get(Claims.EXPIRATION, Date.class);
    }

    public String getId() {
        return getString(Claims.f2453ID);
    }

    public Date getIssuedAt() {
        return (Date) get(Claims.ISSUED_AT, Date.class);
    }

    public String getIssuer() {
        return getString(Claims.ISSUER);
    }

    public Date getNotBefore() {
        return (Date) get(Claims.NOT_BEFORE, Date.class);
    }

    public String getSubject() {
        return getString(Claims.SUBJECT);
    }

    public Object put(String str, Object obj) {
        return (!(obj instanceof Date) || !isSpecDate(str)) ? super.put(str, obj) : setDateAsSeconds(str, (Date) obj);
    }

    public Claims setAudience(String str) {
        setValue(Claims.AUDIENCE, str);
        return this;
    }

    public Claims setExpiration(Date date) {
        setDateAsSeconds(Claims.EXPIRATION, date);
        return this;
    }

    public Claims setId(String str) {
        setValue(Claims.f2453ID, str);
        return this;
    }

    public Claims setIssuedAt(Date date) {
        setDateAsSeconds(Claims.ISSUED_AT, date);
        return this;
    }

    public Claims setIssuer(String str) {
        setValue(Claims.ISSUER, str);
        return this;
    }

    public Claims setNotBefore(Date date) {
        setDateAsSeconds(Claims.NOT_BEFORE, date);
        return this;
    }

    public Claims setSubject(String str) {
        setValue(Claims.SUBJECT, str);
        return this;
    }
}
