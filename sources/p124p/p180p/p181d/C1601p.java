package p124p.p180p.p181d;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0120o;
import androidx.recyclerview.widget.RecyclerView.C0137z.C0139b;

/* renamed from: p.p.d.p */
public class C1601p extends C1612x {

    /* renamed from: d */
    public C1606t f4726d;

    /* renamed from: e */
    public C1606t f4727e;

    /* renamed from: a */
    public final int mo6347a(View view, C1606t tVar) {
        return ((tVar.mo6358b(view) / 2) + tVar.mo6362d(view)) - ((tVar.mo6367g() / 2) + tVar.mo6365f());
    }

    /* renamed from: a */
    public int mo6348a(C0120o oVar, int i, int i2) {
        int i3;
        int i4;
        if (!(oVar instanceof C0139b)) {
            return -1;
        }
        int f = oVar.mo1228f();
        if (f == 0) {
            return -1;
        }
        View b = mo1433b(oVar);
        if (b == null) {
            return -1;
        }
        int i5 = oVar.mo1237i(b);
        if (i5 == -1) {
            return -1;
        }
        int i6 = f - 1;
        PointF a = ((C0139b) oVar).mo887a(i6);
        if (a == null) {
            return -1;
        }
        int i7 = 0;
        if (oVar.mo901a()) {
            i3 = mo6349a(oVar, mo6352c(oVar), i, 0);
            if (a.x < 0.0f) {
                i3 = -i3;
            }
        } else {
            i3 = 0;
        }
        if (oVar.mo905b()) {
            i4 = mo6349a(oVar, mo6353d(oVar), 0, i2);
            if (a.y < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oVar.mo905b()) {
            i3 = i4;
        }
        if (i3 == 0) {
            return -1;
        }
        int i8 = i5 + i3;
        if (i8 >= 0) {
            i7 = i8;
        }
        if (i7 < f) {
            i6 = i7;
        }
        return i6;
    }

    /* renamed from: a */
    public final int mo6349a(C0120o oVar, C1606t tVar, int i, int i2) {
        this.f4741b.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        int[] iArr = {this.f4741b.getFinalX(), this.f4741b.getFinalY()};
        int d = oVar.mo1222d();
        float f = 1.0f;
        if (d != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < d; i5++) {
                View c = oVar.mo1219c(i5);
                int i6 = oVar.mo1237i(c);
                if (i6 != -1) {
                    if (i6 < i4) {
                        view = c;
                        i4 = i6;
                    }
                    if (i6 > i3) {
                        view2 = c;
                        i3 = i6;
                    }
                }
            }
            if (!(view == null || view2 == null)) {
                int max = Math.max(tVar.mo6355a(view), tVar.mo6355a(view2)) - Math.min(tVar.mo6362d(view), tVar.mo6362d(view2));
                if (max != 0) {
                    f = (((float) max) * 1.0f) / ((float) ((i3 - i4) + 1));
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1])) / f);
    }

    /* renamed from: a */
    public final View mo6350a(C0120o oVar, C1606t tVar) {
        int d = oVar.mo1222d();
        View view = null;
        if (d == 0) {
            return null;
        }
        int g = (tVar.mo6367g() / 2) + tVar.mo6365f();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < d; i2++) {
            View c = oVar.mo1219c(i2);
            int abs = Math.abs(((tVar.mo6358b(c) / 2) + tVar.mo6362d(c)) - g);
            if (abs < i) {
                view = c;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: a */
    public int[] mo6351a(C0120o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.mo901a()) {
            iArr[0] = mo6347a(view, mo6352c(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo905b()) {
            iArr[1] = mo6347a(view, mo6353d(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: b */
    public View mo1433b(C0120o oVar) {
        C1606t c;
        if (oVar.mo905b()) {
            c = mo6353d(oVar);
        } else if (!oVar.mo901a()) {
            return null;
        } else {
            c = mo6352c(oVar);
        }
        return mo6350a(oVar, c);
    }

    /* renamed from: c */
    public final C1606t mo6352c(C0120o oVar) {
        C1606t tVar = this.f4727e;
        if (tVar == null || tVar.f4729a != oVar) {
            this.f4727e = new C1604r(oVar);
        }
        return this.f4727e;
    }

    /* renamed from: d */
    public final C1606t mo6353d(C0120o oVar) {
        C1606t tVar = this.f4726d;
        if (tVar == null || tVar.f4729a != oVar) {
            this.f4726d = new C1605s(oVar);
        }
        return this.f4726d;
    }
}
