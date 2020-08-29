package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: q.b.a.b.g.e.v8 */
public final class C2718v8 extends AbstractList<String> implements C2347a7, RandomAccess {

    /* renamed from: e */
    public final C2347a7 f6932e;

    public C2718v8(C2347a7 a7Var) {
        this.f6932e = a7Var;
    }

    /* renamed from: a */
    public final void mo7399a(C2435f5 f5Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final Object mo7400c(int i) {
        return this.f6932e.mo7400c(i);
    }

    /* renamed from: d */
    public final List<?> mo7401d() {
        return this.f6932e.mo7401d();
    }

    /* renamed from: e */
    public final C2347a7 mo7402e() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f6932e.get(i);
    }

    public final Iterator<String> iterator() {
        return new C2749x8(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C2765y8(this, i);
    }

    public final int size() {
        return this.f6932e.size();
    }
}
