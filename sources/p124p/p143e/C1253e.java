package p124p.p143e;

import p116io.jsonwebtoken.lang.Objects;

/* renamed from: p.e.e */
public class C1253e<E> implements Cloneable {

    /* renamed from: i */
    public static final Object f3556i = new Object();

    /* renamed from: e */
    public boolean f3557e = false;

    /* renamed from: f */
    public long[] f3558f;

    /* renamed from: g */
    public Object[] f3559g;

    /* renamed from: h */
    public int f3560h;

    public C1253e() {
        int c = C1252d.m3163c(10);
        this.f3558f = new long[c];
        this.f3559g = new Object[c];
    }

    /* renamed from: a */
    public long mo5511a(int i) {
        if (this.f3557e) {
            mo5518c();
        }
        return this.f3558f[i];
    }

    /* renamed from: a */
    public void mo5512a(long j, E e) {
        int i = this.f3560h;
        if (i == 0 || j > this.f3558f[i - 1]) {
            if (this.f3557e && this.f3560h >= this.f3558f.length) {
                mo5518c();
            }
            int i2 = this.f3560h;
            if (i2 >= this.f3558f.length) {
                int c = C1252d.m3163c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr = new Object[c];
                long[] jArr2 = this.f3558f;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f3559g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f3558f = jArr;
                this.f3559g = objArr;
            }
            this.f3558f[i2] = j;
            this.f3559g[i2] = e;
            this.f3560h = i2 + 1;
            return;
        }
        mo5520c(j, e);
    }

    /* renamed from: a */
    public boolean mo5513a(long j) {
        if (this.f3557e) {
            mo5518c();
        }
        return C1252d.m3160a(this.f3558f, this.f3560h, j) >= 0;
    }

    /* renamed from: b */
    public E mo5514b(int i) {
        if (this.f3557e) {
            mo5518c();
        }
        return this.f3559g[i];
    }

    /* renamed from: b */
    public E mo5515b(long j) {
        return mo5516b(j, null);
    }

    /* renamed from: b */
    public E mo5516b(long j, E e) {
        int a = C1252d.m3160a(this.f3558f, this.f3560h, j);
        if (a >= 0) {
            E[] eArr = this.f3559g;
            if (eArr[a] != f3556i) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: b */
    public void mo5517b() {
        int i = this.f3560h;
        Object[] objArr = this.f3559g;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3560h = 0;
        this.f3557e = false;
    }

    /* renamed from: c */
    public final void mo5518c() {
        int i = this.f3560h;
        long[] jArr = this.f3558f;
        Object[] objArr = this.f3559g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3556i) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3557e = false;
        this.f3560h = i2;
    }

    /* renamed from: c */
    public void mo5519c(long j) {
        int a = C1252d.m3160a(this.f3558f, this.f3560h, j);
        if (a >= 0) {
            Object[] objArr = this.f3559g;
            Object obj = objArr[a];
            Object obj2 = f3556i;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f3557e = true;
            }
        }
    }

    /* renamed from: c */
    public void mo5520c(long j, E e) {
        int a = C1252d.m3160a(this.f3558f, this.f3560h, j);
        if (a >= 0) {
            this.f3559g[a] = e;
        } else {
            int i = ~a;
            if (i < this.f3560h) {
                Object[] objArr = this.f3559g;
                if (objArr[i] == f3556i) {
                    this.f3558f[i] = j;
                    objArr[i] = e;
                    return;
                }
            }
            if (this.f3557e && this.f3560h >= this.f3558f.length) {
                mo5518c();
                i = ~C1252d.m3160a(this.f3558f, this.f3560h, j);
            }
            int i2 = this.f3560h;
            if (i2 >= this.f3558f.length) {
                int c = C1252d.m3163c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr2 = new Object[c];
                long[] jArr2 = this.f3558f;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr3 = this.f3559g;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f3558f = jArr;
                this.f3559g = objArr2;
            }
            int i3 = this.f3560h;
            if (i3 - i != 0) {
                long[] jArr3 = this.f3558f;
                int i4 = i + 1;
                System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
                Object[] objArr4 = this.f3559g;
                System.arraycopy(objArr4, i, objArr4, i4, this.f3560h - i);
            }
            this.f3558f[i] = j;
            this.f3559g[i] = e;
            this.f3560h++;
        }
    }

    public C1253e<E> clone() {
        try {
            C1253e<E> eVar = (C1253e) super.clone();
            eVar.f3558f = (long[]) this.f3558f.clone();
            eVar.f3559g = (Object[]) this.f3559g.clone();
            return eVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public boolean mo5522d() {
        return mo5523e() == 0;
    }

    /* renamed from: e */
    public int mo5523e() {
        if (this.f3557e) {
            mo5518c();
        }
        return this.f3560h;
    }

    public String toString() {
        if (mo5523e() <= 0) {
            return Objects.EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder(this.f3560h * 28);
        sb.append('{');
        for (int i = 0; i < this.f3560h; i++) {
            if (i > 0) {
                sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            }
            sb.append(mo5511a(i));
            sb.append('=');
            Object b = mo5514b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
