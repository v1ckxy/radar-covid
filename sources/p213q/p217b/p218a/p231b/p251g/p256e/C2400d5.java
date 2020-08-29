package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.e.d5 */
public final class C2400d5 extends C2345a5<Boolean> implements C2635q6<Boolean>, C2780z7, RandomAccess {

    /* renamed from: f */
    public boolean[] f6440f;

    /* renamed from: g */
    public int f6441g;

    static {
        new C2400d5(new boolean[0], 0).f6313e = false;
    }

    public C2400d5() {
        this.f6440f = new boolean[10];
        this.f6441g = 0;
    }

    public C2400d5(boolean[] zArr, int i) {
        this.f6440f = zArr;
        this.f6441g = i;
    }

    /* renamed from: a */
    public final /* synthetic */ C2635q6 mo7414a(int i) {
        if (i >= this.f6441g) {
            return new C2400d5(Arrays.copyOf(this.f6440f, i), this.f6441g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo7506a(boolean z) {
        mo7392c();
        int i = this.f6441g;
        boolean[] zArr = this.f6440f;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C1965a.m4760b(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f6440f = zArr2;
        }
        boolean[] zArr3 = this.f6440f;
        int i2 = this.f6441g;
        this.f6441g = i2 + 1;
        zArr3[i2] = z;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo7392c();
        if (i >= 0) {
            int i2 = this.f6441g;
            if (i <= i2) {
                boolean[] zArr = this.f6440f;
                if (i2 < zArr.length) {
                    System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
                } else {
                    boolean[] zArr2 = new boolean[C1965a.m4760b(i2, 3, 2, 1)];
                    System.arraycopy(zArr, 0, zArr2, 0, i);
                    System.arraycopy(this.f6440f, i, zArr2, i + 1, this.f6441g - i);
                    this.f6440f = zArr2;
                }
                this.f6440f[i] = booleanValue;
                this.f6441g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(mo7510e(i));
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo7506a(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo7392c();
        C2546l6.m6112a(collection);
        if (!(collection instanceof C2400d5)) {
            return super.addAll(collection);
        }
        C2400d5 d5Var = (C2400d5) collection;
        int i = d5Var.f6441g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f6441g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f6440f;
            if (i3 > zArr.length) {
                this.f6440f = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(d5Var.f6440f, 0, this.f6440f, this.f6441g, d5Var.f6441g);
            this.f6441g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo7508c(int i) {
        if (i < 0 || i >= this.f6441g) {
            throw new IndexOutOfBoundsException(mo7510e(i));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String mo7510e(int i) {
        int i2 = this.f6441g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2400d5)) {
            return super.equals(obj);
        }
        C2400d5 d5Var = (C2400d5) obj;
        if (this.f6441g != d5Var.f6441g) {
            return false;
        }
        boolean[] zArr = d5Var.f6440f;
        for (int i = 0; i < this.f6441g; i++) {
            if (this.f6440f[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        mo7508c(i);
        return Boolean.valueOf(this.f6440f[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6441g; i2++) {
            i = (i * 31) + C2546l6.m6111a(this.f6440f[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f6441g;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f6440f[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo7392c();
        mo7508c(i);
        boolean[] zArr = this.f6440f;
        boolean z = zArr[i];
        int i2 = this.f6441g;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f6441g--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        mo7392c();
        for (int i = 0; i < this.f6441g; i++) {
            if (obj.equals(Boolean.valueOf(this.f6440f[i]))) {
                boolean[] zArr = this.f6440f;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f6441g - i) - 1);
                this.f6441g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo7392c();
        if (i2 >= i) {
            boolean[] zArr = this.f6440f;
            System.arraycopy(zArr, i2, zArr, i, this.f6441g - i2);
            this.f6441g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo7392c();
        mo7508c(i);
        boolean[] zArr = this.f6440f;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f6441g;
    }
}
