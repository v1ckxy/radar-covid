package p213q.p217b.p218a.p271c.p273b0;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: q.b.a.c.b0.g */
public final class C3302g {

    /* renamed from: a */
    public final ArrayList<C3304b> f8285a = new ArrayList<>();

    /* renamed from: b */
    public C3304b f8286b = null;

    /* renamed from: c */
    public ValueAnimator f8287c = null;

    /* renamed from: d */
    public final AnimatorListener f8288d = new C3303a();

    /* renamed from: q.b.a.c.b0.g$a */
    public class C3303a extends AnimatorListenerAdapter {
        public C3303a() {
        }

        public void onAnimationEnd(Animator animator) {
            C3302g gVar = C3302g.this;
            if (gVar.f8287c == animator) {
                gVar.f8287c = null;
            }
        }
    }

    /* renamed from: q.b.a.c.b0.g$b */
    public static class C3304b {

        /* renamed from: a */
        public final int[] f8290a;

        /* renamed from: b */
        public final ValueAnimator f8291b;

        public C3304b(int[] iArr, ValueAnimator valueAnimator) {
            this.f8290a = iArr;
            this.f8291b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void mo9029a(int[] iArr, ValueAnimator valueAnimator) {
        C3304b bVar = new C3304b(iArr, valueAnimator);
        valueAnimator.addListener(this.f8288d);
        this.f8285a.add(bVar);
    }
}
