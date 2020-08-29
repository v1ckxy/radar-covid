package p116io.jsonwebtoken.impl.crypto;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.ECKey;
import p116io.jsonwebtoken.JwtException;
import p116io.jsonwebtoken.SignatureAlgorithm;
import p116io.jsonwebtoken.security.SignatureException;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.impl.crypto.EllipticCurveSigner */
public class EllipticCurveSigner extends EllipticCurveProvider implements Signer {
    public EllipticCurveSigner(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        if (!(key instanceof PrivateKey) || !(key instanceof ECKey)) {
            StringBuilder a = C1965a.m4756a("Elliptic Curve signatures must be computed using an EC PrivateKey.  The specified key of type ");
            a.append(key.getClass().getName());
            a.append(" is not an EC PrivateKey.");
            throw new IllegalArgumentException(a.toString());
        }
    }

    public byte[] doSign(byte[] bArr) {
        PrivateKey privateKey = (PrivateKey) this.key;
        Signature createSignatureInstance = createSignatureInstance();
        createSignatureInstance.initSign(privateKey);
        createSignatureInstance.update(bArr);
        return EllipticCurveProvider.transcodeSignatureToConcat(createSignatureInstance.sign(), EllipticCurveProvider.getSignatureByteArrayLength(this.alg));
    }

    public byte[] sign(byte[] bArr) {
        try {
            return doSign(bArr);
        } catch (InvalidKeyException e) {
            StringBuilder a = C1965a.m4756a("Invalid Elliptic Curve PrivateKey. ");
            a.append(e.getMessage());
            throw new SignatureException(a.toString(), e);
        } catch (java.security.SignatureException e2) {
            StringBuilder a2 = C1965a.m4756a("Unable to calculate signature using Elliptic Curve PrivateKey. ");
            a2.append(e2.getMessage());
            throw new SignatureException(a2.toString(), e2);
        } catch (JwtException e3) {
            StringBuilder a3 = C1965a.m4756a("Unable to convert signature to JOSE format. ");
            a3.append(e3.getMessage());
            throw new SignatureException(a3.toString(), e3);
        }
    }
}
