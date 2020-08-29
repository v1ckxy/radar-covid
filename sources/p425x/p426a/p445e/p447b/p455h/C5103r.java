package p425x.p426a.p445e.p447b.p455h;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.p430e2.C4936a;

/* renamed from: x.a.e.b.h.r */
public final class C5103r {

    /* renamed from: e */
    public static final Map<Integer, C5103r> f12220e;

    /* renamed from: a */
    public final C5111v f12221a;

    /* renamed from: b */
    public final C5112w f12222b;

    /* renamed from: c */
    public final int f12223c;

    /* renamed from: d */
    public final int f12224d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(1), new C5103r(20, 2, C4936a.f11778c));
        hashMap.put(Integer.valueOf(2), new C5103r(20, 4, C4936a.f11778c));
        hashMap.put(Integer.valueOf(3), new C5103r(40, 2, C4936a.f11778c));
        hashMap.put(Integer.valueOf(4), new C5103r(40, 4, C4936a.f11778c));
        hashMap.put(Integer.valueOf(5), new C5103r(40, 8, C4936a.f11778c));
        hashMap.put(Integer.valueOf(6), new C5103r(60, 3, C4936a.f11778c));
        hashMap.put(Integer.valueOf(7), new C5103r(60, 6, C4936a.f11778c));
        hashMap.put(Integer.valueOf(8), new C5103r(60, 12, C4936a.f11778c));
        hashMap.put(Integer.valueOf(9), new C5103r(20, 2, C4936a.f11780e));
        hashMap.put(Integer.valueOf(10), new C5103r(20, 4, C4936a.f11780e));
        hashMap.put(Integer.valueOf(11), new C5103r(40, 2, C4936a.f11780e));
        hashMap.put(Integer.valueOf(12), new C5103r(40, 4, C4936a.f11780e));
        hashMap.put(Integer.valueOf(13), new C5103r(40, 8, C4936a.f11780e));
        hashMap.put(Integer.valueOf(14), new C5103r(60, 3, C4936a.f11780e));
        hashMap.put(Integer.valueOf(15), new C5103r(60, 6, C4936a.f11780e));
        hashMap.put(Integer.valueOf(16), new C5103r(60, 12, C4936a.f11780e));
        hashMap.put(Integer.valueOf(17), new C5103r(20, 2, C4936a.f11784i));
        hashMap.put(Integer.valueOf(18), new C5103r(20, 4, C4936a.f11784i));
        hashMap.put(Integer.valueOf(19), new C5103r(40, 2, C4936a.f11784i));
        hashMap.put(Integer.valueOf(20), new C5103r(40, 4, C4936a.f11784i));
        hashMap.put(Integer.valueOf(21), new C5103r(40, 8, C4936a.f11784i));
        hashMap.put(Integer.valueOf(22), new C5103r(60, 3, C4936a.f11784i));
        hashMap.put(Integer.valueOf(23), new C5103r(60, 6, C4936a.f11784i));
        hashMap.put(Integer.valueOf(24), new C5103r(60, 12, C4936a.f11784i));
        hashMap.put(Integer.valueOf(25), new C5103r(20, 2, C4936a.f11785j));
        hashMap.put(Integer.valueOf(26), new C5103r(20, 4, C4936a.f11785j));
        hashMap.put(Integer.valueOf(27), new C5103r(40, 2, C4936a.f11785j));
        hashMap.put(Integer.valueOf(28), new C5103r(40, 4, C4936a.f11785j));
        hashMap.put(Integer.valueOf(29), new C5103r(40, 8, C4936a.f11785j));
        hashMap.put(Integer.valueOf(30), new C5103r(60, 3, C4936a.f11785j));
        hashMap.put(Integer.valueOf(31), new C5103r(60, 6, C4936a.f11785j));
        hashMap.put(Integer.valueOf(32), new C5103r(60, 12, C4936a.f11785j));
        f12220e = Collections.unmodifiableMap(hashMap);
    }

    public C5103r(int i, int i2, C4967n nVar) {
        this.f12223c = i;
        this.f12224d = i2;
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        } else if (i % i2 == 0) {
            int i3 = i / i2;
            if (i3 != 1) {
                C5112w wVar = new C5112w(i3, nVar);
                this.f12222b = wVar;
                this.f12221a = C5082d.m11544b(wVar.f12258f, wVar.f12259g, wVar.f12257e, wVar.f12260h.f12205d, this.f12223c, i2);
                return;
            }
            throw new IllegalArgumentException("height / layers must be greater than 1");
        } else {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
    }
}
