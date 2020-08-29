package p213q.p217b.p218a.p219a.p222f;

import java.util.Arrays;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.C1967b;
import p213q.p217b.p218a.p219a.p222f.C2018i.C2019a;

/* renamed from: q.b.a.a.f.b */
public final class C2006b extends C2018i {

    /* renamed from: a */
    public final String f5762a;

    /* renamed from: b */
    public final byte[] f5763b;

    /* renamed from: c */
    public final C1967b f5764c;

    /* renamed from: q.b.a.a.f.b$b */
    public static final class C2008b extends C2019a {

        /* renamed from: a */
        public String f5765a;

        /* renamed from: b */
        public byte[] f5766b;

        /* renamed from: c */
        public C1967b f5767c;

        /* renamed from: a */
        public C2019a mo7005a(String str) {
            if (str != null) {
                this.f5765a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        /* renamed from: a */
        public C2019a mo7006a(C1967b bVar) {
            if (bVar != null) {
                this.f5767c = bVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }

        /* renamed from: a */
        public C2018i mo7007a() {
            String str = this.f5765a == null ? " backendName" : Objects.EMPTY_STRING;
            if (this.f5767c == null) {
                str = C1965a.m4751a(str, " priority");
            }
            if (str.isEmpty()) {
                return new C2006b(this.f5765a, this.f5766b, this.f5767c, null);
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
        }
    }

    public /* synthetic */ C2006b(String str, byte[] bArr, C1967b bVar, C2007a aVar) {
        this.f5762a = str;
        this.f5763b = bArr;
        this.f5764c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r4.f5764c.equals(((p213q.p217b.p218a.p219a.p222f.C2006b) r5).f5764c) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p213q.p217b.p218a.p219a.p222f.C2018i
            r2 = 0
            if (r1 == 0) goto L_0x003e
            q.b.a.a.f.i r5 = (p213q.p217b.p218a.p219a.p222f.C2018i) r5
            java.lang.String r1 = r4.f5762a
            r3 = r5
            q.b.a.a.f.b r3 = (p213q.p217b.p218a.p219a.p222f.C2006b) r3
            java.lang.String r3 = r3.f5762a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003c
            byte[] r1 = r4.f5763b
            boolean r3 = r5 instanceof p213q.p217b.p218a.p219a.p222f.C2006b
            if (r3 == 0) goto L_0x0024
            r3 = r5
            q.b.a.a.f.b r3 = (p213q.p217b.p218a.p219a.p222f.C2006b) r3
            byte[] r3 = r3.f5763b
            goto L_0x0029
        L_0x0024:
            r3 = r5
            q.b.a.a.f.b r3 = (p213q.p217b.p218a.p219a.p222f.C2006b) r3
            byte[] r3 = r3.f5763b
        L_0x0029:
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L_0x003c
            q.b.a.a.b r1 = r4.f5764c
            q.b.a.a.f.b r5 = (p213q.p217b.p218a.p219a.p222f.C2006b) r5
            q.b.a.a.b r5 = r5.f5764c
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r0 = r2
        L_0x003d:
            return r0
        L_0x003e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p219a.p222f.C2006b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((this.f5762a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5763b)) * 1000003) ^ this.f5764c.hashCode();
    }
}
