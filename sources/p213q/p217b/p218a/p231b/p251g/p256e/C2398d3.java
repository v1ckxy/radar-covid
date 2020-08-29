package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.d3 */
public abstract class C2398d3<T> implements Iterator<T> {

    /* renamed from: e */
    public int f6433e;

    /* renamed from: f */
    public int f6434f;

    /* renamed from: g */
    public int f6435g;

    /* renamed from: h */
    public final /* synthetic */ C2343a3 f6436h;

    public /* synthetic */ C2398d3(C2343a3 a3Var, C2775z2 z2Var) {
        this.f6436h = a3Var;
        C2343a3 a3Var2 = this.f6436h;
        this.f6433e = a3Var2.f6308i;
        this.f6434f = a3Var2.isEmpty() ? -1 : 0;
        this.f6435g = -1;
    }

    /* renamed from: a */
    public abstract T mo7411a(int i);

    public boolean hasNext() {
        return this.f6434f >= 0;
    }

    public T next() {
        if (this.f6436h.f6308i != this.f6433e) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            int i = this.f6434f;
            this.f6435g = i;
            T a = mo7411a(i);
            int i2 = this.f6434f + 1;
            if (i2 >= this.f6436h.f6309j) {
                i2 = -1;
            }
            this.f6434f = i2;
            return a;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        if (this.f6436h.f6308i == this.f6433e) {
            C2286e.m5252a(this.f6435g >= 0, (Object) "no calls to next() since the last call to remove()");
            this.f6433e += 32;
            C2343a3 a3Var = this.f6436h;
            a3Var.remove(a3Var.f6306g[this.f6435g]);
            this.f6434f--;
            this.f6435g = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
