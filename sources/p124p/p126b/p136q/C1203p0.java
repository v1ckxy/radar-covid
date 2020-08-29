package p124p.p126b.p136q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p150h.p154f.C1335a;

/* renamed from: p.b.q.p0 */
public class C1203p0 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f3400a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f3401b = {-16842910};

    /* renamed from: c */
    public static final int[] f3402c = {16842908};

    /* renamed from: d */
    public static final int[] f3403d = {16842919};

    /* renamed from: e */
    public static final int[] f3404e = {16842912};

    /* renamed from: f */
    public static final int[] f3405f = new int[0];

    /* renamed from: g */
    public static final int[] f3406g = new int[1];

    /* renamed from: a */
    public static int m3004a(Context context, int i) {
        ColorStateList c = m3006c(context, i);
        if (c != null && c.isStateful()) {
            return c.getColorForState(f3401b, c.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) f3400a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f3400a.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int b = m3005b(context, i);
        return C1335a.m3389b(b, Math.round(((float) Color.alpha(b)) * f));
    }

    /* renamed from: b */
    public static int m3005b(Context context, int i) {
        int[] iArr = f3406g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public static ColorStateList m3006c(Context context, int i) {
        ColorStateList colorStateList;
        int[] iArr = f3406g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    colorStateList = C1070a.m2601a(context, resourceId);
                    if (colorStateList != null) {
                        return colorStateList;
                    }
                }
            }
            colorStateList = obtainStyledAttributes.getColorStateList(0);
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
