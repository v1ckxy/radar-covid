package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0068c;
import p213q.p217b.p218a.p271c.p283m.C3407a;

public class HideBottomViewOnScrollBehavior<V extends View> extends C0068c<V> {

    /* renamed from: a */
    public int f1164a = 0;

    /* renamed from: b */
    public int f1165b = 2;

    /* renamed from: c */
    public int f1166c = 0;

    /* renamed from: d */
    public ViewPropertyAnimator f1167d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C0205a extends AnimatorListenerAdapter {
        public C0205a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f1167d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo1686a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f1167d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C0205a());
    }

    /* renamed from: a */
    public void mo655a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            if (this.f1165b != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f1167d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    v.clearAnimation();
                }
                this.f1165b = 1;
                mo1686a(v, this.f1164a + this.f1166c, 175, C3407a.f8574c);
            }
        } else if (i2 < 0 && this.f1165b != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f1167d;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            this.f1165b = 2;
            mo1686a(v, 0, 225, C3407a.f8575d);
        }
    }

    /* renamed from: a */
    public boolean mo658a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f1164a = v.getMeasuredHeight() + ((MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }

    /* renamed from: a */
    public boolean mo665a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }
}
