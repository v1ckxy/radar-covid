package p116io.jsonwebtoken.impl.crypto;

import java.nio.charset.Charset;
import java.security.Key;
import p116io.jsonwebtoken.SignatureAlgorithm;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.p117io.Decoder;
import p116io.jsonwebtoken.p117io.Decoders;

/* renamed from: io.jsonwebtoken.impl.crypto.DefaultJwtSignatureValidator */
public class DefaultJwtSignatureValidator implements JwtSignatureValidator {
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public final Decoder<String, byte[]> base64UrlDecoder;
    public final SignatureValidator signatureValidator;

    @Deprecated
    public DefaultJwtSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key) {
        this(DefaultSignatureValidatorFactory.INSTANCE, signatureAlgorithm, key, Decoders.BASE64URL);
    }

    public DefaultJwtSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key, Decoder<String, byte[]> decoder) {
        this(DefaultSignatureValidatorFactory.INSTANCE, signatureAlgorithm, key, decoder);
    }

    @Deprecated
    public DefaultJwtSignatureValidator(SignatureValidatorFactory signatureValidatorFactory, SignatureAlgorithm signatureAlgorithm, Key key) {
        this(signatureValidatorFactory, signatureAlgorithm, key, Decoders.BASE64URL);
    }

    public DefaultJwtSignatureValidator(SignatureValidatorFactory signatureValidatorFactory, SignatureAlgorithm signatureAlgorithm, Key key, Decoder<String, byte[]> decoder) {
        Assert.notNull(signatureValidatorFactory, "SignerFactory argument cannot be null.");
        Assert.notNull(decoder, "Base64Url decoder argument cannot be null.");
        this.signatureValidator = signatureValidatorFactory.createSignatureValidator(signatureAlgorithm, key);
        this.base64UrlDecoder = decoder;
    }

    public boolean isValid(String str, String str2) {
        return this.signatureValidator.isValid(str.getBytes(US_ASCII), (byte[]) this.base64UrlDecoder.decode(str2));
    }
}
