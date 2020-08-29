package p213q.p217b.p218a.p231b.p259h.p261b;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.e5 */
public final class C2945e5<V> extends FutureTask<V> implements Comparable<C2945e5<V>> {

    /* renamed from: e */
    public final long f7277e;

    /* renamed from: f */
    public final boolean f7278f;

    /* renamed from: g */
    public final String f7279g;

    /* renamed from: h */
    public final /* synthetic */ C3184z4 f7280h;

    public C2945e5(C3184z4 z4Var, Runnable runnable, String str) {
        this.f7280h = z4Var;
        super(runnable, null);
        C1061o.m2524b(str);
        long andIncrement = C3184z4.f7999l.getAndIncrement();
        this.f7277e = andIncrement;
        this.f7279g = str;
        this.f7278f = false;
        if (andIncrement == RecyclerView.FOREVER_NS) {
            z4Var.mo8285i().f7153f.mo8432a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C2945e5 e5Var = (C2945e5) obj;
        boolean z = this.f7278f;
        if (z != e5Var.f7278f) {
            return z ? -1 : 1;
        }
        long j = this.f7277e;
        long j2 = e5Var.f7277e;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f7280h.mo8285i().f7154g.mo8433a("Two tasks share the same index. index", Long.valueOf(this.f7277e));
        return 0;
    }

    public final void setException(Throwable th) {
        this.f7280h.mo8285i().f7153f.mo8433a(this.f7279g, th);
        super.setException(th);
    }

    public C2945e5(C3184z4 z4Var, Callable<V> callable, boolean z, String str) {
        this.f7280h = z4Var;
        super(callable);
        C1061o.m2524b(str);
        long andIncrement = C3184z4.f7999l.getAndIncrement();
        this.f7277e = andIncrement;
        this.f7279g = str;
        this.f7278f = z;
        if (andIncrement == RecyclerView.FOREVER_NS) {
            z4Var.mo8285i().f7153f.mo8432a("Tasks index overflow");
        }
    }
}
