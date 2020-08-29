package p124p.p177n;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p124p.p177n.C1537e.C1538a;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.n.a */
public class C1531a {

    /* renamed from: c */
    public static C1531a f4545c = new C1531a();

    /* renamed from: a */
    public final Map<Class, C1532a> f4546a = new HashMap();

    /* renamed from: b */
    public final Map<Class, Boolean> f4547b = new HashMap();

    /* renamed from: p.n.a$a */
    public static class C1532a {

        /* renamed from: a */
        public final Map<C1538a, List<C1533b>> f4548a = new HashMap();

        /* renamed from: b */
        public final Map<C1533b, C1538a> f4549b;

        public C1532a(Map<C1533b, C1538a> map) {
            this.f4549b = map;
            for (Entry entry : map.entrySet()) {
                C1538a aVar = (C1538a) entry.getValue();
                List list = (List) this.f4548a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f4548a.put(aVar, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: a */
        public static void m3916a(List<C1533b> list, C1542h hVar, C1538a aVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    C1533b bVar = (C1533b) list.get(size);
                    if (bVar != null) {
                        try {
                            int i = bVar.f4550a;
                            if (i == 0) {
                                bVar.f4551b.invoke(obj, new Object[0]);
                            } else if (i == 1) {
                                bVar.f4551b.invoke(obj, new Object[]{hVar});
                            } else if (i == 2) {
                                bVar.f4551b.invoke(obj, new Object[]{hVar, aVar});
                            }
                            size--;
                        } catch (InvocationTargetException e) {
                            throw new RuntimeException("Failed to call observer method", e.getCause());
                        } catch (IllegalAccessException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: p.n.a$b */
    public static class C1533b {

        /* renamed from: a */
        public final int f4550a;

        /* renamed from: b */
        public final Method f4551b;

        public C1533b(int i, Method method) {
            this.f4550a = i;
            this.f4551b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C1533b.class != obj.getClass()) {
                return false;
            }
            C1533b bVar = (C1533b) obj;
            if (this.f4550a != bVar.f4550a || !this.f4551b.getName().equals(bVar.f4551b.getName())) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return this.f4551b.getName().hashCode() + (this.f4550a * 31);
        }
    }

    /* renamed from: a */
    public C1532a mo6215a(Class cls) {
        C1532a aVar = (C1532a) this.f4546a.get(cls);
        return aVar != null ? aVar : mo6216a(cls, null);
    }

    /* renamed from: a */
    public final C1532a mo6216a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C1532a a = mo6215a(superclass);
            if (a != null) {
                hashMap.putAll(a.f4549b);
            }
        }
        for (Class a2 : cls.getInterfaces()) {
            for (Entry entry : mo6215a(a2).f4549b.entrySet()) {
                mo6217a(hashMap, (C1533b) entry.getKey(), (C1538a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            C1551p pVar = (C1551p) method.getAnnotation(C1551p.class);
            if (pVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C1542h.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C1538a value = pVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C1538a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C1538a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    mo6217a(hashMap, new C1533b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1532a aVar = new C1532a(hashMap);
        this.f4546a.put(cls, aVar);
        this.f4547b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: a */
    public final void mo6217a(Map<C1533b, C1538a> map, C1533b bVar, C1538a aVar, Class cls) {
        C1538a aVar2 = (C1538a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f4551b;
            StringBuilder a = C1965a.m4756a("Method ");
            a.append(method.getName());
            a.append(" in ");
            a.append(cls.getName());
            a.append(" already declared with different @OnLifecycleEvent value: previous value ");
            a.append(aVar2);
            a.append(", new value ");
            a.append(aVar);
            throw new IllegalArgumentException(a.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }
}
