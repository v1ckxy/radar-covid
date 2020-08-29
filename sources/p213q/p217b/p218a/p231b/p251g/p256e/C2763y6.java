package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.y6 */
public class C2763y6 {

    /* renamed from: a */
    public volatile C2619p7 f6992a;

    /* renamed from: b */
    public volatile C2435f5 f6993b;

    static {
        C2698u5.m6462a();
    }

    /* renamed from: a */
    public final int mo8117a() {
        if (this.f6993b != null) {
            return this.f6993b.mo7640a();
        }
        if (this.f6992a != null) {
            return this.f6992a.mo7765d();
        }
        return 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p213q.p217b.p218a.p231b.p251g.p256e.C2619p7 mo8118a(p213q.p217b.p218a.p231b.p251g.p256e.C2619p7 r2) {
        /*
            r1 = this;
            q.b.a.b.g.e.p7 r0 = r1.f6992a
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            q.b.a.b.g.e.p7 r0 = r1.f6992a     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.f6992a = r2     // Catch:{ p6 -> 0x0012 }
            q.b.a.b.g.e.f5 r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2435f5.f6525f     // Catch:{ p6 -> 0x0012 }
            r1.f6993b = r0     // Catch:{ p6 -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.f6992a = r2     // Catch:{ all -> 0x0019 }
            q.b.a.b.g.e.f5 r2 = p213q.p217b.p218a.p231b.p251g.p256e.C2435f5.f6525f     // Catch:{ all -> 0x0019 }
            r1.f6993b = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            q.b.a.b.g.e.p7 r2 = r1.f6992a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2763y6.mo8118a(q.b.a.b.g.e.p7):q.b.a.b.g.e.p7");
    }

    /* renamed from: b */
    public final C2435f5 mo8119b() {
        if (this.f6993b != null) {
            return this.f6993b;
        }
        synchronized (this) {
            if (this.f6993b != null) {
                C2435f5 f5Var = this.f6993b;
                return f5Var;
            }
            this.f6993b = this.f6992a == null ? C2435f5.f6525f : this.f6992a.mo7956i();
            C2435f5 f5Var2 = this.f6993b;
            return f5Var2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2763y6)) {
            return false;
        }
        C2763y6 y6Var = (C2763y6) obj;
        C2619p7 p7Var = this.f6992a;
        C2619p7 p7Var2 = y6Var.f6992a;
        return (p7Var == null && p7Var2 == null) ? mo8119b().equals(y6Var.mo8119b()) : (p7Var == null || p7Var2 == null) ? p7Var != null ? p7Var.equals(y6Var.mo8118a(p7Var.mo7764c())) : mo8118a(p7Var2.mo7764c()).equals(p7Var2) : p7Var.equals(p7Var2);
    }

    public int hashCode() {
        return 1;
    }
}
