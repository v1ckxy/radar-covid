package p003f.p004a.p005a.p108g.p109a;

import p124p.p126b.p127k.C1034d;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: f.a.a.g.a.a */
public final class C0702a extends C4639i implements C4618l<C1034d, C4560l> {

    /* renamed from: f */
    public final /* synthetic */ C0703b f2151f;

    /* renamed from: g */
    public final /* synthetic */ boolean f2152g;

    public C0702a(C0703b bVar, boolean z) {
        this.f2151f = bVar;
        this.f2152g = z;
        super(1);
    }

    /* renamed from: b */
    public Object mo3153b(Object obj) {
        C1034d dVar = (C1034d) obj;
        if (dVar != null) {
            dVar.dismiss();
            if (this.f2152g) {
                this.f2151f.finish();
            }
            return C4560l.f10773a;
        }
        C4638h.m10271a("it");
        throw null;
    }
}
