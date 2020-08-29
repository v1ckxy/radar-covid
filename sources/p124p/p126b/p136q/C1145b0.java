package p124p.p126b.p136q;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Field;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p130m.p131a.C1083c;
import p124p.p150h.p154f.p155k.C1345a;

@SuppressLint({"RestrictedAPI"})
/* renamed from: p.b.q.b0 */
public class C1145b0 {

    /* renamed from: a */
    public static final int[] f3195a = {16842912};

    /* renamed from: b */
    public static final int[] f3196b = new int[0];

    /* renamed from: c */
    public static final Rect f3197c = new Rect();

    /* renamed from: d */
    public static Class<?> f3198d;

    static {
        try {
            f3198d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public static Mode m2889a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static boolean m2890a(Drawable drawable) {
        Drawable drawable2;
        if (drawable instanceof DrawableContainer) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainerState) {
                for (Drawable a : ((DrawableContainerState) constantState).getChildren()) {
                    if (!m2890a(a)) {
                        return false;
                    }
                }
            }
        } else {
            if (drawable instanceof C1345a) {
                drawable2 = ((C1345a) drawable).mo5812a();
            } else if (drawable instanceof C1083c) {
                return m2890a(((C1083c) drawable).f2912e);
            } else {
                if (drawable instanceof ScaleDrawable) {
                    drawable2 = ((ScaleDrawable) drawable).getDrawable();
                }
            }
            return m2890a(drawable2);
        }
        return true;
    }

    /* renamed from: b */
    public static void m2891b(Drawable drawable) {
    }

    /* renamed from: c */
    public static Rect m2892c(Drawable drawable) {
        Field[] fields;
        if (VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f3198d != null) {
            try {
                Drawable a = C1061o.m2456a(drawable);
                Object invoke = a.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(a, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f3198d.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f3197c;
    }
}
