package p119o.p120a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p119o.p120a.p121a.C0910o;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4554g;
import p392u.C4560l;
import p392u.p395p.C4580d;
import p392u.p395p.C4583f;
import p392u.p395p.p396j.C4590a;
import p392u.p395p.p397k.p398a.C4596d;
import p392u.p401r.p402b.C4618l;

/* renamed from: o.a.j */
public class C0945j<T> extends C0943i0<T> implements C0942i<T>, C4596d {

    /* renamed from: j */
    public static final AtomicIntegerFieldUpdater f2560j = AtomicIntegerFieldUpdater.newUpdater(C0945j.class, "_decision");

    /* renamed from: k */
    public static final AtomicReferenceFieldUpdater f2561k = AtomicReferenceFieldUpdater.newUpdater(C0945j.class, Object.class, "_state");
    public volatile int _decision = 0;
    public volatile Object _parentHandle = null;
    public volatile Object _state = C0927e.f2527e;

    /* renamed from: h */
    public final C4583f f2562h;

    /* renamed from: i */
    public final C4580d<T> f2563i;

    public C0945j(C4580d<? super T> dVar, int i) {
        super(i);
        this.f2563i = dVar;
        this.f2562h = dVar.mo4219b();
    }

    /* renamed from: a */
    public final C4580d<T> mo4239a() {
        return this.f2563i;
    }

    /* renamed from: a */
    public final void mo4284a(C4618l<? super Throwable, C4560l> lVar, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("It's prohibited to register multiple handlers, tried to register ");
        sb.append(lVar);
        sb.append(", already has ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    public boolean mo4285a(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C0953l1)) {
                return false;
            }
            z = obj instanceof C0939h;
        } while (!f2561k.compareAndSet(this, obj, new C0948k(this, th, z)));
        if (z) {
            try {
                ((C1007x0) ((C0939h) obj)).f2655e.mo3153b(th);
            } catch (Throwable th2) {
                C4583f fVar = this.f2562h;
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in cancellation handler for ");
                sb.append(this);
                C2286e.m5249a(fVar, (Throwable) new C1004w(sb.toString(), th2));
            }
        }
        mo4286d();
        mo4283a(0);
        return true;
    }

    /* renamed from: b */
    public <T> T mo4281b(Object obj) {
        return obj instanceof C0980t ? ((C0980t) obj).f2593a : obj instanceof C0985u ? ((C0985u) obj).f2598a : obj;
    }

    /* renamed from: b */
    public C4583f mo4219b() {
        return this.f2562h;
    }

    /* renamed from: c */
    public Object mo4240c() {
        return this._state;
    }

    /* renamed from: d */
    public final void mo4286d() {
        if (!mo4288f()) {
            C0949k0 k0Var = (C0949k0) this._parentHandle;
            if (k0Var != null) {
                k0Var.mo4238f();
            }
            this._parentHandle = C0950k1.f2567e;
        }
    }

    /* renamed from: e */
    public final Object mo4287e() {
        boolean z;
        boolean z2 = !(this._state instanceof C0953l1);
        if (this.f2559g == 0) {
            C4580d<T> dVar = this.f2563i;
            Throwable th = null;
            if (!(dVar instanceof C0931f0)) {
                dVar = null;
            }
            C0931f0 f0Var = (C0931f0) dVar;
            if (f0Var != null) {
                while (true) {
                    Object obj = f0Var._reusableCancellableContinuation;
                    C0910o oVar = C0937g0.f2549b;
                    if (obj == oVar) {
                        if (C0931f0.f2533m.compareAndSet(f0Var, oVar, this)) {
                            break;
                        }
                    } else if (obj != null) {
                        if (!(obj instanceof Throwable)) {
                            throw new IllegalStateException(C1965a.m4750a("Inconsistent state ", obj).toString());
                        } else if (C0931f0.f2533m.compareAndSet(f0Var, obj, null)) {
                            th = (Throwable) obj;
                        } else {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                }
                if (th != null) {
                    if (!z2) {
                        mo4285a(th);
                    }
                    z2 = true;
                }
            }
        }
        if (!z2 && ((C0949k0) this._parentHandle) == null) {
            C0916a1 a1Var = (C0916a1) this.f2563i.mo4219b().get(C0916a1.f2512d);
            if (a1Var != null) {
                a1Var.start();
                C0949k0 a = C0967p0.m2181a(a1Var, true, false, (C4618l) new C0951l(a1Var, this), 2, (Object) null);
                this._parentHandle = a;
                if ((!(this._state instanceof C0953l1)) && !mo4288f()) {
                    a.mo4238f();
                    this._parentHandle = C0950k1.f2567e;
                }
            }
        }
        while (true) {
            int i = this._decision;
            z = false;
            if (i == 0) {
                if (f2560j.compareAndSet(this, 0, 1)) {
                    z = true;
                    break;
                }
            } else if (i != 2) {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z) {
            return C4590a.COROUTINE_SUSPENDED;
        }
        Object obj2 = this._state;
        if (obj2 instanceof C0975s) {
            throw ((C0975s) obj2).f2591a;
        }
        if (this.f2559g == 1) {
            C0916a1 a1Var2 = (C0916a1) this.f2562h.get(C0916a1.f2512d);
            if (a1Var2 != null && !a1Var2.mo4208a()) {
                CancellationException h = a1Var2.mo4209h();
                mo4279a(obj2, (Throwable) h);
                throw h;
            }
        }
        return mo4281b(obj2);
    }

    /* renamed from: f */
    public final boolean mo4288f() {
        C4580d<T> dVar = this.f2563i;
        if (dVar instanceof C0931f0) {
            Object obj = ((C0931f0) dVar)._reusableCancellableContinuation;
            if (obj != null && (!(obj instanceof C0945j) || obj == this)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CancellableContinuation");
        sb.append('(');
        sb.append(C2286e.m5286b(this.f2563i));
        sb.append("){");
        sb.append(this._state);
        sb.append("}@");
        sb.append(C2286e.m5323d((Object) this));
        return sb.toString();
    }

    /* renamed from: a */
    public void mo4279a(Object obj, Throwable th) {
        if (obj instanceof C0985u) {
            try {
                ((C0985u) obj).f2599b.mo3153b(th);
            } catch (Throwable th2) {
                C4583f fVar = this.f2562h;
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in cancellation handler for ");
                sb.append(this);
                C2286e.m5249a(fVar, (Throwable) new C1004w(sb.toString(), th2));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4283a(int r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r5._decision
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0017
            if (r0 != r2) goto L_0x000b
            r0 = r3
            goto L_0x0020
        L_0x000b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0017:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f2560j
            boolean r0 = r0.compareAndSet(r5, r3, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r2
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            u.p.d<T> r0 = r5.f2563i
            if (r6 == 0) goto L_0x0029
            if (r6 != r2) goto L_0x002a
        L_0x0029:
            r3 = r2
        L_0x002a:
            if (r3 == 0) goto L_0x007c
            boolean r3 = r0 instanceof p119o.p120a.C0931f0
            if (r3 == 0) goto L_0x007c
            boolean r3 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5314c(r6)
            int r4 = r5.f2559g
            boolean r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5314c(r4)
            if (r3 != r4) goto L_0x007c
            r6 = r0
            o.a.f0 r6 = (p119o.p120a.C0931f0) r6
            o.a.z r6 = r6.f2537k
            u.p.f r0 = r0.mo4219b()
            boolean r3 = r6.mo4320b(r0)
            if (r3 == 0) goto L_0x004f
            r6.mo4301a(r0, r5)
            goto L_0x007f
        L_0x004f:
            o.a.p1 r6 = p119o.p120a.C0968p1.f2584b
            o.a.m0 r6 = p119o.p120a.C0968p1.m2253a()
            boolean r0 = r6.mo4297m()
            if (r0 == 0) goto L_0x005f
            r6.mo4293a(r5)
            goto L_0x007f
        L_0x005f:
            r6.mo4296c(r2)
            u.p.d<T> r0 = r5.f2563i     // Catch:{ all -> 0x006e }
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5243a(r5, r0, r1)     // Catch:{ all -> 0x006e }
        L_0x0067:
            boolean r0 = r6.mo4299r()     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0067
            goto L_0x0073
        L_0x006e:
            r0 = move-exception
            r1 = 0
            r5.mo4280a(r0, r1)     // Catch:{ all -> 0x0077 }
        L_0x0073:
            r6.mo4294a(r2)
            goto L_0x007f
        L_0x0077:
            r0 = move-exception
            r6.mo4294a(r2)
            throw r0
        L_0x007c:
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5243a(r5, r0, r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C0945j.mo4283a(int):void");
    }

    /* renamed from: a */
    public void mo4278a(C4618l<? super Throwable, C4560l> lVar) {
        Object obj;
        Throwable th = null;
        Object obj2 = null;
        do {
            obj = this._state;
            if (obj instanceof C0927e) {
                if (obj2 == null) {
                    obj2 = lVar instanceof C0939h ? (C0939h) lVar : new C1007x0(lVar);
                }
            } else if (obj instanceof C0939h) {
                mo4284a(lVar, obj);
                throw null;
            } else if (obj instanceof C0948k) {
                C0948k kVar = (C0948k) obj;
                if (kVar == null) {
                    throw null;
                } else if (C0975s.f2590b.compareAndSet(kVar, 0, 1)) {
                    try {
                        if (!(obj instanceof C0975s)) {
                            obj = null;
                        }
                        C0975s sVar = (C0975s) obj;
                        if (sVar != null) {
                            th = sVar.f2591a;
                        }
                        lVar.mo3153b(th);
                    } catch (Throwable th2) {
                        C4583f fVar = this.f2562h;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in cancellation handler for ");
                        sb.append(this);
                        C2286e.m5249a(fVar, (Throwable) new C1004w(sb.toString(), th2));
                    }
                    return;
                } else {
                    mo4284a(lVar, obj);
                    throw null;
                }
            } else {
                return;
            }
        } while (!f2561k.compareAndSet(this, obj, obj2));
    }

    /* renamed from: a */
    public void mo4217a(Object obj) {
        Object obj2;
        Throwable b = C4554g.m10211b(obj);
        if (b != null) {
            obj = new C0975s(b, false, 2);
        }
        int i = this.f2559g;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof C0953l1)) {
                if (obj2 instanceof C0948k) {
                    C0948k kVar = (C0948k) obj2;
                    if (kVar == null) {
                        throw null;
                    } else if (C0948k.f2566c.compareAndSet(kVar, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(C1965a.m4750a("Already resumed, but proposed with update ", obj).toString());
            }
        } while (!f2561k.compareAndSet(this, obj2, obj));
        mo4286d();
        mo4283a(i);
    }
}
