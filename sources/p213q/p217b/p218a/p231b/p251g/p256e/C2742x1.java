package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.x1 */
public final class C2742x1 {

    /* renamed from: a */
    public static volatile C2630q2<Boolean> f6955a = C2612p2.f6795e;

    /* renamed from: b */
    public static final Object f6956b = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m6525a(android.content.Context r4, android.net.Uri r5) {
        /*
            java.lang.String r5 = r5.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r5)
            r1 = 0
            if (r0 != 0) goto L_0x002a
            r4 = 91
            int r4 = p213q.p214a.p215a.p216a.C1965a.m4743a(r5, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r5)
            java.lang.String r4 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r5 = "PhenotypeClientHelper"
            android.util.Log.e(r5, r4)
            return r1
        L_0x002a:
            q.b.a.b.g.e.q2<java.lang.Boolean> r5 = f6955a
            boolean r5 = r5.mo7933a()
            if (r5 == 0) goto L_0x0033
            goto L_0x0096
        L_0x0033:
            java.lang.Object r5 = f6956b
            monitor-enter(r5)
            q.b.a.b.g.e.q2<java.lang.Boolean> r0 = f6955a     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.mo7933a()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x004c
            q.b.a.b.g.e.q2<java.lang.Boolean> r4 = f6955a     // Catch:{ all -> 0x00a3 }
            java.lang.Object r4 = r4.mo7934b()     // Catch:{ all -> 0x00a3 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00a3 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00a3 }
            monitor-exit(r5)     // Catch:{ all -> 0x00a3 }
            return r4
        L_0x004c:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r4.getPackageName()     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00a3 }
            r2 = 1
            if (r0 == 0) goto L_0x005a
            goto L_0x0070
        L_0x005a:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ all -> 0x00a3 }
            java.lang.String r3 = "com.google.android.gms.phenotype"
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r3, r1)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0072
            java.lang.String r3 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch:{ all -> 0x00a3 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0072
        L_0x0070:
            r0 = r2
            goto L_0x0073
        L_0x0072:
            r0 = r1
        L_0x0073:
            if (r0 == 0) goto L_0x008b
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x0087 }
            int r4 = r4.flags     // Catch:{ all -> 0x00a3 }
            r4 = r4 & 129(0x81, float:1.81E-43)
            if (r4 == 0) goto L_0x0087
            r4 = r2
            goto L_0x0088
        L_0x0087:
            r4 = r1
        L_0x0088:
            if (r4 == 0) goto L_0x008b
            r1 = r2
        L_0x008b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00a3 }
            q.b.a.b.g.e.q2 r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2630q2.m6317a(r4)     // Catch:{ all -> 0x00a3 }
            f6955a = r4     // Catch:{ all -> 0x00a3 }
            monitor-exit(r5)     // Catch:{ all -> 0x00a3 }
        L_0x0096:
            q.b.a.b.g.e.q2<java.lang.Boolean> r4 = f6955a
            java.lang.Object r4 = r4.mo7934b()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x00a3:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00a3 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2742x1.m6525a(android.content.Context, android.net.Uri):boolean");
    }
}
