package p213q.p217b.p218a.p271c.p283m;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: q.b.a.c.m.e */
public class C3411e extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f8581a = new Matrix();

    public C3411e() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public Object get(Object obj) {
        this.f8581a.set(((ImageView) obj).getImageMatrix());
        return this.f8581a;
    }

    public void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
