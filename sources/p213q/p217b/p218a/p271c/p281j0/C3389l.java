package p213q.p217b.p218a.p271c.p281j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: q.b.a.c.j0.l */
public class C3389l extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C3380h f8514a;

    public C3389l(C3380h hVar) {
        this.f8514a = hVar;
    }

    public void onAnimationEnd(Animator animator) {
        C3380h hVar = this.f8514a;
        hVar.f8518c.setChecked(hVar.f8497h);
        this.f8514a.f8503n.start();
    }
}
