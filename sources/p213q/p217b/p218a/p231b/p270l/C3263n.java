package p213q.p217b.p218a.p231b.p270l;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: q.b.a.b.l.n */
public final class C3263n implements C3261l {

    /* renamed from: a */
    public final Object f8135a = new Object();

    /* renamed from: b */
    public final int f8136b;

    /* renamed from: c */
    public final C3250f0<Void> f8137c;
    @GuardedBy("mLock")

    /* renamed from: d */
    public int f8138d;
    @GuardedBy("mLock")

    /* renamed from: e */
    public int f8139e;
    @GuardedBy("mLock")

    /* renamed from: f */
    public int f8140f;
    @GuardedBy("mLock")

    /* renamed from: g */
    public Exception f8141g;
    @GuardedBy("mLock")

    /* renamed from: h */
    public boolean f8142h;

    public C3263n(int i, C3250f0<Void> f0Var) {
        this.f8136b = i;
        this.f8137c = f0Var;
    }

    /* renamed from: a */
    public final void mo8915a() {
        synchronized (this.f8135a) {
            this.f8140f++;
            this.f8142h = true;
            mo8944b();
        }
    }

    /* renamed from: a */
    public final void mo4211a(Exception exc) {
        synchronized (this.f8135a) {
            this.f8139e++;
            this.f8141g = exc;
            mo8944b();
        }
    }

    /* renamed from: a */
    public final void mo4216a(Object obj) {
        synchronized (this.f8135a) {
            this.f8138d++;
            mo8944b();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final void mo8944b() {
        if (this.f8138d + this.f8139e + this.f8140f == this.f8136b) {
            if (this.f8141g != null) {
                C3250f0<Void> f0Var = this.f8137c;
                int i = this.f8139e;
                int i2 = this.f8136b;
                StringBuilder sb = new StringBuilder(54);
                sb.append(i);
                sb.append(" out of ");
                sb.append(i2);
                sb.append(" underlying tasks failed");
                f0Var.mo8929a((Exception) new ExecutionException(sb.toString(), this.f8141g));
            } else if (this.f8142h) {
                this.f8137c.mo8937e();
            } else {
                this.f8137c.mo8930a(null);
            }
        }
    }
}
