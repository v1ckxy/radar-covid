package p116io.jsonwebtoken.impl.crypto;

import java.security.Key;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import p116io.jsonwebtoken.SignatureAlgorithm;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.security.SignatureException;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.impl.crypto.RsaSignatureValidator */
public class RsaSignatureValidator extends RsaProvider implements SignatureValidator {
    public final RsaSigner SIGNER;

    public RsaSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        boolean z = key instanceof RSAPrivateKey;
        Assert.isTrue(z || (key instanceof RSAPublicKey), "RSA Signature validation requires either a RSAPublicKey or RSAPrivateKey instance.");
        this.SIGNER = z ? new RsaSigner(signatureAlgorithm, key) : null;
    }

    public boolean doVerify(Signature signature, PublicKey publicKey, byte[] bArr, byte[] bArr2) {
        signature.initVerify(publicKey);
        signature.update(bArr);
        return signature.verify(bArr2);
    }

    public boolean isValid(byte[] bArr, byte[] bArr2) {
        if (this.key instanceof PublicKey) {
            try {
                return doVerify(createSignatureInstance(), (PublicKey) this.key, bArr, bArr2);
            } catch (Exception e) {
                StringBuilder a = C1965a.m4756a("Unable to verify RSA signature using configured PublicKey. ");
                a.append(e.getMessage());
                throw new SignatureException(a.toString(), e);
            }
        } else {
            Assert.notNull(this.SIGNER, "RSA Signer instance cannot be null.  This is a bug.  Please report it.");
            return MessageDigest.isEqual(this.SIGNER.sign(bArr), bArr2);
        }
    }
}
