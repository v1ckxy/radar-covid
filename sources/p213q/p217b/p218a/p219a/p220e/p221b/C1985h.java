package p213q.p217b.p218a.p219a.p220e.p221b;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.a.e.b.h */
public final class C1985h extends C1993n {

    /* renamed from: a */
    public final long f5680a;

    public C1985h(long j) {
        this.f5680a = j;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1993n)) {
            return false;
        }
        if (this.f5680a != ((C1985h) ((C1993n) obj)).f5680a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.f5680a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("LogResponse{nextRequestWaitMillis=");
        a.append(this.f5680a);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
