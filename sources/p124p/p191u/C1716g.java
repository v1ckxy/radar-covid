package p124p.p191u;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: p.u.g */
public class C1716g implements TypeEvaluator<Rect> {
    public Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        int i = rect.left;
        int i2 = i + ((int) (((float) (rect2.left - i)) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) (((float) (rect2.top - i3)) * f));
        int i5 = rect.right;
        int i6 = i5 + ((int) (((float) (rect2.right - i5)) * f));
        int i7 = rect.bottom;
        return new Rect(i2, i4, i6, i7 + ((int) (((float) (rect2.bottom - i7)) * f)));
    }
}
