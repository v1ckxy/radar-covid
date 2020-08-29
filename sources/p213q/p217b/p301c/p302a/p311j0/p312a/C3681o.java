package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3596b;

/* renamed from: q.b.c.a.j0.a.o */
public final class C3681o extends C3605c<Double> implements C3596b, RandomAccess, C3592a1 {

    /* renamed from: h */
    public static final C3681o f9123h;

    /* renamed from: f */
    public double[] f9124f;

    /* renamed from: g */
    public int f9125g;

    static {
        C3681o oVar = new C3681o(new double[0], 0);
        f9123h = oVar;
        oVar.f8977e = false;
    }

    public C3681o() {
        this.f9124f = new double[10];
        this.f9125g = 0;
    }

    public C3681o(double[] dArr, int i) {
        this.f9124f = dArr;
        this.f9125g = i;
    }

    /* renamed from: a */
    public void mo9865a(double d) {
        mo9533c();
        int i = this.f9125g;
        double[] dArr = this.f9124f;
        if (i == dArr.length) {
            double[] dArr2 = new double[C1965a.m4760b(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f9124f = dArr2;
        }
        double[] dArr3 = this.f9124f;
        int i2 = this.f9125g;
        this.f9125g = i2 + 1;
        dArr3[i2] = d;
    }

    public void add(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo9533c();
        if (i >= 0) {
            int i2 = this.f9125g;
            if (i <= i2) {
                double[] dArr = this.f9124f;
                if (i2 < dArr.length) {
                    System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
                } else {
                    double[] dArr2 = new double[C1965a.m4760b(i2, 3, 2, 1)];
                    System.arraycopy(dArr, 0, dArr2, 0, i);
                    System.arraycopy(this.f9124f, i, dArr2, i + 1, this.f9125g - i);
                    this.f9124f = dArr2;
                }
                this.f9124f[i] = doubleValue;
                this.f9125g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(mo9868f(i));
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo9533c();
        C3594b0.m8164a(collection);
        if (!(collection instanceof C3681o)) {
            return super.addAll(collection);
        }
        C3681o oVar = (C3681o) collection;
        int i = oVar.f9125g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9125g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f9124f;
            if (i3 > dArr.length) {
                this.f9124f = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(oVar.f9124f, 0, this.f9124f, this.f9125g, oVar.f9125g);
            this.f9125g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public C3596b m8780b(int i) {
        if (i >= this.f9125g) {
            return new C3681o(Arrays.copyOf(this.f9124f, i), this.f9125g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void mo9867e(int i) {
        if (i < 0 || i >= this.f9125g) {
            throw new IndexOutOfBoundsException(mo9868f(i));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3681o)) {
            return super.equals(obj);
        }
        C3681o oVar = (C3681o) obj;
        if (this.f9125g != oVar.f9125g) {
            return false;
        }
        double[] dArr = oVar.f9124f;
        for (int i = 0; i < this.f9125g; i++) {
            if (Double.doubleToLongBits(this.f9124f[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo9868f(int i) {
        StringBuilder a = C1965a.m4757a("Index:", i, ", Size:");
        a.append(this.f9125g);
        return a.toString();
    }

    public Object get(int i) {
        mo9867e(i);
        return Double.valueOf(this.f9124f[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9125g; i2++) {
            i = (i * 31) + C3594b0.m8161a(Double.doubleToLongBits(this.f9124f[i2]));
        }
        return i;
    }

    public Object remove(int i) {
        mo9533c();
        mo9867e(i);
        double[] dArr = this.f9124f;
        double d = dArr[i];
        int i2 = this.f9125g;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f9125g--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public boolean remove(Object obj) {
        mo9533c();
        for (int i = 0; i < this.f9125g; i++) {
            if (obj.equals(Double.valueOf(this.f9124f[i]))) {
                double[] dArr = this.f9124f;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f9125g - i) - 1);
                this.f9125g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public void removeRange(int i, int i2) {
        mo9533c();
        if (i2 >= i) {
            double[] dArr = this.f9124f;
            System.arraycopy(dArr, i2, dArr, i, this.f9125g - i2);
            this.f9125g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo9533c();
        mo9867e(i);
        double[] dArr = this.f9124f;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public int size() {
        return this.f9125g;
    }

    public boolean add(Object obj) {
        mo9865a(((Double) obj).doubleValue());
        return true;
    }
}
