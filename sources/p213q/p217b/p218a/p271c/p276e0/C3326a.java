package p213q.p217b.p218a.p271c.p276e0;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.Log;
import p124p.p150h.p154f.C1335a;

/* renamed from: q.b.a.c.e0.a */
public class C3326a {

    /* renamed from: a */
    public static final boolean f8335a = true;

    /* renamed from: b */
    public static final int[] f8336b = {16842919};

    /* renamed from: c */
    public static final int[] f8337c = {16843623, 16842908};

    /* renamed from: d */
    public static final int[] f8338d = {16842908};

    /* renamed from: e */
    public static final int[] f8339e = {16843623};

    /* renamed from: f */
    public static final int[] f8340f = {16842913, 16842919};

    /* renamed from: g */
    public static final int[] f8341g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    public static final int[] f8342h = {16842913, 16842908};

    /* renamed from: i */
    public static final int[] f8343i = {16842913, 16843623};

    /* renamed from: j */
    public static final int[] f8344j = {16842913};

    /* renamed from: k */
    public static final int[] f8345k = {16842910, 16842919};

    /* renamed from: l */
    public static final String f8346l = C3326a.class.getSimpleName();

    /* renamed from: a */
    public static int m7707a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return C1335a.m3389b(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    /* renamed from: a */
    public static ColorStateList m7708a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f8345k, 0)) != 0) {
            Log.w(f8346l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: a */
    public static boolean m7709a(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
