package p124p.p141d.p142a;

import android.graphics.drawable.Drawable;

/* renamed from: p.d.a.f */
public class C1247f extends Drawable {

    /* renamed from: a */
    public static final double f3539a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public static float m3132a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f3539a) * ((double) f2)) + ((double) f));
    }

    /* renamed from: b */
    public static float m3133b(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        return (float) (((1.0d - f3539a) * ((double) f2)) + ((double) f3));
    }
}
