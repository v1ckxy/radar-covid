package p003f.p004a.p005a.p012b.p038d.p042d;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import es.gob.radarcovid.R;
import p003f.p004a.p005a.p012b.p038d.p041c.C0562a;
import p003f.p004a.p005a.p012b.p038d.p041c.C0563b;
import p003f.p004a.p005a.p108g.p109a.C0706e;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.d.d.a */
public final class C0564a extends C0706e implements C0563b {

    /* renamed from: e0 */
    public C0562a f1984e0;

    /* renamed from: a */
    public View mo787a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.fragment_health, viewGroup, false);
        }
        C4638h.m10271a("inflater");
        throw null;
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo815i0() {
        super.mo815i0();
    }

    /* renamed from: r0 */
    public void mo3158r0() {
    }

    /* renamed from: a */
    public void mo795a(View view, Bundle bundle) {
        if (view != null) {
            C0562a aVar = this.f1984e0;
            if (aVar != null) {
                aVar.mo3775a();
            } else {
                C4638h.m10273b("presenter");
                throw null;
            }
        } else {
            C4638h.m10271a("view");
            throw null;
        }
    }
}
