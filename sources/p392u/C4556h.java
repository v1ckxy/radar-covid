package p392u;

import java.io.Serializable;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.h */
public final class C4556h<T> implements C4551d<T>, Serializable {

    /* renamed from: e */
    public C4607a<? extends T> f10769e;

    /* renamed from: f */
    public volatile Object f10770f;

    /* renamed from: g */
    public final Object f10771g;

    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C4556h(p392u.p401r.p402b.C4607a r2, java.lang.Object r3, int r4) {
        /*
            r1 = this;
            r4 = r4 & 2
            r0 = 0
            if (r4 == 0) goto L_0x0006
            r3 = r0
        L_0x0006:
            if (r2 == 0) goto L_0x0018
            r1.<init>()
            r1.f10769e = r2
            u.j r2 = p392u.C4558j.f10772a
            r1.f10770f = r2
            if (r3 == 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r3 = r1
        L_0x0015:
            r1.f10771g = r3
            return
        L_0x0018:
            java.lang.String r2 = "initializer"
            p392u.p401r.p403c.C4638h.m10271a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p392u.C4556h.<init>(u.r.b.a, java.lang.Object, int):void");
    }

    public T getValue() {
        T t;
        T t2 = this.f10770f;
        if (t2 != C4558j.f10772a) {
            return t2;
        }
        synchronized (this.f10771g) {
            t = this.f10770f;
            if (t == C4558j.f10772a) {
                C4607a<? extends T> aVar = this.f10769e;
                if (aVar != null) {
                    t = aVar.mo3123c();
                    this.f10770f = t;
                    this.f10769e = null;
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            }
        }
        return t;
    }

    public String toString() {
        return this.f10770f != C4558j.f10772a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
