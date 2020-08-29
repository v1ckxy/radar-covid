package p484y;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p392u.C4560l;
import p410v.C4716h0;
import p410v.C4725j0;
import p484y.C5280h.C5281a;
import p484y.p488j0.C5324t;

/* renamed from: y.c */
public final class C5256c extends C5281a {

    /* renamed from: a */
    public boolean f12542a = true;

    /* renamed from: y.c$a */
    public static final class C5257a implements C5280h<C4725j0, C4725j0> {

        /* renamed from: a */
        public static final C5257a f12543a = new C5257a();

        /* renamed from: a */
        public Object mo11984a(Object obj) {
            C4725j0 j0Var = (C4725j0) obj;
            try {
                return C5282h0.m11762a(j0Var);
            } finally {
                j0Var.close();
            }
        }
    }

    /* renamed from: y.c$b */
    public static final class C5258b implements C5280h<C4716h0, C4716h0> {

        /* renamed from: a */
        public static final C5258b f12544a = new C5258b();

        /* renamed from: a */
        public Object mo11984a(Object obj) {
            return (C4716h0) obj;
        }
    }

    /* renamed from: y.c$c */
    public static final class C5259c implements C5280h<C4725j0, C4725j0> {

        /* renamed from: a */
        public static final C5259c f12545a = new C5259c();

        /* renamed from: a */
        public Object mo11984a(Object obj) {
            return (C4725j0) obj;
        }
    }

    /* renamed from: y.c$d */
    public static final class C5260d implements C5280h<Object, String> {

        /* renamed from: a */
        public static final C5260d f12546a = new C5260d();

        /* renamed from: a */
        public Object mo11984a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: y.c$e */
    public static final class C5261e implements C5280h<C4725j0, C4560l> {

        /* renamed from: a */
        public static final C5261e f12547a = new C5261e();

        /* renamed from: a */
        public Object mo11984a(Object obj) {
            ((C4725j0) obj).close();
            return C4560l.f10773a;
        }
    }

    /* renamed from: y.c$f */
    public static final class C5262f implements C5280h<C4725j0, Void> {

        /* renamed from: a */
        public static final C5262f f12548a = new C5262f();

        /* renamed from: a */
        public Object mo11984a(Object obj) {
            ((C4725j0) obj).close();
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public C5280h<C4725j0, ?> mo11982a(Type type, Annotation[] annotationArr, C5265d0 d0Var) {
        if (type == C4725j0.class) {
            return C5282h0.m11766a(annotationArr, C5324t.class) ? C5259c.f12545a : C5257a.f12543a;
        } else if (type == Void.class) {
            return C5262f.f12548a;
        } else {
            if (this.f12542a && type == C4560l.class) {
                try {
                    return C5261e.f12547a;
                } catch (NoClassDefFoundError unused) {
                    this.f12542a = false;
                }
            }
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public C5280h<?, C4716h0> mo11983a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C5265d0 d0Var) {
        if (C4716h0.class.isAssignableFrom(C5282h0.m11767b(type))) {
            return C5258b.f12544a;
        }
        return null;
    }
}
