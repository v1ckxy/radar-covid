package p003f.p004a.p005a.p006a.p010d;

import p003f.p004a.p005a.p006a.p007a.C0413b;
import p003f.p004a.p005a.p006a.p007a.C0425e;
import p003f.p004a.p005a.p006a.p007a.C0427g;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.a.d.u */
public final class C0494u {

    /* renamed from: a */
    public final C0425e f1886a;

    /* renamed from: b */
    public final C0427g f1887b;

    /* renamed from: c */
    public final C0413b f1888c;

    public C0494u(C0425e eVar, C0427g gVar, C0413b bVar) {
        if (eVar == null) {
            C4638h.m10271a("contactTracingRepository");
            throw null;
        } else if (gVar == null) {
            C4638h.m10271a("preferencesRepository");
            throw null;
        } else if (bVar != null) {
            this.f1886a = eVar;
            this.f1887b = gVar;
            this.f1888c = bVar;
        } else {
            C4638h.m10271a("apiRepository");
            throw null;
        }
    }
}
