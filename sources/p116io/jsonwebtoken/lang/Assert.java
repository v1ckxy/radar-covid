package p116io.jsonwebtoken.lang;

import java.util.Collection;
import java.util.Map;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.lang.Assert */
public final class Assert {
    public static void doesNotContain(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("[Assertion failed] - this String argument must not contain the substring [");
        sb.append(str2);
        sb.append("]");
        doesNotContain(str, str2, sb.toString());
    }

    public static void doesNotContain(String str, String str2, String str3) {
        if (Strings.hasLength(str) && Strings.hasLength(str2) && str.indexOf(str2) != -1) {
            throw new IllegalArgumentException(str3);
        }
    }

    public static void hasLength(String str) {
        hasLength(str, "[Assertion failed] - this String argument must have length; it must not be null or empty");
    }

    public static void hasLength(String str, String str2) {
        if (!Strings.hasLength(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void hasText(String str) {
        hasText(str, "[Assertion failed] - this String argument must have text; it must not be null, empty, or blank");
    }

    public static void hasText(String str, String str2) {
        if (!Strings.hasText(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void isAssignable(Class cls, Class cls2) {
        isAssignable(cls, cls2, Objects.EMPTY_STRING);
    }

    public static void isAssignable(Class cls, Class cls2, String str) {
        notNull(cls, "Type to check against must not be null");
        if (cls2 == null || !cls.isAssignableFrom(cls2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(cls2);
            sb.append(" is not assignable to ");
            sb.append(cls);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void isInstanceOf(Class cls, Object obj) {
        isInstanceOf(cls, obj, Objects.EMPTY_STRING);
    }

    public static void isInstanceOf(Class cls, Object obj, String str) {
        notNull(cls, "Type to check against must not be null");
        if (!cls.isInstance(obj)) {
            StringBuilder b = C1965a.m4763b(str, "Object of class [");
            b.append(obj != null ? obj.getClass().getName() : Objects.NULL_STRING);
            b.append("] must be an instance of ");
            b.append(cls);
            throw new IllegalArgumentException(b.toString());
        }
    }

    public static void isNull(Object obj) {
        isNull(obj, "[Assertion failed] - the object argument must be null");
    }

    public static void isNull(Object obj, String str) {
        if (obj != null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void isTrue(boolean z) {
        isTrue(z, "[Assertion failed] - this expression must be true");
    }

    public static void isTrue(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void noNullElements(Object[] objArr) {
        noNullElements(objArr, "[Assertion failed] - this array must not contain any null elements");
    }

    public static void noNullElements(Object[] objArr, String str) {
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                if (objArr[i] != null) {
                    i++;
                } else {
                    throw new IllegalArgumentException(str);
                }
            }
        }
    }

    public static void notEmpty(Collection collection) {
        notEmpty(collection, "[Assertion failed] - this collection must not be empty: it must contain at least 1 element");
    }

    public static void notEmpty(Collection collection, String str) {
        if (Collections.isEmpty(collection)) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void notEmpty(Map map) {
        notEmpty(map, "[Assertion failed] - this map must not be empty; it must contain at least one entry");
    }

    public static void notEmpty(Map map, String str) {
        if (Collections.isEmpty(map)) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void notEmpty(byte[] bArr, String str) {
        if (Objects.isEmpty(bArr)) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void notEmpty(Object[] objArr) {
        notEmpty(objArr, "[Assertion failed] - this array must not be empty: it must contain at least 1 element");
    }

    public static void notEmpty(Object[] objArr, String str) {
        if (Objects.isEmpty(objArr)) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void notNull(Object obj) {
        notNull(obj, "[Assertion failed] - this argument is required; it must not be null");
    }

    public static void notNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void state(boolean z) {
        state(z, "[Assertion failed] - this state invariant must be true");
    }

    public static void state(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
