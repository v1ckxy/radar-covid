package p124p.p177n;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p116io.jsonwebtoken.lang.Objects;
import p116io.jsonwebtoken.lang.Strings;

/* renamed from: p.n.l */
public class C1547l {

    /* renamed from: a */
    public static Map<Class, Integer> f4568a = new HashMap();

    /* renamed from: b */
    public static Map<Class, List<Constructor<? extends C1535c>>> f4569b = new HashMap();

    /* renamed from: a */
    public static int m3940a(Class<?> cls) {
        Constructor constructor;
        Map<Class, List<Constructor<? extends C1535c>>> map;
        boolean z;
        Integer num = (Integer) f4568a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        Class<C1541g> cls2 = C1541g.class;
        int i = 1;
        if (cls.getCanonicalName() != null) {
            List list = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = packageR != null ? packageR.getName() : Objects.EMPTY_STRING;
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String a = m3941a(canonicalName);
                if (!name.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(name);
                    sb.append(Strings.CURRENT_PATH);
                    sb.append(a);
                    a = sb.toString();
                }
                constructor = Class.forName(a).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (constructor != null) {
                map = f4569b;
                list = Collections.singletonList(constructor);
            } else {
                C1531a aVar = C1531a.f4545c;
                Boolean bool = (Boolean) aVar.f4547b.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                aVar.f4547b.put(cls, Boolean.valueOf(false));
                                z = false;
                                break;
                            } else if (((C1551p) declaredMethods[i2].getAnnotation(C1551p.class)) != null) {
                                aVar.mo6216a(cls, declaredMethods);
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && cls2.isAssignableFrom(superclass)) {
                        if (m3940a(superclass) != 1) {
                            list = new ArrayList((Collection) f4569b.get(superclass));
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class cls3 = interfaces[i3];
                            if (cls3 != null && cls2.isAssignableFrom(cls3)) {
                                if (m3940a(cls3) == 1) {
                                    break;
                                }
                                if (list == null) {
                                    list = new ArrayList();
                                }
                                list.addAll((Collection) f4569b.get(cls3));
                            }
                            i3++;
                        } else if (list != null) {
                            map = f4569b;
                        }
                    }
                }
            }
            map.put(cls, list);
            i = 2;
        }
        f4568a.put(cls, Integer.valueOf(i));
        return i;
    }

    /* renamed from: a */
    public static String m3941a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(Strings.CURRENT_PATH, "_"));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    /* renamed from: a */
    public static C1535c m3942a(Constructor<? extends C1535c> constructor, Object obj) {
        try {
            return (C1535c) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    public static C1540f m3943a(Object obj) {
        boolean z = obj instanceof C1540f;
        boolean z2 = obj instanceof C1534b;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C1534b) obj, (C1540f) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C1534b) obj, null);
        }
        if (z) {
            return (C1540f) obj;
        }
        Class cls = obj.getClass();
        if (m3940a(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f4569b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m3942a((Constructor) list.get(0), obj));
        }
        C1535c[] cVarArr = new C1535c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = m3942a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }
}
