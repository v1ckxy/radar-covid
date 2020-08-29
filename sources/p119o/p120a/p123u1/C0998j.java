package p119o.p120a.p123u1;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: o.a.u1.j */
public final class C0998j extends C0996h {

    /* renamed from: g */
    public final Runnable f2642g;

    public C0998j(Runnable runnable, long j, C0997i iVar) {
        super(j, iVar);
        this.f2642g = runnable;
    }

    public void run() {
        try {
            this.f2642g.run();
        } finally {
            this.f2641f.mo4353f();
        }
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Task[");
        a.append(C2286e.m5309c((Object) this.f2642g));
        a.append('@');
        a.append(C2286e.m5323d((Object) this.f2642g));
        String str = Objects.ARRAY_ELEMENT_SEPARATOR;
        a.append(str);
        a.append(this.f2640e);
        a.append(str);
        a.append(this.f2641f);
        a.append(']');
        return a.toString();
    }
}
