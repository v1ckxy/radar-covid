package p213q.p217b.p218a.p271c.p272a0;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* renamed from: q.b.a.c.a0.f */
public class C3290f implements TypeEvaluator<Float> {

    /* renamed from: a */
    public FloatEvaluator f8225a = new FloatEvaluator();

    public C3290f(C3281e eVar) {
    }

    public Object evaluate(float f, Object obj, Object obj2) {
        float floatValue = this.f8225a.evaluate(f, (Float) obj, (Float) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
