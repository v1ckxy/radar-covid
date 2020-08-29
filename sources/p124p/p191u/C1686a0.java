package p124p.p191u;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: p.u.a0 */
public class C1686a0 extends C1745z {
    /* renamed from: a */
    public void mo6509a(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: a */
    public void mo6510a(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: a */
    public void mo6511a(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo6512a(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: b */
    public float mo6513b(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: b */
    public void mo6514b(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
