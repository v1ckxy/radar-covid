package p124p.p126b.p136q;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p124p.p150h.p162l.C1404o;

/* renamed from: p.b.q.a1 */
public class C1143a1 {

    /* renamed from: a */
    public static Method f3193a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
            f3193a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f3193a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: a */
    public static void m2886a(View view, Rect rect, Rect rect2) {
        Method method = f3193a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: a */
    public static boolean m2887a(View view) {
        return C1404o.m3551l(view) == 1;
    }

    /* renamed from: b */
    public static void m2888b(View view) {
        String str = "Could not invoke makeOptionalFitsSystemWindows";
        String str2 = "ViewUtils";
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (NoSuchMethodException unused) {
            Log.d(str2, "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.d(str2, str, e);
        }
    }
}
