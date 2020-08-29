package p119o.p120a;

import java.util.concurrent.locks.LockSupport;
import p392u.p395p.C4583f;
import p392u.p401r.p403c.C4638h;

/* renamed from: o.a.f */
public final class C0930f<T> extends C0924d<T> {

    /* renamed from: h */
    public final Thread f2531h;

    /* renamed from: i */
    public final C0955m0 f2532i;

    public C0930f(C4583f fVar, Thread thread, C0955m0 m0Var) {
        super(fVar, true);
        this.f2531h = thread;
        this.f2532i = m0Var;
    }

    /* renamed from: b */
    public void mo4190b(Object obj) {
        if (!C4638h.m10272a((Object) Thread.currentThread(), (Object) this.f2531h)) {
            LockSupport.unpark(this.f2531h);
        }
    }

    /* renamed from: j */
    public boolean mo4192j() {
        return true;
    }
}
