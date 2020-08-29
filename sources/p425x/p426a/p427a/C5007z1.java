package p425x.p426a.p427a;

import java.io.InputStream;

/* renamed from: x.a.a.z1 */
public abstract class C5007z1 extends InputStream {

    /* renamed from: e */
    public final InputStream f11897e;

    /* renamed from: f */
    public int f11898f;

    public C5007z1(InputStream inputStream, int i) {
        this.f11897e = inputStream;
        this.f11898f = i;
    }

    /* renamed from: a */
    public void mo11658a(boolean z) {
        InputStream inputStream = this.f11897e;
        if (inputStream instanceof C4998w1) {
            C4998w1 w1Var = (C4998w1) inputStream;
            w1Var.f11885j = z;
            w1Var.mo11645a();
        }
    }
}
