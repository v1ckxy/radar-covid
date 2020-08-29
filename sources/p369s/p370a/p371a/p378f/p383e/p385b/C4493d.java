package p369s.p370a.p371a.p378f.p383e.p385b;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p374b.C4443j;
import p369s.p370a.p371a.p374b.C4444k;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p377e.C4461d;
import p369s.p370a.p371a.p377e.C4462e;
import p369s.p370a.p371a.p378f.p379a.C4463a;
import p369s.p370a.p371a.p378f.p379a.C4464b;
import p369s.p370a.p371a.p378f.p381c.C4475c;
import p369s.p370a.p371a.p378f.p381c.C4476d;
import p369s.p370a.p371a.p378f.p386f.C4510b;
import p369s.p370a.p371a.p378f.p388h.C4534a;
import p369s.p370a.p371a.p378f.p388h.C4535b;

/* renamed from: s.a.a.f.e.b.d */
public final class C4493d<T, U> extends C4489a<T, U> {

    /* renamed from: b */
    public final C4461d<? super T, ? extends C4443j<? extends U>> f10586b;

    /* renamed from: c */
    public final boolean f10587c;

    /* renamed from: d */
    public final int f10588d;

    /* renamed from: e */
    public final int f10589e;

    /* renamed from: s.a.a.f.e.b.d$a */
    public static final class C4494a<T, U> extends AtomicReference<C4450c> implements C4444k<U> {

        /* renamed from: e */
        public final C4495b<T, U> f10590e;

        /* renamed from: f */
        public volatile boolean f10591f;

        /* renamed from: g */
        public volatile C4476d<U> f10592g;

        /* renamed from: h */
        public int f10593h;

        public C4494a(C4495b<T, U> bVar, long j) {
            this.f10590e = bVar;
        }

        /* renamed from: a */
        public void mo10722a() {
            this.f10591f = true;
            this.f10590e.mo10771d();
        }

        /* renamed from: a */
        public void mo10723a(Throwable th) {
            if (this.f10590e.f10603l.mo10803a(th)) {
                C4495b<T, U> bVar = this.f10590e;
                if (!bVar.f10598g) {
                    bVar.mo10770c();
                }
                this.f10591f = true;
                this.f10590e.mo10771d();
            }
        }

        /* JADX WARNING: type inference failed for: r3v1, types: [s.a.a.f.c.d<U>, s.a.a.f.c.a] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v1, types: [s.a.a.f.c.d<U>, s.a.a.f.c.a]
          assigns: [s.a.a.f.c.a]
          uses: [s.a.a.f.c.a, s.a.a.f.c.d<U>]
          mth insns count: 17
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10724a(p369s.p370a.p371a.p375c.C4450c r3) {
            /*
                r2 = this;
                boolean r0 = p369s.p370a.p371a.p378f.p379a.C4463a.m10052b(r2, r3)
                if (r0 == 0) goto L_0x0027
                boolean r0 = r3 instanceof p369s.p370a.p371a.p378f.p381c.C4473a
                if (r0 == 0) goto L_0x0027
                s.a.a.f.c.a r3 = (p369s.p370a.p371a.p378f.p381c.C4473a) r3
                r0 = 7
                int r0 = r3.mo10742a(r0)
                r1 = 1
                if (r0 != r1) goto L_0x0020
                r2.f10593h = r0
                r2.f10592g = r3
                r2.f10591f = r1
                s.a.a.f.e.b.d$b<T, U> r3 = r2.f10590e
                r3.mo10771d()
                return
            L_0x0020:
                r1 = 2
                if (r0 != r1) goto L_0x0027
                r2.f10593h = r0
                r2.f10592g = r3
            L_0x0027:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p369s.p370a.p371a.p378f.p383e.p385b.C4493d.C4494a.mo10724a(s.a.a.c.c):void");
        }

        /* renamed from: b */
        public void mo10725b(U u) {
            if (this.f10593h == 0) {
                C4495b<T, U> bVar = this.f10590e;
                if (bVar.get() != 0 || !bVar.compareAndSet(0, 1)) {
                    C4476d dVar = this.f10592g;
                    if (dVar == null) {
                        dVar = new C4510b(bVar.f10600i);
                        this.f10592g = dVar;
                    }
                    dVar.mo10752a(u);
                    if (bVar.getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    bVar.f10596e.mo10725b(u);
                    if (bVar.decrementAndGet() == 0) {
                        return;
                    }
                }
                bVar.mo10772e();
                return;
            }
            this.f10590e.mo10771d();
        }
    }

    /* renamed from: s.a.a.f.e.b.d$b */
    public static final class C4495b<T, U> extends AtomicInteger implements C4450c, C4444k<T> {

        /* renamed from: t */
        public static final C4494a<?, ?>[] f10594t = new C4494a[0];

        /* renamed from: u */
        public static final C4494a<?, ?>[] f10595u = new C4494a[0];

        /* renamed from: e */
        public final C4444k<? super U> f10596e;

        /* renamed from: f */
        public final C4461d<? super T, ? extends C4443j<? extends U>> f10597f;

        /* renamed from: g */
        public final boolean f10598g;

        /* renamed from: h */
        public final int f10599h;

        /* renamed from: i */
        public final int f10600i;

        /* renamed from: j */
        public volatile C4475c<U> f10601j;

        /* renamed from: k */
        public volatile boolean f10602k;

        /* renamed from: l */
        public final C4534a f10603l = new C4534a();

        /* renamed from: m */
        public volatile boolean f10604m;

        /* renamed from: n */
        public final AtomicReference<C4494a<?, ?>[]> f10605n;

        /* renamed from: o */
        public C4450c f10606o;

        /* renamed from: p */
        public long f10607p;

        /* renamed from: q */
        public int f10608q;

        /* renamed from: r */
        public Queue<C4443j<? extends U>> f10609r;

        /* renamed from: s */
        public int f10610s;

        public C4495b(C4444k<? super U> kVar, C4461d<? super T, ? extends C4443j<? extends U>> dVar, boolean z, int i, int i2) {
            this.f10596e = kVar;
            this.f10597f = dVar;
            this.f10598g = z;
            this.f10599h = i;
            this.f10600i = i2;
            if (i != Integer.MAX_VALUE) {
                this.f10609r = new ArrayDeque(i);
            }
            this.f10605n = new AtomicReference<>(f10594t);
        }

        /* renamed from: a */
        public void mo10722a() {
            if (!this.f10602k) {
                this.f10602k = true;
                mo10771d();
            }
        }

        /* renamed from: a */
        public void mo10723a(Throwable th) {
            if (this.f10602k) {
                C2286e.m5298b(th);
                return;
            }
            if (this.f10603l.mo10803a(th)) {
                this.f10602k = true;
                mo10771d();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            if (decrementAndGet() == 0) goto L_0x005e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10767a(p369s.p370a.p371a.p374b.C4443j<? extends U> r8) {
            /*
                r7 = this;
            L_0x0000:
                boolean r0 = r8 instanceof p369s.p370a.p371a.p377e.C4462e
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0080
                s.a.a.e.e r8 = (p369s.p370a.p371a.p377e.C4462e) r8
                r0 = 2147483647(0x7fffffff, float:NaN)
                java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x0052 }
                if (r8 != 0) goto L_0x0012
            L_0x0011:
                goto L_0x005e
            L_0x0012:
                int r3 = r7.get()
                if (r3 != 0) goto L_0x002a
                boolean r3 = r7.compareAndSet(r1, r2)
                if (r3 == 0) goto L_0x002a
                s.a.a.b.k<? super U> r3 = r7.f10596e
                r3.mo10725b(r8)
                int r8 = r7.decrementAndGet()
                if (r8 != 0) goto L_0x004e
                goto L_0x0011
            L_0x002a:
                s.a.a.f.c.c<U> r3 = r7.f10601j
                if (r3 != 0) goto L_0x0043
                int r3 = r7.f10599h
                if (r3 != r0) goto L_0x003a
                s.a.a.f.f.b r3 = new s.a.a.f.f.b
                int r4 = r7.f10600i
                r3.<init>(r4)
                goto L_0x0041
            L_0x003a:
                s.a.a.f.f.a r3 = new s.a.a.f.f.a
                int r4 = r7.f10599h
                r3.<init>(r4)
            L_0x0041:
                r7.f10601j = r3
            L_0x0043:
                r3.mo10752a(r8)
                int r8 = r7.getAndIncrement()
                if (r8 == 0) goto L_0x004e
                r8 = r1
                goto L_0x005f
            L_0x004e:
                r7.mo10772e()
                goto L_0x005e
            L_0x0052:
                r8 = move-exception
                p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5312c(r8)
                s.a.a.f.h.a r3 = r7.f10603l
                r3.mo10803a(r8)
                r7.mo10771d()
            L_0x005e:
                r8 = r2
            L_0x005f:
                if (r8 == 0) goto L_0x00b4
                int r8 = r7.f10599h
                if (r8 == r0) goto L_0x00b4
                monitor-enter(r7)
                java.util.Queue<s.a.a.b.j<? extends U>> r8 = r7.f10609r     // Catch:{ all -> 0x007d }
                java.lang.Object r8 = r8.poll()     // Catch:{ all -> 0x007d }
                s.a.a.b.j r8 = (p369s.p370a.p371a.p374b.C4443j) r8     // Catch:{ all -> 0x007d }
                if (r8 != 0) goto L_0x0076
                int r0 = r7.f10610s     // Catch:{ all -> 0x007d }
                int r0 = r0 - r2
                r7.f10610s = r0     // Catch:{ all -> 0x007d }
                r1 = r2
            L_0x0076:
                monitor-exit(r7)     // Catch:{ all -> 0x007d }
                if (r1 == 0) goto L_0x0000
                r7.mo10771d()
                goto L_0x00b4
            L_0x007d:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x007d }
                throw r8
            L_0x0080:
                s.a.a.f.e.b.d$a r0 = new s.a.a.f.e.b.d$a
                long r3 = r7.f10607p
                r5 = 1
                long r5 = r5 + r3
                r7.f10607p = r5
                r0.<init>(r7, r3)
            L_0x008c:
                java.util.concurrent.atomic.AtomicReference<s.a.a.f.e.b.d$a<?, ?>[]> r3 = r7.f10605n
                java.lang.Object r3 = r3.get()
                s.a.a.f.e.b.d$a[] r3 = (p369s.p370a.p371a.p378f.p383e.p385b.C4493d.C4494a[]) r3
                s.a.a.f.e.b.d$a<?, ?>[] r4 = f10595u
                if (r3 != r4) goto L_0x009c
                p369s.p370a.p371a.p378f.p379a.C4463a.m10049a(r0)
                goto L_0x00af
            L_0x009c:
                int r4 = r3.length
                int r5 = r4 + 1
                s.a.a.f.e.b.d$a[] r5 = new p369s.p370a.p371a.p378f.p383e.p385b.C4493d.C4494a[r5]
                java.lang.System.arraycopy(r3, r1, r5, r1, r4)
                r5[r4] = r0
                java.util.concurrent.atomic.AtomicReference<s.a.a.f.e.b.d$a<?, ?>[]> r4 = r7.f10605n
                boolean r3 = r4.compareAndSet(r3, r5)
                if (r3 == 0) goto L_0x008c
                r1 = r2
            L_0x00af:
                if (r1 == 0) goto L_0x00b4
                r8.mo10720a(r0)
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p369s.p370a.p371a.p378f.p383e.p385b.C4493d.C4495b.mo10767a(s.a.a.b.j):void");
        }

        /* renamed from: a */
        public void mo10724a(C4450c cVar) {
            if (C4463a.m10051a(this.f10606o, cVar)) {
                this.f10606o = cVar;
                this.f10596e.mo10724a((C4450c) this);
            }
        }

        /* renamed from: a */
        public void mo10768a(C4494a<T, U> aVar) {
            C4494a<T, U>[] aVarArr;
            Object obj;
            do {
                aVarArr = (C4494a[]) this.f10605n.get();
                int length = aVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        obj = f10594t;
                    } else {
                        C4494a[] aVarArr2 = new C4494a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                        obj = aVarArr2;
                    }
                } else {
                    return;
                }
            } while (!this.f10605n.compareAndSet(aVarArr, obj));
        }

        /* renamed from: b */
        public void mo10725b(T t) {
            if (!this.f10602k) {
                try {
                    C4443j jVar = (C4443j) Objects.requireNonNull(this.f10597f.mo3712a(t), "The mapper returned a null ObservableSource");
                    if (this.f10599h != Integer.MAX_VALUE) {
                        synchronized (this) {
                            if (this.f10610s == this.f10599h) {
                                this.f10609r.offer(jVar);
                                return;
                            }
                            this.f10610s++;
                        }
                    }
                    mo10767a(jVar);
                } catch (Throwable th) {
                    C2286e.m5312c(th);
                    this.f10606o.mo10714f();
                    mo10723a(th);
                }
            }
        }

        /* renamed from: b */
        public boolean mo10769b() {
            if (this.f10604m) {
                return true;
            }
            Throwable th = (Throwable) this.f10603l.get();
            if (this.f10598g || th == null) {
                return false;
            }
            mo10770c();
            C4534a aVar = this.f10603l;
            C4444k<? super U> kVar = this.f10596e;
            if (aVar != null) {
                Throwable a = C4535b.m10205a((AtomicReference<Throwable>) aVar);
                if (a == null) {
                    kVar.mo10722a();
                } else if (a != C4535b.f10750a) {
                    kVar.mo10723a(a);
                }
                return true;
            }
            throw null;
        }

        /* renamed from: c */
        public boolean mo10770c() {
            this.f10606o.mo10714f();
            C4494a<?, ?>[] aVarArr = (C4494a[]) this.f10605n.getAndSet(f10595u);
            int i = 0;
            if (aVarArr == f10595u) {
                return false;
            }
            int length = aVarArr.length;
            while (i < length) {
                C4494a<?, ?> aVar = aVarArr[i];
                if (aVar != null) {
                    C4463a.m10049a(aVar);
                    i++;
                } else {
                    throw null;
                }
            }
            return true;
        }

        /* renamed from: d */
        public void mo10771d() {
            if (getAndIncrement() == 0) {
                mo10772e();
            }
        }

        /* renamed from: e */
        public void mo10772e() {
            int i;
            C4444k<? super U> kVar = this.f10596e;
            int i2 = 1;
            while (!mo10769b()) {
                C4475c<U> cVar = this.f10601j;
                if (cVar != null) {
                    while (!mo10769b()) {
                        Object g = cVar.mo10751g();
                        if (g != null) {
                            kVar.mo10725b(g);
                        }
                    }
                    return;
                }
                boolean z = this.f10602k;
                C4475c<U> cVar2 = this.f10601j;
                C4494a[] aVarArr = (C4494a[]) this.f10605n.get();
                int length = aVarArr.length;
                int i3 = 0;
                if (this.f10599h != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.f10609r.size();
                    }
                } else {
                    i = 0;
                }
                if (!z || !((cVar2 == null || cVar2.isEmpty()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        int min = Math.min(length - 1, this.f10608q);
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < length) {
                            if (!mo10769b()) {
                                C4494a aVar = aVarArr[min];
                                C4476d<U> dVar = aVar.f10592g;
                                if (dVar != null) {
                                    while (true) {
                                        try {
                                            Object g2 = dVar.mo10751g();
                                            if (g2 == null) {
                                                break;
                                            }
                                            kVar.mo10725b(g2);
                                            if (mo10769b()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C2286e.m5312c(th);
                                            C4463a.m10049a(aVar);
                                            this.f10603l.mo10803a(th);
                                            if (!mo10769b()) {
                                                mo10768a(aVar);
                                                i5++;
                                                min++;
                                                if (min != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = aVar.f10591f;
                                C4476d<U> dVar2 = aVar.f10592g;
                                if (z2 && (dVar2 == null || dVar2.isEmpty())) {
                                    mo10768a(aVar);
                                    i5++;
                                }
                                min++;
                                if (min != length) {
                                    i4++;
                                }
                                min = 0;
                                i4++;
                            } else {
                                return;
                            }
                        }
                        this.f10608q = min;
                        i3 = i5;
                    }
                    if (i3 == 0) {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else if (this.f10599h != Integer.MAX_VALUE) {
                        while (true) {
                            int i6 = i3 - 1;
                            if (i3 == 0) {
                                continue;
                                break;
                            }
                            synchronized (this) {
                                C4443j jVar = (C4443j) this.f10609r.poll();
                                if (jVar == null) {
                                    this.f10610s--;
                                } else {
                                    mo10767a(jVar);
                                }
                            }
                            i3 = i6;
                        }
                        while (true) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    C4534a aVar2 = this.f10603l;
                    C4444k<? super U> kVar2 = this.f10596e;
                    if (aVar2 != null) {
                        Throwable a = C4535b.m10205a((AtomicReference<Throwable>) aVar2);
                        if (a == null) {
                            kVar2.mo10722a();
                        } else if (a != C4535b.f10750a) {
                            kVar2.mo10723a(a);
                        }
                        return;
                    }
                    throw null;
                }
            }
        }

        /* renamed from: f */
        public void mo10714f() {
            this.f10604m = true;
            if (mo10770c()) {
                C4534a aVar = this.f10603l;
                if (aVar != null) {
                    Throwable a = C4535b.m10205a((AtomicReference<Throwable>) aVar);
                    if (a != null && a != C4535b.f10750a) {
                        C2286e.m5298b(a);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public C4493d(C4443j<T> jVar, C4461d<? super T, ? extends C4443j<? extends U>> dVar, boolean z, int i, int i2) {
        super(jVar);
        this.f10586b = dVar;
        this.f10587c = z;
        this.f10588d = i;
        this.f10589e = i2;
    }

    /* renamed from: b */
    public void mo10721b(C4444k<? super U> kVar) {
        boolean z;
        C4443j<T> jVar = this.f10582a;
        C4461d<? super T, ? extends C4443j<? extends U>> dVar = this.f10586b;
        if (jVar instanceof C4462e) {
            z = true;
            try {
                Object obj = ((C4462e) jVar).get();
                if (obj != null) {
                    C4443j jVar2 = (C4443j) Objects.requireNonNull(dVar.mo3712a(obj), "The mapper returned a null ObservableSource");
                    if (jVar2 instanceof C4462e) {
                        Object obj2 = ((C4462e) jVar2).get();
                        if (obj2 != null) {
                            C4501g gVar = new C4501g(kVar, obj2);
                            kVar.mo10724a((C4450c) gVar);
                            gVar.run();
                        }
                    } else {
                        jVar2.mo10720a(kVar);
                    }
                }
                kVar.mo10724a((C4450c) C4464b.INSTANCE);
                kVar.mo10722a();
            } catch (Throwable th) {
                C2286e.m5312c(th);
                kVar.mo10724a((C4450c) C4464b.INSTANCE);
                kVar.mo10723a(th);
            }
        } else {
            z = false;
        }
        if (!z) {
            C4443j<T> jVar3 = this.f10582a;
            C4495b bVar = new C4495b(kVar, this.f10586b, this.f10587c, this.f10588d, this.f10589e);
            jVar3.mo10720a(bVar);
        }
    }
}
