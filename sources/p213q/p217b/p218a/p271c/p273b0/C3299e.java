package p213q.p217b.p218a.p271c.p273b0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p124p.p126b.p136q.C1167f0;
import p213q.p217b.p218a.p271c.C3406l;

/* renamed from: q.b.a.c.b0.e */
public class C3299e extends C1167f0 {

    /* renamed from: t */
    public Drawable f8279t;

    /* renamed from: u */
    public final Rect f8280u;

    /* renamed from: v */
    public final Rect f8281v;

    /* renamed from: w */
    public int f8282w;

    /* renamed from: x */
    public boolean f8283x;

    /* renamed from: y */
    public boolean f8284y;

    public C3299e(Context context) {
        this(context, null);
    }

    public C3299e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3299e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8280u = new Rect();
        this.f8281v = new Rect();
        this.f8282w = 119;
        this.f8283x = true;
        this.f8284y = false;
        TypedArray b = C3310j.m7691b(context, attributeSet, C3406l.ForegroundLinearLayout, i, 0, new int[0]);
        this.f8282w = b.getInt(C3406l.ForegroundLinearLayout_android_foregroundGravity, this.f8282w);
        Drawable drawable = b.getDrawable(C3406l.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f8283x = b.getBoolean(C3406l.ForegroundLinearLayout_foregroundInsidePadding, true);
        b.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f8279t;
        if (drawable != null) {
            if (this.f8284y) {
                this.f8284y = false;
                Rect rect = this.f8280u;
                Rect rect2 = this.f8281v;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f8283x) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f8282w, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f8279t;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8279t;
        if (drawable != null && drawable.isStateful()) {
            this.f8279t.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f8279t;
    }

    public int getForegroundGravity() {
        return this.f8282w;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8279t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f8284y = z | this.f8284y;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8284y = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f8279t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f8279t);
            }
            this.f8279t = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f8282w == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f8282w != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f8282w = i;
            if (i == 119 && this.f8279t != null) {
                this.f8279t.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8279t;
    }
}
