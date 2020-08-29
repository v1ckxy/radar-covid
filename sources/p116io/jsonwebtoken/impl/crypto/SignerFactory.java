package p116io.jsonwebtoken.impl.crypto;

import java.security.Key;
import p116io.jsonwebtoken.SignatureAlgorithm;

/* renamed from: io.jsonwebtoken.impl.crypto.SignerFactory */
public interface SignerFactory {
    Signer createSigner(SignatureAlgorithm signatureAlgorithm, Key key);
}
