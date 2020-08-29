package p124p.p191u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: p.u.k */
public class C1724k extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1718i f5054a;

    public C1724k(C1718i iVar) {
        this.f5054a = iVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f5054a.mo6576b();
        animator.removeListener(this);
    }
}
