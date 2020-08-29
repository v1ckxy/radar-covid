package p124p.p170k.p171a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: p.k.a.m */
public class C1503m extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f4425a;

    /* renamed from: b */
    public final /* synthetic */ View f4426b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f4427c;

    /* renamed from: d */
    public final /* synthetic */ C1490k f4428d;

    public C1503m(C1490k kVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f4428d = kVar;
        this.f4425a = viewGroup;
        this.f4426b = view;
        this.f4427c = fragment;
    }

    public void onAnimationEnd(Animator animator) {
        this.f4425a.endViewTransition(this.f4426b);
        Animator S = this.f4427c.mo779S();
        this.f4427c.mo789a((Animator) null);
        if (S != null && this.f4425a.indexOfChild(this.f4426b) < 0) {
            C1490k kVar = this.f4428d;
            Fragment fragment = this.f4427c;
            kVar.mo6104a(fragment, fragment.mo804c0(), 0, 0, false);
        }
    }
}
