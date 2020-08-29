package p213q.p217b.p218a.p231b.p251g.p256e;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: q.b.a.b.g.e.l3 */
public abstract class C2543l3<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: e */
    public static final Object[] f6701e = new Object[0];

    /* renamed from: a */
    public int mo7499a(Object[] objArr, int i) {
        C2579n4 n4Var = (C2579n4) iterator();
        while (n4Var.hasNext()) {
            int i2 = i + 1;
            objArr[i] = n4Var.next();
            i = i2;
        }
        return i;
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract C2579n4<E> iterator();

    /* renamed from: c */
    public int mo7500c() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    @NullableDecl
    /* renamed from: e */
    public Object[] mo7501e() {
        return null;
    }

    /* renamed from: f */
    public int mo7502f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public abstract boolean mo7503g();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f6701e);
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr != null) {
            int size = size();
            if (tArr.length < size) {
                Object[] e = mo7501e();
                if (e != null) {
                    return Arrays.copyOfRange(e, mo7500c(), mo7502f(), tArr.getClass());
                }
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
            } else if (tArr.length > size) {
                tArr[size] = null;
            }
            mo7499a(tArr, 0);
            return tArr;
        }
        throw null;
    }
}
