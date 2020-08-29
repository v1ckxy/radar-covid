package p213q.p217b.p218a.p271c.p281j0;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: q.b.a.c.j0.d */
public class C3376d implements AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C3370a f8488a;

    public C3376d(C3370a aVar) {
        this.f8488a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8488a.f8518c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
