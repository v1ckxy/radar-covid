package p392u.p395p.p396j;

import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4557i;
import p392u.p395p.C4580d;
import p392u.p395p.C4583f;
import p392u.p395p.p397k.p398a.C4595c;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4645o;

/* renamed from: u.p.j.c */
public final class C4592c extends C4595c {

    /* renamed from: h */
    public int f10802h;

    /* renamed from: i */
    public final /* synthetic */ C4622p f10803i;

    /* renamed from: j */
    public final /* synthetic */ Object f10804j;

    public C4592c(C4580d dVar, C4583f fVar, C4580d dVar2, C4583f fVar2, C4622p pVar, Object obj) {
        this.f10803i = pVar;
        this.f10804j = obj;
        super(dVar2, fVar2);
    }

    /* renamed from: c */
    public Object mo3783c(Object obj) {
        int i = this.f10802h;
        if (i == 0) {
            this.f10802h = 1;
            C2286e.m5339f(obj);
            C4622p pVar = this.f10803i;
            if (pVar != null) {
                C4645o.m10278a((Object) pVar, 2);
                return pVar.mo3781a(this.f10804j, this);
            }
            throw new C4557i("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } else if (i == 1) {
            this.f10802h = 2;
            C2286e.m5339f(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
