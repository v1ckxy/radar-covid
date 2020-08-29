package p003f.p004a.p005a.p006a.p010d;

import p003f.p004a.p005a.p006a.p007a.C0413b;
import p003f.p004a.p005a.p006a.p007a.C0425e;
import p003f.p004a.p005a.p006a.p007a.C0427g;
import p003f.p004a.p005a.p006a.p007a.C0433j;
import p003f.p004a.p005a.p006a.p009c.C0440c;
import p003f.p004a.p005a.p006a.p009c.C0446g;
import p003f.p004a.p005a.p006a.p009c.C0448i;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.a.d.l0 */
public final class C0484l0 {

    /* renamed from: a */
    public final C0413b f1860a;

    /* renamed from: b */
    public final C0427g f1861b;

    /* renamed from: c */
    public final C0425e f1862c;

    /* renamed from: d */
    public final C0448i f1863d;

    /* renamed from: e */
    public final C0440c f1864e;

    /* renamed from: f */
    public final C0446g f1865f;

    /* renamed from: g */
    public final C0433j f1866g;

    public C0484l0(C0413b bVar, C0427g gVar, C0425e eVar, C0448i iVar, C0440c cVar, C0446g gVar2, C0433j jVar) {
        if (bVar == null) {
            C4638h.m10271a("apiRepository");
            throw null;
        } else if (gVar == null) {
            C4638h.m10271a("preferencesRepository");
            throw null;
        } else if (eVar == null) {
            C4638h.m10271a("contactTracingRepository");
            throw null;
        } else if (iVar == null) {
            C4638h.m10271a("settingsDataMapper");
            throw null;
        } else if (cVar == null) {
            C4638h.m10271a("languagesDataMapper");
            throw null;
        } else if (gVar2 == null) {
            C4638h.m10271a("regionsDataMapper");
            throw null;
        } else if (jVar != null) {
            this.f1860a = bVar;
            this.f1861b = gVar;
            this.f1862c = eVar;
            this.f1863d = iVar;
            this.f1864e = cVar;
            this.f1865f = gVar2;
            this.f1866g = jVar;
        } else {
            C4638h.m10271a("systemInfoRepository");
            throw null;
        }
    }
}
