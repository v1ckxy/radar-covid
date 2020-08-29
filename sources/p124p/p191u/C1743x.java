package p124p.p191u;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: p.u.x */
public class C1743x extends C1742w {

    /* renamed from: d */
    public static boolean f5082d = true;

    /* renamed from: e */
    public static boolean f5083e = true;

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo6512a(View view, Matrix matrix) {
        if (f5082d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f5082d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public void mo6514b(View view, Matrix matrix) {
        if (f5083e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f5083e = false;
            }
        }
    }
}
