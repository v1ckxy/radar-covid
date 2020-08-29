package p213q.p217b.p317d.p322h.p323e.p328m;

import java.util.Arrays;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4093c.C4094a;

/* renamed from: q.b.d.h.e.m.e */
public final class C4050e extends C4094a {

    /* renamed from: a */
    public final String f9859a;

    /* renamed from: b */
    public final byte[] f9860b;

    public /* synthetic */ C4050e(String str, byte[] bArr, C4051a aVar) {
        this.f9859a = str;
        this.f9860b = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (java.util.Arrays.equals(r1, r6) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4093c.C4094a
            r2 = 0
            if (r1 == 0) goto L_0x002c
            q.b.d.h.e.m.v$c$a r6 = (p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4093c.C4094a) r6
            java.lang.String r1 = r5.f9859a
            r3 = r6
            q.b.d.h.e.m.e r3 = (p213q.p217b.p317d.p322h.p323e.p328m.C4050e) r3
            java.lang.String r4 = r3.f9859a
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x002a
            byte[] r1 = r5.f9860b
            boolean r6 = r6 instanceof p213q.p217b.p317d.p322h.p323e.p328m.C4050e
            if (r6 == 0) goto L_0x0021
            byte[] r6 = r3.f9860b
            goto L_0x0023
        L_0x0021:
            byte[] r6 = r3.f9860b
        L_0x0023:
            boolean r6 = java.util.Arrays.equals(r1, r6)
            if (r6 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r0 = r2
        L_0x002b:
            return r0
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p328m.C4050e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((this.f9859a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9860b);
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("File{filename=");
        a.append(this.f9859a);
        a.append(", contents=");
        a.append(Arrays.toString(this.f9860b));
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
