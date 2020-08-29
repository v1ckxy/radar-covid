package p213q.p217b.p218a.p231b.p259h.p261b;

import java.util.List;

/* renamed from: q.b.a.b.h.b.u3 */
public final class C3128u3 extends C2921c5 {

    /* renamed from: c */
    public String f7882c;

    /* renamed from: d */
    public String f7883d;

    /* renamed from: e */
    public int f7884e;

    /* renamed from: f */
    public String f7885f;

    /* renamed from: g */
    public long f7886g;

    /* renamed from: h */
    public long f7887h;

    /* renamed from: i */
    public List<String> f7888i;

    /* renamed from: j */
    public int f7889j;

    /* renamed from: k */
    public String f7890k;

    /* renamed from: l */
    public String f7891l;

    /* renamed from: m */
    public String f7892m;

    public C3128u3(C2969g5 g5Var, long j) {
        super(g5Var);
        this.f7887h = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01e1 A[Catch:{ IllegalStateException -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0201 A[Catch:{ IllegalStateException -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026b A[SYNTHETIC, Splitter:B:124:0x026b] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0154 A[Catch:{ IllegalStateException -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017c A[Catch:{ IllegalStateException -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017e A[Catch:{ IllegalStateException -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018b A[SYNTHETIC, Splitter:B:79:0x018b] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8372u() {
        /*
            r14 = this;
            q.b.a.b.h.b.g5 r0 = r14.f7133a
            android.content.Context r0 = r0.f7332a
            java.lang.String r0 = r0.getPackageName()
            q.b.a.b.h.b.g5 r1 = r14.f7133a
            android.content.Context r1 = r1.f7332a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002b
            q.b.a.b.h.b.b4 r7 = r14.mo8285i()
            q.b.a.b.h.b.e4 r7 = r7.f7153f
            java.lang.Object r8 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo8433a(r9, r8)
            goto L_0x0086
        L_0x002b:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0030 }
            goto L_0x003f
        L_0x0030:
            q.b.a.b.h.b.b4 r7 = r14.mo8285i()
            q.b.a.b.h.b.e4 r7 = r7.f7153f
            java.lang.Object r8 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo8433a(r9, r8)
        L_0x003f:
            if (r5 != 0) goto L_0x0044
            java.lang.String r5 = "manual_install"
            goto L_0x004d
        L_0x0044:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x004d
            r5 = r3
        L_0x004d:
            q.b.a.b.h.b.g5 r7 = r14.f7133a     // Catch:{ NameNotFoundException -> 0x0075 }
            android.content.Context r7 = r7.f7332a     // Catch:{ NameNotFoundException -> 0x0075 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0075 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0075 }
            if (r7 == 0) goto L_0x0086
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0075 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0075 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0075 }
            if (r9 != 0) goto L_0x006c
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0075 }
            goto L_0x006d
        L_0x006c:
            r8 = r2
        L_0x006d:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0072 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0072 }
            goto L_0x0086
        L_0x0072:
            r7 = r2
            r2 = r8
            goto L_0x0076
        L_0x0075:
            r7 = r2
        L_0x0076:
            q.b.a.b.h.b.b4 r8 = r14.mo8285i()
            q.b.a.b.h.b.e4 r8 = r8.f7153f
            java.lang.Object r9 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo8434a(r10, r9, r2)
            r2 = r7
        L_0x0086:
            r14.f7882c = r0
            r14.f7885f = r5
            r14.f7883d = r2
            r14.f7884e = r6
            r5 = 0
            r14.f7886g = r5
            q.b.a.b.h.b.g5 r2 = r14.f7133a
            q.b.a.b.h.b.ja r5 = r2.f7337f
            android.content.Context r2 = r2.f7332a
            com.google.android.gms.common.api.Status r2 = p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2174f.m4995a(r2)
            r5 = 1
            if (r2 == 0) goto L_0x00a7
            boolean r6 = r2.mo1523c()
            if (r6 == 0) goto L_0x00a7
            r6 = r5
            goto L_0x00a8
        L_0x00a7:
            r6 = r4
        L_0x00a8:
            q.b.a.b.h.b.g5 r7 = r14.f7133a
            java.lang.String r7 = r7.f7333b
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00c0
            q.b.a.b.h.b.g5 r7 = r14.f7133a
            java.lang.String r7 = r7.f7334c
            java.lang.String r8 = "am"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00c0
            r7 = r5
            goto L_0x00c1
        L_0x00c0:
            r7 = r4
        L_0x00c1:
            r6 = r6 | r7
            if (r6 != 0) goto L_0x00e5
            if (r2 != 0) goto L_0x00d2
            q.b.a.b.h.b.b4 r2 = r14.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7154g
            java.lang.String r8 = "GoogleService failed to initialize (no status)"
            r2.mo8432a(r8)
            goto L_0x00e5
        L_0x00d2:
            q.b.a.b.h.b.b4 r8 = r14.mo8285i()
            q.b.a.b.h.b.e4 r8 = r8.f7154g
            int r9 = r2.f1062f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = r2.f1063g
            java.lang.String r10 = "GoogleService failed to initialize, status"
            r8.mo8434a(r10, r9, r2)
        L_0x00e5:
            if (r6 == 0) goto L_0x0134
            q.b.a.b.h.b.g5 r2 = r14.f7133a
            int r2 = r2.mo8465c()
            q.b.a.b.h.b.b4 r6 = r14.mo8285i()
            switch(r2) {
                case 0: goto L_0x0118;
                case 1: goto L_0x0113;
                case 2: goto L_0x010e;
                case 3: goto L_0x0109;
                case 4: goto L_0x0104;
                case 5: goto L_0x00ff;
                case 6: goto L_0x00fa;
                case 7: goto L_0x00f5;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            goto L_0x0120
        L_0x00f5:
            q.b.a.b.h.b.e4 r6 = r6.f7159l
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            goto L_0x011c
        L_0x00fa:
            q.b.a.b.h.b.e4 r6 = r6.f7158k
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            goto L_0x011c
        L_0x00ff:
            q.b.a.b.h.b.e4 r6 = r6.f7161n
            java.lang.String r8 = "App measurement disabled via the init parameters"
            goto L_0x011c
        L_0x0104:
            q.b.a.b.h.b.e4 r6 = r6.f7159l
            java.lang.String r8 = "App measurement disabled via the manifest"
            goto L_0x011c
        L_0x0109:
            q.b.a.b.h.b.e4 r6 = r6.f7159l
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            goto L_0x011c
        L_0x010e:
            q.b.a.b.h.b.e4 r6 = r6.f7161n
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            goto L_0x011c
        L_0x0113:
            q.b.a.b.h.b.e4 r6 = r6.f7159l
            java.lang.String r8 = "App measurement deactivated via the manifest"
            goto L_0x011c
        L_0x0118:
            q.b.a.b.h.b.e4 r6 = r6.f7161n
            java.lang.String r8 = "App measurement collection enabled"
        L_0x011c:
            r6.mo8432a(r8)
            goto L_0x0130
        L_0x0120:
            q.b.a.b.h.b.e4 r6 = r6.f7159l
            java.lang.String r8 = "App measurement disabled"
            r6.mo8432a(r8)
            q.b.a.b.h.b.b4 r6 = r14.mo8285i()
            q.b.a.b.h.b.e4 r6 = r6.f7154g
            java.lang.String r8 = "Invalid scion state in identity"
            goto L_0x011c
        L_0x0130:
            if (r2 != 0) goto L_0x0134
            r2 = r5
            goto L_0x0135
        L_0x0134:
            r2 = r4
        L_0x0135:
            r14.f7890k = r3
            r14.f7891l = r3
            r14.f7892m = r3
            q.b.a.b.h.b.g5 r6 = r14.f7133a
            q.b.a.b.h.b.ja r8 = r6.f7337f
            if (r7 == 0) goto L_0x0145
            java.lang.String r6 = r6.f7333b
            r14.f7891l = r6
        L_0x0145:
            r6 = 0
            q.b.a.b.g.e.ud r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2707ud.f6925f     // Catch:{ IllegalStateException -> 0x016b }
            java.lang.Object r7 = r7.mo7405a()     // Catch:{ IllegalStateException -> 0x016b }
            q.b.a.b.g.e.td r7 = (p213q.p217b.p218a.p231b.p251g.p256e.C2690td) r7     // Catch:{ IllegalStateException -> 0x016b }
            boolean r7 = r7.mo8042a()     // Catch:{ IllegalStateException -> 0x016b }
            if (r7 == 0) goto L_0x016e
            q.b.a.b.h.b.g5 r7 = r14.f7133a     // Catch:{ IllegalStateException -> 0x016b }
            q.b.a.b.h.b.ka r7 = r7.f7338g     // Catch:{ IllegalStateException -> 0x016b }
            q.b.a.b.h.b.r3<java.lang.Boolean> r8 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7699Q0     // Catch:{ IllegalStateException -> 0x016b }
            boolean r7 = r7.mo8574a(r8)     // Catch:{ IllegalStateException -> 0x016b }
            if (r7 == 0) goto L_0x016e
            q.b.a.b.h.b.g5 r7 = r14.f7133a     // Catch:{ IllegalStateException -> 0x016b }
            android.content.Context r7 = r7.f7332a     // Catch:{ IllegalStateException -> 0x016b }
            java.lang.String r8 = "google_app_id"
            java.lang.String r7 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5189a(r7, r8)     // Catch:{ IllegalStateException -> 0x016b }
            goto L_0x0176
        L_0x016b:
            r2 = move-exception
            goto L_0x021c
        L_0x016e:
            java.lang.String r7 = "getGoogleAppId"
            q.b.a.b.d.m.k.f r7 = p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2174f.m4996a(r7)     // Catch:{ IllegalStateException -> 0x016b }
            java.lang.String r7 = r7.f6082a     // Catch:{ IllegalStateException -> 0x016b }
        L_0x0176:
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x016b }
            if (r8 == 0) goto L_0x017e
            r8 = r3
            goto L_0x017f
        L_0x017e:
            r8 = r7
        L_0x017f:
            r14.f7890k = r8     // Catch:{ IllegalStateException -> 0x016b }
            boolean r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2424ec.m5790b()     // Catch:{ IllegalStateException -> 0x016b }
            java.lang.String r9 = "admob_app_id"
            java.lang.String r10 = "string"
            if (r8 == 0) goto L_0x01db
            q.b.a.b.h.b.g5 r8 = r14.f7133a     // Catch:{ IllegalStateException -> 0x016b }
            q.b.a.b.h.b.ka r8 = r8.f7338g     // Catch:{ IllegalStateException -> 0x016b }
            q.b.a.b.h.b.r3<java.lang.Boolean> r11 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7741o0     // Catch:{ IllegalStateException -> 0x016b }
            boolean r8 = r8.mo8574a(r11)     // Catch:{ IllegalStateException -> 0x016b }
            if (r8 == 0) goto L_0x01db
            q.b.a.b.h.b.g5 r8 = r14.f7133a     // Catch:{ IllegalStateException -> 0x016b }
            android.content.Context r8 = r8.f7332a     // Catch:{ IllegalStateException -> 0x016b }
            p124p.p126b.p127k.C1061o.m2524b(r8)     // Catch:{ IllegalStateException -> 0x016b }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ IllegalStateException -> 0x016b }
            int r11 = p213q.p217b.p218a.p231b.p239d.C2131k.common_google_play_services_unknown_issue     // Catch:{ IllegalStateException -> 0x016b }
            java.lang.String r11 = r8.getResourcePackageName(r11)     // Catch:{ IllegalStateException -> 0x016b }
            java.lang.String r12 = "ga_app_id"
            int r12 = r8.getIdentifier(r12, r10, r11)     // Catch:{ IllegalStateException -> 0x016b }
            if (r12 != 0) goto L_0x01b2
            r12 = r6
            goto L_0x01b6
        L_0x01b2:
            java.lang.String r12 = r8.getString(r12)     // Catch:{ IllegalStateException -> 0x016b }
        L_0x01b6:
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ IllegalStateException -> 0x016b }
            if (r13 == 0) goto L_0x01bd
            goto L_0x01be
        L_0x01bd:
            r3 = r12
        L_0x01be:
            r14.f7892m = r3     // Catch:{ IllegalStateException -> 0x016b }
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x016b }
            if (r3 == 0) goto L_0x01cc
            boolean r3 = android.text.TextUtils.isEmpty(r12)     // Catch:{ IllegalStateException -> 0x016b }
            if (r3 != 0) goto L_0x01ff
        L_0x01cc:
            int r3 = r8.getIdentifier(r9, r10, r11)     // Catch:{ IllegalStateException -> 0x016b }
            if (r3 != 0) goto L_0x01d4
            r3 = r6
            goto L_0x01d8
        L_0x01d4:
            java.lang.String r3 = r8.getString(r3)     // Catch:{ IllegalStateException -> 0x016b }
        L_0x01d8:
            r14.f7891l = r3     // Catch:{ IllegalStateException -> 0x016b }
            goto L_0x01ff
        L_0x01db:
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x016b }
            if (r3 != 0) goto L_0x01ff
            q.b.a.b.h.b.g5 r3 = r14.f7133a     // Catch:{ IllegalStateException -> 0x016b }
            android.content.Context r3 = r3.f7332a     // Catch:{ IllegalStateException -> 0x016b }
            p124p.p126b.p127k.C1061o.m2524b(r3)     // Catch:{ IllegalStateException -> 0x016b }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ IllegalStateException -> 0x016b }
            int r7 = p213q.p217b.p218a.p231b.p239d.C2131k.common_google_play_services_unknown_issue     // Catch:{ IllegalStateException -> 0x016b }
            java.lang.String r7 = r3.getResourcePackageName(r7)     // Catch:{ IllegalStateException -> 0x016b }
            int r7 = r3.getIdentifier(r9, r10, r7)     // Catch:{ IllegalStateException -> 0x016b }
            if (r7 != 0) goto L_0x01fa
            r3 = r6
            goto L_0x01d8
        L_0x01fa:
            java.lang.String r3 = r3.getString(r7)     // Catch:{ IllegalStateException -> 0x016b }
            goto L_0x01d8
        L_0x01ff:
            if (r2 == 0) goto L_0x022b
            q.b.a.b.h.b.b4 r2 = r14.mo8285i()     // Catch:{ IllegalStateException -> 0x016b }
            q.b.a.b.h.b.e4 r2 = r2.f7161n     // Catch:{ IllegalStateException -> 0x016b }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r7 = r14.f7882c     // Catch:{ IllegalStateException -> 0x016b }
            java.lang.String r8 = r14.f7890k     // Catch:{ IllegalStateException -> 0x016b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x016b }
            if (r8 == 0) goto L_0x0216
            java.lang.String r8 = r14.f7891l     // Catch:{ IllegalStateException -> 0x016b }
            goto L_0x0218
        L_0x0216:
            java.lang.String r8 = r14.f7890k     // Catch:{ IllegalStateException -> 0x016b }
        L_0x0218:
            r2.mo8434a(r3, r7, r8)     // Catch:{ IllegalStateException -> 0x016b }
            goto L_0x022b
        L_0x021c:
            q.b.a.b.h.b.b4 r3 = r14.mo8285i()
            q.b.a.b.h.b.e4 r3 = r3.f7153f
            java.lang.Object r0 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r0)
            java.lang.String r7 = "Fetching Google App Id failed with exception. appId"
            r3.mo8434a(r7, r0, r2)
        L_0x022b:
            r14.f7888i = r6
            q.b.a.b.h.b.g5 r0 = r14.f7133a
            q.b.a.b.h.b.ka r0 = r0.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7717c0
            boolean r0 = r0.mo8574a(r2)
            if (r0 == 0) goto L_0x02c7
            q.b.a.b.h.b.g5 r0 = r14.f7133a
            q.b.a.b.h.b.ja r2 = r0.f7337f
            q.b.a.b.h.b.ka r0 = r0.f7338g
            java.lang.String r2 = "analytics.safelisted_events"
            if (r0 == 0) goto L_0x02c6
            p124p.p126b.p127k.C1061o.m2528b(r2)
            android.os.Bundle r3 = r0.mo8589t()
            if (r3 != 0) goto L_0x0258
            q.b.a.b.h.b.b4 r2 = r0.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7153f
            java.lang.String r3 = "Failed to load metadata: Metadata bundle is null"
            r2.mo8432a(r3)
            goto L_0x025e
        L_0x0258:
            boolean r7 = r3.containsKey(r2)
            if (r7 != 0) goto L_0x0260
        L_0x025e:
            r2 = r6
            goto L_0x0268
        L_0x0260:
            int r2 = r3.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0268:
            if (r2 != 0) goto L_0x026b
            goto L_0x028f
        L_0x026b:
            q.b.a.b.h.b.g5 r3 = r0.f7133a     // Catch:{ NotFoundException -> 0x0283 }
            android.content.Context r3 = r3.f7332a     // Catch:{ NotFoundException -> 0x0283 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ NotFoundException -> 0x0283 }
            int r2 = r2.intValue()     // Catch:{ NotFoundException -> 0x0283 }
            java.lang.String[] r2 = r3.getStringArray(r2)     // Catch:{ NotFoundException -> 0x0283 }
            if (r2 != 0) goto L_0x027e
            goto L_0x028f
        L_0x027e:
            java.util.List r6 = java.util.Arrays.asList(r2)     // Catch:{ NotFoundException -> 0x0283 }
            goto L_0x028f
        L_0x0283:
            r2 = move-exception
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7153f
            java.lang.String r3 = "Failed to load string array from metadata: resource not found"
            r0.mo8433a(r3, r2)
        L_0x028f:
            if (r6 == 0) goto L_0x02c1
            int r0 = r6.size()
            if (r0 != 0) goto L_0x02a4
            q.b.a.b.h.b.b4 r0 = r14.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7158k
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.mo8432a(r2)
        L_0x02a2:
            r5 = r4
            goto L_0x02c1
        L_0x02a4:
            java.util.Iterator r0 = r6.iterator()
        L_0x02a8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02c1
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            q.b.a.b.h.b.w9 r3 = r14.mo8287k()
            java.lang.String r7 = "safelisted event"
            boolean r2 = r3.mo8805b(r7, r2)
            if (r2 != 0) goto L_0x02a8
            goto L_0x02a2
        L_0x02c1:
            if (r5 == 0) goto L_0x02c7
            r14.f7888i = r6
            goto L_0x02c7
        L_0x02c6:
            throw r6
        L_0x02c7:
            if (r1 == 0) goto L_0x02d4
            q.b.a.b.h.b.g5 r0 = r14.f7133a
            android.content.Context r0 = r0.f7332a
            boolean r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5259a(r0)
            r14.f7889j = r0
            return
        L_0x02d4:
            r14.f7889j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3128u3.mo8372u():void");
    }

    /* renamed from: x */
    public final boolean mo8375x() {
        return true;
    }
}
