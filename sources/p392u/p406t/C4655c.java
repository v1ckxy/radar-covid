package p392u.p406t;

import p116io.jsonwebtoken.lang.Strings;

/* renamed from: u.t.c */
public final class C4655c extends C4653a {

    /* renamed from: h */
    public static final C4655c f10846h = new C4655c(1, 0);

    /* renamed from: i */
    public static final C4655c f10847i = null;

    public C4655c(int i, int i2) {
        super(i, i2, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r2.f10840f == r3.f10840f) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof p392u.p406t.C4655c
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            u.t.c r0 = (p392u.p406t.C4655c) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0021
        L_0x0013:
            int r0 = r2.f10839e
            u.t.c r3 = (p392u.p406t.C4655c) r3
            int r1 = r3.f10839e
            if (r0 != r1) goto L_0x0023
            int r0 = r2.f10840f
            int r3 = r3.f10840f
            if (r0 != r3) goto L_0x0023
        L_0x0021:
            r3 = 1
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p392u.p406t.C4655c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f10839e * 31) + this.f10840f;
    }

    public boolean isEmpty() {
        return this.f10839e > this.f10840f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10839e);
        sb.append(Strings.TOP_PATH);
        sb.append(this.f10840f);
        return sb.toString();
    }
}
