package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4092b;

/* renamed from: q.b.d.h.e.m.c */
public final class C4046c extends C4092b {

    /* renamed from: a */
    public final String f9855a;

    /* renamed from: b */
    public final String f9856b;

    public /* synthetic */ C4046c(String str, String str2, C4047a aVar) {
        this.f9855a = str;
        this.f9856b = str2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4092b)) {
            return false;
        }
        C4046c cVar = (C4046c) ((C4092b) obj);
        if (!this.f9855a.equals(cVar.f9855a) || !this.f9856b.equals(cVar.f9856b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f9855a.hashCode() ^ 1000003) * 1000003) ^ this.f9856b.hashCode();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("CustomAttribute{key=");
        a.append(this.f9855a);
        a.append(", value=");
        return C1965a.m4754a(a, this.f9856b, Objects.ARRAY_END);
    }
}
