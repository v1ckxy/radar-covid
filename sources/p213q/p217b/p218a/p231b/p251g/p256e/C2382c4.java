package p213q.p217b.p218a.p231b.p251g.p256e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.c4 */
public final class C2382c4<K, V> extends C2595o3<K, V> {

    /* renamed from: k */
    public static final C2595o3<Object, Object> f6358k = new C2382c4(null, new Object[0], 0);

    /* renamed from: h */
    public final transient Object f6359h;

    /* renamed from: i */
    public final transient Object[] f6360i;

    /* renamed from: j */
    public final transient int f6361j;

    public C2382c4(Object obj, Object[] objArr, int i) {
        this.f6359h = obj;
        this.f6360i = objArr;
        this.f6361j = i;
    }

    /* renamed from: a */
    public static IllegalArgumentException m5596a(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        String str = "=";
        sb.append(str);
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append(str);
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <K, V> p213q.p217b.p218a.p231b.p251g.p256e.C2382c4<K, V> m5597a(int r10, java.lang.Object[] r11) {
        /*
            if (r10 != 0) goto L_0x0007
            q.b.a.b.g.e.o3<java.lang.Object, java.lang.Object> r10 = f6358k
            q.b.a.b.g.e.c4 r10 = (p213q.p217b.p218a.p231b.p251g.p256e.C2382c4) r10
            return r10
        L_0x0007:
            r0 = 0
            r1 = 0
            r2 = 1
            if (r10 != r2) goto L_0x0019
            r10 = r11[r1]
            r1 = r11[r2]
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5238a(r10, r1)
            q.b.a.b.g.e.c4 r10 = new q.b.a.b.g.e.c4
            r10.<init>(r0, r11, r2)
            return r10
        L_0x0019:
            int r3 = r11.length
            int r3 = r3 >> r2
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5319d(r10, r3)
            int r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2648r3.m6344a(r10)
            if (r10 != r2) goto L_0x002d
            r1 = r11[r1]
            r2 = r11[r2]
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5238a(r1, r2)
            goto L_0x00e1
        L_0x002d:
            int r0 = r3 + -1
            r2 = 128(0x80, float:1.794E-43)
            r4 = -1
            if (r3 > r2) goto L_0x006f
            byte[] r2 = new byte[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x0039:
            if (r1 >= r10) goto L_0x006c
            int r3 = r1 * 2
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5238a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5346h(r6)
        L_0x004e:
            r6 = r6 & r0
            byte r7 = r2[r6]
            r8 = 255(0xff, float:3.57E-43)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x005c
            byte r3 = (byte) r3
            r2[r6] = r3
            int r1 = r1 + 1
            goto L_0x0039
        L_0x005c:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0067
            int r6 = r6 + 1
            goto L_0x004e
        L_0x0067:
            java.lang.IllegalArgumentException r10 = m5596a(r4, r5, r11, r7)
            throw r10
        L_0x006c:
            r0 = r2
            goto L_0x00e1
        L_0x006f:
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r3 > r2) goto L_0x00ad
            short[] r2 = new short[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x0079:
            if (r1 >= r10) goto L_0x006c
            int r3 = r1 * 2
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5238a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5346h(r6)
        L_0x008e:
            r6 = r6 & r0
            short r7 = r2[r6]
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x009d
            short r3 = (short) r3
            r2[r6] = r3
            int r1 = r1 + 1
            goto L_0x0079
        L_0x009d:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x00a8
            int r6 = r6 + 1
            goto L_0x008e
        L_0x00a8:
            java.lang.IllegalArgumentException r10 = m5596a(r4, r5, r11, r7)
            throw r10
        L_0x00ad:
            int[] r2 = new int[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x00b2:
            if (r1 >= r10) goto L_0x006c
            int r3 = r1 * 2
            r5 = r11[r3]
            r6 = r3 ^ 1
            r6 = r11[r6]
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5238a(r5, r6)
            int r7 = r5.hashCode()
            int r7 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5346h(r7)
        L_0x00c7:
            r7 = r7 & r0
            r8 = r2[r7]
            if (r8 != r4) goto L_0x00d1
            r2[r7] = r3
            int r1 = r1 + 1
            goto L_0x00b2
        L_0x00d1:
            r9 = r11[r8]
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x00dc
            int r7 = r7 + 1
            goto L_0x00c7
        L_0x00dc:
            java.lang.IllegalArgumentException r10 = m5596a(r5, r6, r11, r8)
            throw r10
        L_0x00e1:
            q.b.a.b.g.e.c4 r1 = new q.b.a.b.g.e.c4
            r1.<init>(r0, r11, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2382c4.m5597a(int, java.lang.Object[]):q.b.a.b.g.e.c4");
    }

    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.f6359h;
        V[] vArr = this.f6360i;
        int i = this.f6361j;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (vArr[0].equals(obj)) {
                return vArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int h = C2286e.m5346h(obj.hashCode());
                while (true) {
                    int i2 = h & length;
                    byte b = bArr[i2] & 255;
                    if (b == 255) {
                        return null;
                    }
                    if (vArr[b].equals(obj)) {
                        return vArr[b ^ 1];
                    }
                    h = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int h2 = C2286e.m5346h(obj.hashCode());
                while (true) {
                    int i3 = h2 & length2;
                    short s = sArr[i3] & 65535;
                    if (s == 65535) {
                        return null;
                    }
                    if (vArr[s].equals(obj)) {
                        return vArr[s ^ 1];
                    }
                    h2 = i3 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int h3 = C2286e.m5346h(obj.hashCode());
                while (true) {
                    int i4 = h3 & length3;
                    int i5 = iArr[i4];
                    if (i5 == -1) {
                        return null;
                    }
                    if (vArr[i5].equals(obj)) {
                        return vArr[i5 ^ 1];
                    }
                    h3 = i4 + 1;
                }
            }
        }
    }

    public final int size() {
        return this.f6361j;
    }
}
