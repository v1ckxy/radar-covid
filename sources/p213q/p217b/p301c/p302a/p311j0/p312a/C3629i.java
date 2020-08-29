package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.NoSuchElementException;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j.C3636a;

/* renamed from: q.b.c.a.j0.a.i */
public class C3629i extends C3636a {

    /* renamed from: e */
    public int f9024e = 0;

    /* renamed from: f */
    public final int f9025f = this.f9026g.size();

    /* renamed from: g */
    public final /* synthetic */ C3635j f9026g;

    public C3629i(C3635j jVar) {
        this.f9026g = jVar;
    }

    /* renamed from: b */
    public byte mo9653b() {
        int i = this.f9024e;
        if (i < this.f9025f) {
            this.f9024e = i + 1;
            return this.f9026g.mo9666f(i);
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return this.f9024e < this.f9025f;
    }
}
