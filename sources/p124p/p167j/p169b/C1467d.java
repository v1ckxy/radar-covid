package p124p.p167j.p169b;

import android.graphics.Rect;
import java.util.Comparator;
import p124p.p167j.p169b.C1461a.C1462a;

/* renamed from: p.j.b.d */
public class C1467d<T> implements Comparator<T> {

    /* renamed from: e */
    public final Rect f4289e = new Rect();

    /* renamed from: f */
    public final Rect f4290f = new Rect();

    /* renamed from: g */
    public final boolean f4291g;

    /* renamed from: h */
    public final C1465b<T> f4292h;

    public C1467d(boolean z, C1465b<T> bVar) {
        this.f4291g = z;
        this.f4292h = bVar;
    }

    public int compare(T t, T t2) {
        Rect rect = this.f4289e;
        Rect rect2 = this.f4290f;
        ((C1462a) this.f4292h).mo5998a(t, rect);
        ((C1462a) this.f4292h).mo5998a(t2, rect2);
        int i = rect.top;
        int i2 = rect2.top;
        int i3 = -1;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i4 = rect.left;
        int i5 = rect2.left;
        if (i4 < i5) {
            if (this.f4291g) {
                i3 = 1;
            }
            return i3;
        } else if (i4 > i5) {
            if (!this.f4291g) {
                i3 = 1;
            }
            return i3;
        } else {
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if (i6 < i7) {
                return -1;
            }
            if (i6 > i7) {
                return 1;
            }
            int i8 = rect.right;
            int i9 = rect2.right;
            if (i8 < i9) {
                if (this.f4291g) {
                    i3 = 1;
                }
                return i3;
            } else if (i8 <= i9) {
                return 0;
            } else {
                if (!this.f4291g) {
                    i3 = 1;
                }
                return i3;
            }
        }
    }
}
