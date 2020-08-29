package p116io.jsonwebtoken.impl.crypto;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAKey;
import p116io.jsonwebtoken.SignatureAlgorithm;
import p116io.jsonwebtoken.security.SignatureException;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.impl.crypto.RsaSigner */
public class RsaSigner extends RsaProvider implements Signer {
    public RsaSigner(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        if (!(key instanceof PrivateKey) || !(key instanceof RSAKey)) {
            StringBuilder a = C1965a.m4756a("RSA signatures must be computed using an RSA PrivateKey.  The specified key of type ");
            a.append(key.getClass().getName());
            a.append(" is not an RSA PrivateKey.");
            throw new IllegalArgumentException(a.toString());
        }
    }

    public byte[] doSign(byte[] bArr) {
        PrivateKey privateKey = (PrivateKey) this.key;
        Signature createSignatureInstance = createSignatureInstance();
        createSignatureInstance.initSign(privateKey);
        createSignatureInstance.update(bArr);
        return createSignatureInstance.sign();
    }

    public byte[] sign(byte[] bArr) {
        try {
            return doSign(bArr);
        } catch (InvalidKeyException e) {
            StringBuilder a = C1965a.m4756a("Invalid RSA PrivateKey. ");
            a.append(e.getMessage());
            throw new SignatureException(a.toString(), e);
        } catch (java.security.SignatureException e2) {
            StringBuilder a2 = C1965a.m4756a("Unable to calculate signature using RSA PrivateKey. ");
            a2.append(e2.getMessage());
            throw new SignatureException(a2.toString(), e2);
        }
    }
}
