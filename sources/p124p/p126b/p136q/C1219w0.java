package p124p.p126b.p136q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window.Callback;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.C0058d;
import androidx.appcompat.widget.Toolbar.C0059e;
import p124p.p126b.C1018a;
import p124p.p126b.C1023f;
import p124p.p126b.C1025h;
import p124p.p126b.C1027j;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p134p.p135i.C1118i;
import p124p.p126b.p134p.p135i.C1129m;
import p124p.p126b.p134p.p135i.C1129m.C1130a;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.C1413t;
import p124p.p150h.p162l.C1417v;

/* renamed from: p.b.q.w0 */
public class C1219w0 implements C1142a0 {

    /* renamed from: a */
    public Toolbar f3452a;

    /* renamed from: b */
    public int f3453b;

    /* renamed from: c */
    public View f3454c;

    /* renamed from: d */
    public View f3455d;

    /* renamed from: e */
    public Drawable f3456e;

    /* renamed from: f */
    public Drawable f3457f;

    /* renamed from: g */
    public Drawable f3458g;

    /* renamed from: h */
    public boolean f3459h;

    /* renamed from: i */
    public CharSequence f3460i;

    /* renamed from: j */
    public CharSequence f3461j;

    /* renamed from: k */
    public CharSequence f3462k;

    /* renamed from: l */
    public Callback f3463l;

    /* renamed from: m */
    public boolean f3464m;

    /* renamed from: n */
    public C1147c f3465n;

    /* renamed from: o */
    public int f3466o = 0;

    /* renamed from: p */
    public int f3467p = 0;

    /* renamed from: q */
    public Drawable f3468q;

    /* renamed from: p.b.q.w0$a */
    public class C1220a extends C1417v {

        /* renamed from: a */
        public boolean f3469a = false;

        /* renamed from: b */
        public final /* synthetic */ int f3470b;

        public C1220a(int i) {
            this.f3470b = i;
        }

        /* renamed from: a */
        public void mo5020a(View view) {
            this.f3469a = true;
        }

        /* renamed from: b */
        public void mo4498b(View view) {
            if (!this.f3469a) {
                C1219w0.this.f3452a.setVisibility(this.f3470b);
            }
        }

        /* renamed from: c */
        public void mo4521c(View view) {
            C1219w0.this.f3452a.setVisibility(0);
        }
    }

    public C1219w0(Toolbar toolbar, boolean z) {
        int i;
        int i2 = C1025h.abc_action_bar_up_description;
        this.f3452a = toolbar;
        this.f3460i = toolbar.getTitle();
        this.f3461j = toolbar.getSubtitle();
        this.f3459h = this.f3460i != null;
        this.f3458g = toolbar.getNavigationIcon();
        String str = null;
        C1213u0 a = C1213u0.m3013a(toolbar.getContext(), null, C1027j.ActionBar, C1018a.actionBarStyle, 0);
        this.f3468q = a.mo5318b(C1027j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e = a.mo5324e(C1027j.ActionBar_title);
            if (!TextUtils.isEmpty(e)) {
                this.f3459h = true;
                this.f3460i = e;
                if ((this.f3453b & 8) != 0) {
                    this.f3452a.setTitle(e);
                }
            }
            CharSequence e2 = a.mo5324e(C1027j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e2)) {
                this.f3461j = e2;
                if ((this.f3453b & 8) != 0) {
                    this.f3452a.setSubtitle(e2);
                }
            }
            Drawable b = a.mo5318b(C1027j.ActionBar_logo);
            if (b != null) {
                this.f3457f = b;
                mo5386q();
            }
            Drawable b2 = a.mo5318b(C1027j.ActionBar_icon);
            if (b2 != null) {
                this.f3456e = b2;
                mo5386q();
            }
            if (this.f3458g == null) {
                Drawable drawable = this.f3468q;
                if (drawable != null) {
                    this.f3458g = drawable;
                    mo5385p();
                }
            }
            mo5028b(a.mo5321d(C1027j.ActionBar_displayOptions, 0));
            int g = a.mo5327g(C1027j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                View inflate = LayoutInflater.from(this.f3452a.getContext()).inflate(g, this.f3452a, false);
                View view = this.f3455d;
                if (!(view == null || (this.f3453b & 16) == 0)) {
                    this.f3452a.removeView(view);
                }
                this.f3455d = inflate;
                if (!(inflate == null || (this.f3453b & 16) == 0)) {
                    this.f3452a.addView(inflate);
                }
                mo5028b(this.f3453b | 16);
            }
            int f = a.mo5325f(C1027j.ActionBar_height, 0);
            if (f > 0) {
                LayoutParams layoutParams = this.f3452a.getLayoutParams();
                layoutParams.height = f;
                this.f3452a.setLayoutParams(layoutParams);
            }
            int b3 = a.mo5317b(C1027j.ActionBar_contentInsetStart, -1);
            int b4 = a.mo5317b(C1027j.ActionBar_contentInsetEnd, -1);
            if (b3 >= 0 || b4 >= 0) {
                Toolbar toolbar2 = this.f3452a;
                int max = Math.max(b3, 0);
                int max2 = Math.max(b4, 0);
                toolbar2.mo449b();
                toolbar2.f396x.mo5246a(max, max2);
            }
            int g2 = a.mo5327g(C1027j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                Toolbar toolbar3 = this.f3452a;
                Context context = toolbar3.getContext();
                toolbar3.f388p = g2;
                TextView textView = toolbar3.f378f;
                if (textView != null) {
                    textView.setTextAppearance(context, g2);
                }
            }
            int g3 = a.mo5327g(C1027j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar4 = this.f3452a;
                Context context2 = toolbar4.getContext();
                toolbar4.f389q = g3;
                TextView textView2 = toolbar4.f379g;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, g3);
                }
            }
            int g4 = a.mo5327g(C1027j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f3452a.setPopupTheme(g4);
            }
        } else {
            if (this.f3452a.getNavigationIcon() != null) {
                i = 15;
                this.f3468q = this.f3452a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f3453b = i;
        }
        a.f3426b.recycle();
        if (i2 != this.f3467p) {
            this.f3467p = i2;
            if (TextUtils.isEmpty(this.f3452a.getNavigationContentDescription())) {
                int i3 = this.f3467p;
                if (i3 != 0) {
                    str = mo5027b().getString(i3);
                }
                this.f3462k = str;
                mo5384o();
            }
        }
        this.f3462k = this.f3452a.getNavigationContentDescription();
        this.f3452a.setNavigationOnClickListener(new C1217v0(this));
    }

    /* renamed from: a */
    public void mo5022a(int i) {
        this.f3452a.setVisibility(i);
    }

    /* renamed from: a */
    public void mo5023a(Menu menu, C1130a aVar) {
        if (this.f3465n == null) {
            C1147c cVar = new C1147c(this.f3452a.getContext());
            this.f3465n = cVar;
            cVar.f3013m = C1023f.action_menu_presenter;
        }
        C1147c cVar2 = this.f3465n;
        cVar2.f3009i = aVar;
        Toolbar toolbar = this.f3452a;
        C1114g gVar = (C1114g) menu;
        if (gVar != null || toolbar.f377e != null) {
            toolbar.mo453d();
            C1114g gVar2 = toolbar.f377e.f184t;
            if (gVar2 != gVar) {
                if (gVar2 != null) {
                    gVar2.mo4806a((C1129m) toolbar.f373N);
                    gVar2.mo4806a((C1129m) toolbar.f374O);
                }
                if (toolbar.f374O == null) {
                    toolbar.f374O = new C0058d();
                }
                cVar2.f3211v = true;
                if (gVar != null) {
                    gVar.mo4807a((C1129m) cVar2, toolbar.f386n);
                    gVar.mo4807a((C1129m) toolbar.f374O, toolbar.f386n);
                } else {
                    cVar2.mo532a(toolbar.f386n, (C1114g) null);
                    C0058d dVar = toolbar.f374O;
                    C1114g gVar3 = dVar.f402e;
                    if (gVar3 != null) {
                        C1118i iVar = dVar.f403f;
                        if (iVar != null) {
                            gVar3.mo4812a(iVar);
                        }
                    }
                    dVar.f402e = null;
                    cVar2.mo536a(true);
                    toolbar.f374O.mo536a(true);
                }
                toolbar.f377e.setPopupTheme(toolbar.f387o);
                toolbar.f377e.setPresenter(cVar2);
                toolbar.f373N = cVar2;
            }
        }
    }

    /* renamed from: a */
    public void mo5024a(C1197n0 n0Var) {
        View view = this.f3454c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f3452a;
            if (parent == toolbar) {
                toolbar.removeView(this.f3454c);
            }
        }
        this.f3454c = n0Var;
        if (n0Var != null && this.f3466o == 2) {
            this.f3452a.addView(n0Var, 0);
            C0059e eVar = (C0059e) this.f3454c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f2677a = 8388691;
            n0Var.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo5025a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo5026a() {
        return this.f3452a.mo456f();
    }

    /* renamed from: b */
    public Context mo5027b() {
        return this.f3452a.getContext();
    }

    /* renamed from: b */
    public void mo5028b(int i) {
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f3453b ^ i;
        this.f3453b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    mo5384o();
                }
                mo5385p();
            }
            if ((i2 & 3) != 0) {
                mo5386q();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f3452a.setTitle(this.f3460i);
                    toolbar = this.f3452a;
                    charSequence = this.f3461j;
                } else {
                    charSequence = null;
                    this.f3452a.setTitle((CharSequence) null);
                    toolbar = this.f3452a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0) {
                View view = this.f3455d;
                if (view == null) {
                    return;
                }
                if ((i & 16) != 0) {
                    this.f3452a.addView(view);
                } else {
                    this.f3452a.removeView(view);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo5029b(boolean z) {
        this.f3452a.setCollapsible(z);
    }

    /* renamed from: c */
    public void mo5030c() {
        this.f3464m = true;
    }

    /* renamed from: c */
    public void mo5031c(int i) {
        this.f3457f = i != 0 ? C1070a.m2602b(mo5027b(), i) : null;
        mo5386q();
    }

    public void collapseActionView() {
        C0058d dVar = this.f3452a.f374O;
        C1118i iVar = dVar == null ? null : dVar.f403f;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5033d() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f3452a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f377e
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            p.b.q.c r0 = r0.f188x
            if (r0 == 0) goto L_0x001e
            p.b.q.c$c r3 = r0.f3199A
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.mo5058f()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = r1
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1219w0.mo5033d():boolean");
    }

    /* renamed from: e */
    public boolean mo5034e() {
        ActionMenuView actionMenuView = this.f3452a.f377e;
        if (actionMenuView != null) {
            C1147c cVar = actionMenuView.f188x;
            if (cVar != null && cVar.mo5056c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo5035f() {
        return this.f3452a.mo457g();
    }

    /* renamed from: g */
    public boolean mo5036g() {
        Toolbar toolbar = this.f3452a;
        if (toolbar.getVisibility() == 0) {
            ActionMenuView actionMenuView = toolbar.f377e;
            if (actionMenuView != null && actionMenuView.f187w) {
                return true;
            }
        }
        return false;
    }

    public CharSequence getTitle() {
        return this.f3452a.getTitle();
    }

    /* renamed from: h */
    public void mo5038h() {
        ActionMenuView actionMenuView = this.f3452a.f377e;
        if (actionMenuView != null) {
            C1147c cVar = actionMenuView.f188x;
            if (cVar != null) {
                cVar.mo5055a();
            }
        }
    }

    /* renamed from: i */
    public ViewGroup mo5039i() {
        return this.f3452a;
    }

    /* renamed from: j */
    public boolean mo5040j() {
        C0058d dVar = this.f3452a.f374O;
        return (dVar == null || dVar.f403f == null) ? false : true;
    }

    /* renamed from: k */
    public int mo5041k() {
        return this.f3453b;
    }

    /* renamed from: l */
    public int mo5042l() {
        return this.f3466o;
    }

    /* renamed from: m */
    public void mo5043m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: n */
    public void mo5044n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: o */
    public final void mo5384o() {
        if ((this.f3453b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f3462k)) {
            this.f3452a.setNavigationContentDescription(this.f3467p);
        } else {
            this.f3452a.setNavigationContentDescription(this.f3462k);
        }
    }

    /* renamed from: p */
    public final void mo5385p() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f3453b & 4) != 0) {
            toolbar = this.f3452a;
            drawable = this.f3458g;
            if (drawable == null) {
                drawable = this.f3468q;
            }
        } else {
            toolbar = this.f3452a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != null) goto L_0x0013;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5386q() {
        /*
            r2 = this;
            int r0 = r2.f3453b
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r0 = r0 & 1
            if (r0 == 0) goto L_0x000f
            android.graphics.drawable.Drawable r0 = r2.f3457f
            if (r0 == 0) goto L_0x000f
            goto L_0x0013
        L_0x000f:
            android.graphics.drawable.Drawable r0 = r2.f3456e
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            androidx.appcompat.widget.Toolbar r1 = r2.f3452a
            r1.setLogo(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1219w0.mo5386q():void");
    }

    public void setIcon(int i) {
        this.f3456e = i != 0 ? C1070a.m2602b(mo5027b(), i) : null;
        mo5386q();
    }

    public void setIcon(Drawable drawable) {
        this.f3456e = drawable;
        mo5386q();
    }

    public void setWindowCallback(Callback callback) {
        this.f3463l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f3459h) {
            this.f3460i = charSequence;
            if ((this.f3453b & 8) != 0) {
                this.f3452a.setTitle(charSequence);
            }
        }
    }

    /* renamed from: a */
    public C1413t mo5021a(int i, long j) {
        C1413t a = C1404o.m3511a(this.f3452a);
        a.mo5910a(i == 0 ? 1.0f : 0.0f);
        a.mo5911a(j);
        C1220a aVar = new C1220a(i);
        View view = (View) a.f4179a.get();
        if (view != null) {
            a.mo5915a(view, aVar);
        }
        return a;
    }
}
