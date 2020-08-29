package p124p.p126b.p136q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p124p.p126b.C1027j;
import p124p.p150h.p162l.C1404o;

/* renamed from: p.b.q.e */
public class C1162e {

    /* renamed from: a */
    public final View f3244a;

    /* renamed from: b */
    public final C1178i f3245b;

    /* renamed from: c */
    public int f3246c = -1;

    /* renamed from: d */
    public C1209s0 f3247d;

    /* renamed from: e */
    public C1209s0 f3248e;

    /* renamed from: f */
    public C1209s0 f3249f;

    public C1162e(View view) {
        this.f3244a = view;
        this.f3245b = C1178i.m2951a();
    }

    /* renamed from: a */
    public void mo5093a() {
        Drawable background = this.f3244a.getBackground();
        if (background != null) {
            boolean z = true;
            if (this.f3247d != null) {
                if (this.f3249f == null) {
                    this.f3249f = new C1209s0();
                }
                C1209s0 s0Var = this.f3249f;
                s0Var.f3413a = null;
                s0Var.f3416d = false;
                s0Var.f3414b = null;
                s0Var.f3415c = false;
                ColorStateList e = C1404o.m3542e(this.f3244a);
                if (e != null) {
                    s0Var.f3416d = true;
                    s0Var.f3413a = e;
                }
                Mode backgroundTintMode = this.f3244a.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    s0Var.f3415c = true;
                    s0Var.f3414b = backgroundTintMode;
                }
                if (s0Var.f3416d || s0Var.f3415c) {
                    C1178i.m2952a(background, s0Var, this.f3244a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C1209s0 s0Var2 = this.f3248e;
            if (s0Var2 != null) {
                C1178i.m2952a(background, s0Var2, this.f3244a.getDrawableState());
            } else {
                C1209s0 s0Var3 = this.f3247d;
                if (s0Var3 != null) {
                    C1178i.m2952a(background, s0Var3, this.f3244a.getDrawableState());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5094a(int i) {
        this.f3246c = i;
        C1178i iVar = this.f3245b;
        mo5095a(iVar != null ? iVar.mo5177b(this.f3244a.getContext(), i) : null);
        mo5093a();
    }

    /* renamed from: a */
    public void mo5095a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3247d == null) {
                this.f3247d = new C1209s0();
            }
            C1209s0 s0Var = this.f3247d;
            s0Var.f3413a = colorStateList;
            s0Var.f3416d = true;
        } else {
            this.f3247d = null;
        }
        mo5093a();
    }

    /* renamed from: a */
    public void mo5096a(Mode mode) {
        if (this.f3248e == null) {
            this.f3248e = new C1209s0();
        }
        C1209s0 s0Var = this.f3248e;
        s0Var.f3414b = mode;
        s0Var.f3415c = true;
        mo5093a();
    }

    /* renamed from: b */
    public ColorStateList mo5098b() {
        C1209s0 s0Var = this.f3248e;
        if (s0Var != null) {
            return s0Var.f3413a;
        }
        return null;
    }

    /* renamed from: b */
    public void mo5099b(ColorStateList colorStateList) {
        if (this.f3248e == null) {
            this.f3248e = new C1209s0();
        }
        C1209s0 s0Var = this.f3248e;
        s0Var.f3413a = colorStateList;
        s0Var.f3416d = true;
        mo5093a();
    }

    /* renamed from: c */
    public Mode mo5100c() {
        C1209s0 s0Var = this.f3248e;
        if (s0Var != null) {
            return s0Var.f3414b;
        }
        return null;
    }

    /* renamed from: d */
    public void mo5101d() {
        this.f3246c = -1;
        mo5095a((ColorStateList) null);
        mo5093a();
    }

    /* renamed from: a */
    public void mo5097a(AttributeSet attributeSet, int i) {
        C1213u0 a = C1213u0.m3013a(this.f3244a.getContext(), attributeSet, C1027j.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo5326f(C1027j.ViewBackgroundHelper_android_background)) {
                this.f3246c = a.mo5327g(C1027j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f3245b.mo5177b(this.f3244a.getContext(), this.f3246c);
                if (b != null) {
                    mo5095a(b);
                }
            }
            if (a.mo5326f(C1027j.ViewBackgroundHelper_backgroundTint)) {
                C1404o.m3519a(this.f3244a, a.mo5314a(C1027j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo5326f(C1027j.ViewBackgroundHelper_backgroundTintMode)) {
                C1404o.m3520a(this.f3244a, C1145b0.m2889a(a.mo5321d(C1027j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a.f3426b.recycle();
        }
    }
}
