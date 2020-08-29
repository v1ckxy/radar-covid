package p003f.p004a.p005a.p012b.p027c.p031d.p033b;

import java.util.ArrayList;
import java.util.List;
import p002es.gob.radarcovid.models.domain.LocaleInfo;
import p002es.gob.radarcovid.models.domain.Region;
import p003f.p004a.p005a.p006a.p010d.C0471i;
import p003f.p004a.p005a.p012b.p027c.p031d.p034c.C0553a;
import p003f.p004a.p005a.p012b.p027c.p031d.p034c.C0554b;
import p003f.p004a.p005a.p012b.p027c.p031d.p034c.C0555c;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.c.d.b.a */
public final class C0552a implements C0553a {

    /* renamed from: a */
    public final LocaleInfo f1977a;

    /* renamed from: b */
    public final C0555c f1978b;

    /* renamed from: c */
    public final C0554b f1979c;

    public C0552a(C0555c cVar, C0554b bVar, C0471i iVar) {
        if (cVar == null) {
            C4638h.m10271a("view");
            throw null;
        } else if (bVar == null) {
            C4638h.m10271a("router");
            throw null;
        } else if (iVar != null) {
            this.f1978b = cVar;
            this.f1979c = bVar;
            this.f1977a = new LocaleInfo(iVar.f1844a.mo3685e(), iVar.f1844a.mo3686f());
        } else {
            C4638h.m10271a("getLocaleInfoUseCase");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3767a() {
        C0555c cVar = this.f1978b;
        List<Region> regions = this.f1977a.getRegions();
        ArrayList arrayList = new ArrayList(C2286e.m5158a((Iterable<? extends T>) regions, 10));
        for (Region name : regions) {
            arrayList.add(name.getName());
        }
        cVar.mo3156a(arrayList);
    }

    /* renamed from: b */
    public void mo3768b() {
        this.f1979c.mo3772b(((Region) this.f1977a.getRegions().get(this.f1978b.mo3154C())).getPhone());
    }

    /* renamed from: c */
    public void mo3769c() {
        Region region = (Region) this.f1977a.getRegions().get(this.f1978b.mo3154C());
        this.f1978b.mo3155a(region.getPhone(), region.getWebName());
    }

    /* renamed from: d */
    public void mo3770d() {
        this.f1979c.mo3771a(((Region) this.f1977a.getRegions().get(this.f1978b.mo3154C())).getUrl());
    }
}
