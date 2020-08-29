package p213q.p217b.p218a.p271c.p288r;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p213q.p217b.p218a.p271c.p278g0.C3337g;

/* renamed from: q.b.a.c.r.a */
public class C3444a implements AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f8713a;

    public C3444a(BottomSheetBehavior bottomSheetBehavior) {
        this.f8713a = bottomSheetBehavior;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C3337g gVar = this.f8713a.f1228h;
        if (gVar != null) {
            gVar.mo9068b(floatValue);
        }
    }
}
