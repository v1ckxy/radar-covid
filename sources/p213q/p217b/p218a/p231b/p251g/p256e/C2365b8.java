package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Arrays;
import java.util.RandomAccess;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.e.b8 */
public final class C2365b8<E> extends C2345a5<E> implements RandomAccess {

    /* renamed from: h */
    public static final C2365b8<Object> f6336h;

    /* renamed from: f */
    public E[] f6337f;

    /* renamed from: g */
    public int f6338g;

    static {
        C2365b8<Object> b8Var = new C2365b8<>(new Object[0], 0);
        f6336h = b8Var;
        b8Var.f6313e = false;
    }

    public C2365b8(E[] eArr, int i) {
        this.f6337f = eArr;
        this.f6338g = i;
    }

    /* renamed from: a */
    public final /* synthetic */ C2635q6 mo7414a(int i) {
        if (i >= this.f6338g) {
            return new C2365b8(Arrays.copyOf(this.f6337f, i), this.f6338g);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, E e) {
        mo7392c();
        if (i >= 0) {
            int i2 = this.f6338g;
            if (i <= i2) {
                E[] eArr = this.f6337f;
                if (i2 < eArr.length) {
                    System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
                } else {
                    E[] eArr2 = new Object[C1965a.m4760b(i2, 3, 2, 1)];
                    System.arraycopy(eArr, 0, eArr2, 0, i);
                    System.arraycopy(this.f6337f, i, eArr2, i + 1, this.f6338g - i);
                    this.f6337f = eArr2;
                }
                this.f6337f[i] = e;
                this.f6338g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(mo7417e(i));
    }

    public final boolean add(E e) {
        mo7392c();
        int i = this.f6338g;
        E[] eArr = this.f6337f;
        if (i == eArr.length) {
            this.f6337f = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f6337f;
        int i2 = this.f6338g;
        this.f6338g = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: c */
    public final void mo7416c(int i) {
        if (i < 0 || i >= this.f6338g) {
            throw new IndexOutOfBoundsException(mo7417e(i));
        }
    }

    /* renamed from: e */
    public final String mo7417e(int i) {
        int i2 = this.f6338g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final E get(int i) {
        mo7416c(i);
        return this.f6337f[i];
    }

    public final E remove(int i) {
        mo7392c();
        mo7416c(i);
        E[] eArr = this.f6337f;
        E e = eArr[i];
        int i2 = this.f6338g;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f6338g--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo7392c();
        mo7416c(i);
        E[] eArr = this.f6337f;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f6338g;
    }
}
