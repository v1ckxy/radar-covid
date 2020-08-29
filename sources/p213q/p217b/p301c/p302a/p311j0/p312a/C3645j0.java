package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3602h;

/* renamed from: q.b.c.a.j0.a.j0 */
public final class C3645j0 extends C3605c<Long> implements C3602h, RandomAccess, C3592a1 {

    /* renamed from: h */
    public static final C3645j0 f9042h;

    /* renamed from: f */
    public long[] f9043f;

    /* renamed from: g */
    public int f9044g;

    static {
        C3645j0 j0Var = new C3645j0(new long[0], 0);
        f9042h = j0Var;
        j0Var.f8977e = false;
    }

    public C3645j0() {
        this.f9043f = new long[10];
        this.f9044g = 0;
    }

    public C3645j0(long[] jArr, int i) {
        this.f9043f = jArr;
        this.f9044g = i;
    }

    /* renamed from: a */
    public void mo9679a(long j) {
        mo9533c();
        int i = this.f9044g;
        long[] jArr = this.f9043f;
        if (i == jArr.length) {
            long[] jArr2 = new long[C1965a.m4760b(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f9043f = jArr2;
        }
        long[] jArr3 = this.f9043f;
        int i2 = this.f9044g;
        this.f9044g = i2 + 1;
        jArr3[i2] = j;
    }

    public void add(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo9533c();
        if (i >= 0) {
            int i2 = this.f9044g;
            if (i <= i2) {
                long[] jArr = this.f9043f;
                if (i2 < jArr.length) {
                    System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
                } else {
                    long[] jArr2 = new long[C1965a.m4760b(i2, 3, 2, 1)];
                    System.arraycopy(jArr, 0, jArr2, 0, i);
                    System.arraycopy(this.f9043f, i, jArr2, i + 1, this.f9044g - i);
                    this.f9043f = jArr2;
                }
                this.f9043f[i] = longValue;
                this.f9044g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(mo9683g(i));
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo9533c();
        C3594b0.m8164a(collection);
        if (!(collection instanceof C3645j0)) {
            return super.addAll(collection);
        }
        C3645j0 j0Var = (C3645j0) collection;
        int i = j0Var.f9044g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9044g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f9043f;
            if (i3 > jArr.length) {
                this.f9043f = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(j0Var.f9043f, 0, this.f9043f, this.f9044g, j0Var.f9044g);
            this.f9044g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public C3602h m8425b(int i) {
        if (i >= this.f9044g) {
            return new C3645j0(Arrays.copyOf(this.f9043f, i), this.f9044g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void mo9681e(int i) {
        if (i < 0 || i >= this.f9044g) {
            throw new IndexOutOfBoundsException(mo9683g(i));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3645j0)) {
            return super.equals(obj);
        }
        C3645j0 j0Var = (C3645j0) obj;
        if (this.f9044g != j0Var.f9044g) {
            return false;
        }
        long[] jArr = j0Var.f9043f;
        for (int i = 0; i < this.f9044g; i++) {
            if (this.f9043f[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public long mo9682f(int i) {
        mo9681e(i);
        return this.f9043f[i];
    }

    /* renamed from: g */
    public final String mo9683g(int i) {
        StringBuilder a = C1965a.m4757a("Index:", i, ", Size:");
        a.append(this.f9044g);
        return a.toString();
    }

    public Object get(int i) {
        mo9681e(i);
        return Long.valueOf(this.f9043f[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9044g; i2++) {
            i = (i * 31) + C3594b0.m8161a(this.f9043f[i2]);
        }
        return i;
    }

    public Object remove(int i) {
        mo9533c();
        mo9681e(i);
        long[] jArr = this.f9043f;
        long j = jArr[i];
        int i2 = this.f9044g;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f9044g--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public boolean remove(Object obj) {
        mo9533c();
        for (int i = 0; i < this.f9044g; i++) {
            if (obj.equals(Long.valueOf(this.f9043f[i]))) {
                long[] jArr = this.f9043f;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f9044g - i) - 1);
                this.f9044g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public void removeRange(int i, int i2) {
        mo9533c();
        if (i2 >= i) {
            long[] jArr = this.f9043f;
            System.arraycopy(jArr, i2, jArr, i, this.f9044g - i2);
            this.f9044g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo9533c();
        mo9681e(i);
        long[] jArr = this.f9043f;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public int size() {
        return this.f9044g;
    }

    public boolean add(Object obj) {
        mo9679a(((Long) obj).longValue());
        return true;
    }
}
