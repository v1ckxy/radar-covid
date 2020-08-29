package p003f.p004a.p005a.p012b.p043e.p045b;

import p003f.p004a.p005a.p012b.p043e.p046c.C0567a;
import p003f.p004a.p005a.p012b.p043e.p046c.C0568b;
import p003f.p004a.p005a.p012b.p043e.p046c.C0569c;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.e.b.a */
public final class C0566a implements C0567a {

    /* renamed from: a */
    public final C0568b f1985a;

    public C0566a(C0569c cVar, C0568b bVar) {
        if (cVar == null) {
            C4638h.m10271a("view");
            throw null;
        } else if (bVar != null) {
            this.f1985a = bVar;
        } else {
            C4638h.m10271a("router");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3776a() {
    }

    /* renamed from: a */
    public void mo3777a(String str) {
        if (str != null) {
            this.f1985a.mo3778a(str);
        } else {
            C4638h.m10271a("url");
            throw null;
        }
    }
}
