package p213q.p217b.p301c.p302a.p311j0.p312a;

import p116io.jsonwebtoken.lang.Objects;

/* renamed from: q.b.c.a.j0.a.d0 */
public enum C3610d0 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, Objects.EMPTY_STRING),
    BYTE_STRING(C3635j.class, C3635j.class, C3635j.f9034f),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: e */
    public final Class<?> f8994e;

    /* renamed from: f */
    public final Object f8995f;

    /* access modifiers changed from: public */
    C3610d0(Class<?> cls, Class<?> cls2, Object obj) {
        this.f8994e = cls2;
        this.f8995f = obj;
    }
}
