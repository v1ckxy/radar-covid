package p213q.p217b.p317d.p350n.p352p;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p350n.p352p.C4308e.C4309a;
import p213q.p217b.p317d.p350n.p352p.C4308e.C4310b;

/* renamed from: q.b.d.n.p.b */
public final class C4302b extends C4308e {

    /* renamed from: a */
    public final String f10346a;

    /* renamed from: b */
    public final long f10347b;

    /* renamed from: c */
    public final C4310b f10348c;

    /* renamed from: q.b.d.n.p.b$b */
    public static final class C4304b extends C4309a {

        /* renamed from: a */
        public String f10349a;

        /* renamed from: b */
        public Long f10350b;

        /* renamed from: c */
        public C4310b f10351c;

        /* renamed from: a */
        public C4309a mo10521a(long j) {
            this.f10350b = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C4308e mo10522a() {
            String str = this.f10350b == null ? " tokenExpirationTimestamp" : Objects.EMPTY_STRING;
            if (str.isEmpty()) {
                C4302b bVar = new C4302b(this.f10349a, this.f10350b.longValue(), this.f10351c, null);
                return bVar;
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
        }
    }

    public /* synthetic */ C4302b(String str, long j, C4310b bVar, C4303a aVar) {
        this.f10346a = str;
        this.f10347b = j;
        this.f10348c = bVar;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4308e)) {
            return false;
        }
        C4308e eVar = (C4308e) obj;
        String str = this.f10346a;
        if (str != null ? str.equals(((C4302b) eVar).f10346a) : ((C4302b) eVar).f10346a == null) {
            if (this.f10347b == ((C4302b) eVar).f10347b) {
                C4310b bVar = this.f10348c;
                C4302b bVar2 = (C4302b) eVar;
                if (bVar != null) {
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        String str = this.f10346a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        long j = this.f10347b;
        int i2 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        C4310b bVar = this.f10348c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("TokenResult{token=");
        a.append(this.f10346a);
        a.append(", tokenExpirationTimestamp=");
        a.append(this.f10347b);
        a.append(", responseCode=");
        a.append(this.f10348c);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
