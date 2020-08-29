package p124p.p150h.p154f;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: p.h.f.h */
public class C1342h extends C1341g {
    /* renamed from: b */
    public Typeface mo5805b(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4052g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4058m.invoke(null, new Object[]{newInstance, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public Method mo5808c(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
