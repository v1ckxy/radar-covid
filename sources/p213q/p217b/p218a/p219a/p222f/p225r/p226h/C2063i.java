package p213q.p217b.p218a.p219a.p222f.p225r.p226h;

import p213q.p217b.p218a.p219a.p222f.C2018i;
import p213q.p217b.p218a.p219a.p222f.p223p.C2028b;
import p213q.p217b.p218a.p219a.p222f.p223p.C2033g;
import p213q.p217b.p218a.p219a.p222f.p223p.C2033g.C2034a;
import p213q.p217b.p218a.p219a.p222f.p228s.C2097b.C2098a;

/* renamed from: q.b.a.a.f.r.h.i */
public final /* synthetic */ class C2063i implements C2098a {

    /* renamed from: a */
    public final C2066l f5875a;

    /* renamed from: b */
    public final C2033g f5876b;

    /* renamed from: c */
    public final Iterable f5877c;

    /* renamed from: d */
    public final C2018i f5878d;

    /* renamed from: e */
    public final int f5879e;

    public C2063i(C2066l lVar, C2033g gVar, Iterable iterable, C2018i iVar, int i) {
        this.f5875a = lVar;
        this.f5876b = gVar;
        this.f5877c = iterable;
        this.f5878d = iVar;
        this.f5879e = i;
    }

    /* renamed from: f */
    public Object mo7031f() {
        C2066l lVar = this.f5875a;
        C2033g gVar = this.f5876b;
        Iterable iterable = this.f5877c;
        C2018i iVar = this.f5878d;
        int i = this.f5879e;
        C2028b bVar = (C2028b) gVar;
        if (bVar.f5805a == C2034a.TRANSIENT_ERROR) {
            lVar.f5886c.mo7060b(iterable);
            lVar.f5887d.mo7043a(iVar, i + 1);
        } else {
            lVar.f5886c.mo7057a(iterable);
            if (bVar.f5805a == C2034a.OK) {
                lVar.f5886c.mo7058a(iVar, lVar.f5890g.mo7076a() + bVar.f5806b);
            }
            if (lVar.f5886c.mo7062c(iVar)) {
                lVar.f5887d.mo7043a(iVar, 1);
            }
        }
        return null;
    }
}
