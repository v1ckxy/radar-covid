package p213q.p217b.p218a.p271c.p286p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: q.b.a.c.p.a */
public class C3428a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomAppBar f8647a;

    public C3428a(BottomAppBar bottomAppBar) {
        this.f8647a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        BottomAppBar.m969c(this.f8647a);
    }

    public void onAnimationStart(Animator animator) {
        this.f8647a.f1189W++;
    }
}
