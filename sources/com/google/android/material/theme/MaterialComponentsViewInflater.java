package com.google.android.material.theme;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p124p.p126b.p136q.C1166f;
import p124p.p126b.p136q.C1204q;
import p124p.p126b.p136q.C1218w;
import p213q.p217b.p218a.p271c.p274c0.C3317a;
import p213q.p217b.p218a.p271c.p291u.C3448a;

@Keep
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    public static int floatingToolbarItemBackgroundResId = -1;

    public C1166f createButton(Context context, AttributeSet attributeSet) {
        return shouldInflateAppCompatButton(context, attributeSet) ? new C1166f(context, attributeSet) : new MaterialButton(context, attributeSet);
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new C3448a(context, attributeSet);
    }

    public C1204q createRadioButton(Context context, AttributeSet attributeSet) {
        return new C3317a(context, attributeSet);
    }

    public C1218w createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    public boolean shouldInflateAppCompatButton(Context context, AttributeSet attributeSet) {
        int i = VERSION.SDK_INT;
        if (i != 23 && i != 24 && i != 25) {
            return false;
        }
        if (floatingToolbarItemBackgroundResId == -1) {
            floatingToolbarItemBackgroundResId = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android");
        }
        int i2 = floatingToolbarItemBackgroundResId;
        if (!(i2 == 0 || i2 == -1)) {
            for (int i3 = 0; i3 < attributeSet.getAttributeCount(); i3++) {
                if (attributeSet.getAttributeNameResource(i3) == 16842964 && floatingToolbarItemBackgroundResId == attributeSet.getAttributeListValue(i3, null, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
