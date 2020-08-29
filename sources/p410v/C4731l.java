package p410v;

import java.util.concurrent.TimeUnit;
import p392u.p401r.p403c.C4638h;
import p410v.p411m0.p413d.C4762i;

/* renamed from: v.l */
public final class C4731l {

    /* renamed from: a */
    public final C4762i f11118a;

    public C4731l() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        if (timeUnit != null) {
            this.f11118a = new C4762i(5, 5, timeUnit);
        } else {
            C4638h.m10271a("timeUnit");
            throw null;
        }
    }
}
