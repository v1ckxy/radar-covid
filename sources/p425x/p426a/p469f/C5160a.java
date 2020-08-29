package p425x.p426a.p469f;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.f.a */
public class C5160a<T> implements Iterator<T> {

    /* renamed from: e */
    public final T[] f12348e;

    /* renamed from: f */
    public int f12349f = 0;

    public C5160a(T[] tArr) {
        this.f12348e = tArr;
    }

    public boolean hasNext() {
        return this.f12349f < this.f12348e.length;
    }

    public T next() {
        int i = this.f12349f;
        T[] tArr = this.f12348e;
        if (i != tArr.length) {
            this.f12349f = i + 1;
            return tArr[i];
        }
        StringBuilder a = C1965a.m4756a("Out of elements: ");
        a.append(this.f12349f);
        throw new NoSuchElementException(a.toString());
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove element from an Array.");
    }
}
