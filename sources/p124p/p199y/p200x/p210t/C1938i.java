package p124p.p199y.p200x.p210t;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: p.y.x.t.i */
public class C1938i implements Executor {

    /* renamed from: e */
    public final ArrayDeque<C1939a> f5573e = new ArrayDeque<>();

    /* renamed from: f */
    public final Executor f5574f;

    /* renamed from: g */
    public final Object f5575g = new Object();

    /* renamed from: h */
    public volatile Runnable f5576h;

    /* renamed from: p.y.x.t.i$a */
    public static class C1939a implements Runnable {

        /* renamed from: e */
        public final C1938i f5577e;

        /* renamed from: f */
        public final Runnable f5578f;

        public C1939a(C1938i iVar, Runnable runnable) {
            this.f5577e = iVar;
            this.f5578f = runnable;
        }

        public void run() {
            try {
                this.f5578f.run();
            } finally {
                this.f5577e.mo6929b();
            }
        }
    }

    public C1938i(Executor executor) {
        this.f5574f = executor;
    }

    /* renamed from: a */
    public boolean mo6928a() {
        boolean z;
        synchronized (this.f5575g) {
            z = !this.f5573e.isEmpty();
        }
        return z;
    }

    /* renamed from: b */
    public void mo6929b() {
        synchronized (this.f5575g) {
            Runnable runnable = (Runnable) this.f5573e.poll();
            this.f5576h = runnable;
            if (runnable != null) {
                this.f5574f.execute(this.f5576h);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f5575g) {
            this.f5573e.add(new C1939a(this, runnable));
            if (this.f5576h == null) {
                mo6929b();
            }
        }
    }
}
