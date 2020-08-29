package p116io.jsonwebtoken.impl.crypto;

import java.security.Key;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import p116io.jsonwebtoken.SignatureAlgorithm;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.security.SignatureException;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.impl.crypto.EllipticCurveSignatureValidator */
public class EllipticCurveSignatureValidator extends EllipticCurveProvider implements SignatureValidator {
    public static final String EC_PUBLIC_KEY_REQD_MSG = "Elliptic Curve signature validation requires an ECPublicKey instance.";

    public EllipticCurveSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        Assert.isTrue(key instanceof ECPublicKey, EC_PUBLIC_KEY_REQD_MSG);
    }

    public boolean doVerify(Signature signature, PublicKey publicKey, byte[] bArr, byte[] bArr2) {
        signature.initVerify(publicKey);
        signature.update(bArr);
        return signature.verify(bArr2);
    }

    public boolean isValid(byte[] bArr, byte[] bArr2) {
        Signature createSignatureInstance = createSignatureInstance();
        PublicKey publicKey = (PublicKey) this.key;
        try {
            if (EllipticCurveProvider.getSignatureByteArrayLength(this.alg) == bArr2.length || bArr2[0] != 48) {
                bArr2 = EllipticCurveProvider.transcodeSignatureToDER(bArr2);
            }
            return doVerify(createSignatureInstance, publicKey, bArr, bArr2);
        } catch (Exception e) {
            StringBuilder a = C1965a.m4756a("Unable to verify Elliptic Curve signature using configured ECPublicKey. ");
            a.append(e.getMessage());
            throw new SignatureException(a.toString(), e);
        }
    }
}
