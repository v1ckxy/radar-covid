package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.NoSuchElementException;

/* renamed from: q.b.a.b.g.e.y3 */
public final class C2760y3 extends C2579n4<T> {

    /* renamed from: e */
    public boolean f6988e;

    /* renamed from: f */
    public final /* synthetic */ Object f6989f;

    public C2760y3(Object obj) {
        this.f6989f = obj;
    }

    public final boolean hasNext() {
        return !this.f6988e;
    }

    public final T next() {
        if (!this.f6988e) {
            this.f6988e = true;
            return this.f6989f;
        }
        throw new NoSuchElementException();
    }
}
