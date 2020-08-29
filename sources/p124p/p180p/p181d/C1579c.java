package p124p.p180p.p181d;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.C0105d0;
import java.util.ArrayList;
import java.util.Iterator;
import p124p.p180p.p181d.C1587k.C1589b;

/* renamed from: p.p.d.c */
public class C1579c implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ ArrayList f4607e;

    /* renamed from: f */
    public final /* synthetic */ C1587k f4608f;

    public C1579c(C1587k kVar, ArrayList arrayList) {
        this.f4608f = kVar;
        this.f4607e = arrayList;
    }

    public void run() {
        Iterator it = this.f4607e.iterator();
        while (it.hasNext()) {
            C1589b bVar = (C1589b) it.next();
            C1587k kVar = this.f4608f;
            C0105d0 d0Var = bVar.f4653a;
            int i = bVar.f4654b;
            int i2 = bVar.f4655c;
            int i3 = bVar.f4656d;
            int i4 = bVar.f4657e;
            if (kVar != null) {
                View view = d0Var.f757a;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i6 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate = view.animate();
                kVar.f4644p.add(d0Var);
                ViewPropertyAnimator duration = animate.setDuration(kVar.f789e);
                C1584h hVar = new C1584h(kVar, d0Var, i5, view, i6, animate);
                duration.setListener(hVar).start();
            } else {
                throw null;
            }
        }
        this.f4607e.clear();
        this.f4608f.f4641m.remove(this.f4607e);
    }
}
