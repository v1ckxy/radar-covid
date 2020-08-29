package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3600f;

/* renamed from: q.b.c.a.j0.a.x */
public final class C3727x extends C3605c<Float> implements C3600f, RandomAccess, C3592a1 {

    /* renamed from: h */
    public static final C3727x f9279h;

    /* renamed from: f */
    public float[] f9280f;

    /* renamed from: g */
    public int f9281g;

    static {
        C3727x xVar = new C3727x(new float[0], 0);
        f9279h = xVar;
        xVar.f8977e = false;
    }

    public C3727x() {
        this.f9280f = new float[10];
        this.f9281g = 0;
    }

    public C3727x(float[] fArr, int i) {
        this.f9280f = fArr;
        this.f9281g = i;
    }

    /* renamed from: a */
    public void mo9983a(float f) {
        mo9533c();
        int i = this.f9281g;
        float[] fArr = this.f9280f;
        if (i == fArr.length) {
            float[] fArr2 = new float[C1965a.m4760b(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f9280f = fArr2;
        }
        float[] fArr3 = this.f9280f;
        int i2 = this.f9281g;
        this.f9281g = i2 + 1;
        fArr3[i2] = f;
    }

    public void add(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo9533c();
        if (i >= 0) {
            int i2 = this.f9281g;
            if (i <= i2) {
                float[] fArr = this.f9280f;
                if (i2 < fArr.length) {
                    System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
                } else {
                    float[] fArr2 = new float[C1965a.m4760b(i2, 3, 2, 1)];
                    System.arraycopy(fArr, 0, fArr2, 0, i);
                    System.arraycopy(this.f9280f, i, fArr2, i + 1, this.f9281g - i);
                    this.f9280f = fArr2;
                }
                this.f9280f[i] = floatValue;
                this.f9281g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(mo9986f(i));
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo9533c();
        C3594b0.m8164a(collection);
        if (!(collection instanceof C3727x)) {
            return super.addAll(collection);
        }
        C3727x xVar = (C3727x) collection;
        int i = xVar.f9281g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9281g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f9280f;
            if (i3 > fArr.length) {
                this.f9280f = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(xVar.f9280f, 0, this.f9280f, this.f9281g, xVar.f9281g);
            this.f9281g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public C3600f m9000b(int i) {
        if (i >= this.f9281g) {
            return new C3727x(Arrays.copyOf(this.f9280f, i), this.f9281g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void mo9985e(int i) {
        if (i < 0 || i >= this.f9281g) {
            throw new IndexOutOfBoundsException(mo9986f(i));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3727x)) {
            return super.equals(obj);
        }
        C3727x xVar = (C3727x) obj;
        if (this.f9281g != xVar.f9281g) {
            return false;
        }
        float[] fArr = xVar.f9280f;
        for (int i = 0; i < this.f9281g; i++) {
            if (Float.floatToIntBits(this.f9280f[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo9986f(int i) {
        StringBuilder a = C1965a.m4757a("Index:", i, ", Size:");
        a.append(this.f9281g);
        return a.toString();
    }

    public Object get(int i) {
        mo9985e(i);
        return Float.valueOf(this.f9280f[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9281g; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f9280f[i2]);
        }
        return i;
    }

    public Object remove(int i) {
        mo9533c();
        mo9985e(i);
        float[] fArr = this.f9280f;
        float f = fArr[i];
        int i2 = this.f9281g;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f9281g--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public boolean remove(Object obj) {
        mo9533c();
        for (int i = 0; i < this.f9281g; i++) {
            if (obj.equals(Float.valueOf(this.f9280f[i]))) {
                float[] fArr = this.f9280f;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f9281g - i) - 1);
                this.f9281g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public void removeRange(int i, int i2) {
        mo9533c();
        if (i2 >= i) {
            float[] fArr = this.f9280f;
            System.arraycopy(fArr, i2, fArr, i, this.f9281g - i2);
            this.f9281g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo9533c();
        mo9985e(i);
        float[] fArr = this.f9280f;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public int size() {
        return this.f9281g;
    }

    public boolean add(Object obj) {
        mo9983a(((Float) obj).floatValue());
        return true;
    }
}
