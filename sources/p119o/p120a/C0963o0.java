package p119o.p120a;

import java.util.concurrent.locks.LockSupport;
import p119o.p120a.C0958n0.C0959a;
import p119o.p120a.C0958n0.C0960b;
import p392u.p401r.p403c.C4638h;

/* renamed from: o.a.o0 */
public abstract class C0963o0 extends C0955m0 {
    /* renamed from: a */
    public final void mo4309a(long j, C0959a aVar) {
        int i;
        C0928e0 e0Var = C0928e0.f2529l;
        boolean z = true;
        C0959a aVar2 = null;
        if (e0Var._isCompleted != 0) {
            i = 1;
        } else {
            C0960b bVar = (C0960b) e0Var._delayed;
            if (bVar == null) {
                C0958n0.f2575j.compareAndSet(e0Var, null, new C0960b(j));
                Object obj = e0Var._delayed;
                if (obj != null) {
                    bVar = (C0960b) obj;
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            }
            i = aVar.mo4304a(j, bVar, e0Var);
        }
        if (i == 0) {
            C0960b bVar2 = (C0960b) e0Var._delayed;
            if (bVar2 != null) {
                aVar2 = (C0959a) bVar2.mo4198b();
            }
            if (aVar2 != aVar) {
                z = false;
            }
            if (z) {
                Thread s = e0Var.mo4231s();
                if (Thread.currentThread() != s) {
                    LockSupport.unpark(s);
                }
            }
        } else if (i == 1) {
            e0Var.mo4309a(j, aVar);
        } else if (i != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* renamed from: s */
    public abstract Thread mo4231s();
}
