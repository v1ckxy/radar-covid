package p213q.p217b.p218a.p271c.p272a0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.C0236c;

/* renamed from: q.b.a.c.a0.a */
public class C3277a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f8172a;

    /* renamed from: b */
    public final /* synthetic */ C3293i f8173b;

    /* renamed from: c */
    public final /* synthetic */ C0236c f8174c = null;

    public C3277a(ExtendedFloatingActionButton extendedFloatingActionButton, C3293i iVar) {
        this.f8173b = iVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f8172a = true;
        this.f8173b.mo8988b();
    }

    public void onAnimationEnd(Animator animator) {
        this.f8173b.mo8986a();
        if (!this.f8172a) {
            this.f8173b.mo8987a(null);
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f8173b.onAnimationStart(animator);
        this.f8172a = false;
    }
}
