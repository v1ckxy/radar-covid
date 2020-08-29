package p213q.p217b.p301c.p302a.p315m0;

import java.lang.reflect.Array;
import java.math.BigInteger;
import p213q.p217b.p301c.p302a.p315m0.C3828s.C3829a;

/* renamed from: q.b.c.a.m0.t */
public final class C3833t {

    /* renamed from: a */
    public static final long[] f9412a = C3794d0.m9131a(m9194a(f9416e));

    /* renamed from: b */
    public static final C3829a[][] f9413b = ((C3829a[][]) Array.newInstance(C3829a.class, new int[]{32, 8}));

    /* renamed from: c */
    public static final C3829a[] f9414c = new C3829a[8];

    /* renamed from: d */
    public static final BigInteger f9415d = BigInteger.valueOf(2).pow(255).subtract(BigInteger.valueOf(19));

    /* renamed from: e */
    public static final BigInteger f9416e = BigInteger.valueOf(-121665).multiply(BigInteger.valueOf(121666).modInverse(f9415d)).mod(f9415d);

    /* renamed from: f */
    public static final BigInteger f9417f = BigInteger.valueOf(2).multiply(f9416e).mod(f9415d);

    /* renamed from: g */
    public static final BigInteger f9418g = BigInteger.valueOf(2).modPow(f9415d.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4)), f9415d);

    /* renamed from: q.b.c.a.m0.t$b */
    public static class C3835b {

        /* renamed from: a */
        public BigInteger f9419a;

        /* renamed from: b */
        public BigInteger f9420b;

        public /* synthetic */ C3835b(C3834a aVar) {
        }
    }

    static {
        C3835b bVar = new C3835b(null);
        BigInteger mod = BigInteger.valueOf(4).multiply(BigInteger.valueOf(5).modInverse(f9415d)).mod(f9415d);
        bVar.f9420b = mod;
        BigInteger multiply = mod.pow(2).subtract(BigInteger.ONE).multiply(f9416e.multiply(mod.pow(2)).add(BigInteger.ONE).modInverse(f9415d));
        BigInteger modPow = multiply.modPow(f9415d.add(BigInteger.valueOf(3)).divide(BigInteger.valueOf(8)), f9415d);
        if (!modPow.pow(2).subtract(multiply).mod(f9415d).equals(BigInteger.ZERO)) {
            modPow = modPow.multiply(f9418g).mod(f9415d);
        }
        if (modPow.testBit(0)) {
            modPow = f9415d.subtract(modPow);
        }
        bVar.f9419a = modPow;
        C3794d0.m9131a(m9194a(f9417f));
        C3794d0.m9131a(m9194a(f9418g));
        C3835b bVar2 = bVar;
        for (int i = 0; i < 32; i++) {
            C3835b bVar3 = bVar2;
            for (int i2 = 0; i2 < 8; i2++) {
                f9413b[i][i2] = m9192a(bVar3);
                bVar3 = m9193a(bVar3, bVar2);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                bVar2 = m9193a(bVar2, bVar2);
            }
        }
        C3835b a = m9193a(bVar, bVar);
        for (int i4 = 0; i4 < 8; i4++) {
            f9414c[i4] = m9192a(bVar);
            bVar = m9193a(bVar, a);
        }
    }

    /* renamed from: a */
    public static C3835b m9193a(C3835b bVar, C3835b bVar2) {
        C3835b bVar3 = new C3835b(null);
        BigInteger mod = f9416e.multiply(bVar.f9419a.multiply(bVar2.f9419a).multiply(bVar.f9420b).multiply(bVar2.f9420b)).mod(f9415d);
        bVar3.f9419a = bVar.f9419a.multiply(bVar2.f9420b).add(bVar2.f9419a.multiply(bVar.f9420b)).multiply(BigInteger.ONE.add(mod).modInverse(f9415d)).mod(f9415d);
        bVar3.f9420b = bVar.f9420b.multiply(bVar2.f9420b).add(bVar.f9419a.multiply(bVar2.f9419a)).multiply(BigInteger.ONE.subtract(mod).modInverse(f9415d)).mod(f9415d);
        return bVar3;
    }

    /* renamed from: a */
    public static byte[] m9194a(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = (32 - i) - 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    /* renamed from: a */
    public static C3829a m9192a(C3835b bVar) {
        return new C3829a(C3794d0.m9131a(m9194a(bVar.f9420b.add(bVar.f9419a).mod(f9415d))), C3794d0.m9131a(m9194a(bVar.f9420b.subtract(bVar.f9419a).mod(f9415d))), C3794d0.m9131a(m9194a(f9417f.multiply(bVar.f9419a).multiply(bVar.f9420b).mod(f9415d))));
    }
}
