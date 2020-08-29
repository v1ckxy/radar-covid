package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4093c;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4093c.C4094a;

/* renamed from: q.b.d.h.e.m.d */
public final class C4048d extends C4093c {

    /* renamed from: a */
    public final C4119w<C4094a> f9857a;

    /* renamed from: b */
    public final String f9858b;

    public /* synthetic */ C4048d(C4119w wVar, String str, C4049a aVar) {
        this.f9857a = wVar;
        this.f9858b = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4093c)) {
            return false;
        }
        C4048d dVar = (C4048d) ((C4093c) obj);
        if (this.f9857a.equals(dVar.f9857a)) {
            String str = this.f9858b;
            if (str != null) {
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        int hashCode = (this.f9857a.hashCode() ^ 1000003) * 1000003;
        String str = this.f9858b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("FilesPayload{files=");
        a.append(this.f9857a);
        a.append(", orgId=");
        return C1965a.m4754a(a, this.f9858b, Objects.ARRAY_END);
    }
}
