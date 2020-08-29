package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4092b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a;

/* renamed from: q.b.d.h.e.m.k */
public final class C4064k extends C4102a {

    /* renamed from: a */
    public final C4103a f9916a;

    /* renamed from: b */
    public final C4119w<C4092b> f9917b;

    /* renamed from: c */
    public final Boolean f9918c;

    /* renamed from: d */
    public final int f9919d;

    public /* synthetic */ C4064k(C4103a aVar, C4119w wVar, Boolean bool, int i, C4065a aVar2) {
        this.f9916a = aVar;
        this.f9917b = wVar;
        this.f9918c = bool;
        this.f9919d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r4.f9919d == ((p213q.p217b.p317d.p322h.p323e.p328m.C4064k) r5).f9919d) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a
            r2 = 0
            if (r1 == 0) goto L_0x0051
            q.b.d.h.e.m.v$d$d$a r5 = (p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a) r5
            q.b.d.h.e.m.v$d$d$a$a r1 = r4.f9916a
            r3 = r5
            q.b.d.h.e.m.k r3 = (p213q.p217b.p317d.p322h.p323e.p328m.C4064k) r3
            q.b.d.h.e.m.v$d$d$a$a r3 = r3.f9916a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
            q.b.d.h.e.m.w<q.b.d.h.e.m.v$b> r1 = r4.f9917b
            if (r1 != 0) goto L_0x0024
            r1 = r5
            q.b.d.h.e.m.k r1 = (p213q.p217b.p317d.p322h.p323e.p328m.C4064k) r1
            q.b.d.h.e.m.w<q.b.d.h.e.m.v$b> r1 = r1.f9917b
            if (r1 != 0) goto L_0x004f
            goto L_0x002f
        L_0x0024:
            r3 = r5
            q.b.d.h.e.m.k r3 = (p213q.p217b.p317d.p322h.p323e.p328m.C4064k) r3
            q.b.d.h.e.m.w<q.b.d.h.e.m.v$b> r3 = r3.f9917b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
        L_0x002f:
            java.lang.Boolean r1 = r4.f9918c
            if (r1 != 0) goto L_0x003b
            r1 = r5
            q.b.d.h.e.m.k r1 = (p213q.p217b.p317d.p322h.p323e.p328m.C4064k) r1
            java.lang.Boolean r1 = r1.f9918c
            if (r1 != 0) goto L_0x004f
            goto L_0x0046
        L_0x003b:
            r3 = r5
            q.b.d.h.e.m.k r3 = (p213q.p217b.p317d.p322h.p323e.p328m.C4064k) r3
            java.lang.Boolean r3 = r3.f9918c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
        L_0x0046:
            int r1 = r4.f9919d
            q.b.d.h.e.m.k r5 = (p213q.p217b.p317d.p322h.p323e.p328m.C4064k) r5
            int r5 = r5.f9919d
            if (r1 != r5) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r0 = r2
        L_0x0050:
            return r0
        L_0x0051:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p328m.C4064k.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.f9916a.hashCode() ^ 1000003) * 1000003;
        C4119w<C4092b> wVar = this.f9917b;
        int i = 0;
        int hashCode2 = (hashCode ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        Boolean bool = this.f9918c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f9919d;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Application{execution=");
        a.append(this.f9916a);
        a.append(", customAttributes=");
        a.append(this.f9917b);
        a.append(", background=");
        a.append(this.f9918c);
        a.append(", uiOrientation=");
        return C1965a.m4753a(a, this.f9919d, Objects.ARRAY_END);
    }
}
