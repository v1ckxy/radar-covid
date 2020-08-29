package p392u.p395p.p396j;

import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4557i;
import p392u.p395p.C4580d;
import p392u.p395p.p397k.p398a.C4600g;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4645o;

/* renamed from: u.p.j.b */
public final class C4591b extends C4600g {

    /* renamed from: f */
    public int f10799f;

    /* renamed from: g */
    public final /* synthetic */ C4622p f10800g;

    /* renamed from: h */
    public final /* synthetic */ Object f10801h;

    public C4591b(C4580d dVar, C4580d dVar2, C4622p pVar, Object obj) {
        this.f10800g = pVar;
        this.f10801h = obj;
        super(dVar2);
    }

    /* renamed from: c */
    public Object mo3783c(Object obj) {
        int i = this.f10799f;
        if (i == 0) {
            this.f10799f = 1;
            C2286e.m5339f(obj);
            C4622p pVar = this.f10800g;
            if (pVar != null) {
                C4645o.m10278a((Object) pVar, 2);
                return pVar.mo3781a(this.f10801h, this);
            }
            throw new C4557i("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } else if (i == 1) {
            this.f10799f = 2;
            C2286e.m5339f(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
