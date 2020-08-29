package p213q.p217b.p218a.p219a.p220e.p221b;

import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.a.e.b.d */
public final class C1980d extends C1987j {

    /* renamed from: a */
    public final List<C1992m> f5656a;

    public C1980d(List<C1992m> list) {
        if (list != null) {
            this.f5656a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1987j)) {
            return false;
        }
        return this.f5656a.equals(((C1980d) ((C1987j) obj)).f5656a);
    }

    public int hashCode() {
        return this.f5656a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("BatchedLogRequest{logRequests=");
        a.append(this.f5656a);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
