package p213q.p217b.p317d.p350n;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p270l.C3257j;
import p213q.p217b.p317d.p350n.p351o.C4292a;
import p213q.p217b.p317d.p350n.p351o.C4296c.C4297a;
import p213q.p217b.p317d.p350n.p351o.C4298d;

/* renamed from: q.b.d.n.j */
public class C4287j implements C4290m {

    /* renamed from: a */
    public final C4291n f10310a;

    /* renamed from: b */
    public final C3257j<C4288k> f10311b;

    public C4287j(C4291n nVar, C3257j<C4288k> jVar) {
        this.f10310a = nVar;
        this.f10311b = jVar;
    }

    /* renamed from: a */
    public boolean mo10495a(C4298d dVar, Exception exc) {
        if (!dVar.mo10513a() && !dVar.mo10514b()) {
            if (!(((C4292a) dVar).f10317b == C4297a.UNREGISTERED)) {
                return false;
            }
        }
        this.f10311b.f8128a.mo8933b(exc);
        return true;
    }

    /* renamed from: a */
    public boolean mo10494a(C4298d dVar) {
        if (dVar != null) {
            C4292a aVar = (C4292a) dVar;
            if (!(aVar.f10317b == C4297a.REGISTERED) || this.f10310a.mo10498a(dVar)) {
                return false;
            }
            C3257j<C4288k> jVar = this.f10311b;
            String str = aVar.f10318c;
            if (str != null) {
                Long valueOf = Long.valueOf(aVar.f10320e);
                Long valueOf2 = Long.valueOf(aVar.f10321f);
                String str2 = Objects.EMPTY_STRING;
                if (valueOf == null) {
                    str2 = C1965a.m4751a(str2, " tokenExpirationTimestamp");
                }
                if (valueOf2 == null) {
                    str2 = C1965a.m4751a(str2, " tokenCreationTimestamp");
                }
                if (str2.isEmpty()) {
                    C4275a aVar2 = new C4275a(str, valueOf.longValue(), valueOf2.longValue(), null);
                    jVar.f8128a.mo8930a(aVar2);
                    return true;
                }
                throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str2));
            }
            throw new NullPointerException("Null token");
        }
        throw null;
    }
}
