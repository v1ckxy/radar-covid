package p003f.p004a.p005a.p108g.p114c;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import p003f.p004a.p005a.p108g.p114c.C0846i.C0847a;

/* renamed from: f.a.a.g.c.h */
public final class C0845h implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ C0847a f2418e;

    public C0845h(C0847a aVar) {
        this.f2418e = aVar;
    }

    public final void onClick(View view) {
        ViewParent parent = this.f2418e.getParent();
        if (!(parent instanceof C0854o)) {
            parent = null;
        }
        C0854o oVar = (C0854o) parent;
        if (oVar != null) {
            oVar.mo3138a(this.f2418e);
        }
    }
}
