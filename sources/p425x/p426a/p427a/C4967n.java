package p425x.p426a.p427a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p116io.jsonwebtoken.lang.Strings;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.a.n */
public class C4967n extends C4983s {

    /* renamed from: g */
    public static final ConcurrentMap<C4968a, C4967n> f11848g = new ConcurrentHashMap();

    /* renamed from: e */
    public final String f11849e;

    /* renamed from: f */
    public byte[] f11850f;

    /* renamed from: x.a.a.n$a */
    public static class C4968a {

        /* renamed from: a */
        public final int f11851a;

        /* renamed from: b */
        public final byte[] f11852b;

        public C4968a(byte[] bArr) {
            this.f11851a = C0967p0.m2248d(bArr);
            this.f11852b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C4968a) {
                return Arrays.equals(this.f11852b, ((C4968a) obj).f11852b);
            }
            return false;
        }

        public int hashCode() {
            return this.f11851a;
        }
    }

    public C4967n(String str) {
        if (str != null) {
            boolean z = false;
            if (str.length() >= 3 && str.charAt(1) == '.') {
                char charAt = str.charAt(0);
                if (charAt >= '0' && charAt <= '2') {
                    z = m11263a(str, 2);
                }
            }
            if (z) {
                this.f11849e = str;
                return;
            }
            throw new IllegalArgumentException(C1965a.m4752a("string ", str, " not an OID"));
        }
        throw new NullPointerException("'identifier' cannot be null");
    }

    public C4967n(byte[] bArr) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i] & 255;
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                if (bigInteger == null) {
                    bigInteger = BigInteger.valueOf(j);
                }
                BigInteger or = bigInteger.or(BigInteger.valueOf((long) (b & Byte.MAX_VALUE)));
                if ((b & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80));
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.f11849e = stringBuffer.toString();
        this.f11850f = C0967p0.m2217a(bArr);
    }

    /* renamed from: a */
    public static C4967n m11262a(Object obj) {
        if (obj == null || (obj instanceof C4967n)) {
            return (C4967n) obj;
        }
        if (obj instanceof C4929d) {
            C4983s f = ((C4929d) obj).mo11569f();
            if (f instanceof C4967n) {
                return (C4967n) f;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (C4967n) C4983s.m11325a((byte[]) obj);
            } catch (IOException e) {
                StringBuilder a = C1965a.m4756a("failed to construct object identifier from byte[]: ");
                a.append(e.getMessage());
                throw new IllegalArgumentException(a.toString());
            }
        } else {
            StringBuilder a2 = C1965a.m4756a("illegal object in getInstance: ");
            a2.append(obj.getClass().getName());
            throw new IllegalArgumentException(a2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r2 == 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2 <= 1) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r7.charAt(r0 + 1) != '0') goto L_0x0005;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11263a(java.lang.String r7, int r8) {
        /*
            int r0 = r7.length()
            r1 = 0
        L_0x0005:
            r2 = r1
        L_0x0006:
            int r0 = r0 + -1
            r3 = 48
            r4 = 1
            if (r0 < r8) goto L_0x002c
            char r5 = r7.charAt(r0)
            r6 = 46
            if (r5 != r6) goto L_0x0022
            if (r2 == 0) goto L_0x0021
            if (r2 <= r4) goto L_0x0005
            int r2 = r0 + 1
            char r2 = r7.charAt(r2)
            if (r2 != r3) goto L_0x0005
        L_0x0021:
            return r1
        L_0x0022:
            if (r3 > r5) goto L_0x002b
            r3 = 57
            if (r5 > r3) goto L_0x002b
            int r2 = r2 + 1
            goto L_0x0006
        L_0x002b:
            return r1
        L_0x002c:
            if (r2 == 0) goto L_0x0039
            if (r2 <= r4) goto L_0x0038
            int r0 = r0 + r4
            char r7 = r7.charAt(r0)
            if (r7 != r3) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            return r4
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p426a.p427a.C4967n.m11263a(java.lang.String, int):boolean");
    }

    /* renamed from: b */
    public static C4967n m11264b(byte[] bArr) {
        C4967n nVar = (C4967n) f11848g.get(new C4968a(bArr));
        return nVar == null ? new C4967n(bArr) : nVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
    /* renamed from: a */
    public final void mo11602a(java.io.ByteArrayOutputStream r8) {
        /*
            r7 = this;
            x.a.a.a2 r0 = new x.a.a.a2
            java.lang.String r1 = r7.f11849e
            r0.<init>(r1)
            java.lang.String r1 = r0.mo11557a()
            int r1 = java.lang.Integer.parseInt(r1)
            int r1 = r1 * 40
            java.lang.String r2 = r0.mo11557a()
            int r3 = r2.length()
            r4 = 18
            if (r3 > r4) goto L_0x0027
            long r5 = (long) r1
            long r1 = java.lang.Long.parseLong(r2)
            long r1 = r1 + r5
        L_0x0023:
            r7.mo11603a(r8, r1)
            goto L_0x0038
        L_0x0027:
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r2)
            long r1 = (long) r1
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            java.math.BigInteger r1 = r3.add(r1)
            r7.mo11604a(r8, r1)
        L_0x0038:
            int r1 = r0.f11719b
            r2 = -1
            if (r1 == r2) goto L_0x003f
            r1 = 1
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = r0.mo11557a()
            int r2 = r1.length()
            if (r2 > r4) goto L_0x0051
            long r1 = java.lang.Long.parseLong(r1)
            goto L_0x0023
        L_0x0051:
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r1)
            r7.mo11604a(r8, r2)
            goto L_0x0038
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p426a.p427a.C4967n.mo11602a(java.io.ByteArrayOutputStream):void");
    }

    /* renamed from: a */
    public final void mo11603a(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    /* renamed from: a */
    public final void mo11604a(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        qVar.mo11622a(z, 6, mo11605m());
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        if (sVar == this) {
            return true;
        }
        if (!(sVar instanceof C4967n)) {
            return false;
        }
        return this.f11849e.equals(((C4967n) sVar).f11849e);
    }

    /* renamed from: h */
    public int mo11550h() {
        int length = mo11605m().length;
        return C4924b2.m11131a(length) + 1 + length;
    }

    public int hashCode() {
        return this.f11849e.hashCode();
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
    }

    /* renamed from: m */
    public final synchronized byte[] mo11605m() {
        if (this.f11850f == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mo11602a(byteArrayOutputStream);
            this.f11850f = byteArrayOutputStream.toByteArray();
        }
        return this.f11850f;
    }

    /* renamed from: o */
    public C4967n mo11606o() {
        C4968a aVar = new C4968a(mo11605m());
        C4967n nVar = (C4967n) f11848g.get(aVar);
        if (nVar != null) {
            return nVar;
        }
        C4967n nVar2 = (C4967n) f11848g.putIfAbsent(aVar, this);
        return nVar2 == null ? this : nVar2;
    }

    public String toString() {
        return this.f11849e;
    }

    public C4967n(C4967n nVar, String str) {
        if (m11263a(str, 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(nVar.f11849e);
            sb.append(Strings.CURRENT_PATH);
            sb.append(str);
            this.f11849e = sb.toString();
            return;
        }
        throw new IllegalArgumentException(C1965a.m4752a("string ", str, " not a valid OID branch"));
    }
}
