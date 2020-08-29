package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4117f;

/* renamed from: q.b.d.h.e.m.u */
public final class C4088u extends C4117f {

    /* renamed from: a */
    public final String f9974a;

    public /* synthetic */ C4088u(String str, C4089a aVar) {
        this.f9974a = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4117f)) {
            return false;
        }
        return this.f9974a.equals(((C4088u) ((C4117f) obj)).f9974a);
    }

    public int hashCode() {
        return this.f9974a.hashCode() ^ 1000003;
    }

    public String toString() {
        return C1965a.m4754a(C1965a.m4756a("User{identifier="), this.f9974a, Objects.ARRAY_END);
    }
}
