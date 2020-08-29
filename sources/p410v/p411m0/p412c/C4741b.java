package p410v.p411m0.p412c;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p392u.p401r.p403c.C4638h;
import p410v.p411m0.C4737b;
import p423w.C4882a0;
import p423w.C4886b0;
import p423w.C4892f;
import p423w.C4895h;
import p423w.C4896i;

/* renamed from: v.m0.c.b */
public final class C4741b implements C4882a0 {

    /* renamed from: e */
    public boolean f11150e;

    /* renamed from: f */
    public final /* synthetic */ C4896i f11151f;

    /* renamed from: g */
    public final /* synthetic */ C4742c f11152g;

    /* renamed from: h */
    public final /* synthetic */ C4895h f11153h;

    public C4741b(C4896i iVar, C4742c cVar, C4895h hVar) {
        this.f11151f = iVar;
        this.f11152g = cVar;
        this.f11153h = hVar;
    }

    /* renamed from: b */
    public long mo11077b(C4892f fVar, long j) {
        if (fVar != null) {
            try {
                long b = this.f11151f.mo11077b(fVar, j);
                if (b == -1) {
                    if (!this.f11150e) {
                        this.f11150e = true;
                        this.f11153h.close();
                    }
                    return -1;
                }
                fVar.mo11442a(this.f11153h.getBuffer(), fVar.f11661f - b, b);
                this.f11153h.mo11463l();
                return b;
            } catch (IOException e) {
                if (!this.f11150e) {
                    this.f11150e = true;
                    this.f11152g.mo10997b();
                }
                throw e;
            }
        } else {
            C4638h.m10271a("sink");
            throw null;
        }
    }

    /* renamed from: b */
    public C4886b0 mo11078b() {
        return this.f11151f.mo11078b();
    }

    public void close() {
        if (!this.f11150e && !C4737b.m10469a((C4882a0) this, 100, TimeUnit.MILLISECONDS)) {
            this.f11150e = true;
            this.f11152g.mo10997b();
        }
        this.f11151f.close();
    }
}
