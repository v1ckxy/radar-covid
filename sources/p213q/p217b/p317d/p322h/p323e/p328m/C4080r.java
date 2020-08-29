package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4112c;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4112c.C4113a;

/* renamed from: q.b.d.h.e.m.r */
public final class C4080r extends C4112c {

    /* renamed from: a */
    public final Double f9953a;

    /* renamed from: b */
    public final int f9954b;

    /* renamed from: c */
    public final boolean f9955c;

    /* renamed from: d */
    public final int f9956d;

    /* renamed from: e */
    public final long f9957e;

    /* renamed from: f */
    public final long f9958f;

    /* renamed from: q.b.d.h.e.m.r$b */
    public static final class C4082b extends C4113a {

        /* renamed from: a */
        public Double f9959a;

        /* renamed from: b */
        public Integer f9960b;

        /* renamed from: c */
        public Boolean f9961c;

        /* renamed from: d */
        public Integer f9962d;

        /* renamed from: e */
        public Long f9963e;

        /* renamed from: f */
        public Long f9964f;

        /* renamed from: a */
        public C4112c mo10285a() {
            String str = this.f9960b == null ? " batteryVelocity" : Objects.EMPTY_STRING;
            if (this.f9961c == null) {
                str = C1965a.m4751a(str, " proximityOn");
            }
            if (this.f9962d == null) {
                str = C1965a.m4751a(str, " orientation");
            }
            if (this.f9963e == null) {
                str = C1965a.m4751a(str, " ramUsed");
            }
            if (this.f9964f == null) {
                str = C1965a.m4751a(str, " diskUsed");
            }
            if (str.isEmpty()) {
                C4080r rVar = new C4080r(this.f9959a, this.f9960b.intValue(), this.f9961c.booleanValue(), this.f9962d.intValue(), this.f9963e.longValue(), this.f9964f.longValue(), null);
                return rVar;
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
        }
    }

    public /* synthetic */ C4080r(Double d, int i, boolean z, int i2, long j, long j2, C4081a aVar) {
        this.f9953a = d;
        this.f9954b = i;
        this.f9955c = z;
        this.f9956d = i2;
        this.f9957e = j;
        this.f9958f = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r7.f9958f == r8.f9958f) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4112c
            r2 = 0
            if (r1 == 0) goto L_0x0049
            q.b.d.h.e.m.v$d$d$c r8 = (p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4112c) r8
            java.lang.Double r1 = r7.f9953a
            if (r1 != 0) goto L_0x0017
            r1 = r8
            q.b.d.h.e.m.r r1 = (p213q.p217b.p317d.p322h.p323e.p328m.C4080r) r1
            java.lang.Double r1 = r1.f9953a
            if (r1 != 0) goto L_0x0047
            goto L_0x0022
        L_0x0017:
            r3 = r8
            q.b.d.h.e.m.r r3 = (p213q.p217b.p317d.p322h.p323e.p328m.C4080r) r3
            java.lang.Double r3 = r3.f9953a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0047
        L_0x0022:
            int r1 = r7.f9954b
            q.b.d.h.e.m.r r8 = (p213q.p217b.p317d.p322h.p323e.p328m.C4080r) r8
            int r3 = r8.f9954b
            if (r1 != r3) goto L_0x0047
            boolean r1 = r7.f9955c
            boolean r3 = r8.f9955c
            if (r1 != r3) goto L_0x0047
            int r1 = r7.f9956d
            int r3 = r8.f9956d
            if (r1 != r3) goto L_0x0047
            long r3 = r7.f9957e
            long r5 = r8.f9957e
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0047
            long r3 = r7.f9958f
            long r5 = r8.f9958f
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r0 = r2
        L_0x0048:
            return r0
        L_0x0049:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p328m.C4080r.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Double d = this.f9953a;
        int hashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f9954b) * 1000003) ^ (this.f9955c ? 1231 : 1237)) * 1000003) ^ this.f9956d) * 1000003;
        long j = this.f9957e;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f9958f;
        return i ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Device{batteryLevel=");
        a.append(this.f9953a);
        a.append(", batteryVelocity=");
        a.append(this.f9954b);
        a.append(", proximityOn=");
        a.append(this.f9955c);
        a.append(", orientation=");
        a.append(this.f9956d);
        a.append(", ramUsed=");
        a.append(this.f9957e);
        a.append(", diskUsed=");
        a.append(this.f9958f);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
