package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.e7 */
public final class C2419e7 extends C2779z6 {
    public /* synthetic */ C2419e7(C2385c7 c7Var) {
        super(null);
    }

    /* renamed from: b */
    public static <E> C2635q6<E> m5747b(Object obj, long j) {
        return (C2635q6) C2366b9.m5496f(obj, j);
    }

    /* renamed from: a */
    public final void mo7412a(Object obj, long j) {
        m5747b(obj, j).mo7391b();
    }

    /* renamed from: a */
    public final <E> void mo7413a(Object obj, Object obj2, long j) {
        C2635q6 b = m5747b(obj, j);
        C2635q6 b2 = m5747b(obj2, j);
        int size = b.size();
        int size2 = b2.size();
        if (size > 0 && size2 > 0) {
            if (!b.mo7387a()) {
                b = b.mo7414a(size2 + size);
            }
            b.addAll(b2);
        }
        if (size > 0) {
            b2 = b;
        }
        C2366b9.m5485a(obj, j, (Object) b2);
    }
}
