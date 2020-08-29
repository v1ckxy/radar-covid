package p119o.p120a;

import p119o.p120a.C0916a1;
import p119o.p120a.p121a.C0900h;
import p119o.p120a.p121a.C0907l;
import p119o.p120a.p121a.C0908m;
import p392u.C4557i;

/* renamed from: o.a.e1 */
public abstract class C0929e1<J extends C0916a1> extends C1002v implements C0949k0, C1003v0 {

    /* renamed from: h */
    public final J f2530h;

    public C0929e1(J j) {
        this.f2530h = j;
    }

    /* renamed from: a */
    public boolean mo4236a() {
        return true;
    }

    /* renamed from: b */
    public C0947j1 mo4237b() {
        return null;
    }

    /* renamed from: f */
    public void mo4238f() {
        Object i;
        Object g;
        C0900h hVar;
        C0908m mVar;
        J j = this.f2530h;
        if (j != null) {
            C0932f1 f1Var = (C0932f1) j;
            do {
                i = f1Var.mo4267i();
                if (i instanceof C0929e1) {
                    if (i != this) {
                        return;
                    }
                } else if ((i instanceof C1003v0) && ((C1003v0) i).mo4237b() != null) {
                    do {
                        g = mo4175g();
                        if (g instanceof C0908m) {
                            C0900h hVar2 = ((C0908m) g).f2503a;
                            return;
                        } else if (g == this) {
                            C0900h hVar3 = (C0900h) g;
                            return;
                        } else if (g != null) {
                            hVar = (C0900h) g;
                            mVar = (C0908m) hVar._removedRef;
                            if (mVar == null) {
                                mVar = new C0908m(hVar);
                                C0900h.f2488g.lazySet(hVar, mVar);
                            }
                        } else {
                            throw new C4557i("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    } while (!C0900h.f2486e.compareAndSet(this, g, mVar));
                    hVar.mo4173a((C0907l) null);
                    return;
                } else {
                    return;
                }
            } while (!C0932f1.f2539e.compareAndSet(f1Var, i, C0938g1.f2556g));
            return;
        }
        throw new C4557i("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
    }
}
