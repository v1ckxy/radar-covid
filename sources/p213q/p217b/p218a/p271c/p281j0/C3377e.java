package p213q.p217b.p218a.p271c.p281j0;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: q.b.a.c.j0.e */
public class C3377e implements AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C3370a f8489a;

    public C3377e(C3370a aVar) {
        this.f8489a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f8489a.f8518c.setScaleX(floatValue);
        this.f8489a.f8518c.setScaleY(floatValue);
    }
}
