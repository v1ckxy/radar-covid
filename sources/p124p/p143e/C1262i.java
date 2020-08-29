package p124p.p143e;

import p116io.jsonwebtoken.lang.Objects;

/* renamed from: p.e.i */
public class C1262i<E> implements Cloneable {

    /* renamed from: i */
    public static final Object f3590i = new Object();

    /* renamed from: e */
    public boolean f3591e;

    /* renamed from: f */
    public int[] f3592f;

    /* renamed from: g */
    public Object[] f3593g;

    /* renamed from: h */
    public int f3594h;

    public C1262i() {
        this(10);
    }

    public C1262i(int i) {
        this.f3591e = false;
        if (i == 0) {
            this.f3592f = C1252d.f3553a;
            this.f3593g = C1252d.f3555c;
            return;
        }
        int b = C1252d.m3162b(i);
        this.f3592f = new int[b];
        this.f3593g = new Object[b];
    }

    /* renamed from: a */
    public E mo5612a(int i) {
        return mo5615b(i, null);
    }

    /* renamed from: a */
    public void mo5613a(int i, E e) {
        int i2 = this.f3594h;
        if (i2 == 0 || i > this.f3592f[i2 - 1]) {
            if (this.f3591e && this.f3594h >= this.f3592f.length) {
                mo5616b();
            }
            int i3 = this.f3594h;
            if (i3 >= this.f3592f.length) {
                int b = C1252d.m3162b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr = new Object[b];
                int[] iArr2 = this.f3592f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f3593g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f3592f = iArr;
                this.f3593g = objArr;
            }
            this.f3592f[i3] = i;
            this.f3593g[i3] = e;
            this.f3594h = i3 + 1;
            return;
        }
        mo5619c(i, e);
    }

    /* renamed from: b */
    public int mo5614b(int i) {
        if (this.f3591e) {
            mo5616b();
        }
        return this.f3592f[i];
    }

    /* renamed from: b */
    public E mo5615b(int i, E e) {
        int a = C1252d.m3159a(this.f3592f, this.f3594h, i);
        if (a >= 0) {
            E[] eArr = this.f3593g;
            if (eArr[a] != f3590i) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: b */
    public final void mo5616b() {
        int i = this.f3594h;
        int[] iArr = this.f3592f;
        Object[] objArr = this.f3593g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3590i) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3591e = false;
        this.f3594h = i2;
    }

    /* renamed from: c */
    public int mo5617c() {
        if (this.f3591e) {
            mo5616b();
        }
        return this.f3594h;
    }

    /* renamed from: c */
    public void mo5618c(int i) {
        int a = C1252d.m3159a(this.f3592f, this.f3594h, i);
        if (a >= 0) {
            Object[] objArr = this.f3593g;
            Object obj = objArr[a];
            Object obj2 = f3590i;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f3591e = true;
            }
        }
    }

    /* renamed from: c */
    public void mo5619c(int i, E e) {
        int a = C1252d.m3159a(this.f3592f, this.f3594h, i);
        if (a >= 0) {
            this.f3593g[a] = e;
        } else {
            int i2 = ~a;
            if (i2 < this.f3594h) {
                Object[] objArr = this.f3593g;
                if (objArr[i2] == f3590i) {
                    this.f3592f[i2] = i;
                    objArr[i2] = e;
                    return;
                }
            }
            if (this.f3591e && this.f3594h >= this.f3592f.length) {
                mo5616b();
                i2 = ~C1252d.m3159a(this.f3592f, this.f3594h, i);
            }
            int i3 = this.f3594h;
            if (i3 >= this.f3592f.length) {
                int b = C1252d.m3162b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr2 = new Object[b];
                int[] iArr2 = this.f3592f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr3 = this.f3593g;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f3592f = iArr;
                this.f3593g = objArr2;
            }
            int i4 = this.f3594h;
            if (i4 - i2 != 0) {
                int[] iArr3 = this.f3592f;
                int i5 = i2 + 1;
                System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
                Object[] objArr4 = this.f3593g;
                System.arraycopy(objArr4, i2, objArr4, i5, this.f3594h - i2);
            }
            this.f3592f[i2] = i;
            this.f3593g[i2] = e;
            this.f3594h++;
        }
    }

    public C1262i<E> clone() {
        try {
            C1262i<E> iVar = (C1262i) super.clone();
            iVar.f3592f = (int[]) this.f3592f.clone();
            iVar.f3593g = (Object[]) this.f3593g.clone();
            return iVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public E mo5621d(int i) {
        if (this.f3591e) {
            mo5616b();
        }
        return this.f3593g[i];
    }

    public String toString() {
        if (mo5617c() <= 0) {
            return Objects.EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder(this.f3594h * 28);
        sb.append('{');
        for (int i = 0; i < this.f3594h; i++) {
            if (i > 0) {
                sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(mo5614b(i));
            sb.append('=');
            Object d = mo5621d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
