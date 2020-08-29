package p003f.p004a.p005a.p012b.p068j.p070b.p077c.p082e;

import android.view.View;
import android.view.View.OnClickListener;
import p003f.p004a.p005a.p012b.p068j.p070b.p077c.p080c.C0634a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.j.b.c.e.a */
public final class C0639a implements OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ C0640b f2078e;

    public C0639a(C0640b bVar) {
        this.f2078e = bVar;
    }

    public final void onClick(View view) {
        C0634a aVar = this.f2078e.f2079e0;
        if (aVar != null) {
            aVar.mo3823b();
        } else {
            C4638h.m10273b("presenter");
            throw null;
        }
    }
}
