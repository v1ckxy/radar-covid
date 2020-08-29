package p213q.p217b.p218a.p271c.p295x;

import android.view.View;
import p124p.p150h.p162l.C1387a;
import p124p.p150h.p162l.p163y.C1429b;
import p213q.p217b.p218a.p271c.C3369j;

/* renamed from: q.b.a.c.x.h */
public class C3476h extends C1387a {

    /* renamed from: d */
    public final /* synthetic */ C3468f f8863d;

    public C3476h(C3468f fVar) {
        this.f8863d = fVar;
    }

    /* renamed from: a */
    public void mo768a(View view, C1429b bVar) {
        C3468f fVar;
        int i;
        this.f4146a.onInitializeAccessibilityNodeInfo(view, bVar.f4203a);
        if (this.f8863d.f8851l0.getVisibility() == 0) {
            fVar = this.f8863d;
            i = C3369j.mtrl_picker_toggle_to_year_selection;
        } else {
            fVar = this.f8863d;
            i = C3369j.mtrl_picker_toggle_to_day_selection;
        }
        bVar.mo5945a((CharSequence) fVar.mo798b(i));
    }
}
