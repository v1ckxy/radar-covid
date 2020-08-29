package p213q.p217b.p218a.p231b.p259h.p261b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q.b.a.b.h.b.u6 */
public final class C3131u6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f7900e;

    /* renamed from: f */
    public final /* synthetic */ String f7901f;

    /* renamed from: g */
    public final /* synthetic */ String f7902g;

    /* renamed from: h */
    public final /* synthetic */ String f7903h;

    /* renamed from: i */
    public final /* synthetic */ C3018k6 f7904i;

    public C3131u6(C3018k6 k6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f7904i = k6Var;
        this.f7900e = atomicReference;
        this.f7901f = str;
        this.f7902g = str2;
        this.f7903h = str3;
    }

    public final void run() {
        C3121t7 t = this.f7904i.f7133a.mo8477t();
        AtomicReference atomicReference = this.f7900e;
        String str = this.f7901f;
        String str2 = this.f7902g;
        String str3 = this.f7903h;
        t.mo8279c();
        t.mo8373v();
        C3020k8 k8Var = new C3020k8(t, atomicReference, str, str2, str3, t.mo8725a(false));
        t.mo8726a((Runnable) k8Var);
    }
}
