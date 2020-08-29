package p116io.jsonwebtoken.impl.crypto;

import java.security.Key;
import java.security.MessageDigest;
import p116io.jsonwebtoken.SignatureAlgorithm;

/* renamed from: io.jsonwebtoken.impl.crypto.MacValidator */
public class MacValidator implements SignatureValidator {
    public final MacSigner signer;

    public MacValidator(SignatureAlgorithm signatureAlgorithm, Key key) {
        this.signer = new MacSigner(signatureAlgorithm, key);
    }

    public boolean isValid(byte[] bArr, byte[] bArr2) {
        return MessageDigest.isEqual(this.signer.sign(bArr), bArr2);
    }
}
