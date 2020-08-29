package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import p124p.p126b.p136q.C1218w;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.C3406l;

public class MaterialTextView extends C1218w {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        boolean z = true;
        if (C2286e.m5261a(context, C3294b.textAppearanceLineHeightEnabled, true)) {
            Theme theme = context.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C3406l.MaterialTextView, i, i2);
            int a = m1117a(context, obtainStyledAttributes, C3406l.MaterialTextView_android_lineHeight, C3406l.MaterialTextView_lineHeight);
            obtainStyledAttributes.recycle();
            if (a == -1) {
                z = false;
            }
            if (!z) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, C3406l.MaterialTextView, i, i2);
                int resourceId = obtainStyledAttributes2.getResourceId(C3406l.MaterialTextView_android_textAppearance, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    mo2315a(theme, resourceId);
                }
            }
        }
    }

    /* renamed from: a */
    public static int m1117a(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i3, typedValue) || typedValue.type != 2) {
                i = typedArray.getDimensionPixelSize(i3, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo2315a(Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C3406l.MaterialTextAppearance);
        int a = m1117a(getContext(), obtainStyledAttributes, C3406l.MaterialTextAppearance_android_lineHeight, C3406l.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            setLineHeight(a);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (C2286e.m5261a(context, C3294b.textAppearanceLineHeightEnabled, true)) {
            mo2315a(context.getTheme(), i);
        }
    }
}
