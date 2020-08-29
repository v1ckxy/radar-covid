package p213q.p217b.p301c.p302a;

import java.security.GeneralSecurityException;
import java.util.Set;
import p213q.p217b.p301c.p302a.C3855z.C3856a;

/* renamed from: q.b.c.a.x */
public class C3853x implements C3856a {

    /* renamed from: a */
    public final /* synthetic */ C3849t f9447a;

    /* renamed from: b */
    public final /* synthetic */ C3574i f9448b;

    public C3853x(C3849t tVar, C3574i iVar) {
        this.f9447a = tVar;
        this.f9448b = iVar;
    }

    /* renamed from: a */
    public C3542f<?> mo10050a() {
        C3849t tVar = this.f9447a;
        return new C3848s(tVar, this.f9448b, tVar.f8960c);
    }

    /* renamed from: a */
    public <Q> C3542f<Q> mo10051a(Class<Q> cls) {
        try {
            return new C3848s(this.f9447a, this.f9448b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: b */
    public Class<?> mo10052b() {
        return this.f9448b.getClass();
    }

    /* renamed from: c */
    public Class<?> mo10053c() {
        return this.f9447a.getClass();
    }

    /* renamed from: d */
    public Set<Class<?>> mo10054d() {
        return this.f9447a.mo9480d();
    }
}
