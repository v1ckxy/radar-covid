package p116io.jsonwebtoken.impl;

import java.security.Key;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.spec.SecretKeySpec;
import p116io.jsonwebtoken.Claims;
import p116io.jsonwebtoken.CompressionCodec;
import p116io.jsonwebtoken.Header;
import p116io.jsonwebtoken.JwsHeader;
import p116io.jsonwebtoken.JwtBuilder;
import p116io.jsonwebtoken.SignatureAlgorithm;
import p116io.jsonwebtoken.impl.crypto.DefaultJwtSigner;
import p116io.jsonwebtoken.impl.crypto.JwtSigner;
import p116io.jsonwebtoken.impl.lang.LegacyServices;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.lang.Collections;
import p116io.jsonwebtoken.lang.Strings;
import p116io.jsonwebtoken.p117io.Decoders;
import p116io.jsonwebtoken.p117io.Encoder;
import p116io.jsonwebtoken.p117io.Encoders;
import p116io.jsonwebtoken.p117io.SerializationException;
import p116io.jsonwebtoken.p117io.Serializer;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.impl.DefaultJwtBuilder */
public class DefaultJwtBuilder implements JwtBuilder {
    public SignatureAlgorithm algorithm;
    public Encoder<byte[], String> base64UrlEncoder = Encoders.BASE64URL;
    public Claims claims;
    public CompressionCodec compressionCodec;
    public Header header;
    public Key key;
    public String payload;
    public Serializer<Map<String, ?>> serializer;

    public JwtBuilder addClaims(Map<String, Object> map) {
        ensureClaims().putAll(map);
        return this;
    }

    @Deprecated
    public String base64UrlEncode(Object obj, String str) {
        Assert.isInstanceOf(Map.class, obj, "object argument must be a map.");
        try {
            return (String) this.base64UrlEncoder.encode(toJson((Map) obj));
        } catch (SerializationException e) {
            throw new IllegalStateException(str, e);
        }
    }

    public JwtBuilder base64UrlEncodeWith(Encoder<byte[], String> encoder) {
        Assert.notNull(encoder, "base64UrlEncoder cannot be null.");
        this.base64UrlEncoder = encoder;
        return this;
    }

    public JwtBuilder claim(String str, Object obj) {
        Assert.hasText(str, "Claim property name cannot be null or empty.");
        Claims claims2 = this.claims;
        if (claims2 == null) {
            if (obj != null) {
                claims2 = ensureClaims();
            }
            return this;
        } else if (obj == null) {
            claims2.remove(str);
            return this;
        }
        claims2.put(str, obj);
        return this;
    }

    public String compact() {
        if (this.serializer == null) {
            this.serializer = (Serializer) LegacyServices.loadFirst(Serializer.class);
        }
        if (this.payload == null && Collections.isEmpty((Map) this.claims)) {
            throw new IllegalStateException("Either 'payload' or 'claims' must be specified.");
        } else if (this.payload == null || Collections.isEmpty((Map) this.claims)) {
            Header ensureHeader = ensureHeader();
            JwsHeader defaultJwsHeader = ensureHeader instanceof JwsHeader ? (JwsHeader) ensureHeader : new DefaultJwsHeader(ensureHeader);
            defaultJwsHeader.setAlgorithm((this.key != null ? this.algorithm : SignatureAlgorithm.NONE).getValue());
            CompressionCodec compressionCodec2 = this.compressionCodec;
            if (compressionCodec2 != null) {
                defaultJwsHeader.setCompressionAlgorithm(compressionCodec2.getAlgorithmName());
            }
            String base64UrlEncode = base64UrlEncode(defaultJwsHeader, "Unable to serialize header to json.");
            try {
                byte[] bytes = this.payload != null ? this.payload.getBytes(Strings.UTF_8) : toJson(this.claims);
                CompressionCodec compressionCodec3 = this.compressionCodec;
                if (compressionCodec3 != null) {
                    bytes = compressionCodec3.compress(bytes);
                }
                String str = (String) this.base64UrlEncoder.encode(bytes);
                StringBuilder sb = new StringBuilder();
                sb.append(base64UrlEncode);
                sb.append('.');
                sb.append(str);
                String sb2 = sb.toString();
                Key key2 = this.key;
                if (key2 != null) {
                    String sign = createSigner(this.algorithm, key2).sign(sb2);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append('.');
                    sb3.append(sign);
                    return sb3.toString();
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb2);
                sb4.append('.');
                return sb4.toString();
            } catch (SerializationException e) {
                StringBuilder a = C1965a.m4756a("Unable to serialize claims object to json: ");
                a.append(e.getMessage());
                throw new IllegalArgumentException(a.toString(), e);
            }
        } else {
            throw new IllegalStateException("Both 'payload' and 'claims' cannot both be specified. Choose either one.");
        }
    }

    public JwtBuilder compressWith(CompressionCodec compressionCodec2) {
        Assert.notNull(compressionCodec2, "compressionCodec cannot be null");
        this.compressionCodec = compressionCodec2;
        return this;
    }

    public JwtSigner createSigner(SignatureAlgorithm signatureAlgorithm, Key key2) {
        return new DefaultJwtSigner(signatureAlgorithm, key2, this.base64UrlEncoder);
    }

    public Claims ensureClaims() {
        if (this.claims == null) {
            this.claims = new DefaultClaims();
        }
        return this.claims;
    }

    public Header ensureHeader() {
        if (this.header == null) {
            this.header = new DefaultHeader();
        }
        return this.header;
    }

    public JwtBuilder serializeToJsonWith(Serializer<Map<String, ?>> serializer2) {
        Assert.notNull(serializer2, "Serializer cannot be null.");
        this.serializer = serializer2;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0 != null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p116io.jsonwebtoken.JwtBuilder setAudience(java.lang.String r2) {
        /*
            r1 = this;
            boolean r0 = p116io.jsonwebtoken.lang.Strings.hasText(r2)
            if (r0 == 0) goto L_0x000e
            io.jsonwebtoken.Claims r0 = r1.ensureClaims()
        L_0x000a:
            r0.setAudience(r2)
            goto L_0x0013
        L_0x000e:
            io.jsonwebtoken.Claims r0 = r1.claims
            if (r0 == 0) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.impl.DefaultJwtBuilder.setAudience(java.lang.String):io.jsonwebtoken.JwtBuilder");
    }

    public JwtBuilder setClaims(Claims claims2) {
        this.claims = claims2;
        return this;
    }

    public JwtBuilder setClaims(Map<String, ?> map) {
        this.claims = new DefaultClaims(map);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r0 != null) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p116io.jsonwebtoken.JwtBuilder setExpiration(java.util.Date r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000a
            io.jsonwebtoken.Claims r0 = r1.ensureClaims()
        L_0x0006:
            r0.setExpiration(r2)
            goto L_0x000f
        L_0x000a:
            io.jsonwebtoken.Claims r0 = r1.claims
            if (r0 == 0) goto L_0x000f
            goto L_0x0006
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.impl.DefaultJwtBuilder.setExpiration(java.util.Date):io.jsonwebtoken.JwtBuilder");
    }

    public JwtBuilder setHeader(Header header2) {
        this.header = header2;
        return this;
    }

    public JwtBuilder setHeader(Map<String, Object> map) {
        this.header = new DefaultHeader(map);
        return this;
    }

    public JwtBuilder setHeaderParam(String str, Object obj) {
        ensureHeader().put(str, obj);
        return this;
    }

    public JwtBuilder setHeaderParams(Map<String, Object> map) {
        if (!Collections.isEmpty((Map) map)) {
            Header ensureHeader = ensureHeader();
            for (Entry entry : map.entrySet()) {
                ensureHeader.put(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0 != null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p116io.jsonwebtoken.JwtBuilder setId(java.lang.String r2) {
        /*
            r1 = this;
            boolean r0 = p116io.jsonwebtoken.lang.Strings.hasText(r2)
            if (r0 == 0) goto L_0x000e
            io.jsonwebtoken.Claims r0 = r1.ensureClaims()
        L_0x000a:
            r0.setId(r2)
            goto L_0x0013
        L_0x000e:
            io.jsonwebtoken.Claims r0 = r1.claims
            if (r0 == 0) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.impl.DefaultJwtBuilder.setId(java.lang.String):io.jsonwebtoken.JwtBuilder");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r0 != null) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p116io.jsonwebtoken.JwtBuilder setIssuedAt(java.util.Date r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000a
            io.jsonwebtoken.Claims r0 = r1.ensureClaims()
        L_0x0006:
            r0.setIssuedAt(r2)
            goto L_0x000f
        L_0x000a:
            io.jsonwebtoken.Claims r0 = r1.claims
            if (r0 == 0) goto L_0x000f
            goto L_0x0006
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.impl.DefaultJwtBuilder.setIssuedAt(java.util.Date):io.jsonwebtoken.JwtBuilder");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0 != null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p116io.jsonwebtoken.JwtBuilder setIssuer(java.lang.String r2) {
        /*
            r1 = this;
            boolean r0 = p116io.jsonwebtoken.lang.Strings.hasText(r2)
            if (r0 == 0) goto L_0x000e
            io.jsonwebtoken.Claims r0 = r1.ensureClaims()
        L_0x000a:
            r0.setIssuer(r2)
            goto L_0x0013
        L_0x000e:
            io.jsonwebtoken.Claims r0 = r1.claims
            if (r0 == 0) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.impl.DefaultJwtBuilder.setIssuer(java.lang.String):io.jsonwebtoken.JwtBuilder");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r0 != null) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p116io.jsonwebtoken.JwtBuilder setNotBefore(java.util.Date r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000a
            io.jsonwebtoken.Claims r0 = r1.ensureClaims()
        L_0x0006:
            r0.setNotBefore(r2)
            goto L_0x000f
        L_0x000a:
            io.jsonwebtoken.Claims r0 = r1.claims
            if (r0 == 0) goto L_0x000f
            goto L_0x0006
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.impl.DefaultJwtBuilder.setNotBefore(java.util.Date):io.jsonwebtoken.JwtBuilder");
    }

    public JwtBuilder setPayload(String str) {
        this.payload = str;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0 != null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p116io.jsonwebtoken.JwtBuilder setSubject(java.lang.String r2) {
        /*
            r1 = this;
            boolean r0 = p116io.jsonwebtoken.lang.Strings.hasText(r2)
            if (r0 == 0) goto L_0x000e
            io.jsonwebtoken.Claims r0 = r1.ensureClaims()
        L_0x000a:
            r0.setSubject(r2)
            goto L_0x0013
        L_0x000e:
            io.jsonwebtoken.Claims r0 = r1.claims
            if (r0 == 0) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.impl.DefaultJwtBuilder.setSubject(java.lang.String):io.jsonwebtoken.JwtBuilder");
    }

    public JwtBuilder signWith(SignatureAlgorithm signatureAlgorithm, String str) {
        Assert.hasText(str, "base64-encoded secret key cannot be null or empty.");
        Assert.isTrue(signatureAlgorithm.isHmac(), "Base64-encoded key bytes may only be specified for HMAC signatures.  If using RSA or Elliptic Curve, use the signWith(SignatureAlgorithm, Key) method instead.");
        return signWith(signatureAlgorithm, (byte[]) Decoders.BASE64.decode(str));
    }

    public JwtBuilder signWith(SignatureAlgorithm signatureAlgorithm, Key key2) {
        return signWith(key2, signatureAlgorithm);
    }

    public JwtBuilder signWith(SignatureAlgorithm signatureAlgorithm, byte[] bArr) {
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm cannot be null.");
        Assert.notEmpty(bArr, "secret key byte array cannot be null or empty.");
        Assert.isTrue(signatureAlgorithm.isHmac(), "Key bytes may only be specified for HMAC signatures.  If using RSA or Elliptic Curve, use the signWith(SignatureAlgorithm, Key) method instead.");
        return signWith((Key) new SecretKeySpec(bArr, signatureAlgorithm.getJcaName()), signatureAlgorithm);
    }

    public JwtBuilder signWith(Key key2) {
        Assert.notNull(key2, "Key argument cannot be null.");
        return signWith(key2, SignatureAlgorithm.forSigningKey(key2));
    }

    public JwtBuilder signWith(Key key2, SignatureAlgorithm signatureAlgorithm) {
        Assert.notNull(key2, "Key argument cannot be null.");
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm cannot be null.");
        signatureAlgorithm.assertValidSigningKey(key2);
        this.algorithm = signatureAlgorithm;
        this.key = key2;
        return this;
    }

    @Deprecated
    public byte[] toJson(Object obj) {
        Assert.isInstanceOf(Map.class, obj, "object argument must be a map.");
        return this.serializer.serialize((Map) obj);
    }
}
