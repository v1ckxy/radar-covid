package p213q.p217b.p301c.p302a;

import java.security.GeneralSecurityException;
import java.util.Set;
import p213q.p217b.p301c.p302a.C3855z.C3856a;

/* renamed from: q.b.c.a.w */
public class C3852w implements C3856a {

    /* renamed from: a */
    public final /* synthetic */ C3574i f9446a;

    public C3852w(C3574i iVar) {
        this.f9446a = iVar;
    }

    /* renamed from: a */
    public C3542f<?> mo10050a() {
        C3574i iVar = this.f9446a;
        return new C3554g(iVar, iVar.f8960c);
    }

    /* renamed from: a */
    public <Q> C3542f<Q> mo10051a(Class<Q> cls) {
        try {
            return new C3554g(this.f9446a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: b */
    public Class<?> mo10052b() {
        return null;
    }

    /* renamed from: c */
    public Class<?> mo10053c() {
        return this.f9446a.getClass();
    }

    /* renamed from: d */
    public Set<Class<?>> mo10054d() {
        return this.f9446a.mo9480d();
    }
}
