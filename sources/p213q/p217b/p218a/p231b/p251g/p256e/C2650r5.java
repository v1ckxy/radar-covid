package p213q.p217b.p218a.p231b.p251g.p256e;

import p213q.p217b.p218a.p231b.p251g.p256e.C2615p5.C2616a;

/* renamed from: q.b.a.b.g.e.r5 */
public final class C2650r5 implements C2584n9 {

    /* renamed from: a */
    public final C2615p5 f6834a;

    public C2650r5(C2615p5 p5Var) {
        C2546l6.m6114a(p5Var, "output");
        C2615p5 p5Var2 = p5Var;
        this.f6834a = p5Var2;
    }

    /* renamed from: a */
    public final void mo7977a(int i, double d) {
        C2615p5 p5Var = this.f6834a;
        if (p5Var != null) {
            long doubleToRawLongBits = Double.doubleToRawLongBits(d);
            C2616a aVar = (C2616a) p5Var;
            aVar.mo7946b((i << 3) | 1);
            aVar.mo7947b(doubleToRawLongBits);
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo7986b(int i, long j) {
        C2616a aVar = (C2616a) this.f6834a;
        aVar.mo7946b((i << 3) | 1);
        aVar.mo7947b(j);
    }

    /* renamed from: c */
    public final void mo7989c(int i, long j) {
        C2616a aVar = (C2616a) this.f6834a;
        aVar.mo7946b((i << 3) | 0);
        aVar.mo7945a(j);
    }

    /* renamed from: d */
    public final void mo7991d(int i, long j) {
        C2616a aVar = (C2616a) this.f6834a;
        aVar.mo7946b((i << 3) | 1);
        aVar.mo7947b(j);
    }

    /* renamed from: e */
    public final void mo7992e(int i, long j) {
        C2615p5 p5Var = this.f6834a;
        if (p5Var != null) {
            long e = C2615p5.m6254e(j);
            C2616a aVar = (C2616a) p5Var;
            aVar.mo7946b((i << 3) | 0);
            aVar.mo7945a(e);
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo7987b(int i, Object obj, C2455g8 g8Var) {
        C2615p5 p5Var = this.f6834a;
        C2619p7 p7Var = (C2619p7) obj;
        int i2 = i << 3;
        ((C2616a) p5Var).mo7946b(i2 | 3);
        g8Var.mo7680a(p7Var, (C2584n9) p5Var.f6801a);
        ((C2616a) p5Var).mo7946b(i2 | 4);
    }

    /* renamed from: c */
    public final void mo7988c(int i, int i2) {
        C2616a aVar = (C2616a) this.f6834a;
        aVar.mo7946b((i << 3) | 0);
        aVar.mo7946b(i2);
    }

    /* renamed from: d */
    public final void mo7990d(int i, int i2) {
        C2615p5 p5Var = this.f6834a;
        if (p5Var != null) {
            int n = C2615p5.m6266n(i2);
            C2616a aVar = (C2616a) p5Var;
            aVar.mo7946b((i << 3) | 0);
            aVar.mo7946b(n);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo7978a(int i, float f) {
        C2615p5 p5Var = this.f6834a;
        if (p5Var != null) {
            int floatToRawIntBits = Float.floatToRawIntBits(f);
            C2616a aVar = (C2616a) p5Var;
            aVar.mo7946b((i << 3) | 5);
            aVar.mo7948c(floatToRawIntBits);
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo7985b(int i, int i2) {
        C2616a aVar = (C2616a) this.f6834a;
        aVar.mo7946b((i << 3) | 5);
        aVar.mo7948c(i2);
    }

    /* renamed from: a */
    public final void mo7979a(int i, int i2) {
        C2616a aVar = (C2616a) this.f6834a;
        aVar.mo7946b((i << 3) | 5);
        aVar.mo7948c(i2);
    }

    /* renamed from: a */
    public final void mo7980a(int i, long j) {
        C2616a aVar = (C2616a) this.f6834a;
        aVar.mo7946b((i << 3) | 0);
        aVar.mo7945a(j);
    }

    /* renamed from: a */
    public final void mo7983a(int i, C2435f5 f5Var) {
        C2616a aVar = (C2616a) this.f6834a;
        aVar.mo7946b((i << 3) | 2);
        aVar.mo7952b(f5Var);
    }

    /* renamed from: a */
    public final void mo7981a(int i, Object obj) {
        if (obj instanceof C2435f5) {
            C2435f5 f5Var = (C2435f5) obj;
            C2616a aVar = (C2616a) this.f6834a;
            aVar.mo7954f(1, 3);
            aVar.mo7955g(2, i);
            aVar.mo7950b(3, f5Var);
            aVar.mo7954f(1, 4);
            return;
        }
        C2619p7 p7Var = (C2619p7) obj;
        C2616a aVar2 = (C2616a) this.f6834a;
        aVar2.mo7954f(1, 3);
        aVar2.mo7955g(2, i);
        aVar2.mo7954f(3, 2);
        aVar2.mo7953c(p7Var);
        aVar2.mo7954f(1, 4);
    }

    /* renamed from: a */
    public final void mo7982a(int i, Object obj, C2455g8 g8Var) {
        C2619p7 p7Var = (C2619p7) obj;
        C2616a aVar = (C2616a) this.f6834a;
        aVar.mo7946b((i << 3) | 2);
        C2730w4 w4Var = (C2730w4) p7Var;
        C2490i6 i6Var = (C2490i6) w4Var;
        int i2 = i6Var.zzc;
        if (i2 == -1) {
            i2 = g8Var.mo7686d(w4Var);
            i6Var.zzc = i2;
        }
        aVar.mo7946b(i2);
        g8Var.mo7680a(p7Var, (C2584n9) aVar.f6801a);
    }

    /* renamed from: a */
    public final void mo7984a(int i, boolean z) {
        C2616a aVar = (C2616a) this.f6834a;
        aVar.mo7946b((i << 3) | 0);
        aVar.mo7942a(z ? (byte) 1 : 0);
    }
}
