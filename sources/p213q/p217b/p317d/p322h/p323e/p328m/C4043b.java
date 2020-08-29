package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4091a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4093c;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d;

/* renamed from: q.b.d.h.e.m.b */
public final class C4043b extends C4090v {

    /* renamed from: b */
    public final String f9839b;

    /* renamed from: c */
    public final String f9840c;

    /* renamed from: d */
    public final int f9841d;

    /* renamed from: e */
    public final String f9842e;

    /* renamed from: f */
    public final String f9843f;

    /* renamed from: g */
    public final String f9844g;

    /* renamed from: h */
    public final C4095d f9845h;

    /* renamed from: i */
    public final C4093c f9846i;

    /* renamed from: q.b.d.h.e.m.b$b */
    public static final class C4045b extends C4091a {

        /* renamed from: a */
        public String f9847a;

        /* renamed from: b */
        public String f9848b;

        /* renamed from: c */
        public Integer f9849c;

        /* renamed from: d */
        public String f9850d;

        /* renamed from: e */
        public String f9851e;

        /* renamed from: f */
        public String f9852f;

        /* renamed from: g */
        public C4095d f9853g;

        /* renamed from: h */
        public C4093c f9854h;

        public C4045b() {
        }

        public /* synthetic */ C4045b(C4090v vVar, C4044a aVar) {
            C4043b bVar = (C4043b) vVar;
            this.f9847a = bVar.f9839b;
            this.f9848b = bVar.f9840c;
            this.f9849c = Integer.valueOf(bVar.f9841d);
            this.f9850d = bVar.f9842e;
            this.f9851e = bVar.f9843f;
            this.f9852f = bVar.f9844g;
            this.f9853g = bVar.f9845h;
            this.f9854h = bVar.f9846i;
        }

        /* renamed from: a */
        public C4090v mo10229a() {
            String str = this.f9847a == null ? " sdkVersion" : Objects.EMPTY_STRING;
            if (this.f9848b == null) {
                str = C1965a.m4751a(str, " gmpAppId");
            }
            if (this.f9849c == null) {
                str = C1965a.m4751a(str, " platform");
            }
            if (this.f9850d == null) {
                str = C1965a.m4751a(str, " installationUuid");
            }
            if (this.f9851e == null) {
                str = C1965a.m4751a(str, " buildVersion");
            }
            if (this.f9852f == null) {
                str = C1965a.m4751a(str, " displayVersion");
            }
            if (str.isEmpty()) {
                C4043b bVar = new C4043b(this.f9847a, this.f9848b, this.f9849c.intValue(), this.f9850d, this.f9851e, this.f9852f, this.f9853g, this.f9854h, null);
                return bVar;
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
        }
    }

    public /* synthetic */ C4043b(String str, String str2, int i, String str3, String str4, String str5, C4095d dVar, C4093c cVar, C4044a aVar) {
        this.f9839b = str;
        this.f9840c = str2;
        this.f9841d = i;
        this.f9842e = str3;
        this.f9843f = str4;
        this.f9844g = str5;
        this.f9845h = dVar;
        this.f9846i = cVar;
    }

    /* renamed from: a */
    public C4091a mo10225a() {
        return new C4045b(this, null);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4090v)) {
            return false;
        }
        C4090v vVar = (C4090v) obj;
        if (this.f9839b.equals(((C4043b) vVar).f9839b)) {
            C4043b bVar = (C4043b) vVar;
            if (this.f9840c.equals(bVar.f9840c) && this.f9841d == bVar.f9841d && this.f9842e.equals(bVar.f9842e) && this.f9843f.equals(bVar.f9843f) && this.f9844g.equals(bVar.f9844g)) {
                C4095d dVar = this.f9845h;
                if (dVar != null ? dVar.equals(bVar.f9845h) : bVar.f9845h == null) {
                    C4093c cVar = this.f9846i;
                    if (cVar != null) {
                    }
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f9839b.hashCode() ^ 1000003) * 1000003) ^ this.f9840c.hashCode()) * 1000003) ^ this.f9841d) * 1000003) ^ this.f9842e.hashCode()) * 1000003) ^ this.f9843f.hashCode()) * 1000003) ^ this.f9844g.hashCode()) * 1000003;
        C4095d dVar = this.f9845h;
        int i = 0;
        int hashCode2 = (hashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        C4093c cVar = this.f9846i;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("CrashlyticsReport{sdkVersion=");
        a.append(this.f9839b);
        a.append(", gmpAppId=");
        a.append(this.f9840c);
        a.append(", platform=");
        a.append(this.f9841d);
        a.append(", installationUuid=");
        a.append(this.f9842e);
        a.append(", buildVersion=");
        a.append(this.f9843f);
        a.append(", displayVersion=");
        a.append(this.f9844g);
        a.append(", session=");
        a.append(this.f9845h);
        a.append(", ndkPayload=");
        a.append(this.f9846i);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
