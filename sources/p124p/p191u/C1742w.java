package p124p.p191u;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: p.u.w */
public class C1742w extends C1699b0 {

    /* renamed from: c */
    public static boolean f5081c = true;

    /* renamed from: a */
    public void mo6539a(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo6509a(View view, float f) {
        if (f5081c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f5081c = false;
            }
        }
        view.setAlpha(f);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo6513b(View view) {
        if (f5081c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f5081c = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: c */
    public void mo6540c(View view) {
    }
}
