package p392u.p395p;

import p392u.p395p.C4583f.C4584a;
import p392u.p395p.C4583f.C4586b;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.p.b */
public abstract class C4577b<B extends C4584a, E extends B> implements C4586b<E> {

    /* renamed from: a */
    public final C4586b<?> f10784a;

    /* renamed from: b */
    public final C4618l<C4584a, E> f10785b;

    /* JADX WARNING: Incorrect type for immutable var: ssa=u.p.f$b<B>, code=u.p.f$b, for r2v0, types: [u.p.f$b, u.p.f$b<B>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4577b(p392u.p395p.C4583f.C4586b r2, p392u.p401r.p402b.C4618l<? super p392u.p395p.C4583f.C4584a, ? extends E> r3) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L_0x001b
            if (r3 == 0) goto L_0x0015
            r1.<init>()
            r1.f10785b = r3
            boolean r3 = r2 instanceof p392u.p395p.C4577b
            if (r3 == 0) goto L_0x0012
            u.p.b r2 = (p392u.p395p.C4577b) r2
            u.p.f$b<?> r2 = r2.f10784a
        L_0x0012:
            r1.f10784a = r2
            return
        L_0x0015:
            java.lang.String r2 = "safeCast"
            p392u.p401r.p403c.C4638h.m10271a(r2)
            throw r0
        L_0x001b:
            java.lang.String r2 = "baseKey"
            p392u.p401r.p403c.C4638h.m10271a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p392u.p395p.C4577b.<init>(u.p.f$b, u.r.b.l):void");
    }

    /* renamed from: a */
    public final boolean mo10907a(C4586b<?> bVar) {
        if (bVar != null) {
            return bVar == this || this.f10784a == bVar;
        }
        C4638h.m10271a("key");
        throw null;
    }
}
