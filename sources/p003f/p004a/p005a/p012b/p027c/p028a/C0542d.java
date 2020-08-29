package p003f.p004a.p005a.p012b.p027c.p028a;

import android.content.Context;
import p002es.gob.radarcovid.features.exposure.view.ExposureActivity;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.c.a.d */
public final class C0542d implements C4427b<Context> {

    /* renamed from: a */
    public final C0539a f1963a;

    /* renamed from: b */
    public final C4547a<ExposureActivity> f1964b;

    public C0542d(C0539a aVar, C4547a<ExposureActivity> aVar2) {
        this.f1963a = aVar;
        this.f1964b = aVar2;
    }

    /* renamed from: a */
    public static Context m1618a(C0539a aVar, ExposureActivity exposureActivity) {
        if (aVar == null) {
            throw null;
        } else if (exposureActivity != null) {
            C2286e.m5279b(exposureActivity, "Cannot return null from a non-@Nullable @Provides method");
            return exposureActivity;
        } else {
            C4638h.m10271a("activity");
            throw null;
        }
    }

    public Object get() {
        return m1618a(this.f1963a, (ExposureActivity) this.f1964b.get());
    }
}
