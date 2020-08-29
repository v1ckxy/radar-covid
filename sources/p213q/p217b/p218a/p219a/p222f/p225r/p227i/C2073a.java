package p213q.p217b.p218a.p219a.p222f.p225r.p227i;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.a.f.r.i.a */
public final class C2073a extends C2077d {

    /* renamed from: b */
    public final long f5908b;

    /* renamed from: c */
    public final int f5909c;

    /* renamed from: d */
    public final int f5910d;

    /* renamed from: e */
    public final long f5911e;

    /* renamed from: f */
    public final int f5912f;

    public /* synthetic */ C2073a(long j, int i, int i2, long j2, int i3, C2074a aVar) {
        this.f5908b = j;
        this.f5909c = i;
        this.f5910d = i2;
        this.f5911e = j2;
        this.f5912f = i3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2077d)) {
            return false;
        }
        C2073a aVar = (C2073a) ((C2077d) obj);
        if (!(this.f5908b == aVar.f5908b && this.f5909c == aVar.f5909c && this.f5910d == aVar.f5910d && this.f5911e == aVar.f5911e && this.f5912f == aVar.f5912f)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.f5908b;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f5909c) * 1000003) ^ this.f5910d) * 1000003;
        long j2 = this.f5911e;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f5912f;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("EventStoreConfig{maxStorageSizeInBytes=");
        a.append(this.f5908b);
        a.append(", loadBatchSize=");
        a.append(this.f5909c);
        a.append(", criticalSectionEnterTimeoutMs=");
        a.append(this.f5910d);
        a.append(", eventCleanUpAge=");
        a.append(this.f5911e);
        a.append(", maxBlobByteSizePerRow=");
        return C1965a.m4753a(a, this.f5912f, Objects.ARRAY_END);
    }
}
