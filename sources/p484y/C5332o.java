package p484y;

import java.lang.reflect.Method;
import p119o.p120a.C0942i;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4549b;
import p392u.p401r.p403c.C4638h;

/* renamed from: y.o */
public final class C5332o implements C5271f<T> {

    /* renamed from: a */
    public final /* synthetic */ C0942i f12617a;

    public C5332o(C0942i iVar) {
        this.f12617a = iVar;
    }

    /* renamed from: a */
    public void mo11952a(C5264d<T> dVar, Throwable th) {
        if (dVar == null) {
            C4638h.m10271a("call");
            throw null;
        } else if (th != null) {
            this.f12617a.mo4217a(C2286e.m5184a(th));
        } else {
            C4638h.m10271a("t");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11953a(C5264d<T> dVar, C5263c0<T> c0Var) {
        T t;
        C0942i iVar;
        if (dVar == null) {
            C4638h.m10271a("call");
            throw null;
        } else if (c0Var != null) {
            if (c0Var.mo11985a()) {
                t = c0Var.f12550b;
                if (t == null) {
                    Class<C5329l> cls = C5329l.class;
                    Object cast = cls.cast(dVar.mo11991g().f11033f.get(cls));
                    if (cast != null) {
                        C4638h.m10270a(cast, "call.request().tag(Invocation::class.java)!!");
                        Method method = ((C5329l) cast).f12613a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Response from ");
                        C4638h.m10270a((Object) method, "method");
                        Class declaringClass = method.getDeclaringClass();
                        C4638h.m10270a((Object) declaringClass, "method.declaringClass");
                        sb.append(declaringClass.getName());
                        sb.append('.');
                        sb.append(method.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        C4549b bVar = new C4549b(sb.toString());
                        iVar = this.f12617a;
                        t = C2286e.m5184a((Throwable) bVar);
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                } else {
                    iVar = this.f12617a;
                }
            } else {
                iVar = this.f12617a;
                t = C2286e.m5184a((Throwable) new C5304j(c0Var));
            }
            iVar.mo4217a(t);
        } else {
            C4638h.m10271a("response");
            throw null;
        }
    }
}
