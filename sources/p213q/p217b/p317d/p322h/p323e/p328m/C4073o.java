package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4107d;

/* renamed from: q.b.d.h.e.m.o */
public final class C4073o extends C4107d {

    /* renamed from: a */
    public final String f9937a;

    /* renamed from: b */
    public final String f9938b;

    /* renamed from: c */
    public final long f9939c;

    public /* synthetic */ C4073o(String str, String str2, long j, C4074a aVar) {
        this.f9937a = str;
        this.f9938b = str2;
        this.f9939c = j;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4107d)) {
            return false;
        }
        C4073o oVar = (C4073o) ((C4107d) obj);
        if (!this.f9937a.equals(oVar.f9937a) || !this.f9938b.equals(oVar.f9938b) || this.f9939c != oVar.f9939c) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (((this.f9937a.hashCode() ^ 1000003) * 1000003) ^ this.f9938b.hashCode()) * 1000003;
        long j = this.f9939c;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Signal{name=");
        a.append(this.f9937a);
        a.append(", code=");
        a.append(this.f9938b);
        a.append(", address=");
        a.append(this.f9939c);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
