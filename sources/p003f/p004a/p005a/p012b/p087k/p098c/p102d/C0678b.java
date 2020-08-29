package p003f.p004a.p005a.p012b.p087k.p098c.p102d;

import android.view.View;
import android.view.View.OnClickListener;
import p003f.p004a.p005a.p012b.p087k.p098c.p101c.C0674a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.k.c.d.b */
public final class C0678b implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ C0676a f2115e;

    public C0678b(C0676a aVar) {
        this.f2115e = aVar;
    }

    public final void onClick(View view) {
        C0674a aVar = this.f2115e.f2113e0;
        if (aVar != null) {
            aVar.mo3851a();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }
}
