package p116io.jsonwebtoken.impl.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;
import p116io.jsonwebtoken.SignatureAlgorithm;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.lang.RuntimeEnvironment;
import p116io.jsonwebtoken.security.SignatureException;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.impl.crypto.RsaProvider */
public abstract class RsaProvider extends SignatureProvider {
    public static final Map<SignatureAlgorithm, PSSParameterSpec> PSS_PARAMETER_SPECS = createPssParameterSpecs();

    /* renamed from: io.jsonwebtoken.impl.crypto.RsaProvider$1 */
    public static /* synthetic */ class C08731 {
        public static final /* synthetic */ int[] $SwitchMap$io$jsonwebtoken$SignatureAlgorithm;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0020 */
        static {
            /*
                io.jsonwebtoken.SignatureAlgorithm[] r0 = p116io.jsonwebtoken.SignatureAlgorithm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm = r0
                r1 = 4
                io.jsonwebtoken.SignatureAlgorithm r2 = p116io.jsonwebtoken.SignatureAlgorithm.RS256     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0018 }
                io.jsonwebtoken.SignatureAlgorithm r2 = p116io.jsonwebtoken.SignatureAlgorithm.PS256     // Catch:{ NoSuchFieldError -> 0x0018 }
                r2 = 10
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0020 }
                io.jsonwebtoken.SignatureAlgorithm r2 = p116io.jsonwebtoken.SignatureAlgorithm.RS384     // Catch:{ NoSuchFieldError -> 0x0020 }
                r2 = 5
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0020 }
            L_0x0020:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.jsonwebtoken.SignatureAlgorithm r2 = p116io.jsonwebtoken.SignatureAlgorithm.PS384     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 11
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.impl.crypto.RsaProvider.C08731.<clinit>():void");
        }
    }

    static {
        RuntimeEnvironment.enableBouncyCastleIfPossible();
    }

    public RsaProvider(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        Assert.isTrue(signatureAlgorithm.isRsa(), "SignatureAlgorithm must be an RSASSA or RSASSA-PSS algorithm.");
    }

    public static Map<SignatureAlgorithm, PSSParameterSpec> createPssParameterSpecs() {
        HashMap hashMap = new HashMap();
        MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        PSSParameterSpec pSSParameterSpec = new PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 32, 1);
        hashMap.put(SignatureAlgorithm.PS256, pSSParameterSpec);
        MGF1ParameterSpec mGF1ParameterSpec2 = MGF1ParameterSpec.SHA384;
        PSSParameterSpec pSSParameterSpec2 = new PSSParameterSpec(mGF1ParameterSpec2.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec2, 48, 1);
        hashMap.put(SignatureAlgorithm.PS384, pSSParameterSpec2);
        MGF1ParameterSpec mGF1ParameterSpec3 = MGF1ParameterSpec.SHA512;
        PSSParameterSpec pSSParameterSpec3 = new PSSParameterSpec(mGF1ParameterSpec3.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec3, 64, 1);
        hashMap.put(SignatureAlgorithm.PS512, pSSParameterSpec3);
        return hashMap;
    }

    public static KeyPair generateKeyPair() {
        return generateKeyPair(4096);
    }

    public static KeyPair generateKeyPair(int i) {
        return generateKeyPair(i, SignatureProvider.DEFAULT_SECURE_RANDOM);
    }

    public static KeyPair generateKeyPair(int i, SecureRandom secureRandom) {
        return generateKeyPair("RSA", i, secureRandom);
    }

    public static KeyPair generateKeyPair(SignatureAlgorithm signatureAlgorithm) {
        int i;
        Assert.isTrue(signatureAlgorithm.isRsa(), "Only RSA algorithms are supported by this method.");
        int ordinal = signatureAlgorithm.ordinal();
        if (ordinal != 4) {
            if (ordinal != 5) {
                if (ordinal != 10) {
                    if (ordinal != 11) {
                        i = 4096;
                        return generateKeyPair(i, SignatureProvider.DEFAULT_SECURE_RANDOM);
                    }
                }
            }
            i = 3072;
            return generateKeyPair(i, SignatureProvider.DEFAULT_SECURE_RANDOM);
        }
        i = 2048;
        return generateKeyPair(i, SignatureProvider.DEFAULT_SECURE_RANDOM);
    }

    public static KeyPair generateKeyPair(String str, int i, SecureRandom secureRandom) {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance(str);
            instance.initialize(i, secureRandom);
            return instance.genKeyPair();
        } catch (NoSuchAlgorithmException e) {
            StringBuilder a = C1965a.m4756a("Unable to obtain an RSA KeyPairGenerator: ");
            a.append(e.getMessage());
            throw new IllegalStateException(a.toString(), e);
        }
    }

    public Signature createSignatureInstance() {
        Signature createSignatureInstance = super.createSignatureInstance();
        PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) PSS_PARAMETER_SPECS.get(this.alg);
        if (pSSParameterSpec != null) {
            setParameter(createSignatureInstance, pSSParameterSpec);
        }
        return createSignatureInstance;
    }

    public void doSetParameter(Signature signature, PSSParameterSpec pSSParameterSpec) {
        signature.setParameter(pSSParameterSpec);
    }

    public void setParameter(Signature signature, PSSParameterSpec pSSParameterSpec) {
        try {
            doSetParameter(signature, pSSParameterSpec);
        } catch (InvalidAlgorithmParameterException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported RSASSA-PSS parameter '");
            sb.append(pSSParameterSpec);
            sb.append("': ");
            sb.append(e.getMessage());
            throw new SignatureException(sb.toString(), e);
        }
    }
}
