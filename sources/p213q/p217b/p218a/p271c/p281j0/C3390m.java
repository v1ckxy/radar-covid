package p213q.p217b.p218a.p271c.p281j0;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: q.b.a.c.j0.m */
public class C3390m implements AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C3380h f8515a;

    public C3390m(C3380h hVar) {
        this.f8515a = hVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8515a.f8518c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
