package p213q.p217b.p218a.p231b.p249e;

import android.os.IBinder;
import java.lang.reflect.Field;
import p213q.p217b.p218a.p231b.p249e.C2303a.C2304a;

/* renamed from: q.b.a.b.e.b */
public final class C2306b<T> extends C2304a {

    /* renamed from: a */
    public final T f6283a;

    public C2306b(T t) {
        this.f6283a = t;
    }

    /* renamed from: a */
    public static <T> T m5379a(C2303a aVar) {
        if (aVar instanceof C2306b) {
            return ((C2306b) aVar).f6283a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
