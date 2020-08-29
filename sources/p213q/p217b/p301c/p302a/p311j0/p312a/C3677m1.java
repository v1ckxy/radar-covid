package p213q.p217b.p301c.p302a.p311j0.p312a;

/* renamed from: q.b.c.a.j0.a.m1 */
public abstract class C3677m1<T, B> {
    /* renamed from: a */
    public abstract B mo9837a();

    /* renamed from: a */
    public abstract B mo9838a(Object obj);

    /* renamed from: a */
    public abstract void mo9839a(B b, int i, C3635j jVar);

    /* renamed from: a */
    public abstract void mo9840a(Object obj, B b);

    /* renamed from: a */
    public final boolean mo9841a(B b, C3622f1 f1Var) {
        int b2 = f1Var.mo9569b();
        int i = b2 >>> 3;
        int i2 = b2 & 7;
        if (i2 == 0) {
            ((C3680n1) b).mo9859a((i << 3) | 0, (Object) Long.valueOf(f1Var.mo9609q()));
            return true;
        } else if (i2 == 1) {
            ((C3680n1) b).mo9859a((i << 3) | 1, (Object) Long.valueOf(f1Var.mo9579d()));
            return true;
        } else if (i2 == 2) {
            mo9839a(b, i, f1Var.mo9599l());
            return true;
        } else if (i2 == 3) {
            C3680n1 c = C3680n1.m8772c();
            int i3 = i << 3;
            int i4 = i3 | 4;
            while (f1Var.mo9595j() != Integer.MAX_VALUE) {
                if (!mo9841a((B) c, f1Var)) {
                    break;
                }
            }
            if (i4 == f1Var.mo9569b()) {
                c.f9122e = false;
                ((C3680n1) b).mo9859a(i3 | 3, (Object) c);
                return true;
            }
            throw C3606c0.m8174a();
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                ((C3680n1) b).mo9859a((i << 3) | 5, (Object) Integer.valueOf(f1Var.mo9591h()));
                return true;
            }
            throw C3606c0.m8177d();
        }
    }

    /* renamed from: a */
    public abstract boolean mo9842a(C3622f1 f1Var);
}
