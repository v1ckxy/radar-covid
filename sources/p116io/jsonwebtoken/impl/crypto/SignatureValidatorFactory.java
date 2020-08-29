package p116io.jsonwebtoken.impl.crypto;

import java.security.Key;
import p116io.jsonwebtoken.SignatureAlgorithm;

/* renamed from: io.jsonwebtoken.impl.crypto.SignatureValidatorFactory */
public interface SignatureValidatorFactory {
    SignatureValidator createSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key);
}
