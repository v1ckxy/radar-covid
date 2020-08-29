package p213q.p217b.p218a.p271c.p279h0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p271c.C3406l;
import p213q.p217b.p218a.p271c.p273b0.C3310j;

/* renamed from: q.b.a.c.h0.d */
public class C3360d extends FrameLayout {

    /* renamed from: j */
    public static final OnTouchListener f8467j = new C3361a();

    /* renamed from: e */
    public C3359c f8468e;

    /* renamed from: f */
    public C3358b f8469f;

    /* renamed from: g */
    public int f8470g;

    /* renamed from: h */
    public final float f8471h;

    /* renamed from: i */
    public final float f8472i;

    /* renamed from: q.b.a.c.h0.d$a */
    public static class C3361a implements OnTouchListener {
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public C3360d(Context context) {
        this(context, null);
    }

    public C3360d(Context context, AttributeSet attributeSet) {
        super(C3310j.m7690b(context, attributeSet, 0, 0), attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3406l.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(C3406l.SnackbarLayout_elevation)) {
            C1404o.m3514a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C3406l.SnackbarLayout_elevation, 0));
        }
        this.f8470g = obtainStyledAttributes.getInt(C3406l.SnackbarLayout_animationMode, 0);
        this.f8471h = obtainStyledAttributes.getFloat(C3406l.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        this.f8472i = obtainStyledAttributes.getFloat(C3406l.SnackbarLayout_actionTextColorAlpha, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f8467j);
        setFocusable(true);
    }

    public float getActionTextColorAlpha() {
        return this.f8472i;
    }

    public int getAnimationMode() {
        return this.f8470g;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f8471h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3358b bVar = this.f8469f;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        C1404o.m3508C(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3358b bVar = this.f8469f;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C3359c cVar = this.f8468e;
        if (cVar != null) {
            cVar.mo9117a(this, i, i2, i3, i4);
        }
    }

    public void setAnimationMode(int i) {
        this.f8470g = i;
    }

    public void setOnAttachStateChangeListener(C3358b bVar) {
        this.f8469f = bVar;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f8467j);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(C3359c cVar) {
        this.f8468e = cVar;
    }
}
