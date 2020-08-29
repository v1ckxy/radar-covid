package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.NoSuchElementException;

/* renamed from: q.b.a.b.g.e.e5 */
public final class C2417e5 implements C2489i5 {

    /* renamed from: e */
    public int f6457e = 0;

    /* renamed from: f */
    public final int f6458f = this.f6459g.mo7640a();

    /* renamed from: g */
    public final /* synthetic */ C2435f5 f6459g;

    public C2417e5(C2435f5 f5Var) {
        this.f6459g = f5Var;
    }

    /* renamed from: a */
    public final byte mo7619a() {
        int i = this.f6457e;
        if (i < this.f6458f) {
            this.f6457e = i + 1;
            return this.f6459g.mo7643c(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f6457e < this.f6458f;
    }

    public Object next() {
        return Byte.valueOf(mo7619a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
