package p425x.p426a.p445e.p447b.p448a;

import java.util.HashMap;
import java.util.Map;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.p430e2.C4936a;

/* renamed from: x.a.e.b.a.k */
public class C5053k {

    /* renamed from: e */
    public static final C5053k f12092e = new C5053k(5, 32, 5, C4936a.f11778c);

    /* renamed from: f */
    public static final C5053k f12093f = new C5053k(6, 32, 10, C4936a.f11778c);

    /* renamed from: g */
    public static final C5053k f12094g = new C5053k(7, 32, 15, C4936a.f11778c);

    /* renamed from: h */
    public static final C5053k f12095h = new C5053k(8, 32, 20, C4936a.f11778c);

    /* renamed from: i */
    public static final C5053k f12096i = new C5053k(9, 32, 25, C4936a.f11778c);

    /* renamed from: j */
    public static Map<Object, C5053k> f12097j = new C5054a();

    /* renamed from: a */
    public final int f12098a;

    /* renamed from: b */
    public final int f12099b;

    /* renamed from: c */
    public final int f12100c;

    /* renamed from: d */
    public final C4967n f12101d;

    /* renamed from: x.a.e.b.a.k$a */
    public static class C5054a extends HashMap<Object, C5053k> {
        public C5054a() {
            put(Integer.valueOf(C5053k.f12092e.f12098a), C5053k.f12092e);
            put(Integer.valueOf(C5053k.f12093f.f12098a), C5053k.f12093f);
            put(Integer.valueOf(C5053k.f12094g.f12098a), C5053k.f12094g);
            put(Integer.valueOf(C5053k.f12095h.f12098a), C5053k.f12095h);
            put(Integer.valueOf(C5053k.f12096i.f12098a), C5053k.f12096i);
        }
    }

    public C5053k(int i, int i2, int i3, C4967n nVar) {
        this.f12098a = i;
        this.f12099b = i2;
        this.f12100c = i3;
        this.f12101d = nVar;
    }

    /* renamed from: a */
    public static C5053k m11518a(int i) {
        return (C5053k) f12097j.get(Integer.valueOf(i));
    }
}
