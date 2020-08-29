package p213q.p217b.p218a.p271c.p284n;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.BaseBehavior;

/* renamed from: q.b.a.c.n.b */
public class C3418b implements AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f8596a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f8597b;

    /* renamed from: c */
    public final /* synthetic */ BaseBehavior f8598c;

    public C3418b(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f8598c = baseBehavior;
        this.f8596a = coordinatorLayout;
        this.f8597b = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8598c.mo9203c(this.f8596a, this.f8597b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
