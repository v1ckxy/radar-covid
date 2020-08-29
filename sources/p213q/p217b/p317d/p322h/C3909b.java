package p213q.p217b.p317d.p322h;

import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import p213q.p217b.p317d.p321g.C3890h;

/* renamed from: q.b.d.h.b */
public final /* synthetic */ class C3909b implements C3890h {

    /* renamed from: a */
    public final CrashlyticsRegistrar f9546a;

    public C3909b(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.f9546a = crashlyticsRegistrar;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [q.b.d.h.e.i.a] */
    /* JADX WARNING: type inference failed for: r8v0, types: [q.b.d.h.e.j.a] */
    /* JADX WARNING: type inference failed for: r3v10, types: [q.b.d.h.e.j.b] */
    /* JADX WARNING: type inference failed for: r4v27, types: [q.b.d.h.e.i.f] */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r4v30, types: [q.b.d.h.e.j.b] */
    /* JADX WARNING: type inference failed for: r4v32, types: [q.b.d.h.e.i.d, q.b.d.h.e.i.b] */
    /* JADX WARNING: type inference failed for: r8v16, types: [q.b.d.h.e.i.c, q.b.d.h.e.i.b] */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r4v35 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x03bf  */
    /* JADX WARNING: Unknown variable types count: 9 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo10072a(p213q.p217b.p317d.p321g.C3887e r44) {
        /*
            r43 = this;
            r1 = r43
            r0 = r44
            com.google.firebase.crashlytics.CrashlyticsRegistrar r2 = r1.f9546a
            if (r2 == 0) goto L_0x03c5
            java.lang.Class<q.b.d.c> r2 = p213q.p217b.p317d.C3859c.class
            java.lang.Object r2 = r0.mo10075a(r2)
            q.b.d.c r2 = (p213q.p217b.p317d.C3859c) r2
            java.lang.Class<q.b.d.h.e.a> r3 = p213q.p217b.p317d.p322h.p323e.C3912a.class
            java.lang.Object r3 = r0.mo10075a(r3)
            q.b.d.h.e.a r3 = (p213q.p217b.p317d.p322h.p323e.C3912a) r3
            java.lang.Class<q.b.d.f.a.a> r4 = p213q.p217b.p317d.p318f.p319a.C3867a.class
            java.lang.Object r4 = r0.mo10075a(r4)
            q.b.d.f.a.a r4 = (p213q.p217b.p317d.p318f.p319a.C3867a) r4
            java.lang.Class<q.b.d.l.b.a> r5 = p213q.p217b.p317d.p347l.p348b.C4218a.class
            q.b.d.m.a r0 = r0.mo10083c(r5)
            java.lang.Object r0 = r0.get()
            q.b.d.l.b.a r0 = (p213q.p217b.p317d.p347l.p348b.C4218a) r0
            java.lang.String r11 = "0.0"
            r2.mo10056a()
            android.content.Context r13 = r2.f9459a
            java.lang.String r5 = r13.getPackageName()
            q.b.d.h.e.k.q0 r6 = new q.b.d.h.e.k.q0
            r6.<init>(r13, r5, r0)
            q.b.d.h.e.k.l0 r7 = new q.b.d.h.e.k.l0
            r7.<init>(r2)
            if (r3 != 0) goto L_0x0049
            q.b.d.h.e.c r0 = new q.b.d.h.e.c
            r0.<init>()
            goto L_0x004a
        L_0x0049:
            r0 = r3
        L_0x004a:
            q.b.d.h.e.h r15 = new q.b.d.h.e.h
            r15.<init>(r2, r13, r6, r7)
            if (r4 == 0) goto L_0x00ac
            q.b.d.h.e.b r3 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r5 = "Firebase Analytics is available."
            r3.mo10108a(r5)
            q.b.d.h.e.i.e r3 = new q.b.d.h.e.i.e
            r3.<init>(r4)
            q.b.d.h.a r5 = new q.b.d.h.a
            r5.<init>()
            java.lang.String r8 = "clx"
            q.b.d.f.a.a$a r8 = r4.mo10070a(r8, r5)
            if (r8 != 0) goto L_0x0080
            q.b.d.h.e.b r8 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r9 = "Could not register AnalyticsConnectorListener with Crashlytics origin."
            r8.mo10108a(r9)
            java.lang.String r8 = "crash"
            q.b.d.f.a.a$a r8 = r4.mo10070a(r8, r5)
            if (r8 == 0) goto L_0x0080
            q.b.d.h.e.b r4 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r9 = "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."
            r4.mo10113c(r9)
        L_0x0080:
            if (r8 == 0) goto L_0x009d
            q.b.d.h.e.b r4 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r8 = "Firebase Analytics listener registered successfully."
            r4.mo10108a(r8)
            q.b.d.h.e.i.d r4 = new q.b.d.h.e.i.d
            r4.<init>()
            q.b.d.h.e.i.c r8 = new q.b.d.h.e.i.c
            r9 = 500(0x1f4, float:7.0E-43)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            r8.<init>(r3, r9, r10)
            r5.f9545b = r4
            r5.f9544a = r8
            r3 = r8
            goto L_0x00a9
        L_0x009d:
            q.b.d.h.e.b r4 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r5 = "Firebase Analytics listener registration failed."
            r4.mo10108a(r5)
            q.b.d.h.e.j.b r4 = new q.b.d.h.e.j.b
            r4.<init>()
        L_0x00a9:
            r9 = r3
            r8 = r4
            goto L_0x00bf
        L_0x00ac:
            q.b.d.h.e.b r3 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r4 = "Firebase Analytics is unavailable."
            r3.mo10108a(r4)
            q.b.d.h.e.j.b r3 = new q.b.d.h.e.j.b
            r3.<init>()
            q.b.d.h.e.i.f r4 = new q.b.d.h.e.i.f
            r4.<init>()
            r8 = r3
            r9 = r4
        L_0x00bf:
            java.lang.String r3 = "Crashlytics Exception Handler"
            java.util.concurrent.ExecutorService r10 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5207a(r3)
            q.b.d.h.e.k.f0 r14 = new q.b.d.h.e.k.f0
            r3 = r14
            r4 = r2
            r5 = r6
            r6 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r3 = 6
            r4 = 0
            q.b.d.h.e.k.q0 r0 = r15.f9572l     // Catch:{ NameNotFoundException -> 0x0128 }
            java.lang.String r0 = r0.mo10162b()     // Catch:{ NameNotFoundException -> 0x0128 }
            r15.f9569i = r0     // Catch:{ NameNotFoundException -> 0x0128 }
            android.content.Context r0 = r15.f9563c     // Catch:{ NameNotFoundException -> 0x0128 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0128 }
            r15.f9564d = r0     // Catch:{ NameNotFoundException -> 0x0128 }
            android.content.Context r0 = r15.f9563c     // Catch:{ NameNotFoundException -> 0x0128 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x0128 }
            r15.f9565e = r0     // Catch:{ NameNotFoundException -> 0x0128 }
            android.content.pm.PackageManager r5 = r15.f9564d     // Catch:{ NameNotFoundException -> 0x0128 }
            android.content.pm.PackageInfo r0 = r5.getPackageInfo(r0, r4)     // Catch:{ NameNotFoundException -> 0x0128 }
            r15.f9566f = r0     // Catch:{ NameNotFoundException -> 0x0128 }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0128 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ NameNotFoundException -> 0x0128 }
            r15.f9567g = r0     // Catch:{ NameNotFoundException -> 0x0128 }
            android.content.pm.PackageInfo r0 = r15.f9566f     // Catch:{ NameNotFoundException -> 0x0128 }
            java.lang.String r0 = r0.versionName     // Catch:{ NameNotFoundException -> 0x0128 }
            if (r0 != 0) goto L_0x0100
            r0 = r11
            goto L_0x0104
        L_0x0100:
            android.content.pm.PackageInfo r0 = r15.f9566f     // Catch:{ NameNotFoundException -> 0x0128 }
            java.lang.String r0 = r0.versionName     // Catch:{ NameNotFoundException -> 0x0128 }
        L_0x0104:
            r15.f9568h = r0     // Catch:{ NameNotFoundException -> 0x0128 }
            android.content.pm.PackageManager r0 = r15.f9564d     // Catch:{ NameNotFoundException -> 0x0128 }
            android.content.Context r5 = r15.f9563c     // Catch:{ NameNotFoundException -> 0x0128 }
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch:{ NameNotFoundException -> 0x0128 }
            java.lang.CharSequence r0 = r0.getApplicationLabel(r5)     // Catch:{ NameNotFoundException -> 0x0128 }
            java.lang.String r0 = r0.toString()     // Catch:{ NameNotFoundException -> 0x0128 }
            r15.f9570j = r0     // Catch:{ NameNotFoundException -> 0x0128 }
            android.content.Context r0 = r15.f9563c     // Catch:{ NameNotFoundException -> 0x0128 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ NameNotFoundException -> 0x0128 }
            int r0 = r0.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x0128 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ NameNotFoundException -> 0x0128 }
            r15.f9571k = r0     // Catch:{ NameNotFoundException -> 0x0128 }
            r4 = 1
            goto L_0x0138
        L_0x0128:
            r0 = move-exception
            q.b.d.h.e.b r5 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            boolean r3 = r5.mo10110a(r3)
            if (r3 == 0) goto L_0x0138
            java.lang.String r3 = r5.f9553a
            java.lang.String r5 = "Failed init"
            android.util.Log.e(r3, r5, r0)
        L_0x0138:
            if (r4 != 0) goto L_0x0144
            q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r2 = "Unable to start Crashlytics."
            r0.mo10111b(r2)
            r0 = 0
            goto L_0x03be
        L_0x0144:
            java.lang.String r0 = "com.google.firebase.crashlytics.startup"
            java.util.concurrent.ExecutorService r3 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5207a(r0)
            r2.mo10056a()
            q.b.d.e r0 = r2.f9461c
            java.lang.String r0 = r0.f9472b
            q.b.d.h.e.k.q0 r2 = r15.f9572l
            q.b.d.h.e.n.c r4 = r15.f9561a
            java.lang.String r5 = r15.f9567g
            java.lang.String r6 = r15.f9568h
            java.lang.String r7 = r15.mo10114a()
            q.b.d.h.e.k.l0 r8 = r15.f9573m
            java.lang.String r9 = r2.mo10162b()
            q.b.d.h.e.k.x0 r10 = new q.b.d.h.e.k.x0
            r10.<init>()
            q.b.d.h.e.s.f r12 = new q.b.d.h.e.s.f
            r12.<init>(r10)
            q.b.d.h.e.s.a r1 = new q.b.d.h.e.s.a
            r1.<init>(r13)
            r44 = r11
            java.util.Locale r11 = java.util.Locale.US
            r26 = r12
            r12 = 1
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r16 = 0
            r12[r16] = r0
            r27 = r14
            java.lang.String r14 = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"
            java.lang.String r11 = java.lang.String.format(r11, r14, r12)
            q.b.d.h.e.s.j.c r14 = new q.b.d.h.e.s.j.c
            r14.<init>(r7, r11, r4)
            java.util.Locale r4 = java.util.Locale.US
            r7 = 2
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.String r12 = android.os.Build.MANUFACTURER
            java.lang.String r12 = r2.mo10159a(r12)
            r11[r16] = r12
            java.lang.String r12 = android.os.Build.MODEL
            java.lang.String r12 = r2.mo10159a(r12)
            r16 = 1
            r11[r16] = r12
            java.lang.String r12 = "%s/%s"
            java.lang.String r18 = java.lang.String.format(r4, r12, r11)
            java.lang.String r4 = android.os.Build.VERSION.INCREMENTAL
            java.lang.String r19 = r2.mo10159a(r4)
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            java.lang.String r20 = r2.mo10159a(r4)
            r4 = 4
            java.lang.String[] r11 = new java.lang.String[r4]
            java.lang.String r12 = p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9367c(r13)
            r17 = 0
            r11[r17] = r12
            r11[r16] = r0
            r11[r7] = r6
            r7 = 3
            r11[r7] = r5
            java.lang.String r22 = p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9359a(r11)
            q.b.d.h.e.k.n0 r7 = p213q.p217b.p317d.p322h.p323e.p326k.C3963n0.m9387a(r9)
            int r7 = r7.f9680e
            q.b.d.h.e.s.i.g r9 = new q.b.d.h.e.s.i.g
            r16 = r9
            r17 = r0
            r21 = r2
            r23 = r6
            r24 = r5
            r25 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            q.b.d.h.e.s.d r2 = new q.b.d.h.e.s.d
            r0 = r26
            r12 = r2
            r6 = r14
            r5 = r27
            r14 = r9
            r7 = r15
            r15 = r10
            r16 = r0
            r17 = r1
            r18 = r6
            r19 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            q.b.d.h.e.s.c r0 = p213q.p217b.p317d.p322h.p323e.p337s.C4165c.USE_CACHE
            q.b.a.b.l.i r0 = r2.mo10371a(r0, r3)
            q.b.d.h.e.g r1 = new q.b.d.h.e.g
            r1.<init>(r7)
            r0.mo8922a(r3, r1)
            android.content.Context r0 = r5.f9608a
            java.lang.String r10 = p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9367c(r0)
            q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r1 = "Mapping file ID is: "
            p213q.p214a.p215a.p216a.C1965a.m4759a(r1, r10, r0)
            android.content.Context r0 = r5.f9608a
            java.lang.String r1 = "com.crashlytics.RequireBuildId"
            r6 = 1
            boolean r0 = p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9363a(r0, r1, r6)
            java.lang.String r1 = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."
            if (r0 != 0) goto L_0x0228
            q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r8 = "Configured not to require a build ID."
            r0.mo10108a(r8)
            goto L_0x022e
        L_0x0228:
            boolean r0 = p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9366b(r10)
            if (r0 != 0) goto L_0x0230
        L_0x022e:
            r0 = r6
            goto L_0x0282
        L_0x0230:
            java.lang.String r0 = "."
            java.lang.String r8 = "FirebaseCrashlytics"
            android.util.Log.e(r8, r0)
            java.lang.String r9 = ".     |  | "
            android.util.Log.e(r8, r9)
            java.lang.String r9 = ".     |  |"
            android.util.Log.e(r8, r9)
            android.util.Log.e(r8, r9)
            java.lang.String r11 = ".   \\ |  | /"
            android.util.Log.e(r8, r11)
            java.lang.String r11 = ".    \\    /"
            android.util.Log.e(r8, r11)
            java.lang.String r11 = ".     \\  /"
            android.util.Log.e(r8, r11)
            java.lang.String r11 = ".      \\/"
            android.util.Log.e(r8, r11)
            android.util.Log.e(r8, r0)
            android.util.Log.e(r8, r1)
            android.util.Log.e(r8, r0)
            java.lang.String r11 = ".      /\\"
            android.util.Log.e(r8, r11)
            java.lang.String r11 = ".     /  \\"
            android.util.Log.e(r8, r11)
            java.lang.String r11 = ".    /    \\"
            android.util.Log.e(r8, r11)
            java.lang.String r11 = ".   / |  | \\"
            android.util.Log.e(r8, r11)
            android.util.Log.e(r8, r9)
            android.util.Log.e(r8, r9)
            android.util.Log.e(r8, r9)
            android.util.Log.e(r8, r0)
            r0 = 0
        L_0x0282:
            if (r0 == 0) goto L_0x03bf
            q.b.d.c r0 = r5.f9609b
            r0.mo10056a()
            q.b.d.e r0 = r0.f9461c
            java.lang.String r9 = r0.f9472b
            q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ Exception -> 0x0392 }
            java.lang.String r1 = "Initializing Crashlytics 17.1.1"
            boolean r4 = r0.mo10110a(r4)     // Catch:{ Exception -> 0x0392 }
            if (r4 == 0) goto L_0x029d
            java.lang.String r0 = r0.f9553a     // Catch:{ Exception -> 0x0392 }
            r4 = 0
            android.util.Log.i(r0, r1, r4)     // Catch:{ Exception -> 0x0392 }
        L_0x029d:
            q.b.d.h.e.o.h r0 = new q.b.d.h.e.o.h     // Catch:{ Exception -> 0x0392 }
            android.content.Context r1 = r5.f9608a     // Catch:{ Exception -> 0x0392 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.h0 r1 = new q.b.d.h.e.k.h0     // Catch:{ Exception -> 0x0392 }
            java.lang.String r4 = "crash_marker"
            r1.<init>(r4, r0)     // Catch:{ Exception -> 0x0392 }
            r5.f9613f = r1     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.h0 r1 = new q.b.d.h.e.k.h0     // Catch:{ Exception -> 0x0392 }
            java.lang.String r4 = "initialization_marker"
            r1.<init>(r4, r0)     // Catch:{ Exception -> 0x0392 }
            r5.f9612e = r1     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.n.c r31 = new q.b.d.h.e.n.c     // Catch:{ Exception -> 0x0392 }
            r31.<init>()     // Catch:{ Exception -> 0x0392 }
            android.content.Context r1 = r5.f9608a     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.q0 r4 = r5.f9615h     // Catch:{ Exception -> 0x0392 }
            java.lang.String r12 = r1.getPackageName()     // Catch:{ Exception -> 0x0392 }
            java.lang.String r11 = r4.mo10162b()     // Catch:{ Exception -> 0x0392 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ Exception -> 0x0392 }
            r4 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r12, r4)     // Catch:{ Exception -> 0x0392 }
            int r4 = r1.versionCode     // Catch:{ Exception -> 0x0392 }
            java.lang.String r13 = java.lang.Integer.toString(r4)     // Catch:{ Exception -> 0x0392 }
            java.lang.String r1 = r1.versionName     // Catch:{ Exception -> 0x0392 }
            if (r1 != 0) goto L_0x02dd
            r14 = r44
            goto L_0x02de
        L_0x02dd:
            r14 = r1
        L_0x02de:
            q.b.d.h.e.k.b r1 = new q.b.d.h.e.k.b     // Catch:{ Exception -> 0x0392 }
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.u.a r4 = new q.b.d.h.e.u.a     // Catch:{ Exception -> 0x0392 }
            android.content.Context r8 = r5.f9608a     // Catch:{ Exception -> 0x0392 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.b r8 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ Exception -> 0x0392 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0392 }
            r9.<init>()     // Catch:{ Exception -> 0x0392 }
            java.lang.String r10 = "Installer package name is: "
            r9.append(r10)     // Catch:{ Exception -> 0x0392 }
            java.lang.String r10 = r1.f9592c     // Catch:{ Exception -> 0x0392 }
            r9.append(r10)     // Catch:{ Exception -> 0x0392 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0392 }
            r8.mo10108a(r9)     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.t r8 = new q.b.d.h.e.k.t     // Catch:{ Exception -> 0x0392 }
            android.content.Context r9 = r5.f9608a     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.h r10 = r5.f9619l     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.q0 r11 = r5.f9615h     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.l0 r12 = r5.f9610c     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.h0 r13 = r5.f9613f     // Catch:{ Exception -> 0x0392 }
            r37 = 0
            r38 = 0
            q.b.d.h.e.a r14 = r5.f9620m     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.i.a r15 = r5.f9617j     // Catch:{ Exception -> 0x0392 }
            r28 = r8
            r29 = r9
            r30 = r10
            r32 = r11
            r33 = r12
            r34 = r0
            r35 = r13
            r36 = r1
            r39 = r14
            r40 = r4
            r41 = r15
            r42 = r2
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x0392 }
            r5.f9614g = r8     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.h0 r0 = r5.f9612e     // Catch:{ Exception -> 0x0392 }
            java.io.File r0 = r0.mo10142b()     // Catch:{ Exception -> 0x0392 }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.h r1 = r5.f9619l     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.g0 r4 = new q.b.d.h.e.k.g0     // Catch:{ Exception -> 0x0392 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0392 }
            q.b.a.b.l.i r1 = r1.mo10137a(r4)     // Catch:{ Exception -> 0x0392 }
            java.lang.Object r1 = p213q.p217b.p317d.p322h.p323e.p326k.C4003z0.m9441a(r1)     // Catch:{ Exception -> 0x0354 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x0354 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0392 }
            r4.equals(r1)     // Catch:{ Exception -> 0x0392 }
        L_0x0354:
            q.b.d.h.e.k.t r1 = r5.f9614g     // Catch:{ Exception -> 0x0392 }
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.h r8 = r1.f9722e     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.n r9 = new q.b.d.h.e.k.n     // Catch:{ Exception -> 0x0392 }
            r9.<init>(r1)     // Catch:{ Exception -> 0x0392 }
            r8.mo10137a(r9)     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.x r8 = new q.b.d.h.e.k.x     // Catch:{ Exception -> 0x0392 }
            r8.<init>(r1)     // Catch:{ Exception -> 0x0392 }
            q.b.d.h.e.k.k0 r9 = new q.b.d.h.e.k.k0     // Catch:{ Exception -> 0x0392 }
            r9.<init>(r8, r2, r4)     // Catch:{ Exception -> 0x0392 }
            r1.f9737t = r9     // Catch:{ Exception -> 0x0392 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r9)     // Catch:{ Exception -> 0x0392 }
            if (r0 == 0) goto L_0x0388
            android.content.Context r0 = r5.f9608a     // Catch:{ Exception -> 0x0392 }
            boolean r0 = p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9362a(r0)     // Catch:{ Exception -> 0x0392 }
            if (r0 == 0) goto L_0x0388
            q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ Exception -> 0x0392 }
            java.lang.String r1 = "Crashlytics did not finish previous background initialization. Initializing synchronously."
            r0.mo10108a(r1)     // Catch:{ Exception -> 0x0392 }
            r5.mo10132a(r2)     // Catch:{ Exception -> 0x0392 }
            goto L_0x03a6
        L_0x0388:
            q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r1 = "Exception handling initialization successful"
            r0.mo10108a(r1)
            r18 = r6
            goto L_0x03a9
        L_0x0392:
            r0 = move-exception
            q.b.d.h.e.b r1 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            r4 = 6
            boolean r4 = r1.mo10110a(r4)
            if (r4 == 0) goto L_0x03a3
            java.lang.String r1 = r1.f9553a
            java.lang.String r4 = "Crashlytics was not started due to an exception during initialization"
            android.util.Log.e(r1, r4, r0)
        L_0x03a3:
            r0 = 0
            r5.f9614g = r0
        L_0x03a6:
            r0 = 0
            r18 = r0
        L_0x03a9:
            q.b.d.h.c r0 = new q.b.d.h.c
            r14 = r0
            r15 = r7
            r16 = r3
            r17 = r2
            r19 = r5
            r14.<init>(r15, r16, r17, r18, r19)
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5211a(r3, r0)
            q.b.d.h.d r0 = new q.b.d.h.d
            r0.<init>(r5)
        L_0x03be:
            return r0
        L_0x03bf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x03c5:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.C3909b.mo10072a(q.b.d.g.e):java.lang.Object");
    }
}
