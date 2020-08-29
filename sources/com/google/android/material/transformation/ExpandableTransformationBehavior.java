package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f1438b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    public class C0254a extends AnimatorListenerAdapter {
        public C0254a() {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f1438b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo2318a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f1438b != null;
        if (z3) {
            this.f1438b.cancel();
        }
        AnimatorSet b = mo2321b(view, view2, z, z3);
        this.f1438b = b;
        b.addListener(new C0254a());
        this.f1438b.start();
        if (!z2) {
            this.f1438b.end();
        }
        return true;
    }

    /* renamed from: b */
    public abstract AnimatorSet mo2321b(View view, View view2, boolean z, boolean z2);
}
