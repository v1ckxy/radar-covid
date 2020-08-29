package p213q.p217b.p218a.p231b.p259h.p261b;

/* renamed from: q.b.a.b.h.b.i5 */
public final class C2993i5 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C2982h6 f7407e;

    /* renamed from: f */
    public final /* synthetic */ C2969g5 f7408f;

    public C2993i5(C2969g5 g5Var, C2982h6 h6Var) {
        this.f7408f = g5Var;
        this.f7407e = h6Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0213, code lost:
        if (android.text.TextUtils.isEmpty(r1.f7891l) == false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0370, code lost:
        if (android.text.TextUtils.isEmpty(r1.f7891l) == false) goto L_0x0372;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            q.b.a.b.h.b.g5 r0 = r10.f7408f
            q.b.a.b.h.b.h6 r1 = r10.f7407e
            q.b.a.b.h.b.z4 r2 = r0.mo8283g()
            r2.mo8279c()
            q.b.a.b.h.b.h r2 = new q.b.a.b.h.b.h
            r2.<init>(r0)
            r2.mo8847o()
            r0.f7352u = r2
            q.b.a.b.h.b.u3 r2 = new q.b.a.b.h.b.u3
            long r3 = r1.f7383f
            r2.<init>(r0, r3)
            r2.mo8374w()
            r0.f7353v = r2
            q.b.a.b.h.b.x3 r1 = new q.b.a.b.h.b.x3
            r1.<init>(r0)
            r1.mo8374w()
            r0.f7350s = r1
            q.b.a.b.h.b.t7 r1 = new q.b.a.b.h.b.t7
            r1.<init>(r0)
            r1.mo8374w()
            r0.f7351t = r1
            q.b.a.b.h.b.w9 r1 = r0.f7343l
            r1.mo8848p()
            q.b.a.b.h.b.o4 r1 = r0.f7339h
            r1.mo8848p()
            q.b.a.b.h.b.t4 r1 = new q.b.a.b.h.b.t4
            r1.<init>(r0)
            r0.f7354w = r1
            q.b.a.b.h.b.u3 r1 = r0.f7353v
            boolean r3 = r1.f7210b
            if (r3 != 0) goto L_0x0404
            r1.mo8372u()
            q.b.a.b.h.b.g5 r3 = r1.f7133a
            java.util.concurrent.atomic.AtomicInteger r3 = r3.f7330E
            r3.incrementAndGet()
            r3 = 1
            r1.f7210b = r3
            q.b.a.b.h.b.b4 r1 = r0.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7159l
            q.b.a.b.h.b.ka r4 = r0.f7338g
            r4.mo8583n()
            r4 = 31000(0x7918, double:1.5316E-319)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "App measurement initialized, version"
            r1.mo8433a(r5, r4)
            q.b.a.b.h.b.b4 r1 = r0.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7159l
            java.lang.String r4 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
            r1.mo8432a(r4)
            r2.mo8373v()
            java.lang.String r1 = r2.f7882c
            java.lang.String r2 = r0.f7333b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00bc
            q.b.a.b.h.b.w9 r2 = r0.mo8473p()
            boolean r2 = r2.mo8809d(r1)
            if (r2 == 0) goto L_0x009a
            q.b.a.b.h.b.b4 r1 = r0.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7159l
            java.lang.String r2 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
            goto L_0x00b9
        L_0x009a:
            q.b.a.b.h.b.b4 r2 = r0.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7159l
            java.lang.String r4 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r5 = r1.length()
            if (r5 == 0) goto L_0x00b1
            java.lang.String r1 = r4.concat(r1)
            goto L_0x00b6
        L_0x00b1:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
        L_0x00b6:
            r9 = r2
            r2 = r1
            r1 = r9
        L_0x00b9:
            r1.mo8432a(r2)
        L_0x00bc:
            q.b.a.b.h.b.b4 r1 = r0.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7160m
            java.lang.String r2 = "Debug-level message logging enabled"
            r1.mo8432a(r2)
            int r1 = r0.f7329D
            java.util.concurrent.atomic.AtomicInteger r2 = r0.f7330E
            int r2 = r2.get()
            if (r1 == r2) goto L_0x00ec
            q.b.a.b.h.b.b4 r1 = r0.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7153f
            int r2 = r0.f7329D
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.atomic.AtomicInteger r4 = r0.f7330E
            int r4 = r4.get()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Not all components initialized"
            r1.mo8434a(r5, r2, r4)
        L_0x00ec:
            r0.f7355x = r3
            q.b.a.b.h.b.g5 r0 = r10.f7408f
            q.b.a.b.h.b.z4 r1 = r0.mo8283g()
            r1.mo8279c()
            q.b.a.b.h.b.o4 r1 = r0.mo8470m()
            q.b.a.b.h.b.s4 r1 = r1.f7622e
            long r1 = r1.mo8708a()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r2 = 0
            if (r1 != 0) goto L_0x011d
            q.b.a.b.h.b.o4 r1 = r0.mo8470m()
            q.b.a.b.h.b.s4 r1 = r1.f7622e
            q.b.a.b.d.q.b r6 = r0.f7345n
            q.b.a.b.d.q.c r6 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r6
            if (r6 == 0) goto L_0x011c
            long r6 = java.lang.System.currentTimeMillis()
            r1.mo8709a(r6)
            goto L_0x011d
        L_0x011c:
            throw r2
        L_0x011d:
            q.b.a.b.h.b.o4 r1 = r0.mo8470m()
            q.b.a.b.h.b.s4 r1 = r1.f7627j
            long r6 = r1.mo8708a()
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            long r6 = r1.longValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x014f
            q.b.a.b.h.b.b4 r1 = r0.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7161n
            long r4 = r0.f7331F
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "Persisting first open"
            r1.mo8433a(r5, r4)
            q.b.a.b.h.b.o4 r1 = r0.mo8470m()
            q.b.a.b.h.b.s4 r1 = r1.f7627j
            long r4 = r0.f7331F
            r1.mo8709a(r4)
        L_0x014f:
            q.b.a.b.h.b.ka r1 = r0.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7701R0
            boolean r1 = r1.mo8574a(r4)
            if (r1 == 0) goto L_0x0176
            q.b.a.b.h.b.k6 r1 = r0.mo8472o()
            q.b.a.b.h.b.ba r1 = r1.f7490h
            boolean r4 = r1.mo8320b()
            if (r4 == 0) goto L_0x0176
            boolean r4 = r1.mo8319a()
            if (r4 == 0) goto L_0x0176
            q.b.a.b.h.b.g5 r1 = r1.f7170a
            q.b.a.b.h.b.o4 r1 = r1.mo8470m()
            q.b.a.b.h.b.u4 r1 = r1.f7617A
            r1.mo8750a(r2)
        L_0x0176:
            boolean r1 = r0.mo8467e()
            if (r1 != 0) goto L_0x01f7
            boolean r1 = r0.mo8464b()
            if (r1 == 0) goto L_0x03f2
            q.b.a.b.h.b.w9 r1 = r0.mo8473p()
            java.lang.String r2 = "android.permission.INTERNET"
            boolean r1 = r1.mo8808c(r2)
            if (r1 != 0) goto L_0x0199
            q.b.a.b.h.b.b4 r1 = r0.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7153f
            java.lang.String r2 = "App is missing INTERNET permission"
            r1.mo8432a(r2)
        L_0x0199:
            q.b.a.b.h.b.w9 r1 = r0.mo8473p()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r1.mo8808c(r2)
            if (r1 != 0) goto L_0x01b0
            q.b.a.b.h.b.b4 r1 = r0.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7153f
            java.lang.String r2 = "App is missing ACCESS_NETWORK_STATE permission"
            r1.mo8432a(r2)
        L_0x01b0:
            android.content.Context r1 = r0.f7332a
            q.b.a.b.d.r.a r1 = p213q.p217b.p218a.p231b.p239d.p248r.C2294b.m5363b(r1)
            boolean r1 = r1.mo7309a()
            if (r1 != 0) goto L_0x01ea
            q.b.a.b.h.b.ka r1 = r0.f7338g
            boolean r1 = r1.mo8588s()
            if (r1 != 0) goto L_0x01ea
            android.content.Context r1 = r0.f7332a
            boolean r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3173y4.m7486a(r1)
            if (r1 != 0) goto L_0x01d7
            q.b.a.b.h.b.b4 r1 = r0.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7153f
            java.lang.String r2 = "AppMeasurementReceiver not registered/enabled"
            r1.mo8432a(r2)
        L_0x01d7:
            android.content.Context r1 = r0.f7332a
            boolean r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7406a(r1)
            if (r1 != 0) goto L_0x01ea
            q.b.a.b.h.b.b4 r1 = r0.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7153f
            java.lang.String r2 = "AppMeasurementService not registered/enabled"
            r1.mo8432a(r2)
        L_0x01ea:
            q.b.a.b.h.b.b4 r1 = r0.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7153f
            java.lang.String r2 = "Uploading is not possible. App measurement disabled"
            r1.mo8432a(r2)
            goto L_0x03f2
        L_0x01f7:
            q.b.a.b.h.b.u3 r1 = r0.mo8479v()
            r1.mo8373v()
            java.lang.String r1 = r1.f7890k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0215
            q.b.a.b.h.b.u3 r1 = r0.mo8479v()
            r1.mo8373v()
            java.lang.String r1 = r1.f7891l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02f3
        L_0x0215:
            r0.mo8473p()
            q.b.a.b.h.b.u3 r1 = r0.mo8479v()
            r1.mo8373v()
            java.lang.String r1 = r1.f7890k
            q.b.a.b.h.b.o4 r4 = r0.mo8470m()
            r4.mo8279c()
            android.content.SharedPreferences r4 = r4.mo8667s()
            java.lang.String r5 = "gmp_app_id"
            java.lang.String r4 = r4.getString(r5, r2)
            q.b.a.b.h.b.u3 r6 = r0.mo8479v()
            r6.mo8373v()
            java.lang.String r6 = r6.f7891l
            q.b.a.b.h.b.o4 r7 = r0.mo8470m()
            r7.mo8279c()
            android.content.SharedPreferences r7 = r7.mo8667s()
            java.lang.String r8 = "admob_app_id"
            java.lang.String r7 = r7.getString(r8, r2)
            boolean r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7410a(r1, r4, r6, r7)
            if (r1 == 0) goto L_0x02b7
            q.b.a.b.h.b.b4 r1 = r0.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7159l
            java.lang.String r4 = "Rechecking which service to use due to a GMP App Id change"
            r1.mo8432a(r4)
            q.b.a.b.h.b.o4 r1 = r0.mo8470m()
            r1.mo8279c()
            java.lang.Boolean r4 = r1.mo8668t()
            android.content.SharedPreferences r6 = r1.mo8667s()
            android.content.SharedPreferences$Editor r6 = r6.edit()
            r6.clear()
            r6.apply()
            if (r4 == 0) goto L_0x028f
            boolean r4 = r4.booleanValue()
            r1.mo8279c()
            android.content.SharedPreferences r1 = r1.mo8667s()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r6 = "measurement_enabled"
            r1.putBoolean(r6, r4)
            r1.apply()
        L_0x028f:
            q.b.a.b.h.b.x3 r1 = r0.f7350s
            p213q.p217b.p218a.p231b.p259h.p261b.C2969g5.m6916a(r1)
            q.b.a.b.h.b.x3 r1 = r0.f7350s
            r1.mo8819y()
            q.b.a.b.h.b.t7 r1 = r0.f7351t
            r1.mo8720A()
            q.b.a.b.h.b.t7 r1 = r0.f7351t
            r1.mo8730z()
            q.b.a.b.h.b.o4 r1 = r0.mo8470m()
            q.b.a.b.h.b.s4 r1 = r1.f7627j
            long r6 = r0.f7331F
            r1.mo8709a(r6)
            q.b.a.b.h.b.o4 r1 = r0.mo8470m()
            q.b.a.b.h.b.u4 r1 = r1.f7629l
            r1.mo8750a(r2)
        L_0x02b7:
            q.b.a.b.h.b.o4 r1 = r0.mo8470m()
            q.b.a.b.h.b.u3 r4 = r0.mo8479v()
            r4.mo8373v()
            java.lang.String r4 = r4.f7890k
            r1.mo8279c()
            android.content.SharedPreferences r1 = r1.mo8667s()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r5, r4)
            r1.apply()
            q.b.a.b.h.b.o4 r1 = r0.mo8470m()
            q.b.a.b.h.b.u3 r4 = r0.mo8479v()
            r4.mo8373v()
            java.lang.String r4 = r4.f7891l
            r1.mo8279c()
            android.content.SharedPreferences r1 = r1.mo8667s()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r8, r4)
            r1.apply()
        L_0x02f3:
            q.b.a.b.h.b.k6 r1 = r0.mo8472o()
            q.b.a.b.h.b.o4 r4 = r0.mo8470m()
            q.b.a.b.h.b.u4 r4 = r4.f7629l
            java.lang.String r4 = r4.mo8749a()
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r1 = r1.f7489g
            r1.set(r4)
            boolean r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2720va.m6498b()
            r4 = 0
            if (r1 == 0) goto L_0x0354
            q.b.a.b.h.b.ka r1 = r0.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7755v0
            boolean r1 = r1.mo8574a(r5)
            if (r1 == 0) goto L_0x0354
            q.b.a.b.h.b.w9 r1 = r0.mo8473p()
            if (r1 == 0) goto L_0x0353
            q.b.a.b.h.b.g5 r1 = r1.f7133a     // Catch:{ ClassNotFoundException -> 0x032b }
            android.content.Context r1 = r1.f7332a     // Catch:{ ClassNotFoundException -> 0x032b }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x032b }
            java.lang.String r5 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
            r1.loadClass(r5)     // Catch:{ ClassNotFoundException -> 0x032b }
            goto L_0x032c
        L_0x032b:
            r3 = r4
        L_0x032c:
            if (r3 != 0) goto L_0x0354
            q.b.a.b.h.b.o4 r1 = r0.mo8470m()
            q.b.a.b.h.b.u4 r1 = r1.f7643z
            java.lang.String r1 = r1.mo8749a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0354
            q.b.a.b.h.b.b4 r1 = r0.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7156i
            java.lang.String r3 = "Remote config removed with active feature rollouts"
            r1.mo8432a(r3)
            q.b.a.b.h.b.o4 r1 = r0.mo8470m()
            q.b.a.b.h.b.u4 r1 = r1.f7643z
            r1.mo8750a(r2)
            goto L_0x0354
        L_0x0353:
            throw r2
        L_0x0354:
            q.b.a.b.h.b.u3 r1 = r0.mo8479v()
            r1.mo8373v()
            java.lang.String r1 = r1.f7890k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0372
            q.b.a.b.h.b.u3 r1 = r0.mo8479v()
            r1.mo8373v()
            java.lang.String r1 = r1.f7891l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x03f2
        L_0x0372:
            boolean r1 = r0.mo8464b()
            q.b.a.b.h.b.o4 r2 = r0.mo8470m()
            android.content.SharedPreferences r2 = r2.f7620c
            java.lang.String r3 = "deferred_analytics_collection"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0395
            q.b.a.b.h.b.ka r2 = r0.f7338g
            boolean r2 = r2.mo8585p()
            if (r2 != 0) goto L_0x0395
            q.b.a.b.h.b.o4 r2 = r0.mo8470m()
            r3 = r1 ^ 1
            r2.mo8663a(r3)
        L_0x0395:
            if (r1 == 0) goto L_0x039e
            q.b.a.b.h.b.k6 r1 = r0.mo8472o()
            r1.mo8569z()
        L_0x039e:
            q.b.a.b.h.b.x8 r1 = r0.mo8471n()
            q.b.a.b.h.b.g9 r1 = r1.f7968d
            r1.mo8488a()
            q.b.a.b.h.b.t7 r1 = r0.mo8477t()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1.mo8279c()
            r1.mo8373v()
            q.b.a.b.h.b.z9 r3 = r1.mo8725a(r4)
            q.b.a.b.h.b.z7 r5 = new q.b.a.b.h.b.z7
            r5.<init>(r1, r2, r3)
            r1.mo8726a(r5)
            boolean r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2442fc.m5827b()
            if (r1 == 0) goto L_0x03f2
            q.b.a.b.h.b.ka r1 = r0.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7693N0
            boolean r1 = r1.mo8574a(r2)
            if (r1 == 0) goto L_0x03f2
            q.b.a.b.h.b.t7 r1 = r0.mo8477t()
            q.b.a.b.h.b.o4 r2 = r0.mo8470m()
            q.b.a.b.h.b.p4 r2 = r2.f7619C
            android.os.Bundle r2 = r2.mo8687a()
            r1.mo8279c()
            r1.mo8373v()
            q.b.a.b.h.b.z9 r3 = r1.mo8725a(r4)
            q.b.a.b.h.b.e8 r4 = new q.b.a.b.h.b.e8
            r4.<init>(r1, r2, r3)
            r1.mo8726a(r4)
        L_0x03f2:
            q.b.a.b.h.b.o4 r1 = r0.mo8470m()
            q.b.a.b.h.b.q4 r1 = r1.f7637t
            q.b.a.b.h.b.ka r0 = r0.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7713a0
            boolean r0 = r0.mo8574a(r2)
            r1.mo8696a(r0)
            return
        L_0x0404:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2993i5.run():void");
    }
}
