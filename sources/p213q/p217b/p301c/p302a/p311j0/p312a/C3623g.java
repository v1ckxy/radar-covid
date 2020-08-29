package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3595a;

/* renamed from: q.b.c.a.j0.a.g */
public final class C3623g extends C3605c<Boolean> implements C3595a, RandomAccess, C3592a1 {

    /* renamed from: h */
    public static final C3623g f9019h;

    /* renamed from: f */
    public boolean[] f9020f;

    /* renamed from: g */
    public int f9021g;

    static {
        C3623g gVar = new C3623g(new boolean[0], 0);
        f9019h = gVar;
        gVar.f8977e = false;
    }

    public C3623g() {
        this.f9020f = new boolean[10];
        this.f9021g = 0;
    }

    public C3623g(boolean[] zArr, int i) {
        this.f9020f = zArr;
        this.f9021g = i;
    }

    /* renamed from: a */
    public void mo9624a(boolean z) {
        mo9533c();
        int i = this.f9021g;
        boolean[] zArr = this.f9020f;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C1965a.m4760b(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f9020f = zArr2;
        }
        boolean[] zArr3 = this.f9020f;
        int i2 = this.f9021g;
        this.f9021g = i2 + 1;
        zArr3[i2] = z;
    }

    public void add(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo9533c();
        if (i >= 0) {
            int i2 = this.f9021g;
            if (i <= i2) {
                boolean[] zArr = this.f9020f;
                if (i2 < zArr.length) {
                    System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
                } else {
                    boolean[] zArr2 = new boolean[C1965a.m4760b(i2, 3, 2, 1)];
                    System.arraycopy(zArr, 0, zArr2, 0, i);
                    System.arraycopy(this.f9020f, i, zArr2, i + 1, this.f9021g - i);
                    this.f9020f = zArr2;
                }
                this.f9020f[i] = booleanValue;
                this.f9021g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(mo9627f(i));
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo9533c();
        C3594b0.m8164a(collection);
        if (!(collection instanceof C3623g)) {
            return super.addAll(collection);
        }
        C3623g gVar = (C3623g) collection;
        int i = gVar.f9021g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9021g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f9020f;
            if (i3 > zArr.length) {
                this.f9020f = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(gVar.f9020f, 0, this.f9020f, this.f9021g, gVar.f9021g);
            this.f9021g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public C3595a m8299b(int i) {
        if (i >= this.f9021g) {
            return new C3623g(Arrays.copyOf(this.f9020f, i), this.f9021g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void mo9626e(int i) {
        if (i < 0 || i >= this.f9021g) {
            throw new IndexOutOfBoundsException(mo9627f(i));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3623g)) {
            return super.equals(obj);
        }
        C3623g gVar = (C3623g) obj;
        if (this.f9021g != gVar.f9021g) {
            return false;
        }
        boolean[] zArr = gVar.f9020f;
        for (int i = 0; i < this.f9021g; i++) {
            if (this.f9020f[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo9627f(int i) {
        StringBuilder a = C1965a.m4757a("Index:", i, ", Size:");
        a.append(this.f9021g);
        return a.toString();
    }

    public Object get(int i) {
        mo9626e(i);
        return Boolean.valueOf(this.f9020f[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9021g; i2++) {
            i = (i * 31) + C3594b0.m8162a(this.f9020f[i2]);
        }
        return i;
    }

    public Object remove(int i) {
        mo9533c();
        mo9626e(i);
        boolean[] zArr = this.f9020f;
        boolean z = zArr[i];
        int i2 = this.f9021g;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f9021g--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public boolean remove(Object obj) {
        mo9533c();
        for (int i = 0; i < this.f9021g; i++) {
            if (obj.equals(Boolean.valueOf(this.f9020f[i]))) {
                boolean[] zArr = this.f9020f;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f9021g - i) - 1);
                this.f9021g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public void removeRange(int i, int i2) {
        mo9533c();
        if (i2 >= i) {
            boolean[] zArr = this.f9020f;
            System.arraycopy(zArr, i2, zArr, i, this.f9021g - i2);
            this.f9021g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo9533c();
        mo9626e(i);
        boolean[] zArr = this.f9020f;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public int size() {
        return this.f9021g;
    }

    public boolean add(Object obj) {
        mo9624a(((Boolean) obj).booleanValue());
        return true;
    }
}
