package p124p.p126b.p136q;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p124p.p126b.C1027j;
import p124p.p126b.p128l.p129a.C1070a;

/* renamed from: p.b.q.o */
public class C1199o extends PopupWindow {
    public C1199o(Context context, AttributeSet attributeSet, int i, int i2) {
        Drawable drawable;
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1027j.PopupWindow, i, i2);
        if (obtainStyledAttributes.hasValue(C1027j.PopupWindow_overlapAnchor)) {
            setOverlapAnchor(obtainStyledAttributes.getBoolean(C1027j.PopupWindow_overlapAnchor, false));
        }
        int i3 = C1027j.PopupWindow_android_popupBackground;
        if (obtainStyledAttributes.hasValue(i3)) {
            int resourceId = obtainStyledAttributes.getResourceId(i3, 0);
            if (resourceId != 0) {
                drawable = C1070a.m2602b(context, resourceId);
                setBackgroundDrawable(drawable);
                obtainStyledAttributes.recycle();
            }
        }
        drawable = obtainStyledAttributes.getDrawable(i3);
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    public void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }
}
