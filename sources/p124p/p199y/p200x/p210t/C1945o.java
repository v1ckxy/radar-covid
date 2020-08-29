package p124p.p199y.p200x.p210t;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p124p.p199y.C1800l;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.y.x.t.o */
public class C1945o {

    /* renamed from: f */
    public static final String f5588f = C1800l.m4459a("WorkTimer");

    /* renamed from: a */
    public final ThreadFactory f5589a = new C1946a(this);

    /* renamed from: b */
    public final ScheduledExecutorService f5590b = Executors.newSingleThreadScheduledExecutor(this.f5589a);

    /* renamed from: c */
    public final Map<String, C1948c> f5591c = new HashMap();

    /* renamed from: d */
    public final Map<String, C1947b> f5592d = new HashMap();

    /* renamed from: e */
    public final Object f5593e = new Object();

    /* renamed from: p.y.x.t.o$a */
    public class C1946a implements ThreadFactory {

        /* renamed from: e */
        public int f5594e = 0;

        public C1946a(C1945o oVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder a = C1965a.m4756a("WorkManager-WorkTimer-thread-");
            a.append(this.f5594e);
            newThread.setName(a.toString());
            this.f5594e++;
            return newThread;
        }
    }

    /* renamed from: p.y.x.t.o$b */
    public interface C1947b {
        /* renamed from: a */
        void mo6836a(String str);
    }

    /* renamed from: p.y.x.t.o$c */
    public static class C1948c implements Runnable {

        /* renamed from: e */
        public final C1945o f5595e;

        /* renamed from: f */
        public final String f5596f;

        public C1948c(C1945o oVar, String str) {
            this.f5595e = oVar;
            this.f5596f = str;
        }

        public void run() {
            synchronized (this.f5595e.f5593e) {
                if (((C1948c) this.f5595e.f5591c.remove(this.f5596f)) != null) {
                    C1947b bVar = (C1947b) this.f5595e.f5592d.remove(this.f5596f);
                    if (bVar != null) {
                        bVar.mo6836a(this.f5596f);
                    }
                } else {
                    C1800l.m4460a().mo6782a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f5596f}), new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6934a(String str) {
        synchronized (this.f5593e) {
            if (((C1948c) this.f5591c.remove(str)) != null) {
                C1800l.m4460a().mo6782a(f5588f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f5592d.remove(str);
            }
        }
    }

    /* renamed from: a */
    public void mo6935a(String str, long j, C1947b bVar) {
        synchronized (this.f5593e) {
            C1800l.m4460a().mo6782a(f5588f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            mo6934a(str);
            C1948c cVar = new C1948c(this, str);
            this.f5591c.put(str, cVar);
            this.f5592d.put(str, bVar);
            this.f5590b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }
}
