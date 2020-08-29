package p425x.p426a.p445e.p447b.p448a;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;
import p119o.p120a.C0967p0;
import p425x.p426a.p434b.C5008a;

/* renamed from: x.a.e.b.a.h */
public class C5049h extends C5048g {

    /* renamed from: o */
    public static C5050a f12071o;

    /* renamed from: p */
    public static C5050a[] f12072p;

    /* renamed from: e */
    public final byte[] f12073e;

    /* renamed from: f */
    public final C5053k f12074f;

    /* renamed from: g */
    public final C5045e f12075g;

    /* renamed from: h */
    public final int f12076h;

    /* renamed from: i */
    public final byte[] f12077i;

    /* renamed from: j */
    public int f12078j;

    /* renamed from: k */
    public C5051i f12079k;

    /* renamed from: l */
    public int f12080l = (1 << (this.f12074f.f12100c + 1));

    /* renamed from: m */
    public Map<C5050a, byte[]> f12081m = new WeakHashMap();

    /* renamed from: n */
    public C5008a f12082n;

    /* renamed from: x.a.e.b.a.h$a */
    public static class C5050a {

        /* renamed from: a */
        public final int f12083a;

        public C5050a(int i) {
            this.f12083a = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C5050a) && ((C5050a) obj).f12083a == this.f12083a;
        }

        public int hashCode() {
            return this.f12083a;
        }
    }

    static {
        C5050a aVar = new C5050a(1);
        f12071o = aVar;
        C5050a[] aVarArr = new C5050a[129];
        f12072p = aVarArr;
        aVarArr[1] = aVar;
        int i = 2;
        while (true) {
            C5050a[] aVarArr2 = f12072p;
            if (i < aVarArr2.length) {
                aVarArr2[i] = new C5050a(i);
                i++;
            } else {
                return;
            }
        }
    }

    public C5049h(C5053k kVar, C5045e eVar, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.f12074f = kVar;
        this.f12075g = eVar;
        this.f12078j = i;
        this.f12073e = C0967p0.m2217a(bArr);
        this.f12076h = i2;
        this.f12077i = C0967p0.m2217a(bArr2);
        this.f12082n = C5042b.m11504a(kVar.f12101d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p425x.p426a.p445e.p447b.p448a.C5049h m11510a(java.lang.Object r8) {
        /*
            boolean r0 = r8 instanceof p425x.p426a.p445e.p447b.p448a.C5049h
            if (r0 == 0) goto L_0x0007
            x.a.e.b.a.h r8 = (p425x.p426a.p445e.p447b.p448a.C5049h) r8
            return r8
        L_0x0007:
            boolean r0 = r8 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0071
            java.io.DataInputStream r8 = (java.io.DataInputStream) r8
            int r0 = r8.readInt()
            if (r0 != 0) goto L_0x0069
            int r0 = r8.readInt()
            x.a.e.b.a.k r2 = p425x.p426a.p445e.p447b.p448a.C5053k.m11518a(r0)
            int r0 = r8.readInt()
            x.a.e.b.a.e r3 = p425x.p426a.p445e.p447b.p448a.C5045e.m11508a(r0)
            r0 = 16
            byte[] r5 = new byte[r0]
            r8.readFully(r5)
            int r4 = r8.readInt()
            int r6 = r8.readInt()
            int r0 = r8.readInt()
            if (r0 < 0) goto L_0x0061
            int r1 = r8.available()
            if (r0 > r1) goto L_0x004a
            byte[] r7 = new byte[r0]
            r8.readFully(r7)
            x.a.e.b.a.h r8 = new x.a.e.b.a.h
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
        L_0x004a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "secret length exceeded "
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r1)
            int r8 = r8.available()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x0061:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "secret length less than zero"
            r8.<init>(r0)
            throw r8
        L_0x0069:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "expected version 0 lms private key"
            r8.<init>(r0)
            throw r8
        L_0x0071:
            boolean r0 = r8 instanceof byte[]
            if (r0 == 0) goto L_0x0094
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x008d }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x008d }
            byte[] r8 = (byte[]) r8     // Catch:{ all -> 0x008d }
            r2.<init>(r8)     // Catch:{ all -> 0x008d }
            r1.<init>(r2)     // Catch:{ all -> 0x008d }
            x.a.e.b.a.h r8 = m11510a(r1)     // Catch:{ all -> 0x008a }
            r1.close()
            return r8
        L_0x008a:
            r8 = move-exception
            r0 = r1
            goto L_0x008e
        L_0x008d:
            r8 = move-exception
        L_0x008e:
            if (r0 == 0) goto L_0x0093
            r0.close()
        L_0x0093:
            throw r8
        L_0x0094:
            boolean r0 = r8 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x00a3
            java.io.InputStream r8 = (java.io.InputStream) r8
            byte[] r8 = p425x.p426a.p469f.p471j.C5173a.m11610a(r8)
            x.a.e.b.a.h r8 = m11510a(r8)
            return r8
        L_0x00a3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "cannot parse "
            java.lang.String r8 = p213q.p214a.p215a.p216a.C1965a.m4750a(r1, r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p426a.p445e.p447b.p448a.C5049h.m11510a(java.lang.Object):x.a.e.b.a.h");
    }

    /* renamed from: a */
    public byte[] mo11713a() {
        return C0967p0.m2217a(this.f12073e);
    }

    /* renamed from: a */
    public final byte[] mo11714a(int i) {
        int i2 = i;
        int i3 = 1 << this.f12074f.f12100c;
        if (i2 >= i3) {
            C0967p0.m2205a(mo11713a(), this.f12082n);
            C0967p0.m2195a(i2, this.f12082n);
            C5008a aVar = this.f12082n;
            aVar.mo11661a((byte) 16777090);
            aVar.mo11661a((byte) -32126);
            C5045e eVar = this.f12075g;
            byte[] a = mo11713a();
            int i4 = i2 - i3;
            byte[] a2 = C0967p0.m2217a(this.f12077i);
            C5008a a3 = C5042b.m11504a(eVar.f12067e);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(a);
                byte b = (byte) (i4 >>> 24);
                byteArrayOutputStream.write(b);
                byte b2 = (byte) (i4 >>> 16);
                byteArrayOutputStream.write(b2);
                byte b3 = (byte) (i4 >>> 8);
                byteArrayOutputStream.write(b3);
                byte b4 = (byte) i4;
                byteArrayOutputStream.write(b4);
                byteArrayOutputStream.write((byte) 128);
                byteArrayOutputStream.write((byte) 32896);
                while (byteArrayOutputStream.size() < 22) {
                    byteArrayOutputStream.write(0);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                a3.mo11662a(byteArray, 0, byteArray.length);
                C5008a a4 = C5042b.m11504a(eVar.f12067e);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    byteArrayOutputStream2.write(a);
                    byteArrayOutputStream2.write(b);
                    byteArrayOutputStream2.write(b2);
                    byteArrayOutputStream2.write(b3);
                    byteArrayOutputStream2.write(b4);
                    int a5 = a4.mo11659a() + 23;
                    while (byteArrayOutputStream2.size() < a5) {
                        byteArrayOutputStream2.write(0);
                    }
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    C5008a a6 = C5042b.m11504a(eVar.f12067e);
                    int i5 = eVar.f12066d;
                    int i6 = eVar.f12064b;
                    int i7 = (1 << eVar.f12065c) - 1;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < i5) {
                        int i10 = i5;
                        boolean z = i8 < i5 + -1;
                        if (byteArray2.length >= a6.mo11659a()) {
                            a6.mo11662a(a, 0, a.length);
                            a6.mo11661a(b);
                            a6.mo11661a(b2);
                            a6.mo11661a(b3);
                            a6.mo11661a(b4);
                            int i11 = i9;
                            a6.mo11661a((byte) (i11 >>> 8));
                            a6.mo11661a((byte) i11);
                            a6.mo11661a(-1);
                            byte b5 = b4;
                            a6.mo11662a(a2, 0, a2.length);
                            a6.mo11660a(byteArray2, 23);
                            int i12 = z ? i11 + 1 : i11;
                            short s = (short) i8;
                            byteArray2[20] = (byte) (s >>> 8);
                            byteArray2[21] = (byte) s;
                            for (int i13 = 0; i13 < i7; i13++) {
                                byteArray2[22] = (byte) i13;
                                a4.mo11662a(byteArray2, 0, byteArray2.length);
                                a4.mo11660a(byteArray2, 23);
                            }
                            a3.mo11662a(byteArray2, 23, i6);
                            i8++;
                            i5 = i10;
                            byte b6 = b5;
                            i9 = i12;
                            b4 = b6;
                        } else {
                            throw new IllegalArgumentException("target length is less than digest size.");
                        }
                    }
                    int a7 = a3.mo11659a();
                    byte[] bArr = new byte[a7];
                    a3.mo11660a(bArr, 0);
                    this.f12082n.mo11662a(bArr, 0, a7);
                    byte[] bArr2 = new byte[this.f12082n.mo11659a()];
                    this.f12082n.mo11660a(bArr2, 0);
                    return bArr2;
                } catch (Exception e) {
                    Exception exc = e;
                    throw new RuntimeException(exc.getMessage(), exc);
                }
            } catch (Exception e2) {
                Exception exc2 = e2;
                throw new RuntimeException(exc2.getMessage(), exc2);
            }
        } else {
            int i14 = i2 * 2;
            byte[] b7 = mo11717b(i14);
            byte[] b8 = mo11717b(i14 + 1);
            C0967p0.m2205a(mo11713a(), this.f12082n);
            C0967p0.m2195a(i2, this.f12082n);
            C5008a aVar2 = this.f12082n;
            aVar2.mo11661a((byte) 16777091);
            aVar2.mo11661a((byte) -31869);
            C0967p0.m2205a(b7, this.f12082n);
            C0967p0.m2205a(b8, this.f12082n);
            byte[] bArr3 = new byte[this.f12082n.mo11659a()];
            this.f12082n.mo11660a(bArr3, 0);
            return bArr3;
        }
    }

    /* renamed from: b */
    public C5051i mo11716b() {
        C5051i iVar;
        synchronized (this) {
            if (this.f12079k == null) {
                this.f12079k = new C5051i(this.f12074f, this.f12075g, mo11715a(f12071o), this.f12073e);
            }
            iVar = this.f12079k;
        }
        return iVar;
    }

    /* renamed from: b */
    public byte[] mo11717b(int i) {
        if (i >= this.f12080l) {
            return mo11714a(i);
        }
        C5050a[] aVarArr = f12072p;
        return mo11715a(i < aVarArr.length ? aVarArr[i] : new C5050a(i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5049h.class != obj.getClass()) {
            return false;
        }
        C5049h hVar = (C5049h) obj;
        if (this.f12078j != hVar.f12078j || this.f12076h != hVar.f12076h || !Arrays.equals(this.f12073e, hVar.f12073e)) {
            return false;
        }
        C5053k kVar = this.f12074f;
        if (kVar == null ? hVar.f12074f != null : !kVar.equals(hVar.f12074f)) {
            return false;
        }
        C5045e eVar = this.f12075g;
        if (eVar == null ? hVar.f12075g != null : !eVar.equals(hVar.f12075g)) {
            return false;
        }
        if (!Arrays.equals(this.f12077i, hVar.f12077i)) {
            return false;
        }
        C5051i iVar = this.f12079k;
        if (iVar != null) {
            C5051i iVar2 = hVar.f12079k;
            if (iVar2 != null) {
                return iVar.equals(iVar2);
            }
        }
        return true;
    }

    public byte[] getEncoded() {
        C5041a aVar = new C5041a();
        aVar.mo11701a(0);
        aVar.mo11701a(this.f12074f.f12098a);
        aVar.mo11701a(this.f12075g.f12063a);
        aVar.mo11703a(this.f12073e);
        aVar.mo11701a(this.f12078j);
        aVar.mo11701a(this.f12076h);
        aVar.mo11701a(this.f12077i.length);
        aVar.mo11703a(this.f12077i);
        return aVar.mo11704a();
    }

    public int hashCode() {
        int d = (C0967p0.m2248d(this.f12073e) + (this.f12078j * 31)) * 31;
        C5053k kVar = this.f12074f;
        int i = 0;
        int hashCode = (d + (kVar != null ? kVar.hashCode() : 0)) * 31;
        C5045e eVar = this.f12075g;
        int d2 = (C0967p0.m2248d(this.f12077i) + ((((hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f12076h) * 31)) * 31;
        C5051i iVar = this.f12079k;
        if (iVar != null) {
            i = iVar.hashCode();
        }
        return d2 + i;
    }

    /* renamed from: a */
    public final byte[] mo11715a(C5050a aVar) {
        synchronized (this.f12081m) {
            byte[] bArr = (byte[]) this.f12081m.get(aVar);
            if (bArr != null) {
                return bArr;
            }
            byte[] a = mo11714a(aVar.f12083a);
            this.f12081m.put(aVar, a);
            return a;
        }
    }
}
