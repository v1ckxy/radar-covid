package p124p.p172l.p173a.p174a;

import android.view.animation.Interpolator;

/* renamed from: p.l.a.a.d */
public abstract class C1529d implements Interpolator {

    /* renamed from: a */
    public final float[] f4541a;

    /* renamed from: b */
    public final float f4542b;

    public C1529d(float[] fArr) {
        this.f4541a = fArr;
        this.f4542b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f4541a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = (float) min;
        float f3 = this.f4542b;
        float f4 = (f - (f2 * f3)) / f3;
        float[] fArr2 = this.f4541a;
        return ((fArr2[min + 1] - fArr2[min]) * f4) + fArr2[min];
    }
}
