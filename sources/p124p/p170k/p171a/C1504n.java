package p124p.p170k.p171a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: p.k.a.n */
public class C1504n extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f4429a;

    /* renamed from: b */
    public final /* synthetic */ View f4430b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f4431c;

    public C1504n(C1490k kVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f4429a = viewGroup;
        this.f4430b = view;
        this.f4431c = fragment;
    }

    public void onAnimationEnd(Animator animator) {
        this.f4429a.endViewTransition(this.f4430b);
        animator.removeListener(this);
        Fragment fragment = this.f4431c;
        View view = fragment.f594K;
        if (view != null && fragment.f586C) {
            view.setVisibility(8);
        }
    }
}
