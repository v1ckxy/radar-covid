package p213q.p217b.p218a.p271c.p295x;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0099a0;
import com.google.android.material.button.MaterialButton;
import p124p.p150h.p162l.C1387a;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.p163y.C1429b;
import p124p.p180p.p181d.C1601p;
import p213q.p217b.p218a.p271c.C3318d;
import p213q.p217b.p218a.p271c.C3327f;
import p213q.p217b.p218a.p271c.C3330g;
import p213q.p217b.p218a.p271c.C3356h;

/* renamed from: q.b.a.c.x.f */
public final class C3468f<S> extends C3489s<S> {

    /* renamed from: m0 */
    public static final Object f8838m0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: n0 */
    public static final Object f8839n0 = "NAVIGATION_PREV_TAG";

    /* renamed from: o0 */
    public static final Object f8840o0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: p0 */
    public static final Object f8841p0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: c0 */
    public int f8842c0;

    /* renamed from: d0 */
    public C3466d<S> f8843d0;

    /* renamed from: e0 */
    public C3461a f8844e0;

    /* renamed from: f0 */
    public C3482n f8845f0;

    /* renamed from: g0 */
    public C3473e f8846g0;

    /* renamed from: h0 */
    public C3465c f8847h0;

    /* renamed from: i0 */
    public RecyclerView f8848i0;

    /* renamed from: j0 */
    public RecyclerView f8849j0;

    /* renamed from: k0 */
    public View f8850k0;

    /* renamed from: l0 */
    public View f8851l0;

    /* renamed from: q.b.a.c.x.f$a */
    public class C3469a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ int f8852e;

        public C3469a(int i) {
            this.f8852e = i;
        }

        public void run() {
            C3468f.this.f8849j0.smoothScrollToPosition(this.f8852e);
        }
    }

    /* renamed from: q.b.a.c.x.f$b */
    public class C3470b extends C1387a {
        public C3470b(C3468f fVar) {
        }

        /* renamed from: a */
        public void mo768a(View view, C1429b bVar) {
            this.f4146a.onInitializeAccessibilityNodeInfo(view, bVar.f4203a);
            bVar.mo5946a((Object) null);
        }
    }

    /* renamed from: q.b.a.c.x.f$c */
    public class C3471c extends C3490t {

        /* renamed from: H */
        public final /* synthetic */ int f8854H;

        public C3471c(Context context, int i, boolean z, int i2) {
            this.f8854H = i2;
            super(context, i, z);
        }

        /* renamed from: a */
        public void mo895a(C0099a0 a0Var, int[] iArr) {
            if (this.f8854H == 0) {
                iArr[0] = C3468f.this.f8849j0.getWidth();
                iArr[1] = C3468f.this.f8849j0.getWidth();
                return;
            }
            iArr[0] = C3468f.this.f8849j0.getHeight();
            iArr[1] = C3468f.this.f8849j0.getHeight();
        }
    }

    /* renamed from: q.b.a.c.x.f$d */
    public class C3472d implements C3474f {
        public C3472d() {
        }
    }

    /* renamed from: q.b.a.c.x.f$e */
    public enum C3473e {
        DAY,
        YEAR
    }

    /* renamed from: q.b.a.c.x.f$f */
    public interface C3474f {
    }

    /* renamed from: b */
    public static int m7925b(Context context) {
        return context.getResources().getDimensionPixelSize(C3318d.mtrl_calendar_day_height);
    }

    /* renamed from: a */
    public View mo787a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mo781U(), this.f8842c0);
        this.f8847h0 = new C3465c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C3482n nVar = this.f8844e0.f8814e;
        if (C3481m.m7939b(contextThemeWrapper)) {
            i2 = C3356h.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C3356h.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C3327f.mtrl_calendar_days_of_week);
        C1404o.m3526a((View) gridView, (C1387a) new C3470b(this));
        gridView.setAdapter(new C3467e());
        gridView.setNumColumns(nVar.f8876i);
        gridView.setEnabled(false);
        this.f8849j0 = (RecyclerView) inflate.findViewById(C3327f.mtrl_calendar_months);
        C3471c cVar = new C3471c(mo781U(), i, false, i);
        this.f8849j0.setLayoutManager(cVar);
        this.f8849j0.setTag(f8838m0);
        C3486q qVar = new C3486q(contextThemeWrapper, this.f8843d0, this.f8844e0, new C3472d());
        this.f8849j0.setAdapter(qVar);
        int integer = contextThemeWrapper.getResources().getInteger(C3330g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C3327f.mtrl_calendar_year_selector_frame);
        this.f8848i0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f8848i0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f8848i0.setAdapter(new C3493v(this));
            this.f8848i0.addItemDecoration(new C3475g(this));
        }
        if (inflate.findViewById(C3327f.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C3327f.month_navigation_fragment_toggle);
            materialButton.setTag(f8841p0);
            C1404o.m3526a((View) materialButton, (C1387a) new C3476h(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C3327f.month_navigation_previous);
            materialButton2.setTag(f8839n0);
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(C3327f.month_navigation_next);
            materialButton3.setTag(f8840o0);
            this.f8850k0 = inflate.findViewById(C3327f.mtrl_calendar_year_selector_frame);
            this.f8851l0 = inflate.findViewById(C3327f.mtrl_calendar_day_selector_frame);
            mo9421a(C3473e.DAY);
            materialButton.setText(this.f8845f0.f8873f);
            this.f8849j0.addOnScrollListener(new C3477i(this, qVar, materialButton));
            materialButton.setOnClickListener(new C3478j(this));
            materialButton3.setOnClickListener(new C3479k(this, qVar));
            materialButton2.setOnClickListener(new C3480l(this, qVar));
        }
        if (!C3481m.m7939b(contextThemeWrapper)) {
            new C1601p().mo6376a(this.f8849j0);
        }
        this.f8849j0.scrollToPosition(qVar.mo9448a(this.f8845f0));
        return inflate;
    }

    /* renamed from: a */
    public void mo9421a(C3473e eVar) {
        this.f8846g0 = eVar;
        if (eVar == C3473e.YEAR) {
            this.f8848i0.getLayoutManager().mo914h(((C3493v) this.f8848i0.getAdapter()).mo9452b(this.f8845f0.f8875h));
            this.f8850k0.setVisibility(0);
            this.f8851l0.setVisibility(8);
        } else if (eVar == C3473e.DAY) {
            this.f8850k0.setVisibility(8);
            this.f8851l0.setVisibility(0);
            mo9422a(this.f8845f0);
        }
    }

    /* renamed from: b */
    public void mo799b(Bundle bundle) {
        super.mo799b(bundle);
        if (bundle == null) {
            bundle = this.f615j;
        }
        this.f8842c0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f8843d0 = (C3466d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f8844e0 = (C3461a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f8845f0 = (C3482n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* renamed from: d */
    public final void mo9423d(int i) {
        this.f8849j0.post(new C3469a(i));
    }

    /* renamed from: d */
    public void mo805d(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f8842c0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f8843d0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f8844e0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f8845f0);
    }

    /* renamed from: r0 */
    public LinearLayoutManager mo9424r0() {
        return (LinearLayoutManager) this.f8849j0.getLayoutManager();
    }

    /* renamed from: a */
    public void mo9422a(C3482n nVar) {
        RecyclerView recyclerView;
        int i;
        C3486q qVar = (C3486q) this.f8849j0.getAdapter();
        int b = qVar.f8885d.f8814e.mo9431b(nVar);
        int a = b - qVar.mo9448a(this.f8845f0);
        boolean z = true;
        boolean z2 = Math.abs(a) > 3;
        if (a <= 0) {
            z = false;
        }
        this.f8845f0 = nVar;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.f8849j0;
                i = b + 3;
            }
            mo9423d(b);
        }
        recyclerView = this.f8849j0;
        i = b - 3;
        recyclerView.scrollToPosition(i);
        mo9423d(b);
    }
}
