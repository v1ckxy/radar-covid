package p124p.p180p.p181d;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.C0105d0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: p.p.d.e */
public class C1581e implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ ArrayList f4611e;

    /* renamed from: f */
    public final /* synthetic */ C1587k f4612f;

    public C1581e(C1587k kVar, ArrayList arrayList) {
        this.f4612f = kVar;
        this.f4611e = arrayList;
    }

    public void run() {
        Iterator it = this.f4611e.iterator();
        while (it.hasNext()) {
            C0105d0 d0Var = (C0105d0) it.next();
            C1587k kVar = this.f4612f;
            if (kVar != null) {
                View view = d0Var.f757a;
                ViewPropertyAnimator animate = view.animate();
                kVar.f4643o.add(d0Var);
                animate.alpha(1.0f).setDuration(kVar.f787c).setListener(new C1583g(kVar, d0Var, view, animate)).start();
            } else {
                throw null;
            }
        }
        this.f4611e.clear();
        this.f4612f.f4640l.remove(this.f4611e);
    }
}
