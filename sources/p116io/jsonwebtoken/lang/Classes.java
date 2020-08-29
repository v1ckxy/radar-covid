package p116io.jsonwebtoken.lang;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.lang.Classes */
public final class Classes {
    public static final ClassLoaderAccessor CLASS_CL_ACCESSOR = new ExceptionIgnoringAccessor() {
        public ClassLoader doGetClassLoader() {
            return Classes.class.getClassLoader();
        }
    };
    public static final ClassLoaderAccessor SYSTEM_CL_ACCESSOR = new ExceptionIgnoringAccessor() {
        public ClassLoader doGetClassLoader() {
            return ClassLoader.getSystemClassLoader();
        }
    };
    public static final ClassLoaderAccessor THREAD_CL_ACCESSOR = new ExceptionIgnoringAccessor() {
        public ClassLoader doGetClassLoader() {
            return Thread.currentThread().getContextClassLoader();
        }
    };

    /* renamed from: io.jsonwebtoken.lang.Classes$ClassLoaderAccessor */
    public interface ClassLoaderAccessor {
        InputStream getResourceStream(String str);

        Class loadClass(String str);
    }

    /* renamed from: io.jsonwebtoken.lang.Classes$ExceptionIgnoringAccessor */
    public static abstract class ExceptionIgnoringAccessor implements ClassLoaderAccessor {
        public ExceptionIgnoringAccessor() {
        }

        public abstract ClassLoader doGetClassLoader();

        public final ClassLoader getClassLoader() {
            try {
                return doGetClassLoader();
            } catch (Throwable unused) {
                return null;
            }
        }

        public InputStream getResourceStream(String str) {
            ClassLoader classLoader = getClassLoader();
            if (classLoader != null) {
                return classLoader.getResourceAsStream(str);
            }
            return null;
        }

        public Class loadClass(String str) {
            ClassLoader classLoader = getClassLoader();
            if (classLoader != null) {
                try {
                    return classLoader.loadClass(str);
                } catch (ClassNotFoundException unused) {
                }
            }
            return null;
        }
    }

    public static <T> Class<T> forName(String str) {
        Class<T> loadClass = THREAD_CL_ACCESSOR.loadClass(str);
        if (loadClass == null) {
            loadClass = CLASS_CL_ACCESSOR.loadClass(str);
        }
        if (loadClass == null) {
            loadClass = SYSTEM_CL_ACCESSOR.loadClass(str);
        }
        if (loadClass != null) {
            return loadClass;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to load class named [");
        sb.append(str);
        sb.append("] from the thread context, current, or ");
        sb.append("system/application ClassLoaders.  All heuristics have been exhausted.  Class could not be found.");
        String sb2 = sb.toString();
        if (str != null && str.startsWith("io.jsonwebtoken.impl")) {
            sb2 = C1965a.m4751a(sb2, "  Have you remembered to include the jjwt-impl.jar in your runtime classpath?");
        }
        throw new UnknownClassException(sb2);
    }

    public static <T> Constructor<T> getConstructor(Class<T> cls, Class... clsArr) {
        try {
            return cls.getConstructor(clsArr);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        }
    }

    public static InputStream getResourceAsStream(String str) {
        InputStream resourceStream = THREAD_CL_ACCESSOR.getResourceStream(str);
        if (resourceStream == null) {
            resourceStream = CLASS_CL_ACCESSOR.getResourceStream(str);
        }
        return resourceStream == null ? SYSTEM_CL_ACCESSOR.getResourceStream(str) : resourceStream;
    }

    public static <T> T instantiate(Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to instantiate instance with constructor [");
            sb.append(constructor);
            sb.append("]");
            throw new InstantiationException(sb.toString(), e);
        }
    }

    public static <T> T invokeStatic(String str, String str2, Class[] clsArr, Object... objArr) {
        try {
            Method declaredMethod = forName(str).getDeclaredMethod(str2, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to invoke class method ");
            sb.append(str);
            sb.append("#");
            sb.append(str2);
            sb.append(".  Ensure the necessary ");
            sb.append("implementation is in the runtime classpath.");
            throw new IllegalStateException(sb.toString(), e);
        }
    }

    public static boolean isAvailable(String str) {
        try {
            forName(str);
            return true;
        } catch (UnknownClassException unused) {
            return false;
        }
    }

    public static <T> T newInstance(Class<T> cls) {
        if (cls != null) {
            try {
                return cls.newInstance();
            } catch (Exception e) {
                StringBuilder a = C1965a.m4756a("Unable to instantiate class [");
                a.append(cls.getName());
                a.append("]");
                throw new InstantiationException(a.toString(), e);
            }
        } else {
            throw new IllegalArgumentException("Class method parameter cannot be null.");
        }
    }

    public static <T> T newInstance(Class<T> cls, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return instantiate(getConstructor(cls, clsArr), objArr);
    }

    public static <T> T newInstance(String str) {
        return newInstance(forName(str));
    }

    public static <T> T newInstance(String str, Class[] clsArr, Object... objArr) {
        return instantiate(getConstructor(forName(str), clsArr), objArr);
    }

    public static <T> T newInstance(String str, Object... objArr) {
        return newInstance(forName(str), objArr);
    }
}
