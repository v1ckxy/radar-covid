package p392u.p401r.p403c;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p392u.p401r.p403c.p404p.C4646a;

/* renamed from: u.r.c.a */
public final class C4630a<T> implements Iterator<T>, C4646a {

    /* renamed from: e */
    public int f10818e;

    /* renamed from: f */
    public final T[] f10819f;

    public C4630a(T[] tArr) {
        if (tArr != null) {
            this.f10819f = tArr;
        } else {
            C4638h.m10271a("array");
            throw null;
        }
    }

    public boolean hasNext() {
        return this.f10818e < this.f10819f.length;
    }

    public T next() {
        try {
            T[] tArr = this.f10819f;
            int i = this.f10818e;
            this.f10818e = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f10818e--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
