package p124p.p126b.p136q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import p124p.p126b.C1027j;
import p124p.p126b.p128l.p129a.C1070a;

/* renamed from: p.b.q.l */
public class C1192l {

    /* renamed from: a */
    public final ImageView f3355a;

    /* renamed from: b */
    public C1209s0 f3356b;

    public C1192l(ImageView imageView) {
        this.f3355a = imageView;
    }

    /* renamed from: a */
    public void mo5225a() {
        Drawable drawable = this.f3355a.getDrawable();
        if (drawable != null) {
            C1145b0.m2891b(drawable);
        }
        if (drawable != null) {
            C1209s0 s0Var = this.f3356b;
            if (s0Var != null) {
                C1178i.m2952a(drawable, s0Var, this.f3355a.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    public void mo5226a(int i) {
        if (i != 0) {
            Drawable b = C1070a.m2602b(this.f3355a.getContext(), i);
            if (b != null) {
                C1145b0.m2891b(b);
            }
            this.f3355a.setImageDrawable(b);
        } else {
            this.f3355a.setImageDrawable(null);
        }
        mo5225a();
    }

    /* renamed from: a */
    public void mo5227a(ColorStateList colorStateList) {
        if (this.f3356b == null) {
            this.f3356b = new C1209s0();
        }
        C1209s0 s0Var = this.f3356b;
        s0Var.f3413a = colorStateList;
        s0Var.f3416d = true;
        mo5225a();
    }

    /* renamed from: a */
    public void mo5228a(Mode mode) {
        if (this.f3356b == null) {
            this.f3356b = new C1209s0();
        }
        C1209s0 s0Var = this.f3356b;
        s0Var.f3414b = mode;
        s0Var.f3415c = true;
        mo5225a();
    }

    /* renamed from: a */
    public void mo5229a(AttributeSet attributeSet, int i) {
        C1213u0 a = C1213u0.m3013a(this.f3355a.getContext(), attributeSet, C1027j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f3355a.getDrawable();
            if (drawable == null) {
                int g = a.mo5327g(C1027j.AppCompatImageView_srcCompat, -1);
                if (g != -1) {
                    drawable = C1070a.m2602b(this.f3355a.getContext(), g);
                    if (drawable != null) {
                        this.f3355a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                C1145b0.m2891b(drawable);
            }
            if (a.mo5326f(C1027j.AppCompatImageView_tint)) {
                this.f3355a.setImageTintList(a.mo5314a(C1027j.AppCompatImageView_tint));
            }
            if (a.mo5326f(C1027j.AppCompatImageView_tintMode)) {
                this.f3355a.setImageTintMode(C1145b0.m2889a(a.mo5321d(C1027j.AppCompatImageView_tintMode, -1), null));
            }
            a.f3426b.recycle();
        } catch (Throwable th) {
            a.f3426b.recycle();
            throw th;
        }
    }
}
