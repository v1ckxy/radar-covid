package p213q.p217b.p317d.p322h.p323e.p333q.p335d;

import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4151a;

/* renamed from: q.b.d.h.e.q.d.a */
public class C4156a implements C4157b {

    /* renamed from: a */
    public final C4158c f10054a;

    /* renamed from: b */
    public final C4159d f10055b;

    public C4156a(C4158c cVar, C4159d dVar) {
        this.f10054a = cVar;
        this.f10055b = dVar;
    }

    /* renamed from: a */
    public boolean mo10366a(C4151a aVar, boolean z) {
        int ordinal = aVar.f10046c.getType().ordinal();
        if (ordinal == 0) {
            this.f10054a.mo10366a(aVar, z);
            return true;
        } else if (ordinal != 1) {
            return false;
        } else {
            this.f10055b.mo10366a(aVar, z);
            return true;
        }
    }
}
