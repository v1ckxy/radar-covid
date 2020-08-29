package p116io.jsonwebtoken.lang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* renamed from: io.jsonwebtoken.lang.Collections */
public final class Collections {

    /* renamed from: io.jsonwebtoken.lang.Collections$EnumerationIterator */
    public static class EnumerationIterator<E> implements Iterator<E> {
        public Enumeration<E> enumeration;

        public EnumerationIterator(Enumeration<E> enumeration2) {
            this.enumeration = enumeration2;
        }

        public boolean hasNext() {
            return this.enumeration.hasMoreElements();
        }

        public E next() {
            return this.enumeration.nextElement();
        }

        public void remove() {
            throw new UnsupportedOperationException("Not supported");
        }
    }

    public static List arrayToList(Object obj) {
        return Arrays.asList(Objects.toObjectArray(obj));
    }

    public static boolean contains(Enumeration enumeration, Object obj) {
        if (enumeration != null) {
            while (enumeration.hasMoreElements()) {
                if (Objects.nullSafeEquals(enumeration.nextElement(), obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean contains(Iterator it, Object obj) {
        if (it != null) {
            while (it.hasNext()) {
                if (Objects.nullSafeEquals(it.next(), obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<java.lang.Object>, for r3v0, types: [java.util.Collection<java.lang.Object>, java.util.Collection] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean containsAny(java.util.Collection r2, java.util.Collection<java.lang.Object> r3) {
        /*
            boolean r0 = isEmpty(r2)
            r1 = 0
            if (r0 != 0) goto L_0x0024
            boolean r0 = isEmpty(r3)
            if (r0 == 0) goto L_0x000e
            goto L_0x0024
        L_0x000e:
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0012
            r2 = 1
            return r2
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.lang.Collections.containsAny(java.util.Collection, java.util.Collection):boolean");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<java.lang.Object>, for r1v0, types: [java.util.Collection<java.lang.Object>, java.util.Collection] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean containsInstance(java.util.Collection<java.lang.Object> r1, java.lang.Object r2) {
        /*
            if (r1 == 0) goto L_0x0014
            java.util.Iterator r1 = r1.iterator()
        L_0x0006:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            if (r0 != r2) goto L_0x0006
            r1 = 1
            return r1
        L_0x0014:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p116io.jsonwebtoken.lang.Collections.containsInstance(java.util.Collection, java.lang.Object):boolean");
    }

    public static Class<?> findCommonElementType(Collection collection) {
        if (isEmpty(collection)) {
            return null;
        }
        Class<?> cls = null;
        for (Object next : collection) {
            if (next != null) {
                if (cls == null) {
                    cls = next.getClass();
                } else if (cls != next.getClass()) {
                    return null;
                }
            }
        }
        return cls;
    }

    public static Object findFirstMatch(Collection collection, Collection collection2) {
        if (!isEmpty(collection) && !isEmpty(collection2)) {
            for (Object next : collection2) {
                if (collection.contains(next)) {
                    return next;
                }
            }
        }
        return null;
    }

    public static <T> T findValueOfType(Collection<?> collection, Class<T> cls) {
        if (isEmpty((Collection) collection)) {
            return null;
        }
        T t = null;
        for (T next : collection) {
            if (cls == null || cls.isInstance(next)) {
                if (t != null) {
                    return null;
                }
                t = next;
            }
        }
        return t;
    }

    public static Object findValueOfType(Collection<?> collection, Class<?>[] clsArr) {
        if (!isEmpty((Collection) collection) && !Objects.isEmpty((Object[]) clsArr)) {
            for (Class<?> findValueOfType : clsArr) {
                Object findValueOfType2 = findValueOfType(collection, findValueOfType);
                if (findValueOfType2 != null) {
                    return findValueOfType2;
                }
            }
        }
        return null;
    }

    public static boolean hasUniqueObject(Collection collection) {
        if (isEmpty(collection)) {
            return false;
        }
        Object obj = null;
        boolean z = false;
        for (Object next : collection) {
            if (!z) {
                obj = next;
                z = true;
            } else if (obj != next) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(Map map) {
        return map == null || map.isEmpty();
    }

    public static void mergeArrayIntoCollection(Object obj, Collection collection) {
        if (collection != null) {
            for (Object add : Objects.toObjectArray(obj)) {
                collection.add(add);
            }
            return;
        }
        throw new IllegalArgumentException("Collection must not be null");
    }

    public static void mergePropertiesIntoMap(Properties properties, Map map) {
        if (map == null) {
            throw new IllegalArgumentException("Map must not be null");
        } else if (properties != null) {
            Enumeration propertyNames = properties.propertyNames();
            while (propertyNames.hasMoreElements()) {
                String str = (String) propertyNames.nextElement();
                Object property = properties.getProperty(str);
                if (property == null) {
                    property = properties.get(str);
                }
                map.put(str, property);
            }
        }
    }

    public static int size(Collection collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public static int size(Map map) {
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public static <A, E extends A> A[] toArray(Enumeration<E> enumeration, A[] aArr) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList.toArray(aArr);
    }

    public static <E> Iterator<E> toIterator(Enumeration<E> enumeration) {
        return new EnumerationIterator(enumeration);
    }
}
