package p213q.p217b.p218a.p271c.p273b0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p271c.C3406l;

/* renamed from: q.b.a.c.b0.d */
public class C3298d extends ViewGroup {

    /* renamed from: e */
    public int f8276e;

    /* renamed from: f */
    public int f8277f;

    /* renamed from: g */
    public boolean f8278g;

    public C3298d(Context context) {
        this(context, null);
    }

    public C3298d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3298d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8278g = false;
        mo9007a(context, attributeSet);
    }

    @TargetApi(21)
    public C3298d(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f8278g = false;
        mo9007a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo9007a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3406l.FlowLayout, 0, 0);
        this.f8276e = obtainStyledAttributes.getDimensionPixelSize(C3406l.FlowLayout_lineSpacing, 0);
        this.f8277f = obtainStyledAttributes.getDimensionPixelSize(C3406l.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public boolean mo1996a() {
        return this.f8278g;
    }

    public int getItemSpacing() {
        return this.f8277f;
    }

    public int getLineSpacing() {
        return this.f8276e;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() != 0) {
            boolean z2 = true;
            if (C1404o.m3551l(this) != 1) {
                z2 = false;
            }
            int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
            int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
            int paddingTop = getPaddingTop();
            int i7 = (i3 - i) - paddingLeft;
            int i8 = paddingRight;
            int i9 = paddingTop;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        i5 = marginLayoutParams.getMarginStart();
                        i6 = marginLayoutParams.getMarginEnd();
                    } else {
                        i6 = 0;
                        i5 = 0;
                    }
                    int measuredWidth = childAt.getMeasuredWidth() + i8 + i5;
                    if (!this.f8278g && measuredWidth > i7) {
                        i9 = this.f8276e + paddingTop;
                        i8 = paddingRight;
                    }
                    int i11 = i8 + i5;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                    int measuredHeight = childAt.getMeasuredHeight() + i9;
                    if (z2) {
                        i11 = i7 - measuredWidth2;
                        measuredWidth2 = (i7 - i8) - i5;
                    }
                    childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                    i8 += childAt.getMeasuredWidth() + i5 + i6 + this.f8277f;
                    paddingTop = measuredHeight;
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i2;
            } else {
                measureChild(childAt, i, i2);
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i5 = marginLayoutParams.rightMargin + 0;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i4 > paddingRight && !mo1996a()) {
                    paddingLeft = getPaddingLeft();
                    i7 = paddingTop + this.f8276e;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i4;
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i4 + i5 + this.f8277f + paddingLeft;
                if (i9 == getChildCount() - 1) {
                    i8 += i5;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i8;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i3 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i3 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i3) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i) {
        this.f8277f = i;
    }

    public void setLineSpacing(int i) {
        this.f8276e = i;
    }

    public void setSingleLine(boolean z) {
        this.f8278g = z;
    }
}
