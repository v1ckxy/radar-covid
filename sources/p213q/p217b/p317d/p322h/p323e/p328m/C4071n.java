package p213q.p217b.p317d.p322h.p323e.p328m;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4106c;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4108e.C4109a;

/* renamed from: q.b.d.h.e.m.n */
public final class C4071n extends C4106c {

    /* renamed from: a */
    public final String f9932a;

    /* renamed from: b */
    public final String f9933b;

    /* renamed from: c */
    public final C4119w<C4109a> f9934c;

    /* renamed from: d */
    public final C4106c f9935d;

    /* renamed from: e */
    public final int f9936e;

    public /* synthetic */ C4071n(String str, String str2, C4119w wVar, C4106c cVar, int i, C4072a aVar) {
        this.f9932a = str;
        this.f9933b = str2;
        this.f9934c = wVar;
        this.f9935d = cVar;
        this.f9936e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r4.f9936e == r5.f9936e) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4106c
            r2 = 0
            if (r1 == 0) goto L_0x004c
            q.b.d.h.e.m.v$d$d$a$a$c r5 = (p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4106c) r5
            java.lang.String r1 = r4.f9932a
            q.b.d.h.e.m.n r5 = (p213q.p217b.p317d.p322h.p323e.p328m.C4071n) r5
            java.lang.String r3 = r5.f9932a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
            java.lang.String r1 = r4.f9933b
            if (r1 != 0) goto L_0x0020
            java.lang.String r1 = r5.f9933b
            if (r1 != 0) goto L_0x004a
            goto L_0x0028
        L_0x0020:
            java.lang.String r3 = r5.f9933b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
        L_0x0028:
            q.b.d.h.e.m.w<q.b.d.h.e.m.v$d$d$a$a$e$a> r1 = r4.f9934c
            q.b.d.h.e.m.w<q.b.d.h.e.m.v$d$d$a$a$e$a> r3 = r5.f9934c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
            q.b.d.h.e.m.v$d$d$a$a$c r1 = r4.f9935d
            if (r1 != 0) goto L_0x003b
            q.b.d.h.e.m.v$d$d$a$a$c r1 = r5.f9935d
            if (r1 != 0) goto L_0x004a
            goto L_0x0043
        L_0x003b:
            q.b.d.h.e.m.v$d$d$a$a$c r3 = r5.f9935d
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
        L_0x0043:
            int r1 = r4.f9936e
            int r5 = r5.f9936e
            if (r1 != r5) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r0 = r2
        L_0x004b:
            return r0
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p328m.C4071n.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.f9932a.hashCode() ^ 1000003) * 1000003;
        String str = this.f9933b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f9934c.hashCode()) * 1000003;
        C4106c cVar = this.f9935d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f9936e;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Exception{type=");
        a.append(this.f9932a);
        a.append(", reason=");
        a.append(this.f9933b);
        a.append(", frames=");
        a.append(this.f9934c);
        a.append(", causedBy=");
        a.append(this.f9935d);
        a.append(", overflowCount=");
        return C1965a.m4753a(a, this.f9936e, Objects.ARRAY_END);
    }
}
