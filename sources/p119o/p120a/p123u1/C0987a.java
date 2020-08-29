package p119o.p120a.p123u1;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import p116io.jsonwebtoken.lang.Objects;
import p119o.p120a.p121a.C0910o;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p401r.p403c.C4638h;
import p392u.p405s.C4650c;
import p392u.p405s.C4650c.C4652b;

/* renamed from: o.a.u1.a */
public final class C0987a implements Executor, Closeable {

    /* renamed from: l */
    public static final AtomicLongFieldUpdater f2601l = AtomicLongFieldUpdater.newUpdater(C0987a.class, "parkedWorkersStack");

    /* renamed from: m */
    public static final AtomicLongFieldUpdater f2602m = AtomicLongFieldUpdater.newUpdater(C0987a.class, "controlState");

    /* renamed from: n */
    public static final AtomicIntegerFieldUpdater f2603n = AtomicIntegerFieldUpdater.newUpdater(C0987a.class, "_isTerminated");

    /* renamed from: o */
    public static final C0910o f2604o = new C0910o("NOT_IN_STACK");
    public volatile int _isTerminated;
    public volatile long controlState;

    /* renamed from: e */
    public final C0992d f2605e;

    /* renamed from: f */
    public final C0992d f2606f;

    /* renamed from: g */
    public final AtomicReferenceArray<C0988a> f2607g;

    /* renamed from: h */
    public final int f2608h;

    /* renamed from: i */
    public final int f2609i;

    /* renamed from: j */
    public final long f2610j;

    /* renamed from: k */
    public final String f2611k;
    public volatile long parkedWorkersStack;

    /* renamed from: o.a.u1.a$a */
    public final class C0988a extends Thread {

        /* renamed from: l */
        public static final AtomicIntegerFieldUpdater f2612l = AtomicIntegerFieldUpdater.newUpdater(C0988a.class, "workerCtl");

        /* renamed from: e */
        public final C1001m f2613e = new C1001m();

        /* renamed from: f */
        public C0989b f2614f = C0989b.DORMANT;

        /* renamed from: g */
        public long f2615g;

        /* renamed from: h */
        public long f2616h;

        /* renamed from: i */
        public int f2617i;
        public volatile int indexInArray;

        /* renamed from: j */
        public boolean f2618j;
        public volatile Object nextParkedWorker = C0987a.f2604o;
        public volatile int workerCtl = 0;

        public C0988a(int i) {
            setDaemon(true);
            C4652b bVar = C4650c.f10837b;
            this.f2617i = C4650c.f10836a.mo10942a();
            mo4347b(i);
        }

        /* renamed from: a */
        public final int mo4341a(int i) {
            int i2 = this.f2617i;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f2617i = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: a */
        public final C0996h mo4342a() {
            C0992d dVar;
            if (mo4341a(2) == 0) {
                C0996h hVar = (C0996h) C0987a.this.f2605e.mo4182c();
                if (hVar != null) {
                    return hVar;
                }
                dVar = C0987a.this.f2606f;
            } else {
                C0996h hVar2 = (C0996h) C0987a.this.f2606f.mo4182c();
                if (hVar2 != null) {
                    return hVar2;
                }
                dVar = C0987a.this.f2605e;
            }
            return (C0996h) dVar.mo4182c();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
            if (r11 != null) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
            if (r11 != null) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
            if (r11 != null) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
            if (r11 != null) goto L_0x0083;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p119o.p120a.p123u1.C0996h mo4343a(boolean r11) {
            /*
                r10 = this;
                o.a.u1.a$b r0 = r10.f2614f
                o.a.u1.a$b r1 = p119o.p120a.p123u1.C0987a.C0989b.CPU_ACQUIRED
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L_0x0009
                goto L_0x0032
            L_0x0009:
                o.a.u1.a r0 = p119o.p120a.p123u1.C0987a.this
            L_0x000b:
                long r6 = r0.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r1 = 42
                long r4 = r4 >> r1
                int r1 = (int) r4
                if (r1 != 0) goto L_0x001b
                r0 = r2
                goto L_0x002c
            L_0x001b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p119o.p120a.p123u1.C0987a.f2602m
                r5 = r0
                boolean r1 = r4.compareAndSet(r5, r6, r8)
                if (r1 == 0) goto L_0x000b
                r0 = r3
            L_0x002c:
                if (r0 == 0) goto L_0x0034
                o.a.u1.a$b r0 = p119o.p120a.p123u1.C0987a.C0989b.CPU_ACQUIRED
                r10.f2614f = r0
            L_0x0032:
                r0 = r3
                goto L_0x0035
            L_0x0034:
                r0 = r2
            L_0x0035:
                if (r0 == 0) goto L_0x006e
                if (r11 == 0) goto L_0x0062
                o.a.u1.a r11 = p119o.p120a.p123u1.C0987a.this
                int r11 = r11.f2608h
                int r11 = r11 * 2
                int r11 = r10.mo4341a(r11)
                if (r11 != 0) goto L_0x0046
                goto L_0x0047
            L_0x0046:
                r3 = r2
            L_0x0047:
                if (r3 == 0) goto L_0x0050
                o.a.u1.h r11 = r10.mo4342a()
                if (r11 == 0) goto L_0x0050
                goto L_0x006d
            L_0x0050:
                o.a.u1.m r11 = r10.f2613e
                o.a.u1.h r11 = r11.mo4362c()
                if (r11 == 0) goto L_0x0059
                goto L_0x006d
            L_0x0059:
                if (r3 != 0) goto L_0x0069
                o.a.u1.h r11 = r10.mo4342a()
                if (r11 == 0) goto L_0x0069
                goto L_0x006d
            L_0x0062:
                o.a.u1.h r11 = r10.mo4342a()
                if (r11 == 0) goto L_0x0069
                goto L_0x006d
            L_0x0069:
                o.a.u1.h r11 = r10.mo4345b(r2)
            L_0x006d:
                return r11
            L_0x006e:
                if (r11 == 0) goto L_0x0079
                o.a.u1.m r11 = r10.f2613e
                o.a.u1.h r11 = r11.mo4362c()
                if (r11 == 0) goto L_0x0079
                goto L_0x0083
            L_0x0079:
                o.a.u1.a r11 = p119o.p120a.p123u1.C0987a.this
                o.a.u1.d r11 = r11.f2606f
                java.lang.Object r11 = r11.mo4182c()
                o.a.u1.h r11 = (p119o.p120a.p123u1.C0996h) r11
            L_0x0083:
                if (r11 == 0) goto L_0x0086
                goto L_0x008a
            L_0x0086:
                o.a.u1.h r11 = r10.mo4345b(r3)
            L_0x008a:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.p123u1.C0987a.C0988a.mo4343a(boolean):o.a.u1.h");
        }

        /* renamed from: a */
        public final boolean mo4344a(C0989b bVar) {
            C0989b bVar2 = this.f2614f;
            boolean z = bVar2 == C0989b.CPU_ACQUIRED;
            if (z) {
                C0987a.f2602m.addAndGet(C0987a.this, 4398046511104L);
            }
            if (bVar2 != bVar) {
                this.f2614f = bVar;
            }
            return z;
        }

        /* JADX INFO: used method not loaded: o.a.u1.m.a(o.a.u1.m, boolean):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
            r4 = r14.mo4358a(r13, true);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p119o.p120a.p123u1.C0996h mo4345b(boolean r17) {
            /*
                r16 = this;
                r0 = r16
                o.a.u1.a r1 = p119o.p120a.p123u1.C0987a.this
                long r1 = r1.controlState
                r3 = 2097151(0x1fffff, double:1.0361303E-317)
                long r1 = r1 & r3
                int r1 = (int) r1
                r2 = 2
                r3 = 0
                if (r1 >= r2) goto L_0x0010
                return r3
            L_0x0010:
                int r2 = r0.mo4341a(r1)
                r7 = 0
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x001a:
                if (r7 >= r1) goto L_0x00a9
                r12 = 1
                int r2 = r2 + r12
                if (r2 <= r1) goto L_0x0021
                r2 = r12
            L_0x0021:
                o.a.u1.a r13 = p119o.p120a.p123u1.C0987a.this
                java.util.concurrent.atomic.AtomicReferenceArray<o.a.u1.a$a> r13 = r13.f2607g
                java.lang.Object r13 = r13.get(r2)
                o.a.u1.a$a r13 = (p119o.p120a.p123u1.C0987a.C0988a) r13
                if (r13 == 0) goto L_0x00a4
                if (r13 == r0) goto L_0x00a4
                o.a.u1.m r14 = r0.f2613e
                o.a.u1.m r13 = r13.f2613e
                if (r17 == 0) goto L_0x0078
                if (r14 == 0) goto L_0x0077
                int r4 = r13.consumerIndex
                int r5 = r13.producerIndex
                java.util.concurrent.atomic.AtomicReferenceArray<o.a.u1.h> r10 = r13.f2652a
            L_0x003d:
                if (r4 == r5) goto L_0x0070
                r11 = r4 & 127(0x7f, float:1.78E-43)
                int r15 = r13.blockingTasksInBuffer
                if (r15 != 0) goto L_0x0046
                goto L_0x0070
            L_0x0046:
                java.lang.Object r15 = r10.get(r11)
                o.a.u1.h r15 = (p119o.p120a.p123u1.C0996h) r15
                if (r15 == 0) goto L_0x006d
                o.a.u1.i r6 = r15.f2641f
                int r6 = r6.mo4354k()
                if (r6 != r12) goto L_0x0058
                r6 = r12
                goto L_0x0059
            L_0x0058:
                r6 = 0
            L_0x0059:
                if (r6 == 0) goto L_0x006d
                boolean r6 = r10.compareAndSet(r11, r15, r3)
                if (r6 == 0) goto L_0x006d
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = p119o.p120a.p123u1.C1001m.f2651e
                r4.decrementAndGet(r13)
                r4 = 0
                r14.mo4360a(r15, r4)
                r4 = -1
                goto L_0x0074
            L_0x006d:
                int r4 = r4 + 1
                goto L_0x003d
            L_0x0070:
                long r4 = r14.mo4358a(r13, r12)
            L_0x0074:
                r10 = r4
                r5 = 0
                goto L_0x008b
            L_0x0077:
                throw r3
            L_0x0078:
                if (r14 == 0) goto L_0x00a3
                o.a.u1.h r4 = r13.mo4363d()
                r5 = 0
                if (r4 == 0) goto L_0x0087
                r14.mo4360a(r4, r5)
                r10 = -1
                goto L_0x008b
            L_0x0087:
                long r10 = r14.mo4358a(r13, r5)
            L_0x008b:
                r12 = -1
                int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r4 != 0) goto L_0x0098
                o.a.u1.m r1 = r0.f2613e
                o.a.u1.h r1 = r1.mo4362c()
                return r1
            L_0x0098:
                r12 = 0
                int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r4 <= 0) goto L_0x00a5
                long r8 = java.lang.Math.min(r8, r10)
                goto L_0x00a5
            L_0x00a3:
                throw r3
            L_0x00a4:
                r5 = 0
            L_0x00a5:
                int r7 = r7 + 1
                goto L_0x001a
            L_0x00a9:
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r1 == 0) goto L_0x00b5
                goto L_0x00b6
            L_0x00b5:
                r8 = r12
            L_0x00b6:
                r0.f2616h = r8
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.p123u1.C0987a.C0988a.mo4345b(boolean):o.a.u1.h");
        }

        /* renamed from: b */
        public final void mo4347b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0987a.this.f2611k);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public void run() {
            long j;
            long j2;
            int i;
            loop0:
            while (true) {
                boolean z = false;
                while (C0987a.this._isTerminated == 0 && this.f2614f != C0989b.TERMINATED) {
                    C0996h a = mo4343a(this.f2618j);
                    if (a == null) {
                        this.f2618j = false;
                        if (this.f2616h == 0) {
                            if (this.nextParkedWorker != C0987a.f2604o) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (!(this.nextParkedWorker != C0987a.f2604o) || C0987a.this._isTerminated != 0 || this.f2614f == C0989b.TERMINATED) {
                                        break;
                                    }
                                    mo4344a(C0989b.PARKING);
                                    Thread.interrupted();
                                    if (this.f2615g == 0) {
                                        this.f2615g = System.nanoTime() + C0987a.this.f2610j;
                                    }
                                    LockSupport.parkNanos(C0987a.this.f2610j);
                                    if (System.nanoTime() - this.f2615g >= 0) {
                                        this.f2615g = 0;
                                        mo4346b();
                                    }
                                }
                            } else {
                                C0987a aVar = C0987a.this;
                                if (aVar == null) {
                                    throw null;
                                } else if (this.nextParkedWorker == C0987a.f2604o) {
                                    do {
                                        j = aVar.parkedWorkersStack;
                                        int i2 = (int) (2097151 & j);
                                        j2 = (2097152 + j) & -2097152;
                                        i = this.indexInArray;
                                        this.nextParkedWorker = aVar.f2607g.get(i2);
                                    } while (!C0987a.f2601l.compareAndSet(aVar, j, j2 | ((long) i)));
                                }
                            }
                        } else if (!z) {
                            z = true;
                        } else {
                            mo4344a(C0989b.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f2616h);
                            this.f2616h = 0;
                        }
                    } else {
                        this.f2616h = 0;
                        int k = a.f2641f.mo4354k();
                        this.f2615g = 0;
                        if (this.f2614f == C0989b.PARKING) {
                            this.f2614f = C0989b.BLOCKING;
                        }
                        if (k != 0 && mo4344a(C0989b.BLOCKING)) {
                            C0987a.this.mo4337g();
                        }
                        C0987a.this.mo4332a(a);
                        if (k != 0) {
                            C0987a.f2602m.addAndGet(C0987a.this, -2097152);
                            if (this.f2614f != C0989b.TERMINATED) {
                                this.f2614f = C0989b.DORMANT;
                            }
                        }
                    }
                }
            }
            mo4344a(C0989b.TERMINATED);
        }

        /* renamed from: b */
        public final void mo4346b() {
            synchronized (C0987a.this.f2607g) {
                if (C0987a.this._isTerminated == 0) {
                    if (((int) (C0987a.this.controlState & 2097151)) > C0987a.this.f2608h) {
                        if (f2612l.compareAndSet(this, -1, 1)) {
                            int i = this.indexInArray;
                            mo4347b(0);
                            C0987a.this.mo4331a(this, i, 0);
                            int andDecrement = (int) (C0987a.f2602m.getAndDecrement(C0987a.this) & 2097151);
                            if (andDecrement != i) {
                                Object obj = C0987a.this.f2607g.get(andDecrement);
                                if (obj != null) {
                                    C0988a aVar = (C0988a) obj;
                                    C0987a.this.f2607g.set(i, aVar);
                                    aVar.mo4347b(i);
                                    C0987a.this.mo4331a(aVar, andDecrement, i);
                                } else {
                                    C4638h.m10269a();
                                    throw null;
                                }
                            }
                            C0987a.this.f2607g.set(andDecrement, null);
                            this.f2614f = C0989b.TERMINATED;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: o.a.u1.a$b */
    public enum C0989b {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public C0987a(int i, int i2, long j, String str) {
        this.f2608h = i;
        this.f2609i = i2;
        this.f2610j = j;
        this.f2611k = str;
        if (i >= 1) {
            String str2 = "Max pool size ";
            if (this.f2609i >= this.f2608h) {
                if (this.f2609i <= 2097150) {
                    if (this.f2610j > 0) {
                        this.f2605e = new C0992d();
                        this.f2606f = new C0992d();
                        this.parkedWorkersStack = 0;
                        this.f2607g = new AtomicReferenceArray<>(this.f2609i + 1);
                        this.controlState = ((long) this.f2608h) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    StringBuilder a = C1965a.m4756a("Idle worker keep alive time ");
                    a.append(this.f2610j);
                    a.append(" must be positive");
                    throw new IllegalArgumentException(a.toString().toString());
                }
                throw new IllegalArgumentException(C1965a.m4753a(C1965a.m4756a(str2), this.f2609i, " should not exceed maximal supported number of threads 2097150").toString());
            }
            StringBuilder a2 = C1965a.m4756a(str2);
            a2.append(this.f2609i);
            a2.append(" should be greater than or equals to core pool size ");
            a2.append(this.f2608h);
            throw new IllegalArgumentException(a2.toString().toString());
        }
        throw new IllegalArgumentException(C1965a.m4753a(C1965a.m4756a("Core pool size "), this.f2608h, " should be at least 1").toString());
    }

    /* renamed from: a */
    public static /* synthetic */ void m2264a(C0987a aVar, Runnable runnable, C0997i iVar, boolean z, int i) {
        if ((i & 2) != 0) {
            iVar = C0995g.f2639e;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.mo4330a(runnable, iVar, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0009, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo4327a() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<o.a.u1.a$a> r0 = r10.f2607g
            monitor-enter(r0)
            int r1 = r10._isTerminated     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x000a
            r1 = -1
        L_0x0008:
            monitor-exit(r0)
            return r1
        L_0x000a:
            long r1 = r10.controlState     // Catch:{ all -> 0x0077 }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x0077 }
            r6 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r6
            r6 = 21
            long r1 = r1 >> r6
            int r1 = (int) r1     // Catch:{ all -> 0x0077 }
            int r1 = r5 - r1
            r2 = 0
            if (r1 >= 0) goto L_0x0022
            r1 = r2
        L_0x0022:
            int r6 = r10.f2608h     // Catch:{ all -> 0x0077 }
            if (r1 < r6) goto L_0x0028
            monitor-exit(r0)
            return r2
        L_0x0028:
            int r6 = r10.f2609i     // Catch:{ all -> 0x0077 }
            if (r5 < r6) goto L_0x002e
            monitor-exit(r0)
            return r2
        L_0x002e:
            long r5 = r10.controlState     // Catch:{ all -> 0x0077 }
            long r5 = r5 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x0077 }
            r6 = 1
            int r5 = r5 + r6
            if (r5 <= 0) goto L_0x0040
            java.util.concurrent.atomic.AtomicReferenceArray<o.a.u1.a$a> r7 = r10.f2607g     // Catch:{ all -> 0x0077 }
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x0077 }
            if (r7 != 0) goto L_0x0040
            r7 = r6
            goto L_0x0041
        L_0x0040:
            r7 = r2
        L_0x0041:
            if (r7 == 0) goto L_0x006b
            o.a.u1.a$a r7 = new o.a.u1.a$a     // Catch:{ all -> 0x0077 }
            r7.<init>(r5)     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicReferenceArray<o.a.u1.a$a> r8 = r10.f2607g     // Catch:{ all -> 0x0077 }
            r8.set(r5, r7)     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f2602m     // Catch:{ all -> 0x0077 }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x0077 }
            long r3 = r3 & r8
            int r3 = (int) r3     // Catch:{ all -> 0x0077 }
            if (r5 != r3) goto L_0x0058
            r2 = r6
        L_0x0058:
            if (r2 == 0) goto L_0x005f
            r7.start()     // Catch:{ all -> 0x0077 }
            int r1 = r1 + r6
            goto L_0x0008
        L_0x005f:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0077 }
            r2.<init>(r1)     // Catch:{ all -> 0x0077 }
            throw r2     // Catch:{ all -> 0x0077 }
        L_0x006b:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0077 }
            r2.<init>(r1)     // Catch:{ all -> 0x0077 }
            throw r2     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.p123u1.C0987a.mo4327a():int");
    }

    /* renamed from: a */
    public final void mo4331a(C0988a aVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? mo4328a(aVar) : i2;
            }
            if (i3 >= 0) {
                if (f2601l.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4332a(C0996h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    public void close() {
        mo4334d(10000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        if (r10 != null) goto L_0x007e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4334d(long r10) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f2603n
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            o.a.u1.a$a r0 = r9.mo4336f()
            java.util.concurrent.atomic.AtomicReferenceArray<o.a.u1.a$a> r3 = r9.f2607g
            monitor-enter(r3)
            long r4 = r9.controlState     // Catch:{ all -> 0x009d }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r3)
            if (r2 > r4) goto L_0x0063
            r3 = r2
        L_0x001d:
            java.util.concurrent.atomic.AtomicReferenceArray<o.a.u1.a$a> r5 = r9.f2607g
            java.lang.Object r5 = r5.get(r3)
            r6 = 0
            if (r5 == 0) goto L_0x005f
            o.a.u1.a$a r5 = (p119o.p120a.p123u1.C0987a.C0988a) r5
            if (r5 == r0) goto L_0x005a
        L_0x002a:
            boolean r7 = r5.isAlive()
            if (r7 == 0) goto L_0x0037
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r5.join(r10)
            goto L_0x002a
        L_0x0037:
            o.a.u1.m r5 = r5.f2613e
            o.a.u1.d r7 = r9.f2606f
            if (r5 == 0) goto L_0x0059
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = p119o.p120a.p123u1.C1001m.f2648b
            java.lang.Object r6 = r8.getAndSet(r5, r6)
            o.a.u1.h r6 = (p119o.p120a.p123u1.C0996h) r6
            if (r6 == 0) goto L_0x004a
            r7.mo4180a(r6)
        L_0x004a:
            o.a.u1.h r6 = r5.mo4363d()
            if (r6 == 0) goto L_0x0055
            r7.mo4180a(r6)
            r6 = r2
            goto L_0x0056
        L_0x0055:
            r6 = r1
        L_0x0056:
            if (r6 == 0) goto L_0x005a
            goto L_0x004a
        L_0x0059:
            throw r6
        L_0x005a:
            if (r3 == r4) goto L_0x0063
            int r3 = r3 + 1
            goto L_0x001d
        L_0x005f:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r6
        L_0x0063:
            o.a.u1.d r10 = r9.f2606f
            r10.mo4179a()
            o.a.u1.d r10 = r9.f2605e
            r10.mo4179a()
        L_0x006d:
            if (r0 == 0) goto L_0x0076
            o.a.u1.h r10 = r0.mo4343a(r2)
            if (r10 == 0) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            o.a.u1.d r10 = r9.f2605e
            java.lang.Object r10 = r10.mo4182c()
            o.a.u1.h r10 = (p119o.p120a.p123u1.C0996h) r10
        L_0x007e:
            if (r10 == 0) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            o.a.u1.d r10 = r9.f2606f
            java.lang.Object r10 = r10.mo4182c()
            o.a.u1.h r10 = (p119o.p120a.p123u1.C0996h) r10
        L_0x0089:
            if (r10 == 0) goto L_0x008f
            r9.mo4332a(r10)
            goto L_0x006d
        L_0x008f:
            if (r0 == 0) goto L_0x0096
            o.a.u1.a$b r10 = p119o.p120a.p123u1.C0987a.C0989b.TERMINATED
            r0.mo4344a(r10)
        L_0x0096:
            r10 = 0
            r9.parkedWorkersStack = r10
            r9.controlState = r10
            return
        L_0x009d:
            r10 = move-exception
            monitor-exit(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.p123u1.C0987a.mo4334d(long):void");
    }

    public void execute(Runnable runnable) {
        mo4330a(runnable, (C0997i) C0995g.f2639e, false);
    }

    /* renamed from: f */
    public final C0988a mo4336f() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C0988a)) {
            currentThread = null;
        }
        C0988a aVar = (C0988a) currentThread;
        if (aVar == null || !C4638h.m10272a((Object) C0987a.this, (Object) this)) {
            return null;
        }
        return aVar;
    }

    /* renamed from: g */
    public final void mo4337g() {
        if (!mo4339h() && !mo4338g(this.controlState)) {
            mo4339h();
        }
    }

    /* renamed from: g */
    public final boolean mo4338g(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.f2608h) {
            int a = mo4327a();
            if (a == 1 && this.f2608h > 1) {
                mo4327a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo4339h() {
        while (true) {
            long j = this.parkedWorkersStack;
            C0988a aVar = (C0988a) this.f2607g.get((int) (2097151 & j));
            if (aVar != null) {
                long j2 = (2097152 + j) & -2097152;
                int a = mo4328a(aVar);
                if (a < 0) {
                    continue;
                } else {
                    if (f2601l.compareAndSet(this, j, ((long) a) | j2)) {
                        aVar.nextParkedWorker = f2604o;
                    } else {
                        continue;
                    }
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                return false;
            }
            if (C0988a.f2612l.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public String toString() {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        int length = this.f2607g.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            C0988a aVar = (C0988a) this.f2607g.get(i6);
            if (aVar != null) {
                int b = aVar.f2613e.mo4361b();
                int ordinal = aVar.f2614f.ordinal();
                if (ordinal == 0) {
                    i++;
                    sb = new StringBuilder();
                    sb.append(String.valueOf(b));
                    str = "c";
                } else if (ordinal == 1) {
                    i2++;
                    sb = new StringBuilder();
                    sb.append(String.valueOf(b));
                    str = "b";
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (b > 0) {
                        sb = new StringBuilder();
                        sb.append(String.valueOf(b));
                        str = "d";
                    }
                } else if (ordinal == 4) {
                    i5++;
                }
                sb.append(str);
                arrayList.add(sb.toString());
            }
        }
        long j = this.controlState;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2611k);
        sb2.append('@');
        sb2.append(C2286e.m5323d((Object) this));
        sb2.append('[');
        sb2.append("Pool Size {");
        sb2.append("core = ");
        sb2.append(this.f2608h);
        String str2 = Objects.ARRAY_ELEMENT_SEPARATOR;
        sb2.append(str2);
        sb2.append("max = ");
        sb2.append(this.f2609i);
        String str3 = "}, ";
        sb2.append(str3);
        sb2.append("Worker States {");
        sb2.append("CPU = ");
        sb2.append(i);
        sb2.append(str2);
        sb2.append("blocking = ");
        sb2.append(i2);
        sb2.append(str2);
        sb2.append("parked = ");
        sb2.append(i3);
        sb2.append(str2);
        sb2.append("dormant = ");
        sb2.append(i4);
        sb2.append(str2);
        sb2.append("terminated = ");
        sb2.append(i5);
        sb2.append(str3);
        sb2.append("running workers queues = ");
        sb2.append(arrayList);
        sb2.append(str2);
        sb2.append("global CPU queue size = ");
        sb2.append(this.f2605e.mo4181b());
        sb2.append(str2);
        sb2.append("global blocking queue size = ");
        sb2.append(this.f2606f.mo4181b());
        sb2.append(str2);
        sb2.append("Control State {");
        sb2.append("created workers= ");
        sb2.append((int) (2097151 & j));
        sb2.append(str2);
        sb2.append("blocking tasks = ");
        sb2.append((int) ((4398044413952L & j) >> 21));
        sb2.append(str2);
        sb2.append("CPUs acquired = ");
        sb2.append(this.f2608h - ((int) ((9223367638808264704L & j) >> 42)));
        sb2.append("}]");
        return sb2.toString();
    }

    /* renamed from: a */
    public final C0996h mo4329a(Runnable runnable, C0997i iVar) {
        if (((C0994f) C0999k.f2647e) != null) {
            long nanoTime = System.nanoTime();
            if (!(runnable instanceof C0996h)) {
                return new C0998j(runnable, nanoTime, iVar);
            }
            C0996h hVar = (C0996h) runnable;
            hVar.f2640e = nanoTime;
            hVar.f2641f = iVar;
            return hVar;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo4330a(Runnable runnable, C0997i iVar, boolean z) {
        C0996h hVar;
        C0996h a = mo4329a(runnable, iVar);
        C0988a f = mo4336f();
        boolean z2 = true;
        if (f == null || f.f2614f == C0989b.TERMINATED || (a.f2641f.mo4354k() == 0 && f.f2614f == C0989b.BLOCKING)) {
            hVar = a;
        } else {
            f.f2618j = true;
            hVar = f.f2613e.mo4360a(a, z);
        }
        if (hVar != null) {
            if (!(hVar.f2641f.mo4354k() == 1 ? this.f2606f : this.f2605e).mo4180a(hVar)) {
                throw new RejectedExecutionException(C1965a.m4754a(new StringBuilder(), this.f2611k, " was terminated"));
            }
        }
        if (!z || f == null) {
            z2 = false;
        }
        if (a.f2641f.mo4354k() != 0) {
            long addAndGet = f2602m.addAndGet(this, 2097152);
            if (!z2 && !mo4339h() && !mo4338g(addAndGet)) {
                mo4339h();
            }
        } else if (!z2) {
            mo4337g();
        }
    }

    /* renamed from: a */
    public final int mo4328a(C0988a aVar) {
        int i;
        do {
            Object obj = aVar.nextParkedWorker;
            if (obj == f2604o) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            aVar = (C0988a) obj;
            i = aVar.indexInArray;
        } while (i == 0);
        return i;
    }
}
