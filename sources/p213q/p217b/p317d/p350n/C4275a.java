package p213q.p217b.p317d.p350n;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.d.n.a */
public final class C4275a extends C4288k {

    /* renamed from: a */
    public final String f10283a;

    /* renamed from: b */
    public final long f10284b;

    /* renamed from: c */
    public final long f10285c;

    public /* synthetic */ C4275a(String str, long j, long j2, C4276a aVar) {
        this.f10283a = str;
        this.f10284b = j;
        this.f10285c = j2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4288k)) {
            return false;
        }
        C4275a aVar = (C4275a) ((C4288k) obj);
        if (!(this.f10283a.equals(aVar.f10283a) && this.f10284b == aVar.f10284b && this.f10285c == aVar.f10285c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (this.f10283a.hashCode() ^ 1000003) * 1000003;
        long j = this.f10284b;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f10285c;
        return i ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("InstallationTokenResult{token=");
        a.append(this.f10283a);
        a.append(", tokenExpirationTimestamp=");
        a.append(this.f10284b);
        a.append(", tokenCreationTimestamp=");
        a.append(this.f10285c);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
