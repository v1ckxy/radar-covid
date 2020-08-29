package p116io.jsonwebtoken.security;

import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import p116io.jsonwebtoken.SignatureAlgorithm;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.lang.Classes;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.security.Keys */
public final class Keys {

    /* renamed from: EC */
    public static final String f2455EC = "io.jsonwebtoken.impl.crypto.EllipticCurveProvider";
    public static final String MAC = "io.jsonwebtoken.impl.crypto.MacProvider";
    public static final List<SignatureAlgorithm> PREFERRED_HMAC_ALGS = Collections.unmodifiableList(Arrays.asList(new SignatureAlgorithm[]{SignatureAlgorithm.HS512, SignatureAlgorithm.HS384, SignatureAlgorithm.HS256}));
    public static final String RSA = "io.jsonwebtoken.impl.crypto.RsaProvider";
    public static final Class[] SIG_ARG_TYPES = {SignatureAlgorithm.class};

    /* renamed from: io.jsonwebtoken.security.Keys$1 */
    public static /* synthetic */ class C08831 {
        public static final /* synthetic */ int[] $SwitchMap$io$jsonwebtoken$SignatureAlgorithm;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|4|5|6|(2:7|8)|9|(2:11|12)|13|(2:15|16)|17|(2:19|20)|21|23|24|25|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|4|5|6|7|8|9|(2:11|12)|13|15|16|17|(2:19|20)|21|23|24|25|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|4|5|6|7|8|9|11|12|13|15|16|17|19|20|21|23|24|25|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001c */
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
                r0 = 5
                r1 = 10
                int[] r2 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x002c }
                io.jsonwebtoken.SignatureAlgorithm r3 = p116io.jsonwebtoken.SignatureAlgorithm.PS256     // Catch:{ NoSuchFieldError -> 0x002c }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002c }
            L_0x002c:
                r2 = 6
                int[] r3 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.jsonwebtoken.SignatureAlgorithm r4 = p116io.jsonwebtoken.SignatureAlgorithm.RS384     // Catch:{ NoSuchFieldError -> 0x0033 }
                r3[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r0 = 7
                r3 = 11
                int[] r4 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x003c }
                io.jsonwebtoken.SignatureAlgorithm r5 = p116io.jsonwebtoken.SignatureAlgorithm.PS384     // Catch:{ NoSuchFieldError -> 0x003c }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                r4 = 8
                int[] r5 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0044 }
                io.jsonwebtoken.SignatureAlgorithm r6 = p116io.jsonwebtoken.SignatureAlgorithm.RS512     // Catch:{ NoSuchFieldError -> 0x0044 }
                r5[r2] = r4     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                r2 = 9
                r5 = 12
                int[] r6 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x004e }
                io.jsonwebtoken.SignatureAlgorithm r7 = p116io.jsonwebtoken.SignatureAlgorithm.PS512     // Catch:{ NoSuchFieldError -> 0x004e }
                r6[r5] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r6 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.jsonwebtoken.SignatureAlgorithm r7 = p116io.jsonwebtoken.SignatureAlgorithm.ES256     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x005a }
                io.jsonwebtoken.SignatureAlgorithm r1 = p116io.jsonwebtoken.SignatureAlgorithm.ES384     // Catch:{ NoSuchFieldError -> 0x005a }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.jsonwebtoken.SignatureAlgorithm r1 = p116io.jsonwebtoken.SignatureAlgorithm.ES512     // Catch:{ NoSuchFieldError -> 0x0060 }
                r0[r2] = r5     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.security.Keys.C08831.<clinit>():void");
        }
    }

    public static SecretKey hmacShaKeyFor(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length * 8;
            for (SignatureAlgorithm signatureAlgorithm : PREFERRED_HMAC_ALGS) {
                if (length >= signatureAlgorithm.getMinKeyLength()) {
                    return new SecretKeySpec(bArr, signatureAlgorithm.getJcaName());
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The specified key byte array is ");
            sb.append(length);
            sb.append(" bits which ");
            sb.append("is not secure enough for any JWT HMAC-SHA algorithm.  The JWT ");
            sb.append("JWA Specification (RFC 7518, Section 3.2) states that keys used with HMAC-SHA algorithms MUST have a ");
            sb.append("size >= 256 bits (the key size must be greater than or equal to the hash ");
            sb.append("output size).  Consider using the ");
            sb.append(Keys.class.getName());
            sb.append("#secretKeyFor(SignatureAlgorithm) method ");
            throw new WeakKeyException(C1965a.m4754a(sb, "to create a key guaranteed to be secure enough for your preferred HMAC-SHA algorithm.  See ", "https://tools.ietf.org/html/rfc7518#section-3.2 for more information."));
        }
        throw new InvalidKeyException("SecretKey byte array cannot be null.");
    }

    public static KeyPair keyPairFor(SignatureAlgorithm signatureAlgorithm) {
        Object obj;
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm cannot be null.");
        String str = "generateKeyPair";
        switch (signatureAlgorithm.ordinal()) {
            case 4:
            case 5:
            case 6:
            case 10:
            case 11:
            case 12:
                obj = Classes.invokeStatic(RSA, str, SIG_ARG_TYPES, signatureAlgorithm);
                break;
            case 7:
            case 8:
            case 9:
                obj = Classes.invokeStatic(f2455EC, str, SIG_ARG_TYPES, signatureAlgorithm);
                break;
            default:
                StringBuilder a = C1965a.m4756a("The ");
                a.append(signatureAlgorithm.name());
                a.append(" algorithm does not support Key Pairs.");
                throw new IllegalArgumentException(a.toString());
        }
        return (KeyPair) obj;
    }

    public static SecretKey secretKeyFor(SignatureAlgorithm signatureAlgorithm) {
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm cannot be null.");
        int ordinal = signatureAlgorithm.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return (SecretKey) Classes.invokeStatic(MAC, "generateKey", SIG_ARG_TYPES, signatureAlgorithm);
        }
        StringBuilder a = C1965a.m4756a("The ");
        a.append(signatureAlgorithm.name());
        a.append(" algorithm does not support shared secret keys.");
        throw new IllegalArgumentException(a.toString());
    }
}
