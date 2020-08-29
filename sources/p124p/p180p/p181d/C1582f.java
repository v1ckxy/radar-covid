package p124p.p180p.p181d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.C0105d0;

/* renamed from: p.p.d.f */
public class C1582f extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0105d0 f4613a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f4614b;

    /* renamed from: c */
    public final /* synthetic */ View f4615c;

    /* renamed from: d */
    public final /* synthetic */ C1587k f4616d;

    public C1582f(C1587k kVar, C0105d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4616d = kVar;
        this.f4613a = d0Var;
        this.f4614b = viewPropertyAnimator;
        this.f4615c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f4614b.setListener(null);
        this.f4615c.setAlpha(1.0f);
        this.f4616d.mo1188a(this.f4613a);
        this.f4616d.f4645q.remove(this.f4613a);
        this.f4616d.mo6321d();
    }

    public void onAnimationStart(Animator animator) {
        if (this.f4616d == null) {
            throw null;
        }
    }
}
