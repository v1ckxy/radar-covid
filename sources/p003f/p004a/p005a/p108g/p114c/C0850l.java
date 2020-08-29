package p003f.p004a.p005a.p108g.p114c;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import p003f.p004a.p005a.p108g.p114c.C0851m.C0852a;

/* renamed from: f.a.a.g.c.l */
public final class C0850l implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ C0852a f2426e;

    public C0850l(C0852a aVar) {
        this.f2426e = aVar;
    }

    public final void onClick(View view) {
        ViewParent parent = this.f2426e.getParent();
        if (!(parent instanceof C0854o)) {
            parent = null;
        }
        C0854o oVar = (C0854o) parent;
        if (oVar != null) {
            oVar.mo3138a(this.f2426e);
        }
    }
}
