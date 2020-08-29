package p124p.p170k.p171a;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import p124p.p150h.p162l.C1404o;

/* renamed from: p.k.a.z */
public class C1525z implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ ArrayList f4536e;

    /* renamed from: f */
    public final /* synthetic */ Map f4537f;

    public C1525z(C1476b0 b0Var, ArrayList arrayList, Map map) {
        this.f4536e = arrayList;
        this.f4537f = map;
    }

    public void run() {
        String str;
        int size = this.f4536e.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f4536e.get(i);
            String q = C1404o.m3556q(view);
            if (q != null) {
                Iterator it = this.f4537f.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Entry entry = (Entry) it.next();
                    if (q.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                view.setTransitionName(str);
            }
        }
    }
}
