package p213q.p217b.p218a.p271c.p282k0;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

/* renamed from: q.b.a.c.k0.a */
public class C3401a implements AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f8568a;

    public C3401a(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.f8568a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8568a.invalidate();
    }
}
