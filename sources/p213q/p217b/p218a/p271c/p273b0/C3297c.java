package p213q.p217b.p218a.p271c.p273b0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: q.b.a.c.b0.c */
public class C3297c {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f8274a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f8275b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m7673a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        Matrix matrix = (Matrix) f8274a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f8274a.set(matrix);
        } else {
            matrix.reset();
        }
        m7674a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f8275b.get();
        if (rectF == null) {
            rectF = new RectF();
            f8275b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    public static void m7674a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m7674a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
