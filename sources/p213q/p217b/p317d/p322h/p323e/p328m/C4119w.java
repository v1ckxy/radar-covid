package p213q.p217b.p317d.p322h.p323e.p328m;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: q.b.d.h.e.m.w */
public final class C4119w<E> implements List<E>, RandomAccess {

    /* renamed from: e */
    public final List<E> f9980e;

    public C4119w(List<E> list) {
        this.f9980e = Collections.unmodifiableList(list);
    }

    public void add(int i, E e) {
        this.f9980e.add(i, e);
    }

    public boolean add(E e) {
        return this.f9980e.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        return this.f9980e.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return this.f9980e.addAll(collection);
    }

    public void clear() {
        this.f9980e.clear();
    }

    public boolean contains(Object obj) {
        return this.f9980e.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f9980e.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this.f9980e.equals(obj);
    }

    public E get(int i) {
        return this.f9980e.get(i);
    }

    public int hashCode() {
        return this.f9980e.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f9980e.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f9980e.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.f9980e.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f9980e.lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return this.f9980e.listIterator();
    }

    public ListIterator<E> listIterator(int i) {
        return this.f9980e.listIterator(i);
    }

    public E remove(int i) {
        return this.f9980e.remove(i);
    }

    public boolean remove(Object obj) {
        return this.f9980e.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.f9980e.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.f9980e.retainAll(collection);
    }

    public E set(int i, E e) {
        return this.f9980e.set(i, e);
    }

    public int size() {
        return this.f9980e.size();
    }

    public List<E> subList(int i, int i2) {
        return this.f9980e.subList(i, i2);
    }

    public Object[] toArray() {
        return this.f9980e.toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return this.f9980e.toArray(tArr);
    }
}
