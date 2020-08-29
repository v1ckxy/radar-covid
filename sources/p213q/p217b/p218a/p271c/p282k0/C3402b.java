package p213q.p217b.p218a.p271c.p282k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.transformation.FabTransformationBehavior;
import p213q.p217b.p218a.p271c.p293w.C3454c;

/* renamed from: q.b.a.c.k0.b */
public class C3402b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C3454c f8569a;

    /* renamed from: b */
    public final /* synthetic */ Drawable f8570b;

    public C3402b(FabTransformationBehavior fabTransformationBehavior, C3454c cVar, Drawable drawable) {
        this.f8569a = cVar;
        this.f8570b = drawable;
    }

    public void onAnimationEnd(Animator animator) {
        this.f8569a.setCircularRevealOverlayDrawable(null);
    }

    public void onAnimationStart(Animator animator) {
        this.f8569a.setCircularRevealOverlayDrawable(this.f8570b);
    }
}
