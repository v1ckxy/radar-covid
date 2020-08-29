package p213q.p217b.p218a.p219a.p222f.p225r.p226h;

import java.util.Map;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.C1967b;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2057f.C2058a;
import p213q.p217b.p218a.p219a.p222f.p229t.C2099a;

/* renamed from: q.b.a.a.f.r.h.b */
public final class C2051b extends C2057f {

    /* renamed from: a */
    public final C2099a f5852a;

    /* renamed from: b */
    public final Map<C1967b, C2058a> f5853b;

    public C2051b(C2099a aVar, Map<C1967b, C2058a> map) {
        if (aVar != null) {
            this.f5852a = aVar;
            if (map != null) {
                this.f5853b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2057f)) {
            return false;
        }
        C2051b bVar = (C2051b) ((C2057f) obj);
        if (!this.f5852a.equals(bVar.f5852a) || !this.f5853b.equals(bVar.f5853b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f5852a.hashCode() ^ 1000003) * 1000003) ^ this.f5853b.hashCode();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("SchedulerConfig{clock=");
        a.append(this.f5852a);
        a.append(", values=");
        a.append(this.f5853b);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
