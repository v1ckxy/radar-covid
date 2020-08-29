package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4114d;

/* renamed from: q.b.d.h.e.m.s */
public final class C4083s extends C4114d {

    /* renamed from: a */
    public final String f9965a;

    public /* synthetic */ C4083s(String str, C4084a aVar) {
        this.f9965a = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4114d)) {
            return false;
        }
        return this.f9965a.equals(((C4083s) ((C4114d) obj)).f9965a);
    }

    public int hashCode() {
        return this.f9965a.hashCode() ^ 1000003;
    }

    public String toString() {
        return C1965a.m4754a(C1965a.m4756a("Log{content="), this.f9965a, Objects.ARRAY_END);
    }
}
