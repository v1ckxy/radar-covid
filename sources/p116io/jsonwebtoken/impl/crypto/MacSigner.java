package p116io.jsonwebtoken.impl.crypto;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import p116io.jsonwebtoken.SignatureAlgorithm;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.security.SignatureException;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.impl.crypto.MacSigner */
public class MacSigner extends MacProvider implements Signer {
    public MacSigner(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        Assert.isTrue(signatureAlgorithm.isHmac(), "The MacSigner only supports HMAC signature algorithms.");
        if (!(key instanceof SecretKey)) {
            StringBuilder a = C1965a.m4756a("MAC signatures must be computed and verified using a SecretKey.  The specified key of type ");
            a.append(key.getClass().getName());
            a.append(" is not a SecretKey.");
            throw new IllegalArgumentException(a.toString());
        }
    }

    public MacSigner(SignatureAlgorithm signatureAlgorithm, byte[] bArr) {
        this(signatureAlgorithm, (Key) new SecretKeySpec(bArr, signatureAlgorithm.getJcaName()));
    }

    public Mac doGetMacInstance() {
        Mac instance = Mac.getInstance(this.alg.getJcaName());
        instance.init(this.key);
        return instance;
    }

    public Mac getMacInstance() {
        try {
            return doGetMacInstance();
        } catch (NoSuchAlgorithmException e) {
            StringBuilder a = C1965a.m4756a("Unable to obtain JCA MAC algorithm '");
            a.append(this.alg.getJcaName());
            a.append("': ");
            a.append(e.getMessage());
            throw new SignatureException(a.toString(), e);
        } catch (InvalidKeyException e2) {
            StringBuilder a2 = C1965a.m4756a("The specified signing key is not a valid ");
            a2.append(this.alg.name());
            a2.append(" key: ");
            a2.append(e2.getMessage());
            throw new SignatureException(a2.toString(), e2);
        }
    }

    public byte[] sign(byte[] bArr) {
        return getMacInstance().doFinal(bArr);
    }
}
