package p213q.p217b.p218a.p271c.p283m;

import android.animation.TypeEvaluator;

/* renamed from: q.b.a.c.m.b */
public class C3408b implements TypeEvaluator<Integer> {

    /* renamed from: a */
    public static final C3408b f8577a = new C3408b();

    public Object evaluate(float f, Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        int intValue = ((Integer) obj).intValue();
        float f2 = ((float) ((intValue >> 24) & 255)) / 255.0f;
        float f3 = ((float) ((intValue >> 16) & 255)) / 255.0f;
        float f4 = ((float) ((intValue >> 8) & 255)) / 255.0f;
        float f5 = ((float) (intValue & 255)) / 255.0f;
        int intValue2 = num.intValue();
        float f6 = ((float) ((intValue2 >> 24) & 255)) / 255.0f;
        float f7 = ((float) ((intValue2 >> 16) & 255)) / 255.0f;
        float f8 = ((float) ((intValue2 >> 8) & 255)) / 255.0f;
        float pow = (float) Math.pow((double) f3, 2.2d);
        float pow2 = (float) Math.pow((double) f4, 2.2d);
        float pow3 = (float) Math.pow((double) f5, 2.2d);
        float pow4 = ((((float) Math.pow((double) f8, 2.2d)) - pow2) * f) + pow2;
        float pow5 = ((((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d)) - pow3) * f) + pow3;
        float f9 = (((f6 - f2) * f) + f2) * 255.0f;
        return Integer.valueOf((Math.round(((float) Math.pow((double) (((((float) Math.pow((double) f7, 2.2d)) - pow) * f) + pow), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f9) << 24) | (Math.round(((float) Math.pow((double) pow4, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) pow5, 0.45454545454545453d)) * 255.0f));
    }
}
