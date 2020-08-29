package p003f.p004a.p005a.p108g.p114c;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import p002es.gob.radarcovid.common.view.AnimatedCircleView;
import p392u.C4557i;

/* renamed from: f.a.a.g.c.b */
public final class C0835b implements AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ AnimatedCircleView f2391a;

    public C0835b(AnimatedCircleView animatedCircleView) {
        this.f2391a = animatedCircleView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnimatedCircleView animatedCircleView = this.f2391a;
        Object animatedValue = valueAnimator.getAnimatedValue("width");
        if (animatedValue != null) {
            animatedCircleView.f1702h = ((Integer) animatedValue).intValue();
            this.f2391a.invalidate();
            return;
        }
        throw new C4557i("null cannot be cast to non-null type kotlin.Int");
    }
}
