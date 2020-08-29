package p119o.p120a.p121a;

import java.lang.Comparable;
import java.util.Arrays;
import p119o.p120a.p121a.C0913r;
import p392u.p401r.p403c.C4638h;

/* renamed from: o.a.a.q */
public class C0912q<T extends C0913r & Comparable<? super T>> {
    public volatile int _size = 0;

    /* renamed from: a */
    public T[] f2507a;

    /* renamed from: a */
    public final T mo4194a() {
        T[] tArr = this.f2507a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: a */
    public final void mo4196a(int i, int i2) {
        T[] tArr = this.f2507a;
        if (tArr != null) {
            T t = tArr[i2];
            if (t != null) {
                T t2 = tArr[i];
                if (t2 != null) {
                    tArr[i] = t;
                    tArr[i2] = t2;
                    t.mo4202a(i);
                    t2.mo4202a(i2);
                    return;
                }
                C4638h.m10269a();
                throw null;
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10269a();
        throw null;
    }

    /* renamed from: a */
    public final void mo4197a(T t) {
        t.mo4203a(this);
        T[] tArr = this.f2507a;
        if (tArr == null) {
            tArr = new C0913r[4];
            this.f2507a = tArr;
        } else if (this._size >= tArr.length) {
            T[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            C4638h.m10270a((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
            tArr = (C0913r[]) copyOf;
            this.f2507a = tArr;
        }
        int i = this._size;
        this._size = i + 1;
        tArr[i] = t;
        t.mo4202a(i);
        mo4199b(i);
    }

    /* renamed from: b */
    public final T mo4198b() {
        T a;
        synchronized (this) {
            a = mo4194a();
        }
        return a;
    }

    /* renamed from: b */
    public final void mo4199b(int i) {
        while (i > 0) {
            T[] tArr = this.f2507a;
            if (tArr != null) {
                int i2 = (i - 1) / 2;
                T t = tArr[i2];
                if (t != null) {
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i];
                    if (t2 == null) {
                        C4638h.m10269a();
                        throw null;
                    } else if (comparable.compareTo(t2) > 0) {
                        mo4196a(i, i2);
                        i = i2;
                    } else {
                        return;
                    }
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            } else {
                C4638h.m10269a();
                throw null;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo4200b(T t) {
        boolean z;
        synchronized (this) {
            if (t.mo4205h() == null) {
                z = false;
            } else {
                mo4195a(t.mo4204g());
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final T mo4201c() {
        T a;
        synchronized (this) {
            a = this._size > 0 ? mo4195a(0) : null;
        }
        return a;
    }

    /* renamed from: a */
    public final T mo4195a(int i) {
        T[] tArr = this.f2507a;
        if (tArr != null) {
            this._size--;
            if (i < this._size) {
                mo4196a(i, this._size);
                int i2 = (i - 1) / 2;
                if (i > 0) {
                    T t = tArr[i];
                    if (t != null) {
                        Comparable comparable = (Comparable) t;
                        T t2 = tArr[i2];
                        if (t2 == null) {
                            C4638h.m10269a();
                            throw null;
                        } else if (comparable.compareTo(t2) < 0) {
                            mo4196a(i, i2);
                            mo4199b(i2);
                        }
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
                while (true) {
                    int i3 = (i * 2) + 1;
                    if (i3 >= this._size) {
                        break;
                    }
                    T[] tArr2 = this.f2507a;
                    if (tArr2 != null) {
                        int i4 = i3 + 1;
                        if (i4 < this._size) {
                            T t3 = tArr2[i4];
                            if (t3 != null) {
                                Comparable comparable2 = (Comparable) t3;
                                T t4 = tArr2[i3];
                                if (t4 == null) {
                                    C4638h.m10269a();
                                    throw null;
                                } else if (comparable2.compareTo(t4) < 0) {
                                    i3 = i4;
                                }
                            } else {
                                C4638h.m10269a();
                                throw null;
                            }
                        }
                        T t5 = tArr2[i];
                        if (t5 != null) {
                            Comparable comparable3 = (Comparable) t5;
                            T t6 = tArr2[i3];
                            if (t6 == null) {
                                C4638h.m10269a();
                                throw null;
                            } else if (comparable3.compareTo(t6) <= 0) {
                                break;
                            } else {
                                mo4196a(i, i3);
                                i = i3;
                            }
                        } else {
                            C4638h.m10269a();
                            throw null;
                        }
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
            }
            T t7 = tArr[this._size];
            if (t7 != null) {
                t7.mo4203a(null);
                t7.mo4202a(-1);
                tArr[this._size] = null;
                return t7;
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10269a();
        throw null;
    }
}
