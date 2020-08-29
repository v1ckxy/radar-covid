package p003f.p004a.p005a.p012b.p056h.p060d;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import es.gob.radarcovid.R;
import p002es.gob.radarcovid.features.poll.completed.view.PollCompletedFragment;
import p003f.p004a.p005a.p012b.p013a.p015b.C0506a;
import p003f.p004a.p005a.p012b.p043e.p048e.C0571a;
import p003f.p004a.p005a.p012b.p056h.p059c.C0596b;
import p003f.p004a.p005a.p012b.p062i.p067e.C0613a;
import p124p.p126b.p127k.C1036e;
import p124p.p170k.p171a.C1472a;
import p124p.p170k.p171a.C1490k;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.h.d.a */
public final class C0598a implements C0596b {

    /* renamed from: a */
    public final C1036e f2032a;

    public C0598a(C1036e eVar) {
        if (eVar != null) {
            this.f2032a = eVar;
        } else {
            C4638h.m10271a("activity");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3803a(boolean z) {
        C1490k kVar = (C1490k) this.f2032a.mo6067J();
        if (kVar != null) {
            C1472a aVar = new C1472a(kVar);
            C0506a aVar2 = new C0506a();
            Bundle bundle = new Bundle();
            bundle.putBoolean("arg_activate_radar", z);
            aVar2.mo807e(bundle);
            aVar.mo6194a((int) R.id.wrapperContent, (Fragment) aVar2);
            aVar.mo6024a();
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public void mo3804b() {
        C1490k kVar = (C1490k) this.f2032a.mo6067J();
        if (kVar != null) {
            C1472a aVar = new C1472a(kVar);
            aVar.mo6194a((int) R.id.wrapperContent, (Fragment) new C0613a());
            aVar.mo6024a();
            return;
        }
        throw null;
    }

    /* renamed from: c */
    public void mo3805c() {
        C1490k kVar = (C1490k) this.f2032a.mo6067J();
        if (kVar != null) {
            C1472a aVar = new C1472a(kVar);
            aVar.mo6194a((int) R.id.wrapperContent, (Fragment) new C0571a());
            aVar.mo6024a();
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public void mo3802a() {
        C1490k kVar = (C1490k) this.f2032a.mo6067J();
        if (kVar != null) {
            C1472a aVar = new C1472a(kVar);
            aVar.mo6194a((int) R.id.wrapperContent, (Fragment) new PollCompletedFragment());
            aVar.mo6024a();
            return;
        }
        throw null;
    }
}
