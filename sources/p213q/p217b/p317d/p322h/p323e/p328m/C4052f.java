package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4096a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4098b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4099c;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4115e;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4117f;

/* renamed from: q.b.d.h.e.m.f */
public final class C4052f extends C4095d {

    /* renamed from: a */
    public final String f9861a;

    /* renamed from: b */
    public final String f9862b;

    /* renamed from: c */
    public final long f9863c;

    /* renamed from: d */
    public final Long f9864d;

    /* renamed from: e */
    public final boolean f9865e;

    /* renamed from: f */
    public final C4096a f9866f;

    /* renamed from: g */
    public final C4117f f9867g;

    /* renamed from: h */
    public final C4115e f9868h;

    /* renamed from: i */
    public final C4099c f9869i;

    /* renamed from: j */
    public final C4119w<C4101d> f9870j;

    /* renamed from: k */
    public final int f9871k;

    /* renamed from: q.b.d.h.e.m.f$b */
    public static final class C4054b extends C4098b {

        /* renamed from: a */
        public String f9872a;

        /* renamed from: b */
        public String f9873b;

        /* renamed from: c */
        public Long f9874c;

        /* renamed from: d */
        public Long f9875d;

        /* renamed from: e */
        public Boolean f9876e;

        /* renamed from: f */
        public C4096a f9877f;

        /* renamed from: g */
        public C4117f f9878g;

        /* renamed from: h */
        public C4115e f9879h;

        /* renamed from: i */
        public C4099c f9880i;

        /* renamed from: j */
        public C4119w<C4101d> f9881j;

        /* renamed from: k */
        public Integer f9882k;

        public C4054b() {
        }

        public /* synthetic */ C4054b(C4095d dVar, C4053a aVar) {
            C4052f fVar = (C4052f) dVar;
            this.f9872a = fVar.f9861a;
            this.f9873b = fVar.f9862b;
            this.f9874c = Long.valueOf(fVar.f9863c);
            this.f9875d = fVar.f9864d;
            this.f9876e = Boolean.valueOf(fVar.f9865e);
            this.f9877f = fVar.f9866f;
            this.f9878g = fVar.f9867g;
            this.f9879h = fVar.f9868h;
            this.f9880i = fVar.f9869i;
            this.f9881j = fVar.f9870j;
            this.f9882k = Integer.valueOf(fVar.f9871k);
        }

        /* renamed from: a */
        public C4098b mo10242a(boolean z) {
            this.f9876e = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public C4095d mo10243a() {
            String str = this.f9872a == null ? " generator" : Objects.EMPTY_STRING;
            if (this.f9873b == null) {
                str = C1965a.m4751a(str, " identifier");
            }
            if (this.f9874c == null) {
                str = C1965a.m4751a(str, " startedAt");
            }
            if (this.f9876e == null) {
                str = C1965a.m4751a(str, " crashed");
            }
            if (this.f9877f == null) {
                str = C1965a.m4751a(str, " app");
            }
            if (this.f9882k == null) {
                str = C1965a.m4751a(str, " generatorType");
            }
            if (str.isEmpty()) {
                C4052f fVar = new C4052f(this.f9872a, this.f9873b, this.f9874c.longValue(), this.f9875d, this.f9876e.booleanValue(), this.f9877f, this.f9878g, this.f9879h, this.f9880i, this.f9881j, this.f9882k.intValue(), null);
                return fVar;
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
        }
    }

    public /* synthetic */ C4052f(String str, String str2, long j, Long l, boolean z, C4096a aVar, C4117f fVar, C4115e eVar, C4099c cVar, C4119w wVar, int i, C4053a aVar2) {
        this.f9861a = str;
        this.f9862b = str2;
        this.f9863c = j;
        this.f9864d = l;
        this.f9865e = z;
        this.f9866f = aVar;
        this.f9867g = fVar;
        this.f9868h = eVar;
        this.f9869i = cVar;
        this.f9870j = wVar;
        this.f9871k = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0095, code lost:
        if (r7.f9871k == r8.f9871k) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d
            r2 = 0
            if (r1 == 0) goto L_0x009a
            q.b.d.h.e.m.v$d r8 = (p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d) r8
            java.lang.String r1 = r7.f9861a
            r3 = r8
            q.b.d.h.e.m.f r3 = (p213q.p217b.p317d.p322h.p323e.p328m.C4052f) r3
            java.lang.String r3 = r3.f9861a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = r7.f9862b
            q.b.d.h.e.m.f r8 = (p213q.p217b.p317d.p322h.p323e.p328m.C4052f) r8
            java.lang.String r3 = r8.f9862b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0098
            long r3 = r7.f9863c
            long r5 = r8.f9863c
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0098
            java.lang.Long r1 = r7.f9864d
            if (r1 != 0) goto L_0x0035
            java.lang.Long r1 = r8.f9864d
            if (r1 != 0) goto L_0x0098
            goto L_0x003d
        L_0x0035:
            java.lang.Long r3 = r8.f9864d
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0098
        L_0x003d:
            boolean r1 = r7.f9865e
            boolean r3 = r8.f9865e
            if (r1 != r3) goto L_0x0098
            q.b.d.h.e.m.v$d$a r1 = r7.f9866f
            q.b.d.h.e.m.v$d$a r3 = r8.f9866f
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0098
            q.b.d.h.e.m.v$d$f r1 = r7.f9867g
            if (r1 != 0) goto L_0x0056
            q.b.d.h.e.m.v$d$f r1 = r8.f9867g
            if (r1 != 0) goto L_0x0098
            goto L_0x005e
        L_0x0056:
            q.b.d.h.e.m.v$d$f r3 = r8.f9867g
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0098
        L_0x005e:
            q.b.d.h.e.m.v$d$e r1 = r7.f9868h
            if (r1 != 0) goto L_0x0067
            q.b.d.h.e.m.v$d$e r1 = r8.f9868h
            if (r1 != 0) goto L_0x0098
            goto L_0x006f
        L_0x0067:
            q.b.d.h.e.m.v$d$e r3 = r8.f9868h
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0098
        L_0x006f:
            q.b.d.h.e.m.v$d$c r1 = r7.f9869i
            if (r1 != 0) goto L_0x0078
            q.b.d.h.e.m.v$d$c r1 = r8.f9869i
            if (r1 != 0) goto L_0x0098
            goto L_0x0080
        L_0x0078:
            q.b.d.h.e.m.v$d$c r3 = r8.f9869i
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0098
        L_0x0080:
            q.b.d.h.e.m.w<q.b.d.h.e.m.v$d$d> r1 = r7.f9870j
            if (r1 != 0) goto L_0x0089
            q.b.d.h.e.m.w<q.b.d.h.e.m.v$d$d> r1 = r8.f9870j
            if (r1 != 0) goto L_0x0098
            goto L_0x0091
        L_0x0089:
            q.b.d.h.e.m.w<q.b.d.h.e.m.v$d$d> r3 = r8.f9870j
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0098
        L_0x0091:
            int r1 = r7.f9871k
            int r8 = r8.f9871k
            if (r1 != r8) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r0 = r2
        L_0x0099:
            return r0
        L_0x009a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p328m.C4052f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (((this.f9861a.hashCode() ^ 1000003) * 1000003) ^ this.f9862b.hashCode()) * 1000003;
        long j = this.f9863c;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f9864d;
        int i2 = 0;
        int hashCode2 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f9865e ? 1231 : 1237)) * 1000003) ^ this.f9866f.hashCode()) * 1000003;
        C4117f fVar = this.f9867g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        C4115e eVar = this.f9868h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        C4099c cVar = this.f9869i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        C4119w<C4101d> wVar = this.f9870j;
        if (wVar != null) {
            i2 = wVar.hashCode();
        }
        return ((hashCode5 ^ i2) * 1000003) ^ this.f9871k;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Session{generator=");
        a.append(this.f9861a);
        a.append(", identifier=");
        a.append(this.f9862b);
        a.append(", startedAt=");
        a.append(this.f9863c);
        a.append(", endedAt=");
        a.append(this.f9864d);
        a.append(", crashed=");
        a.append(this.f9865e);
        a.append(", app=");
        a.append(this.f9866f);
        a.append(", user=");
        a.append(this.f9867g);
        a.append(", os=");
        a.append(this.f9868h);
        a.append(", device=");
        a.append(this.f9869i);
        a.append(", events=");
        a.append(this.f9870j);
        a.append(", generatorType=");
        return C1965a.m4753a(a, this.f9871k, Objects.ARRAY_END);
    }
}
