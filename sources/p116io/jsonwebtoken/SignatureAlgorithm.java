package p116io.jsonwebtoken;

import java.security.Key;
import java.security.PrivateKey;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.SecretKey;
import p116io.jsonwebtoken.lang.Strings;
import p116io.jsonwebtoken.security.InvalidKeyException;
import p116io.jsonwebtoken.security.Keys;
import p116io.jsonwebtoken.security.SignatureException;
import p116io.jsonwebtoken.security.WeakKeyException;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.SignatureAlgorithm */
public enum SignatureAlgorithm {
    NONE("none", "No digital signature or MAC performed", "None", null, false, 0, 0),
    HS256("HS256", "HMAC using SHA-256", "HMAC", "HmacSHA256", true, 256, 256),
    HS384("HS384", "HMAC using SHA-384", "HMAC", "HmacSHA384", true, 384, 384),
    HS512("HS512", "HMAC using SHA-512", "HMAC", "HmacSHA512", true, 512, 512),
    RS256("RS256", "RSASSA-PKCS-v1_5 using SHA-256", "RSA", "SHA256withRSA", true, 256, 2048),
    RS384("RS384", "RSASSA-PKCS-v1_5 using SHA-384", "RSA", "SHA384withRSA", true, 384, 2048),
    RS512("RS512", "RSASSA-PKCS-v1_5 using SHA-512", "RSA", "SHA512withRSA", true, 512, 2048),
    ES256("ES256", "ECDSA using P-256 and SHA-256", "ECDSA", "SHA256withECDSA", true, 256, 256),
    ES384("ES384", "ECDSA using P-384 and SHA-384", "ECDSA", "SHA384withECDSA", true, 384, 384),
    ES512("ES512", "ECDSA using P-521 and SHA-512", "ECDSA", "SHA512withECDSA", true, 512, 521),
    PS256("PS256", "RSASSA-PSS using SHA-256 and MGF1 with SHA-256", "RSA", "RSASSA-PSS", false, 256, 2048),
    PS384("PS384", "RSASSA-PSS using SHA-384 and MGF1 with SHA-384", "RSA", "RSASSA-PSS", false, 384, 2048),
    PS512("PS512", "RSASSA-PSS using SHA-512 and MGF1 with SHA-512", "RSA", "RSASSA-PSS", false, 512, 2048);
    
    public static final List<SignatureAlgorithm> PREFERRED_EC_ALGS = null;
    public static final List<SignatureAlgorithm> PREFERRED_HMAC_ALGS = null;
    public final String description;
    public final int digestLength;
    public final String familyName;
    public final String jcaName;
    public final boolean jdkStandard;
    public final int minKeyLength;
    public final String value;

    /* access modifiers changed from: public */
    static {
        SignatureAlgorithm signatureAlgorithm;
        SignatureAlgorithm signatureAlgorithm2;
        SignatureAlgorithm signatureAlgorithm3;
        PREFERRED_HMAC_ALGS = Collections.unmodifiableList(Arrays.asList(new SignatureAlgorithm[]{signatureAlgorithm3, signatureAlgorithm2, signatureAlgorithm}));
        PREFERRED_EC_ALGS = Collections.unmodifiableList(Arrays.asList(new SignatureAlgorithm[]{ES512, ES384, ES256}));
    }

    /* access modifiers changed from: public */
    SignatureAlgorithm(String str, String str2, String str3, String str4, boolean z, int i, int i2) {
        this.value = str;
        this.description = str2;
        this.familyName = str3;
        this.jcaName = str4;
        this.jdkStandard = z;
        this.digestLength = i;
        this.minKeyLength = i2;
    }

    private void assertValid(Key key, boolean z) {
        Class<Keys> cls = Keys.class;
        if (this != NONE) {
            String str = " key's size is ";
            String str2 = " algorithm.  The JWT ";
            String str3 = ".  See ";
            String str4 = " class's ";
            String str5 = " ";
            String str6 = "The ";
            if (isHmac()) {
                if (key instanceof SecretKey) {
                    SecretKey secretKey = (SecretKey) key;
                    byte[] encoded = secretKey.getEncoded();
                    if (encoded != null) {
                        String algorithm = secretKey.getAlgorithm();
                        if (algorithm == null) {
                            StringBuilder a = C1965a.m4756a(str6);
                            a.append(keyType(z));
                            a.append(" key's algorithm cannot be null.");
                            throw new InvalidKeyException(a.toString());
                        } else if (HS256.jcaName.equalsIgnoreCase(algorithm) || HS384.jcaName.equalsIgnoreCase(algorithm) || HS512.jcaName.equalsIgnoreCase(algorithm)) {
                            int length = encoded.length * 8;
                            if (length < this.minKeyLength) {
                                StringBuilder a2 = C1965a.m4756a(str6);
                                a2.append(keyType(z));
                                a2.append(str);
                                a2.append(length);
                                a2.append(" bits which ");
                                a2.append("is not secure enough for the ");
                                a2.append(name());
                                a2.append(str2);
                                a2.append("JWA Specification (RFC 7518, Section 3.2) states that keys used with ");
                                a2.append(name());
                                a2.append(" MUST have a ");
                                a2.append("size >= ");
                                a2.append(this.minKeyLength);
                                a2.append(" bits (the key size must be greater than or equal to the hash ");
                                a2.append("output size).  Consider using the ");
                                a2.append(cls.getName());
                                a2.append(str4);
                                a2.append("'secretKeyFor(SignatureAlgorithm.");
                                a2.append(name());
                                a2.append(")' method to create a key guaranteed to be ");
                                a2.append("secure enough for ");
                                a2.append(name());
                                a2.append(str3);
                                a2.append("https://tools.ietf.org/html/rfc7518#section-3.2 for more information.");
                                throw new WeakKeyException(a2.toString());
                            }
                        } else {
                            StringBuilder a3 = C1965a.m4756a(str6);
                            a3.append(keyType(z));
                            a3.append(" key's algorithm '");
                            a3.append(algorithm);
                            a3.append("' does not equal a valid HmacSHA* algorithm name and cannot be used with ");
                            a3.append(name());
                            a3.append(Strings.CURRENT_PATH);
                            throw new InvalidKeyException(a3.toString());
                        }
                    } else {
                        StringBuilder a4 = C1965a.m4756a(str6);
                        a4.append(keyType(z));
                        a4.append(" key's encoded bytes cannot be null.");
                        throw new InvalidKeyException(a4.toString());
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.familyName);
                    sb.append(str5);
                    sb.append(keyType(z));
                    sb.append(" keys must be SecretKey instances.");
                    throw new InvalidKeyException(sb.toString());
                }
            } else if (!z || (key instanceof PrivateKey)) {
                String str7 = "to be secure enough for ";
                String str8 = ")' method to create a key pair guaranteed ";
                String str9 = "'keyPairFor(SignatureAlgorithm.";
                String str10 = " bits.  Consider using the ";
                String str11 = " MUST have a size >= ";
                if (isEllipticCurve()) {
                    if (key instanceof ECKey) {
                        int bitLength = ((ECKey) key).getParams().getOrder().bitLength();
                        if (bitLength < this.minKeyLength) {
                            StringBuilder a5 = C1965a.m4756a(str6);
                            a5.append(keyType(z));
                            a5.append(" key's size (ECParameterSpec order) is ");
                            a5.append(bitLength);
                            a5.append(" bits which is not secure enough for the ");
                            a5.append(name());
                            a5.append(str2);
                            a5.append("JWA Specification (RFC 7518, Section 3.4) states that keys used with ");
                            a5.append(name());
                            a5.append(str11);
                            a5.append(this.minKeyLength);
                            a5.append(str10);
                            a5.append(cls.getName());
                            a5.append(str4);
                            a5.append(str9);
                            a5.append(name());
                            a5.append(str8);
                            a5.append(str7);
                            a5.append(name());
                            throw new WeakKeyException(C1965a.m4754a(a5, str3, "https://tools.ietf.org/html/rfc7518#section-3.4 for more information."));
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.familyName);
                    sb2.append(str5);
                    sb2.append(keyType(z));
                    sb2.append(" keys must be ECKey instances.");
                    throw new InvalidKeyException(sb2.toString());
                } else if (key instanceof RSAKey) {
                    int bitLength2 = ((RSAKey) key).getModulus().bitLength();
                    if (bitLength2 < this.minKeyLength) {
                        String str12 = name().startsWith("P") ? "3.5" : "3.3";
                        StringBuilder a6 = C1965a.m4756a(str6);
                        a6.append(keyType(z));
                        a6.append(str);
                        a6.append(bitLength2);
                        a6.append(" bits which is not secure ");
                        a6.append("enough for the ");
                        a6.append(name());
                        a6.append(" algorithm.  The JWT JWA Specification (RFC 7518, Section ");
                        a6.append(str12);
                        a6.append(") states that keys used with ");
                        a6.append(name());
                        a6.append(str11);
                        a6.append(this.minKeyLength);
                        a6.append(str10);
                        a6.append(cls.getName());
                        a6.append(str4);
                        a6.append(str9);
                        a6.append(name());
                        a6.append(str8);
                        a6.append(str7);
                        a6.append(name());
                        a6.append(str3);
                        a6.append("https://tools.ietf.org/html/rfc7518#section-");
                        a6.append(str12);
                        a6.append(" for more information.");
                        throw new WeakKeyException(a6.toString());
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.familyName);
                    sb3.append(str5);
                    sb3.append(keyType(z));
                    sb3.append(" keys must be RSAKey instances.");
                    throw new InvalidKeyException(sb3.toString());
                }
            } else {
                throw new InvalidKeyException(C1965a.m4754a(new StringBuilder(), this.familyName, " signing keys must be PrivateKey instances."));
            }
        } else {
            throw new InvalidKeyException("The 'NONE' signature algorithm does not support cryptographic keys.");
        }
    }

    public static SignatureAlgorithm forName(String str) {
        SignatureAlgorithm[] values;
        for (SignatureAlgorithm signatureAlgorithm : values()) {
            if (signatureAlgorithm.getValue().equalsIgnoreCase(str)) {
                return signatureAlgorithm;
            }
        }
        throw new SignatureException(C1965a.m4752a("Unsupported signature algorithm '", str, "'"));
    }

    public static SignatureAlgorithm forSigningKey(Key key) {
        if (key != null) {
            boolean z = key instanceof SecretKey;
            if (z || ((key instanceof PrivateKey) && ((key instanceof ECKey) || (key instanceof RSAKey)))) {
                String str = "information.";
                if (z) {
                    int length = p116io.jsonwebtoken.lang.Arrays.length(((SecretKey) key).getEncoded()) * 8;
                    for (SignatureAlgorithm signatureAlgorithm : PREFERRED_HMAC_ALGS) {
                        if (length >= signatureAlgorithm.minKeyLength) {
                            return signatureAlgorithm;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("The specified SecretKey is not strong enough to be used with JWT HMAC signature algorithms.  The JWT specification requires HMAC keys to be >= 256 bits long.  The specified key is ");
                    sb.append(length);
                    sb.append(" bits.  See https://tools.ietf.org/html/rfc7518#section-3.2 for more ");
                    sb.append(str);
                    throw new WeakKeyException(sb.toString());
                } else if (key instanceof RSAKey) {
                    int bitLength = ((RSAKey) key).getModulus().bitLength();
                    if (bitLength >= 4096) {
                        RS512.assertValidSigningKey(key);
                        return RS512;
                    } else if (bitLength >= 3072) {
                        RS384.assertValidSigningKey(key);
                        return RS384;
                    } else {
                        SignatureAlgorithm signatureAlgorithm2 = RS256;
                        if (bitLength >= signatureAlgorithm2.minKeyLength) {
                            signatureAlgorithm2.assertValidSigningKey(key);
                            return RS256;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("The specified RSA signing key is not strong enough to be used with JWT RSA signature algorithms.  The JWT specification requires RSA keys to be >= 2048 bits long.  The specified RSA key is ");
                        sb2.append(bitLength);
                        sb2.append(" bits.  See https://tools.ietf.org/html/rfc7518#section-3.3 for more ");
                        sb2.append(str);
                        throw new WeakKeyException(sb2.toString());
                    }
                } else {
                    int bitLength2 = ((ECKey) key).getParams().getOrder().bitLength();
                    for (SignatureAlgorithm signatureAlgorithm3 : PREFERRED_EC_ALGS) {
                        if (bitLength2 >= signatureAlgorithm3.minKeyLength) {
                            signatureAlgorithm3.assertValidSigningKey(key);
                            return signatureAlgorithm3;
                        }
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("The specified Elliptic Curve signing key is not strong enough to be used with JWT ECDSA signature algorithms.  The JWT specification requires ECDSA keys to be >= 256 bits long.  The specified ECDSA key is ");
                    sb3.append(bitLength2);
                    sb3.append(" bits.  See ");
                    sb3.append("https://tools.ietf.org/html/rfc7518#section-3.4 for more information.");
                    throw new WeakKeyException(sb3.toString());
                }
            } else {
                StringBuilder a = C1965a.m4756a("JWT standard signing algorithms require either 1) a SecretKey for HMAC-SHA algorithms or 2) a private RSAKey for RSA algorithms or 3) a private ECKey for Elliptic Curve algorithms.  The specified key is of type ");
                a.append(key.getClass().getName());
                throw new InvalidKeyException(a.toString());
            }
        } else {
            throw new InvalidKeyException("Key argument cannot be null.");
        }
    }

    public static String keyType(boolean z) {
        return z ? "signing" : "verification";
    }

    public void assertValidSigningKey(Key key) {
        assertValid(key, true);
    }

    public void assertValidVerificationKey(Key key) {
        assertValid(key, false);
    }

    public String getDescription() {
        return this.description;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String getJcaName() {
        return this.jcaName;
    }

    public int getMinKeyLength() {
        return this.minKeyLength;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isEllipticCurve() {
        return this.familyName.equals("ECDSA");
    }

    public boolean isHmac() {
        return this.familyName.equals("HMAC");
    }

    public boolean isJdkStandard() {
        return this.jdkStandard;
    }

    public boolean isRsa() {
        return this.familyName.equals("RSA");
    }
}
