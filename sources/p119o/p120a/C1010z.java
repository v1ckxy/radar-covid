package p119o.p120a;

import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4557i;
import p392u.p395p.C4576a;
import p392u.p395p.C4577b;
import p392u.p395p.C4580d;
import p392u.p395p.C4581e;
import p392u.p395p.C4583f;
import p392u.p395p.C4583f.C4584a;
import p392u.p395p.C4583f.C4586b;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: o.a.z */
public abstract class C1010z extends C4576a implements C4581e {

    /* renamed from: e */
    public static final C1011a f2659e = new C1011a(null);

    /* renamed from: o.a.z$a */
    public static final class C1011a extends C4577b<C4581e, C1010z> {
        public /* synthetic */ C1011a(C4636f fVar) {
            super(C4581e.f10789b, C1008y.f2656f);
        }
    }

    public C1010z() {
        super(C4581e.f10789b);
    }

    /* renamed from: a */
    public void mo4365a(C4580d<?> dVar) {
        if (dVar != null) {
            Object obj = ((C0931f0) dVar)._reusableCancellableContinuation;
            if (!(obj instanceof C0945j)) {
                obj = null;
            }
            C0945j jVar = (C0945j) obj;
            if (jVar != null) {
                C0949k0 k0Var = (C0949k0) jVar._parentHandle;
                if (k0Var != null) {
                    k0Var.mo4238f();
                }
                jVar._parentHandle = C0950k1.f2567e;
                return;
            }
            return;
        }
        throw new C4557i("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<*>");
    }

    /* renamed from: a */
    public abstract void mo4301a(C4583f fVar, Runnable runnable);

    /* renamed from: b */
    public final <T> C4580d<T> mo4366b(C4580d<? super T> dVar) {
        return new C0931f0(this, dVar);
    }

    /* renamed from: b */
    public boolean mo4320b(C4583f fVar) {
        return true;
    }

    public <E extends C4584a> E get(C4586b<E> bVar) {
        if (bVar == null) {
            C4638h.m10271a("key");
            throw null;
        } else if (bVar instanceof C4577b) {
            C4577b bVar2 = (C4577b) bVar;
            if (!bVar2.mo10907a(getKey())) {
                return null;
            }
            C4584a aVar = (C4584a) bVar2.f10785b.mo3153b(this);
            if (!(aVar instanceof C4584a)) {
                return null;
            }
            return aVar;
        } else if (C4581e.f10789b == bVar) {
            return this;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (p392u.p395p.C4581e.f10789b == r2) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (((p392u.p395p.C4583f.C4584a) r2.f10785b.mo3153b(r1)) != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p392u.p395p.C4583f minusKey(p392u.p395p.C4583f.C4586b<?> r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0027
            boolean r0 = r2 instanceof p392u.p395p.C4577b
            if (r0 == 0) goto L_0x0021
            u.p.b r2 = (p392u.p395p.C4577b) r2
            u.p.f$b r0 = r1.getKey()
            boolean r0 = r2.mo10907a(r0)
            if (r0 == 0) goto L_0x001f
            u.r.b.l<u.p.f$a, E> r2 = r2.f10785b
            java.lang.Object r2 = r2.mo3153b(r1)
            u.p.f$a r2 = (p392u.p395p.C4583f.C4584a) r2
            if (r2 == 0) goto L_0x001f
        L_0x001c:
            u.p.h r2 = p392u.p395p.C4588h.f10792e
            goto L_0x0026
        L_0x001f:
            r2 = r1
            goto L_0x0026
        L_0x0021:
            u.p.e$a r0 = p392u.p395p.C4581e.f10789b
            if (r0 != r2) goto L_0x001f
            goto L_0x001c
        L_0x0026:
            return r2
        L_0x0027:
            java.lang.String r2 = "key"
            p392u.p401r.p403c.C4638h.m10271a(r2)
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C1010z.minusKey(u.p.f$b):u.p.f");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(C2286e.m5323d((Object) this));
        return sb.toString();
    }
}
