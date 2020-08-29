package p116io.jsonwebtoken.impl;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import p116io.jsonwebtoken.ClaimJwtException;
import p116io.jsonwebtoken.Claims;
import p116io.jsonwebtoken.Clock;
import p116io.jsonwebtoken.CompressionCodecResolver;
import p116io.jsonwebtoken.Header;
import p116io.jsonwebtoken.IncorrectClaimException;
import p116io.jsonwebtoken.InvalidClaimException;
import p116io.jsonwebtoken.Jws;
import p116io.jsonwebtoken.Jwt;
import p116io.jsonwebtoken.JwtHandler;
import p116io.jsonwebtoken.JwtHandlerAdapter;
import p116io.jsonwebtoken.JwtParser;
import p116io.jsonwebtoken.MalformedJwtException;
import p116io.jsonwebtoken.MissingClaimException;
import p116io.jsonwebtoken.SignatureAlgorithm;
import p116io.jsonwebtoken.SigningKeyResolver;
import p116io.jsonwebtoken.UnsupportedJwtException;
import p116io.jsonwebtoken.impl.compression.DefaultCompressionCodecResolver;
import p116io.jsonwebtoken.impl.crypto.DefaultJwtSignatureValidator;
import p116io.jsonwebtoken.impl.crypto.JwtSignatureValidator;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.lang.Strings;
import p116io.jsonwebtoken.p117io.Decoder;
import p116io.jsonwebtoken.p117io.Decoders;
import p116io.jsonwebtoken.p117io.DeserializationException;
import p116io.jsonwebtoken.p117io.Deserializer;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.impl.DefaultJwtParser */
public class DefaultJwtParser implements JwtParser {
    public static final int MILLISECONDS_PER_SECOND = 1000;
    public long allowedClockSkewMillis = 0;
    public Decoder<String, byte[]> base64UrlDecoder = Decoders.BASE64URL;
    public Clock clock = DefaultClock.INSTANCE;
    public CompressionCodecResolver compressionCodecResolver = new DefaultCompressionCodecResolver();
    public Deserializer<Map<String, ?>> deserializer;
    public Claims expectedClaims = new DefaultClaims();
    public Key key;
    public byte[] keyBytes;
    public SigningKeyResolver signingKeyResolver;

    @Deprecated
    public DefaultJwtParser() {
    }

    public DefaultJwtParser(SigningKeyResolver signingKeyResolver2, Key key2, byte[] bArr, Clock clock2, long j, Claims claims, Decoder<String, byte[]> decoder, Deserializer<Map<String, ?>> deserializer2, CompressionCodecResolver compressionCodecResolver2) {
        this.signingKeyResolver = signingKeyResolver2;
        this.key = key2;
        this.keyBytes = bArr;
        this.clock = clock2;
        this.allowedClockSkewMillis = j;
        this.expectedClaims = claims;
        this.base64UrlDecoder = decoder;
        this.deserializer = deserializer2;
        this.compressionCodecResolver = compressionCodecResolver2;
    }

    public static Object normalize(Object obj) {
        return obj instanceof Integer ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }

    private void validateExpectedClaims(Header header, Claims claims) {
        for (String str : this.expectedClaims.keySet()) {
            Object normalize = normalize(this.expectedClaims.get(str));
            Object normalize2 = normalize(claims.get(str));
            if (normalize instanceof Date) {
                try {
                    normalize2 = claims.get(str, Date.class);
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("JWT Claim '");
                    sb.append(str);
                    sb.append("' was expected to be a Date, but its value ");
                    sb.append("cannot be converted to a Date using current heuristics.  Value: ");
                    sb.append(normalize2);
                    throw new IncorrectClaimException(header, claims, sb.toString());
                }
            }
            InvalidClaimException invalidClaimException = null;
            if (normalize2 == null) {
                invalidClaimException = new MissingClaimException(header, claims, String.format(ClaimJwtException.MISSING_EXPECTED_CLAIM_MESSAGE_TEMPLATE, new Object[]{str, normalize}));
                continue;
            } else if (!normalize.equals(normalize2)) {
                invalidClaimException = new IncorrectClaimException(header, claims, String.format(ClaimJwtException.INCORRECT_EXPECTED_CLAIM_MESSAGE_TEMPLATE, new Object[]{str, normalize, normalize2}));
                continue;
            } else {
                continue;
            }
            if (invalidClaimException != null) {
                invalidClaimException.setClaimName(str);
                invalidClaimException.setClaimValue(normalize);
                throw invalidClaimException;
            }
        }
    }

    public JwtParser base64UrlDecodeWith(Decoder<String, byte[]> decoder) {
        Assert.notNull(decoder, "base64UrlDecoder cannot be null.");
        this.base64UrlDecoder = decoder;
        return this;
    }

    public JwtSignatureValidator createSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key2) {
        return new DefaultJwtSignatureValidator(signatureAlgorithm, key2, this.base64UrlDecoder);
    }

    public JwtParser deserializeJsonWith(Deserializer<Map<String, ?>> deserializer2) {
        Assert.notNull(deserializer2, "deserializer cannot be null.");
        this.deserializer = deserializer2;
        return this;
    }

    public boolean isSigned(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (i == 2) {
                if (!Character.isWhitespace(charAt) && charAt != '.') {
                    z = true;
                }
                return z;
            }
            if (charAt == '.') {
                i++;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r7v4, types: [io.jsonwebtoken.Claims] */
    /* JADX WARNING: type inference failed for: r17v1 */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r17v2 */
    /* JADX WARNING: type inference failed for: r17v3 */
    /* JADX WARNING: type inference failed for: r17v4 */
    /* JADX WARNING: type inference failed for: r17v5 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v7, types: [io.jsonwebtoken.impl.DefaultClaims] */
    /* JADX WARNING: type inference failed for: r17v6 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r17v3
      assigns: []
      uses: []
      mth insns count: 262
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p116io.jsonwebtoken.Jwt parse(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            io.jsonwebtoken.io.Deserializer<java.util.Map<java.lang.String, ?>> r2 = r1.deserializer
            if (r2 != 0) goto L_0x0012
            java.lang.Class<io.jsonwebtoken.io.Deserializer> r2 = p116io.jsonwebtoken.p117io.Deserializer.class
            java.lang.Object r2 = p116io.jsonwebtoken.impl.lang.LegacyServices.loadFirst(r2)
            io.jsonwebtoken.io.Deserializer r2 = (p116io.jsonwebtoken.p117io.Deserializer) r2
            r1.deserializer = r2
        L_0x0012:
            java.lang.String r2 = "JWT String argument cannot be null or empty."
            p116io.jsonwebtoken.lang.Assert.hasText(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 128(0x80, float:1.794E-43)
            r2.<init>(r3)
            char[] r3 = r17.toCharArray()
            int r4 = r3.length
            r5 = 0
            r6 = 0
            r9 = r5
            r10 = r9
            r7 = r6
            r8 = r7
        L_0x0029:
            r11 = 46
            r12 = 1
            if (r7 >= r4) goto L_0x0051
            char r13 = r3[r7]
            if (r13 != r11) goto L_0x004b
            java.lang.CharSequence r11 = p116io.jsonwebtoken.lang.Strings.clean(r2)
            if (r11 == 0) goto L_0x003d
            java.lang.String r11 = r11.toString()
            goto L_0x003e
        L_0x003d:
            r11 = r5
        L_0x003e:
            if (r8 != 0) goto L_0x0042
            r10 = r11
            goto L_0x0045
        L_0x0042:
            if (r8 != r12) goto L_0x0045
            r9 = r11
        L_0x0045:
            int r8 = r8 + 1
            r2.setLength(r6)
            goto L_0x004e
        L_0x004b:
            r2.append(r13)
        L_0x004e:
            int r7 = r7 + 1
            goto L_0x0029
        L_0x0051:
            r3 = 2
            if (r8 != r3) goto L_0x02c6
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x005f
            java.lang.String r2 = r2.toString()
            goto L_0x0060
        L_0x005f:
            r2 = r5
        L_0x0060:
            if (r9 == 0) goto L_0x02b8
            if (r10 == 0) goto L_0x008b
            io.jsonwebtoken.io.Decoder<java.lang.String, byte[]> r0 = r1.base64UrlDecoder
            java.lang.Object r0 = r0.decode(r10)
            byte[] r0 = (byte[]) r0
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = p116io.jsonwebtoken.lang.Strings.UTF_8
            r3.<init>(r0, r4)
            java.util.Map r0 = r1.readValue(r3)
            if (r2 == 0) goto L_0x007f
            io.jsonwebtoken.impl.DefaultJwsHeader r3 = new io.jsonwebtoken.impl.DefaultJwsHeader
            r3.<init>(r0)
            goto L_0x0084
        L_0x007f:
            io.jsonwebtoken.impl.DefaultHeader r3 = new io.jsonwebtoken.impl.DefaultHeader
            r3.<init>(r0)
        L_0x0084:
            io.jsonwebtoken.CompressionCodecResolver r0 = r1.compressionCodecResolver
            io.jsonwebtoken.CompressionCodec r0 = r0.resolveCompressionCodec(r3)
            goto L_0x008d
        L_0x008b:
            r0 = r5
            r3 = r0
        L_0x008d:
            io.jsonwebtoken.io.Decoder<java.lang.String, byte[]> r4 = r1.base64UrlDecoder
            java.lang.Object r4 = r4.decode(r9)
            byte[] r4 = (byte[]) r4
            if (r0 == 0) goto L_0x009b
            byte[] r4 = r0.decompress(r4)
        L_0x009b:
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r7 = p116io.jsonwebtoken.lang.Strings.UTF_8
            r0.<init>(r4, r7)
            char r4 = r0.charAt(r6)
            r7 = 123(0x7b, float:1.72E-43)
            if (r4 != r7) goto L_0x00c1
            int r4 = r0.length()
            int r4 = r4 - r12
            char r4 = r0.charAt(r4)
            r7 = 125(0x7d, float:1.75E-43)
            if (r4 != r7) goto L_0x00c1
            java.util.Map r4 = r1.readValue(r0)
            io.jsonwebtoken.impl.DefaultClaims r7 = new io.jsonwebtoken.impl.DefaultClaims
            r7.<init>(r4)
            goto L_0x00c2
        L_0x00c1:
            r7 = r5
        L_0x00c2:
            if (r2 == 0) goto L_0x01d0
            r4 = r3
            io.jsonwebtoken.JwsHeader r4 = (p116io.jsonwebtoken.JwsHeader) r4
            if (r3 == 0) goto L_0x00d7
            java.lang.String r8 = r4.getAlgorithm()
            boolean r13 = p116io.jsonwebtoken.lang.Strings.hasText(r8)
            if (r13 == 0) goto L_0x00d7
            io.jsonwebtoken.SignatureAlgorithm r5 = p116io.jsonwebtoken.SignatureAlgorithm.forName(r8)
        L_0x00d7:
            if (r5 == 0) goto L_0x01c8
            io.jsonwebtoken.SignatureAlgorithm r8 = p116io.jsonwebtoken.SignatureAlgorithm.NONE
            if (r5 == r8) goto L_0x01c8
            java.security.Key r8 = r1.key
            if (r8 == 0) goto L_0x00ee
            byte[] r8 = r1.keyBytes
            if (r8 != 0) goto L_0x00e6
            goto L_0x00ee
        L_0x00e6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "A key object and key bytes cannot both be specified. Choose either."
            r0.<init>(r2)
            throw r0
        L_0x00ee:
            java.security.Key r8 = r1.key
            if (r8 != 0) goto L_0x00f6
            byte[] r8 = r1.keyBytes
            if (r8 == 0) goto L_0x0111
        L_0x00f6:
            io.jsonwebtoken.SigningKeyResolver r8 = r1.signingKeyResolver
            if (r8 == 0) goto L_0x0111
            java.security.Key r0 = r1.key
            if (r0 == 0) goto L_0x0101
            java.lang.String r0 = "a key object"
            goto L_0x0103
        L_0x0101:
            java.lang.String r0 = "key bytes"
        L_0x0103:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "A signing key resolver and "
            java.lang.String r4 = " cannot both be specified. Choose either."
            java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4752a(r3, r0, r4)
            r2.<init>(r0)
            throw r2
        L_0x0111:
            java.security.Key r8 = r1.key
            if (r8 != 0) goto L_0x0145
            byte[] r13 = r1.keyBytes
            boolean r14 = p116io.jsonwebtoken.lang.Objects.isEmpty(r13)
            if (r14 == 0) goto L_0x012d
            io.jsonwebtoken.SigningKeyResolver r14 = r1.signingKeyResolver
            if (r14 == 0) goto L_0x012d
            if (r7 == 0) goto L_0x0128
            java.security.Key r4 = r14.resolveSigningKey(r4, r7)
            goto L_0x012c
        L_0x0128:
            java.security.Key r4 = r14.resolveSigningKey(r4, r0)
        L_0x012c:
            r8 = r4
        L_0x012d:
            boolean r4 = p116io.jsonwebtoken.lang.Objects.isEmpty(r13)
            if (r4 != 0) goto L_0x0145
            boolean r4 = r5.isHmac()
            java.lang.String r8 = "Key bytes can only be specified for HMAC signatures. Please specify a PublicKey or PrivateKey instance."
            p116io.jsonwebtoken.lang.Assert.isTrue(r4, r8)
            javax.crypto.spec.SecretKeySpec r8 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r4 = r5.getJcaName()
            r8.<init>(r13, r4)
        L_0x0145:
            java.lang.String r4 = "A signing key must be specified if the specified JWT is digitally signed."
            p116io.jsonwebtoken.lang.Assert.notNull(r8, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            r4.append(r11)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r5.assertValidVerificationKey(r8)     // Catch:{ WeakKeyException -> 0x01c6, InvalidKeyException -> 0x0174, IllegalArgumentException -> 0x0172 }
            io.jsonwebtoken.impl.crypto.JwtSignatureValidator r5 = r1.createSignatureValidator(r5, r8)     // Catch:{ WeakKeyException -> 0x01c6, InvalidKeyException -> 0x0174, IllegalArgumentException -> 0x0172 }
            boolean r4 = r5.isValid(r4, r2)
            if (r4 == 0) goto L_0x016a
            goto L_0x01d0
        L_0x016a:
            io.jsonwebtoken.security.SignatureException r0 = new io.jsonwebtoken.security.SignatureException
            java.lang.String r2 = "JWT signature does not match locally computed signature. JWT validity cannot be asserted and should not be trusted."
            r0.<init>(r2)
            throw r0
        L_0x0172:
            r0 = move-exception
            goto L_0x0175
        L_0x0174:
            r0 = move-exception
        L_0x0175:
            java.lang.String r2 = r5.getValue()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The parsed JWT indicates it was signed with the "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " signature "
            r3.append(r4)
            java.lang.String r4 = "algorithm, but the specified signing key of type "
            r3.append(r4)
            java.lang.Class r4 = r8.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = " may not be used to validate "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " signatures.  Because the specified "
            r3.append(r2)
            java.lang.String r2 = "signing key reflects a specific and expected algorithm, and the JWT does not reflect "
            r3.append(r2)
            java.lang.String r2 = "this algorithm, it is likely that the JWT was not expected and therefore should not be "
            r3.append(r2)
            java.lang.String r2 = "trusted.  Another possibility is that the parser was configured with the incorrect "
            r3.append(r2)
            java.lang.String r2 = "signing key, but this cannot be assumed for security reasons."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            io.jsonwebtoken.UnsupportedJwtException r3 = new io.jsonwebtoken.UnsupportedJwtException
            r3.<init>(r2, r0)
            throw r3
        L_0x01c6:
            r0 = move-exception
            throw r0
        L_0x01c8:
            io.jsonwebtoken.MalformedJwtException r0 = new io.jsonwebtoken.MalformedJwtException
            java.lang.String r2 = "JWT string has a digest/signature, but the header does not reference a valid signature algorithm."
            r0.<init>(r2)
            throw r0
        L_0x01d0:
            long r4 = r1.allowedClockSkewMillis
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x01d9
            r6 = r12
        L_0x01d9:
            if (r7 == 0) goto L_0x02a0
            io.jsonwebtoken.Clock r4 = r1.clock
            java.util.Date r4 = r4.now()
            long r8 = r4.getTime()
            java.util.Date r5 = r7.getExpiration()
            java.lang.String r10 = " milliseconds."
            java.lang.String r11 = " milliseconds.  Allowed clock skew: "
            java.lang.String r12 = ", a difference of "
            java.lang.String r13 = ". Current time: "
            if (r5 == 0) goto L_0x0245
            long r14 = r1.allowedClockSkewMillis
            long r14 = r8 - r14
            r17 = r0
            if (r6 == 0) goto L_0x0201
            java.util.Date r0 = new java.util.Date
            r0.<init>(r14)
            goto L_0x0202
        L_0x0201:
            r0 = r4
        L_0x0202:
            boolean r0 = r0.after(r5)
            if (r0 != 0) goto L_0x0209
            goto L_0x0247
        L_0x0209:
            r0 = 0
            java.lang.String r2 = p116io.jsonwebtoken.lang.DateFormats.formatIso8601(r5, r0)
            java.lang.String r0 = p116io.jsonwebtoken.lang.DateFormats.formatIso8601(r4, r0)
            long r4 = r5.getTime()
            long r14 = r14 - r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "JWT expired at "
            r4.append(r5)
            r4.append(r2)
            r4.append(r13)
            r4.append(r0)
            r4.append(r12)
            r4.append(r14)
            r4.append(r11)
            long r5 = r1.allowedClockSkewMillis
            r4.append(r5)
            r4.append(r10)
            java.lang.String r0 = r4.toString()
            io.jsonwebtoken.ExpiredJwtException r2 = new io.jsonwebtoken.ExpiredJwtException
            r2.<init>(r3, r7, r0)
            throw r2
        L_0x0245:
            r17 = r0
        L_0x0247:
            java.util.Date r0 = r7.getNotBefore()
            if (r0 == 0) goto L_0x029c
            long r14 = r1.allowedClockSkewMillis
            long r8 = r8 + r14
            if (r6 == 0) goto L_0x0258
            java.util.Date r5 = new java.util.Date
            r5.<init>(r8)
            goto L_0x0259
        L_0x0258:
            r5 = r4
        L_0x0259:
            boolean r5 = r5.before(r0)
            if (r5 != 0) goto L_0x0260
            goto L_0x029c
        L_0x0260:
            r2 = 0
            java.lang.String r5 = p116io.jsonwebtoken.lang.DateFormats.formatIso8601(r0, r2)
            java.lang.String r2 = p116io.jsonwebtoken.lang.DateFormats.formatIso8601(r4, r2)
            long r14 = r0.getTime()
            long r14 = r14 - r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "JWT must not be accepted before "
            r0.append(r4)
            r0.append(r5)
            r0.append(r13)
            r0.append(r2)
            r0.append(r12)
            r0.append(r14)
            r0.append(r11)
            long r4 = r1.allowedClockSkewMillis
            r0.append(r4)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            io.jsonwebtoken.PrematureJwtException r2 = new io.jsonwebtoken.PrematureJwtException
            r2.<init>(r3, r7, r0)
            throw r2
        L_0x029c:
            r1.validateExpectedClaims(r3, r7)
            goto L_0x02a2
        L_0x02a0:
            r17 = r0
        L_0x02a2:
            if (r7 == 0) goto L_0x02a6
            r0 = r7
            goto L_0x02a8
        L_0x02a6:
            r0 = r17
        L_0x02a8:
            if (r2 == 0) goto L_0x02b2
            io.jsonwebtoken.impl.DefaultJws r4 = new io.jsonwebtoken.impl.DefaultJws
            io.jsonwebtoken.JwsHeader r3 = (p116io.jsonwebtoken.JwsHeader) r3
            r4.<init>(r3, r0, r2)
            return r4
        L_0x02b2:
            io.jsonwebtoken.impl.DefaultJwt r2 = new io.jsonwebtoken.impl.DefaultJwt
            r2.<init>(r3, r0)
            return r2
        L_0x02b8:
            io.jsonwebtoken.MalformedJwtException r2 = new io.jsonwebtoken.MalformedJwtException
            java.lang.String r3 = "JWT string '"
            java.lang.String r4 = "' is missing a body/payload."
            java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4752a(r3, r0, r4)
            r2.<init>(r0)
            throw r2
        L_0x02c6:
            java.lang.String r0 = "JWT strings must contain exactly 2 period characters. Found: "
            java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4761b(r0, r8)
            io.jsonwebtoken.MalformedJwtException r2 = new io.jsonwebtoken.MalformedJwtException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.impl.DefaultJwtParser.parse(java.lang.String):io.jsonwebtoken.Jwt");
    }

    public <T> T parse(String str, JwtHandler<T> jwtHandler) {
        Assert.notNull(jwtHandler, "JwtHandler argument cannot be null.");
        Assert.hasText(str, "JWT String argument cannot be null or empty.");
        Jwt parse = parse(str);
        if (!(parse instanceof Jws)) {
            return parse.getBody() instanceof Claims ? jwtHandler.onClaimsJwt(parse) : jwtHandler.onPlaintextJwt(parse);
        }
        Jws jws = (Jws) parse;
        return jws.getBody() instanceof Claims ? jwtHandler.onClaimsJws(jws) : jwtHandler.onPlaintextJws(jws);
    }

    public Jws<Claims> parseClaimsJws(String str) {
        return (Jws) parse(str, new JwtHandlerAdapter<Jws<Claims>>() {
            public Jws<Claims> onClaimsJws(Jws<Claims> jws) {
                return jws;
            }
        });
    }

    public Jwt<Header, Claims> parseClaimsJwt(String str) {
        try {
            return (Jwt) parse(str, new JwtHandlerAdapter<Jwt<Header, Claims>>() {
                public Jwt<Header, Claims> onClaimsJwt(Jwt<Header, Claims> jwt) {
                    return jwt;
                }
            });
        } catch (IllegalArgumentException e) {
            throw new UnsupportedJwtException("Signed JWSs are not supported.", e);
        }
    }

    public Jws<String> parsePlaintextJws(String str) {
        try {
            return (Jws) parse(str, new JwtHandlerAdapter<Jws<String>>() {
                public Jws<String> onPlaintextJws(Jws<String> jws) {
                    return jws;
                }
            });
        } catch (IllegalArgumentException e) {
            throw new UnsupportedJwtException("Signed JWSs are not supported.", e);
        }
    }

    public Jwt<Header, String> parsePlaintextJwt(String str) {
        return (Jwt) parse(str, new JwtHandlerAdapter<Jwt<Header, String>>() {
            public Jwt<Header, String> onPlaintextJwt(Jwt<Header, String> jwt) {
                return jwt;
            }
        });
    }

    public Map<String, ?> readValue(String str) {
        try {
            return (Map) this.deserializer.deserialize(str.getBytes(Strings.UTF_8));
        } catch (DeserializationException e) {
            throw new MalformedJwtException(C1965a.m4751a("Unable to read JSON value: ", str), e);
        }
    }

    public JwtParser require(String str, Object obj) {
        Assert.hasText(str, "claim name cannot be null or empty.");
        StringBuilder sb = new StringBuilder();
        sb.append("The value cannot be null for claim name: ");
        sb.append(str);
        Assert.notNull(obj, sb.toString());
        this.expectedClaims.put(str, obj);
        return this;
    }

    public JwtParser requireAudience(String str) {
        this.expectedClaims.setAudience(str);
        return this;
    }

    public JwtParser requireExpiration(Date date) {
        this.expectedClaims.setExpiration(date);
        return this;
    }

    public JwtParser requireId(String str) {
        this.expectedClaims.setId(str);
        return this;
    }

    public JwtParser requireIssuedAt(Date date) {
        this.expectedClaims.setIssuedAt(date);
        return this;
    }

    public JwtParser requireIssuer(String str) {
        this.expectedClaims.setIssuer(str);
        return this;
    }

    public JwtParser requireNotBefore(Date date) {
        this.expectedClaims.setNotBefore(date);
        return this;
    }

    public JwtParser requireSubject(String str) {
        this.expectedClaims.setSubject(str);
        return this;
    }

    public JwtParser setAllowedClockSkewSeconds(long j) {
        this.allowedClockSkewMillis = Math.max(0, j * 1000);
        return this;
    }

    public JwtParser setClock(Clock clock2) {
        Assert.notNull(clock2, "Clock instance cannot be null.");
        this.clock = clock2;
        return this;
    }

    public JwtParser setCompressionCodecResolver(CompressionCodecResolver compressionCodecResolver2) {
        Assert.notNull(compressionCodecResolver2, "compressionCodecResolver cannot be null.");
        this.compressionCodecResolver = compressionCodecResolver2;
        return this;
    }

    public JwtParser setSigningKey(String str) {
        Assert.hasText(str, "signing key cannot be null or empty.");
        this.keyBytes = (byte[]) Decoders.BASE64.decode(str);
        return this;
    }

    public JwtParser setSigningKey(Key key2) {
        Assert.notNull(key2, "signing key cannot be null.");
        this.key = key2;
        return this;
    }

    public JwtParser setSigningKey(byte[] bArr) {
        Assert.notEmpty(bArr, "signing key cannot be null or empty.");
        this.keyBytes = bArr;
        return this;
    }

    public JwtParser setSigningKeyResolver(SigningKeyResolver signingKeyResolver2) {
        Assert.notNull(signingKeyResolver2, "SigningKeyResolver cannot be null.");
        this.signingKeyResolver = signingKeyResolver2;
        return this;
    }
}
