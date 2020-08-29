package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4108e.C4109a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4108e.C4109a.C4110a;

/* renamed from: q.b.d.h.e.m.q */
public final class C4077q extends C4109a {

    /* renamed from: a */
    public final long f9943a;

    /* renamed from: b */
    public final String f9944b;

    /* renamed from: c */
    public final String f9945c;

    /* renamed from: d */
    public final long f9946d;

    /* renamed from: e */
    public final int f9947e;

    /* renamed from: q.b.d.h.e.m.q$b */
    public static final class C4079b extends C4110a {

        /* renamed from: a */
        public Long f9948a;

        /* renamed from: b */
        public String f9949b;

        /* renamed from: c */
        public String f9950c;

        /* renamed from: d */
        public Long f9951d;

        /* renamed from: e */
        public Integer f9952e;

        /* renamed from: a */
        public C4109a mo10281a() {
            String str = this.f9948a == null ? " pc" : Objects.EMPTY_STRING;
            if (this.f9949b == null) {
                str = C1965a.m4751a(str, " symbol");
            }
            if (this.f9951d == null) {
                str = C1965a.m4751a(str, " offset");
            }
            if (this.f9952e == null) {
                str = C1965a.m4751a(str, " importance");
            }
            if (str.isEmpty()) {
                C4077q qVar = new C4077q(this.f9948a.longValue(), this.f9949b, this.f9950c, this.f9951d.longValue(), this.f9952e.intValue(), null);
                return qVar;
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
        }
    }

    public /* synthetic */ C4077q(long j, String str, String str2, long j2, int i, C4078a aVar) {
        this.f9943a = j;
        this.f9944b = str;
        this.f9945c = str2;
        this.f9946d = j2;
        this.f9947e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r7.f9947e == r8.f9947e) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4108e.C4109a
            r2 = 0
            if (r1 == 0) goto L_0x0041
            q.b.d.h.e.m.v$d$d$a$a$e$a r8 = (p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4108e.C4109a) r8
            long r3 = r7.f9943a
            q.b.d.h.e.m.q r8 = (p213q.p217b.p317d.p322h.p323e.p328m.C4077q) r8
            long r5 = r8.f9943a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x003f
            java.lang.String r1 = r7.f9944b
            java.lang.String r3 = r8.f9944b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = r7.f9945c
            if (r1 != 0) goto L_0x0028
            java.lang.String r1 = r8.f9945c
            if (r1 != 0) goto L_0x003f
            goto L_0x0030
        L_0x0028:
            java.lang.String r3 = r8.f9945c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003f
        L_0x0030:
            long r3 = r7.f9946d
            long r5 = r8.f9946d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x003f
            int r1 = r7.f9947e
            int r8 = r8.f9947e
            if (r1 != r8) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            return r0
        L_0x0041:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p328m.C4077q.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long j = this.f9943a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f9944b.hashCode()) * 1000003;
        String str = this.f9945c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.f9946d;
        return ((hashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f9947e;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Frame{pc=");
        a.append(this.f9943a);
        a.append(", symbol=");
        a.append(this.f9944b);
        a.append(", file=");
        a.append(this.f9945c);
        a.append(", offset=");
        a.append(this.f9946d);
        a.append(", importance=");
        return C1965a.m4753a(a, this.f9947e, Objects.ARRAY_END);
    }
}
