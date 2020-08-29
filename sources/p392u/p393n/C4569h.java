package p392u.p393n;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p392u.p401r.p403c.p404p.C4646a;

/* renamed from: u.n.h */
public final class C4569h implements ListIterator, C4646a {

    /* renamed from: e */
    public static final C4569h f10778e = new C4569h();

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public int nextIndex() {
        return 0;
    }

    public Object previous() {
        throw new NoSuchElementException();
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
