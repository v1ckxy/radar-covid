package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.Arrays;
import java.util.RandomAccess;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i;

/* renamed from: q.b.c.a.j0.a.d1 */
public final class C3611d1<E> extends C3605c<E> implements RandomAccess {

    /* renamed from: h */
    public static final C3611d1<Object> f8996h;

    /* renamed from: f */
    public E[] f8997f;

    /* renamed from: g */
    public int f8998g;

    static {
        C3611d1<Object> d1Var = new C3611d1<>(new Object[0], 0);
        f8996h = d1Var;
        d1Var.f8977e = false;
    }

    public C3611d1(E[] eArr, int i) {
        this.f8997f = eArr;
        this.f8998g = i;
    }

    public void add(int i, E e) {
        mo9533c();
        if (i >= 0) {
            int i2 = this.f8998g;
            if (i <= i2) {
                E[] eArr = this.f8997f;
                if (i2 < eArr.length) {
                    System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
                } else {
                    E[] eArr2 = new Object[C1965a.m4760b(i2, 3, 2, 1)];
                    System.arraycopy(eArr, 0, eArr2, 0, i);
                    System.arraycopy(this.f8997f, i, eArr2, i + 1, this.f8998g - i);
                    this.f8997f = eArr2;
                }
                this.f8997f[i] = e;
                this.f8998g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(mo9541f(i));
    }

    public boolean add(E e) {
        mo9533c();
        int i = this.f8998g;
        E[] eArr = this.f8997f;
        if (i == eArr.length) {
            this.f8997f = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f8997f;
        int i2 = this.f8998g;
        this.f8998g = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    public C3603i mo9516b(int i) {
        if (i >= this.f8998g) {
            return new C3611d1(Arrays.copyOf(this.f8997f, i), this.f8998g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void mo9540e(int i) {
        if (i < 0 || i >= this.f8998g) {
            throw new IndexOutOfBoundsException(mo9541f(i));
        }
    }

    /* renamed from: f */
    public final String mo9541f(int i) {
        StringBuilder a = C1965a.m4757a("Index:", i, ", Size:");
        a.append(this.f8998g);
        return a.toString();
    }

    public E get(int i) {
        mo9540e(i);
        return this.f8997f[i];
    }

    public E remove(int i) {
        mo9533c();
        mo9540e(i);
        E[] eArr = this.f8997f;
        E e = eArr[i];
        int i2 = this.f8998g;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f8998g--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo9533c();
        mo9540e(i);
        E[] eArr = this.f8997f;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f8998g;
    }
}
