package p213q.p217b.p218a.p231b.p239d.p246q.p247i;

import android.os.Process;

/* renamed from: q.b.a.b.d.q.i.b */
public final class C2291b implements Runnable {

    /* renamed from: e */
    public final Runnable f6265e;

    /* renamed from: f */
    public final int f6266f;

    public C2291b(Runnable runnable, int i) {
        this.f6265e = runnable;
        this.f6266f = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f6266f);
        this.f6265e.run();
    }
}
