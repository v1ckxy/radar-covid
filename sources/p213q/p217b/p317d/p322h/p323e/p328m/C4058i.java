package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4099c;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4099c.C4100a;

/* renamed from: q.b.d.h.e.m.i */
public final class C4058i extends C4099c {

    /* renamed from: a */
    public final int f9888a;

    /* renamed from: b */
    public final String f9889b;

    /* renamed from: c */
    public final int f9890c;

    /* renamed from: d */
    public final long f9891d;

    /* renamed from: e */
    public final long f9892e;

    /* renamed from: f */
    public final boolean f9893f;

    /* renamed from: g */
    public final int f9894g;

    /* renamed from: h */
    public final String f9895h;

    /* renamed from: i */
    public final String f9896i;

    /* renamed from: q.b.d.h.e.m.i$b */
    public static final class C4060b extends C4100a {

        /* renamed from: a */
        public Integer f9897a;

        /* renamed from: b */
        public String f9898b;

        /* renamed from: c */
        public Integer f9899c;

        /* renamed from: d */
        public Long f9900d;

        /* renamed from: e */
        public Long f9901e;

        /* renamed from: f */
        public Boolean f9902f;

        /* renamed from: g */
        public Integer f9903g;

        /* renamed from: h */
        public String f9904h;

        /* renamed from: i */
        public String f9905i;

        /* renamed from: a */
        public C4099c mo10253a() {
            String str = this.f9897a == null ? " arch" : Objects.EMPTY_STRING;
            if (this.f9898b == null) {
                str = C1965a.m4751a(str, " model");
            }
            if (this.f9899c == null) {
                str = C1965a.m4751a(str, " cores");
            }
            if (this.f9900d == null) {
                str = C1965a.m4751a(str, " ram");
            }
            if (this.f9901e == null) {
                str = C1965a.m4751a(str, " diskSpace");
            }
            if (this.f9902f == null) {
                str = C1965a.m4751a(str, " simulator");
            }
            if (this.f9903g == null) {
                str = C1965a.m4751a(str, " state");
            }
            if (this.f9904h == null) {
                str = C1965a.m4751a(str, " manufacturer");
            }
            if (this.f9905i == null) {
                str = C1965a.m4751a(str, " modelClass");
            }
            if (str.isEmpty()) {
                C4058i iVar = new C4058i(this.f9897a.intValue(), this.f9898b, this.f9899c.intValue(), this.f9900d.longValue(), this.f9901e.longValue(), this.f9902f.booleanValue(), this.f9903g.intValue(), this.f9904h, this.f9905i, null);
                return iVar;
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
        }
    }

    public /* synthetic */ C4058i(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3, C4059a aVar) {
        this.f9888a = i;
        this.f9889b = str;
        this.f9890c = i2;
        this.f9891d = j;
        this.f9892e = j2;
        this.f9893f = z;
        this.f9894g = i3;
        this.f9895h = str2;
        this.f9896i = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4099c)) {
            return false;
        }
        C4058i iVar = (C4058i) ((C4099c) obj);
        if (!(this.f9888a == iVar.f9888a && this.f9889b.equals(iVar.f9889b) && this.f9890c == iVar.f9890c && this.f9891d == iVar.f9891d && this.f9892e == iVar.f9892e && this.f9893f == iVar.f9893f && this.f9894g == iVar.f9894g && this.f9895h.equals(iVar.f9895h) && this.f9896i.equals(iVar.f9896i))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (((((this.f9888a ^ 1000003) * 1000003) ^ this.f9889b.hashCode()) * 1000003) ^ this.f9890c) * 1000003;
        long j = this.f9891d;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f9892e;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f9893f ? 1231 : 1237)) * 1000003) ^ this.f9894g) * 1000003) ^ this.f9895h.hashCode()) * 1000003) ^ this.f9896i.hashCode();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Device{arch=");
        a.append(this.f9888a);
        a.append(", model=");
        a.append(this.f9889b);
        a.append(", cores=");
        a.append(this.f9890c);
        a.append(", ram=");
        a.append(this.f9891d);
        a.append(", diskSpace=");
        a.append(this.f9892e);
        a.append(", simulator=");
        a.append(this.f9893f);
        a.append(", state=");
        a.append(this.f9894g);
        a.append(", manufacturer=");
        a.append(this.f9895h);
        a.append(", modelClass=");
        return C1965a.m4754a(a, this.f9896i, Objects.ARRAY_END);
    }
}
