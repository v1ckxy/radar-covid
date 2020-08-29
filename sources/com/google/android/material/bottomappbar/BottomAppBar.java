package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.C0059e;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0067b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton.C0237a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p124p.p150h.p162l.C1404o;
import p124p.p167j.p168a.C1458a;
import p213q.p217b.p218a.p271c.p286p.C3428a;
import p213q.p217b.p218a.p271c.p286p.C3429b;
import p213q.p217b.p218a.p271c.p286p.C3431c;
import p213q.p217b.p218a.p271c.p286p.C3432d;
import p213q.p217b.p218a.p271c.p286p.C3433e;
import p213q.p217b.p218a.p271c.p286p.C3434f;

public class BottomAppBar extends Toolbar implements C0067b {

    /* renamed from: R */
    public Animator f1184R;

    /* renamed from: S */
    public Animator f1185S;

    /* renamed from: T */
    public int f1186T;

    /* renamed from: U */
    public int f1187U;

    /* renamed from: V */
    public boolean f1188V;

    /* renamed from: W */
    public int f1189W;

    /* renamed from: a0 */
    public boolean f1190a0;

    /* renamed from: b0 */
    public Behavior f1191b0;

    /* renamed from: c0 */
    public AnimatorListenerAdapter f1192c0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        public final Rect f1193e = new Rect();

        /* renamed from: f */
        public WeakReference<BottomAppBar> f1194f;

        /* renamed from: g */
        public int f1195g;

        /* renamed from: h */
        public final OnLayoutChangeListener f1196h = new C0209a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class C0209a implements OnLayoutChangeListener {
            public C0209a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (((BottomAppBar) Behavior.this.f1194f.get()) == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Behavior.this.f1193e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                throw null;
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public boolean mo658a(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f1194f = new WeakReference<>(bottomAppBar);
            View b = bottomAppBar.mo1710i();
            if (b == null || C1404o.m3563x(b)) {
                coordinatorLayout.mo607b(bottomAppBar, i);
                this.f1164a = bottomAppBar.getMeasuredHeight() + ((MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
                return false;
            }
            C0071f fVar = (C0071f) b.getLayoutParams();
            fVar.f522d = 49;
            this.f1195g = fVar.bottomMargin;
            if (b instanceof FloatingActionButton) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) b;
                floatingActionButton.addOnLayoutChangeListener(this.f1196h);
                if (bottomAppBar != null) {
                    floatingActionButton.mo2057a((AnimatorListener) null);
                    floatingActionButton.mo2062b(new C3433e(bottomAppBar));
                    floatingActionButton.mo2059a(null);
                } else {
                    throw null;
                }
            }
            bottomAppBar.mo1712k();
            throw null;
        }

        /* renamed from: a */
        public boolean mo666a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (!bottomAppBar.getHideOnScroll()) {
                return false;
            }
            if (i2 == 0 ? mo665a(coordinatorLayout, bottomAppBar, view2, view3, i) : false) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public static class C0210a extends C1458a {
        public static final Creator<C0210a> CREATOR = new C0211a();

        /* renamed from: g */
        public int f1198g;

        /* renamed from: h */
        public boolean f1199h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a */
        public static class C0211a implements ClassLoaderCreator<C0210a> {
            public Object createFromParcel(Parcel parcel) {
                return new C0210a(parcel, null);
            }

            public Object[] newArray(int i) {
                return new C0210a[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0210a(parcel, classLoader);
            }
        }

        public C0210a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1198g = parcel.readInt();
            this.f1199h = parcel.readInt() != 0;
        }

        public C0210a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4274e, i);
            parcel.writeInt(this.f1198g);
            parcel.writeInt(this.f1199h ? 1 : 0);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m969c(BottomAppBar bottomAppBar) {
        bottomAppBar.f1189W--;
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return mo1701b(this.f1186T);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f8660g;
    }

    private C3434f getTopEdgeTreatment() {
        throw null;
    }

    /* renamed from: a */
    public int mo1700a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = C1404o.m3551l(this) == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof C0059e) && (((C0059e) childAt.getLayoutParams()).f2677a & 8388615) == 8388611) {
                measuredWidth = z2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = measuredWidth - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft());
        if (i != 1 || !z) {
            return 0;
        }
        return right;
    }

    /* renamed from: b */
    public final float mo1701b(int i) {
        int i2 = 1;
        boolean z = C1404o.m3551l(this) == 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - 0;
        if (z) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public Behavior getBehavior() {
        if (this.f1191b0 == null) {
            this.f1191b0 = new Behavior();
        }
        return this.f1191b0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f8660g;
    }

    public int getFabAlignmentMode() {
        return this.f1186T;
    }

    public int getFabAnimationMode() {
        return this.f1187U;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f8659f;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f8658e;
    }

    public boolean getHideOnScroll() {
        return this.f1188V;
    }

    /* renamed from: h */
    public final FloatingActionButton mo1709h() {
        View i = mo1710i();
        if (i instanceof FloatingActionButton) {
            return (FloatingActionButton) i;
        }
        return null;
    }

    /* renamed from: i */
    public final View mo1710i() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).mo604b((View) this)) {
            if (!(view instanceof FloatingActionButton)) {
                if (view instanceof ExtendedFloatingActionButton) {
                }
            }
            return view;
        }
        return null;
    }

    /* renamed from: j */
    public final boolean mo1711j() {
        FloatingActionButton h = mo1709h();
        return h != null && h.mo2065c();
    }

    /* renamed from: k */
    public final void mo1712k() {
        getTopEdgeTreatment().f8661h = getFabTranslationX();
        mo1710i();
        if (this.f1190a0) {
            boolean j = mo1711j();
        }
        throw null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.f1185S;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f1184R;
            if (animator2 != null) {
                animator2.cancel();
            }
            mo1712k();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!mo1711j()) {
                i5 = mo1700a(actionMenuView, 0, false);
            } else {
                i5 = mo1700a(actionMenuView, this.f1186T, this.f1190a0);
            }
            actionMenuView.setTranslationX((float) i5);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0210a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0210a aVar = (C0210a) parcelable;
        super.onRestoreInstanceState(aVar.f4274e);
        this.f1186T = aVar.f1198g;
        this.f1190a0 = aVar.f1199h;
    }

    public Parcelable onSaveInstanceState() {
        C0210a aVar = new C0210a(super.onSaveInstanceState());
        aVar.f1198g = this.f1186T;
        aVar.f1199h = this.f1190a0;
        return aVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().f8660g = f;
            throw null;
        }
    }

    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        if (this.f1186T != i && C1404o.m3563x(this)) {
            Animator animator = this.f1184R;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f1187U == 1) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo1709h(), "translationX", new float[]{mo1701b(i)});
                ofFloat.setDuration(300);
                arrayList.add(ofFloat);
            } else {
                FloatingActionButton h = mo1709h();
                if (h != null && !h.mo2064b()) {
                    this.f1189W++;
                    h.mo2058a((C0237a) new C3429b(this, i), true);
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f1184R = animatorSet;
            animatorSet.addListener(new C3428a(this));
            this.f1184R.start();
        }
        boolean z = this.f1190a0;
        if (C1404o.m3563x(this)) {
            Animator animator2 = this.f1185S;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (!mo1711j()) {
                z = false;
                i2 = 0;
            } else {
                i2 = i;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                String str = "alpha";
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{1.0f});
                if (Math.abs(actionMenuView.getTranslationX() - ((float) mo1700a(actionMenuView, i2, z))) > 1.0f) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{0.0f});
                    ofFloat3.addListener(new C3432d(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(150);
                    animatorSet2.playSequentially(new Animator[]{ofFloat3, ofFloat2});
                    arrayList2.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList2.add(ofFloat2);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.f1185S = animatorSet3;
            animatorSet3.addListener(new C3431c(this));
            this.f1185S.start();
        }
        this.f1186T = i;
    }

    public void setFabAnimationMode(int i) {
        this.f1187U = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().f8659f = f;
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f8658e = f;
            throw null;
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f1188V = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
