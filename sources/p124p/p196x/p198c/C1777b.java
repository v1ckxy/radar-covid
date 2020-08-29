package p124p.p196x.p198c;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: p.x.c.b */
public final class C1777b {

    /* renamed from: b */
    public static final MarginLayoutParams f5200b;

    /* renamed from: a */
    public LinearLayoutManager f5201a;

    static {
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-1, -1);
        f5200b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C1777b(LinearLayoutManager linearLayoutManager) {
        this.f5201a = linearLayoutManager;
    }

    /* renamed from: a */
    public static boolean m4426a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m4426a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
