package p213q.p217b.p218a.p271c.p282k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationBehavior;
import p213q.p217b.p218a.p271c.p293w.C3454c;
import p213q.p217b.p218a.p271c.p293w.C3454c.C3459e;

/* renamed from: q.b.a.c.k0.c */
public class C3403c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C3454c f8571a;

    public C3403c(FabTransformationBehavior fabTransformationBehavior, C3454c cVar) {
        this.f8571a = cVar;
    }

    public void onAnimationEnd(Animator animator) {
        C3459e revealInfo = this.f8571a.getRevealInfo();
        revealInfo.f8813c = Float.MAX_VALUE;
        this.f8571a.setRevealInfo(revealInfo);
    }
}
