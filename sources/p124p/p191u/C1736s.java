package p124p.p191u;

import android.os.Build.VERSION;
import android.view.ViewGroup;

/* renamed from: p.u.s */
public class C1736s {

    /* renamed from: a */
    public static boolean f5077a = true;

    /* renamed from: a */
    public static void m4373a(ViewGroup viewGroup, boolean z) {
        if (VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f5077a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f5077a = false;
            }
        }
    }
}
