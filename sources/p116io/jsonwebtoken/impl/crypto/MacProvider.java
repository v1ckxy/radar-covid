package p116io.jsonwebtoken.impl.crypto;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import p116io.jsonwebtoken.SignatureAlgorithm;
import p116io.jsonwebtoken.lang.Assert;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.impl.crypto.MacProvider */
public abstract class MacProvider extends SignatureProvider {
    public MacProvider(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        Assert.isTrue(signatureAlgorithm.isHmac(), "SignatureAlgorithm must be a HMAC SHA algorithm.");
    }

    public static SecretKey generateKey() {
        return generateKey(SignatureAlgorithm.HS512);
    }

    public static SecretKey generateKey(SignatureAlgorithm signatureAlgorithm) {
        return generateKey(signatureAlgorithm, SignatureProvider.DEFAULT_SECURE_RANDOM);
    }

    @Deprecated
    public static SecretKey generateKey(SignatureAlgorithm signatureAlgorithm, SecureRandom secureRandom) {
        Assert.isTrue(signatureAlgorithm.isHmac(), "SignatureAlgorithm argument must represent an HMAC algorithm.");
        try {
            return KeyGenerator.getInstance(signatureAlgorithm.getJcaName()).generateKey();
        } catch (NoSuchAlgorithmException e) {
            StringBuilder a = C1965a.m4756a("The ");
            a.append(signatureAlgorithm.getJcaName());
            a.append(" algorithm is not available.  ");
            a.append("This should never happen on JDK 7 or later - please report this to the JJWT developers.");
            throw new IllegalStateException(a.toString(), e);
        }
    }
}
