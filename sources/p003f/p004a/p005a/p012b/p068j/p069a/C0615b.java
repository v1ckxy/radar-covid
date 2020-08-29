package p003f.p004a.p005a.p012b.p068j.p069a;

import android.content.Context;
import p002es.gob.radarcovid.features.onboarding.view.OnboardingActivity;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.j.a.b */
public final class C0615b implements C4427b<Context> {

    /* renamed from: a */
    public final C0614a f2053a;

    /* renamed from: b */
    public final C4547a<OnboardingActivity> f2054b;

    public C0615b(C0614a aVar, C4547a<OnboardingActivity> aVar2) {
        this.f2053a = aVar;
        this.f2054b = aVar2;
    }

    public Object get() {
        OnboardingActivity onboardingActivity = (OnboardingActivity) this.f2054b.get();
        if (this.f2053a == null) {
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
