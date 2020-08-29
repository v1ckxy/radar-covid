package p213q.p217b.p218a.p219a.p222f.p225r.p227i;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.p222f.C2013f;
import p213q.p217b.p218a.p219a.p222f.C2018i;

/* renamed from: q.b.a.a.f.r.i.b */
public final class C2075b extends C2081h {

    /* renamed from: a */
    public final long f5913a;

    /* renamed from: b */
    public final C2018i f5914b;

    /* renamed from: c */
    public final C2013f f5915c;

    public C2075b(long j, C2018i iVar, C2013f fVar) {
        this.f5913a = j;
        if (iVar != null) {
            this.f5914b = iVar;
            if (fVar != null) {
                this.f5915c = fVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2081h)) {
            return false;
        }
        C2075b bVar = (C2075b) ((C2081h) obj);
        if (this.f5913a != bVar.f5913a || !this.f5914b.equals(bVar.f5914b) || !this.f5915c.equals(bVar.f5915c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.f5913a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f5914b.hashCode()) * 1000003) ^ this.f5915c.hashCode();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("PersistedEvent{id=");
        a.append(this.f5913a);
        a.append(", transportContext=");
        a.append(this.f5914b);
        a.append(", event=");
        a.append(this.f5915c);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
