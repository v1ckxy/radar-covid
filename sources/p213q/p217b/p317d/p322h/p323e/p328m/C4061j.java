package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4111b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4112c;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4114d;

/* renamed from: q.b.d.h.e.m.j */
public final class C4061j extends C4101d {

    /* renamed from: a */
    public final long f9906a;

    /* renamed from: b */
    public final String f9907b;

    /* renamed from: c */
    public final C4102a f9908c;

    /* renamed from: d */
    public final C4112c f9909d;

    /* renamed from: e */
    public final C4114d f9910e;

    /* renamed from: q.b.d.h.e.m.j$b */
    public static final class C4063b extends C4111b {

        /* renamed from: a */
        public Long f9911a;

        /* renamed from: b */
        public String f9912b;

        /* renamed from: c */
        public C4102a f9913c;

        /* renamed from: d */
        public C4112c f9914d;

        /* renamed from: e */
        public C4114d f9915e;

        public C4063b() {
        }

        public /* synthetic */ C4063b(C4101d dVar, C4062a aVar) {
            C4061j jVar = (C4061j) dVar;
            this.f9911a = Long.valueOf(jVar.f9906a);
            this.f9912b = jVar.f9907b;
            this.f9913c = jVar.f9908c;
            this.f9914d = jVar.f9909d;
            this.f9915e = jVar.f9910e;
        }

        /* renamed from: a */
        public C4111b mo10257a(C4102a aVar) {
            if (aVar != null) {
                this.f9913c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        /* renamed from: a */
        public C4101d mo10258a() {
            String str = this.f9911a == null ? " timestamp" : Objects.EMPTY_STRING;
            if (this.f9912b == null) {
                str = C1965a.m4751a(str, " type");
            }
            if (this.f9913c == null) {
                str = C1965a.m4751a(str, " app");
            }
            if (this.f9914d == null) {
                str = C1965a.m4751a(str, " device");
            }
            if (str.isEmpty()) {
                C4061j jVar = new C4061j(this.f9911a.longValue(), this.f9912b, this.f9913c, this.f9914d, this.f9915e, null);
                return jVar;
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
        }
    }

    public /* synthetic */ C4061j(long j, String str, C4102a aVar, C4112c cVar, C4114d dVar, C4062a aVar2) {
        this.f9906a = j;
        this.f9907b = str;
        this.f9908c = aVar;
        this.f9909d = cVar;
        this.f9910e = dVar;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4101d)) {
            return false;
        }
        C4101d dVar = (C4101d) obj;
        if (this.f9906a == ((C4061j) dVar).f9906a) {
            C4061j jVar = (C4061j) dVar;
            if (this.f9907b.equals(jVar.f9907b) && this.f9908c.equals(jVar.f9908c) && this.f9909d.equals(jVar.f9909d)) {
                C4114d dVar2 = this.f9910e;
                if (dVar2 != null) {
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        long j = this.f9906a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f9907b.hashCode()) * 1000003) ^ this.f9908c.hashCode()) * 1000003) ^ this.f9909d.hashCode()) * 1000003;
        C4114d dVar = this.f9910e;
        return hashCode ^ (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Event{timestamp=");
        a.append(this.f9906a);
        a.append(", type=");
        a.append(this.f9907b);
        a.append(", app=");
        a.append(this.f9908c);
        a.append(", device=");
        a.append(this.f9909d);
        a.append(", log=");
        a.append(this.f9910e);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
