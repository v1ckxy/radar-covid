package p213q.p217b.p301c.p302a.p311j0.p312a;

/* renamed from: q.b.c.a.j0.a.f0 */
public class C3621f0 {

    /* renamed from: a */
    public C3635j f9016a;

    /* renamed from: b */
    public volatile C3706s0 f9017b;

    /* renamed from: c */
    public volatile C3635j f9018c;

    static {
        C3697r.m8878a();
    }

    /* renamed from: a */
    public C3635j mo9622a() {
        if (this.f9018c != null) {
            return this.f9018c;
        }
        C3635j jVar = this.f9016a;
        if (jVar != null) {
            return jVar;
        }
        synchronized (this) {
            if (this.f9018c != null) {
                C3635j jVar2 = this.f9018c;
                return jVar2;
            }
            this.f9018c = this.f9017b == null ? C3635j.f9034f : this.f9017b.toByteString();
            C3635j jVar3 = this.f9018c;
            return jVar3;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f9017b = r4;
        r3.f9018c = p213q.p217b.p301c.p302a.p311j0.p312a.C3635j.f9034f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0029 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9623a(p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0 r4) {
        /*
            r3 = this;
            q.b.c.a.j0.a.s0 r0 = r3.f9017b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            q.b.c.a.j0.a.s0 r0 = r3.f9017b     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x000c:
            q.b.c.a.j0.a.j r0 = r3.f9016a     // Catch:{ c0 -> 0x0029 }
            if (r0 == 0) goto L_0x0024
            q.b.c.a.j0.a.z0 r0 = r4.getParserForType()     // Catch:{ c0 -> 0x0029 }
            q.b.c.a.j0.a.j r1 = r3.f9016a     // Catch:{ c0 -> 0x0029 }
            r2 = 0
            java.lang.Object r0 = r0.mo9529a(r1, r2)     // Catch:{ c0 -> 0x0029 }
            q.b.c.a.j0.a.s0 r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0) r0     // Catch:{ c0 -> 0x0029 }
            r3.f9017b = r0     // Catch:{ c0 -> 0x0029 }
            q.b.c.a.j0.a.j r0 = r3.f9016a     // Catch:{ c0 -> 0x0029 }
        L_0x0021:
            r3.f9018c = r0     // Catch:{ c0 -> 0x0029 }
            goto L_0x002f
        L_0x0024:
            r3.f9017b = r4     // Catch:{ c0 -> 0x0029 }
            q.b.c.a.j0.a.j r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3635j.f9034f     // Catch:{ c0 -> 0x0029 }
            goto L_0x0021
        L_0x0029:
            r3.f9017b = r4     // Catch:{ all -> 0x0031 }
            q.b.c.a.j0.a.j r4 = p213q.p217b.p301c.p302a.p311j0.p312a.C3635j.f9034f     // Catch:{ all -> 0x0031 }
            r3.f9018c = r4     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3621f0.mo9623a(q.b.c.a.j0.a.s0):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3621f0)) {
            return false;
        }
        C3621f0 f0Var = (C3621f0) obj;
        C3706s0 s0Var = this.f9017b;
        C3706s0 s0Var2 = f0Var.f9017b;
        if (s0Var == null && s0Var2 == null) {
            return mo9622a().equals(f0Var.mo9622a());
        }
        if (s0Var != null && s0Var2 != null) {
            return s0Var.equals(s0Var2);
        }
        if (s0Var != null) {
            f0Var.mo9623a(s0Var.getDefaultInstanceForType());
            return s0Var.equals(f0Var.f9017b);
        }
        mo9623a(s0Var2.getDefaultInstanceForType());
        return this.f9017b.equals(s0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
