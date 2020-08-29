package p213q.p217b.p218a.p231b.p251g.p256e;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: q.b.a.b.g.e.z8 */
public final class C2781z8 implements PrivilegedExceptionAction<Unsafe> {
    public final /* synthetic */ Object run() {
        Field[] declaredFields;
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (cls.isInstance(obj)) {
                return (Unsafe) cls.cast(obj);
            }
        }
        return null;
    }
}
