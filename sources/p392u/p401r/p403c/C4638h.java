package p392u.p401r.p403c;

import java.util.Arrays;
import p116io.jsonwebtoken.lang.Strings;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4549b;
import p392u.C4559k;

/* renamed from: u.r.c.h */
public class C4638h {
    /* renamed from: a */
    public static <T extends Throwable> T m10267a(T t) {
        m10268a(t, C4638h.class.getName());
        return t;
    }

    /* renamed from: a */
    public static <T extends Throwable> T m10268a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: a */
    public static void m10269a() {
        C4549b bVar = new C4549b();
        m10267a((T) bVar);
        throw bVar;
    }

    /* renamed from: a */
    public static void m10270a(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(C1965a.m4751a(str, " must not be null"));
            m10267a((T) illegalStateException);
            throw illegalStateException;
        }
    }

    /* renamed from: a */
    public static void m10271a(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder();
        sb.append("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(Strings.CURRENT_PATH);
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
        m10267a((T) illegalArgumentException);
        throw illegalArgumentException;
    }

    /* renamed from: a */
    public static boolean m10272a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m10273b(String str) {
        C4559k kVar = new C4559k(C1965a.m4752a("lateinit property ", str, " has not been initialized"));
        m10267a((T) kVar);
        throw kVar;
    }
}
