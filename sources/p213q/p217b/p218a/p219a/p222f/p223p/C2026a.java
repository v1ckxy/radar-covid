package p213q.p217b.p218a.p219a.p222f.p223p;

import java.util.Arrays;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.p222f.C2013f;

/* renamed from: q.b.a.a.f.p.a */
public final class C2026a extends C2032f {

    /* renamed from: a */
    public final Iterable<C2013f> f5803a;

    /* renamed from: b */
    public final byte[] f5804b;

    public /* synthetic */ C2026a(Iterable iterable, byte[] bArr, C2027a aVar) {
        this.f5803a = iterable;
        this.f5804b = bArr;
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
            boolean r1 = r6 instanceof p213q.p217b.p218a.p219a.p222f.p223p.C2032f
            r2 = 0
            if (r1 == 0) goto L_0x002c
            q.b.a.a.f.p.f r6 = (p213q.p217b.p218a.p219a.p222f.p223p.C2032f) r6
            java.lang.Iterable<q.b.a.a.f.f> r1 = r5.f5803a
            r3 = r6
            q.b.a.a.f.p.a r3 = (p213q.p217b.p218a.p219a.p222f.p223p.C2026a) r3
            java.lang.Iterable<q.b.a.a.f.f> r4 = r3.f5803a
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x002a
            byte[] r1 = r5.f5804b
            boolean r6 = r6 instanceof p213q.p217b.p218a.p219a.p222f.p223p.C2026a
            if (r6 == 0) goto L_0x0021
            byte[] r6 = r3.f5804b
            goto L_0x0023
        L_0x0021:
            byte[] r6 = r3.f5804b
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
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p219a.p222f.p223p.C2026a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((this.f5803a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5804b);
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("BackendRequest{events=");
        a.append(this.f5803a);
        a.append(", extras=");
        a.append(Arrays.toString(this.f5804b));
        a.append(Objects.ARRAY_END);
        return a.toString();
    }
}
