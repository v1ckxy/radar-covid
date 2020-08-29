package p213q.p217b.p218a.p219a.p222f;

import java.util.concurrent.Executor;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.a.f.h */
public class C2016h implements Executor {

    /* renamed from: e */
    public final Executor f5783e;

    /* renamed from: q.b.a.a.f.h$a */
    public static class C2017a implements Runnable {

        /* renamed from: e */
        public final Runnable f5784e;

        public C2017a(Runnable runnable) {
            this.f5784e = runnable;
        }

        public void run() {
            try {
                this.f5784e.run();
            } catch (Exception e) {
                C1061o.m2500a("Executor", "Background execution failure.", (Throwable) e);
            }
        }
    }

    public C2016h(Executor executor) {
        this.f5783e = executor;
    }

    public void execute(Runnable runnable) {
        this.f5783e.execute(new C2017a(runnable));
    }
}
