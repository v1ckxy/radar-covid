package p003f.p004a.p005a.p012b.p068j.p083c;

import p003f.p004a.p005a.p012b.p068j.p084d.C0645a;
import p003f.p004a.p005a.p012b.p068j.p084d.C0646b;
import p003f.p004a.p005a.p012b.p068j.p084d.C0647c;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.j.c.a */
public final class C0643a implements C0645a {

    /* renamed from: a */
    public final C0647c f2083a;

    /* renamed from: b */
    public final C0646b f2084b;

    public C0643a(C0647c cVar, C0646b bVar) {
        if (cVar == null) {
            C4638h.m10271a("view");
            throw null;
        } else if (bVar != null) {
            this.f2083a = cVar;
            this.f2084b = bVar;
        } else {
            C4638h.m10271a("router");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3830a() {
    }

    /* renamed from: a */
    public void mo3831a(boolean z) {
        C0646b bVar;
        boolean z2;
        if (!z) {
            bVar = this.f2084b;
            z2 = false;
        } else if (this.f2083a.mo3189r()) {
            bVar = this.f2084b;
            z2 = true;
        } else {
            this.f2083a.mo3191t();
            return;
        }
        bVar.mo3836a(z2);
        this.f2083a.finish();
    }

    /* renamed from: b */
    public void mo3832b() {
        this.f2083a.mo3190s();
    }

    /* renamed from: b */
    public void mo3833b(boolean z) {
        if (z) {
            this.f2083a.mo3184a();
        } else {
            this.f2083a.mo3188l();
        }
    }

    /* renamed from: c */
    public void mo3834c() {
        this.f2083a.finish();
    }

    /* renamed from: d */
    public void mo3835d() {
        this.f2084b.mo3836a(true);
        this.f2083a.finish();
    }
}
