package p124p.p180p.p181d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.C0105d0;
import p124p.p180p.p181d.C1587k.C1588a;

/* renamed from: p.p.d.j */
public class C1586j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1588a f4631a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f4632b;

    /* renamed from: c */
    public final /* synthetic */ View f4633c;

    /* renamed from: d */
    public final /* synthetic */ C1587k f4634d;

    public C1586j(C1587k kVar, C1588a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4634d = kVar;
        this.f4631a = aVar;
        this.f4632b = viewPropertyAnimator;
        this.f4633c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f4632b.setListener(null);
        this.f4633c.setAlpha(1.0f);
        this.f4633c.setTranslationX(0.0f);
        this.f4633c.setTranslationY(0.0f);
        this.f4634d.mo1188a(this.f4631a.f4648b);
        this.f4634d.f4646r.remove(this.f4631a.f4648b);
        this.f4634d.mo6321d();
    }

    public void onAnimationStart(Animator animator) {
        C1587k kVar = this.f4634d;
        C0105d0 d0Var = this.f4631a.f4648b;
        if (kVar == null) {
            throw null;
        }
    }
}
