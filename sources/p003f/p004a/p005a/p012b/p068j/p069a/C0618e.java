package p003f.p004a.p005a.p012b.p068j.p069a;

import p002es.gob.radarcovid.features.onboarding.view.OnboardingActivity;
import p003f.p004a.p005a.p012b.p068j.p084d.C0647c;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.j.a.e */
public final class C0618e implements C4427b<C0647c> {

    /* renamed from: a */
    public final C0614a f2059a;

    /* renamed from: b */
    public final C4547a<OnboardingActivity> f2060b;

    public C0618e(C0614a aVar, C4547a<OnboardingActivity> aVar2) {
        this.f2059a = aVar;
        this.f2060b = aVar2;
    }

    public Object get() {
        OnboardingActivity onboardingActivity = (OnboardingActivity) this.f2060b.get();
        if (this.f2059a == null) {
            throw null;
        } else if (onboardingActivity != null) {
            C2286e.m5279b(onboardingActivity, "Cannot return null from a non-@Nullable @Provides method");
            return onboardingActivity;
        } else {
            C4638h.m10271a("activity");
            throw null;
        }
    }
}
