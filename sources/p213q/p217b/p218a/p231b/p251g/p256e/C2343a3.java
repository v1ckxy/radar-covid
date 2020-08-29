package p213q.p217b.p218a.p231b.p251g.p256e;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.a3 */
public final class C2343a3<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: n */
    public static final Object f6303n = new Object();
    @NullableDecl

    /* renamed from: e */
    public transient Object f6304e;
    @NullableDecl

    /* renamed from: f */
    public transient int[] f6305f;
    @NullableDecl

    /* renamed from: g */
    public transient Object[] f6306g;
    @NullableDecl

    /* renamed from: h */
    public transient Object[] f6307h;

    /* renamed from: i */
    public transient int f6308i = C2286e.m5303c(3, 1);

    /* renamed from: j */
    public transient int f6309j;
    @NullableDecl

    /* renamed from: k */
    public transient Set<K> f6310k;
    @NullableDecl

    /* renamed from: l */
    public transient Set<Entry<K, V>> f6311l;
    @NullableDecl

    /* renamed from: m */
    public transient Collection<V> f6312m;

    /* renamed from: a */
    public final int mo7367a(int i, int i2, int i3, int i4) {
        Object a = C2470h3.m5893a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C2470h3.m5894a(a, i3 & i5, i4 + 1);
        }
        Object obj = this.f6304e;
        int[] iArr = this.f6305f;
        for (int i6 = 0; i6 <= i; i6++) {
            int a2 = C2470h3.m5891a(obj, i6);
            while (a2 != 0) {
                int i7 = a2 - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int a3 = C2470h3.m5891a(a, i10);
                C2470h3.m5894a(a, i10, a2);
                iArr[i7] = C2470h3.m5890a(i9, a3, i5);
                a2 = i8 & i;
            }
        }
        this.f6304e = a;
        this.f6308i = C2470h3.m5890a(this.f6308i, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* renamed from: a */
    public final int mo7368a(@NullableDecl Object obj) {
        if (mo7370a()) {
            return -1;
        }
        int i = C2286e.m5350i(obj);
        int d = mo7377d();
        int a = C2470h3.m5891a(this.f6304e, i & d);
        if (a == 0) {
            return -1;
        }
        int i2 = ~d;
        int i3 = i & i2;
        do {
            int i4 = a - 1;
            int i5 = this.f6305f[i4];
            if ((i5 & i2) == i3 && C2286e.m5238a(obj, this.f6306g[i4])) {
                return i4;
            }
            a = i5 & d;
        } while (a != 0);
        return -1;
    }

    /* renamed from: a */
    public final void mo7369a(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f6306g;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.f6307h;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f6305f;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int i3 = C2286e.m5350i(obj) & i2;
            int a = C2470h3.m5891a(this.f6304e, i3);
            int i4 = size + 1;
            if (a == i4) {
                C2470h3.m5894a(this.f6304e, i3, i + 1);
                return;
            }
            while (true) {
                int i5 = a - 1;
                int[] iArr2 = this.f6305f;
                int i6 = iArr2[i5];
                int i7 = i6 & i2;
                if (i7 == i4) {
                    iArr2[i5] = C2470h3.m5890a(i6, i + 1, i2);
                    return;
                }
                a = i7;
            }
        } else {
            this.f6306g[i] = null;
            this.f6307h[i] = null;
            this.f6305f[i] = 0;
        }
    }

    /* renamed from: a */
    public final boolean mo7370a() {
        return this.f6304e == null;
    }

    @NullableDecl
    /* renamed from: b */
    public final Object mo7371b(@NullableDecl Object obj) {
        if (mo7370a()) {
            return f6303n;
        }
        int d = mo7377d();
        int a = C2470h3.m5892a(obj, null, d, this.f6304e, this.f6305f, this.f6306g, null);
        if (a == -1) {
            return f6303n;
        }
        Object obj2 = this.f6307h[a];
        mo7369a(a, d);
        this.f6309j--;
        mo7373c();
        return obj2;
    }

    @NullableDecl
    /* renamed from: b */
    public final Map<K, V> mo7372b() {
        Object obj = this.f6304e;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo7373c() {
        this.f6308i += 32;
    }

    public final void clear() {
        if (!mo7370a()) {
            mo7373c();
            Map b = mo7372b();
            if (b != null) {
                this.f6308i = C2286e.m5303c(size(), 3);
                b.clear();
                this.f6304e = null;
            } else {
                Arrays.fill(this.f6306g, 0, this.f6309j, null);
                Arrays.fill(this.f6307h, 0, this.f6309j, null);
                Object obj = this.f6304e;
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                Arrays.fill(this.f6305f, 0, this.f6309j, 0);
            }
            this.f6309j = 0;
        }
    }

    public final boolean containsKey(@NullableDecl Object obj) {
        Map b = mo7372b();
        return b != null ? b.containsKey(obj) : mo7368a(obj) != -1;
    }

    public final boolean containsValue(@NullableDecl Object obj) {
        Map b = mo7372b();
        if (b != null) {
            return b.containsValue(obj);
        }
        for (int i = 0; i < this.f6309j; i++) {
            if (C2286e.m5238a(obj, this.f6307h[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final int mo7377d() {
        return (1 << (this.f6308i & 31)) - 1;
    }

    public final Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f6311l;
        if (set != null) {
            return set;
        }
        C2415e3 e3Var = new C2415e3(this);
        this.f6311l = e3Var;
        return e3Var;
    }

    public final V get(@NullableDecl Object obj) {
        Map b = mo7372b();
        if (b != null) {
            return b.get(obj);
        }
        int a = mo7368a(obj);
        if (a == -1) {
            return null;
        }
        return this.f6307h[a];
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f6310k;
        if (set != null) {
            return set;
        }
        C2450g3 g3Var = new C2450g3(this);
        this.f6310k = g3Var;
        return g3Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ec A[SYNTHETIC] */
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final V put(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r21, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r20.mo7370a()
            r4 = 4
            r5 = 2
            r6 = 32
            r7 = 1
            if (r3 == 0) goto L_0x005c
            boolean r3 = r20.mo7370a()
            java.lang.String r8 = "Arrays already allocated"
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5252a(r3, r8)
            int r3 = r0.f6308i
            int r8 = r3 + 1
            int r8 = java.lang.Math.max(r8, r5)
            int r9 = java.lang.Integer.highestOneBit(r8)
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = (double) r9
            double r12 = r12 * r10
            int r10 = (int) r12
            if (r8 <= r10) goto L_0x0034
            int r9 = r9 << 1
            if (r9 > 0) goto L_0x0034
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x0035
        L_0x0034:
            r8 = r9
        L_0x0035:
            int r8 = java.lang.Math.max(r4, r8)
            java.lang.Object r9 = p213q.p217b.p218a.p231b.p251g.p256e.C2470h3.m5893a(r8)
            r0.f6304e = r9
            int r8 = r8 - r7
            int r8 = java.lang.Integer.numberOfLeadingZeros(r8)
            int r8 = 32 - r8
            int r9 = r0.f6308i
            r10 = 31
            int r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2470h3.m5890a(r9, r8, r10)
            r0.f6308i = r8
            int[] r8 = new int[r3]
            r0.f6305f = r8
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r0.f6306g = r8
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.f6307h = r3
        L_0x005c:
            java.util.Map r3 = r20.mo7372b()
            if (r3 == 0) goto L_0x0067
            java.lang.Object r1 = r3.put(r1, r2)
            return r1
        L_0x0067:
            int[] r3 = r0.f6305f
            java.lang.Object[] r8 = r0.f6306g
            java.lang.Object[] r9 = r0.f6307h
            int r10 = r0.f6309j
            int r11 = r10 + 1
            int r12 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5350i(r21)
            int r13 = r20.mo7377d()
            r14 = r12 & r13
            java.lang.Object r15 = r0.f6304e
            int r15 = p213q.p217b.p218a.p231b.p251g.p256e.C2470h3.m5891a(r15, r14)
            if (r15 != 0) goto L_0x0099
            if (r11 <= r13) goto L_0x0092
            if (r13 >= r6) goto L_0x008a
            r16 = 4
            goto L_0x008c
        L_0x008a:
            r16 = 2
        L_0x008c:
            int r3 = r13 + 1
            int r3 = r3 * r16
            goto L_0x0109
        L_0x0092:
            java.lang.Object r3 = r0.f6304e
            p213q.p217b.p218a.p231b.p251g.p256e.C2470h3.m5894a(r3, r14, r11)
            goto L_0x0114
        L_0x0099:
            int r14 = ~r13
            r5 = r12 & r14
            r18 = 0
        L_0x009e:
            int r15 = r15 - r7
            r6 = r3[r15]
            r4 = r6 & r14
            if (r4 != r5) goto L_0x00b2
            r4 = r8[r15]
            boolean r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5238a(r1, r4)
            if (r4 == 0) goto L_0x00b2
            r1 = r9[r15]
            r9[r15] = r2
            return r1
        L_0x00b2:
            r4 = r6 & r13
            r19 = r5
            int r5 = r18 + 1
            if (r4 != 0) goto L_0x015a
            r4 = 9
            if (r5 < r4) goto L_0x00fd
            int r3 = r20.mo7377d()
            int r3 = r3 + r7
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r3, r5)
            boolean r3 = r20.isEmpty()
            if (r3 == 0) goto L_0x00d3
            r3 = r0
            r6 = r3
            goto L_0x00ea
        L_0x00d3:
            r3 = r0
            r6 = r3
            r5 = 0
        L_0x00d6:
            if (r5 < 0) goto L_0x00ec
            java.lang.Object[] r7 = r3.f6306g
            r7 = r7[r5]
            java.lang.Object[] r8 = r3.f6307h
            r8 = r8[r5]
            r4.put(r7, r8)
            int r5 = r5 + 1
            int r7 = r3.f6309j
            if (r5 >= r7) goto L_0x00ea
            goto L_0x00d6
        L_0x00ea:
            r5 = -1
            goto L_0x00d6
        L_0x00ec:
            r3.f6304e = r4
            r5 = 0
            r3.f6305f = r5
            r3.f6306g = r5
            r3.f6307h = r5
            r6.mo7373c()
            java.lang.Object r1 = r4.put(r1, r2)
            return r1
        L_0x00fd:
            if (r11 <= r13) goto L_0x010e
            r4 = 32
            if (r13 >= r4) goto L_0x0105
            r4 = 4
            goto L_0x0106
        L_0x0105:
            r4 = 2
        L_0x0106:
            int r3 = r13 + 1
            int r3 = r3 * r4
        L_0x0109:
            int r13 = r0.mo7367a(r13, r3, r12, r10)
            goto L_0x0114
        L_0x010e:
            int r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2470h3.m5890a(r6, r11, r13)
            r3[r15] = r4
        L_0x0114:
            int[] r3 = r0.f6305f
            int r3 = r3.length
            if (r11 <= r3) goto L_0x0142
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            int r5 = r3 >>> 1
            int r5 = java.lang.Math.max(r7, r5)
            int r5 = r5 + r3
            r5 = r5 | r7
            int r4 = java.lang.Math.min(r4, r5)
            if (r4 == r3) goto L_0x0142
            int[] r3 = r0.f6305f
            int[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.f6305f = r3
            java.lang.Object[] r3 = r0.f6306g
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.f6306g = r3
            java.lang.Object[] r3 = r0.f6307h
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.f6307h = r3
        L_0x0142:
            int[] r3 = r0.f6305f
            r6 = 0
            int r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2470h3.m5890a(r12, r6, r13)
            r3[r10] = r4
            java.lang.Object[] r3 = r0.f6306g
            r3[r10] = r1
            java.lang.Object[] r1 = r0.f6307h
            r1[r10] = r2
            r0.f6309j = r11
            r20.mo7373c()
            r15 = 0
            return r15
        L_0x015a:
            r6 = 0
            r15 = r4
            r18 = r5
            r5 = r19
            r6 = 32
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2343a3.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map b = mo7372b();
        if (b != null) {
            return b.remove(obj);
        }
        V b2 = mo7371b(obj);
        if (b2 == f6303n) {
            b2 = null;
        }
        return b2;
    }

    public final int size() {
        Map b = mo7372b();
        return b != null ? b.size() : this.f6309j;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f6312m;
        if (collection != null) {
            return collection;
        }
        C2487i3 i3Var = new C2487i3(this);
        this.f6312m = i3Var;
        return i3Var;
    }
}
