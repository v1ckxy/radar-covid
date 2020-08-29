package p116io.jsonwebtoken.impl.crypto;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import java.util.HashMap;
import java.util.Map;
import p116io.jsonwebtoken.JwtException;
import p116io.jsonwebtoken.SignatureAlgorithm;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.lang.Strings;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.impl.crypto.EllipticCurveProvider */
public abstract class EllipticCurveProvider extends SignatureProvider {
    public static final Map<SignatureAlgorithm, String> EC_CURVE_NAMES = createEcCurveNames();

    /* renamed from: io.jsonwebtoken.impl.crypto.EllipticCurveProvider$1 */
    public static /* synthetic */ class C08721 {
        public static final /* synthetic */ int[] $SwitchMap$io$jsonwebtoken$SignatureAlgorithm;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0018 */
        static {
            /*
                io.jsonwebtoken.SignatureAlgorithm[] r0 = p116io.jsonwebtoken.SignatureAlgorithm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm = r0
                io.jsonwebtoken.SignatureAlgorithm r1 = p116io.jsonwebtoken.SignatureAlgorithm.ES256     // Catch:{ NoSuchFieldError -> 0x000f }
                r1 = 7
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0018 }
                io.jsonwebtoken.SignatureAlgorithm r1 = p116io.jsonwebtoken.SignatureAlgorithm.ES384     // Catch:{ NoSuchFieldError -> 0x0018 }
                r1 = 8
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x0021 }
                io.jsonwebtoken.SignatureAlgorithm r1 = p116io.jsonwebtoken.SignatureAlgorithm.ES512     // Catch:{ NoSuchFieldError -> 0x0021 }
                r1 = 9
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.impl.crypto.EllipticCurveProvider.C08721.<clinit>():void");
        }
    }

    public EllipticCurveProvider(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        Assert.isTrue(signatureAlgorithm.isEllipticCurve(), "SignatureAlgorithm must be an Elliptic Curve algorithm.");
    }

    public static Map<SignatureAlgorithm, String> createEcCurveNames() {
        HashMap hashMap = new HashMap();
        hashMap.put(SignatureAlgorithm.ES256, "secp256r1");
        hashMap.put(SignatureAlgorithm.ES384, "secp384r1");
        hashMap.put(SignatureAlgorithm.ES512, "secp521r1");
        return hashMap;
    }

    public static KeyPair generateKeyPair() {
        return generateKeyPair(SignatureAlgorithm.ES512);
    }

    public static KeyPair generateKeyPair(SignatureAlgorithm signatureAlgorithm) {
        return generateKeyPair(signatureAlgorithm, SignatureProvider.DEFAULT_SECURE_RANDOM);
    }

    public static KeyPair generateKeyPair(SignatureAlgorithm signatureAlgorithm, SecureRandom secureRandom) {
        return generateKeyPair("EC", null, signatureAlgorithm, secureRandom);
    }

    public static KeyPair generateKeyPair(String str, String str2, SignatureAlgorithm signatureAlgorithm, SecureRandom secureRandom) {
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm argument cannot be null.");
        Assert.isTrue(signatureAlgorithm.isEllipticCurve(), "SignatureAlgorithm argument must represent an Elliptic Curve algorithm.");
        try {
            KeyPairGenerator instance = Strings.hasText(str2) ? KeyPairGenerator.getInstance(str, str2) : KeyPairGenerator.getInstance(str);
            instance.initialize(new ECGenParameterSpec((String) EC_CURVE_NAMES.get(signatureAlgorithm)), secureRandom);
            return instance.generateKeyPair();
        } catch (Exception e) {
            StringBuilder a = C1965a.m4756a("Unable to generate Elliptic Curve KeyPair: ");
            a.append(e.getMessage());
            throw new IllegalStateException(a.toString(), e);
        }
    }

    public static int getSignatureByteArrayLength(SignatureAlgorithm signatureAlgorithm) {
        int ordinal = signatureAlgorithm.ordinal();
        if (ordinal == 7) {
            return 64;
        }
        if (ordinal == 8) {
            return 96;
        }
        if (ordinal == 9) {
            return 132;
        }
        StringBuilder a = C1965a.m4756a("Unsupported Algorithm: ");
        a.append(signatureAlgorithm.name());
        throw new JwtException(a.toString());
    }

    public static byte[] transcodeSignatureToConcat(byte[] bArr, int i) {
        int i2;
        String str = "Invalid ECDSA signature format";
        if (bArr.length < 8 || bArr[0] != 48) {
            throw new JwtException(str);
        }
        if (bArr[1] > 0) {
            i2 = 2;
        } else if (bArr[1] == -127) {
            i2 = 3;
        } else {
            throw new JwtException(str);
        }
        byte b = bArr[i2 + 1];
        int i3 = b;
        while (i3 > 0 && bArr[((i2 + 2) + b) - i3] == 0) {
            i3--;
        }
        int i4 = i2 + 2 + b;
        byte b2 = bArr[i4 + 1];
        int i5 = b2;
        while (i5 > 0 && bArr[((i4 + 2) + b2) - i5] == 0) {
            i5--;
        }
        int max = Math.max(Math.max(i3, i5), i / 2);
        int i6 = i2 - 1;
        if ((bArr[i6] & 255) == bArr.length - i2 && (bArr[i6] & 255) == C1965a.m4742a((int) b, 2, 2, (int) b2) && bArr[i2] == 2 && bArr[i4] == 2) {
            int i7 = max * 2;
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, i4 - i3, bArr2, max - i3, i3);
            System.arraycopy(bArr, ((i4 + 2) + b2) - i5, bArr2, i7 - i5, i5);
            return bArr2;
        }
        throw new JwtException(str);
    }

    public static byte[] transcodeSignatureToDER(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length / 2;
        int i = length;
        while (i > 0 && bArr[length - i] == 0) {
            i--;
        }
        int i2 = length - i;
        int i3 = bArr[i2] < 0 ? i + 1 : i;
        int i4 = length;
        while (i4 > 0 && bArr[(length * 2) - i4] == 0) {
            i4--;
        }
        int i5 = (length * 2) - i4;
        int i6 = bArr[i5] < 0 ? i4 + 1 : i4;
        int a = C1965a.m4742a(i3, 2, 2, i6);
        if (a <= 255) {
            int i7 = 1;
            if (a < 128) {
                bArr2 = new byte[C1965a.m4742a(i3, 4, 2, i6)];
            } else {
                bArr2 = new byte[C1965a.m4742a(i3, 5, 2, i6)];
                bArr2[1] = -127;
                i7 = 2;
            }
            bArr2[0] = 48;
            int i8 = i7 + 1;
            bArr2[i7] = (byte) a;
            int i9 = i8 + 1;
            bArr2[i8] = 2;
            int i10 = i9 + 1;
            bArr2[i9] = (byte) i3;
            int i11 = i10 + i3;
            System.arraycopy(bArr, i2, bArr2, i11 - i, i);
            int i12 = i11 + 1;
            bArr2[i11] = 2;
            int i13 = i12 + 1;
            bArr2[i12] = (byte) i6;
            System.arraycopy(bArr, i5, bArr2, (i13 + i6) - i4, i4);
            return bArr2;
        }
        throw new JwtException("Invalid ECDSA signature format");
    }
}
