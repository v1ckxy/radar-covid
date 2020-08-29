package p124p.p126b.p127k;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout.C0017d;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.C1018a;
import p124p.p126b.C1019b;
import p124p.p126b.C1023f;
import p124p.p126b.C1027j;
import p124p.p126b.p127k.C1028a.C1030b;
import p124p.p126b.p134p.C1089a;
import p124p.p126b.p134p.C1089a.C1090a;
import p124p.p126b.p134p.C1096f;
import p124p.p126b.p134p.C1099g;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p134p.p135i.C1114g.C1115a;
import p124p.p126b.p136q.C1142a0;
import p124p.p126b.p136q.C1147c;
import p124p.p126b.p136q.C1197n0;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.C1413t;
import p124p.p150h.p162l.C1416u;
import p124p.p150h.p162l.C1417v;
import p124p.p150h.p162l.C1418w;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.b.k.r */
public class C1065r extends C1028a implements C0017d {

    /* renamed from: A */
    public static final Interpolator f2810A = new AccelerateInterpolator();

    /* renamed from: B */
    public static final Interpolator f2811B = new DecelerateInterpolator();

    /* renamed from: a */
    public Context f2812a;

    /* renamed from: b */
    public Context f2813b;

    /* renamed from: c */
    public ActionBarOverlayLayout f2814c;

    /* renamed from: d */
    public ActionBarContainer f2815d;

    /* renamed from: e */
    public C1142a0 f2816e;

    /* renamed from: f */
    public ActionBarContextView f2817f;

    /* renamed from: g */
    public View f2818g;

    /* renamed from: h */
    public boolean f2819h;

    /* renamed from: i */
    public C1069d f2820i;

    /* renamed from: j */
    public C1089a f2821j;

    /* renamed from: k */
    public C1090a f2822k;

    /* renamed from: l */
    public boolean f2823l;

    /* renamed from: m */
    public ArrayList<C1030b> f2824m = new ArrayList<>();

    /* renamed from: n */
    public boolean f2825n;

    /* renamed from: o */
    public int f2826o = 0;

    /* renamed from: p */
    public boolean f2827p = true;

    /* renamed from: q */
    public boolean f2828q;

    /* renamed from: r */
    public boolean f2829r;

    /* renamed from: s */
    public boolean f2830s;

    /* renamed from: t */
    public boolean f2831t = true;

    /* renamed from: u */
    public C1099g f2832u;

    /* renamed from: v */
    public boolean f2833v;

    /* renamed from: w */
    public boolean f2834w;

    /* renamed from: x */
    public final C1416u f2835x = new C1066a();

    /* renamed from: y */
    public final C1416u f2836y = new C1067b();

    /* renamed from: z */
    public final C1418w f2837z = new C1068c();

    /* renamed from: p.b.k.r$a */
    public class C1066a extends C1417v {
        public C1066a() {
        }

        /* renamed from: b */
        public void mo4498b(View view) {
            C1065r rVar = C1065r.this;
            if (rVar.f2827p) {
                View view2 = rVar.f2818g;
                if (view2 != null) {
                    view2.setTranslationY(0.0f);
                    C1065r.this.f2815d.setTranslationY(0.0f);
                }
            }
            C1065r.this.f2815d.setVisibility(8);
            C1065r.this.f2815d.setTransitioning(false);
            C1065r rVar2 = C1065r.this;
            rVar2.f2832u = null;
            C1090a aVar = rVar2.f2822k;
            if (aVar != null) {
                aVar.mo4494a(rVar2.f2821j);
                rVar2.f2821j = null;
                rVar2.f2822k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = C1065r.this.f2814c;
            if (actionBarOverlayLayout != null) {
                C1404o.m3508C(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: p.b.k.r$b */
    public class C1067b extends C1417v {
        public C1067b() {
        }

        /* renamed from: b */
        public void mo4498b(View view) {
            C1065r rVar = C1065r.this;
            rVar.f2832u = null;
            rVar.f2815d.requestLayout();
        }
    }

    /* renamed from: p.b.k.r$c */
    public class C1068c implements C1418w {
        public C1068c() {
        }
    }

    /* renamed from: p.b.k.r$d */
    public class C1069d extends C1089a implements C1115a {

        /* renamed from: g */
        public final Context f2841g;

        /* renamed from: h */
        public final C1114g f2842h;

        /* renamed from: i */
        public C1090a f2843i;

        /* renamed from: j */
        public WeakReference<View> f2844j;

        public C1069d(Context context, C1090a aVar) {
            this.f2841g = context;
            this.f2843i = aVar;
            C1114g gVar = new C1114g(context);
            this.f2842h = gVar;
            gVar.f3076e = this;
        }

        /* renamed from: a */
        public void mo4540a() {
            C1065r rVar = C1065r.this;
            if (rVar.f2820i == this) {
                boolean z = rVar.f2828q;
                boolean z2 = rVar.f2829r;
                boolean z3 = true;
                if (z || z2) {
                    z3 = false;
                }
                if (!z3) {
                    C1065r rVar2 = C1065r.this;
                    rVar2.f2821j = this;
                    rVar2.f2822k = this.f2843i;
                } else {
                    this.f2843i.mo4494a(this);
                }
                this.f2843i = null;
                C1065r.this.mo4537d(false);
                ActionBarContextView actionBarContextView = C1065r.this.f2817f;
                if (actionBarContextView.f138o == null) {
                    actionBarContextView.mo99b();
                }
                C1065r.this.f2816e.mo5039i().sendAccessibilityEvent(32);
                C1065r rVar3 = C1065r.this;
                rVar3.f2814c.setHideOnContentScrollEnabled(rVar3.f2834w);
                C1065r.this.f2820i = null;
            }
        }

        /* renamed from: a */
        public void mo4542a(View view) {
            C1065r.this.f2817f.setCustomView(view);
            this.f2844j = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo4543a(CharSequence charSequence) {
            C1065r.this.f2817f.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public boolean mo199a(C1114g gVar, MenuItem menuItem) {
            C1090a aVar = this.f2843i;
            if (aVar != null) {
                return aVar.mo4496a((C1089a) this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public View mo4545b() {
            WeakReference<View> weakReference = this.f2844j;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: b */
        public void mo4546b(int i) {
            C1065r.this.f2817f.setTitle(C1065r.this.f2812a.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo4547b(CharSequence charSequence) {
            C1065r.this.f2817f.setTitle(charSequence);
        }

        /* renamed from: c */
        public Menu mo4548c() {
            return this.f2842h;
        }

        /* renamed from: d */
        public MenuInflater mo4549d() {
            return new C1096f(this.f2841g);
        }

        /* renamed from: e */
        public CharSequence mo4550e() {
            return C1065r.this.f2817f.getSubtitle();
        }

        /* renamed from: f */
        public CharSequence mo4551f() {
            return C1065r.this.f2817f.getTitle();
        }

        /* renamed from: g */
        public void mo4552g() {
            if (C1065r.this.f2820i == this) {
                this.f2842h.mo4840j();
                try {
                    this.f2843i.mo4495a((C1089a) this, (Menu) this.f2842h);
                } finally {
                    this.f2842h.mo4838i();
                }
            }
        }

        /* renamed from: h */
        public boolean mo4553h() {
            return C1065r.this.f2817f.f145v;
        }

        /* renamed from: a */
        public void mo198a(C1114g gVar) {
            if (this.f2843i != null) {
                mo4552g();
                C1147c cVar = C1065r.this.f2817f.f3185h;
                if (cVar != null) {
                    cVar.mo5059g();
                }
            }
        }

        /* renamed from: a */
        public void mo4541a(int i) {
            C1065r.this.f2817f.setSubtitle(C1065r.this.f2812a.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo4544a(boolean z) {
            this.f2918f = z;
            C1065r.this.f2817f.setTitleOptional(z);
        }
    }

    public C1065r(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        mo4536a(decorView);
        if (!z) {
            this.f2818g = decorView.findViewById(16908290);
        }
    }

    public C1065r(Dialog dialog) {
        new ArrayList();
        mo4536a(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    public final void mo4536a(View view) {
        C1142a0 a0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C1023f.decor_content_parent);
        this.f2814c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(C1023f.action_bar);
        if (findViewById instanceof C1142a0) {
            a0Var = (C1142a0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            a0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder a = C1965a.m4756a("Can't make a decor toolbar out of ");
            a.append(findViewById != null ? findViewById.getClass().getSimpleName() : Objects.NULL_STRING);
            throw new IllegalStateException(a.toString());
        }
        this.f2816e = a0Var;
        this.f2817f = (ActionBarContextView) view.findViewById(C1023f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C1023f.action_bar_container);
        this.f2815d = actionBarContainer;
        C1142a0 a0Var2 = this.f2816e;
        if (a0Var2 == null || this.f2817f == null || actionBarContainer == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C1065r.class.getSimpleName());
            sb.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.f2812a = a0Var2.mo5027b();
        boolean z = (this.f2816e.mo5041k() & 4) != 0;
        if (z) {
            this.f2819h = true;
        }
        Context context = this.f2812a;
        this.f2816e.mo5025a((context.getApplicationInfo().targetSdkVersion < 14) || z);
        mo4538e(context.getResources().getBoolean(C1019b.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2812a.obtainStyledAttributes(null, C1027j.ActionBar, C1018a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C1027j.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2814c;
            if (actionBarOverlayLayout2.f161l) {
                this.f2834w = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1027j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            C1404o.m3514a((View) this.f2815d, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo4410a(CharSequence charSequence) {
        this.f2816e.setWindowTitle(charSequence);
    }

    /* renamed from: a */
    public void mo4411a(boolean z) {
        if (z != this.f2823l) {
            this.f2823l = z;
            int size = this.f2824m.size();
            for (int i = 0; i < size; i++) {
                ((C1030b) this.f2824m.get(i)).mo4418a(z);
            }
        }
    }

    /* renamed from: a */
    public boolean mo4412a() {
        C1142a0 a0Var = this.f2816e;
        if (a0Var == null || !a0Var.mo5040j()) {
            return false;
        }
        this.f2816e.collapseActionView();
        return true;
    }

    /* renamed from: b */
    public int mo4414b() {
        return this.f2816e.mo5041k();
    }

    /* renamed from: b */
    public void mo4415b(boolean z) {
        if (!this.f2819h) {
            int i = z ? 4 : 0;
            int k = this.f2816e.mo5041k();
            this.f2819h = true;
            this.f2816e.mo5028b((i & 4) | (k & -5));
        }
    }

    /* renamed from: c */
    public Context mo4416c() {
        if (this.f2813b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2812a.getTheme().resolveAttribute(C1018a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2813b = new ContextThemeWrapper(this.f2812a, i);
            } else {
                this.f2813b = this.f2812a;
            }
        }
        return this.f2813b;
    }

    /* renamed from: c */
    public void mo4417c(boolean z) {
        this.f2833v = z;
        if (!z) {
            C1099g gVar = this.f2832u;
            if (gVar != null) {
                gVar.mo4685a();
            }
        }
    }

    /* renamed from: d */
    public void mo4537d(boolean z) {
        C1413t tVar;
        C1413t tVar2;
        if (z) {
            if (!this.f2830s) {
                this.f2830s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2814c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                mo4539f(false);
            }
        } else if (this.f2830s) {
            this.f2830s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2814c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            mo4539f(false);
        }
        if (C1404o.m3563x(this.f2815d)) {
            if (z) {
                tVar = this.f2816e.mo5021a(4, 100);
                tVar2 = this.f2817f.mo5016a(0, 200);
            } else {
                tVar2 = this.f2816e.mo5021a(0, 200);
                tVar = this.f2817f.mo5016a(8, 100);
            }
            C1099g gVar = new C1099g();
            gVar.f2976a.add(tVar);
            View view = (View) tVar.f4179a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) tVar2.f4179a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            gVar.f2976a.add(tVar2);
            gVar.mo4686b();
        } else if (z) {
            this.f2816e.mo5022a(4);
            this.f2817f.setVisibility(0);
        } else {
            this.f2816e.mo5022a(0);
            this.f2817f.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void mo4538e(boolean z) {
        this.f2825n = z;
        if (!z) {
            this.f2816e.mo5024a((C1197n0) null);
            this.f2815d.setTabContainer(null);
        } else {
            this.f2815d.setTabContainer(null);
            this.f2816e.mo5024a((C1197n0) null);
        }
        boolean z2 = true;
        boolean z3 = this.f2816e.mo5042l() == 2;
        this.f2816e.mo5029b(!this.f2825n && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2814c;
        if (this.f2825n || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: f */
    public final void mo4539f(boolean z) {
        if (this.f2830s || !this.f2829r) {
            if (!this.f2831t) {
                this.f2831t = true;
                C1099g gVar = this.f2832u;
                if (gVar != null) {
                    gVar.mo4685a();
                }
                this.f2815d.setVisibility(0);
                if (this.f2826o != 0 || (!this.f2833v && !z)) {
                    this.f2815d.setAlpha(1.0f);
                    this.f2815d.setTranslationY(0.0f);
                    if (this.f2827p) {
                        View view = this.f2818g;
                        if (view != null) {
                            view.setTranslationY(0.0f);
                        }
                    }
                    this.f2836y.mo4498b(null);
                } else {
                    this.f2815d.setTranslationY(0.0f);
                    float f = (float) (-this.f2815d.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        this.f2815d.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f2815d.setTranslationY(f);
                    C1099g gVar2 = new C1099g();
                    C1413t a = C1404o.m3511a(this.f2815d);
                    a.mo5916b(0.0f);
                    a.mo5913a(this.f2837z);
                    if (!gVar2.f2980e) {
                        gVar2.f2976a.add(a);
                    }
                    if (this.f2827p) {
                        View view2 = this.f2818g;
                        if (view2 != null) {
                            view2.setTranslationY(f);
                            C1413t a2 = C1404o.m3511a(this.f2818g);
                            a2.mo5916b(0.0f);
                            if (!gVar2.f2980e) {
                                gVar2.f2976a.add(a2);
                            }
                        }
                    }
                    Interpolator interpolator = f2811B;
                    if (!gVar2.f2980e) {
                        gVar2.f2978c = interpolator;
                    }
                    if (!gVar2.f2980e) {
                        gVar2.f2977b = 250;
                    }
                    C1416u uVar = this.f2836y;
                    if (!gVar2.f2980e) {
                        gVar2.f2979d = uVar;
                    }
                    this.f2832u = gVar2;
                    gVar2.mo4686b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2814c;
                if (actionBarOverlayLayout != null) {
                    C1404o.m3508C(actionBarOverlayLayout);
                }
            }
        } else if (this.f2831t) {
            this.f2831t = false;
            C1099g gVar3 = this.f2832u;
            if (gVar3 != null) {
                gVar3.mo4685a();
            }
            if (this.f2826o != 0 || (!this.f2833v && !z)) {
                this.f2835x.mo4498b(null);
                return;
            }
            this.f2815d.setAlpha(1.0f);
            this.f2815d.setTransitioning(true);
            C1099g gVar4 = new C1099g();
            float f2 = (float) (-this.f2815d.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                this.f2815d.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            C1413t a3 = C1404o.m3511a(this.f2815d);
            a3.mo5916b(f2);
            a3.mo5913a(this.f2837z);
            if (!gVar4.f2980e) {
                gVar4.f2976a.add(a3);
            }
            if (this.f2827p) {
                View view3 = this.f2818g;
                if (view3 != null) {
                    C1413t a4 = C1404o.m3511a(view3);
                    a4.mo5916b(f2);
                    if (!gVar4.f2980e) {
                        gVar4.f2976a.add(a4);
                    }
                }
            }
            Interpolator interpolator2 = f2810A;
            if (!gVar4.f2980e) {
                gVar4.f2978c = interpolator2;
            }
            if (!gVar4.f2980e) {
                gVar4.f2977b = 250;
            }
            C1416u uVar2 = this.f2835x;
            if (!gVar4.f2980e) {
                gVar4.f2979d = uVar2;
            }
            this.f2832u = gVar4;
            gVar4.mo4686b();
        }
    }

    /* renamed from: a */
    public void mo4409a(Configuration configuration) {
        mo4538e(this.f2812a.getResources().getBoolean(C1019b.abc_action_bar_embed_tabs));
    }

    /* renamed from: a */
    public boolean mo4413a(int i, KeyEvent keyEvent) {
        C1069d dVar = this.f2820i;
        if (dVar == null) {
            return false;
        }
        C1114g gVar = dVar.f2842h;
        if (gVar == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        gVar.setQwertyMode(z);
        return gVar.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public C1089a mo4408a(C1090a aVar) {
        C1069d dVar = this.f2820i;
        if (dVar != null) {
            dVar.mo4540a();
        }
        this.f2814c.setHideOnContentScrollEnabled(false);
        this.f2817f.mo99b();
        C1069d dVar2 = new C1069d(this.f2817f.getContext(), aVar);
        dVar2.f2842h.mo4840j();
        try {
            if (!dVar2.f2843i.mo4497b(dVar2, dVar2.f2842h)) {
                return null;
            }
            this.f2820i = dVar2;
            dVar2.mo4552g();
            this.f2817f.mo98a(dVar2);
            mo4537d(true);
            this.f2817f.sendAccessibilityEvent(32);
            return dVar2;
        } finally {
            dVar2.f2842h.mo4838i();
        }
    }
}
