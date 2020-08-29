package p124p.p126b.p127k;

import android.view.View;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.C1416u;
import p124p.p150h.p162l.C1417v;

/* renamed from: p.b.k.m */
public class C1058m extends C1417v {

    /* renamed from: a */
    public final /* synthetic */ C1039h f2783a;

    public C1058m(C1039h hVar) {
        this.f2783a = hVar;
    }

    /* renamed from: b */
    public void mo4498b(View view) {
        this.f2783a.f2735s.setAlpha(1.0f);
        this.f2783a.f2738v.mo5912a((C1416u) null);
        this.f2783a.f2738v = null;
    }

    /* renamed from: c */
    public void mo4521c(View view) {
        this.f2783a.f2735s.setVisibility(0);
        this.f2783a.f2735s.sendAccessibilityEvent(32);
        if (this.f2783a.f2735s.getParent() instanceof View) {
            C1404o.m3508C((View) this.f2783a.f2735s.getParent());
        }
    }
}
