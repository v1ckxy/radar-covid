package p124p.p143e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p143e.C1255g.C1258c;

/* renamed from: p.e.c */
public final class C1251c<E> implements Collection<E>, Set<E> {

    /* renamed from: i */
    public static final int[] f3543i = new int[0];

    /* renamed from: j */
    public static final Object[] f3544j = new Object[0];

    /* renamed from: k */
    public static Object[] f3545k;

    /* renamed from: l */
    public static int f3546l;

    /* renamed from: m */
    public static Object[] f3547m;

    /* renamed from: n */
    public static int f3548n;

    /* renamed from: e */
    public int[] f3549e = f3543i;

    /* renamed from: f */
    public Object[] f3550f = f3544j;

    /* renamed from: g */
    public int f3551g = 0;

    /* renamed from: h */
    public C1255g<E, E> f3552h;

    /* renamed from: a */
    public static void m3153a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1251c.class) {
                if (f3548n < 10) {
                    objArr[0] = f3547m;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f3547m = objArr;
                    f3548n++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C1251c.class) {
                if (f3546l < 10) {
                    objArr[0] = f3545k;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3545k = objArr;
                    f3546l++;
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo5490a(Object obj, int i) {
        int i2 = this.f3551g;
        if (i2 == 0) {
            return -1;
        }
        int a = C1252d.m3159a(this.f3549e, i2, i);
        if (a < 0 || obj.equals(this.f3550f[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f3549e[i3] == i) {
            if (obj.equals(this.f3550f[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f3549e[i4] == i) {
            if (obj.equals(this.f3550f[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = mo5493c();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = mo5490a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f3551g;
        if (i4 >= this.f3549e.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f3549e;
            Object[] objArr = this.f3550f;
            mo5497e(i5);
            int[] iArr2 = this.f3549e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3550f, 0, objArr.length);
            }
            m3153a(iArr, objArr, this.f3551g);
        }
        int i6 = this.f3551g;
        if (i3 < i6) {
            int[] iArr3 = this.f3549e;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f3550f;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f3551g - i3);
        }
        this.f3549e[i3] = i;
        this.f3550f[i3] = e;
        this.f3551g++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f3551g;
        int[] iArr = this.f3549e;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3550f;
            mo5497e(size);
            int i = this.f3551g;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f3549e, 0, i);
                System.arraycopy(objArr, 0, this.f3550f, 0, this.f3551g);
            }
            m3153a(iArr, objArr, this.f3551g);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: c */
    public final int mo5493c() {
        int i = this.f3551g;
        if (i == 0) {
            return -1;
        }
        int a = C1252d.m3159a(this.f3549e, i, 0);
        if (a < 0 || this.f3550f[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f3549e[i2] == 0) {
            if (this.f3550f[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f3549e[i3] == 0) {
            if (this.f3550f[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public void clear() {
        int i = this.f3551g;
        if (i != 0) {
            m3153a(this.f3549e, this.f3550f, i);
            this.f3549e = f3543i;
            this.f3550f = f3544j;
            this.f3551g = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final void mo5497e(int i) {
        if (i == 8) {
            synchronized (C1251c.class) {
                if (f3547m != null) {
                    Object[] objArr = f3547m;
                    this.f3550f = objArr;
                    f3547m = (Object[]) objArr[0];
                    this.f3549e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3548n--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1251c.class) {
                if (f3545k != null) {
                    Object[] objArr2 = f3545k;
                    this.f3550f = objArr2;
                    f3545k = (Object[]) objArr2[0];
                    this.f3549e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3546l--;
                    return;
                }
            }
        }
        this.f3549e = new int[i];
        this.f3550f = new Object[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f3551g != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f3551g) {
                try {
                    if (!set.contains(this.f3550f[i])) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public E mo5499f(int i) {
        E[] eArr = this.f3550f;
        E e = eArr[i];
        int i2 = this.f3551g;
        if (i2 <= 1) {
            m3153a(this.f3549e, eArr, i2);
            this.f3549e = f3543i;
            this.f3550f = f3544j;
            this.f3551g = 0;
        } else {
            int[] iArr = this.f3549e;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = this.f3551g - 1;
                this.f3551g = i4;
                if (i < i4) {
                    int[] iArr2 = this.f3549e;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.f3550f;
                    System.arraycopy(objArr, i5, objArr, i, this.f3551g - i);
                }
                this.f3550f[this.f3551g] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f3549e;
                Object[] objArr2 = this.f3550f;
                mo5497e(i3);
                this.f3551g--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f3549e, 0, i);
                    System.arraycopy(objArr2, 0, this.f3550f, 0, i);
                }
                int i6 = this.f3551g;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f3549e, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.f3550f, i, this.f3551g - i);
                }
            }
        }
        return e;
    }

    public int hashCode() {
        int[] iArr = this.f3549e;
        int i = 0;
        for (int i2 = 0; i2 < this.f3551g; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        return obj == null ? mo5493c() : mo5490a(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f3551g <= 0;
    }

    public Iterator<E> iterator() {
        if (this.f3552h == null) {
            this.f3552h = new C1250b(this);
        }
        C1255g<E, E> gVar = this.f3552h;
        if (gVar.f3569b == null) {
            gVar.f3569b = new C1258c<>();
        }
        return gVar.f3569b.iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo5499f(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f3551g - 1; i >= 0; i--) {
            if (!collection.contains(this.f3550f[i])) {
                mo5499f(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f3551g;
    }

    public Object[] toArray() {
        int i = this.f3551g;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f3550f, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f3551g) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f3551g);
        }
        System.arraycopy(this.f3550f, 0, tArr, 0, this.f3551g);
        int length = tArr.length;
        int i = this.f3551g;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return Objects.EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder(this.f3551g * 14);
        sb.append('{');
        for (int i = 0; i < this.f3551g; i++) {
            if (i > 0) {
                sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            }
            Object obj = this.f3550f[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
