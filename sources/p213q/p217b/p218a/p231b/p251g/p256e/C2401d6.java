package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.e.d6 */
public final class C2401d6 extends C2345a5<Float> implements C2635q6<Float>, C2780z7, RandomAccess {

    /* renamed from: f */
    public float[] f6442f;

    /* renamed from: g */
    public int f6443g;

    static {
        new C2401d6(new float[0], 0).f6313e = false;
    }

    public C2401d6() {
        this.f6442f = new float[10];
        this.f6443g = 0;
    }

    public C2401d6(float[] fArr, int i) {
        this.f6442f = fArr;
        this.f6443g = i;
    }

    /* renamed from: a */
    public final /* synthetic */ C2635q6 mo7414a(int i) {
        if (i >= this.f6443g) {
            return new C2401d6(Arrays.copyOf(this.f6442f, i), this.f6443g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo7517a(float f) {
        mo7392c();
        int i = this.f6443g;
        float[] fArr = this.f6442f;
        if (i == fArr.length) {
            float[] fArr2 = new float[C1965a.m4760b(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f6442f = fArr2;
        }
        float[] fArr3 = this.f6442f;
        int i2 = this.f6443g;
        this.f6443g = i2 + 1;
        fArr3[i2] = f;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo7392c();
        if (i >= 0) {
            int i2 = this.f6443g;
            if (i <= i2) {
                float[] fArr = this.f6442f;
                if (i2 < fArr.length) {
                    System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
                } else {
                    float[] fArr2 = new float[C1965a.m4760b(i2, 3, 2, 1)];
                    System.arraycopy(fArr, 0, fArr2, 0, i);
                    System.arraycopy(this.f6442f, i, fArr2, i + 1, this.f6443g - i);
                    this.f6442f = fArr2;
                }
                this.f6442f[i] = floatValue;
                this.f6443g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(mo7521e(i));
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo7517a(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo7392c();
        C2546l6.m6112a(collection);
        if (!(collection instanceof C2401d6)) {
            return super.addAll(collection);
        }
        C2401d6 d6Var = (C2401d6) collection;
        int i = d6Var.f6443g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f6443g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f6442f;
            if (i3 > fArr.length) {
                this.f6442f = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(d6Var.f6442f, 0, this.f6442f, this.f6443g, d6Var.f6443g);
            this.f6443g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo7519c(int i) {
        if (i < 0 || i >= this.f6443g) {
            throw new IndexOutOfBoundsException(mo7521e(i));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String mo7521e(int i) {
        int i2 = this.f6443g;
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
        if (!(obj instanceof C2401d6)) {
            return super.equals(obj);
        }
        C2401d6 d6Var = (C2401d6) obj;
        if (this.f6443g != d6Var.f6443g) {
            return false;
        }
        float[] fArr = d6Var.f6442f;
        for (int i = 0; i < this.f6443g; i++) {
            if (Float.floatToIntBits(this.f6442f[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        mo7519c(i);
        return Float.valueOf(this.f6442f[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6443g; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f6442f[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f6443g;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f6442f[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo7392c();
        mo7519c(i);
        float[] fArr = this.f6442f;
        float f = fArr[i];
        int i2 = this.f6443g;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f6443g--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean remove(Object obj) {
        mo7392c();
        for (int i = 0; i < this.f6443g; i++) {
            if (obj.equals(Float.valueOf(this.f6442f[i]))) {
                float[] fArr = this.f6442f;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f6443g - i) - 1);
                this.f6443g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo7392c();
        if (i2 >= i) {
            float[] fArr = this.f6442f;
            System.arraycopy(fArr, i2, fArr, i, this.f6443g - i2);
            this.f6443g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo7392c();
        mo7519c(i);
        float[] fArr = this.f6442f;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f6443g;
    }
}
