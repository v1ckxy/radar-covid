package p116io.jsonwebtoken.impl;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import p116io.jsonwebtoken.Claims;
import p116io.jsonwebtoken.Clock;
import p116io.jsonwebtoken.CompressionCodecResolver;
import p116io.jsonwebtoken.Header;
import p116io.jsonwebtoken.Jws;
import p116io.jsonwebtoken.Jwt;
import p116io.jsonwebtoken.JwtHandler;
import p116io.jsonwebtoken.JwtParser;
import p116io.jsonwebtoken.SigningKeyResolver;
import p116io.jsonwebtoken.p117io.Decoder;
import p116io.jsonwebtoken.p117io.Deserializer;

/* renamed from: io.jsonwebtoken.impl.ImmutableJwtParser */
public class ImmutableJwtParser implements JwtParser {
    public final JwtParser jwtParser;

    public ImmutableJwtParser(JwtParser jwtParser2) {
        this.jwtParser = jwtParser2;
    }

    private IllegalStateException doNotMutate() {
        return new IllegalStateException("Cannot mutate a JwtParser created from JwtParserBuilder.build(), the mutable methods in JwtParser will be removed before version 1.0");
    }

    public JwtParser base64UrlDecodeWith(Decoder<String, byte[]> decoder) {
        throw doNotMutate();
    }

    public JwtParser deserializeJsonWith(Deserializer<Map<String, ?>> deserializer) {
        throw doNotMutate();
    }

    public boolean isSigned(String str) {
        return this.jwtParser.isSigned(str);
    }

    public Jwt parse(String str) {
        return this.jwtParser.parse(str);
    }

    public <T> T parse(String str, JwtHandler<T> jwtHandler) {
        return this.jwtParser.parse(str, jwtHandler);
    }

    public Jws<Claims> parseClaimsJws(String str) {
        return this.jwtParser.parseClaimsJws(str);
    }

    public Jwt<Header, Claims> parseClaimsJwt(String str) {
        return this.jwtParser.parseClaimsJwt(str);
    }

    public Jws<String> parsePlaintextJws(String str) {
        return this.jwtParser.parsePlaintextJws(str);
    }

    public Jwt<Header, String> parsePlaintextJwt(String str) {
        return this.jwtParser.parsePlaintextJwt(str);
    }

    public JwtParser require(String str, Object obj) {
        throw doNotMutate();
    }

    public JwtParser requireAudience(String str) {
        throw doNotMutate();
    }

    public JwtParser requireExpiration(Date date) {
        throw doNotMutate();
    }

    public JwtParser requireId(String str) {
        throw doNotMutate();
    }

    public JwtParser requireIssuedAt(Date date) {
        throw doNotMutate();
    }

    public JwtParser requireIssuer(String str) {
        throw doNotMutate();
    }

    public JwtParser requireNotBefore(Date date) {
        throw doNotMutate();
    }

    public JwtParser requireSubject(String str) {
        throw doNotMutate();
    }

    public JwtParser setAllowedClockSkewSeconds(long j) {
        throw doNotMutate();
    }

    public JwtParser setClock(Clock clock) {
        throw doNotMutate();
    }

    public JwtParser setCompressionCodecResolver(CompressionCodecResolver compressionCodecResolver) {
        throw doNotMutate();
    }

    public JwtParser setSigningKey(String str) {
        throw doNotMutate();
    }

    public JwtParser setSigningKey(Key key) {
        throw doNotMutate();
    }

    public JwtParser setSigningKey(byte[] bArr) {
        throw doNotMutate();
    }

    public JwtParser setSigningKeyResolver(SigningKeyResolver signingKeyResolver) {
        throw doNotMutate();
    }
}
