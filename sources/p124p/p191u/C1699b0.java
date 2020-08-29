package p124p.p191u;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: p.u.b0 */
public class C1699b0 {

    /* renamed from: a */
    public static Field f4980a;

    /* renamed from: b */
    public static boolean f4981b;

    /* renamed from: a */
    public void mo6539a(View view) {
        throw null;
    }

    /* renamed from: a */
    public void mo6509a(View view, float f) {
        throw null;
    }

    /* renamed from: a */
    public void mo6510a(View view, int i) {
        if (!f4981b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f4980a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f4981b = true;
        }
        Field field = f4980a;
        if (field != null) {
            try {
                f4980a.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: a */
    public void mo6511a(View view, int i, int i2, int i3, int i4) {
        throw null;
    }

    /* renamed from: a */
    public void mo6512a(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: b */
    public float mo6513b(View view) {
        throw null;
    }

    /* renamed from: b */
    public void mo6514b(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: c */
    public void mo6540c(View view) {
        throw null;
    }
}
