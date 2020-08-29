package p213q.p217b.p218a.p271c.p272a0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p213q.p217b.p218a.p271c.p277f0.C3329b;

/* renamed from: q.b.a.c.a0.h */
public class C3292h extends C3281e {
    public C3292h(FloatingActionButton floatingActionButton, C3329b bVar) {
        super(floatingActionButton, bVar);
    }

    /* renamed from: a */
    public float mo8959a() {
        return this.f8210t.getElevation();
    }

    /* renamed from: a */
    public final Animator mo8985a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f8210t, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f8210t, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C3281e.f8184A);
        return animatorSet;
    }

    /* renamed from: a */
    public void mo8963a(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(C3281e.f8185B, mo8985a(f, f3));
        stateListAnimator.addState(C3281e.f8186C, mo8985a(f, f2));
        stateListAnimator.addState(C3281e.f8187D, mo8985a(f, f2));
        stateListAnimator.addState(C3281e.f8188E, mo8985a(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f8210t, "elevation", new float[]{f}).setDuration(0));
        if (VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.f8210t;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f8210t, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C3281e.f8184A);
        stateListAnimator.addState(C3281e.f8189F, animatorSet);
        stateListAnimator.addState(C3281e.f8190G, mo8985a(0.0f, 0.0f));
        this.f8210t.setStateListAnimator(stateListAnimator);
        if (mo8974i()) {
            mo8978m();
        }
    }

    /* renamed from: a */
    public void mo8964a(ColorStateList colorStateList) {
    }

    /* renamed from: a */
    public void mo8965a(Rect rect) {
        if (FloatingActionButton.this.f1327n) {
            super.mo8965a(rect);
            return;
        }
        int i = 0;
        if (!mo8976k()) {
            i = (0 - this.f8210t.getSizeDimension()) / 2;
        }
        rect.set(i, i, i, i);
    }

    /* renamed from: a */
    public void mo8966a(int[] iArr) {
    }

    /* renamed from: d */
    public void mo8969d() {
    }

    /* renamed from: e */
    public void mo8970e() {
        mo8978m();
    }

    /* renamed from: h */
    public boolean mo8973h() {
        return false;
    }

    /* renamed from: i */
    public boolean mo8974i() {
        return FloatingActionButton.this.f1327n || !mo8976k();
    }

    /* renamed from: l */
    public void mo8977l() {
    }
}
