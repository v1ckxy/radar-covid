package p213q.p217b.p218a.p219a;

import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.a.a */
public final class C1966a {

    /* renamed from: a */
    public final String f5630a;

    public C1966a(String str) {
        if (str != null) {
            this.f5630a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1966a)) {
            return false;
        }
        return this.f5630a.equals(((C1966a) obj).f5630a);
    }

    public int hashCode() {
        return this.f5630a.hashCode() ^ 1000003;
    }

    public String toString() {
        return C1965a.m4754a(C1965a.m4756a("Encoding{name=\""), this.f5630a, "\"}");
    }
}
