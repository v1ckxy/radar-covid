package p124p.p182q;

import p124p.p188t.p189a.p190f.C1684f;

/* renamed from: p.q.b */
public abstract class C1619b<T> extends C1648k {
    public C1619b(C1638g gVar) {
        super(gVar);
    }

    /* renamed from: a */
    public final void mo6382a(T t) {
        C1684f a = mo6441a();
        try {
            mo6383a(a, t);
            a.f4946f.executeInsert();
            if (a == this.f4861c) {
                this.f4859a.set(false);
            }
        } catch (Throwable th) {
            mo6442a(a);
            throw th;
        }
    }

    /* renamed from: a */
    public abstract void mo6383a(C1684f fVar, T t);
}
