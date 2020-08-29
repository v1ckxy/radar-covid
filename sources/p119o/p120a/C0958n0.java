package p119o.p120a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p119o.p120a.p121a.C0894b;
import p119o.p120a.p121a.C0903j;
import p119o.p120a.p121a.C0912q;
import p119o.p120a.p121a.C0913r;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p395p.C4583f;

/* renamed from: o.a.n0 */
public abstract class C0958n0 extends C0963o0 {

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater f2574i;

    /* renamed from: j */
    public static final AtomicReferenceFieldUpdater f2575j;
    public volatile Object _delayed = null;
    public volatile int _isCompleted = 0;
    public volatile Object _queue = null;

    /* renamed from: o.a.n0$a */
    public static abstract class C0959a implements Runnable, Comparable<C0959a>, C0949k0, C0913r {

        /* renamed from: e */
        public Object f2576e;

        /* renamed from: f */
        public int f2577f;

        /* renamed from: g */
        public long f2578g;

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0044, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0009, code lost:
            return r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x003c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized int mo4304a(long r8, p119o.p120a.C0958n0.C0960b r10, p119o.p120a.C0958n0 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7.f2576e     // Catch:{ all -> 0x0049 }
                o.a.a.o r1 = p119o.p120a.C0970q0.f2586a     // Catch:{ all -> 0x0049 }
                if (r0 != r1) goto L_0x000a
                r8 = 2
            L_0x0008:
                monitor-exit(r7)
                return r8
            L_0x000a:
                monitor-enter(r10)     // Catch:{ all -> 0x0049 }
                o.a.a.r r0 = r10.mo4194a()     // Catch:{ all -> 0x0046 }
                o.a.n0$a r0 = (p119o.p120a.C0958n0.C0959a) r0     // Catch:{ all -> 0x0046 }
                int r11 = r11._isCompleted     // Catch:{ all -> 0x0046 }
                if (r11 == 0) goto L_0x0019
                r8 = 1
                monitor-exit(r10)     // Catch:{ all -> 0x0049 }
                monitor-exit(r7)
                return r8
            L_0x0019:
                r1 = 0
                if (r0 != 0) goto L_0x0020
            L_0x001d:
                r10.f2579b = r8     // Catch:{ all -> 0x0046 }
                goto L_0x0033
            L_0x0020:
                long r3 = r0.f2578g     // Catch:{ all -> 0x0046 }
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L_0x0029
                goto L_0x002a
            L_0x0029:
                r8 = r3
            L_0x002a:
                long r3 = r10.f2579b     // Catch:{ all -> 0x0046 }
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x0033
                goto L_0x001d
            L_0x0033:
                long r8 = r7.f2578g     // Catch:{ all -> 0x0046 }
                long r3 = r10.f2579b     // Catch:{ all -> 0x0046 }
                long r8 = r8 - r3
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 >= 0) goto L_0x0040
                long r8 = r10.f2579b     // Catch:{ all -> 0x0046 }
                r7.f2578g = r8     // Catch:{ all -> 0x0046 }
            L_0x0040:
                r10.mo4197a(r7)     // Catch:{ all -> 0x0046 }
                monitor-exit(r10)     // Catch:{ all -> 0x0049 }
                r8 = 0
                goto L_0x0008
            L_0x0046:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x0049 }
                throw r8     // Catch:{ all -> 0x0049 }
            L_0x0049:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C0958n0.C0959a.mo4304a(long, o.a.n0$b, o.a.n0):int");
        }

        /* renamed from: a */
        public int compareTo(C0959a aVar) {
            int i = ((this.f2578g - aVar.f2578g) > 0 ? 1 : ((this.f2578g - aVar.f2578g) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* renamed from: a */
        public void mo4202a(int i) {
            this.f2577f = i;
        }

        /* renamed from: a */
        public final boolean mo4306a(long j) {
            return j - this.f2578g >= 0;
        }

        /* renamed from: f */
        public final synchronized void mo4238f() {
            Object obj = this.f2576e;
            if (obj != C0970q0.f2586a) {
                if (!(obj instanceof C0960b)) {
                    obj = null;
                }
                C0960b bVar = (C0960b) obj;
                if (bVar != null) {
                    bVar.mo4200b(this);
                }
                this.f2576e = C0970q0.f2586a;
            }
        }

        /* renamed from: g */
        public int mo4204g() {
            return this.f2577f;
        }

        /* renamed from: h */
        public C0912q<?> mo4205h() {
            Object obj = this.f2576e;
            if (!(obj instanceof C0912q)) {
                obj = null;
            }
            return (C0912q) obj;
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("Delayed[nanos=");
            a.append(this.f2578g);
            a.append(']');
            return a.toString();
        }

        /* renamed from: a */
        public void mo4203a(C0912q<?> qVar) {
            if (this.f2576e != C0970q0.f2586a) {
                this.f2576e = qVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: o.a.n0$b */
    public static final class C0960b extends C0912q<C0959a> {

        /* renamed from: b */
        public long f2579b;

        public C0960b(long j) {
            this.f2579b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C0958n0> cls2 = C0958n0.class;
        f2574i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f2575j = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: a */
    public final void mo4300a(Runnable runnable) {
        if (mo4302b(runnable)) {
            Thread s = mo4231s();
            if (Thread.currentThread() != s) {
                LockSupport.unpark(s);
                return;
            }
            return;
        }
        C0928e0.f2529l.mo4300a(runnable);
    }

    /* renamed from: a */
    public final void mo4301a(C4583f fVar, Runnable runnable) {
        mo4300a(runnable);
    }

    /* renamed from: b */
    public final boolean mo4302b(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (f2574i.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C0903j) {
                C0903j jVar = (C0903j) obj;
                int a = jVar.mo4183a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    f2574i.compareAndSet(this, obj, jVar.mo4186c());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == C0970q0.f2587b) {
                return false;
            } else {
                C0903j jVar2 = new C0903j(8, true);
                jVar2.mo4183a((Runnable) obj);
                jVar2.mo4183a(runnable);
                if (f2574i.compareAndSet(this, obj, jVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9, types: [o.a.a.r] */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ab, code lost:
        if (((p119o.p120a.p121a.C0903j) r0).mo4185b() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00cc, code lost:
        if (r0 == p119o.p120a.C0970q0.f2587b) goto L_0x00ce;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo4298o() {
        /*
            r10 = this;
            boolean r0 = r10.mo4299r()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r10._delayed
            o.a.n0$b r0 = (p119o.p120a.C0958n0.C0960b) r0
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0048
            int r6 = r0._size
            if (r6 != 0) goto L_0x0018
            r6 = r3
            goto L_0x0019
        L_0x0018:
            r6 = r5
        L_0x0019:
            if (r6 != 0) goto L_0x0048
            long r6 = java.lang.System.nanoTime()
        L_0x001f:
            monitor-enter(r0)
            o.a.a.r r8 = r0.mo4194a()     // Catch:{ all -> 0x0045 }
            if (r8 == 0) goto L_0x003e
            o.a.n0$a r8 = (p119o.p120a.C0958n0.C0959a) r8     // Catch:{ all -> 0x0045 }
            boolean r9 = r8.mo4306a(r6)     // Catch:{ all -> 0x0045 }
            if (r9 == 0) goto L_0x0033
            boolean r8 = r10.mo4302b(r8)     // Catch:{ all -> 0x0045 }
            goto L_0x0034
        L_0x0033:
            r8 = r5
        L_0x0034:
            if (r8 == 0) goto L_0x003b
            o.a.a.r r8 = r0.mo4195a(r5)     // Catch:{ all -> 0x0045 }
            goto L_0x003c
        L_0x003b:
            r8 = r4
        L_0x003c:
            monitor-exit(r0)
            goto L_0x0040
        L_0x003e:
            monitor-exit(r0)
            r8 = r4
        L_0x0040:
            o.a.n0$a r8 = (p119o.p120a.C0958n0.C0959a) r8
            if (r8 == 0) goto L_0x0048
            goto L_0x001f
        L_0x0045:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0048:
            java.lang.Object r0 = r10._queue
            if (r0 != 0) goto L_0x004d
            goto L_0x007a
        L_0x004d:
            boolean r6 = r0 instanceof p119o.p120a.p121a.C0903j
            if (r6 == 0) goto L_0x006a
            r6 = r0
            o.a.a.j r6 = (p119o.p120a.p121a.C0903j) r6
            java.lang.Object r7 = r6.mo4187d()
            o.a.a.o r8 = p119o.p120a.p121a.C0903j.f2494g
            if (r7 == r8) goto L_0x0060
            r4 = r7
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            goto L_0x007a
        L_0x0060:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f2574i
            o.a.a.j r6 = r6.mo4186c()
            r7.compareAndSet(r10, r0, r6)
            goto L_0x0048
        L_0x006a:
            o.a.a.o r6 = p119o.p120a.C0970q0.f2587b
            if (r0 != r6) goto L_0x006f
            goto L_0x007a
        L_0x006f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f2574i
            boolean r6 = r6.compareAndSet(r10, r0, r4)
            if (r6 == 0) goto L_0x0048
            r4 = r0
            java.lang.Runnable r4 = (java.lang.Runnable) r4
        L_0x007a:
            if (r4 == 0) goto L_0x0080
            r4.run()
            return r1
        L_0x0080:
            o.a.a.b<o.a.i0<?>> r0 = r10.f2572h
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L_0x0096
            int r4 = r0.f2480b
            int r0 = r0.f2481c
            if (r4 != r0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r3 = r5
        L_0x0091:
            if (r3 == 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r3 = r1
            goto L_0x0097
        L_0x0096:
            r3 = r6
        L_0x0097:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x009c
            goto L_0x00cf
        L_0x009c:
            java.lang.Object r0 = r10._queue
            if (r0 != 0) goto L_0x00a1
            goto L_0x00ae
        L_0x00a1:
            boolean r3 = r0 instanceof p119o.p120a.p121a.C0903j
            if (r3 == 0) goto L_0x00ca
            o.a.a.j r0 = (p119o.p120a.p121a.C0903j) r0
            boolean r0 = r0.mo4185b()
            if (r0 != 0) goto L_0x00ae
            goto L_0x00cf
        L_0x00ae:
            java.lang.Object r0 = r10._delayed
            o.a.n0$b r0 = (p119o.p120a.C0958n0.C0960b) r0
            if (r0 == 0) goto L_0x00ce
            o.a.a.r r0 = r0.mo4198b()
            o.a.n0$a r0 = (p119o.p120a.C0958n0.C0959a) r0
            if (r0 == 0) goto L_0x00ce
            long r3 = r0.f2578g
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c8
            goto L_0x00cf
        L_0x00c8:
            r1 = r3
            goto L_0x00cf
        L_0x00ca:
            o.a.a.o r3 = p119o.p120a.C0970q0.f2587b
            if (r0 != r3) goto L_0x00cf
        L_0x00ce:
            r1 = r6
        L_0x00cf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C0958n0.mo4298o():long");
    }

    /* renamed from: t */
    public boolean mo4303t() {
        C0894b<C0943i0<?>> bVar = this.f2572h;
        boolean z = true;
        if (!(bVar == null || bVar.f2480b == bVar.f2481c)) {
            return false;
        }
        C0960b bVar2 = (C0960b) this._delayed;
        if (bVar2 != null) {
            if (!(bVar2._size == 0)) {
                return false;
            }
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C0903j) {
                z = ((C0903j) obj).mo4185b();
            } else if (obj != C0970q0.f2587b) {
                z = false;
            }
        }
        return z;
    }
}
