package p124p.p180p.p181d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.C0105d0;

/* renamed from: p.p.d.h */
public class C1584h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0105d0 f4621a;

    /* renamed from: b */
    public final /* synthetic */ int f4622b;

    /* renamed from: c */
    public final /* synthetic */ View f4623c;

    /* renamed from: d */
    public final /* synthetic */ int f4624d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f4625e;

    /* renamed from: f */
    public final /* synthetic */ C1587k f4626f;

    public C1584h(C1587k kVar, C0105d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4626f = kVar;
        this.f4621a = d0Var;
        this.f4622b = i;
        this.f4623c = view;
        this.f4624d = i2;
        this.f4625e = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f4622b != 0) {
            this.f4623c.setTranslationX(0.0f);
        }
        if (this.f4624d != 0) {
            this.f4623c.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.f4625e.setListener(null);
        this.f4626f.mo1188a(this.f4621a);
        this.f4626f.f4644p.remove(this.f4621a);
        this.f4626f.mo6321d();
    }

    public void onAnimationStart(Animator animator) {
        if (this.f4626f == null) {
            throw null;
        }
    }
}
