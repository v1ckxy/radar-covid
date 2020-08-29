package p003f.p004a.p005a.p012b.p019b.p021b.p023b;

import java.util.Objects;
import p003f.p004a.p005a.p006a.p010d.C0463g;
import p003f.p004a.p005a.p006a.p010d.C0491r;
import p003f.p004a.p005a.p006a.p010d.C0492s;
import p003f.p004a.p005a.p006a.p010d.C0493t;
import p003f.p004a.p005a.p006a.p010d.C0494u;
import p003f.p004a.p005a.p012b.p019b.p021b.p024c.C0532a;
import p003f.p004a.p005a.p012b.p019b.p021b.p024c.C0533b;
import p003f.p004a.p005a.p012b.p019b.p021b.p024c.C0534c;
import p369s.p370a.p371a.p372a.p373a.C4429a;
import p369s.p370a.p371a.p374b.C4440g;
import p369s.p370a.p371a.p374b.C4442i;
import p369s.p370a.p371a.p374b.C4445l;
import p369s.p370a.p371a.p378f.p382d.C4478b;
import p369s.p370a.p371a.p378f.p383e.p384a.C4480a;
import p369s.p370a.p371a.p378f.p383e.p384a.C4485c;
import p369s.p370a.p371a.p378f.p383e.p384a.C4487d;
import p369s.p370a.p371a.p378f.p383e.p385b.C4496e;
import p369s.p370a.p371a.p389g.C4538a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.b.b.b.c */
public final class C0530c implements C0532a {

    /* renamed from: a */
    public final C0534c f1947a;

    /* renamed from: b */
    public final C0533b f1948b;

    /* renamed from: c */
    public final C0494u f1949c;

    /* renamed from: d */
    public final C0463g f1950d;

    public C0530c(C0534c cVar, C0533b bVar, C0494u uVar, C0463g gVar) {
        if (cVar == null) {
            C4638h.m10271a("view");
            throw null;
        } else if (bVar == null) {
            C4638h.m10271a("router");
            throw null;
        } else if (uVar == null) {
            C4638h.m10271a("reportInfectedUseCase");
            throw null;
        } else if (gVar != null) {
            this.f1947a = cVar;
            this.f1948b = bVar;
            this.f1949c = uVar;
            this.f1950d = gVar;
        } else {
            C4638h.m10271a("getInternetInfoUseCase");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3750a() {
    }

    /* renamed from: a */
    public void mo3751a(String str) {
        if (str != null) {
            this.f1947a.mo3148d(str.length() == 12);
        } else {
            C4638h.m10271a("code");
            throw null;
        }
    }

    /* renamed from: c */
    public void mo3752c() {
        this.f1947a.finish();
    }

    /* renamed from: d */
    public void mo3753d() {
        this.f1947a.mo3146a();
    }

    /* renamed from: e */
    public void mo3754e() {
        if (this.f1950d.f1836a.mo3690a()) {
            String x = this.f1947a.mo3152x();
            this.f1947a.mo3942B();
            C0494u uVar = this.f1949c;
            if (uVar == null) {
                throw null;
            } else if (x != null) {
                C4440g a = C4440g.m10018a((C4442i<T>) new C0491r<T>(uVar, x));
                C4638h.m10270a((Object) a, "Observable.create { emit…\n            }\n\n        }");
                C0492s sVar = new C0492s(uVar);
                Objects.requireNonNull(sVar, "mapper is null");
                C4496e eVar = new C4496e(a, sVar, false);
                C0493t tVar = new C0493t(uVar);
                Objects.requireNonNull(tVar, "other is null");
                C4480a aVar = new C4480a(eVar, tVar);
                C4638h.m10270a((Object) aVar, "getVerifyToken(reportCod…it.onComplete()\n        }");
                C4445l lVar = C4538a.f10756a;
                String str = "scheduler is null";
                Objects.requireNonNull(lVar, str);
                C4487d dVar = new C4487d(aVar, lVar);
                C4445l lVar2 = C4429a.f10529a;
                if (lVar2 != null) {
                    Objects.requireNonNull(lVar2, str);
                    C4485c cVar = new C4485c(dVar, lVar2);
                    C0528a aVar2 = new C0528a(this);
                    C0529b bVar = new C0529b(this);
                    Objects.requireNonNull(bVar, "onError is null");
                    Objects.requireNonNull(aVar2, "onComplete is null");
                    cVar.mo3713a(new C4478b(bVar, aVar2));
                    return;
                }
                throw new NullPointerException("scheduler == null");
            } else {
                C4638h.m10271a("reportCode");
                throw null;
            }
        } else {
            this.f1947a.mo3144M();
        }
    }

    /* renamed from: f */
    public void mo3755f() {
        mo3754e();
    }
}
