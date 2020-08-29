package p484y;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p410v.C4725j0;
import p484y.C5280h.C5281a;

@IgnoreJRERequirement
/* renamed from: y.v */
public final class C5343v extends C5281a {

    /* renamed from: a */
    public static final C5281a f12642a = new C5343v();

    @IgnoreJRERequirement
    /* renamed from: y.v$a */
    public static final class C5344a<T> implements C5280h<C4725j0, Optional<T>> {

        /* renamed from: a */
        public final C5280h<C4725j0, T> f12643a;

        public C5344a(C5280h<C4725j0, T> hVar) {
            this.f12643a = hVar;
        }

        /* renamed from: a */
        public Object mo11984a(Object obj) {
            return Optional.ofNullable(this.f12643a.mo11984a((C4725j0) obj));
        }
    }

    @Nullable
    /* renamed from: a */
    public C5280h<C4725j0, ?> mo11982a(Type type, Annotation[] annotationArr, C5265d0 d0Var) {
        if (C5282h0.m11767b(type) != Optional.class) {
            return null;
        }
        return new C5344a(d0Var.mo11997b(C5282h0.m11759a(0, (ParameterizedType) type), annotationArr));
    }
}
