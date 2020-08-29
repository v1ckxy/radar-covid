package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3601g;

/* renamed from: q.b.c.a.j0.a.a0 */
public final class C3591a0 extends C3605c<Integer> implements C3601g, RandomAccess, C3592a1 {

    /* renamed from: h */
    public static final C3591a0 f8969h;

    /* renamed from: f */
    public int[] f8970f;

    /* renamed from: g */
    public int f8971g;

    static {
        C3591a0 a0Var = new C3591a0(new int[0], 0);
        f8969h = a0Var;
        a0Var.f8977e = false;
    }

    public C3591a0() {
        this.f8970f = new int[10];
        this.f8971g = 0;
    }

    public C3591a0(int[] iArr, int i) {
        this.f8970f = iArr;
        this.f8971g = i;
    }

    public void add(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo9533c();
        if (i >= 0) {
            int i2 = this.f8971g;
            if (i <= i2) {
                int[] iArr = this.f8970f;
                if (i2 < iArr.length) {
                    System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
                } else {
                    int[] iArr2 = new int[C1965a.m4760b(i2, 3, 2, 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    System.arraycopy(this.f8970f, i, iArr2, i + 1, this.f8971g - i);
                    this.f8970f = iArr2;
                }
                this.f8970f[i] = intValue;
                this.f8971g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(mo9522h(i));
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo9533c();
        C3594b0.m8164a(collection);
        if (!(collection instanceof C3591a0)) {
            return super.addAll(collection);
        }
        C3591a0 a0Var = (C3591a0) collection;
        int i = a0Var.f8971g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8971g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f8970f;
            if (i3 > iArr.length) {
                this.f8970f = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(a0Var.f8970f, 0, this.f8970f, this.f8971g, a0Var.f8971g);
            this.f8971g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public C3601g m8154b(int i) {
        if (i >= this.f8971g) {
            return new C3591a0(Arrays.copyOf(this.f8970f, i), this.f8971g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public void mo9517e(int i) {
        mo9533c();
        int i2 = this.f8971g;
        int[] iArr = this.f8970f;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C1965a.m4760b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f8970f = iArr2;
        }
        int[] iArr3 = this.f8970f;
        int i3 = this.f8971g;
        this.f8971g = i3 + 1;
        iArr3[i3] = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3591a0)) {
            return super.equals(obj);
        }
        C3591a0 a0Var = (C3591a0) obj;
        if (this.f8971g != a0Var.f8971g) {
            return false;
        }
        int[] iArr = a0Var.f8970f;
        for (int i = 0; i < this.f8971g; i++) {
            if (this.f8970f[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo9519f(int i) {
        if (i < 0 || i >= this.f8971g) {
            throw new IndexOutOfBoundsException(mo9522h(i));
        }
    }

    /* renamed from: g */
    public int mo9520g(int i) {
        mo9519f(i);
        return this.f8970f[i];
    }

    public Object get(int i) {
        mo9519f(i);
        return Integer.valueOf(this.f8970f[i]);
    }

    /* renamed from: h */
    public final String mo9522h(int i) {
        StringBuilder a = C1965a.m4757a("Index:", i, ", Size:");
        a.append(this.f8971g);
        return a.toString();
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8971g; i2++) {
            i = (i * 31) + this.f8970f[i2];
        }
        return i;
    }

    public Object remove(int i) {
        mo9533c();
        mo9519f(i);
        int[] iArr = this.f8970f;
        int i2 = iArr[i];
        int i3 = this.f8971g;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f8971g--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public boolean remove(Object obj) {
        mo9533c();
        for (int i = 0; i < this.f8971g; i++) {
            if (obj.equals(Integer.valueOf(this.f8970f[i]))) {
                int[] iArr = this.f8970f;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f8971g - i) - 1);
                this.f8971g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public void removeRange(int i, int i2) {
        mo9533c();
        if (i2 >= i) {
            int[] iArr = this.f8970f;
            System.arraycopy(iArr, i2, iArr, i, this.f8971g - i2);
            this.f8971g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo9533c();
        mo9519f(i);
        int[] iArr = this.f8970f;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public int size() {
        return this.f8971g;
    }

    public boolean add(Object obj) {
        mo9517e(((Integer) obj).intValue());
        return true;
    }
}
