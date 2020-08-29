package p392u;

import java.io.Serializable;
import p116io.jsonwebtoken.lang.Objects;

/* renamed from: u.f */
public final class C4553f<A, B> implements Serializable {

    /* renamed from: e */
    public final A f10766e;

    /* renamed from: f */
    public final B f10767f;

    public C4553f(A a, B b) {
        this.f10766e = a;
        this.f10767f = b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.f10767f, (java.lang.Object) r3.f10767f) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p392u.C4553f
            if (r0 == 0) goto L_0x001d
            u.f r3 = (p392u.C4553f) r3
            A r0 = r2.f10766e
            A r1 = r3.f10766e
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x001d
            B r0 = r2.f10767f
            B r3 = r3.f10767f
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p392u.C4553f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        A a = this.f10766e;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f10767f;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f10766e);
        sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
        sb.append(this.f10767f);
        sb.append(')');
        return sb.toString();
    }
}
