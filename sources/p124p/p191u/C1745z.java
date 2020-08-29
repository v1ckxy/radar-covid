package p124p.p191u;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: p.u.z */
public class C1745z extends C1744y {

    /* renamed from: g */
    public static boolean f5085g = true;

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo6510a(View view, int i) {
        if (VERSION.SDK_INT == 28) {
            super.mo6510a(view, i);
        } else if (f5085g) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f5085g = false;
            }
        }
    }
}
