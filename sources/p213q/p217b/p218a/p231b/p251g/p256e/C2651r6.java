package p213q.p217b.p218a.p231b.p251g.p256e;

import p116io.jsonwebtoken.lang.Objects;

/* renamed from: q.b.a.b.g.e.r6 */
public enum C2651r6 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, Objects.EMPTY_STRING),
    BYTE_STRING(C2435f5.class, C2435f5.class, C2435f5.f6525f),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: e */
    public final Class<?> f6846e;

    /* renamed from: f */
    public final Object f6847f;

    /* access modifiers changed from: public */
    C2651r6(Class<?> cls, Class<?> cls2, Object obj) {
        this.f6846e = cls2;
        this.f6847f = obj;
    }
}
