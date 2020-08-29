package p116io.jsonwebtoken.impl.crypto;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;
import p116io.jsonwebtoken.SignatureAlgorithm;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.lang.RuntimeEnvironment;
import p116io.jsonwebtoken.security.SignatureException;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.impl.crypto.SignatureProvider */
public abstract class SignatureProvider {
    public static final SecureRandom DEFAULT_SECURE_RANDOM;
    public final SignatureAlgorithm alg;
    public final Key key;

    static {
        SecureRandom secureRandom = new SecureRandom();
        DEFAULT_SECURE_RANDOM = secureRandom;
        secureRandom.nextBytes(new byte[64]);
    }

    public SignatureProvider(SignatureAlgorithm signatureAlgorithm, Key key2) {
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm cannot be null.");
        Assert.notNull(key2, "Key cannot be null.");
        this.alg = signatureAlgorithm;
        this.key = key2;
    }

    public Signature createSignatureInstance() {
        try {
            return getSignatureInstance();
        } catch (NoSuchAlgorithmException e) {
            StringBuilder a = C1965a.m4756a("Unavailable ");
            a.append(this.alg.getFamilyName());
            a.append(" Signature algorithm '");
            a.append(this.alg.getJcaName());
            a.append("'.");
            String sb = a.toString();
            if (!this.alg.isJdkStandard() && !isBouncyCastleAvailable()) {
                sb = C1965a.m4751a(sb, " This is not a standard JDK algorithm. Try including BouncyCastle in the runtime classpath.");
            }
            throw new SignatureException(sb, e);
        }
    }

    public Signature getSignatureInstance() {
        return Signature.getInstance(this.alg.getJcaName());
    }

    public boolean isBouncyCastleAvailable() {
        return RuntimeEnvironment.BOUNCY_CASTLE_AVAILABLE;
    }
}
