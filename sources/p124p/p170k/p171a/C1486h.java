package p124p.p170k.p171a;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment.C0084c;
import java.lang.reflect.InvocationTargetException;
import p124p.p143e.C1261h;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.k.a.h */
public class C1486h {

    /* renamed from: a */
    public static final C1261h<String, Class<?>> f4360a = new C1261h<>();

    /* renamed from: b */
    public static boolean m3770b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m3771c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static Class<?> m3771c(ClassLoader classLoader, String str) {
        Class<?> cls = (Class) f4360a.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f4360a.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m3772d(ClassLoader classLoader, String str) {
        String str2 = "Unable to instantiate fragment ";
        try {
            return m3771c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new C0084c(C1965a.m4752a(str2, str, ": make sure class name exists"), e);
        } catch (ClassCastException e2) {
            throw new C0084c(C1965a.m4752a(str2, str, ": make sure class is a valid subclass of Fragment"), e2);
        }
    }

    /* renamed from: a */
    public Fragment mo6086a(ClassLoader classLoader, String str) {
        String str2 = ": make sure class name exists, is public, and has an empty constructor that is public";
        String str3 = "Unable to instantiate fragment ";
        try {
            return (Fragment) m3772d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            throw new C0084c(C1965a.m4752a(str3, str, str2), e);
        } catch (IllegalAccessException e2) {
            throw new C0084c(C1965a.m4752a(str3, str, str2), e2);
        } catch (NoSuchMethodException e3) {
            throw new C0084c(C1965a.m4752a(str3, str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C0084c(C1965a.m4752a(str3, str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
