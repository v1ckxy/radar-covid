package p003f.p004a.p005a.p012b.p019b.p021b.p022a;

import p002es.gob.radarcovid.features.covidreport.form.view.CovidReportActivity;
import p003f.p004a.p005a.p012b.p019b.p021b.p024c.C0534c;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.b.b.a.g */
public final class C0527g implements C4427b<C0534c> {

    /* renamed from: a */
    public final C0521a f1943a;

    /* renamed from: b */
    public final C4547a<CovidReportActivity> f1944b;

    public C0527g(C0521a aVar, C4547a<CovidReportActivity> aVar2) {
        this.f1943a = aVar;
        this.f1944b = aVar2;
    }

    public Object get() {
        CovidReportActivity covidReportActivity = (CovidReportActivity) this.f1944b.get();
        if (this.f1943a == null) {
            throw null;
        } else if (covidReportActivity != null) {
            C2286e.m5279b(covidReportActivity, "Cannot return null from a non-@Nullable @Provides method");
            return covidReportActivity;
        } else {
            C4638h.m10271a("activity");
            throw null;
        }
    }
}
