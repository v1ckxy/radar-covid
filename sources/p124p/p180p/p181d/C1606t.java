package p124p.p180p.p181d;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0120o;

/* renamed from: p.p.d.t */
public abstract class C1606t {

    /* renamed from: a */
    public final C0120o f4729a;

    /* renamed from: b */
    public int f4730b = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: c */
    public final Rect f4731c = new Rect();

    public /* synthetic */ C1606t(C0120o oVar, C1604r rVar) {
        this.f4729a = oVar;
    }

    /* renamed from: a */
    public static C1606t m4079a(C0120o oVar, int i) {
        if (i == 0) {
            return new C1604r(oVar);
        }
        if (i == 1) {
            return new C1605s(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: a */
    public abstract int mo6354a();

    /* renamed from: a */
    public abstract int mo6355a(View view);

    /* renamed from: a */
    public abstract void mo6356a(int i);

    /* renamed from: b */
    public abstract int mo6357b();

    /* renamed from: b */
    public abstract int mo6358b(View view);

    /* renamed from: c */
    public abstract int mo6359c();

    /* renamed from: c */
    public abstract int mo6360c(View view);

    /* renamed from: d */
    public abstract int mo6361d();

    /* renamed from: d */
    public abstract int mo6362d(View view);

    /* renamed from: e */
    public abstract int mo6363e();

    /* renamed from: e */
    public abstract int mo6364e(View view);

    /* renamed from: f */
    public abstract int mo6365f();

    /* renamed from: f */
    public abstract int mo6366f(View view);

    /* renamed from: g */
    public abstract int mo6367g();

    /* renamed from: h */
    public int mo6368h() {
        if (Integer.MIN_VALUE == this.f4730b) {
            return 0;
        }
        return mo6367g() - this.f4730b;
    }
}
