package p213q.p217b.p317d.p350n.p352p;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p350n.p352p.C4306d.C4307a;

/* renamed from: q.b.d.n.p.a */
public final class C4300a extends C4306d {

    /* renamed from: a */
    public final String f10341a;

    /* renamed from: b */
    public final String f10342b;

    /* renamed from: c */
    public final String f10343c;

    /* renamed from: d */
    public final C4308e f10344d;

    /* renamed from: e */
    public final C4307a f10345e;

    public /* synthetic */ C4300a(String str, String str2, String str3, C4308e eVar, C4307a aVar, C4301a aVar2) {
        this.f10341a = str;
        this.f10342b = str2;
        this.f10343c = str3;
        this.f10344d = eVar;
        this.f10345e = aVar;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4306d)) {
            return false;
        }
        C4306d dVar = (C4306d) obj;
        String str = this.f10341a;
        if (str != null ? str.equals(((C4300a) dVar).f10341a) : ((C4300a) dVar).f10341a == null) {
            String str2 = this.f10342b;
            if (str2 != null ? str2.equals(((C4300a) dVar).f10342b) : ((C4300a) dVar).f10342b == null) {
                String str3 = this.f10343c;
                if (str3 != null ? str3.equals(((C4300a) dVar).f10343c) : ((C4300a) dVar).f10343c == null) {
                    C4308e eVar = this.f10344d;
                    if (eVar != null ? eVar.equals(((C4300a) dVar).f10344d) : ((C4300a) dVar).f10344d == null) {
                        C4307a aVar = this.f10345e;
                        C4300a aVar2 = (C4300a) dVar;
                        if (aVar != null) {
                        }
                    }
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        String str = this.f10341a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f10342b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10343c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C4308e eVar = this.f10344d;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        C4307a aVar = this.f10345e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("InstallationResponse{uri=");
        a.append(this.f10341a);
        a.append(", fid=");
        a.append(this.f10342b);
        a.append(", refreshToken=");
        a.append(this.f10343c);
        a.append(", authToken=");
        a.append(this.f10344d);
        a.append(", responseCode=");
        a.append(this.f10345e);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
