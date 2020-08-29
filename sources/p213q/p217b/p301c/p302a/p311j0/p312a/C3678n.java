package p213q.p217b.p301c.p302a.p311j0.p312a;

/* renamed from: q.b.c.a.j0.a.n */
public final class C3678n implements C3722v1 {

    /* renamed from: a */
    public final C3670m f9116a;

    public C3678n(C3670m mVar) {
        C3594b0.m8166a(mVar, "output");
        C3670m mVar2 = mVar;
        this.f9116a = mVar2;
    }

    /* renamed from: a */
    public void mo9843a(int i, double d) {
        C3670m mVar = this.f9116a;
        if (mVar != null) {
            mVar.mo9801a(i, Double.doubleToRawLongBits(d));
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo9847a(int i, Object obj) {
        if (obj instanceof C3635j) {
            this.f9116a.mo9812b(i, (C3635j) obj);
        } else {
            this.f9116a.mo9804a(i, (C3706s0) obj);
        }
    }

    /* renamed from: b */
    public void mo9849b(int i, Object obj, C3625g1 g1Var) {
        this.f9116a.mo9805a(i, (C3706s0) obj, g1Var);
    }

    /* renamed from: a */
    public void mo9844a(int i, float f) {
        C3670m mVar = this.f9116a;
        if (mVar != null) {
            mVar.mo9800a(i, Float.floatToRawIntBits(f));
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public void mo9848a(int i, Object obj, C3625g1 g1Var) {
        C3670m mVar = this.f9116a;
        C3706s0 s0Var = (C3706s0) obj;
        mVar.mo9815c(i, 3);
        g1Var.mo9646a(s0Var, (C3722v1) mVar.f9105a);
        mVar.mo9815c(i, 4);
    }

    /* renamed from: a */
    public void mo9845a(int i, int i2) {
        this.f9116a.mo9816d(i, C3670m.m8673j(i2));
    }

    /* renamed from: a */
    public void mo9846a(int i, long j) {
        this.f9116a.mo9811b(i, C3670m.m8659e(j));
    }
}
