package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.p283m.C3414h;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final C3414h f1451c = new C3414h(75, 150);

    /* renamed from: d */
    public final C3414h f1452d = new C3414h(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C0257a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f1453a;

        /* renamed from: b */
        public final /* synthetic */ View f1454b;

        public C0257a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f1453a = z;
            this.f1454b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f1453a) {
                this.f1454b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f1453a) {
                this.f1454b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo663a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    /* renamed from: b */
    public AnimatorSet mo2321b(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        C3414h hVar = z ? this.f1451c : this.f1452d;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        hVar.mo9194a(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        C2286e.m5227a(animatorSet, (List<Animator>) arrayList);
        animatorSet.addListener(new C0257a(this, z, view2));
        return animatorSet;
    }

    /* renamed from: b */
    public boolean mo667b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }
}
