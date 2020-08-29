package p213q.p217b.p218a.p231b.p259h.p261b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q.b.a.b.h.b.x6 */
public final class C3164x6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f7959e;

    /* renamed from: f */
    public final /* synthetic */ String f7960f;

    /* renamed from: g */
    public final /* synthetic */ String f7961g;

    /* renamed from: h */
    public final /* synthetic */ String f7962h;

    /* renamed from: i */
    public final /* synthetic */ boolean f7963i;

    /* renamed from: j */
    public final /* synthetic */ C3018k6 f7964j;

    public C3164x6(C3018k6 k6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f7964j = k6Var;
        this.f7959e = atomicReference;
        this.f7960f = str;
        this.f7961g = str2;
        this.f7962h = str3;
        this.f7963i = z;
    }

    public final void run() {
        C3121t7 t = this.f7964j.f7133a.mo8477t();
        AtomicReference atomicReference = this.f7959e;
        String str = this.f7960f;
        String str2 = this.f7961g;
        String str3 = this.f7962h;
        boolean z = this.f7963i;
        t.mo8279c();
        t.mo8373v();
        C3045m8 m8Var = new C3045m8(t, atomicReference, str, str2, str3, z, t.mo8725a(false));
        t.mo8726a((Runnable) m8Var);
    }
}
