package p410v.p411m0.p412c;

import java.io.IOException;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p423w.C4892f;
import p423w.C4899k;
import p423w.C4915y;

/* renamed from: v.m0.c.f */
public class C4751f extends C4899k {

    /* renamed from: f */
    public boolean f11201f;

    /* renamed from: g */
    public final C4618l<IOException, C4560l> f11202g;

    public C4751f(C4915y yVar, C4618l<? super IOException, C4560l> lVar) {
        if (yVar == null) {
            C4638h.m10271a("delegate");
            throw null;
        } else if (lVar != null) {
            super(yVar);
            this.f11202g = lVar;
        } else {
            C4638h.m10271a("onException");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11105a(C4892f fVar, long j) {
        if (fVar == null) {
            C4638h.m10271a("source");
            throw null;
        } else if (this.f11201f) {
            fVar.skip(j);
        } else {
            try {
                this.f11669e.mo11105a(fVar, j);
            } catch (IOException e) {
                this.f11201f = true;
                this.f11202g.mo3153b(e);
            }
        }
    }

    public void close() {
        if (!this.f11201f) {
            try {
                super.close();
            } catch (IOException e) {
                this.f11201f = true;
                this.f11202g.mo3153b(e);
            }
        }
    }

    public void flush() {
        if (!this.f11201f) {
            try {
                this.f11669e.flush();
            } catch (IOException e) {
                this.f11201f = true;
                this.f11202g.mo3153b(e);
            }
        }
    }
}
