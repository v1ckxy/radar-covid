package p213q.p217b.p218a.p271c.p286p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: q.b.a.c.p.c */
public class C3431c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomAppBar f8651a;

    public C3431c(BottomAppBar bottomAppBar) {
        this.f8651a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        BottomAppBar.m969c(this.f8651a);
        this.f8651a.f1185S = null;
    }

    public void onAnimationStart(Animator animator) {
        this.f8651a.f1189W++;
    }
}
