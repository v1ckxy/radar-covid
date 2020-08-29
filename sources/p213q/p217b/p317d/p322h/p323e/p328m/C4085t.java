package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4115e;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4115e.C4116a;

/* renamed from: q.b.d.h.e.m.t */
public final class C4085t extends C4115e {

    /* renamed from: a */
    public final int f9966a;

    /* renamed from: b */
    public final String f9967b;

    /* renamed from: c */
    public final String f9968c;

    /* renamed from: d */
    public final boolean f9969d;

    /* renamed from: q.b.d.h.e.m.t$b */
    public static final class C4087b extends C4116a {

        /* renamed from: a */
        public Integer f9970a;

        /* renamed from: b */
        public String f9971b;

        /* renamed from: c */
        public String f9972c;

        /* renamed from: d */
        public Boolean f9973d;

        /* renamed from: a */
        public C4115e mo10292a() {
            String str = this.f9970a == null ? " platform" : Objects.EMPTY_STRING;
            if (this.f9971b == null) {
                str = C1965a.m4751a(str, " version");
            }
            if (this.f9972c == null) {
                str = C1965a.m4751a(str, " buildVersion");
            }
            if (this.f9973d == null) {
                str = C1965a.m4751a(str, " jailbroken");
            }
            if (str.isEmpty()) {
                C4085t tVar = new C4085t(this.f9970a.intValue(), this.f9971b, this.f9972c, this.f9973d.booleanValue(), null);
                return tVar;
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
        }
    }

    public /* synthetic */ C4085t(int i, String str, String str2, boolean z, C4086a aVar) {
        this.f9966a = i;
        this.f9967b = str;
        this.f9968c = str2;
        this.f9969d = z;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4115e)) {
            return false;
        }
        C4085t tVar = (C4085t) ((C4115e) obj);
        if (this.f9966a != tVar.f9966a || !this.f9967b.equals(tVar.f9967b) || !this.f9968c.equals(tVar.f9968c) || this.f9969d != tVar.f9969d) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((this.f9966a ^ 1000003) * 1000003) ^ this.f9967b.hashCode()) * 1000003) ^ this.f9968c.hashCode()) * 1000003) ^ (this.f9969d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("OperatingSystem{platform=");
        a.append(this.f9966a);
        a.append(", version=");
        a.append(this.f9967b);
        a.append(", buildVersion=");
        a.append(this.f9968c);
        a.append(", jailbroken=");
        a.append(this.f9969d);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
