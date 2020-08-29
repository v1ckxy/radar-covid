package p124p.p170k.p171a;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import p124p.p150h.p162l.C1404o;

/* renamed from: p.k.a.a0 */
public class C1473a0 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ ArrayList f4319e;

    /* renamed from: f */
    public final /* synthetic */ Map f4320f;

    public C1473a0(C1476b0 b0Var, ArrayList arrayList, Map map) {
        this.f4319e = arrayList;
        this.f4320f = map;
    }

    public void run() {
        int size = this.f4319e.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f4319e.get(i);
            view.setTransitionName((String) this.f4320f.get(C1404o.m3556q(view)));
        }
    }
}
