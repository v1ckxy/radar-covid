package p003f.p004a.p005a.p006a.p010d;

import p003f.p004a.p005a.p006a.p007a.C0413b;
import p003f.p004a.p005a.p006a.p007a.C0427g;
import p003f.p004a.p005a.p006a.p009c.C0443e;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.a.d.q */
public final class C0490q {

    /* renamed from: a */
    public final C0413b f1879a;

    /* renamed from: b */
    public final C0427g f1880b;

    /* renamed from: c */
    public final C0443e f1881c;

    public C0490q(C0413b bVar, C0427g gVar, C0443e eVar) {
        if (bVar == null) {
            C4638h.m10271a("apiRepository");
            throw null;
        } else if (gVar == null) {
            C4638h.m10271a("preferencesRepository");
            throw null;
        } else if (eVar != null) {
            this.f1879a = bVar;
            this.f1880b = gVar;
            this.f1881c = eVar;
        } else {
            C4638h.m10271a("questionsDataMapper");
            throw null;
        }
    }
}
