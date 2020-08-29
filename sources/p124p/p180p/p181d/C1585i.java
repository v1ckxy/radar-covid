package p124p.p180p.p181d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.C0105d0;
import p124p.p180p.p181d.C1587k.C1588a;

/* renamed from: p.p.d.i */
public class C1585i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1588a f4627a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f4628b;

    /* renamed from: c */
    public final /* synthetic */ View f4629c;

    /* renamed from: d */
    public final /* synthetic */ C1587k f4630d;

    public C1585i(C1587k kVar, C1588a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4630d = kVar;
        this.f4627a = aVar;
        this.f4628b = viewPropertyAnimator;
        this.f4629c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f4628b.setListener(null);
        this.f4629c.setAlpha(1.0f);
        this.f4629c.setTranslationX(0.0f);
        this.f4629c.setTranslationY(0.0f);
        this.f4630d.mo1188a(this.f4627a.f4647a);
        this.f4630d.f4646r.remove(this.f4627a.f4647a);
        this.f4630d.mo6321d();
    }

    public void onAnimationStart(Animator animator) {
        C1587k kVar = this.f4630d;
        C0105d0 d0Var = this.f4627a.f4647a;
        if (kVar == null) {
            throw null;
        }
    }
}
