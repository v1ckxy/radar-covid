package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p124p.p126b.p128l.p129a.C1070a;

public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: e */
    public static final int[] f198e = {16842964};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f198e);
        if (obtainStyledAttributes.hasValue(0)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                drawable = C1070a.m2602b(context, resourceId);
                setBackgroundDrawable(drawable);
                obtainStyledAttributes.recycle();
            }
        }
        drawable = obtainStyledAttributes.getDrawable(0);
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }
}
