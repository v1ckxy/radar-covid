package p213q.p217b.p317d.p322h.p323e.p326k;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: q.b.d.h.e.k.o0 */
public class C3965o0 implements ThreadFactory {

    /* renamed from: e */
    public final /* synthetic */ String f9682e;

    /* renamed from: f */
    public final /* synthetic */ AtomicLong f9683f;

    /* renamed from: q.b.d.h.e.k.o0$a */
    public class C3966a extends C3936d {

        /* renamed from: e */
        public final /* synthetic */ Runnable f9684e;

        public C3966a(C3965o0 o0Var, Runnable runnable) {
            this.f9684e = runnable;
        }

        /* renamed from: a */
        public void mo10126a() {
            this.f9684e.run();
        }
    }

    public C3965o0(String str, AtomicLong atomicLong) {
        this.f9682e = str;
        this.f9683f = atomicLong;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new C3966a(this, runnable));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9682e);
        sb.append(this.f9683f.getAndIncrement());
        newThread.setName(sb.toString());
        return newThread;
    }
}
