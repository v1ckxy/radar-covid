package p124p.p144f.p145a.p146h;

import p124p.p144f.p145a.C1270g;
import p124p.p144f.p145a.C1270g.C1271a;

/* renamed from: p.f.a.h.c */
public class C1274c {

    /* renamed from: a */
    public C1285j f3669a = new C1285j(this);

    /* renamed from: b */
    public final C1278d f3670b;

    /* renamed from: c */
    public final C1277c f3671c;

    /* renamed from: d */
    public C1274c f3672d;

    /* renamed from: e */
    public int f3673e = 0;

    /* renamed from: f */
    public int f3674f = -1;

    /* renamed from: g */
    public C1276b f3675g = C1276b.NONE;

    /* renamed from: h */
    public int f3676h;

    /* renamed from: i */
    public C1270g f3677i;

    /* renamed from: p.f.a.h.c$a */
    public enum C1275a {
        RELAXED,
        STRICT
    }

    /* renamed from: p.f.a.h.c$b */
    public enum C1276b {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: p.f.a.h.c$c */
    public enum C1277c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C1274c(C1278d dVar, C1277c cVar) {
        C1275a aVar = C1275a.RELAXED;
        this.f3676h = 0;
        this.f3670b = dVar;
        this.f3671c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if ((r4.f3670b.f3712Q > 0) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (r10 != p124p.p144f.p145a.p146h.C1274c.C1277c.f3693m) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0070, code lost:
        if (r10 != p124p.p144f.p145a.p146h.C1274c.C1277c.f3693m) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008b, code lost:
        if (r10 != p124p.p144f.p145a.p146h.C1274c.C1277c.f3692l) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0090 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5675a(p124p.p144f.p145a.p146h.C1274c r5, int r6, int r7, p124p.p144f.p145a.p146h.C1274c.C1276b r8, int r9, boolean r10) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x0014
            r5 = 0
            r4.f3672d = r5
            r4.f3673e = r1
            r5 = -1
            r4.f3674f = r5
            p.f.a.h.c$b r5 = p124p.p144f.p145a.p146h.C1274c.C1276b.NONE
            r4.f3675g = r5
            r5 = 2
            r4.f3676h = r5
            return r0
        L_0x0014:
            if (r10 != 0) goto L_0x0091
            p.f.a.h.c$c r10 = r5.f3671c
            p.f.a.h.c$c r2 = r4.f3671c
            if (r10 != r2) goto L_0x0037
            p.f.a.h.c$c r10 = p124p.p144f.p145a.p146h.C1274c.C1277c.BASELINE
            if (r2 != r10) goto L_0x0056
            p.f.a.h.d r10 = r5.f3670b
            int r10 = r10.f3712Q
            if (r10 <= 0) goto L_0x0028
            r10 = r0
            goto L_0x0029
        L_0x0028:
            r10 = r1
        L_0x0029:
            if (r10 == 0) goto L_0x0058
            p.f.a.h.d r10 = r4.f3670b
            int r10 = r10.f3712Q
            if (r10 <= 0) goto L_0x0033
            r10 = r0
            goto L_0x0034
        L_0x0033:
            r10 = r1
        L_0x0034:
            if (r10 != 0) goto L_0x0056
            goto L_0x0058
        L_0x0037:
            int r2 = r2.ordinal()
            switch(r2) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0075;
                case 2: goto L_0x005a;
                case 3: goto L_0x0075;
                case 4: goto L_0x005a;
                case 5: goto L_0x0058;
                case 6: goto L_0x004a;
                case 7: goto L_0x0058;
                case 8: goto L_0x0058;
                default: goto L_0x003e;
            }
        L_0x003e:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            p.f.a.h.c$c r6 = r4.f3671c
            java.lang.String r6 = r6.name()
            r5.<init>(r6)
            throw r5
        L_0x004a:
            p.f.a.h.c$c r2 = p124p.p144f.p145a.p146h.C1274c.C1277c.BASELINE
            if (r10 == r2) goto L_0x0058
            p.f.a.h.c$c r2 = p124p.p144f.p145a.p146h.C1274c.C1277c.CENTER_X
            if (r10 == r2) goto L_0x0058
            p.f.a.h.c$c r2 = p124p.p144f.p145a.p146h.C1274c.C1277c.CENTER_Y
            if (r10 == r2) goto L_0x0058
        L_0x0056:
            r10 = r0
            goto L_0x008e
        L_0x0058:
            r10 = r1
            goto L_0x008e
        L_0x005a:
            p.f.a.h.c$c r2 = p124p.p144f.p145a.p146h.C1274c.C1277c.TOP
            if (r10 == r2) goto L_0x0065
            p.f.a.h.c$c r2 = p124p.p144f.p145a.p146h.C1274c.C1277c.BOTTOM
            if (r10 != r2) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r2 = r1
            goto L_0x0066
        L_0x0065:
            r2 = r0
        L_0x0066:
            p.f.a.h.d r3 = r5.f3670b
            boolean r3 = r3 instanceof p124p.p144f.p145a.p146h.C1282g
            if (r3 == 0) goto L_0x0073
            if (r2 != 0) goto L_0x0056
            p.f.a.h.c$c r2 = p124p.p144f.p145a.p146h.C1274c.C1277c.CENTER_Y
            if (r10 != r2) goto L_0x0058
            goto L_0x0056
        L_0x0073:
            r10 = r2
            goto L_0x008e
        L_0x0075:
            p.f.a.h.c$c r2 = p124p.p144f.p145a.p146h.C1274c.C1277c.LEFT
            if (r10 == r2) goto L_0x0080
            p.f.a.h.c$c r2 = p124p.p144f.p145a.p146h.C1274c.C1277c.RIGHT
            if (r10 != r2) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r2 = r1
            goto L_0x0081
        L_0x0080:
            r2 = r0
        L_0x0081:
            p.f.a.h.d r3 = r5.f3670b
            boolean r3 = r3 instanceof p124p.p144f.p145a.p146h.C1282g
            if (r3 == 0) goto L_0x0073
            if (r2 != 0) goto L_0x0056
            p.f.a.h.c$c r2 = p124p.p144f.p145a.p146h.C1274c.C1277c.CENTER_X
            if (r10 != r2) goto L_0x0058
            goto L_0x0056
        L_0x008e:
            if (r10 != 0) goto L_0x0091
            return r1
        L_0x0091:
            r4.f3672d = r5
            if (r6 <= 0) goto L_0x0098
            r4.f3673e = r6
            goto L_0x009a
        L_0x0098:
            r4.f3673e = r1
        L_0x009a:
            r4.f3674f = r7
            r4.f3675g = r8
            r4.f3676h = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p144f.p145a.p146h.C1274c.mo5675a(p.f.a.h.c, int, int, p.f.a.h.c$b, int, boolean):boolean");
    }

    /* renamed from: b */
    public boolean mo5676b() {
        return this.f3672d != null;
    }

    /* renamed from: c */
    public void mo5677c() {
        this.f3672d = null;
        this.f3673e = 0;
        this.f3674f = -1;
        this.f3675g = C1276b.STRONG;
        this.f3676h = 0;
        C1275a aVar = C1275a.RELAXED;
        this.f3669a.mo5730e();
    }

    /* renamed from: d */
    public void mo5678d() {
        C1270g gVar = this.f3677i;
        if (gVar == null) {
            this.f3677i = new C1270g(C1271a.UNRESTRICTED);
        } else {
            gVar.mo5664a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3670b.f3721Z);
        sb.append(":");
        sb.append(this.f3671c.toString());
        return sb.toString();
    }

    /* renamed from: a */
    public int mo5674a() {
        if (this.f3670b.f3720Y == 8) {
            return 0;
        }
        int i = this.f3674f;
        if (i > -1) {
            C1274c cVar = this.f3672d;
            if (cVar != null && cVar.f3670b.f3720Y == 8) {
                return i;
            }
        }
        return this.f3673e;
    }
}
