package p213q.p217b.p218a.p231b.p259h.p261b;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
import p213q.p217b.p218a.p231b.p251g.p256e.C2672sb;

/* renamed from: q.b.a.b.h.b.r6 */
public final class C3098r6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ long f7826e;

    /* renamed from: f */
    public final /* synthetic */ C3018k6 f7827f;

    public C3098r6(C3018k6 k6Var, long j) {
        this.f7827f = k6Var;
        this.f7826e = j;
    }

    public final void run() {
        C3018k6 k6Var = this.f7827f;
        long j = this.f7826e;
        k6Var.mo8279c();
        k6Var.mo8277a();
        k6Var.mo8373v();
        k6Var.mo8285i().f7160m.mo8432a("Resetting analytics data (FE)");
        C3166x8 t = k6Var.mo8302t();
        t.mo8279c();
        C2949e9 e9Var = t.f7969e;
        e9Var.f7290c.mo8459b();
        e9Var.f7288a = 0;
        e9Var.f7289b = 0;
        boolean b = k6Var.f7133a.mo8464b();
        C3063o4 l = k6Var.mo8288l();
        l.f7627j.mo8709a(j);
        if (!TextUtils.isEmpty(l.mo8288l().f7643z.mo8749a())) {
            l.f7643z.mo8750a(null);
        }
        if (C2672sb.m6380b() && l.f7133a.f7338g.mo8574a(C3069p.f7757w0)) {
            l.f7638u.mo8709a(0);
        }
        if (!l.f7133a.f7338g.mo8585p()) {
            l.mo8663a(!b);
        }
        l.f7617A.mo8750a(null);
        l.f7618B.mo8709a(0);
        l.f7619C.mo8688a(null);
        C3121t7 q = k6Var.mo8299q();
        q.mo8279c();
        q.mo8277a();
        q.mo8373v();
        C3189z9 a = q.mo8725a(false);
        q.mo8721B();
        q.mo8301s().mo8819y();
        q.mo8726a((Runnable) new C3165x7(q, a));
        if (C2672sb.m6380b() && k6Var.f7133a.f7338g.mo8574a(C3069p.f7757w0)) {
            k6Var.mo8302t().f7968d.mo8488a();
        }
        k6Var.f7491i = !b;
        C3121t7 q2 = this.f7827f.mo8299q();
        AtomicReference atomicReference = new AtomicReference();
        q2.mo8279c();
        q2.mo8373v();
        q2.mo8726a((Runnable) new C3187z7(q2, atomicReference, q2.mo8725a(false)));
    }
}
