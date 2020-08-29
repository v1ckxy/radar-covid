package p003f.p004a.p005a.p006a.p010d;

import java.util.Date;
import p002es.gob.radarcovid.models.request.RequestKpi;
import p002es.gob.radarcovid.models.request.RequestKpiReport;
import p003f.p004a.p005a.p006a.p007a.C0413b;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4560l;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p403c.C4639i;
import p425x.p482c.p483a.C5244a;

/* renamed from: f.a.a.a.d.y */
public final class C0498y extends C4639i implements C4607a<C5244a<? extends Throwable, ? extends C4560l>> {

    /* renamed from: f */
    public final /* synthetic */ C0499z f1894f;

    public C0498y(C0499z zVar) {
        this.f1894f = zVar;
        super(0);
    }

    /* renamed from: c */
    public Object mo3123c() {
        C0413b bVar = this.f1894f.f1895a;
        RequestKpiReport requestKpiReport = new RequestKpiReport();
        requestKpiReport.add(new RequestKpi(RequestKpi.MATCH_CONFIRMED, C2286e.m5285b(new Date()), 1));
        return bVar.mo3664a(requestKpiReport);
    }
}
