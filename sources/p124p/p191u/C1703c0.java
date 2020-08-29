package p124p.p191u;

import android.view.View;
import android.view.ViewGroup;
import p124p.p191u.C1718i.C1722d;

/* renamed from: p.u.c0 */
public class C1703c0 extends C1725l {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f4985a;

    /* renamed from: b */
    public final /* synthetic */ View f4986b;

    /* renamed from: c */
    public final /* synthetic */ View f4987c;

    /* renamed from: d */
    public final /* synthetic */ C1709d0 f4988d;

    public C1703c0(C1709d0 d0Var, ViewGroup viewGroup, View view, View view2) {
        this.f4988d = d0Var;
        this.f4985a = viewGroup;
        this.f4986b = view;
        this.f4987c = view2;
    }

    /* renamed from: c */
    public void mo6536c(C1718i iVar) {
        this.f4985a.getOverlay().remove(this.f4986b);
    }

    /* renamed from: d */
    public void mo6537d(C1718i iVar) {
        if (this.f4986b.getParent() == null) {
            this.f4985a.getOverlay().add(this.f4986b);
        } else {
            this.f4988d.cancel();
        }
    }

    /* renamed from: e */
    public void mo6538e(C1718i iVar) {
        this.f4987c.setTag(C1714f.save_overlay_view, null);
        this.f4985a.getOverlay().remove(this.f4986b);
        iVar.mo6574b((C1722d) this);
    }
}
