package p116io.jsonwebtoken.lang;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.lang.Objects */
public final class Objects {
    public static final String ARRAY_ELEMENT_SEPARATOR = ", ";
    public static final String ARRAY_END = "}";
    public static final String ARRAY_START = "{";
    public static final String EMPTY_ARRAY = "{}";
    public static final String EMPTY_STRING = "";
    public static final int INITIAL_HASH = 7;
    public static final int MULTIPLIER = 31;
    public static final String NULL_STRING = "null";

    public static <A, O extends A> A[] addObjectToArray(A[] aArr, O o) {
        Class<Object> cls = Object.class;
        if (aArr != null) {
            cls = aArr.getClass().getComponentType();
        } else if (o != null) {
            cls = o.getClass();
        }
        Object[] objArr = (Object[]) Array.newInstance(cls, aArr != null ? aArr.length + 1 : 1);
        if (aArr != null) {
            System.arraycopy(aArr, 0, objArr, 0, aArr.length);
        }
        objArr[objArr.length - 1] = o;
        return objArr;
    }

    public static <E extends Enum<?>> E caseInsensitiveValueOf(E[] eArr, String str) {
        for (E e : eArr) {
            if (e.toString().equalsIgnoreCase(str)) {
                return e;
            }
        }
        throw new IllegalArgumentException(String.format("constant [%s] does not exist in enum type %s", new Object[]{str, eArr.getClass().getComponentType().getName()}));
    }

    public static boolean containsConstant(Enum<?>[] enumArr, String str) {
        return containsConstant(enumArr, str, false);
    }

    public static boolean containsConstant(Enum<?>[] enumArr, String str, boolean z) {
        int length = enumArr.length;
        int i = 0;
        while (i < length) {
            String str2 = enumArr[i].toString();
            if (z) {
                if (!str2.equals(str)) {
                    i++;
                }
            } else if (!str2.equalsIgnoreCase(str)) {
                i++;
            }
            return true;
        }
        return false;
    }

    public static boolean containsElement(Object[] objArr, Object obj) {
        if (objArr == null) {
            return false;
        }
        for (Object nullSafeEquals : objArr) {
            if (nullSafeEquals(nullSafeEquals, obj)) {
                return true;
            }
        }
        return false;
    }

    public static String getDisplayString(Object obj) {
        return obj == null ? EMPTY_STRING : nullSafeToString(obj);
    }

    public static String getIdentityHexString(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static int hashCode(double d) {
        return hashCode(Double.doubleToLongBits(d));
    }

    public static int hashCode(float f) {
        return Float.floatToIntBits(f);
    }

    public static int hashCode(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int hashCode(boolean z) {
        return z ? 1231 : 1237;
    }

    public static String identityToString(Object obj) {
        if (obj == null) {
            return EMPTY_STRING;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass().getName());
        sb.append("@");
        sb.append(getIdentityHexString(obj));
        return sb.toString();
    }

    public static boolean isArray(Object obj) {
        return obj != null && obj.getClass().isArray();
    }

    public static boolean isCheckedException(Throwable th) {
        return !(th instanceof RuntimeException) && !(th instanceof Error);
    }

    public static boolean isCompatibleWithThrowsClause(Throwable th, Class[] clsArr) {
        if (!isCheckedException(th)) {
            return true;
        }
        if (clsArr != null) {
            for (Class isAssignableFrom : clsArr) {
                if (isAssignableFrom.isAssignableFrom(th.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static boolean isEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static String nullSafeClassName(Object obj) {
        return obj != null ? obj.getClass().getName() : NULL_STRING;
    }

    public static void nullSafeClose(Closeable... closeableArr) {
        if (closeableArr != null) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    public static boolean nullSafeEquals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (!(obj == null || obj2 == null)) {
            if (obj.equals(obj2)) {
                return true;
            }
            if (obj.getClass().isArray() && obj2.getClass().isArray()) {
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    return Arrays.equals((Object[]) obj, (Object[]) obj2);
                }
                if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    return Arrays.equals((boolean[]) obj, (boolean[]) obj2);
                }
                if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    return Arrays.equals((byte[]) obj, (byte[]) obj2);
                }
                if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    return Arrays.equals((char[]) obj, (char[]) obj2);
                }
                if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    return Arrays.equals((double[]) obj, (double[]) obj2);
                }
                if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    return Arrays.equals((float[]) obj, (float[]) obj2);
                }
                if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    return Arrays.equals((int[]) obj, (int[]) obj2);
                }
                if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    return Arrays.equals((long[]) obj, (long[]) obj2);
                }
                if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    return Arrays.equals((short[]) obj, (short[]) obj2);
                }
            }
        }
        return false;
    }

    public static int nullSafeHashCode(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof Object[]) {
                return nullSafeHashCode((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return nullSafeHashCode((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return nullSafeHashCode((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return nullSafeHashCode((char[]) obj);
            }
            if (obj instanceof double[]) {
                return nullSafeHashCode((double[]) obj);
            }
            if (obj instanceof float[]) {
                return nullSafeHashCode((float[]) obj);
            }
            if (obj instanceof int[]) {
                return nullSafeHashCode((int[]) obj);
            }
            if (obj instanceof long[]) {
                return nullSafeHashCode((long[]) obj);
            }
            if (obj instanceof short[]) {
                return nullSafeHashCode((short[]) obj);
            }
        }
        return obj.hashCode();
    }

    public static int nullSafeHashCode(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i = 7;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        return i;
    }

    public static int nullSafeHashCode(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int i = 7;
        for (char c : cArr) {
            i = (i * 31) + c;
        }
        return i;
    }

    public static int nullSafeHashCode(double[] dArr) {
        if (dArr == null) {
            return 0;
        }
        int i = 7;
        for (double hashCode : dArr) {
            i = (i * 31) + hashCode(hashCode);
        }
        return i;
    }

    public static int nullSafeHashCode(float[] fArr) {
        if (fArr == null) {
            return 0;
        }
        int i = 7;
        for (float hashCode : fArr) {
            i = (i * 31) + hashCode(hashCode);
        }
        return i;
    }

    public static int nullSafeHashCode(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int i = 7;
        for (int i2 : iArr) {
            i = (i * 31) + i2;
        }
        return i;
    }

    public static int nullSafeHashCode(long[] jArr) {
        if (jArr == null) {
            return 0;
        }
        int i = 7;
        for (long hashCode : jArr) {
            i = (i * 31) + hashCode(hashCode);
        }
        return i;
    }

    public static int nullSafeHashCode(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        int i = 7;
        for (Object nullSafeHashCode : objArr) {
            i = (i * 31) + nullSafeHashCode(nullSafeHashCode);
        }
        return i;
    }

    public static int nullSafeHashCode(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int i = 7;
        for (short s : sArr) {
            i = (i * 31) + s;
        }
        return i;
    }

    public static int nullSafeHashCode(boolean[] zArr) {
        if (zArr == null) {
            return 0;
        }
        int i = 7;
        for (boolean hashCode : zArr) {
            i = (i * 31) + hashCode(hashCode);
        }
        return i;
    }

    public static String nullSafeToString(Object obj) {
        if (obj == null) {
            return NULL_STRING;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Object[]) {
            return nullSafeToString((Object[]) obj);
        }
        if (obj instanceof boolean[]) {
            return nullSafeToString((boolean[]) obj);
        }
        if (obj instanceof byte[]) {
            return nullSafeToString((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return nullSafeToString((char[]) obj);
        }
        if (obj instanceof double[]) {
            return nullSafeToString((double[]) obj);
        }
        if (obj instanceof float[]) {
            return nullSafeToString((float[]) obj);
        }
        if (obj instanceof int[]) {
            return nullSafeToString((int[]) obj);
        }
        if (obj instanceof long[]) {
            return nullSafeToString((long[]) obj);
        }
        if (obj instanceof short[]) {
            return nullSafeToString((short[]) obj);
        }
        String obj2 = obj.toString();
        if (obj2 == null) {
            obj2 = EMPTY_STRING;
        }
        return obj2;
    }

    public static String nullSafeToString(byte[] bArr) {
        if (bArr == null) {
            return NULL_STRING;
        }
        int length = bArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            sb.append(i == 0 ? ARRAY_START : ARRAY_ELEMENT_SEPARATOR);
            sb.append(bArr[i]);
            i++;
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(char[] cArr) {
        if (cArr == null) {
            return NULL_STRING;
        }
        int length = cArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            sb.append(i == 0 ? ARRAY_START : ARRAY_ELEMENT_SEPARATOR);
            String str = "'";
            sb.append(str);
            sb.append(cArr[i]);
            sb.append(str);
            i++;
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(double[] dArr) {
        if (dArr == null) {
            return NULL_STRING;
        }
        int length = dArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            sb.append(i == 0 ? ARRAY_START : ARRAY_ELEMENT_SEPARATOR);
            sb.append(dArr[i]);
            i++;
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(float[] fArr) {
        if (fArr == null) {
            return NULL_STRING;
        }
        int length = fArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            sb.append(i == 0 ? ARRAY_START : ARRAY_ELEMENT_SEPARATOR);
            sb.append(fArr[i]);
            i++;
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(int[] iArr) {
        if (iArr == null) {
            return NULL_STRING;
        }
        int length = iArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            sb.append(i == 0 ? ARRAY_START : ARRAY_ELEMENT_SEPARATOR);
            sb.append(iArr[i]);
            i++;
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(long[] jArr) {
        if (jArr == null) {
            return NULL_STRING;
        }
        int length = jArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            sb.append(i == 0 ? ARRAY_START : ARRAY_ELEMENT_SEPARATOR);
            sb.append(jArr[i]);
            i++;
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(Object[] objArr) {
        if (objArr == null) {
            return NULL_STRING;
        }
        int length = objArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            sb.append(i == 0 ? ARRAY_START : ARRAY_ELEMENT_SEPARATOR);
            sb.append(String.valueOf(objArr[i]));
            i++;
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(short[] sArr) {
        if (sArr == null) {
            return NULL_STRING;
        }
        int length = sArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            sb.append(i == 0 ? ARRAY_START : ARRAY_ELEMENT_SEPARATOR);
            sb.append(sArr[i]);
            i++;
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static String nullSafeToString(boolean[] zArr) {
        if (zArr == null) {
            return NULL_STRING;
        }
        int length = zArr.length;
        if (length == 0) {
            return EMPTY_ARRAY;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            sb.append(i == 0 ? ARRAY_START : ARRAY_ELEMENT_SEPARATOR);
            sb.append(zArr[i]);
            i++;
        }
        sb.append(ARRAY_END);
        return sb.toString();
    }

    public static Object[] toObjectArray(Object obj) {
        if (obj instanceof Object[]) {
            return (Object[]) obj;
        }
        if (obj == null) {
            return new Object[0];
        }
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            if (length == 0) {
                return new Object[0];
            }
            Object[] objArr = (Object[]) Array.newInstance(Array.get(obj, 0).getClass(), length);
            for (int i = 0; i < length; i++) {
                objArr[i] = Array.get(obj, i);
            }
            return objArr;
        }
        throw new IllegalArgumentException(C1965a.m4750a("Source is not an array: ", obj));
    }
}
