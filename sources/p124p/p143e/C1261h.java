package p124p.p143e;

import java.util.ConcurrentModificationException;
import java.util.Map;
import p116io.jsonwebtoken.lang.Objects;

/* renamed from: p.e.h */
public class C1261h<K, V> {

    /* renamed from: h */
    public static Object[] f3583h;

    /* renamed from: i */
    public static int f3584i;

    /* renamed from: j */
    public static Object[] f3585j;

    /* renamed from: k */
    public static int f3586k;

    /* renamed from: e */
    public int[] f3587e;

    /* renamed from: f */
    public Object[] f3588f;

    /* renamed from: g */
    public int f3589g;

    public C1261h() {
        this.f3587e = C1252d.f3553a;
        this.f3588f = C1252d.f3555c;
        this.f3589g = 0;
    }

    public C1261h(int i) {
        if (i == 0) {
            this.f3587e = C1252d.f3553a;
            this.f3588f = C1252d.f3555c;
        } else {
            mo5590a(i);
        }
        this.f3589g = 0;
    }

    /* renamed from: a */
    public static void m3192a(int[] iArr, Object[] objArr, int i) {
        Class<C1261h> cls = C1261h.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f3586k < 10) {
                    objArr[0] = f3585j;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f3585j = objArr;
                    f3586k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f3584i < 10) {
                    objArr[0] = f3583h;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3583h = objArr;
                    f3584i++;
                }
            }
        }
    }

    /* renamed from: a */
    public int mo5587a(Object obj) {
        return obj == null ? mo5586a() : mo5588a(obj, obj.hashCode());
    }

    /* renamed from: a */
    public int mo5588a(Object obj, int i) {
        int i2 = this.f3589g;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a = C1252d.m3159a(this.f3587e, i2, i);
            if (a < 0 || obj.equals(this.f3588f[a << 1])) {
                return a;
            }
            int i3 = a + 1;
            while (i3 < i2 && this.f3587e[i3] == i) {
                if (obj.equals(this.f3588f[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = a - 1;
            while (i4 >= 0 && this.f3587e[i4] == i) {
                if (obj.equals(this.f3588f[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public V mo5589a(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f3588f;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public final void mo5590a(int i) {
        Class<C1261h> cls = C1261h.class;
        if (i == 8) {
            synchronized (cls) {
                if (f3585j != null) {
                    Object[] objArr = f3585j;
                    this.f3588f = objArr;
                    f3585j = (Object[]) objArr[0];
                    this.f3587e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3586k--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (f3583h != null) {
                    Object[] objArr2 = f3583h;
                    this.f3588f = objArr2;
                    f3583h = (Object[]) objArr2[0];
                    this.f3587e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3584i--;
                    return;
                }
            }
        }
        this.f3587e = new int[i];
        this.f3588f = new Object[(i << 1)];
    }

    /* renamed from: b */
    public int mo5591b(Object obj) {
        int i = this.f3589g * 2;
        Object[] objArr = this.f3588f;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo5592b(int i) {
        int i2 = this.f3589g;
        int[] iArr = this.f3587e;
        if (iArr.length < i) {
            Object[] objArr = this.f3588f;
            mo5590a(i);
            if (this.f3589g > 0) {
                System.arraycopy(iArr, 0, this.f3587e, 0, i2);
                System.arraycopy(objArr, 0, this.f3588f, 0, i2 << 1);
            }
            m3192a(iArr, objArr, i2);
        }
        if (this.f3589g != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public K mo5593c(int i) {
        return this.f3588f[i << 1];
    }

    public void clear() {
        int i = this.f3589g;
        if (i > 0) {
            int[] iArr = this.f3587e;
            Object[] objArr = this.f3588f;
            this.f3587e = C1252d.f3553a;
            this.f3588f = C1252d.f3555c;
            this.f3589g = 0;
            m3192a(iArr, objArr, i);
        }
        if (this.f3589g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo5587a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo5591b(obj) >= 0;
    }

    /* renamed from: d */
    public V mo5597d(int i) {
        V[] vArr = this.f3588f;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f3589g;
        int i4 = 0;
        if (i3 <= 1) {
            m3192a(this.f3587e, vArr, i3);
            this.f3587e = C1252d.f3553a;
            this.f3588f = C1252d.f3555c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f3587e;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.f3587e;
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr2, i7, iArr2, i, i8);
                    Object[] objArr = this.f3588f;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f3588f;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.f3587e;
                Object[] objArr3 = this.f3588f;
                mo5590a(i6);
                if (i3 == this.f3589g) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f3587e, 0, i);
                        System.arraycopy(objArr3, 0, this.f3588f, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr3, i10, this.f3587e, i, i11);
                        System.arraycopy(objArr3, i10 << 1, this.f3588f, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f3589g) {
            this.f3589g = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: e */
    public V mo5598e(int i) {
        return this.f3588f[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1261h) {
            C1261h hVar = (C1261h) obj;
            if (this.f3589g != hVar.f3589g) {
                return false;
            }
            int i = 0;
            while (i < this.f3589g) {
                try {
                    Object c = mo5593c(i);
                    Object e = mo5598e(i);
                    Object obj2 = hVar.get(c);
                    if (e == null) {
                        if (obj2 != null || !hVar.containsKey(c)) {
                            return false;
                        }
                    } else if (!e.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f3589g != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f3589g) {
                try {
                    Object c2 = mo5593c(i2);
                    Object e2 = mo5598e(i2);
                    Object obj3 = map.get(c2);
                    if (e2 == null) {
                        if (obj3 != null || !map.containsKey(c2)) {
                            return false;
                        }
                    } else if (!e2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int a = mo5587a(obj);
        return a >= 0 ? this.f3588f[(a << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f3587e;
        Object[] objArr = this.f3588f;
        int i = this.f3589g;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f3589g <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f3589g;
        if (k == null) {
            i2 = mo5586a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo5588a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f3588f;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        if (i3 >= this.f3587e.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f3587e;
            Object[] objArr = this.f3588f;
            mo5590a(i6);
            if (i3 == this.f3589g) {
                int[] iArr2 = this.f3587e;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f3588f, 0, objArr.length);
                }
                m3192a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f3587e;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f3588f;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f3589g - i5) << 1);
        }
        int i8 = this.f3589g;
        if (i3 == i8) {
            int[] iArr4 = this.f3587e;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f3588f;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f3589g = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int a = mo5587a(obj);
        if (a >= 0) {
            return mo5597d(a);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int a = mo5587a(obj);
        if (a >= 0) {
            Object e = mo5598e(a);
            if (obj2 == e || (obj2 != null && obj2.equals(e))) {
                mo5597d(a);
                return true;
            }
        }
        return false;
    }

    public V replace(K k, V v) {
        int a = mo5587a((Object) k);
        if (a >= 0) {
            return mo5589a(a, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int a = mo5587a((Object) k);
        if (a >= 0) {
            V e = mo5598e(a);
            if (e == v || (v != null && v.equals(e))) {
                mo5589a(a, v2);
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.f3589g;
    }

    public String toString() {
        if (isEmpty()) {
            return Objects.EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder(this.f3589g * 28);
        sb.append('{');
        for (int i = 0; i < this.f3589g; i++) {
            if (i > 0) {
                sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            }
            Object c = mo5593c(i);
            String str = "(this Map)";
            if (c != this) {
                sb.append(c);
            } else {
                sb.append(str);
            }
            sb.append('=');
            Object e = mo5598e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append(str);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public int mo5586a() {
        int i = this.f3589g;
        if (i == 0) {
            return -1;
        }
        try {
            int a = C1252d.m3159a(this.f3587e, i, 0);
            if (a < 0 || this.f3588f[a << 1] == null) {
                return a;
            }
            int i2 = a + 1;
            while (i2 < i && this.f3587e[i2] == 0) {
                if (this.f3588f[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = a - 1;
            while (i3 >= 0 && this.f3587e[i3] == 0) {
                if (this.f3588f[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
