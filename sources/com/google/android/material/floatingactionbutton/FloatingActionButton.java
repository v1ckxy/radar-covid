package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0068c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0069d;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p136q.C1178i;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p271c.C3276a;
import p213q.p217b.p218a.p271c.C3318d;
import p213q.p217b.p218a.p271c.C3406l;
import p213q.p217b.p218a.p271c.p272a0.C3278b;
import p213q.p217b.p218a.p271c.p272a0.C3279c;
import p213q.p217b.p218a.p271c.p272a0.C3280d;
import p213q.p217b.p218a.p271c.p272a0.C3281e;
import p213q.p217b.p218a.p271c.p272a0.C3281e.C3286e;
import p213q.p217b.p218a.p271c.p272a0.C3291g;
import p213q.p217b.p218a.p271c.p272a0.C3292h;
import p213q.p217b.p218a.p271c.p273b0.C3297c;
import p213q.p217b.p218a.p271c.p273b0.C3315o;
import p213q.p217b.p218a.p271c.p277f0.C3329b;
import p213q.p217b.p218a.p271c.p278g0.C3342j;
import p213q.p217b.p218a.p271c.p278g0.C3355n;
import p213q.p217b.p218a.p271c.p280i0.C3367a;
import p213q.p217b.p218a.p271c.p283m.C3413g;
import p213q.p217b.p218a.p271c.p283m.C3416j;
import p213q.p217b.p218a.p271c.p297z.C3496a;

@C0069d(Behavior.class)
public class FloatingActionButton extends C3315o implements C3496a, C3355n {

    /* renamed from: f */
    public ColorStateList f1319f;

    /* renamed from: g */
    public Mode f1320g;

    /* renamed from: h */
    public ColorStateList f1321h;

    /* renamed from: i */
    public Mode f1322i;

    /* renamed from: j */
    public ColorStateList f1323j;

    /* renamed from: k */
    public int f1324k;

    /* renamed from: l */
    public int f1325l;

    /* renamed from: m */
    public int f1326m;

    /* renamed from: n */
    public boolean f1327n;

    /* renamed from: o */
    public final Rect f1328o;

    /* renamed from: p */
    public C3281e f1329p;

    public static class BaseBehavior<T extends FloatingActionButton> extends C0068c<T> {

        /* renamed from: a */
        public Rect f1330a;

        /* renamed from: b */
        public boolean f1331b;

        public BaseBehavior() {
            this.f1331b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3406l.FloatingActionButton_Behavior_Layout);
            this.f1331b = obtainStyledAttributes.getBoolean(C3406l.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo652a(C0071f fVar) {
            if (fVar.f526h == 0) {
                fVar.f526h = 80;
            }
        }

        /* renamed from: a */
        public boolean mo660a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f1328o;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public final boolean mo2132a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!mo2131a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f1330a == null) {
                this.f1330a = new Rect();
            }
            Rect rect = this.f1330a;
            C3297c.m7673a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo2058a((C0237a) null, false);
            } else {
                floatingActionButton.mo2063b(null, false);
            }
            return true;
        }

        /* renamed from: b */
        public final boolean mo2133b(View view, FloatingActionButton floatingActionButton) {
            if (!mo2131a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((C0071f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo2058a((C0237a) null, false);
            } else {
                floatingActionButton.mo2063b(null, false);
            }
            return true;
        }

        /* renamed from: b */
        public boolean mo668b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                mo2132a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof C0071f ? ((C0071f) layoutParams).f519a instanceof BottomSheetBehavior : false) {
                    mo2133b(view2, floatingActionButton);
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo658a(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List a = coordinatorLayout.mo595a((View) floatingActionButton);
            int size = a.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) a.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof C0071f ? ((C0071f) layoutParams).f519a instanceof BottomSheetBehavior : false) && mo2133b(view2, floatingActionButton)) {
                        break;
                    }
                } else if (mo2132a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo607b(floatingActionButton, i);
            Rect rect = floatingActionButton.f1328o;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0071f fVar = (C0071f) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    C1404o.m3539c(floatingActionButton, i2);
                }
                if (i4 != 0) {
                    C1404o.m3535b((View) floatingActionButton, i4);
                }
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo2131a(View view, FloatingActionButton floatingActionButton) {
            C0071f fVar = (C0071f) floatingActionButton.getLayoutParams();
            if (this.f1331b && fVar.f524f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class C0237a {
        /* renamed from: a */
        public void mo2134a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo2135b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public class C0238b implements C3329b {
        public C0238b() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C0239c<T extends FloatingActionButton> implements C3286e {

        /* renamed from: a */
        public final C3416j<T> f1333a;

        public C0239c(C3416j<T> jVar) {
            this.f1333a = jVar;
        }

        /* renamed from: a */
        public void mo2136a() {
            this.f1333a.mo9198a(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo2137b() {
            this.f1333a.mo9199b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0239c) && ((C0239c) obj).f1333a.equals(this.f1333a);
        }

        public int hashCode() {
            return this.f1333a.hashCode();
        }
    }

    /* renamed from: a */
    public static int m1058a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private C3281e getImpl() {
        if (this.f1329p == null) {
            this.f1329p = new C3292h(this, new C0238b());
        }
        return this.f1329p;
    }

    /* renamed from: a */
    public final int mo2056a(int i) {
        int i2 = this.f1325l;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return resources.getDimensionPixelSize(i != 1 ? C3318d.design_fab_size_normal : C3318d.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? mo2056a(1) : mo2056a(0);
    }

    /* renamed from: a */
    public void mo2057a(AnimatorListener animatorListener) {
        C3281e impl = getImpl();
        if (impl.f8208r == null) {
            impl.f8208r = new ArrayList<>();
        }
        impl.f8208r.add(animatorListener);
    }

    /* renamed from: a */
    public boolean mo2060a() {
        throw null;
    }

    /* renamed from: b */
    public void mo2062b(AnimatorListener animatorListener) {
        C3281e impl = getImpl();
        if (impl.f8207q == null) {
            impl.f8207q = new ArrayList<>();
        }
        impl.f8207q.add(animatorListener);
    }

    /* renamed from: b */
    public boolean mo2064b() {
        return getImpl().mo8967b();
    }

    /* renamed from: c */
    public boolean mo2065c() {
        return getImpl().mo8968c();
    }

    /* renamed from: d */
    public final void mo2066d() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f1321h;
            if (colorStateList == null) {
                drawable.clearColorFilter();
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            Mode mode = this.f1322i;
            if (mode == null) {
                mode = Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C1178i.m2950a(colorForState, mode));
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo8966a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f1319f;
    }

    public Mode getBackgroundTintMode() {
        return this.f1320g;
    }

    public float getCompatElevation() {
        return getImpl().mo8959a();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f8196f;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f8197g;
    }

    public Drawable getContentBackground() {
        if (getImpl() != null) {
            return null;
        }
        throw null;
    }

    public int getCustomSize() {
        return this.f1325l;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public C3413g getHideMotionSpec() {
        return getImpl().f8203m;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f1323j;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f1323j;
    }

    public C3342j getShapeAppearanceModel() {
        C3342j jVar = getImpl().f8191a;
        C1061o.m2464a(jVar);
        return jVar;
    }

    public C3413g getShowMotionSpec() {
        return getImpl().f8202l;
    }

    public int getSize() {
        return this.f1324k;
    }

    public int getSizeDimension() {
        return mo2056a(this.f1324k);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f1321h;
    }

    public Mode getSupportImageTintMode() {
        return this.f1322i;
    }

    public boolean getUseCompatPadding() {
        return this.f1327n;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo8969d();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3281e impl = getImpl();
        if (impl.mo8973h()) {
            ViewTreeObserver viewTreeObserver = impl.f8210t.getViewTreeObserver();
            if (impl.f8216z == null) {
                impl.f8216z = new C3291g(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f8216z);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3281e impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f8210t.getViewTreeObserver();
        OnPreDrawListener onPreDrawListener = impl.f8216z;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.f8216z = null;
        }
    }

    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f1326m = (sizeDimension + 0) / 2;
        getImpl().mo8978m();
        Math.min(m1058a(sizeDimension, i), m1058a(sizeDimension, i2));
        throw null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3367a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3367a aVar = (C3367a) parcelable;
        super.onRestoreInstanceState(aVar.f4274e);
        Object orDefault = aVar.f8478g.getOrDefault("expandableWidgetHelper", null);
        C1061o.m2464a(orDefault);
        Bundle bundle = (Bundle) orDefault;
        throw null;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new C3367a(onSaveInstanceState);
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            mo2061a((Rect) null);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1319f != colorStateList) {
            this.f1319f = colorStateList;
            if (getImpl() == null) {
                throw null;
            }
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.f1320g != mode) {
            this.f1320g = mode;
            if (getImpl() == null) {
                throw null;
            }
        }
    }

    public void setCompatElevation(float f) {
        C3281e impl = getImpl();
        if (impl.f8195e != f) {
            impl.f8195e = f;
            impl.mo8963a(f, impl.f8196f, impl.f8197g);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C3281e impl = getImpl();
        if (impl.f8196f != f) {
            impl.f8196f = f;
            impl.mo8963a(impl.f8195e, f, impl.f8197g);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C3281e impl = getImpl();
        if (impl.f8197g != f) {
            impl.f8197g = f;
            impl.mo8963a(impl.f8195e, impl.f8196f, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f1325l) {
            this.f1325l = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (getImpl() == null) {
            throw null;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f8193c) {
            getImpl().f8193c = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(C3413g gVar) {
        getImpl().f8203m = gVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C3413g.m7807a(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C3281e impl = getImpl();
            impl.mo8962a(impl.f8205o);
            if (this.f1321h != null) {
                mo2066d();
            }
        }
    }

    public void setImageResource(int i) {
        throw null;
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f1323j != colorStateList) {
            this.f1323j = colorStateList;
            getImpl().mo8964a(this.f1323j);
        }
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo8971f();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo8971f();
    }

    public void setShadowPaddingEnabled(boolean z) {
        C3281e impl = getImpl();
        impl.f8194d = z;
        impl.mo8978m();
    }

    public void setShapeAppearanceModel(C3342j jVar) {
        getImpl().f8191a = jVar;
    }

    public void setShowMotionSpec(C3413g gVar) {
        getImpl().f8202l = gVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C3413g.m7807a(getContext(), i));
    }

    public void setSize(int i) {
        this.f1325l = 0;
        if (i != this.f1324k) {
            this.f1324k = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f1321h != colorStateList) {
            this.f1321h = colorStateList;
            mo2066d();
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f1322i != mode) {
            this.f1322i = mode;
            mo2066d();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo8972g();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo8972g();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo8972g();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1327n != z) {
            this.f1327n = z;
            getImpl().mo8970e();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: a */
    public void mo2059a(C3416j<? extends FloatingActionButton> jVar) {
        C3281e impl = getImpl();
        C0239c cVar = new C0239c(jVar);
        if (impl.f8209s == null) {
            impl.f8209s = new ArrayList<>();
        }
        impl.f8209s.add(cVar);
    }

    /* renamed from: b */
    public void mo2063b(C0237a aVar, boolean z) {
        C3281e impl = getImpl();
        C3278b bVar = aVar == null ? null : new C3278b(this, aVar);
        if (!impl.mo8968c()) {
            Animator animator = impl.f8201k;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.mo8975j()) {
                if (impl.f8210t.getVisibility() != 0) {
                    impl.f8210t.setAlpha(0.0f);
                    impl.f8210t.setScaleY(0.0f);
                    impl.f8210t.setScaleX(0.0f);
                    impl.mo8962a(0.0f);
                }
                C3413g gVar = impl.f8202l;
                if (gVar == null) {
                    if (impl.f8199i == null) {
                        impl.f8199i = C3413g.m7807a(impl.f8210t.getContext(), C3276a.design_fab_show_motion_spec);
                    }
                    gVar = impl.f8199i;
                    C1061o.m2464a(gVar);
                }
                AnimatorSet a = impl.mo8960a(gVar, 1.0f, 1.0f, 1.0f);
                a.addListener(new C3280d(impl, z, bVar));
                ArrayList<AnimatorListener> arrayList = impl.f8207q;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener((AnimatorListener) it.next());
                    }
                }
                a.start();
                return;
            }
            impl.f8210t.mo9040a(0, z);
            impl.f8210t.setAlpha(1.0f);
            impl.f8210t.setScaleY(1.0f);
            impl.f8210t.setScaleX(1.0f);
            impl.mo8962a(1.0f);
            if (bVar != null) {
                bVar.f8175a.mo2135b(bVar.f8176b);
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo2061a(Rect rect) {
        if (!C1404o.m3563x(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        throw null;
    }

    /* renamed from: a */
    public void mo2058a(C0237a aVar, boolean z) {
        C3281e impl = getImpl();
        C3278b bVar = aVar == null ? null : new C3278b(this, aVar);
        if (!impl.mo8967b()) {
            Animator animator = impl.f8201k;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.mo8975j()) {
                C3413g gVar = impl.f8203m;
                if (gVar == null) {
                    if (impl.f8200j == null) {
                        impl.f8200j = C3413g.m7807a(impl.f8210t.getContext(), C3276a.design_fab_hide_motion_spec);
                    }
                    gVar = impl.f8200j;
                    C1061o.m2464a(gVar);
                }
                AnimatorSet a = impl.mo8960a(gVar, 0.0f, 0.0f, 0.0f);
                a.addListener(new C3279c(impl, z, bVar));
                ArrayList<AnimatorListener> arrayList = impl.f8208r;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener((AnimatorListener) it.next());
                    }
                }
                a.start();
                return;
            }
            impl.f8210t.mo9040a(z ? 8 : 4, z);
            if (bVar != null) {
                bVar.f8175a.mo2134a(bVar.f8176b);
            }
        }
    }
}
