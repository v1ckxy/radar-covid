package p213q.p217b.p317d.p322h.p323e.p326k;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v;

/* renamed from: q.b.d.h.e.k.c */
public final class C3934c extends C3954j0 {

    /* renamed from: a */
    public final C4090v f9598a;

    /* renamed from: b */
    public final String f9599b;

    public C3934c(C4090v vVar, String str) {
        if (vVar != null) {
            this.f9598a = vVar;
            if (str != null) {
                this.f9599b = str;
                return;
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3954j0)) {
            return false;
        }
        C3954j0 j0Var = (C3954j0) obj;
        if (!this.f9598a.equals(((C3934c) j0Var).f9598a) || !this.f9599b.equals(((C3934c) j0Var).f9599b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f9598a.hashCode() ^ 1000003) * 1000003) ^ this.f9599b.hashCode();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("CrashlyticsReportWithSessionId{report=");
        a.append(this.f9598a);
        a.append(", sessionId=");
        return C1965a.m4754a(a, this.f9599b, Objects.ARRAY_END);
    }
}
