package p003f.p004a.p005a.p108g.p109a;

import java.util.NoSuchElementException;
import p119o.p120a.C0916a1;
import p119o.p120a.C0919b0;
import p119o.p120a.C0938g1;
import p119o.p120a.C0940h0;
import p119o.p120a.C0946j0;
import p119o.p120a.C0967p0;
import p119o.p120a.C0974r1;
import p119o.p120a.C0975s;
import p119o.p120a.C1010z;
import p119o.p120a.p121a.C0890a;
import p119o.p120a.p121a.C0909n;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4552e;
import p392u.C4560l;
import p392u.p395p.C4580d;
import p392u.p395p.C4581e;
import p392u.p395p.C4583f;
import p392u.p395p.p396j.C4590a;
import p392u.p395p.p397k.p398a.C4597e;
import p392u.p395p.p397k.p398a.C4601h;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4638h;
import p425x.p482c.p483a.C5244a;
import p425x.p482c.p483a.C5244a.C5245a;
import p425x.p482c.p483a.C5244a.C5246b;

@C4597e(mo10919c = "es.gob.radarcovid.common.base.TopLevelFunctionsKt$asyncRequest$1", mo10920f = "TopLevelFunctions.kt", mo10921l = {38}, mo10922m = "invokeSuspend")
/* renamed from: f.a.a.g.a.g */
public final class C0708g extends C4601h implements C4622p<C0919b0, C4580d<? super C4560l>, Object> {

    /* renamed from: i */
    public C0919b0 f2159i;

    /* renamed from: j */
    public Object f2160j;

    /* renamed from: k */
    public int f2161k;

    /* renamed from: l */
    public final /* synthetic */ C4607a f2162l;

    /* renamed from: m */
    public final /* synthetic */ C4618l f2163m;

    /* renamed from: n */
    public final /* synthetic */ C4618l f2164n;

    @C4597e(mo10919c = "es.gob.radarcovid.common.base.TopLevelFunctionsKt$asyncRequest$1$result$1", mo10920f = "TopLevelFunctions.kt", mo10921l = {}, mo10922m = "invokeSuspend")
    /* renamed from: f.a.a.g.a.g$a */
    public static final class C0709a extends C4601h implements C4622p<C0919b0, C4580d<? super C5244a<? extends Throwable, ? extends T>>, Object> {

        /* renamed from: i */
        public C0919b0 f2165i;

        /* renamed from: j */
        public final /* synthetic */ C0708g f2166j;

        public C0709a(C0708g gVar, C4580d dVar) {
            this.f2166j = gVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final C4580d<C4560l> mo3782a(Object obj, C4580d<?> dVar) {
            if (dVar != null) {
                C0709a aVar = new C0709a(this.f2166j, dVar);
                aVar.f2165i = (C0919b0) obj;
                return aVar;
            }
            C4638h.m10271a("completion");
            throw null;
        }

        /* renamed from: c */
        public final Object mo3783c(Object obj) {
            C4590a aVar = C4590a.COROUTINE_SUSPENDED;
            C2286e.m5339f(obj);
            return this.f2166j.f2162l.mo3123c();
        }

        /* renamed from: a */
        public final Object mo3781a(Object obj, Object obj2) {
            C0709a aVar = (C0709a) mo3782a(obj, (C4580d) obj2);
            C4560l lVar = C4560l.f10773a;
            C4590a aVar2 = C4590a.COROUTINE_SUSPENDED;
            C2286e.m5339f((Object) lVar);
            return aVar.f2166j.f2162l.mo3123c();
        }
    }

    public C0708g(C4607a aVar, C4618l lVar, C4618l lVar2, C4580d dVar) {
        this.f2162l = aVar;
        this.f2163m = lVar;
        this.f2164n = lVar2;
        super(2, dVar);
    }

    /* renamed from: a */
    public final Object mo3781a(Object obj, Object obj2) {
        return ((C0708g) mo3782a(obj, (C4580d) obj2)).mo3783c(C4560l.f10773a);
    }

    /* renamed from: a */
    public final C4580d<C4560l> mo3782a(Object obj, C4580d<?> dVar) {
        if (dVar != null) {
            C0708g gVar = new C0708g(this.f2162l, this.f2163m, this.f2164n, dVar);
            gVar.f2159i = (C0919b0) obj;
            return gVar;
        }
        C4638h.m10271a("completion");
        throw null;
    }

    /* renamed from: c */
    public final Object mo3783c(Object obj) {
        Object obj2;
        C4618l lVar;
        C4590a aVar = C4590a.COROUTINE_SUSPENDED;
        int i = this.f2161k;
        boolean z = true;
        if (i == 0) {
            C2286e.m5339f(obj);
            C0919b0 b0Var = this.f2159i;
            C1010z zVar = C0946j0.f2565b;
            C0709a aVar2 = new C0709a(this, null);
            this.f2160j = b0Var;
            this.f2161k = 1;
            C4583f b = mo4219b();
            C4583f plus = b.plus(zVar);
            C0916a1 a1Var = (C0916a1) plus.get(C0916a1.f2512d);
            if (a1Var == null || a1Var.mo4208a()) {
                if (plus == b) {
                    C0909n nVar = new C0909n(plus, this);
                    obj = C0967p0.m2178a(nVar, nVar, (C4622p<? super R, ? super C4580d<? super T>, ? extends Object>) aVar2);
                } else if (C4638h.m10272a((Object) (C4581e) plus.get(C4581e.f10789b), (Object) (C4581e) b.get(C4581e.f10789b))) {
                    C0974r1 r1Var = new C0974r1(plus, this);
                    Object b2 = C0890a.m1971b(plus, null);
                    try {
                        obj = C0967p0.m2178a((C0909n<? super T>) r1Var, r1Var, (C4622p<? super R, ? super C4580d<? super T>, ? extends Object>) aVar2);
                    } finally {
                        C0890a.m1970a(plus, b2);
                    }
                } else {
                    C0940h0 h0Var = new C0940h0(plus, this);
                    h0Var.mo4225m();
                    C0967p0.m2204a((C4622p<? super R, ? super C4580d<? super T>, ? extends Object>) aVar2, h0Var, (C4580d<? super T>) h0Var);
                    while (true) {
                        int i2 = h0Var._decision;
                        if (i2 == 0) {
                            if (C0940h0.f2557i.compareAndSet(h0Var, 0, 1)) {
                                break;
                            }
                        } else if (i2 == 2) {
                            z = false;
                        } else {
                            throw new IllegalStateException("Already suspended".toString());
                        }
                    }
                    if (z) {
                        obj = C4590a.COROUTINE_SUSPENDED;
                    } else {
                        obj = C0938g1.m2096b(h0Var.mo4267i());
                        if (obj instanceof C0975s) {
                            throw ((C0975s) obj).f2591a;
                        }
                    }
                }
                C4590a aVar3 = C4590a.COROUTINE_SUSPENDED;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                throw a1Var.mo4209h();
            }
        } else if (i == 1) {
            C0919b0 b0Var2 = (C0919b0) this.f2160j;
            C2286e.m5339f(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C5244a aVar4 = (C5244a) obj;
        if (aVar4.mo11966a()) {
            lVar = this.f2163m;
            if (aVar4 instanceof C5246b) {
                obj2 = ((C5246b) aVar4).f12484a;
            } else if (aVar4 instanceof C5245a) {
                throw new NoSuchElementException("Either.right.value on Left");
            } else {
                throw new C4552e();
            }
        } else {
            lVar = this.f2164n;
            if (aVar4 instanceof C5245a) {
                obj2 = ((C5245a) aVar4).f12483a;
            } else if (aVar4 instanceof C5246b) {
                throw new NoSuchElementException("Either.left.value on Right");
            } else {
                throw new C4552e();
            }
        }
        lVar.mo3153b(obj2);
        return C4560l.f10773a;
    }
}
