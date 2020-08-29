package p213q.p217b.p218a.p271c.p286p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: q.b.a.c.p.d */
public class C3432d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f8652a;

    /* renamed from: b */
    public final /* synthetic */ ActionMenuView f8653b;

    /* renamed from: c */
    public final /* synthetic */ int f8654c;

    /* renamed from: d */
    public final /* synthetic */ boolean f8655d;

    /* renamed from: e */
    public final /* synthetic */ BottomAppBar f8656e;

    public C3432d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f8656e = bottomAppBar;
        this.f8653b = actionMenuView;
        this.f8654c = i;
        this.f8655d = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.f8652a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f8652a) {
            this.f8653b.setTranslationX((float) this.f8656e.mo1700a(this.f8653b, this.f8654c, this.f8655d));
        }
    }
}
