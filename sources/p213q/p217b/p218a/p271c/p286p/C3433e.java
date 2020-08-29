package p213q.p217b.p218a.p271c.p286p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: q.b.a.c.p.e */
public class C3433e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomAppBar f8657a;

    public C3433e(BottomAppBar bottomAppBar) {
        this.f8657a = bottomAppBar;
    }

    public void onAnimationStart(Animator animator) {
        this.f8657a.f1192c0.onAnimationStart(animator);
        FloatingActionButton h = this.f8657a.mo1709h();
        if (h != null) {
            h.setTranslationX(this.f8657a.getFabTranslationX());
        }
    }
}
