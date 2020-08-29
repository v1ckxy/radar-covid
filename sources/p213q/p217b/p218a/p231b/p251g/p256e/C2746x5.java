package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2778z5;

/* renamed from: q.b.a.b.g.e.x5 */
public final class C2746x5<T extends C2778z5<T>> {

    /* renamed from: d */
    public static final C2746x5 f6957d = new C2746x5(true);

    /* renamed from: a */
    public final C2475h8<T, Object> f6958a = C2475h8.m5903c(16);

    /* renamed from: b */
    public boolean f6959b;

    /* renamed from: c */
    public boolean f6960c;

    public C2746x5() {
    }

    public C2746x5(boolean z) {
        mo8092a();
        mo8092a();
    }

    /* renamed from: a */
    public static int m6527a(C2476h9 h9Var, int i, Object obj) {
        int f = C2615p5.m6256f(i);
        if (h9Var == C2476h9.GROUP) {
            C2619p7 p7Var = (C2619p7) obj;
            if (p7Var instanceof C2761y4) {
                C2761y4 y4Var = (C2761y4) p7Var;
            }
            f <<= 1;
        }
        return m6530b(h9Var, obj) + f;
    }

    /* renamed from: a */
    public static Object m6528a(Object obj) {
        if (obj instanceof C2733w7) {
            return ((C2733w7) obj).mo8088a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: b */
    public static int m6531b(C2778z5<?> z5Var, Object obj) {
        C2476h9 b = z5Var.mo7783b();
        int a = z5Var.mo7780a();
        if (!z5Var.mo7786d()) {
            return m6527a(b, a, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (z5Var.mo7787e()) {
            for (Object b2 : list) {
                i += m6530b(b, b2);
            }
            return C2615p5.m6256f(a) + i + C2615p5.m6260h(i);
        }
        for (Object a2 : list) {
            i += m6527a(b, a, a2);
        }
        return i;
    }

    /* renamed from: b */
    public static <T extends C2778z5<T>> boolean m6532b(Entry<T, Object> entry) {
        C2778z5 z5Var = (C2778z5) entry.getKey();
        if (z5Var.mo7784c() == C2601o9.MESSAGE) {
            boolean d = z5Var.mo7786d();
            Object value = entry.getValue();
            if (d) {
                for (C2619p7 b : (List) value) {
                    if (!b.mo7763b()) {
                        return false;
                    }
                }
            } else if (value instanceof C2619p7) {
                if (!((C2619p7) value).mo7763b()) {
                    return false;
                }
            } else if (value instanceof C2700u6) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: c */
    public static int m6533c(Entry<T, Object> entry) {
        int c;
        int f;
        int d;
        int h;
        C2778z5 z5Var = (C2778z5) entry.getKey();
        Object value = entry.getValue();
        if (z5Var.mo7784c() != C2601o9.MESSAGE || z5Var.mo7786d() || z5Var.mo7787e()) {
            return m6531b(z5Var, value);
        }
        boolean z = value instanceof C2700u6;
        int a = ((C2778z5) entry.getKey()).mo7780a();
        if (z) {
            C2700u6 u6Var = (C2700u6) value;
            c = C2615p5.m6244c(2, a) + (C2615p5.m6256f(1) << 1);
            f = C2615p5.m6256f(3);
            d = u6Var.mo8117a();
            h = C2615p5.m6260h(d);
        } else {
            C2619p7 p7Var = (C2619p7) value;
            c = C2615p5.m6244c(2, a) + (C2615p5.m6256f(1) << 1);
            f = C2615p5.m6256f(3);
            d = p7Var.mo7765d();
            h = C2615p5.m6260h(d);
        }
        return h + d + f + c;
    }

    /* renamed from: a */
    public final void mo8092a() {
        if (!this.f6959b) {
            this.f6958a.mo7709a();
            this.f6959b = true;
        }
    }

    /* renamed from: a */
    public final void mo8094a(T t, Object obj) {
        if (!t.mo7786d()) {
            m6529a(t.mo7783b(), obj);
            r6 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m6529a(t.mo7783b(), obj2);
            }
            r6 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r6 instanceof C2700u6) {
            this.f6960c = true;
        }
        this.f6958a.put(t, r6);
    }

    /* renamed from: b */
    public final Iterator<Entry<T, Object>> mo8095b() {
        return this.f6960c ? new C2716v6(this.f6958a.entrySet().iterator()) : this.f6958a.entrySet().iterator();
    }

    /* renamed from: c */
    public final boolean mo8096c() {
        for (int i = 0; i < this.f6958a.mo7710b(); i++) {
            if (!m6532b(this.f6958a.mo7708a(i))) {
                return false;
            }
        }
        for (Entry b : this.f6958a.mo7712c()) {
            if (!m6532b(b)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() {
        C2746x5 x5Var = new C2746x5();
        for (int i = 0; i < this.f6958a.mo7710b(); i++) {
            Entry a = this.f6958a.mo7708a(i);
            x5Var.mo8094a((T) (C2778z5) a.getKey(), a.getValue());
        }
        for (Entry entry : this.f6958a.mo7712c()) {
            x5Var.mo8094a((T) (C2778z5) entry.getKey(), entry.getValue());
        }
        x5Var.f6960c = this.f6960c;
        return x5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2746x5)) {
            return false;
        }
        return this.f6958a.equals(((C2746x5) obj).f6958a);
    }

    public final int hashCode() {
        return this.f6958a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if ((r2 instanceof byte[]) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        if (r1 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if ((r2 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2700u6) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r2 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2529k6) == false) goto L_0x003f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m6529a(p213q.p217b.p218a.p231b.p251g.p256e.C2476h9 r1, java.lang.Object r2) {
        /*
            p213q.p217b.p218a.p231b.p251g.p256e.C2546l6.m6112a(r2)
            int[] r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2346a6.f6314a
            q.b.a.b.g.e.o9 r1 = r1.f6600e
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L_0x003c;
                case 2: goto L_0x0039;
                case 3: goto L_0x0036;
                case 4: goto L_0x0033;
                case 5: goto L_0x0030;
                case 6: goto L_0x002d;
                case 7: goto L_0x0023;
                case 8: goto L_0x001a;
                case 9: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x003f
        L_0x0011:
            boolean r1 = r2 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2619p7
            if (r1 != 0) goto L_0x002b
            boolean r1 = r2 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2700u6
            if (r1 == 0) goto L_0x003f
            goto L_0x002b
        L_0x001a:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L_0x002b
            boolean r1 = r2 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2529k6
            if (r1 == 0) goto L_0x003f
            goto L_0x002b
        L_0x0023:
            boolean r1 = r2 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2435f5
            if (r1 != 0) goto L_0x002b
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L_0x003f
        L_0x002b:
            r1 = 1
            goto L_0x0040
        L_0x002d:
            boolean r1 = r2 instanceof java.lang.String
            goto L_0x0040
        L_0x0030:
            boolean r1 = r2 instanceof java.lang.Boolean
            goto L_0x0040
        L_0x0033:
            boolean r1 = r2 instanceof java.lang.Double
            goto L_0x0040
        L_0x0036:
            boolean r1 = r2 instanceof java.lang.Float
            goto L_0x0040
        L_0x0039:
            boolean r1 = r2 instanceof java.lang.Long
            goto L_0x0040
        L_0x003c:
            boolean r1 = r2 instanceof java.lang.Integer
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            if (r1 == 0) goto L_0x0043
            return
        L_0x0043:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2746x5.m6529a(q.b.a.b.g.e.h9, java.lang.Object):void");
    }

    /* renamed from: b */
    public static int m6530b(C2476h9 h9Var, Object obj) {
        switch (C2346a6.f6315b[h9Var.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                C2615p5.m6243c();
                return 8;
            case 2:
                ((Float) obj).floatValue();
                C2615p5.m6237b();
                return 4;
            case 3:
                return C2615p5.m6246c(((Long) obj).longValue());
            case 4:
                return C2615p5.m6246c(((Long) obj).longValue());
            case 5:
                return C2615p5.m6258g(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                C2615p5.m6251e();
                return 8;
            case 7:
                ((Integer) obj).intValue();
                C2615p5.m6257g();
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                C2615p5.m6247d();
                return 1;
            case 9:
                return C2615p5.m6241b((C2619p7) obj);
            case 10:
                return obj instanceof C2700u6 ? C2615p5.m6235a((C2763y6) (C2700u6) obj) : C2615p5.m6233a((C2619p7) obj);
            case 11:
                return obj instanceof C2435f5 ? C2615p5.m6232a((C2435f5) obj) : C2615p5.m6231a((String) obj);
            case 12:
                return obj instanceof C2435f5 ? C2615p5.m6232a((C2435f5) obj) : C2615p5.m6242b((byte[]) obj);
            case 13:
                return C2615p5.m6260h(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                C2615p5.m6259h();
                return 4;
            case 15:
                ((Long) obj).longValue();
                C2615p5.m6255f();
                return 8;
            case 16:
                return C2615p5.m6262j(((Integer) obj).intValue());
            case 17:
                return C2615p5.m6250d(((Long) obj).longValue());
            case 18:
                if (obj instanceof C2529k6) {
                    return C2615p5.m6258g(((C2529k6) obj).mo7628a());
                }
                return C2615p5.m6258g(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: a */
    public final void mo8093a(Entry<T, Object> entry) {
        C2778z5 z5Var = (C2778z5) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C2700u6) {
            C2700u6 u6Var = (C2700u6) value;
            C2700u6.m6464c();
            throw null;
        } else if (z5Var.mo7786d()) {
            Object obj = this.f6958a.get(z5Var);
            if (!(obj instanceof C2700u6)) {
                if (obj == null) {
                    obj = new ArrayList();
                }
                for (Object a : (List) value) {
                    ((List) obj).add(m6528a(a));
                }
                this.f6958a.put(z5Var, obj);
                return;
            }
            C2700u6 u6Var2 = (C2700u6) obj;
            C2700u6.m6464c();
            throw null;
        } else if (z5Var.mo7784c() == C2601o9.MESSAGE) {
            Object obj2 = this.f6958a.get(z5Var);
            if (obj2 instanceof C2700u6) {
                C2700u6 u6Var3 = (C2700u6) obj2;
                C2700u6.m6464c();
                throw null;
            } else if (obj2 == null) {
                this.f6958a.put(z5Var, m6528a(value));
            } else {
                this.f6958a.put(z5Var, obj2 instanceof C2733w7 ? z5Var.mo7782a((C2733w7) obj2, (C2733w7) value) : ((C2491a) z5Var.mo7781a(((C2619p7) obj2).mo7766e(), (C2619p7) value)).mo7778m());
            }
        } else {
            this.f6958a.put(z5Var, m6528a(value));
        }
    }
}
