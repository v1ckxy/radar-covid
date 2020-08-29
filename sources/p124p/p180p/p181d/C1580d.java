package p124p.p180p.p181d;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.C0105d0;
import java.util.ArrayList;
import java.util.Iterator;
import p124p.p180p.p181d.C1587k.C1588a;

/* renamed from: p.p.d.d */
public class C1580d implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ ArrayList f4609e;

    /* renamed from: f */
    public final /* synthetic */ C1587k f4610f;

    public C1580d(C1587k kVar, ArrayList arrayList) {
        this.f4610f = kVar;
        this.f4609e = arrayList;
    }

    public void run() {
        Iterator it = this.f4609e.iterator();
        while (it.hasNext()) {
            C1588a aVar = (C1588a) it.next();
            C1587k kVar = this.f4610f;
            View view = null;
            if (kVar != null) {
                C0105d0 d0Var = aVar.f4647a;
                View view2 = d0Var == null ? null : d0Var.f757a;
                C0105d0 d0Var2 = aVar.f4648b;
                if (d0Var2 != null) {
                    view = d0Var2.f757a;
                }
                if (view2 != null) {
                    ViewPropertyAnimator duration = view2.animate().setDuration(kVar.f790f);
                    kVar.f4646r.add(aVar.f4647a);
                    duration.translationX((float) (aVar.f4651e - aVar.f4649c));
                    duration.translationY((float) (aVar.f4652f - aVar.f4650d));
                    duration.alpha(0.0f).setListener(new C1585i(kVar, aVar, duration, view2)).start();
                }
                if (view != null) {
                    ViewPropertyAnimator animate = view.animate();
                    kVar.f4646r.add(aVar.f4648b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f790f).alpha(1.0f).setListener(new C1586j(kVar, aVar, animate, view)).start();
                }
            } else {
                throw null;
            }
        }
        this.f4609e.clear();
        this.f4610f.f4642n.remove(this.f4609e);
    }
}
