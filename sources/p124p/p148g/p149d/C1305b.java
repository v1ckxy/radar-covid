package p124p.p148g.p149d;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: p.g.d.b */
public class C1305b {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f3935a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f3936b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m3354a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        Matrix matrix = (Matrix) f3935a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f3935a.set(matrix);
        } else {
            matrix.reset();
        }
        m3355a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f3936b.get();
        if (rectF == null) {
            rectF = new RectF();
            f3936b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    public static void m3355a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m3355a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
