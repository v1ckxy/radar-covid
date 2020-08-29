package p213q.p217b.p218a.p219a.p220e.p221b;

import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.a.e.b.g */
public final class C1984g extends C1992m {

    /* renamed from: a */
    public final long f5673a;

    /* renamed from: b */
    public final long f5674b;

    /* renamed from: c */
    public final C1988k f5675c;

    /* renamed from: d */
    public final Integer f5676d;

    /* renamed from: e */
    public final String f5677e;

    /* renamed from: f */
    public final List<C1990l> f5678f;

    /* renamed from: g */
    public final C1997p f5679g;

    public /* synthetic */ C1984g(long j, long j2, C1988k kVar, Integer num, String str, List list, C1997p pVar) {
        this.f5673a = j;
        this.f5674b = j2;
        this.f5675c = kVar;
        this.f5676d = num;
        this.f5677e = str;
        this.f5678f = list;
        this.f5679g = pVar;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1992m)) {
            return false;
        }
        C1984g gVar = (C1984g) ((C1992m) obj);
        if (this.f5673a == gVar.f5673a && this.f5674b == gVar.f5674b) {
            C1988k kVar = this.f5675c;
            if (kVar != null ? kVar.equals(gVar.f5675c) : gVar.f5675c == null) {
                Integer num = this.f5676d;
                if (num != null ? num.equals(gVar.f5676d) : gVar.f5676d == null) {
                    String str = this.f5677e;
                    if (str != null ? str.equals(gVar.f5677e) : gVar.f5677e == null) {
                        List<C1990l> list = this.f5678f;
                        if (list != null ? list.equals(gVar.f5678f) : gVar.f5678f == null) {
                            C1997p pVar = this.f5679g;
                            C1997p pVar2 = gVar.f5679g;
                            if (pVar != null) {
                            }
                        }
                    }
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        long j = this.f5673a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f5674b;
        int i2 = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        C1988k kVar = this.f5675c;
        int i3 = 0;
        int hashCode = (i2 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f5676d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f5677e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<C1990l> list = this.f5678f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        C1997p pVar = this.f5679g;
        if (pVar != null) {
            i3 = pVar.hashCode();
        }
        return hashCode4 ^ i3;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("LogRequest{requestTimeMs=");
        a.append(this.f5673a);
        a.append(", requestUptimeMs=");
        a.append(this.f5674b);
        a.append(", clientInfo=");
        a.append(this.f5675c);
        a.append(", logSource=");
        a.append(this.f5676d);
        a.append(", logSourceName=");
        a.append(this.f5677e);
        a.append(", logEvents=");
        a.append(this.f5678f);
        a.append(", qosTier=");
        a.append(this.f5679g);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
