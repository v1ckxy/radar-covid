package p213q.p217b.p218a.p231b.p251g.p256e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: q.b.a.b.g.e.r4 */
public final class C2649r4 extends WeakReference<Throwable> {

    /* renamed from: a */
    public final int f6833a;

    public C2649r4(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f6833a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C2649r4.class) {
            if (this == obj) {
                return true;
            }
            C2649r4 r4Var = (C2649r4) obj;
            return this.f6833a == r4Var.f6833a && get() == r4Var.get();
        }
    }

    public final int hashCode() {
        return this.f6833a;
    }
}
