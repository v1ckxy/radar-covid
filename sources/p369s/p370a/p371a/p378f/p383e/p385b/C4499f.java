package p369s.p370a.p371a.p378f.p383e.p385b;

import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p374b.C4443j;
import p369s.p370a.p371a.p374b.C4444k;
import p369s.p370a.p371a.p374b.C4445l;
import p369s.p370a.p371a.p374b.C4445l.C4447b;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p378f.p381c.C4476d;
import p369s.p370a.p371a.p378f.p382d.C4477a;
import p369s.p370a.p371a.p378f.p387g.C4529j;

/* renamed from: s.a.a.f.e.b.f */
public final class C4499f<T> extends C4489a<T, T> {

    /* renamed from: b */
    public final C4445l f10622b;

    /* renamed from: c */
    public final boolean f10623c;

    /* renamed from: d */
    public final int f10624d;

    /* renamed from: s.a.a.f.e.b.f$a */
    public static final class C4500a<T> extends C4477a<T> implements C4444k<T>, Runnable {

        /* renamed from: e */
        public final C4444k<? super T> f10625e;

        /* renamed from: f */
        public final C4447b f10626f;

        /* renamed from: g */
        public final boolean f10627g;

        /* renamed from: h */
        public final int f10628h;

        /* renamed from: i */
        public C4476d<T> f10629i;

        /* renamed from: j */
        public C4450c f10630j;

        /* renamed from: k */
        public Throwable f10631k;

        /* renamed from: l */
        public volatile boolean f10632l;

        /* renamed from: m */
        public volatile boolean f10633m;

        /* renamed from: n */
        public int f10634n;

        /* renamed from: o */
        public boolean f10635o;

        public C4500a(C4444k<? super T> kVar, C4447b bVar, boolean z, int i) {
            this.f10625e = kVar;
            this.f10626f = bVar;
            this.f10627g = z;
            this.f10628h = i;
        }

        /* renamed from: a */
        public int mo10742a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f10635o = true;
            return 2;
        }

        /* renamed from: a */
        public void mo10722a() {
            if (!this.f10632l) {
                this.f10632l = true;
                mo10774b();
            }
        }

        /* renamed from: a */
        public void mo10723a(Throwable th) {
            if (this.f10632l) {
                C2286e.m5298b(th);
                return;
            }
            this.f10631k = th;
            this.f10632l = true;
            mo10774b();
        }

        /* JADX WARNING: type inference failed for: r3v3, types: [s.a.a.f.c.d<T>, s.a.a.f.c.a] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v3, types: [s.a.a.f.c.d<T>, s.a.a.f.c.a]
          assigns: [s.a.a.f.c.a]
          uses: [s.a.a.f.c.a, s.a.a.f.c.d<T>]
          mth insns count: 28
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
                s.a.a.c.c r0 = r2.f10630j
                boolean r0 = p369s.p370a.p371a.p378f.p379a.C4463a.m10051a(r0, r3)
                if (r0 == 0) goto L_0x0042
                r2.f10630j = r3
                boolean r0 = r3 instanceof p369s.p370a.p371a.p378f.p381c.C4473a
                if (r0 == 0) goto L_0x0034
                s.a.a.f.c.a r3 = (p369s.p370a.p371a.p378f.p381c.C4473a) r3
                r0 = 7
                int r0 = r3.mo10742a(r0)
                r1 = 1
                if (r0 != r1) goto L_0x0027
                r2.f10634n = r0
                r2.f10629i = r3
                r2.f10632l = r1
                s.a.a.b.k<? super T> r3 = r2.f10625e
                r3.mo10724a(r2)
                r2.mo10774b()
                return
            L_0x0027:
                r1 = 2
                if (r0 != r1) goto L_0x0034
                r2.f10634n = r0
                r2.f10629i = r3
                s.a.a.b.k<? super T> r3 = r2.f10625e
                r3.mo10724a(r2)
                return
            L_0x0034:
                s.a.a.f.f.b r3 = new s.a.a.f.f.b
                int r0 = r2.f10628h
                r3.<init>(r0)
                r2.f10629i = r3
                s.a.a.b.k<? super T> r3 = r2.f10625e
                r3.mo10724a(r2)
            L_0x0042:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p369s.p370a.p371a.p378f.p383e.p385b.C4499f.C4500a.mo10724a(s.a.a.c.c):void");
        }

        /* renamed from: a */
        public boolean mo10773a(boolean z, boolean z2, C4444k<? super T> kVar) {
            if (this.f10633m) {
                this.f10629i.clear();
                return true;
            }
            if (z) {
                Throwable th = this.f10631k;
                if (this.f10627g) {
                    if (z2) {
                        this.f10633m = true;
                        if (th != null) {
                            kVar.mo10723a(th);
                        } else {
                            kVar.mo10722a();
                        }
                        this.f10626f.mo10714f();
                        return true;
                    }
                } else if (th != null) {
                    this.f10633m = true;
                    this.f10629i.clear();
                    kVar.mo10723a(th);
                    this.f10626f.mo10714f();
                    return true;
                } else if (z2) {
                    this.f10633m = true;
                    kVar.mo10722a();
                    this.f10626f.mo10714f();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public void mo10774b() {
            if (getAndIncrement() == 0) {
                this.f10626f.mo10729a((Runnable) this);
            }
        }

        /* renamed from: b */
        public void mo10725b(T t) {
            if (!this.f10632l) {
                if (this.f10634n != 2) {
                    this.f10629i.mo10752a(t);
                }
                mo10774b();
            }
        }

        public void clear() {
            this.f10629i.clear();
        }

        /* renamed from: f */
        public void mo10714f() {
            if (!this.f10633m) {
                this.f10633m = true;
                this.f10630j.mo10714f();
                this.f10626f.mo10714f();
                if (!this.f10635o && getAndIncrement() == 0) {
                    this.f10629i.clear();
                }
            }
        }

        /* renamed from: g */
        public T mo10776g() {
            return this.f10629i.mo10751g();
        }

        public boolean isEmpty() {
            return this.f10629i.isEmpty();
        }

        public void run() {
            if (this.f10635o) {
                int i = 1;
                while (!this.f10633m) {
                    boolean z = this.f10632l;
                    Throwable th = this.f10631k;
                    if (this.f10627g || !z || th == null) {
                        this.f10625e.mo10725b(null);
                        if (z) {
                            this.f10633m = true;
                            Throwable th2 = this.f10631k;
                            if (th2 != null) {
                                this.f10625e.mo10723a(th2);
                            } else {
                                this.f10625e.mo10722a();
                            }
                        } else {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        this.f10633m = true;
                        this.f10625e.mo10723a(this.f10631k);
                    }
                    this.f10626f.mo10714f();
                    return;
                }
                return;
            }
            C4476d<T> dVar = this.f10629i;
            C4444k<? super T> kVar = this.f10625e;
            int i2 = 1;
            while (!mo10773a(this.f10632l, dVar.isEmpty(), kVar)) {
                while (true) {
                    boolean z2 = this.f10632l;
                    try {
                        Object g = dVar.mo10751g();
                        boolean z3 = g == null;
                        if (!mo10773a(z2, z3, kVar)) {
                            if (z3) {
                                i2 = addAndGet(-i2);
                                if (i2 == 0) {
                                    return;
                                }
                            } else {
                                kVar.mo10725b(g);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th3) {
                        C2286e.m5312c(th3);
                        this.f10633m = true;
                        this.f10630j.mo10714f();
                        dVar.clear();
                        kVar.mo10723a(th3);
                        this.f10626f.mo10714f();
                        return;
                    }
                }
            }
        }
    }

    public C4499f(C4443j<T> jVar, C4445l lVar, boolean z, int i) {
        super(jVar);
        this.f10622b = lVar;
        this.f10623c = z;
        this.f10624d = i;
    }

    /* renamed from: b */
    public void mo10721b(C4444k<? super T> kVar) {
        C4445l lVar = this.f10622b;
        if (lVar instanceof C4529j) {
            this.f10582a.mo10720a(kVar);
            return;
        }
        this.f10582a.mo10720a(new C4500a(kVar, lVar.mo10711a(), this.f10623c, this.f10624d));
    }
}
