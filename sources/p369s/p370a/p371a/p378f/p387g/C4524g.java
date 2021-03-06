package p369s.p370a.p371a.p378f.p387g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p375c.C4451d;

/* renamed from: s.a.a.f.g.g */
public final class C4524g extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, C4450c {

    /* renamed from: f */
    public static final Object f10721f = new Object();

    /* renamed from: g */
    public static final Object f10722g = new Object();

    /* renamed from: h */
    public static final Object f10723h = new Object();

    /* renamed from: i */
    public static final Object f10724i = new Object();

    /* renamed from: e */
    public final Runnable f10725e;

    public C4524g(Runnable runnable, C4451d dVar) {
        super(3);
        this.f10725e = runnable;
        lazySet(0, dVar);
    }

    /* renamed from: a */
    public void mo10794a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f10724i) {
                if (obj == f10722g) {
                    future.cancel(false);
                    return;
                } else if (obj == f10723h) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public Object call() {
        run();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10714f() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r2 = f10724i
            r3 = 0
            if (r1 == r2) goto L_0x0035
            java.lang.Object r2 = f10722g
            if (r1 == r2) goto L_0x0035
            java.lang.Object r2 = f10723h
            if (r1 != r2) goto L_0x0013
            goto L_0x0035
        L_0x0013:
            r2 = 2
            java.lang.Object r2 = r5.get(r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r2 == r4) goto L_0x0020
            r2 = r0
            goto L_0x0021
        L_0x0020:
            r2 = r3
        L_0x0021:
            if (r2 == 0) goto L_0x0026
            java.lang.Object r4 = f10723h
            goto L_0x0028
        L_0x0026:
            java.lang.Object r4 = f10722g
        L_0x0028:
            boolean r0 = r5.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0035
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r2)
        L_0x0035:
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = f10724i
            if (r0 == r1) goto L_0x004f
            java.lang.Object r1 = f10721f
            if (r0 == r1) goto L_0x004f
            if (r0 != 0) goto L_0x0044
            goto L_0x004f
        L_0x0044:
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0035
            s.a.a.c.d r0 = (p369s.p370a.p371a.p375c.C4451d) r0
            r0.mo10731b(r5)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p369s.p370a.p371a.p378f.p387g.C4524g.mo10714f():void");
    }

    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f10725e.run();
        } catch (Throwable th) {
            lazySet(2, null);
            Object obj3 = get(0);
            if (!(obj3 == f10721f || !compareAndSet(0, obj3, f10724i) || obj3 == null)) {
                ((C4451d) obj3).mo10731b(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f10722g || obj2 == f10723h) {
                    throw th;
                }
            } while (!compareAndSet(1, obj2, f10724i));
            throw th;
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (!(obj4 == f10721f || !compareAndSet(0, obj4, f10724i) || obj4 == null)) {
            ((C4451d) obj4).mo10731b(this);
        }
        do {
            obj = get(1);
            if (obj == f10722g || obj == f10723h) {
                return;
            }
        } while (!compareAndSet(1, obj, f10724i));
    }
}
