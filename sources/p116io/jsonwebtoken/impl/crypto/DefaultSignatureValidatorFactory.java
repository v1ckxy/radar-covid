package p116io.jsonwebtoken.impl.crypto;

import java.security.Key;
import p116io.jsonwebtoken.SignatureAlgorithm;
import p116io.jsonwebtoken.lang.Assert;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.impl.crypto.DefaultSignatureValidatorFactory */
public class DefaultSignatureValidatorFactory implements SignatureValidatorFactory {
    public static final SignatureValidatorFactory INSTANCE = new DefaultSignatureValidatorFactory();

    /* renamed from: io.jsonwebtoken.impl.crypto.DefaultSignatureValidatorFactory$1 */
    public static /* synthetic */ class C08701 {
        public static final /* synthetic */ int[] $SwitchMap$io$jsonwebtoken$SignatureAlgorithm;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|(2:15|16)|17|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15|16|17|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0023 */
        static {
            /*
                io.jsonwebtoken.SignatureAlgorithm[] r0 = p116io.jsonwebtoken.SignatureAlgorithm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm = r0
                io.jsonwebtoken.SignatureAlgorithm r1 = p116io.jsonwebtoken.SignatureAlgorithm.HS256     // Catch:{ NoSuchFieldError -> 0x000e }
                r1 = 1
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0015 }
                io.jsonwebtoken.SignatureAlgorithm r1 = p116io.jsonwebtoken.SignatureAlgorithm.HS384     // Catch:{ NoSuchFieldError -> 0x0015 }
                r1 = 2
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x001c }
                io.jsonwebtoken.SignatureAlgorithm r1 = p116io.jsonwebtoken.SignatureAlgorithm.HS512     // Catch:{ NoSuchFieldError -> 0x001c }
                r1 = 3
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0023 }
                io.jsonwebtoken.SignatureAlgorithm r1 = p116io.jsonwebtoken.SignatureAlgorithm.RS256     // Catch:{ NoSuchFieldError -> 0x0023 }
                r1 = 4
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x002a }
                io.jsonwebtoken.SignatureAlgorithm r1 = p116io.jsonwebtoken.SignatureAlgorithm.RS384     // Catch:{ NoSuchFieldError -> 0x002a }
                r1 = 5
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0031 }
                io.jsonwebtoken.SignatureAlgorithm r1 = p116io.jsonwebtoken.SignatureAlgorithm.RS512     // Catch:{ NoSuchFieldError -> 0x0031 }
                r1 = 6
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0031 }
            L_0x0031:
                r0 = 7
                r1 = 10
                int[] r2 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x003a }
                io.jsonwebtoken.SignatureAlgorithm r3 = p116io.jsonwebtoken.SignatureAlgorithm.PS256     // Catch:{ NoSuchFieldError -> 0x003a }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x003a }
            L_0x003a:
                r2 = 8
                r3 = 11
                int[] r4 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0044 }
                io.jsonwebtoken.SignatureAlgorithm r5 = p116io.jsonwebtoken.SignatureAlgorithm.PS384     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                r4 = 9
                r5 = 12
                int[] r6 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x004e }
                io.jsonwebtoken.SignatureAlgorithm r7 = p116io.jsonwebtoken.SignatureAlgorithm.PS512     // Catch:{ NoSuchFieldError -> 0x004e }
                r6[r5] = r4     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r6 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.jsonwebtoken.SignatureAlgorithm r7 = p116io.jsonwebtoken.SignatureAlgorithm.ES256     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x005a }
                io.jsonwebtoken.SignatureAlgorithm r1 = p116io.jsonwebtoken.SignatureAlgorithm.ES384     // Catch:{ NoSuchFieldError -> 0x005a }
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.jsonwebtoken.SignatureAlgorithm r1 = p116io.jsonwebtoken.SignatureAlgorithm.ES512     // Catch:{ NoSuchFieldError -> 0x0060 }
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.impl.crypto.DefaultSignatureValidatorFactory.C08701.<clinit>():void");
        }
    }

    public SignatureValidator createSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key) {
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm cannot be null.");
        Assert.notNull(key, "Signing Key cannot be null.");
        switch (signatureAlgorithm.ordinal()) {
            case 1:
            case 2:
            case 3:
                return new MacValidator(signatureAlgorithm, key);
            case 4:
            case 5:
            case 6:
            case 10:
            case 11:
            case 12:
                return new RsaSignatureValidator(signatureAlgorithm, key);
            case 7:
            case 8:
            case 9:
                return new EllipticCurveSignatureValidator(signatureAlgorithm, key);
            default:
                StringBuilder a = C1965a.m4756a("The '");
                a.append(signatureAlgorithm.name());
                a.append("' algorithm cannot be used for signing.");
                throw new IllegalArgumentException(a.toString());
        }
    }
}
