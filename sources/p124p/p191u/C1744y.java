package p124p.p191u;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: p.u.y */
public class C1744y extends C1743x {

    /* renamed from: f */
    public static boolean f5084f = true;

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo6511a(View view, int i, int i2, int i3, int i4) {
        if (f5084f) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f5084f = false;
            }
        }
    }
}
