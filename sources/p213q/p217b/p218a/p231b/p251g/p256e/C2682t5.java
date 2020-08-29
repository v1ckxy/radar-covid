package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.e.t5 */
public final class C2682t5 extends C2345a5<Double> implements C2635q6<Double>, C2780z7, RandomAccess {

    /* renamed from: f */
    public double[] f6873f;

    /* renamed from: g */
    public int f6874g;

    static {
        new C2682t5(new double[0], 0).f6313e = false;
    }

    public C2682t5() {
        this.f6873f = new double[10];
        this.f6874g = 0;
    }

    public C2682t5(double[] dArr, int i) {
        this.f6873f = dArr;
        this.f6874g = i;
    }

    /* renamed from: a */
    public final /* synthetic */ C2635q6 mo7414a(int i) {
        if (i >= this.f6874g) {
            return new C2682t5(Arrays.copyOf(this.f6873f, i), this.f6874g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo8001a(double d) {
        mo7392c();
        int i = this.f6874g;
        double[] dArr = this.f6873f;
        if (i == dArr.length) {
            double[] dArr2 = new double[C1965a.m4760b(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f6873f = dArr2;
        }
        double[] dArr3 = this.f6873f;
        int i2 = this.f6874g;
        this.f6874g = i2 + 1;
        dArr3[i2] = d;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo7392c();
        if (i >= 0) {
            int i2 = this.f6874g;
            if (i <= i2) {
                double[] dArr = this.f6873f;
                if (i2 < dArr.length) {
                    System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
                } else {
                    double[] dArr2 = new double[C1965a.m4760b(i2, 3, 2, 1)];
                    System.arraycopy(dArr, 0, dArr2, 0, i);
                    System.arraycopy(this.f6873f, i, dArr2, i + 1, this.f6874g - i);
                    this.f6873f = dArr2;
                }
                this.f6873f[i] = doubleValue;
                this.f6874g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(mo8005e(i));
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo8001a(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo7392c();
        C2546l6.m6112a(collection);
        if (!(collection instanceof C2682t5)) {
            return super.addAll(collection);
        }
        C2682t5 t5Var = (C2682t5) collection;
        int i = t5Var.f6874g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f6874g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f6873f;
            if (i3 > dArr.length) {
                this.f6873f = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(t5Var.f6873f, 0, this.f6873f, this.f6874g, t5Var.f6874g);
            this.f6874g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo8003c(int i) {
        if (i < 0 || i >= this.f6874g) {
            throw new IndexOutOfBoundsException(mo8005e(i));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String mo8005e(int i) {
        int i2 = this.f6874g;
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
        if (!(obj instanceof C2682t5)) {
            return super.equals(obj);
        }
        C2682t5 t5Var = (C2682t5) obj;
        if (this.f6874g != t5Var.f6874g) {
            return false;
        }
        double[] dArr = t5Var.f6873f;
        for (int i = 0; i < this.f6874g; i++) {
            if (Double.doubleToLongBits(this.f6873f[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        mo8003c(i);
        return Double.valueOf(this.f6873f[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6874g; i2++) {
            i = (i * 31) + C2546l6.m6110a(Double.doubleToLongBits(this.f6873f[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f6874g;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f6873f[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo7392c();
        mo8003c(i);
        double[] dArr = this.f6873f;
        double d = dArr[i];
        int i2 = this.f6874g;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f6874g--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        mo7392c();
        for (int i = 0; i < this.f6874g; i++) {
            if (obj.equals(Double.valueOf(this.f6873f[i]))) {
                double[] dArr = this.f6873f;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f6874g - i) - 1);
                this.f6874g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo7392c();
        if (i2 >= i) {
            double[] dArr = this.f6873f;
            System.arraycopy(dArr, i2, dArr, i, this.f6874g - i2);
            this.f6874g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo7392c();
        mo8003c(i);
        double[] dArr = this.f6873f;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f6874g;
    }
}
