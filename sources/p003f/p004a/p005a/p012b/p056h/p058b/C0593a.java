package p003f.p004a.p005a.p012b.p056h.p058b;

import p003f.p004a.p005a.p006a.p010d.C0479k;
import p003f.p004a.p005a.p012b.p056h.p059c.C0595a;
import p003f.p004a.p005a.p012b.p056h.p059c.C0596b;
import p003f.p004a.p005a.p012b.p056h.p059c.C0597c;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.h.b.a */
public final class C0593a implements C0595a {

    /* renamed from: a */
    public final C0597c f2026a;

    /* renamed from: b */
    public final C0596b f2027b;

    /* renamed from: c */
    public final C0479k f2028c;

    public C0593a(C0597c cVar, C0596b bVar, C0479k kVar) {
        if (cVar == null) {
            C4638h.m10271a("view");
            throw null;
        } else if (bVar == null) {
            C4638h.m10271a("router");
            throw null;
        } else if (kVar != null) {
            this.f2026a = cVar;
            this.f2027b = bVar;
            this.f2028c = kVar;
        } else {
            C4638h.m10271a("mainUseCase");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3794a() {
        this.f2027b.mo3803a(false);
    }

    /* renamed from: a */
    public void mo3795a(boolean z) {
        this.f2027b.mo3803a(z);
    }

    /* renamed from: b */
    public void mo3796b() {
        this.f2028c.f1854b.mo3656c();
    }

    /* renamed from: c */
    public void mo3797c() {
        this.f2026a.finish();
    }

    /* renamed from: d */
    public void mo3798d() {
        this.f2026a.mo3176a();
    }

    /* renamed from: e */
    public void mo3799e() {
        this.f2027b.mo3802a();
    }

    /* renamed from: f */
    public void mo3800f() {
        this.f2027b.mo3804b();
    }

    /* renamed from: g */
    public void mo3801g() {
        if (this.f2028c.f1853a.mo3689i()) {
            this.f2027b.mo3802a();
        } else {
            this.f2027b.mo3805c();
        }
    }
}
