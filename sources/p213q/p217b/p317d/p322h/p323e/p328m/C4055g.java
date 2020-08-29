package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4096a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4096a.C4097a;

/* renamed from: q.b.d.h.e.m.g */
public final class C4055g extends C4096a {

    /* renamed from: a */
    public final String f9883a;

    /* renamed from: b */
    public final String f9884b;

    /* renamed from: c */
    public final String f9885c;

    /* renamed from: d */
    public final C4097a f9886d;

    /* renamed from: e */
    public final String f9887e;

    public /* synthetic */ C4055g(String str, String str2, String str3, C4097a aVar, String str4, C4056a aVar2) {
        this.f9883a = str;
        this.f9884b = str2;
        this.f9885c = str3;
        this.f9886d = aVar;
        this.f9887e = str4;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4096a)) {
            return false;
        }
        C4055g gVar = (C4055g) ((C4096a) obj);
        if (this.f9883a.equals(gVar.f9883a) && this.f9884b.equals(gVar.f9884b)) {
            String str = this.f9885c;
            if (str != null ? str.equals(gVar.f9885c) : gVar.f9885c == null) {
                C4097a aVar = this.f9886d;
                if (aVar != null ? aVar.equals(gVar.f9886d) : gVar.f9886d == null) {
                    String str2 = this.f9887e;
                    if (str2 != null) {
                    }
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        int hashCode = (((this.f9883a.hashCode() ^ 1000003) * 1000003) ^ this.f9884b.hashCode()) * 1000003;
        String str = this.f9885c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        C4097a aVar = this.f9886d;
        int hashCode3 = (hashCode2 ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        String str2 = this.f9887e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 ^ i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Application{identifier=");
        a.append(this.f9883a);
        a.append(", version=");
        a.append(this.f9884b);
        a.append(", displayVersion=");
        a.append(this.f9885c);
        a.append(", organization=");
        a.append(this.f9886d);
        a.append(", installationUuid=");
        return C1965a.m4754a(a, this.f9887e, Objects.ARRAY_END);
    }
}
