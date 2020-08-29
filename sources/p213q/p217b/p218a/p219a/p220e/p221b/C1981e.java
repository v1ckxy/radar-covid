package p213q.p217b.p218a.p219a.p220e.p221b;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.p220e.p221b.C1988k.C1989a;

/* renamed from: q.b.a.a.e.b.e */
public final class C1981e extends C1988k {

    /* renamed from: a */
    public final C1989a f5657a;

    /* renamed from: b */
    public final C1971a f5658b;

    public /* synthetic */ C1981e(C1989a aVar, C1971a aVar2) {
        this.f5657a = aVar;
        this.f5658b = aVar2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1988k)) {
            return false;
        }
        C1989a aVar = this.f5657a;
        if (aVar != null ? aVar.equals(((C1981e) obj).f5657a) : ((C1981e) obj).f5657a == null) {
            C1971a aVar2 = this.f5658b;
            C1971a aVar3 = ((C1981e) obj).f5658b;
            if (aVar2 != null) {
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        C1989a aVar = this.f5657a;
        int i = 0;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        C1971a aVar2 = this.f5658b;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ClientInfo{clientType=");
        a.append(this.f5657a);
        a.append(", androidClientInfo=");
        a.append(this.f5658b);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
