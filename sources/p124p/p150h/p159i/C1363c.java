package p124p.p150h.p159i;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: p.h.i.c */
public class C1363c {

    /* renamed from: a */
    public final Object f4091a = new Object();

    /* renamed from: b */
    public HandlerThread f4092b;

    /* renamed from: c */
    public Handler f4093c;

    /* renamed from: d */
    public int f4094d;

    /* renamed from: e */
    public Callback f4095e = new C1364a();

    /* renamed from: f */
    public final int f4096f;

    /* renamed from: g */
    public final int f4097g;

    /* renamed from: h */
    public final String f4098h;

    /* renamed from: p.h.i.c$a */
    public class C1364a implements Callback {
        public C1364a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C1363c.this.mo5831a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C1363c.this.mo5832a((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: p.h.i.c$b */
    public class C1365b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ AtomicReference f4100e;

        /* renamed from: f */
        public final /* synthetic */ Callable f4101f;

        /* renamed from: g */
        public final /* synthetic */ ReentrantLock f4102g;

        /* renamed from: h */
        public final /* synthetic */ AtomicBoolean f4103h;

        /* renamed from: i */
        public final /* synthetic */ Condition f4104i;

        public C1365b(C1363c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f4100e = atomicReference;
            this.f4101f = callable;
            this.f4102g = reentrantLock;
            this.f4103h = atomicBoolean;
            this.f4104i = condition;
        }

        public void run() {
            try {
                this.f4100e.set(this.f4101f.call());
            } catch (Exception unused) {
            }
            this.f4102g.lock();
            try {
                this.f4103h.set(false);
                this.f4104i.signal();
            } finally {
                this.f4102g.unlock();
            }
        }
    }

    /* renamed from: p.h.i.c$c */
    public interface C1366c<T> {
        /* renamed from: a */
        void mo5827a(T t);
    }

    public C1363c(String str, int i, int i2) {
        this.f4098h = str;
        this.f4097g = i;
        this.f4096f = i2;
        this.f4094d = 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo5830a(java.util.concurrent.Callable<T> r13, int r14) {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            p.h.i.c$b r11 = new p.h.i.c$b
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.mo5833b(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p159i.C1363c.mo5830a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* renamed from: a */
    public void mo5831a() {
        synchronized (this.f4091a) {
            if (!this.f4093c.hasMessages(1)) {
                this.f4092b.quit();
                this.f4092b = null;
                this.f4093c = null;
            }
        }
    }

    /* renamed from: a */
    public void mo5832a(Runnable runnable) {
        runnable.run();
        synchronized (this.f4091a) {
            this.f4093c.removeMessages(0);
            this.f4093c.sendMessageDelayed(this.f4093c.obtainMessage(0), (long) this.f4096f);
        }
    }

    /* renamed from: b */
    public final void mo5833b(Runnable runnable) {
        synchronized (this.f4091a) {
            if (this.f4092b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f4098h, this.f4097g);
                this.f4092b = handlerThread;
                handlerThread.start();
                this.f4093c = new Handler(this.f4092b.getLooper(), this.f4095e);
                this.f4094d++;
            }
            this.f4093c.removeMessages(0);
            this.f4093c.sendMessage(this.f4093c.obtainMessage(1, runnable));
        }
    }
}
