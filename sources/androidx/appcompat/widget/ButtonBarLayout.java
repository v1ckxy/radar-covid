package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.recyclerview.widget.RecyclerView;
import p124p.p126b.C1023f;
import p124p.p126b.C1027j;
import p124p.p150h.p162l.C1404o;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: e */
    public boolean f230e;

    /* renamed from: f */
    public int f231f = -1;

    /* renamed from: g */
    public int f232g = 0;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1027j.ButtonBarLayout);
        if (VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C1027j.ButtonBarLayout, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.f230e = obtainStyledAttributes.getBoolean(C1027j.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C1023f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* renamed from: a */
    public final int mo279a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public final boolean mo280a() {
        return getOrientation() == 1;
    }

    public int getMinimumHeight() {
        return Math.max(this.f232g, super.getMinimumHeight());
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f230e) {
            if (size > this.f231f && mo280a()) {
                setStacked(false);
            }
            this.f231f = size;
        }
        if (mo280a() || MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = MeasureSpec.makeMeasureSpec(size, RecyclerView.UNDEFINED_DURATION);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f230e && !mo280a()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = mo279a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (mo280a()) {
                int a2 = mo279a(a + 1);
                i4 = a2 >= 0 ? getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i4 = getPaddingBottom() + measuredHeight;
            }
        }
        if (C1404o.m3552m(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f230e != z) {
            this.f230e = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
