package p484y.p485i0.p486a;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p213q.p217b.p355e.p361w.C4396a;
import p410v.C4716h0;
import p410v.C4725j0;
import p484y.C5265d0;
import p484y.C5280h;
import p484y.C5280h.C5281a;

/* renamed from: y.i0.a.a */
public final class C5290a extends C5281a {

    /* renamed from: a */
    public final Gson f12588a;

    public C5290a(Gson gson) {
        this.f12588a = gson;
    }

    /* renamed from: a */
    public static C5290a m11782a() {
        return new C5290a(new Gson());
    }

    /* renamed from: a */
    public C5280h<C4725j0, ?> mo11982a(Type type, Annotation[] annotationArr, C5265d0 d0Var) {
        return new C5292c(this.f12588a, this.f12588a.mo3080a(C4396a.get(type)));
    }

    /* renamed from: a */
    public C5280h<?, C4716h0> mo11983a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C5265d0 d0Var) {
        return new C5291b(this.f12588a, this.f12588a.mo3080a(C4396a.get(type)));
    }
}
