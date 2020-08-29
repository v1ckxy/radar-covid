package p484y;

import javax.annotation.Nullable;
import p119o.p120a.C0945j;
import p119o.p120a.C0967p0;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p395p.C4580d;
import p392u.p395p.p396j.C4590a;
import p410v.C4708f.C4709a;
import p410v.C4725j0;

/* renamed from: y.k */
public abstract class C5325k<ResponseT, ReturnT> extends C5270e0<ReturnT> {

    /* renamed from: a */
    public final C5254b0 f12606a;

    /* renamed from: b */
    public final C4709a f12607b;

    /* renamed from: c */
    public final C5280h<C4725j0, ResponseT> f12608c;

    /* renamed from: y.k$a */
    public static final class C5326a<ResponseT, ReturnT> extends C5325k<ResponseT, ReturnT> {

        /* renamed from: d */
        public final C5268e<ResponseT, ReturnT> f12609d;

        public C5326a(C5254b0 b0Var, C4709a aVar, C5280h<C4725j0, ResponseT> hVar, C5268e<ResponseT, ReturnT> eVar) {
            super(b0Var, aVar, hVar);
            this.f12609d = eVar;
        }

        /* renamed from: a */
        public ReturnT mo12052a(C5264d<ResponseT> dVar, Object[] objArr) {
            return this.f12609d.mo12003a(dVar);
        }
    }

    /* renamed from: y.k$b */
    public static final class C5327b<ResponseT> extends C5325k<ResponseT, Object> {

        /* renamed from: d */
        public final C5268e<ResponseT, C5264d<ResponseT>> f12610d;

        /* renamed from: e */
        public final boolean f12611e;

        public C5327b(C5254b0 b0Var, C4709a aVar, C5280h<C4725j0, ResponseT> hVar, C5268e<ResponseT, C5264d<ResponseT>> eVar, boolean z) {
            super(b0Var, aVar, hVar);
            this.f12610d = eVar;
            this.f12611e = z;
        }

        /* renamed from: a */
        public Object mo12052a(C5264d<ResponseT> dVar, Object[] objArr) {
            Object obj;
            C5264d dVar2 = (C5264d) this.f12610d.mo12003a(dVar);
            C4580d dVar3 = objArr[objArr.length - 1];
            try {
                if (this.f12611e) {
                    C0945j jVar = new C0945j(C2286e.m5218a(dVar3), 1);
                    jVar.mo4278a(new C5331n(dVar2));
                    dVar2.mo11987a(new C5333p(jVar));
                    obj = jVar.mo4287e();
                    C4590a aVar = C4590a.COROUTINE_SUSPENDED;
                } else {
                    C0945j jVar2 = new C0945j(C2286e.m5218a(dVar3), 1);
                    jVar2.mo4278a(new C5330m(dVar2));
                    dVar2.mo11987a(new C5332o(jVar2));
                    obj = jVar2.mo4287e();
                    C4590a aVar2 = C4590a.COROUTINE_SUSPENDED;
                }
                return obj;
            } catch (Exception e) {
                return C0967p0.m2177a(e, dVar3);
            }
        }
    }

    /* renamed from: y.k$c */
    public static final class C5328c<ResponseT> extends C5325k<ResponseT, Object> {

        /* renamed from: d */
        public final C5268e<ResponseT, C5264d<ResponseT>> f12612d;

        public C5328c(C5254b0 b0Var, C4709a aVar, C5280h<C4725j0, ResponseT> hVar, C5268e<ResponseT, C5264d<ResponseT>> eVar) {
            super(b0Var, aVar, hVar);
            this.f12612d = eVar;
        }

        /* renamed from: a */
        public Object mo12052a(C5264d<ResponseT> dVar, Object[] objArr) {
            C5264d dVar2 = (C5264d) this.f12612d.mo12003a(dVar);
            C4580d dVar3 = objArr[objArr.length - 1];
            try {
                C0945j jVar = new C0945j(C2286e.m5218a(dVar3), 1);
                jVar.mo4278a(new C5334q(dVar2));
                dVar2.mo11987a(new C5335r(jVar));
                Object e = jVar.mo4287e();
                C4590a aVar = C4590a.COROUTINE_SUSPENDED;
                return e;
            } catch (Exception e2) {
                return C0967p0.m2177a(e2, dVar3);
            }
        }
    }

    public C5325k(C5254b0 b0Var, C4709a aVar, C5280h<C4725j0, ResponseT> hVar) {
        this.f12606a = b0Var;
        this.f12607b = aVar;
        this.f12608c = hVar;
    }

    @Nullable
    /* renamed from: a */
    public abstract ReturnT mo12052a(C5264d<ResponseT> dVar, Object[] objArr);
}
