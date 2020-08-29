package p003f.p004a.p005a.p012b.p050g.p052b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002es.gob.radarcovid.models.domain.Language;
import p002es.gob.radarcovid.models.domain.LocaleInfo;
import p002es.gob.radarcovid.models.domain.Region;
import p003f.p004a.p005a.p006a.p010d.C0471i;
import p003f.p004a.p005a.p012b.p050g.p053c.C0580a;
import p003f.p004a.p005a.p012b.p050g.p053c.C0581b;
import p003f.p004a.p005a.p012b.p050g.p053c.C0582c;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.g.b.a */
public final class C0578a implements C0580a {

    /* renamed from: a */
    public final LocaleInfo f2005a;

    /* renamed from: b */
    public final int f2006b;

    /* renamed from: c */
    public final C0582c f2007c;

    /* renamed from: d */
    public final C0581b f2008d;

    /* renamed from: e */
    public final C0471i f2009e;

    public C0578a(C0582c cVar, C0581b bVar, C0471i iVar) {
        if (cVar == null) {
            C4638h.m10271a("view");
            throw null;
        } else if (bVar == null) {
            C4638h.m10271a("router");
            throw null;
        } else if (iVar != null) {
            this.f2007c = cVar;
            this.f2008d = bVar;
            this.f2009e = iVar;
            LocaleInfo localeInfo = new LocaleInfo(iVar.f1844a.mo3685e(), iVar.f1844a.mo3686f());
            this.f2005a = localeInfo;
            int i = 0;
            Iterator it = localeInfo.getLanguages().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C4638h.m10272a((Object) ((Language) it.next()).getCode(), (Object) this.f2009e.f1844a.mo3683c())) {
                    break;
                } else {
                    i++;
                }
            }
            this.f2006b = i;
        } else {
            C4638h.m10271a("getLocaleInfoUseCase");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3785a() {
        C0582c cVar = this.f2007c;
        List<Region> regions = this.f2005a.getRegions();
        ArrayList arrayList = new ArrayList(C2286e.m5158a((Iterable<? extends T>) regions, 10));
        for (Region name : regions) {
            arrayList.add(name.getName());
        }
        cVar.mo3172a((List<String>) arrayList);
        C0582c cVar2 = this.f2007c;
        List<Language> languages = this.f2005a.getLanguages();
        ArrayList arrayList2 = new ArrayList(C2286e.m5158a((Iterable<? extends T>) languages, 10));
        for (Language name2 : languages) {
            arrayList2.add(name2.getName());
        }
        cVar2.mo3173b(arrayList2);
        int i = this.f2006b;
        if (i > -1) {
            this.f2007c.mo3171a(i);
        }
    }

    /* renamed from: a */
    public void mo3786a(int i) {
    }

    /* renamed from: b */
    public void mo3787b() {
        String code = ((Language) this.f2005a.getLanguages().get(this.f2007c.mo3170D())).getCode();
        C0471i iVar = this.f2009e;
        if (code != null) {
            iVar.f1844a.mo3674a(code);
            this.f2008d.mo3789a();
            return;
        }
        C4638h.m10271a("languageCode");
        throw null;
    }

    /* renamed from: c */
    public boolean mo3788c() {
        return this.f2006b != this.f2007c.mo3170D();
    }
}
