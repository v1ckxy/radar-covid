package p003f.p004a.p005a.p012b.p103l.p104a;

import android.content.Context;
import p002es.gob.radarcovid.features.splash.view.SplashActivity;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.l.a.d */
public final class C0682d implements C4427b<Context> {

    /* renamed from: a */
    public final C0679a f2120a;

    /* renamed from: b */
    public final C4547a<SplashActivity> f2121b;

    public C0682d(C0679a aVar, C4547a<SplashActivity> aVar2) {
        this.f2120a = aVar;
        this.f2121b = aVar2;
    }

    public Object get() {
        SplashActivity splashActivity = (SplashActivity) this.f2121b.get();
        if (this.f2120a == null) {
            throw null;
        } else if (splashActivity != null) {
            C2286e.m5279b(splashActivity, "Cannot return null from a non-@Nullable @Provides method");
            return splashActivity;
        } else {
            C4638h.m10271a("activity");
            throw null;
        }
    }
}
