package p213q.p217b.p218a.p219a.p222f;

import java.util.Map;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.p222f.C2013f.C2014a;

/* renamed from: q.b.a.a.f.a */
public final class C2003a extends C2013f {

    /* renamed from: a */
    public final String f5750a;

    /* renamed from: b */
    public final Integer f5751b;

    /* renamed from: c */
    public final C2012e f5752c;

    /* renamed from: d */
    public final long f5753d;

    /* renamed from: e */
    public final long f5754e;

    /* renamed from: f */
    public final Map<String, String> f5755f;

    /* renamed from: q.b.a.a.f.a$b */
    public static final class C2005b extends C2014a {

        /* renamed from: a */
        public String f5756a;

        /* renamed from: b */
        public Integer f5757b;

        /* renamed from: c */
        public C2012e f5758c;

        /* renamed from: d */
        public Long f5759d;

        /* renamed from: e */
        public Long f5760e;

        /* renamed from: f */
        public Map<String, String> f5761f;

        /* renamed from: a */
        public C2014a mo6997a(long j) {
            this.f5759d = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C2014a mo6998a(String str) {
            if (str != null) {
                this.f5756a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* renamed from: a */
        public C2014a mo6999a(C2012e eVar) {
            if (eVar != null) {
                this.f5758c = eVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        /* renamed from: a */
        public C2013f mo7000a() {
            String str = this.f5756a == null ? " transportName" : Objects.EMPTY_STRING;
            if (this.f5758c == null) {
                str = C1965a.m4751a(str, " encodedPayload");
            }
            if (this.f5759d == null) {
                str = C1965a.m4751a(str, " eventMillis");
            }
            if (this.f5760e == null) {
                str = C1965a.m4751a(str, " uptimeMillis");
            }
            if (this.f5761f == null) {
                str = C1965a.m4751a(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                C2003a aVar = new C2003a(this.f5756a, this.f5757b, this.f5758c, this.f5759d.longValue(), this.f5760e.longValue(), this.f5761f, null);
                return aVar;
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
        }

        /* renamed from: b */
        public Map<String, String> mo7001b() {
            Map<String, String> map = this.f5761f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* renamed from: b */
        public C2014a mo7002b(long j) {
            this.f5760e = Long.valueOf(j);
            return this;
        }
    }

    public /* synthetic */ C2003a(String str, Integer num, C2012e eVar, long j, long j2, Map map, C2004a aVar) {
        this.f5750a = str;
        this.f5751b = num;
        this.f5752c = eVar;
        this.f5753d = j;
        this.f5754e = j2;
        this.f5755f = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r7.f5755f.equals(r8.f5755f) != false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p213q.p217b.p218a.p219a.p222f.C2013f
            r2 = 0
            if (r1 == 0) goto L_0x0058
            q.b.a.a.f.f r8 = (p213q.p217b.p218a.p219a.p222f.C2013f) r8
            java.lang.String r1 = r7.f5750a
            r3 = r8
            q.b.a.a.f.a r3 = (p213q.p217b.p218a.p219a.p222f.C2003a) r3
            java.lang.String r3 = r3.f5750a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            java.lang.Integer r1 = r7.f5751b
            if (r1 != 0) goto L_0x0024
            r1 = r8
            q.b.a.a.f.a r1 = (p213q.p217b.p218a.p219a.p222f.C2003a) r1
            java.lang.Integer r1 = r1.f5751b
            if (r1 != 0) goto L_0x0056
            goto L_0x002f
        L_0x0024:
            r3 = r8
            q.b.a.a.f.a r3 = (p213q.p217b.p218a.p219a.p222f.C2003a) r3
            java.lang.Integer r3 = r3.f5751b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x002f:
            q.b.a.a.f.e r1 = r7.f5752c
            q.b.a.a.f.a r8 = (p213q.p217b.p218a.p219a.p222f.C2003a) r8
            q.b.a.a.f.e r3 = r8.f5752c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            long r3 = r7.f5753d
            long r5 = r8.f5753d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0056
            long r3 = r7.f5754e
            long r5 = r8.f5754e
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f5755f
            java.util.Map<java.lang.String, java.lang.String> r8 = r8.f5755f
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = r2
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p219a.p222f.C2003a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.f5750a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f5751b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f5752c.hashCode()) * 1000003;
        long j = this.f5753d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f5754e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f5755f.hashCode();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("EventInternal{transportName=");
        a.append(this.f5750a);
        a.append(", code=");
        a.append(this.f5751b);
        a.append(", encodedPayload=");
        a.append(this.f5752c);
        a.append(", eventMillis=");
        a.append(this.f5753d);
        a.append(", uptimeMillis=");
        a.append(this.f5754e);
        a.append(", autoMetadata=");
        a.append(this.f5755f);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
