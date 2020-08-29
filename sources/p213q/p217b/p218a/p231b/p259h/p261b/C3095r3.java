package p213q.p217b.p218a.p231b.p259h.p261b;

/* renamed from: q.b.a.b.h.b.r3 */
public final class C3095r3<V> {

    /* renamed from: h */
    public static final Object f7810h = new Object();

    /* renamed from: a */
    public final String f7811a;

    /* renamed from: b */
    public final C3073p3<V> f7812b;

    /* renamed from: c */
    public final V f7813c;

    /* renamed from: d */
    public final V f7814d;

    /* renamed from: e */
    public final Object f7815e = new Object();

    /* renamed from: f */
    public volatile V f7816f = null;

    /* renamed from: g */
    public volatile V f7817g = null;

    public /* synthetic */ C3095r3(String str, Object obj, Object obj2, C3073p3 p3Var, C3084q3 q3Var) {
        this.f7811a = str;
        this.f7813c = obj;
        this.f7814d = obj2;
        this.f7812b = p3Var;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 171 */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:28|29|30|(1:32)|33|34|48|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0021, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7712a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0.f7817g = r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0046 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0049 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x005f A[SYNTHETIC, Splitter:B:51:0x005f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo8702a(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f7815e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            q.b.a.b.h.b.ja r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.f6255d
            if (r4 != 0) goto L_0x000e
            V r4 = r3.f7813c
            return r4
        L_0x000e:
            java.lang.Object r4 = f7810h
            monitor-enter(r4)
            boolean r0 = p213q.p217b.p218a.p231b.p259h.p261b.C3010ja.m7022a()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0022
            V r0 = r3.f7817g     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x001e
            V r0 = r3.f7813c     // Catch:{ all -> 0x006a }
            goto L_0x0020
        L_0x001e:
            V r0 = r3.f7817g     // Catch:{ all -> 0x006a }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            return r0
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            java.util.List<q.b.a.b.h.b.r3<?>> r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7712a     // Catch:{ SecurityException -> 0x0058 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0058 }
        L_0x0029:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0058 }
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0058 }
            q.b.a.b.h.b.r3 r0 = (p213q.p217b.p218a.p231b.p259h.p261b.C3095r3) r0     // Catch:{ SecurityException -> 0x0058 }
            boolean r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3010ja.m7022a()     // Catch:{ SecurityException -> 0x0058 }
            if (r1 != 0) goto L_0x0050
            r1 = 0
            q.b.a.b.h.b.p3<V> r2 = r0.f7812b     // Catch:{ IllegalStateException -> 0x0046 }
            if (r2 == 0) goto L_0x0046
            q.b.a.b.h.b.p3<V> r2 = r0.f7812b     // Catch:{ IllegalStateException -> 0x0046 }
            java.lang.Object r1 = r2.mo8260a()     // Catch:{ IllegalStateException -> 0x0046 }
        L_0x0046:
            java.lang.Object r2 = f7810h     // Catch:{ SecurityException -> 0x0058 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0058 }
            r0.f7817g = r1     // Catch:{ all -> 0x004d }
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            goto L_0x0029
        L_0x004d:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0050:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0058 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0058 }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0058:
            q.b.a.b.h.b.p3<V> r4 = r3.f7812b
            if (r4 != 0) goto L_0x005f
            V r4 = r3.f7813c
            return r4
        L_0x005f:
            java.lang.Object r4 = r4.mo8260a()     // Catch:{ SecurityException -> 0x0067, IllegalStateException -> 0x0064 }
            return r4
        L_0x0064:
            V r4 = r3.f7813c
            return r4
        L_0x0067:
            V r4 = r3.f7813c
            return r4
        L_0x006a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            throw r0
        L_0x006d:
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            throw r4
        L_0x006f:
            r4 = move-exception
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3095r3.mo8702a(java.lang.Object):java.lang.Object");
    }
}
