package p213q.p217b.p218a.p219a.p220e.p221b;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.p220e.p221b.C1994o.C1995a;
import p213q.p217b.p218a.p219a.p220e.p221b.C1994o.C1996b;

/* renamed from: q.b.a.a.e.b.i */
public final class C1986i extends C1994o {

    /* renamed from: a */
    public final C1996b f5681a;

    /* renamed from: b */
    public final C1995a f5682b;

    public /* synthetic */ C1986i(C1996b bVar, C1995a aVar) {
        this.f5681a = bVar;
        this.f5682b = aVar;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1994o)) {
            return false;
        }
        C1996b bVar = this.f5681a;
        if (bVar != null ? bVar.equals(((C1986i) obj).f5681a) : ((C1986i) obj).f5681a == null) {
            C1995a aVar = this.f5682b;
            C1995a aVar2 = ((C1986i) obj).f5682b;
            if (aVar != null) {
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        C1996b bVar = this.f5681a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        C1995a aVar = this.f5682b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("NetworkConnectionInfo{networkType=");
        a.append(this.f5681a);
        a.append(", mobileSubtype=");
        a.append(this.f5682b);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
