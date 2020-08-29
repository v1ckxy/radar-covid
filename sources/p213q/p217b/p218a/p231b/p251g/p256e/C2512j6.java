package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.e.j6 */
public final class C2512j6 extends C2345a5<Integer> implements C2598o6, C2780z7, RandomAccess {

    /* renamed from: h */
    public static final C2512j6 f6646h;

    /* renamed from: f */
    public int[] f6647f;

    /* renamed from: g */
    public int f6648g;

    static {
        C2512j6 j6Var = new C2512j6(new int[0], 0);
        f6646h = j6Var;
        j6Var.f6313e = false;
    }

    public C2512j6() {
        this.f6647f = new int[10];
        this.f6648g = 0;
    }

    public C2512j6(int[] iArr, int i) {
        this.f6647f = iArr;
        this.f6648g = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo7392c();
        if (i >= 0) {
            int i2 = this.f6648g;
            if (i <= i2) {
                int[] iArr = this.f6647f;
                if (i2 < iArr.length) {
                    System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
                } else {
                    int[] iArr2 = new int[C1965a.m4760b(i2, 3, 2, 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    System.arraycopy(this.f6647f, i, iArr2, i + 1, this.f6648g - i);
                    this.f6647f = iArr2;
                }
                this.f6647f[i] = intValue;
                this.f6648g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(mo7800h(i));
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo7797f(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo7392c();
        C2546l6.m6112a(collection);
        if (!(collection instanceof C2512j6)) {
            return super.addAll(collection);
        }
        C2512j6 j6Var = (C2512j6) collection;
        int i = j6Var.f6648g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f6648g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f6647f;
            if (i3 > iArr.length) {
                this.f6647f = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(j6Var.f6647f, 0, this.f6647f, this.f6648g, j6Var.f6648g);
            this.f6648g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final C2598o6 mo7414a(int i) {
        if (i >= this.f6648g) {
            return new C2512j6(Arrays.copyOf(this.f6647f, i), this.f6648g);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final int mo7796e(int i) {
        mo7798g(i);
        return this.f6647f[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2512j6)) {
            return super.equals(obj);
        }
        C2512j6 j6Var = (C2512j6) obj;
        if (this.f6648g != j6Var.f6648g) {
            return false;
        }
        int[] iArr = j6Var.f6647f;
        for (int i = 0; i < this.f6648g; i++) {
            if (this.f6647f[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo7797f(int i) {
        mo7392c();
        int i2 = this.f6648g;
        int[] iArr = this.f6647f;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C1965a.m4760b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f6647f = iArr2;
        }
        int[] iArr3 = this.f6647f;
        int i3 = this.f6648g;
        this.f6648g = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: g */
    public final void mo7798g(int i) {
        if (i < 0 || i >= this.f6648g) {
            throw new IndexOutOfBoundsException(mo7800h(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo7798g(i);
        return Integer.valueOf(this.f6647f[i]);
    }

    /* renamed from: h */
    public final String mo7800h(int i) {
        int i2 = this.f6648g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6648g; i2++) {
            i = (i * 31) + this.f6647f[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f6648g;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f6647f[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo7392c();
        mo7798g(i);
        int[] iArr = this.f6647f;
        int i2 = iArr[i];
        int i3 = this.f6648g;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f6648g--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        mo7392c();
        for (int i = 0; i < this.f6648g; i++) {
            if (obj.equals(Integer.valueOf(this.f6647f[i]))) {
                int[] iArr = this.f6647f;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f6648g - i) - 1);
                this.f6648g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo7392c();
        if (i2 >= i) {
            int[] iArr = this.f6647f;
            System.arraycopy(iArr, i2, iArr, i, this.f6648g - i2);
            this.f6648g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo7392c();
        mo7798g(i);
        int[] iArr = this.f6647f;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f6648g;
    }
}
