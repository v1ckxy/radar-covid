package p119o.p120a;

import androidx.recyclerview.widget.RecyclerView;
import p119o.p120a.C0958n0.C0959a;
import p119o.p120a.C0958n0.C0960b;
import p119o.p120a.p121a.C0894b;
import p119o.p120a.p121a.C0903j;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: o.a.m0 */
public abstract class C0955m0 extends C1010z {

    /* renamed from: f */
    public long f2570f;

    /* renamed from: g */
    public boolean f2571g;

    /* renamed from: h */
    public C0894b<C0943i0<?>> f2572h;

    /* renamed from: a */
    public static /* synthetic */ void m2130a(C0955m0 m0Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            m0Var.mo4294a(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    /* renamed from: b */
    public static /* synthetic */ void m2131b(C0955m0 m0Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            m0Var.mo4296c(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: a */
    public final void mo4294a(boolean z) {
        long b = this.f2570f - mo4295b(z);
        this.f2570f = b;
        if (b <= 0 && this.f2571g) {
            C0958n0 n0Var = (C0958n0) this;
            C0968p1 p1Var = C0968p1.f2584b;
            C0968p1.f2583a.set(null);
            n0Var._isCompleted = 1;
            while (true) {
                Object obj = n0Var._queue;
                if (obj == null) {
                    if (C0958n0.f2574i.compareAndSet(n0Var, null, C0970q0.f2587b)) {
                        break;
                    }
                } else if (obj instanceof C0903j) {
                    ((C0903j) obj).mo4184a();
                    break;
                } else if (obj == C0970q0.f2587b) {
                    break;
                } else {
                    C0903j jVar = new C0903j(8, true);
                    jVar.mo4183a((Runnable) obj);
                    if (C0958n0.f2574i.compareAndSet(n0Var, obj, jVar)) {
                        break;
                    }
                }
            }
            do {
            } while (n0Var.mo4298o() <= 0);
            long nanoTime = System.nanoTime();
            while (true) {
                C0960b bVar = (C0960b) n0Var._delayed;
                if (bVar == null) {
                    break;
                }
                C0959a aVar = (C0959a) bVar.mo4201c();
                if (aVar == null) {
                    break;
                }
                n0Var.mo4309a(nanoTime, aVar);
            }
        }
    }

    /* renamed from: b */
    public final long mo4295b(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: c */
    public final void mo4296c(boolean z) {
        this.f2570f = mo4295b(z) + this.f2570f;
        if (!z) {
            this.f2571g = true;
        }
    }

    /* renamed from: m */
    public final boolean mo4297m() {
        return this.f2570f >= mo4295b(true);
    }

    /* renamed from: o */
    public long mo4298o() {
        if (!mo4299r()) {
            return RecyclerView.FOREVER_NS;
        }
        return 0;
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4299r() {
        /*
            r7 = this;
            o.a.a.b<o.a.i0<?>> r0 = r7.f2572h
            r1 = 0
            if (r0 == 0) goto L_0x002f
            int r2 = r0.f2480b
            int r3 = r0.f2481c
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x000e
            goto L_0x001e
        L_0x000e:
            java.lang.Object[] r3 = r0.f2479a
            r6 = r3[r2]
            r3[r2] = r4
            int r2 = r2 + r5
            int r3 = r3.length
            int r3 = r3 + -1
            r2 = r2 & r3
            r0.f2480b = r2
            if (r6 == 0) goto L_0x0027
            r4 = r6
        L_0x001e:
            o.a.i0 r4 = (p119o.p120a.C0943i0) r4
            if (r4 == 0) goto L_0x0026
            r4.run()
            return r5
        L_0x0026:
            return r1
        L_0x0027:
            u.i r0 = new u.i
            java.lang.String r1 = "null cannot be cast to non-null type T"
            r0.<init>(r1)
            throw r0
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C0955m0.mo4299r():boolean");
    }

    /* renamed from: a */
    public final void mo4293a(C0943i0<?> i0Var) {
        C0894b<C0943i0<?>> bVar = this.f2572h;
        if (bVar == null) {
            bVar = new C0894b<>();
            this.f2572h = bVar;
        }
        Object[] objArr = bVar.f2479a;
        int i = bVar.f2481c;
        objArr[i] = i0Var;
        int length = (objArr.length - 1) & (i + 1);
        bVar.f2481c = length;
        int i2 = bVar.f2480b;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[(length2 << 1)];
            C2286e.m5271a(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = bVar.f2479a;
            int length3 = objArr3.length;
            int i3 = bVar.f2480b;
            C2286e.m5271a(objArr3, objArr2, length3 - i3, 0, i3, 4);
            bVar.f2479a = objArr2;
            bVar.f2480b = 0;
            bVar.f2481c = length2;
        }
    }
}
