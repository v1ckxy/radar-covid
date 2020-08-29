package p410v;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p392u.C4561m;
import p392u.p401r.p403c.C4638h;
import p410v.C4702d0.C4703a;
import p410v.p411m0.C4737b;
import p410v.p411m0.p413d.C4768m;
import p484y.C5264d;
import p484y.C5282h0;
import p484y.C5338u;
import p484y.C5338u.C5339a;

/* renamed from: v.q */
public final class C4859q {

    /* renamed from: a */
    public int f11589a = 64;

    /* renamed from: b */
    public int f11590b = 5;

    /* renamed from: c */
    public ExecutorService f11591c;

    /* renamed from: d */
    public final ArrayDeque<C4703a> f11592d = new ArrayDeque<>();

    /* renamed from: e */
    public final ArrayDeque<C4703a> f11593e = new ArrayDeque<>();

    /* renamed from: f */
    public final ArrayDeque<C4702d0> f11594f = new ArrayDeque<>();

    /* renamed from: a */
    public final synchronized ExecutorService mo11346a() {
        ExecutorService executorService;
        if (this.f11591c == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C4737b.m10460a("OkHttp Dispatcher", false));
            this.f11591c = threadPoolExecutor;
        }
        executorService = this.f11591c;
        if (executorService == null) {
            C4638h.m10269a();
            throw null;
        }
        return executorService;
    }

    /* renamed from: a */
    public final <T> void mo11347a(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        boolean b = mo11351b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r0 = r3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11348a(p410v.C4702d0.C4703a r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x005c
            monitor-enter(r5)
            java.util.ArrayDeque<v.d0$a> r1 = r5.f11592d     // Catch:{ all -> 0x0059 }
            r1.add(r6)     // Catch:{ all -> 0x0059 }
            v.d0 r1 = r6.f11013g     // Catch:{ all -> 0x0059 }
            boolean r1 = r1.f11010i     // Catch:{ all -> 0x0059 }
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = r6.mo11007a()     // Catch:{ all -> 0x0059 }
            java.util.ArrayDeque<v.d0$a> r2 = r5.f11593e     // Catch:{ all -> 0x0059 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0059 }
        L_0x0019:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0059 }
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0059 }
            v.d0$a r3 = (p410v.C4702d0.C4703a) r3     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = r3.mo11007a()     // Catch:{ all -> 0x0059 }
            boolean r4 = p392u.p401r.p403c.C4638h.m10272a(r4, r1)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0019
        L_0x002f:
            r0 = r3
            goto L_0x004e
        L_0x0031:
            java.util.ArrayDeque<v.d0$a> r2 = r5.f11592d     // Catch:{ all -> 0x0059 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0059 }
        L_0x0037:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0059 }
            if (r3 == 0) goto L_0x004e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0059 }
            v.d0$a r3 = (p410v.C4702d0.C4703a) r3     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = r3.mo11007a()     // Catch:{ all -> 0x0059 }
            boolean r4 = p392u.p401r.p403c.C4638h.m10272a(r4, r1)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0037
            goto L_0x002f
        L_0x004e:
            if (r0 == 0) goto L_0x0054
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f11011e     // Catch:{ all -> 0x0059 }
            r6.f11011e = r0     // Catch:{ all -> 0x0059 }
        L_0x0054:
            monitor-exit(r5)
            r5.mo11351b()
            return
        L_0x0059:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x005c:
            java.lang.String r6 = "call"
            p392u.p401r.p403c.C4638h.m10271a(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.C4859q.mo11348a(v.d0$a):void");
    }

    /* renamed from: b */
    public final void mo11350b(C4703a aVar) {
        if (aVar != null) {
            aVar.f11011e.decrementAndGet();
            mo11347a(this.f11593e, aVar);
            return;
        }
        C4638h.m10271a("call");
        throw null;
    }

    /* renamed from: c */
    public final synchronized int mo11352c() {
        return this.f11593e.size() + this.f11594f.size();
    }

    /* renamed from: b */
    public final boolean mo11351b() {
        int i;
        boolean z;
        C4703a aVar;
        boolean z2 = !Thread.holdsLock(this);
        if (!C4561m.f10774a || z2) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator it = this.f11592d.iterator();
                C4638h.m10270a((Object) it, "readyAsyncCalls.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C4703a aVar2 = (C4703a) it.next();
                    if (this.f11593e.size() >= this.f11589a) {
                        break;
                    } else if (aVar2.f11011e.get() < this.f11590b) {
                        it.remove();
                        aVar2.f11011e.incrementAndGet();
                        C4638h.m10270a((Object) aVar2, "asyncCall");
                        arrayList.add(aVar2);
                        this.f11593e.add(aVar2);
                    }
                }
                i = 0;
                z = mo11352c() > 0;
            }
            int size = arrayList.size();
            while (i < size) {
                aVar = (C4703a) arrayList.get(i);
                ExecutorService a = mo11346a();
                if (a != null) {
                    boolean z3 = !Thread.holdsLock(aVar.f11013g.f11008g.f10917e);
                    if (!C4561m.f10774a || z3) {
                        try {
                            a.execute(aVar);
                        } catch (RejectedExecutionException e) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e);
                            C4768m mVar = aVar.f11013g.f11006e;
                            if (mVar != null) {
                                mVar.mo11148a((IOException) interruptedIOException);
                                C5339a aVar3 = (C5339a) aVar.f11012f;
                                if (aVar3 != null) {
                                    aVar3.f12634a.mo11952a((C5264d<T>) C5338u.this, (Throwable) interruptedIOException);
                                } else {
                                    throw null;
                                }
                            } else {
                                C4638h.m10273b("transmitter");
                                throw null;
                            }
                        } catch (Throwable th) {
                            C5282h0.m11763a(th);
                            th.printStackTrace();
                        }
                        i++;
                    } else {
                        throw new AssertionError("Assertion failed");
                    }
                } else {
                    C4638h.m10271a("executorService");
                    throw null;
                }
            }
            return z;
        }
        throw new AssertionError("Assertion failed");
        aVar.f11013g.f11008g.f10917e.mo11350b(aVar);
        i++;
    }

    /* renamed from: a */
    public final synchronized void mo11349a(C4702d0 d0Var) {
        String str = "call";
        if (d0Var != null) {
            this.f11594f.add(d0Var);
        } else {
            C4638h.m10271a(str);
            throw null;
        }
    }
}
