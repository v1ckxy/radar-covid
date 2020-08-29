package p119o.p120a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p116io.jsonwebtoken.lang.Objects;
import p119o.p120a.p121a.C0900h;
import p119o.p120a.p121a.C0900h.C0901a;
import p119o.p120a.p121a.C0907l;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4557i;
import p392u.C4560l;
import p392u.p395p.C4583f;
import p392u.p395p.C4583f.C4584a;
import p392u.p395p.C4583f.C4584a.C4585a;
import p392u.p395p.C4583f.C4586b;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4638h;

/* renamed from: o.a.f1 */
public class C0932f1 implements C0916a1, C0962o, C0956m1 {

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater f2539e = AtomicReferenceFieldUpdater.newUpdater(C0932f1.class, Object.class, "_state");
    public volatile Object _parentHandle;
    public volatile Object _state;

    /* renamed from: o.a.f1$a */
    public static final class C0933a extends C0929e1<C0916a1> {

        /* renamed from: i */
        public final C0932f1 f2540i;

        /* renamed from: j */
        public final C0934b f2541j;

        /* renamed from: k */
        public final C0957n f2542k;

        /* renamed from: l */
        public final Object f2543l;

        public C0933a(C0932f1 f1Var, C0934b bVar, C0957n nVar, Object obj) {
            super(nVar.f2573i);
            this.f2540i = f1Var;
            this.f2541j = bVar;
            this.f2542k = nVar;
            this.f2543l = obj;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo3153b(Object obj) {
            mo4271b((Throwable) obj);
            return C4560l.f10773a;
        }

        /* renamed from: b */
        public void mo4271b(Throwable th) {
            C0932f1 f1Var = this.f2540i;
            C0934b bVar = this.f2541j;
            C0957n nVar = this.f2542k;
            Object obj = this.f2543l;
            C0957n a = f1Var.mo4247a((C0900h) nVar);
            if (a == null || !f1Var.mo4255a(bVar, a, obj)) {
                f1Var.mo4190b(f1Var.mo4243a(bVar, obj));
            }
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("ChildCompletion[");
            a.append(this.f2542k);
            a.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            a.append(this.f2543l);
            a.append(']');
            return a.toString();
        }
    }

    /* renamed from: o.a.f1$b */
    public static final class C0934b implements C1003v0 {
        public volatile Object _exceptionsHolder = null;
        public volatile int _isCompleting;
        public volatile Object _rootCause;

        /* renamed from: e */
        public final C0947j1 f2544e;

        public C0934b(C0947j1 j1Var, boolean z, Throwable th) {
            this.f2544e = j1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: a */
        public final void mo4272a(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList c = mo4274c();
                        c.add(obj);
                        c.add(th);
                        this._exceptionsHolder = c;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(C1965a.m4750a("State is ", obj).toString());
                }
            }
        }

        /* renamed from: b */
        public final List<Throwable> mo4273b(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = mo4274c();
            } else if (obj instanceof Throwable) {
                ArrayList c = mo4274c();
                c.add(obj);
                arrayList = c;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(C1965a.m4750a("State is ", obj).toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && (!C4638h.m10272a((Object) th, (Object) th2))) {
                arrayList.add(th);
            }
            this._exceptionsHolder = C0938g1.f2554e;
            return arrayList;
        }

        /* renamed from: b */
        public C0947j1 mo4237b() {
            return this.f2544e;
        }

        /* renamed from: c */
        public final ArrayList<Throwable> mo4274c() {
            return new ArrayList<>(4);
        }

        /* renamed from: d */
        public final boolean mo4275d() {
            return ((Throwable) this._rootCause) != null;
        }

        /* renamed from: e */
        public final boolean mo4276e() {
            return this._exceptionsHolder == C0938g1.f2554e;
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [boolean, int] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v2, types: [boolean, int]
          assigns: [int]
          uses: [boolean]
          mth insns count: 24
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r2 = this;
                java.lang.String r0 = "Finishing[cancelling="
                java.lang.StringBuilder r0 = p213q.p214a.p215a.p216a.C1965a.m4756a(r0)
                boolean r1 = r2.mo4275d()
                r0.append(r1)
                java.lang.String r1 = ", completing="
                r0.append(r1)
                int r1 = r2._isCompleting
                r0.append(r1)
                java.lang.String r1 = ", rootCause="
                r0.append(r1)
                java.lang.Object r1 = r2._rootCause
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.append(r1)
                java.lang.String r1 = ", exceptions="
                r0.append(r1)
                java.lang.Object r1 = r2._exceptionsHolder
                r0.append(r1)
                java.lang.String r1 = ", list="
                r0.append(r1)
                o.a.j1 r1 = r2.f2544e
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C0932f1.C0934b.toString():java.lang.String");
        }

        /* renamed from: a */
        public boolean mo4236a() {
            return ((Throwable) this._rootCause) == null;
        }
    }

    /* renamed from: o.a.f1$c */
    public static final class C0935c extends C0901a {

        /* renamed from: d */
        public final /* synthetic */ C0932f1 f2545d;

        /* renamed from: e */
        public final /* synthetic */ Object f2546e;

        public C0935c(C0900h hVar, C0900h hVar2, C0932f1 f1Var, Object obj) {
            this.f2545d = f1Var;
            this.f2546e = obj;
            super(hVar2);
        }
    }

    public C0932f1(boolean z) {
        C0952l0 l0Var;
        if (z) {
            l0Var = C0938g1.f2556g;
        } else {
            l0Var = C0938g1.f2555f;
        }
        this._state = l0Var;
        this._parentHandle = null;
    }

    /* renamed from: a */
    public final C0929e1<?> mo4245a(C4618l<? super Throwable, C4560l> lVar, boolean z) {
        C0923c1 c1Var = null;
        if (z) {
            if (lVar instanceof C0923c1) {
                c1Var = lVar;
            }
            C0923c1 c1Var2 = c1Var;
            return c1Var2 != null ? c1Var2 : new C1009y0(this, lVar);
        }
        if (lVar instanceof C0929e1) {
            c1Var = lVar;
        }
        C0929e1<?> e1Var = c1Var;
        return e1Var != null ? e1Var : new C1012z0(this, lVar);
    }

    /* renamed from: a */
    public final C0947j1 mo4246a(C1003v0 v0Var) {
        C0947j1 b = v0Var.mo4237b();
        if (b != null) {
            return b;
        }
        if (v0Var instanceof C0952l0) {
            return new C0947j1();
        }
        if (v0Var instanceof C0929e1) {
            mo4249a((C0929e1) v0Var);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("State should have list: ");
        sb.append(v0Var);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    public final C0954m mo4207a(C0962o oVar) {
        C0949k0 a = C0967p0.m2181a((C0916a1) this, true, false, (C4618l) new C0957n(this, oVar), 2, (Object) null);
        if (a != null) {
            return (C0954m) a;
        }
        throw new C4557i("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    /* renamed from: a */
    public final C0957n mo4247a(C0900h hVar) {
        while (hVar.mo4172j()) {
            hVar = hVar.mo4177i();
        }
        while (true) {
            hVar = hVar.mo4176h();
            if (!hVar.mo4172j()) {
                if (hVar instanceof C0957n) {
                    return (C0957n) hVar;
                }
                if (hVar instanceof C0947j1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4250a(C0947j1 j1Var, Throwable th) {
        C1004w wVar = null;
        Object g = j1Var.mo4175g();
        if (g != null) {
            for (C0900h hVar = (C0900h) g; !C4638h.m10272a((Object) hVar, (Object) j1Var); hVar = hVar.mo4176h()) {
                if (hVar instanceof C0923c1) {
                    C0929e1 e1Var = (C0929e1) hVar;
                    try {
                        e1Var.mo4271b(th);
                    } catch (Throwable th2) {
                        if (wVar != null) {
                            C2286e.m5240a((Throwable) wVar, th2);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Exception in completion handler ");
                            sb.append(e1Var);
                            sb.append(" for ");
                            sb.append(this);
                            wVar = new C1004w(sb.toString(), th2);
                        }
                    }
                }
            }
            if (wVar != null) {
                mo4220c((Throwable) wVar);
            }
            mo4254a(th);
            return;
        }
        throw new C4557i("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: a */
    public final void mo4251a(C0956m1 m1Var) {
        mo4258c((Object) m1Var);
    }

    /* renamed from: a */
    public boolean mo4208a() {
        Object i = mo4267i();
        return (i instanceof C1003v0) && ((C1003v0) i).mo4236a();
    }

    /* renamed from: a */
    public final boolean mo4253a(Object obj, C0947j1 j1Var, C0929e1<?> e1Var) {
        boolean z;
        C0935c cVar = new C0935c(e1Var, e1Var, this, obj);
        do {
            C0900h i = j1Var.mo4177i();
            if (i != null) {
                C0900h.f2487f.lazySet(e1Var, i);
                C0900h.f2486e.lazySet(e1Var, j1Var);
                cVar.f2489b = j1Var;
                z = !C0900h.f2486e.compareAndSet(i, j1Var, cVar) ? false : cVar.mo4169a(i) == null ? true : true;
                if (z) {
                    return true;
                }
            } else {
                throw null;
            }
        } while (!z);
        return false;
    }

    /* renamed from: a */
    public final boolean mo4255a(C0934b bVar, C0957n nVar, Object obj) {
        while (C0967p0.m2181a((C0916a1) nVar.f2573i, false, false, (C4618l) new C0933a(this, bVar, nVar, obj), 1, (Object) null) == C0950k1.f2567e) {
            nVar = mo4247a((C0900h) nVar);
            if (nVar == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0051, code lost:
        if (r5 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0053, code lost:
        mo4250a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0058, code lost:
        if ((r7 instanceof p119o.p120a.C0957n) != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005a, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005c, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005d, code lost:
        r0 = (p119o.p120a.C0957n) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x005f, code lost:
        if (r0 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0061, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0063, code lost:
        r7 = r7.mo4237b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0067, code lost:
        if (r7 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0069, code lost:
        r2 = mo4247a((p119o.p120a.p121a.C0900h) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x006d, code lost:
        if (r2 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0073, code lost:
        if (mo4255a(r1, r2, r8) == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0077, code lost:
        return p119o.p120a.C0938g1.f2551b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x007c, code lost:
        return mo4243a(r1, r8);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo4256b(p119o.p120a.C1003v0 r7, java.lang.Object r8) {
        /*
            r6 = this;
            o.a.j1 r0 = r6.mo4246a(r7)
            if (r0 == 0) goto L_0x0080
            boolean r1 = r7 instanceof p119o.p120a.C0932f1.C0934b
            r2 = 0
            if (r1 != 0) goto L_0x000d
            r1 = r2
            goto L_0x000e
        L_0x000d:
            r1 = r7
        L_0x000e:
            o.a.f1$b r1 = (p119o.p120a.C0932f1.C0934b) r1
            if (r1 == 0) goto L_0x0013
            goto L_0x0019
        L_0x0013:
            o.a.f1$b r1 = new o.a.f1$b
            r3 = 0
            r1.<init>(r0, r3, r2)
        L_0x0019:
            monitor-enter(r1)
            int r3 = r1._isCompleting     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x0022
            o.a.a.o r7 = p119o.p120a.C0938g1.f2550a     // Catch:{ all -> 0x007d }
            monitor-exit(r1)
            return r7
        L_0x0022:
            r3 = 1
            r1._isCompleting = r3     // Catch:{ all -> 0x007d }
            if (r1 == r7) goto L_0x0033
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f2539e     // Catch:{ all -> 0x007d }
            boolean r4 = r4.compareAndSet(r6, r7, r1)     // Catch:{ all -> 0x007d }
            if (r4 != 0) goto L_0x0033
            o.a.a.o r7 = p119o.p120a.C0938g1.f2552c     // Catch:{ all -> 0x007d }
            monitor-exit(r1)
            return r7
        L_0x0033:
            boolean r4 = r1.mo4275d()     // Catch:{ all -> 0x007d }
            boolean r5 = r8 instanceof p119o.p120a.C0975s     // Catch:{ all -> 0x007d }
            if (r5 != 0) goto L_0x003d
            r5 = r2
            goto L_0x003e
        L_0x003d:
            r5 = r8
        L_0x003e:
            o.a.s r5 = (p119o.p120a.C0975s) r5     // Catch:{ all -> 0x007d }
            if (r5 == 0) goto L_0x0047
            java.lang.Throwable r5 = r5.f2591a     // Catch:{ all -> 0x007d }
            r1.mo4272a(r5)     // Catch:{ all -> 0x007d }
        L_0x0047:
            java.lang.Object r5 = r1._rootCause     // Catch:{ all -> 0x007d }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x007d }
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r5 = r2
        L_0x0050:
            monitor-exit(r1)
            if (r5 == 0) goto L_0x0056
            r6.mo4250a(r0, r5)
        L_0x0056:
            boolean r0 = r7 instanceof p119o.p120a.C0957n
            if (r0 != 0) goto L_0x005c
            r0 = r2
            goto L_0x005d
        L_0x005c:
            r0 = r7
        L_0x005d:
            o.a.n r0 = (p119o.p120a.C0957n) r0
            if (r0 == 0) goto L_0x0063
            r2 = r0
            goto L_0x006d
        L_0x0063:
            o.a.j1 r7 = r7.mo4237b()
            if (r7 == 0) goto L_0x006d
            o.a.n r2 = r6.mo4247a(r7)
        L_0x006d:
            if (r2 == 0) goto L_0x0078
            boolean r7 = r6.mo4255a(r1, r2, r8)
            if (r7 == 0) goto L_0x0078
            o.a.a.o r7 = p119o.p120a.C0938g1.f2551b
            return r7
        L_0x0078:
            java.lang.Object r7 = r6.mo4243a(r1, r8)
            return r7
        L_0x007d:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        L_0x0080:
            o.a.a.o r7 = p119o.p120a.C0938g1.f2552c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C0932f1.mo4256b(o.a.v0, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public void mo4190b(Object obj) {
    }

    /* renamed from: b */
    public boolean mo4257b(Throwable th) {
        return false;
    }

    /* renamed from: c */
    public void mo4220c(Throwable th) {
        throw th;
    }

    /* renamed from: c */
    public final boolean mo4258c(Object obj) {
        Object obj2 = C0938g1.f2550a;
        boolean z = false;
        if (mo4228f()) {
            while (true) {
                Object i = mo4267i();
                if ((i instanceof C1003v0) && (!(i instanceof C0934b) || ((C0934b) i)._isCompleting == 0)) {
                    obj2 = mo4242a(i, (Object) new C0975s(mo4259d(obj), false, 2));
                    if (obj2 != C0938g1.f2552c) {
                        break;
                    }
                } else {
                    obj2 = C0938g1.f2550a;
                }
            }
            if (obj2 == C0938g1.f2551b) {
                return true;
            }
        }
        if (obj2 == C0938g1.f2550a) {
            obj2 = mo4260e(obj);
        }
        if (!(obj2 == C0938g1.f2550a || obj2 == C0938g1.f2551b)) {
            if (obj2 != C0938g1.f2553d) {
                mo4190b(obj2);
            }
            return z;
        }
        z = true;
        return z;
    }

    /* renamed from: d */
    public String mo4221d() {
        return "Job was cancelled";
    }

    /* renamed from: d */
    public final Throwable mo4259d(Object obj) {
        if (obj != null ? obj instanceof Throwable : true) {
            if (obj != null) {
                return (Throwable) obj;
            }
            return new C0920b1(mo4221d(), null, this);
        } else if (obj != null) {
            return ((C0956m1) obj).mo4263g();
        } else {
            throw new C4557i("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        if (r0 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        mo4250a(((p119o.p120a.C0932f1.C0934b) r2).f2544e, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        return p119o.p120a.C0938g1.f2550a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x007d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0002 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo4260e(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r8.mo4267i()
            boolean r3 = r2 instanceof p119o.p120a.C0932f1.C0934b
            r4 = 1
            if (r3 == 0) goto L_0x004d
            monitor-enter(r2)
            r3 = r2
            o.a.f1$b r3 = (p119o.p120a.C0932f1.C0934b) r3     // Catch:{ all -> 0x004a }
            boolean r3 = r3.mo4276e()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0019
            o.a.a.o r9 = p119o.p120a.C0938g1.f2553d     // Catch:{ all -> 0x004a }
            monitor-exit(r2)
            return r9
        L_0x0019:
            r3 = r2
            o.a.f1$b r3 = (p119o.p120a.C0932f1.C0934b) r3     // Catch:{ all -> 0x004a }
            boolean r3 = r3.mo4275d()     // Catch:{ all -> 0x004a }
            if (r9 != 0) goto L_0x0024
            if (r3 != 0) goto L_0x0031
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x002b
        L_0x0027:
            java.lang.Throwable r1 = r8.mo4259d(r9)     // Catch:{ all -> 0x004a }
        L_0x002b:
            r9 = r2
            o.a.f1$b r9 = (p119o.p120a.C0932f1.C0934b) r9     // Catch:{ all -> 0x004a }
            r9.mo4272a(r1)     // Catch:{ all -> 0x004a }
        L_0x0031:
            r9 = r2
            o.a.f1$b r9 = (p119o.p120a.C0932f1.C0934b) r9     // Catch:{ all -> 0x004a }
            java.lang.Object r9 = r9._rootCause     // Catch:{ all -> 0x004a }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ all -> 0x004a }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r9
        L_0x003d:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0047
            o.a.f1$b r2 = (p119o.p120a.C0932f1.C0934b) r2
            o.a.j1 r9 = r2.f2544e
            r8.mo4250a(r9, r0)
        L_0x0047:
            o.a.a.o r9 = p119o.p120a.C0938g1.f2550a
            return r9
        L_0x004a:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        L_0x004d:
            boolean r3 = r2 instanceof p119o.p120a.C1003v0
            if (r3 == 0) goto L_0x00a5
            if (r1 == 0) goto L_0x0054
            goto L_0x0058
        L_0x0054:
            java.lang.Throwable r1 = r8.mo4259d(r9)
        L_0x0058:
            r3 = r2
            o.a.v0 r3 = (p119o.p120a.C1003v0) r3
            boolean r5 = r3.mo4236a()
            r6 = 0
            if (r5 == 0) goto L_0x0080
            o.a.j1 r2 = r8.mo4246a(r3)
            if (r2 == 0) goto L_0x007a
            o.a.f1$b r5 = new o.a.f1$b
            r5.<init>(r2, r6, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f2539e
            boolean r3 = r7.compareAndSet(r8, r3, r5)
            if (r3 != 0) goto L_0x0076
            goto L_0x007a
        L_0x0076:
            r8.mo4250a(r2, r1)
            goto L_0x007b
        L_0x007a:
            r4 = r6
        L_0x007b:
            if (r4 == 0) goto L_0x0002
            o.a.a.o r9 = p119o.p120a.C0938g1.f2550a
            return r9
        L_0x0080:
            o.a.s r3 = new o.a.s
            r4 = 2
            r3.<init>(r1, r6, r4)
            java.lang.Object r3 = r8.mo4242a(r2, r3)
            o.a.a.o r4 = p119o.p120a.C0938g1.f2550a
            if (r3 == r4) goto L_0x0095
            o.a.a.o r2 = p119o.p120a.C0938g1.f2552c
            if (r3 != r2) goto L_0x0094
            goto L_0x0002
        L_0x0094:
            return r3
        L_0x0095:
            java.lang.String r9 = "Cannot happen in "
            java.lang.String r9 = p213q.p214a.p215a.p216a.C1965a.m4750a(r9, r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L_0x00a5:
            o.a.a.o r9 = p119o.p120a.C0938g1.f2553d
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C0932f1.mo4260e(java.lang.Object):java.lang.Object");
    }

    /* renamed from: e */
    public boolean mo4227e() {
        return true;
    }

    /* renamed from: f */
    public final Object mo4261f(Object obj) {
        Object a;
        do {
            a = mo4242a(mo4267i(), obj);
            if (a == C0938g1.f2550a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Job ");
                sb.append(this);
                sb.append(" is already complete or completing, ");
                sb.append("but is being completed with ");
                sb.append(obj);
                String sb2 = sb.toString();
                Throwable th = null;
                if (!(obj instanceof C0975s)) {
                    obj = null;
                }
                C0975s sVar = (C0975s) obj;
                if (sVar != null) {
                    th = sVar.f2591a;
                }
                throw new IllegalStateException(sb2, th);
            }
        } while (a == C0938g1.f2552c);
        return a;
    }

    /* renamed from: f */
    public boolean mo4228f() {
        return false;
    }

    public <R> R fold(R r, C4622p<? super R, ? super C4584a, ? extends R> pVar) {
        return C4585a.m10230a(this, r, pVar);
    }

    /* renamed from: g */
    public CancellationException mo4263g() {
        Throwable th;
        Object i = mo4267i();
        CancellationException cancellationException = null;
        if (i instanceof C0934b) {
            th = (Throwable) ((C0934b) i)._rootCause;
        } else if (i instanceof C0975s) {
            th = ((C0975s) i).f2591a;
        } else if (!(i instanceof C1003v0)) {
            th = null;
        } else {
            throw new IllegalStateException(C1965a.m4750a("Cannot be cancelling child in this state: ", i).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        StringBuilder a = C1965a.m4756a("Parent job is ");
        a.append(mo4266h(i));
        return new C0920b1(a.toString(), th, this);
    }

    /* renamed from: g */
    public void mo4222g(Object obj) {
    }

    public <E extends C4584a> E get(C4586b<E> bVar) {
        return C4585a.m10231a((C4584a) this, bVar);
    }

    public final C4586b<?> getKey() {
        return C0916a1.f2512d;
    }

    /* renamed from: h */
    public final CancellationException mo4209h() {
        Object i = mo4267i();
        String str = "Job is still new or active: ";
        if (i instanceof C0934b) {
            Throwable th = (Throwable) ((C0934b) i)._rootCause;
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getSimpleName());
                sb.append(" is cancelling");
                CancellationException a = mo4244a(th, sb.toString());
                if (a != null) {
                    return a;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this);
            throw new IllegalStateException(sb2.toString().toString());
        } else if (i instanceof C1003v0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this);
            throw new IllegalStateException(sb3.toString().toString());
        } else if (i instanceof C0975s) {
            return mo4244a(((C0975s) i).f2591a, (String) null);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(getClass().getSimpleName());
            sb4.append(" has completed normally");
            return new C0920b1(sb4.toString(), null, this);
        }
    }

    /* renamed from: i */
    public final Object mo4267i() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C0907l)) {
                return obj;
            }
            ((C0907l) obj).mo4169a(this);
        }
    }

    /* renamed from: j */
    public boolean mo4192j() {
        return false;
    }

    /* renamed from: k */
    public String mo4223k() {
        return getClass().getSimpleName();
    }

    /* renamed from: l */
    public void mo4224l() {
    }

    public C4583f minusKey(C4586b<?> bVar) {
        return C4585a.m10233b(this, bVar);
    }

    public C4583f plus(C4583f fVar) {
        return C4585a.m10232a((C4584a) this, fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (f2539e.compareAndSet(r6, r0, p119o.p120a.C0938g1.f2556g) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (f2539e.compareAndSet(r6, r0, ((p119o.p120a.C0986u0) r0).f2600e) == false) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[ADDED_TO_REGION, LOOP:0: B:0:0x0000->B:13:0x0038, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean start() {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6.mo4267i()
            boolean r1 = r0 instanceof p119o.p120a.C0952l0
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001e
            r1 = r0
            o.a.l0 r1 = (p119o.p120a.C0952l0) r1
            boolean r1 = r1.f2569e
            if (r1 == 0) goto L_0x0013
            goto L_0x0035
        L_0x0013:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f2539e
            o.a.l0 r5 = p119o.p120a.C0938g1.f2556g
            boolean r0 = r1.compareAndSet(r6, r0, r5)
            if (r0 != 0) goto L_0x0030
            goto L_0x0036
        L_0x001e:
            boolean r1 = r0 instanceof p119o.p120a.C0986u0
            if (r1 == 0) goto L_0x0035
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f2539e
            r5 = r0
            o.a.u0 r5 = (p119o.p120a.C0986u0) r5
            o.a.j1 r5 = r5.f2600e
            boolean r0 = r1.compareAndSet(r6, r0, r5)
            if (r0 != 0) goto L_0x0030
            goto L_0x0036
        L_0x0030:
            r6.mo4224l()
            r2 = r4
            goto L_0x0036
        L_0x0035:
            r2 = r3
        L_0x0036:
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x003b
            goto L_0x0000
        L_0x003b:
            return r4
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C0932f1.start():boolean");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo4223k());
        sb2.append('{');
        sb2.append(mo4266h(mo4267i()));
        sb2.append('}');
        sb.append(sb2.toString());
        sb.append('@');
        sb.append(C2286e.m5323d((Object) this));
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo4254a(Throwable th) {
        boolean z = true;
        if (mo4192j()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        C0954m mVar = (C0954m) this._parentHandle;
        if (mVar == null || mVar == C0950k1.f2567e) {
            return z2;
        }
        if (!mVar.mo4290a(th) && !z2) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo4252a(C1003v0 v0Var, Object obj) {
        C0954m mVar = (C0954m) this._parentHandle;
        if (mVar != null) {
            mVar.mo4238f();
            this._parentHandle = C0950k1.f2567e;
        }
        C1004w wVar = null;
        if (!(obj instanceof C0975s)) {
            obj = null;
        }
        C0975s sVar = (C0975s) obj;
        Throwable th = sVar != null ? sVar.f2591a : null;
        String str = " for ";
        String str2 = "Exception in completion handler ";
        if (v0Var instanceof C0929e1) {
            try {
                ((C0929e1) v0Var).mo4271b(th);
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(v0Var);
                sb.append(str);
                sb.append(this);
                mo4220c((Throwable) new C1004w(sb.toString(), th2));
            }
        } else {
            C0947j1 b = v0Var.mo4237b();
            if (b != null) {
                Object g = b.mo4175g();
                if (g != null) {
                    for (C0900h hVar = (C0900h) g; !C4638h.m10272a((Object) hVar, (Object) b); hVar = hVar.mo4176h()) {
                        if (hVar instanceof C0929e1) {
                            C0929e1 e1Var = (C0929e1) hVar;
                            try {
                                e1Var.mo4271b(th);
                            } catch (Throwable th3) {
                                if (wVar != null) {
                                    C2286e.m5240a((Throwable) wVar, th3);
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str2);
                                    sb2.append(e1Var);
                                    sb2.append(str);
                                    sb2.append(this);
                                    wVar = new C1004w(sb2.toString(), th3);
                                }
                            }
                        }
                    }
                    if (wVar != null) {
                        mo4220c((Throwable) wVar);
                        return;
                    }
                    return;
                }
                throw new C4557i("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    /* renamed from: a */
    public final Object mo4243a(C0934b bVar, Object obj) {
        Throwable th = null;
        C0975s sVar = (C0975s) (!(obj instanceof C0975s) ? null : obj);
        Throwable th2 = sVar != null ? sVar.f2591a : null;
        synchronized (bVar) {
            bVar.mo4275d();
            List<Throwable> b = bVar.mo4273b(th2);
            if (!b.isEmpty()) {
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th = next;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) b.get(0);
                }
            } else if (bVar.mo4275d()) {
                th = new C0920b1(mo4221d(), null, this);
            }
            if (th != null) {
                if (b.size() > 1) {
                    Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(b.size()));
                    for (Throwable th3 : b) {
                        if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                            C2286e.m5240a(th, th3);
                        }
                    }
                }
            }
        }
        if (!(th == null || th == th2)) {
            obj = new C0975s(th, false, 2);
        }
        if (th != null) {
            if (mo4254a(th) || mo4257b(th)) {
                if (obj != null) {
                    C0975s.f2590b.compareAndSet((C0975s) obj, 0, 1);
                } else {
                    throw new C4557i("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        mo4222g(obj);
        f2539e.compareAndSet(this, bVar, obj instanceof C1003v0 ? new C1005w0((C1003v0) obj) : obj);
        mo4252a((C1003v0) bVar, obj);
        return obj;
    }

    /* renamed from: h */
    public final String mo4266h(Object obj) {
        String str = "Active";
        if (!(obj instanceof C0934b)) {
            return obj instanceof C1003v0 ? ((C1003v0) obj).mo4236a() ? str : "New" : obj instanceof C0975s ? "Cancelled" : "Completed";
        }
        C0934b bVar = (C0934b) obj;
        if (bVar.mo4275d()) {
            return "Cancelling";
        }
        if (bVar._isCompleting != 0) {
            return "Completing";
        }
        return str;
    }

    /* renamed from: a */
    public final void mo4248a(C0916a1 a1Var) {
        if (a1Var == null) {
            this._parentHandle = C0950k1.f2567e;
            return;
        }
        a1Var.start();
        C0954m a = a1Var.mo4207a(this);
        this._parentHandle = a;
        if (!(mo4267i() instanceof C1003v0)) {
            a.mo4238f();
            this._parentHandle = C0950k1.f2567e;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r4v0, types: [o.a.k1] */
    /* JADX WARNING: type inference failed for: r4v1, types: [o.a.k0] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [o.a.e1, o.a.k0] */
    /* JADX WARNING: type inference failed for: r1v5, types: [o.a.e1] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7, types: [o.a.e1, o.a.k0] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r1v8, types: [o.a.e1] */
    /* JADX WARNING: type inference failed for: r2v6, types: [o.a.j1] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v8, types: [o.a.u0] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object, o.a.k0] */
    /* JADX WARNING: type inference failed for: r1v10, types: [o.a.e1] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0002, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v2
      assigns: []
      uses: []
      mth insns count: 95
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 10 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p119o.p120a.C0949k0 mo4206a(boolean r8, boolean r9, p392u.p401r.p402b.C4618l<? super java.lang.Throwable, p392u.C4560l> r10) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r7.mo4267i()
            boolean r3 = r2 instanceof p119o.p120a.C0952l0
            if (r3 == 0) goto L_0x0037
            r3 = r2
            o.a.l0 r3 = (p119o.p120a.C0952l0) r3
            boolean r4 = r3.f2569e
            if (r4 == 0) goto L_0x0021
            if (r1 == 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            o.a.e1 r1 = r7.mo4245a(r10, r8)
        L_0x0018:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f2539e
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L_0x0002
            return r1
        L_0x0021:
            o.a.j1 r2 = new o.a.j1
            r2.<init>()
            boolean r4 = r3.f2569e
            if (r4 == 0) goto L_0x002b
            goto L_0x0031
        L_0x002b:
            o.a.u0 r4 = new o.a.u0
            r4.<init>(r2)
            r2 = r4
        L_0x0031:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f2539e
            r4.compareAndSet(r7, r3, r2)
            goto L_0x0002
        L_0x0037:
            boolean r3 = r2 instanceof p119o.p120a.C1003v0
            if (r3 == 0) goto L_0x00a1
            r3 = r2
            o.a.v0 r3 = (p119o.p120a.C1003v0) r3
            o.a.j1 r3 = r3.mo4237b()
            if (r3 != 0) goto L_0x0054
            if (r2 == 0) goto L_0x004c
            o.a.e1 r2 = (p119o.p120a.C0929e1) r2
            r7.mo4249a(r2)
            goto L_0x0002
        L_0x004c:
            u.i r8 = new u.i
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>"
            r8.<init>(r9)
            throw r8
        L_0x0054:
            o.a.k1 r4 = p119o.p120a.C0950k1.f2567e
            if (r8 == 0) goto L_0x008a
            boolean r5 = r2 instanceof p119o.p120a.C0932f1.C0934b
            if (r5 == 0) goto L_0x008a
            monitor-enter(r2)
            r5 = r2
            o.a.f1$b r5 = (p119o.p120a.C0932f1.C0934b) r5     // Catch:{ all -> 0x0087 }
            java.lang.Object r5 = r5._rootCause     // Catch:{ all -> 0x0087 }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x0087 }
            if (r5 == 0) goto L_0x0071
            boolean r6 = r10 instanceof p119o.p120a.C0957n     // Catch:{ all -> 0x0087 }
            if (r6 == 0) goto L_0x0085
            r6 = r2
            o.a.f1$b r6 = (p119o.p120a.C0932f1.C0934b) r6     // Catch:{ all -> 0x0087 }
            int r6 = r6._isCompleting     // Catch:{ all -> 0x0087 }
            if (r6 != 0) goto L_0x0085
        L_0x0071:
            if (r1 == 0) goto L_0x0074
            goto L_0x0078
        L_0x0074:
            o.a.e1 r1 = r7.mo4245a(r10, r8)     // Catch:{ all -> 0x0087 }
        L_0x0078:
            boolean r4 = r7.mo4253a(r2, r3, r1)     // Catch:{ all -> 0x0087 }
            if (r4 != 0) goto L_0x0080
            monitor-exit(r2)
            goto L_0x0002
        L_0x0080:
            if (r5 != 0) goto L_0x0084
            monitor-exit(r2)
            return r1
        L_0x0084:
            r4 = r1
        L_0x0085:
            monitor-exit(r2)
            goto L_0x008b
        L_0x0087:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x008a:
            r5 = r0
        L_0x008b:
            if (r5 == 0) goto L_0x0093
            if (r9 == 0) goto L_0x0092
            r10.mo3153b(r5)
        L_0x0092:
            return r4
        L_0x0093:
            if (r1 == 0) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            o.a.e1 r1 = r7.mo4245a(r10, r8)
        L_0x009a:
            boolean r2 = r7.mo4253a(r2, r3, r1)
            if (r2 == 0) goto L_0x0002
            return r1
        L_0x00a1:
            if (r9 == 0) goto L_0x00b1
            boolean r8 = r2 instanceof p119o.p120a.C0975s
            if (r8 != 0) goto L_0x00a8
            r2 = r0
        L_0x00a8:
            o.a.s r2 = (p119o.p120a.C0975s) r2
            if (r2 == 0) goto L_0x00ae
            java.lang.Throwable r0 = r2.f2591a
        L_0x00ae:
            r10.mo3153b(r0)
        L_0x00b1:
            o.a.k1 r8 = p119o.p120a.C0950k1.f2567e
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C0932f1.mo4206a(boolean, boolean, u.r.b.l):o.a.k0");
    }

    /* renamed from: a */
    public final void mo4249a(C0929e1<?> e1Var) {
        C0947j1 j1Var = new C0947j1();
        if (e1Var != null) {
            C0900h.f2487f.lazySet(j1Var, e1Var);
            C0900h.f2486e.lazySet(j1Var, e1Var);
            while (true) {
                if (e1Var.mo4175g() == e1Var) {
                    if (C0900h.f2486e.compareAndSet(e1Var, e1Var, j1Var)) {
                        j1Var.mo4174a((C0900h) e1Var);
                        break;
                    }
                } else {
                    break;
                }
            }
            f2539e.compareAndSet(this, e1Var, e1Var.mo4176h());
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final CancellationException mo4244a(Throwable th, String str) {
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException == null) {
            if (str == null) {
                str = mo4221d();
            }
            cancellationException = new C0920b1(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: a */
    public final Object mo4242a(Object obj, Object obj2) {
        boolean z;
        if (!(obj instanceof C1003v0)) {
            return C0938g1.f2550a;
        }
        if ((!(obj instanceof C0952l0) && !(obj instanceof C0929e1)) || (obj instanceof C0957n) || (obj2 instanceof C0975s)) {
            return mo4256b((C1003v0) obj, obj2);
        }
        C1003v0 v0Var = (C1003v0) obj;
        if (!f2539e.compareAndSet(this, v0Var, C0938g1.m2095a(obj2))) {
            z = false;
        } else {
            mo4222g(obj2);
            mo4252a(v0Var, obj2);
            z = true;
        }
        if (z) {
            return obj2;
        }
        return C0938g1.f2552c;
    }
}
