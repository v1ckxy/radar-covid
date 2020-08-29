package p213q.p217b.p218a.p271c.p284n;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.material.appbar.AppBarLayout;
import p213q.p217b.p218a.p271c.p278g0.C3337g;

/* renamed from: q.b.a.c.n.a */
public class C3417a implements AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C3337g f8595a;

    public C3417a(AppBarLayout appBarLayout, C3337g gVar) {
        this.f8595a = gVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8595a.mo9059a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
