package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.e.d7 */
public final class C2402d7 extends C2345a5<Long> implements C2581n6, C2780z7, RandomAccess {

    /* renamed from: h */
    public static final C2402d7 f6444h;

    /* renamed from: f */
    public long[] f6445f;

    /* renamed from: g */
    public int f6446g;

    static {
        C2402d7 d7Var = new C2402d7(new long[0], 0);
        f6444h = d7Var;
        d7Var.f6313e = false;
    }

    public C2402d7() {
        this.f6445f = new long[10];
        this.f6446g = 0;
    }

    public C2402d7(long[] jArr, int i) {
        this.f6445f = jArr;
        this.f6446g = i;
    }

    /* renamed from: a */
    public final void mo7528a(long j) {
        mo7392c();
        int i = this.f6446g;
        long[] jArr = this.f6445f;
        if (i == jArr.length) {
            long[] jArr2 = new long[C1965a.m4760b(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f6445f = jArr2;
        }
        long[] jArr3 = this.f6445f;
        int i2 = this.f6446g;
        this.f6446g = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo7392c();
        if (i >= 0) {
            int i2 = this.f6446g;
            if (i <= i2) {
                long[] jArr = this.f6445f;
                if (i2 < jArr.length) {
                    System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
                } else {
                    long[] jArr2 = new long[C1965a.m4760b(i2, 3, 2, 1)];
                    System.arraycopy(jArr, 0, jArr2, 0, i);
                    System.arraycopy(this.f6445f, i, jArr2, i + 1, this.f6446g - i);
                    this.f6445f = jArr2;
                }
                this.f6445f[i] = longValue;
                this.f6446g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(mo7534g(i));
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo7528a(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo7392c();
        C2546l6.m6112a(collection);
        if (!(collection instanceof C2402d7)) {
            return super.addAll(collection);
        }
        C2402d7 d7Var = (C2402d7) collection;
        int i = d7Var.f6446g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f6446g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f6445f;
            if (i3 > jArr.length) {
                this.f6445f = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(d7Var.f6445f, 0, this.f6445f, this.f6446g, d7Var.f6446g);
            this.f6446g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final long mo7530c(int i) {
        mo7533f(i);
        return this.f6445f[i];
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final C2581n6 mo7414a(int i) {
        if (i >= this.f6446g) {
            return new C2402d7(Arrays.copyOf(this.f6445f, i), this.f6446g);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2402d7)) {
            return super.equals(obj);
        }
        C2402d7 d7Var = (C2402d7) obj;
        if (this.f6446g != d7Var.f6446g) {
            return false;
        }
        long[] jArr = d7Var.f6445f;
        for (int i = 0; i < this.f6446g; i++) {
            if (this.f6445f[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo7533f(int i) {
        if (i < 0 || i >= this.f6446g) {
            throw new IndexOutOfBoundsException(mo7534g(i));
        }
    }

    /* renamed from: g */
    public final String mo7534g(int i) {
        int i2 = this.f6446g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object get(int i) {
        mo7533f(i);
        return Long.valueOf(this.f6445f[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6446g; i2++) {
            i = (i * 31) + C2546l6.m6110a(this.f6445f[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f6446g;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f6445f[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo7392c();
        mo7533f(i);
        long[] jArr = this.f6445f;
        long j = jArr[i];
        int i2 = this.f6446g;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f6446g--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        mo7392c();
        for (int i = 0; i < this.f6446g; i++) {
            if (obj.equals(Long.valueOf(this.f6445f[i]))) {
                long[] jArr = this.f6445f;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f6446g - i) - 1);
                this.f6446g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo7392c();
        if (i2 >= i) {
            long[] jArr = this.f6445f;
            System.arraycopy(jArr, i2, jArr, i, this.f6446g - i2);
            this.f6446g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo7392c();
        mo7533f(i);
        long[] jArr = this.f6445f;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f6446g;
    }
}
