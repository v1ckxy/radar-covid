package p213q.p217b.p317d.p322h;

import android.os.Bundle;
import p213q.p217b.p317d.p318f.p319a.C3867a.C3869b;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p324i.C3923b;

/* renamed from: q.b.d.h.a */
public class C3908a implements C3869b {

    /* renamed from: a */
    public C3923b f9544a;

    /* renamed from: b */
    public C3923b f9545b;

    /* renamed from: a */
    public void mo10098a(int i, Bundle bundle) {
        C3913b bVar = C3913b.f9552c;
        StringBuilder sb = new StringBuilder();
        sb.append("Received Analytics message: ");
        sb.append(i);
        sb.append(" ");
        sb.append(bundle);
        bVar.mo10108a(sb.toString());
        if (bundle != null) {
            String string = bundle.getString("name");
            if (string != null) {
                Bundle bundle2 = bundle.getBundle("params");
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                C3923b bVar2 = "clx".equals(bundle2.getString("_o")) ? this.f9544a : this.f9545b;
                if (bVar2 != null) {
                    bVar2.mo10117b(string, bundle2);
                }
            }
        }
    }
}
