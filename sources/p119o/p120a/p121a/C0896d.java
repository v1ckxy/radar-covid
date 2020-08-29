package p119o.p120a.p121a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p119o.p120a.C0932f1.C0935c;
import p119o.p120a.p121a.C0900h.C0901a;
import p392u.p401r.p403c.C4638h;

/* renamed from: o.a.a.d */
public abstract class C0896d<T> extends C0907l {

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f2483a = AtomicReferenceFieldUpdater.newUpdater(C0896d.class, Object.class, "_consensus");
    public volatile Object _consensus = C0895c.f2482a;

    /* renamed from: a */
    public final Object mo4169a(Object obj) {
        Object obj2 = this._consensus;
        boolean z = true;
        if (obj2 == C0895c.f2482a) {
            C0935c cVar = (C0935c) this;
            C0900h hVar = (C0900h) obj;
            if (cVar.f2545d.mo4267i() == cVar.f2546e) {
                obj2 = null;
            } else {
                obj2 = C0899g.f2485a;
            }
            Object obj3 = this._consensus;
            Object obj4 = C0895c.f2482a;
            if (obj3 != obj4) {
                obj2 = obj3;
            } else if (!f2483a.compareAndSet(this, obj4, obj2)) {
                obj2 = this._consensus;
            }
        }
        C0901a aVar = (C0901a) this;
        C0900h hVar2 = (C0900h) obj;
        if (obj2 != null) {
            z = false;
        }
        C0900h hVar3 = z ? aVar.f2490c : aVar.f2489b;
        if (hVar3 != null && C0900h.f2486e.compareAndSet(hVar2, aVar, hVar3) && z) {
            C0900h hVar4 = aVar.f2490c;
            C0900h hVar5 = aVar.f2489b;
            if (hVar5 != null) {
                hVar4.mo4174a(hVar5);
            } else {
                C4638h.m10269a();
                throw null;
            }
        }
        return obj2;
    }
}
