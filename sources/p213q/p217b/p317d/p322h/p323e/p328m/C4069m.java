package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4104a;

/* renamed from: q.b.d.h.e.m.m */
public final class C4069m extends C4104a {

    /* renamed from: a */
    public final long f9928a;

    /* renamed from: b */
    public final long f9929b;

    /* renamed from: c */
    public final String f9930c;

    /* renamed from: d */
    public final String f9931d;

    public /* synthetic */ C4069m(long j, long j2, String str, String str2, C4070a aVar) {
        this.f9928a = j;
        this.f9929b = j2;
        this.f9930c = str;
        this.f9931d = str2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4104a)) {
            return false;
        }
        C4069m mVar = (C4069m) ((C4104a) obj);
        if (this.f9928a == mVar.f9928a && this.f9929b == mVar.f9929b && this.f9930c.equals(mVar.f9930c)) {
            String str = this.f9931d;
            if (str != null) {
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        long j = this.f9928a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f9929b;
        int hashCode = (((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f9930c.hashCode()) * 1000003;
        String str = this.f9931d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("BinaryImage{baseAddress=");
        a.append(this.f9928a);
        a.append(", size=");
        a.append(this.f9929b);
        a.append(", name=");
        a.append(this.f9930c);
        a.append(", uuid=");
        return C1965a.m4754a(a, this.f9931d, Objects.ARRAY_END);
    }
}
