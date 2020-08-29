package p116io.jsonwebtoken;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import p116io.jsonwebtoken.p117io.Encoder;
import p116io.jsonwebtoken.p117io.Serializer;

/* renamed from: io.jsonwebtoken.JwtBuilder */
public interface JwtBuilder extends ClaimsMutator<JwtBuilder> {
    JwtBuilder addClaims(Map<String, Object> map);

    JwtBuilder base64UrlEncodeWith(Encoder<byte[], String> encoder);

    JwtBuilder claim(String str, Object obj);

    String compact();

    JwtBuilder compressWith(CompressionCodec compressionCodec);

    JwtBuilder serializeToJsonWith(Serializer<Map<String, ?>> serializer);

    JwtBuilder setAudience(String str);

    JwtBuilder setClaims(Claims claims);

    JwtBuilder setClaims(Map<String, ?> map);

    JwtBuilder setExpiration(Date date);

    JwtBuilder setHeader(Header header);

    JwtBuilder setHeader(Map<String, Object> map);

    JwtBuilder setHeaderParam(String str, Object obj);

    JwtBuilder setHeaderParams(Map<String, Object> map);

    JwtBuilder setId(String str);

    JwtBuilder setIssuedAt(Date date);

    JwtBuilder setIssuer(String str);

    JwtBuilder setNotBefore(Date date);

    JwtBuilder setPayload(String str);

    JwtBuilder setSubject(String str);

    @Deprecated
    JwtBuilder signWith(SignatureAlgorithm signatureAlgorithm, String str);

    @Deprecated
    JwtBuilder signWith(SignatureAlgorithm signatureAlgorithm, Key key);

    @Deprecated
    JwtBuilder signWith(SignatureAlgorithm signatureAlgorithm, byte[] bArr);

    JwtBuilder signWith(Key key);

    JwtBuilder signWith(Key key, SignatureAlgorithm signatureAlgorithm);
}
