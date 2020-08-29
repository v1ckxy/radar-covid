package p119o.p120a;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: o.a.e0 */
public final class C0928e0 extends C0958n0 implements Runnable {
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    /* renamed from: k */
    public static final long f2528k;

    /* renamed from: l */
    public static final C0928e0 f2529l;

    static {
        Long l;
        C0928e0 e0Var = new C0928e0();
        f2529l = e0Var;
        e0Var.mo4296c(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = Long.valueOf(1000);
        }
        f2528k = timeUnit.toNanos(l.longValue());
    }

    public void run() {
        C0968p1 p1Var = C0968p1.f2584b;
        C0968p1.f2583a.set(this);
        try {
            if (mo4235x()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long o = mo4298o();
                    if (o == RecyclerView.FOREVER_NS) {
                        long nanoTime = System.nanoTime();
                        if (j == RecyclerView.FOREVER_NS) {
                            j = f2528k + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            mo4232u();
                            if (!mo4303t()) {
                                mo4231s();
                            }
                            return;
                        } else if (o > j2) {
                            o = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (o > 0) {
                        if (mo4234w()) {
                            _thread = null;
                            mo4232u();
                            if (!mo4303t()) {
                                mo4231s();
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, o);
                    }
                }
            }
        } finally {
            _thread = null;
            mo4232u();
            if (!mo4303t()) {
                mo4231s();
            }
        }
    }

    /* renamed from: s */
    public Thread mo4231s() {
        Thread thread = _thread;
        return thread != null ? thread : mo4233v();
    }

    /* renamed from: u */
    public final synchronized void mo4232u() {
        if (mo4234w()) {
            debugStatus = 3;
            this._queue = null;
            this._delayed = null;
            notifyAll();
        }
    }

    /* renamed from: v */
    public final synchronized Thread mo4233v() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: w */
    public final boolean mo4234w() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: x */
    public final synchronized boolean mo4235x() {
        if (mo4234w()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }
}
