package p213q.p217b.p218a.p219a.p222f.p225r.p226h;

import java.util.Set;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2057f.C2058a;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2057f.C2058a.C2059a;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2057f.C2060b;

/* renamed from: q.b.a.a.f.r.h.c */
public final class C2052c extends C2058a {

    /* renamed from: a */
    public final long f5854a;

    /* renamed from: b */
    public final long f5855b;

    /* renamed from: c */
    public final Set<C2060b> f5856c;

    /* renamed from: q.b.a.a.f.r.h.c$b */
    public static final class C2054b extends C2059a {

        /* renamed from: a */
        public Long f5857a;

        /* renamed from: b */
        public Long f5858b;

        /* renamed from: c */
        public Set<C2060b> f5859c;

        /* renamed from: a */
        public C2059a mo7040a(long j) {
            this.f5857a = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C2058a mo7041a() {
            String str = this.f5857a == null ? " delta" : Objects.EMPTY_STRING;
            if (this.f5858b == null) {
                str = C1965a.m4751a(str, " maxAllowedDelay");
            }
            if (this.f5859c == null) {
                str = C1965a.m4751a(str, " flags");
            }
            if (str.isEmpty()) {
                C2052c cVar = new C2052c(this.f5857a.longValue(), this.f5858b.longValue(), this.f5859c, null);
                return cVar;
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
        }

        /* renamed from: b */
        public C2059a mo7042b(long j) {
            this.f5858b = Long.valueOf(j);
            return this;
        }
    }

    public /* synthetic */ C2052c(long j, long j2, Set set, C2053a aVar) {
        this.f5854a = j;
        this.f5855b = j2;
        this.f5856c = set;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2058a)) {
            return false;
        }
        C2052c cVar = (C2052c) ((C2058a) obj);
        if (!(this.f5854a == cVar.f5854a && this.f5855b == cVar.f5855b && this.f5856c.equals(cVar.f5856c))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.f5854a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f5855b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f5856c.hashCode();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ConfigValue{delta=");
        a.append(this.f5854a);
        a.append(", maxAllowedDelay=");
        a.append(this.f5855b);
        a.append(", flags=");
        a.append(this.f5856c);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
