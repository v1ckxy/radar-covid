package p003f.p004a.p005a.p012b.p027c.p028a;

import p002es.gob.radarcovid.features.exposure.view.ExposureActivity;
import p124p.p126b.p127k.C1036e;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.c.a.b */
public final class C0540b implements C4427b<C1036e> {

    /* renamed from: a */
    public final C0539a f1959a;

    /* renamed from: b */
    public final C4547a<ExposureActivity> f1960b;

    public C0540b(C0539a aVar, C4547a<ExposureActivity> aVar2) {
        this.f1959a = aVar;
        this.f1960b = aVar2;
    }

    public Object get() {
        ExposureActivity exposureActivity = (ExposureActivity) this.f1960b.get();
        if (this.f1959a == null) {
            throw null;
        } else if (exposureActivity != null) {
            C2286e.m5279b(exposureActivity, "Cannot return null from a non-@Nullable @Provides method");
            return exposureActivity;
        } else {
            C4638h.m10271a("activity");
            throw null;
        }
    }
}
