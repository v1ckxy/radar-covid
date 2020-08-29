package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: q.b.a.b.g.e.n8 */
public final class C2583n8 implements Iterator<Entry<K, V>> {

    /* renamed from: e */
    public int f6745e = -1;

    /* renamed from: f */
    public boolean f6746f;

    /* renamed from: g */
    public Iterator<Entry<K, V>> f6747g;

    /* renamed from: h */
    public final /* synthetic */ C2475h8 f6748h;

    public /* synthetic */ C2583n8(C2475h8 h8Var, C2514j8 j8Var) {
        this.f6748h = h8Var;
    }

    /* renamed from: a */
    public final Iterator<Entry<K, V>> mo7887a() {
        if (this.f6747g == null) {
            this.f6747g = this.f6748h.f6577g.entrySet().iterator();
        }
        return this.f6747g;
    }

    public final boolean hasNext() {
        if (this.f6745e + 1 < this.f6748h.f6576f.size() || (!this.f6748h.f6577g.isEmpty() && mo7887a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f6746f = true;
        int i = this.f6745e + 1;
        this.f6745e = i;
        return (Entry) (i < this.f6748h.f6576f.size() ? this.f6748h.f6576f.get(this.f6745e) : mo7887a().next());
    }

    public final void remove() {
        if (this.f6746f) {
            this.f6746f = false;
            this.f6748h.mo7715d();
            if (this.f6745e < this.f6748h.f6576f.size()) {
                C2475h8 h8Var = this.f6748h;
                int i = this.f6745e;
                this.f6745e = i - 1;
                h8Var.mo7711b(i);
                return;
            }
            mo7887a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
