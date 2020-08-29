package p425x.p426a.p445e.p446a;

import p425x.p426a.p427a.C4927c1;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4933e;
import p425x.p426a.p427a.C4958k;
import p425x.p426a.p427a.C4964m;
import p425x.p426a.p427a.C4983s;
import p425x.p426a.p427a.C4986t;
import p425x.p426a.p427a.p433h2.C4950a;

/* renamed from: x.a.e.a.h */
public class C5034h extends C4964m {

    /* renamed from: e */
    public final C4958k f12018e;

    /* renamed from: f */
    public final C4950a f12019f;

    public C5034h(C4950a aVar) {
        this.f12018e = new C4958k(0);
        this.f12019f = aVar;
    }

    public C5034h(C4986t tVar) {
        this.f12018e = C4958k.m11231a((Object) tVar.mo11628e(0));
        this.f12019f = C4950a.m11200a(tVar.mo11628e(1));
    }

    /* renamed from: a */
    public static final C5034h m11489a(Object obj) {
        if (obj instanceof C5034h) {
            return (C5034h) obj;
        }
        if (obj != null) {
            return new C5034h(C4986t.m11342a(obj));
        }
        return null;
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        C4933e eVar = new C4933e(10);
        eVar.mo11573a((C4929d) this.f12018e);
        eVar.mo11573a((C4929d) this.f12019f);
        return new C4927c1(eVar);
    }
}
