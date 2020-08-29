package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Handler;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;
import p213q.p217b.p218a.p231b.p251g.p256e.C2354ae;

/* renamed from: q.b.a.b.h.b.g */
public abstract class C2963g {

    /* renamed from: d */
    public static volatile Handler f7313d;

    /* renamed from: a */
    public final C2910b6 f7314a;

    /* renamed from: b */
    public final Runnable f7315b;

    /* renamed from: c */
    public volatile long f7316c;

    public C2963g(C2910b6 b6Var) {
        C1061o.m2524b(b6Var);
        this.f7314a = b6Var;
        this.f7315b = new C2987i(this, b6Var);
    }

    /* renamed from: a */
    public abstract void mo8457a();

    /* renamed from: a */
    public final void mo8458a(long j) {
        mo8459b();
        if (j < 0) {
            return;
        }
        if (((C2284c) this.f7314a.mo8284h()) != null) {
            this.f7316c = System.currentTimeMillis();
            if (!mo8460c().postDelayed(this.f7315b, j)) {
                this.f7314a.mo8285i().f7153f.mo8433a("Failed to schedule delayed post. time", Long.valueOf(j));
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo8459b() {
        this.f7316c = 0;
        mo8460c().removeCallbacks(this.f7315b);
    }

    /* renamed from: c */
    public final Handler mo8460c() {
        Handler handler;
        if (f7313d != null) {
            return f7313d;
        }
        synchronized (C2963g.class) {
            if (f7313d == null) {
                f7313d = new C2354ae(this.f7314a.mo8286j().getMainLooper());
            }
            handler = f7313d;
        }
        return handler;
    }
}
