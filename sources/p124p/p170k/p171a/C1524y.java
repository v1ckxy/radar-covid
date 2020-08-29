package p124p.p170k.p171a;

import android.view.View;
import java.util.ArrayList;
import p124p.p150h.p162l.C1404o;

/* renamed from: p.k.a.y */
public class C1524y implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f4531e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f4532f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList f4533g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList f4534h;

    /* renamed from: i */
    public final /* synthetic */ ArrayList f4535i;

    public C1524y(C1476b0 b0Var, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f4531e = i;
        this.f4532f = arrayList;
        this.f4533g = arrayList2;
        this.f4534h = arrayList3;
        this.f4535i = arrayList4;
    }

    public void run() {
        for (int i = 0; i < this.f4531e; i++) {
            C1404o.m3525a((View) this.f4532f.get(i), (String) this.f4533g.get(i));
            ((View) this.f4534h.get(i)).setTransitionName((String) this.f4535i.get(i));
        }
    }
}
