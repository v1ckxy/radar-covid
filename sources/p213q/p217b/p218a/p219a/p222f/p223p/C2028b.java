package p213q.p217b.p218a.p219a.p222f.p223p;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.p222f.p223p.C2033g.C2034a;

/* renamed from: q.b.a.a.f.p.b */
public final class C2028b extends C2033g {

    /* renamed from: a */
    public final C2034a f5805a;

    /* renamed from: b */
    public final long f5806b;

    public C2028b(C2034a aVar, long j) {
        if (aVar != null) {
            this.f5805a = aVar;
            this.f5806b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2033g)) {
            return false;
        }
        C2028b bVar = (C2028b) ((C2033g) obj);
        if (!this.f5805a.equals(bVar.f5805a) || this.f5806b != bVar.f5806b) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (this.f5805a.hashCode() ^ 1000003) * 1000003;
        long j = this.f5806b;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("BackendResponse{status=");
        a.append(this.f5805a);
        a.append(", nextRequestWaitMillis=");
        a.append(this.f5806b);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
