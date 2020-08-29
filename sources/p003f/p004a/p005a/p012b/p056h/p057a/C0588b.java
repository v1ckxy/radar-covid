package p003f.p004a.p005a.p012b.p056h.p057a;

import p002es.gob.radarcovid.features.main.view.MainActivity;
import p124p.p126b.p127k.C1036e;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.h.a.b */
public final class C0588b implements C4427b<C1036e> {

    /* renamed from: a */
    public final C0587a f2016a;

    /* renamed from: b */
    public final C4547a<MainActivity> f2017b;

    public C0588b(C0587a aVar, C4547a<MainActivity> aVar2) {
        this.f2016a = aVar;
        this.f2017b = aVar2;
    }

    public Object get() {
        MainActivity mainActivity = (MainActivity) this.f2017b.get();
        if (this.f2016a == null) {
            throw null;
        } else if (mainActivity != null) {
            C2286e.m5279b(mainActivity, "Cannot return null from a non-@Nullable @Provides method");
            return mainActivity;
        } else {
            C4638h.m10271a("activity");
            throw null;
        }
    }
}
