package p369s.p370a.p371a.p378f.p388h;

import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: s.a.a.f.h.c */
public final class C4537c<T> {

    /* renamed from: a */
    public final float f10751a = 0.75f;

    /* renamed from: b */
    public int f10752b;

    /* renamed from: c */
    public int f10753c;

    /* renamed from: d */
    public int f10754d;

    /* renamed from: e */
    public T[] f10755e;

    public C4537c() {
        int g = C2286e.m5341g(16);
        this.f10752b = g - 1;
        this.f10754d = (int) (0.75f * ((float) g));
        this.f10755e = new Object[g];
    }

    /* renamed from: a */
    public static int m10207a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean mo10805a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f10753c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = m10207a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    /* renamed from: a */
    public boolean mo10806a(T t) {
        T t2;
        T[] tArr = this.f10755e;
        int i = this.f10752b;
        int a = m10207a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                t2 = tArr[a];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a] = t;
        int i2 = this.f10753c + 1;
        this.f10753c = i2;
        if (i2 >= this.f10754d) {
            T[] tArr2 = this.f10755e;
            int length = tArr2.length;
            int i3 = length << 1;
            int i4 = i3 - 1;
            T[] tArr3 = new Object[i3];
            while (true) {
                int i5 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                do {
                    length--;
                } while (tArr2[length] == null);
                int a2 = m10207a(tArr2[length].hashCode()) & i4;
                if (tArr3[a2] != null) {
                    do {
                        a2 = (a2 + 1) & i4;
                    } while (tArr3[a2] != null);
                }
                tArr3[a2] = tArr2[length];
                i2 = i5;
            }
            this.f10752b = i4;
            this.f10754d = (int) (((float) i3) * this.f10751a);
            this.f10755e = tArr3;
        }
        return true;
    }
}
