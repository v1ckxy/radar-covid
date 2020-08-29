package p124p.p180p.p181d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.C0105d0;

/* renamed from: p.p.d.g */
public class C1583g extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0105d0 f4617a;

    /* renamed from: b */
    public final /* synthetic */ View f4618b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f4619c;

    /* renamed from: d */
    public final /* synthetic */ C1587k f4620d;

    public C1583g(C1587k kVar, C0105d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4620d = kVar;
        this.f4617a = d0Var;
        this.f4618b = view;
        this.f4619c = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        this.f4618b.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.f4619c.setListener(null);
        this.f4620d.mo1188a(this.f4617a);
        this.f4620d.f4643o.remove(this.f4617a);
        this.f4620d.mo6321d();
    }

    public void onAnimationStart(Animator animator) {
        if (this.f4620d == null) {
            throw null;
        }
    }
}
