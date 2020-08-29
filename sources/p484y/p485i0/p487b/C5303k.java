package p484y.p485i0.p487b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p410v.C4716h0;
import p410v.C4725j0;
import p484y.C5265d0;
import p484y.C5280h;
import p484y.C5280h.C5281a;

/* renamed from: y.i0.b.k */
public final class C5303k extends C5281a {
    @Nullable
    /* renamed from: a */
    public C5280h<C4725j0, ?> mo11982a(Type type, Annotation[] annotationArr, C5265d0 d0Var) {
        if (type == String.class) {
            return C5302j.f12605a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return C5294b.f12597a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return C5295c.f12598a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return C5296d.f12599a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return C5297e.f12600a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return C5298f.f12601a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return C5299g.f12602a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return C5300h.f12603a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return C5301i.f12604a;
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public C5280h<?, C4716h0> mo11983a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C5265d0 d0Var) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return C5293a.f12595a;
        }
        return null;
    }
}
