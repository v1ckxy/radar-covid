package p213q.p217b.p317d.p350n.p351o;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p350n.p351o.C4296c.C4297a;
import p213q.p217b.p317d.p350n.p351o.C4298d.C4299a;

/* renamed from: q.b.d.n.o.a */
public final class C4292a extends C4298d {

    /* renamed from: a */
    public final String f10316a;

    /* renamed from: b */
    public final C4297a f10317b;

    /* renamed from: c */
    public final String f10318c;

    /* renamed from: d */
    public final String f10319d;

    /* renamed from: e */
    public final long f10320e;

    /* renamed from: f */
    public final long f10321f;

    /* renamed from: g */
    public final String f10322g;

    /* renamed from: q.b.d.n.o.a$b */
    public static final class C4294b extends C4299a {

        /* renamed from: a */
        public String f10323a;

        /* renamed from: b */
        public C4297a f10324b;

        /* renamed from: c */
        public String f10325c;

        /* renamed from: d */
        public String f10326d;

        /* renamed from: e */
        public Long f10327e;

        /* renamed from: f */
        public Long f10328f;

        /* renamed from: g */
        public String f10329g;

        public C4294b() {
        }

        public /* synthetic */ C4294b(C4298d dVar, C4293a aVar) {
            C4292a aVar2 = (C4292a) dVar;
            this.f10323a = aVar2.f10316a;
            this.f10324b = aVar2.f10317b;
            this.f10325c = aVar2.f10318c;
            this.f10326d = aVar2.f10319d;
            this.f10327e = Long.valueOf(aVar2.f10320e);
            this.f10328f = Long.valueOf(aVar2.f10321f);
            this.f10329g = aVar2.f10322g;
        }

        /* renamed from: a */
        public C4299a mo10503a(long j) {
            this.f10327e = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C4299a mo10504a(C4297a aVar) {
            if (aVar != null) {
                this.f10324b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        /* renamed from: a */
        public C4298d mo10505a() {
            String str = this.f10324b == null ? " registrationStatus" : Objects.EMPTY_STRING;
            if (this.f10327e == null) {
                str = C1965a.m4751a(str, " expiresInSecs");
            }
            if (this.f10328f == null) {
                str = C1965a.m4751a(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                C4292a aVar = new C4292a(this.f10323a, this.f10324b, this.f10325c, this.f10326d, this.f10327e.longValue(), this.f10328f.longValue(), this.f10329g, null);
                return aVar;
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
        }

        /* renamed from: b */
        public C4299a mo10506b(long j) {
            this.f10328f = Long.valueOf(j);
            return this;
        }
    }

    public /* synthetic */ C4292a(String str, C4297a aVar, String str2, String str3, long j, long j2, String str4, C4293a aVar2) {
        this.f10316a = str;
        this.f10317b = aVar;
        this.f10318c = str2;
        this.f10319d = str3;
        this.f10320e = j;
        this.f10321f = j2;
        this.f10322g = str4;
    }

    /* renamed from: c */
    public C4299a mo10499c() {
        return new C4294b(this, null);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4298d)) {
            return false;
        }
        C4298d dVar = (C4298d) obj;
        String str = this.f10316a;
        if (str != null ? str.equals(((C4292a) dVar).f10316a) : ((C4292a) dVar).f10316a == null) {
            if (this.f10317b.equals(((C4292a) dVar).f10317b)) {
                String str2 = this.f10318c;
                if (str2 != null ? str2.equals(((C4292a) dVar).f10318c) : ((C4292a) dVar).f10318c == null) {
                    String str3 = this.f10319d;
                    if (str3 != null ? str3.equals(((C4292a) dVar).f10319d) : ((C4292a) dVar).f10319d == null) {
                        C4292a aVar = (C4292a) dVar;
                        if (this.f10320e == aVar.f10320e && this.f10321f == aVar.f10321f) {
                            String str4 = this.f10322g;
                            if (str4 != null) {
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
        String str = this.f10316a;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f10317b.hashCode()) * 1000003;
        String str2 = this.f10318c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10319d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f10320e;
        int i2 = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f10321f;
        int i3 = (i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f10322g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 ^ i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("PersistedInstallationEntry{firebaseInstallationId=");
        a.append(this.f10316a);
        a.append(", registrationStatus=");
        a.append(this.f10317b);
        a.append(", authToken=");
        a.append(this.f10318c);
        a.append(", refreshToken=");
        a.append(this.f10319d);
        a.append(", expiresInSecs=");
        a.append(this.f10320e);
        a.append(", tokenCreationEpochInSecs=");
        a.append(this.f10321f);
        a.append(", fisError=");
        return C1965a.m4754a(a, this.f10322g, Objects.ARRAY_END);
    }
}
