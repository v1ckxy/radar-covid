package p124p.p180p.p181d;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0099a0;
import androidx.recyclerview.widget.RecyclerView.C0120o;
import androidx.recyclerview.widget.RecyclerView.C0137z;
import androidx.recyclerview.widget.RecyclerView.C0137z.C0138a;
import androidx.recyclerview.widget.RecyclerView.C0137z.C0139b;

/* renamed from: p.p.d.u */
public class C1607u extends C1612x {

    /* renamed from: d */
    public C1606t f4732d;

    /* renamed from: e */
    public C1606t f4733e;

    /* renamed from: p.p.d.u$a */
    public class C1608a extends C1600o {
        public C1608a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public float mo6343a(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: a */
        public void mo1280a(View view, C0099a0 a0Var, C0138a aVar) {
            C1607u uVar = C1607u.this;
            int[] a = uVar.mo6351a(uVar.f4740a.getLayoutManager(), view);
            int i = a[0];
            int i2 = a[1];
            int b = mo6345b(Math.max(Math.abs(i), Math.abs(i2)));
            if (b > 0) {
                aVar.mo1281a(i, i2, b, this.f4719j);
            }
        }

        /* renamed from: c */
        public int mo6346c(int i) {
            return Math.min(100, super.mo6346c(i));
        }
    }

    /* renamed from: a */
    public final int mo6369a(View view, C1606t tVar) {
        return ((tVar.mo6358b(view) / 2) + tVar.mo6362d(view)) - ((tVar.mo6367g() / 2) + tVar.mo6365f());
    }

    /* renamed from: a */
    public int mo6348a(C0120o oVar, int i, int i2) {
        int f = oVar.mo1228f();
        if (f == 0) {
            return -1;
        }
        View view = null;
        C1606t tVar = oVar.mo905b() ? mo6373d(oVar) : oVar.mo901a() ? mo6372c(oVar) : null;
        if (tVar == null) {
            return -1;
        }
        int d = oVar.mo1222d();
        boolean z = false;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < d; i5++) {
            View c = oVar.mo1219c(i5);
            if (c != null) {
                int a = mo6369a(c, tVar);
                if (a <= 0 && a > i4) {
                    view2 = c;
                    i4 = a;
                }
                if (a >= 0 && a < i3) {
                    view = c;
                    i3 = a;
                }
            }
        }
        int i6 = 1;
        boolean z2 = !oVar.mo901a() ? i2 > 0 : i > 0;
        if (z2 && view != null) {
            return oVar.mo1237i(view);
        }
        if (!z2 && view2 != null) {
            return oVar.mo1237i(view2);
        }
        if (z2) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int i7 = oVar.mo1237i(view);
        int f2 = oVar.mo1228f();
        if (oVar instanceof C0139b) {
            PointF a2 = ((C0139b) oVar).mo887a(f2 - 1);
            if (a2 != null && (a2.x < 0.0f || a2.y < 0.0f)) {
                z = true;
            }
        }
        if (z == z2) {
            i6 = -1;
        }
        int i8 = i7 + i6;
        if (i8 < 0 || i8 >= f) {
            return -1;
        }
        return i8;
    }

    /* renamed from: a */
    public final View mo6370a(C0120o oVar, C1606t tVar) {
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
    public C0137z mo6371a(C0120o oVar) {
        if (!(oVar instanceof C0139b)) {
            return null;
        }
        return new C1608a(this.f4740a.getContext());
    }

    /* renamed from: a */
    public int[] mo6351a(C0120o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.mo901a()) {
            iArr[0] = mo6369a(view, mo6372c(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo905b()) {
            iArr[1] = mo6369a(view, mo6373d(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: b */
    public View mo1433b(C0120o oVar) {
        C1606t c;
        if (oVar.mo905b()) {
            c = mo6373d(oVar);
        } else if (!oVar.mo901a()) {
            return null;
        } else {
            c = mo6372c(oVar);
        }
        return mo6370a(oVar, c);
    }

    /* renamed from: c */
    public final C1606t mo6372c(C0120o oVar) {
        C1606t tVar = this.f4733e;
        if (tVar == null || tVar.f4729a != oVar) {
            this.f4733e = new C1604r(oVar);
        }
        return this.f4733e;
    }

    /* renamed from: d */
    public final C1606t mo6373d(C0120o oVar) {
        C1606t tVar = this.f4732d;
        if (tVar == null || tVar.f4729a != oVar) {
            this.f4732d = new C1605s(oVar);
        }
        return this.f4732d;
    }
}
