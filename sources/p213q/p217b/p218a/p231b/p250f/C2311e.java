package p213q.p217b.p218a.p231b.p250f;

import dalvik.system.PathClassLoader;

/* renamed from: q.b.a.b.f.e */
public final class C2311e extends PathClassLoader {
    public C2311e(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    public final Class<?> loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
