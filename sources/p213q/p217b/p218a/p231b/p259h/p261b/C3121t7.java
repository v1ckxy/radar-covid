package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p245p.C2277a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;

/* renamed from: q.b.a.b.h.b.t7 */
public final class C3121t7 extends C2921c5 {

    /* renamed from: c */
    public final C3067o8 f7867c;

    /* renamed from: d */
    public C3117t3 f7868d;

    /* renamed from: e */
    public volatile Boolean f7869e;

    /* renamed from: f */
    public final C2963g f7870f;

    /* renamed from: g */
    public final C3009j9 f7871g;

    /* renamed from: h */
    public final List<Runnable> f7872h = new ArrayList();

    /* renamed from: i */
    public final C2963g f7873i;

    public C3121t7(C2969g5 g5Var) {
        super(g5Var);
        this.f7871g = new C3009j9(g5Var.f7345n);
        this.f7867c = new C3067o8(this);
        this.f7870f = new C3154w7(this, g5Var);
        this.f7873i = new C2972g8(this, g5Var);
    }

    /* renamed from: A */
    public final void mo8720A() {
        mo8279c();
        mo8373v();
        C3067o8 o8Var = this.f7867c;
        if (o8Var.f7662b != null && (o8Var.f7662b.mo7227a() || o8Var.f7662b.mo7232e())) {
            o8Var.f7662b.mo7236i();
        }
        o8Var.f7662b = null;
        try {
            C2277a.m5128a().mo7298a(this.f7133a.f7332a, this.f7867c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f7868d = null;
    }

    /* renamed from: B */
    public final boolean mo8721B() {
        C3010ja jaVar = this.f7133a.f7337f;
        return true;
    }

    /* renamed from: C */
    public final void mo8722C() {
        mo8279c();
        C3009j9 j9Var = this.f7871g;
        if (((C2284c) j9Var.f7464a) != null) {
            j9Var.f7465b = SystemClock.elapsedRealtime();
            this.f7870f.mo8458a(((Long) C3069p.f7684J.mo8702a(null)).longValue());
            return;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0102  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8723D() {
        /*
            r7 = this;
            r7.mo8279c()
            r7.mo8373v()
            java.lang.Boolean r0 = r7.f7869e
            if (r0 != 0) goto L_0x011f
            r7.mo8279c()
            r7.mo8373v()
            q.b.a.b.h.b.o4 r0 = r7.mo8288l()
            r0.mo8279c()
            android.content.SharedPreferences r1 = r0.mo8667s()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L_0x0027
            r0 = r3
            goto L_0x0033
        L_0x0027:
            android.content.SharedPreferences r0 = r0.mo8667s()
            boolean r0 = r0.getBoolean(r2, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0033:
            r1 = 1
            if (r0 == 0) goto L_0x003e
            boolean r5 = r0.booleanValue()
            if (r5 == 0) goto L_0x003e
            goto L_0x0117
        L_0x003e:
            q.b.a.b.h.b.g5 r5 = r7.f7133a
            q.b.a.b.h.b.ja r5 = r5.f7337f
            q.b.a.b.h.b.u3 r5 = r7.mo8298p()
            r5.mo8373v()
            int r5 = r5.f7889j
            if (r5 != r1) goto L_0x004f
            goto L_0x00e6
        L_0x004f:
            q.b.a.b.h.b.b4 r5 = r7.mo8285i()
            q.b.a.b.h.b.e4 r5 = r5.f7161n
            java.lang.String r6 = "Checking service availability"
            r5.mo8432a(r6)
            q.b.a.b.h.b.w9 r5 = r7.mo8287k()
            if (r5 == 0) goto L_0x011e
            q.b.a.b.d.f r3 = p213q.p217b.p218a.p231b.p239d.C2124f.f5997b
            q.b.a.b.h.b.g5 r5 = r5.f7133a
            android.content.Context r5 = r5.f7332a
            r6 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r3 = r3.mo7110a(r5, r6)
            if (r3 == 0) goto L_0x00db
            if (r3 == r1) goto L_0x00cd
            r5 = 2
            if (r3 == r5) goto L_0x00af
            r0 = 3
            if (r3 == r0) goto L_0x00a1
            r0 = 9
            if (r3 == r0) goto L_0x0098
            r0 = 18
            if (r3 == r0) goto L_0x008f
            q.b.a.b.h.b.b4 r0 = r7.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7156i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "Unexpected service status"
            r0.mo8433a(r3, r1)
            goto L_0x00ac
        L_0x008f:
            q.b.a.b.h.b.b4 r0 = r7.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7156i
            java.lang.String r3 = "Service updating"
            goto L_0x00e3
        L_0x0098:
            q.b.a.b.h.b.b4 r0 = r7.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7156i
            java.lang.String r1 = "Service invalid"
            goto L_0x00a9
        L_0x00a1:
            q.b.a.b.h.b.b4 r0 = r7.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7156i
            java.lang.String r1 = "Service disabled"
        L_0x00a9:
            r0.mo8432a(r1)
        L_0x00ac:
            r0 = r4
            r1 = r0
            goto L_0x00e7
        L_0x00af:
            q.b.a.b.h.b.b4 r3 = r7.mo8285i()
            q.b.a.b.h.b.e4 r3 = r3.f7160m
            java.lang.String r5 = "Service container out of date"
            r3.mo8432a(r5)
            q.b.a.b.h.b.w9 r3 = r7.mo8287k()
            int r3 = r3.mo8815u()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r3 >= r5) goto L_0x00c7
            goto L_0x00d8
        L_0x00c7:
            if (r0 != 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r1 = r4
        L_0x00cb:
            r0 = r4
            goto L_0x00e7
        L_0x00cd:
            q.b.a.b.h.b.b4 r0 = r7.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7161n
            java.lang.String r3 = "Service missing"
            r0.mo8432a(r3)
        L_0x00d8:
            r0 = r1
            r1 = r4
            goto L_0x00e7
        L_0x00db:
            q.b.a.b.h.b.b4 r0 = r7.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7161n
            java.lang.String r3 = "Service available"
        L_0x00e3:
            r0.mo8432a(r3)
        L_0x00e6:
            r0 = r1
        L_0x00e7:
            if (r1 != 0) goto L_0x00ff
            q.b.a.b.h.b.g5 r3 = r7.f7133a
            q.b.a.b.h.b.ka r3 = r3.f7338g
            boolean r3 = r3.mo8588s()
            if (r3 == 0) goto L_0x00ff
            q.b.a.b.h.b.b4 r0 = r7.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7153f
            java.lang.String r3 = "No way to upload. Consider using the full version of Analytics"
            r0.mo8432a(r3)
            goto L_0x0100
        L_0x00ff:
            r4 = r0
        L_0x0100:
            if (r4 == 0) goto L_0x0117
            q.b.a.b.h.b.o4 r0 = r7.mo8288l()
            r0.mo8279c()
            android.content.SharedPreferences r0 = r0.mo8667s()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r1)
            r0.apply()
        L_0x0117:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.f7869e = r0
            goto L_0x011f
        L_0x011e:
            throw r3
        L_0x011f:
            java.lang.Boolean r0 = r7.f7869e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3121t7.mo8723D():boolean");
    }

    /* renamed from: E */
    public final void mo8724E() {
        mo8279c();
        mo8285i().f7161n.mo8433a("Processing queued up service tasks", Integer.valueOf(this.f7872h.size()));
        for (Runnable run : this.f7872h) {
            try {
                run.run();
            } catch (Exception e) {
                mo8285i().f7153f.mo8433a("Task exception while flushing queue", e);
            }
        }
        this.f7872h.clear();
        this.f7873i.mo8459b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0211  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p213q.p217b.p218a.p231b.p259h.p261b.C3189z9 mo8725a(boolean r37) {
        /*
            r36 = this;
            r1 = r36
            q.b.a.b.h.b.g5 r0 = r1.f7133a
            q.b.a.b.h.b.ja r0 = r0.f7337f
            q.b.a.b.h.b.u3 r2 = r36.mo8298p()
            if (r37 == 0) goto L_0x0016
            q.b.a.b.h.b.b4 r0 = r36.mo8285i()
            java.lang.String r0 = r0.mo8313y()
            r15 = r0
            goto L_0x0017
        L_0x0016:
            r15 = 0
        L_0x0017:
            r2.mo8279c()
            r2.mo8277a()
            q.b.a.b.h.b.z9 r33 = new q.b.a.b.h.b.z9
            r2.mo8373v()
            java.lang.String r5 = r2.f7882c
            r2.mo8373v()
            java.lang.String r6 = r2.f7890k
            r2.mo8373v()
            java.lang.String r7 = r2.f7883d
            r2.mo8373v()
            int r0 = r2.f7884e
            long r8 = (long) r0
            r2.mo8373v()
            java.lang.String r10 = r2.f7885f
            q.b.a.b.h.b.g5 r0 = r2.f7133a
            q.b.a.b.h.b.ka r0 = r0.f7338g
            r0.mo8583n()
            r2.mo8373v()
            r2.mo8279c()
            long r11 = r2.f7886g
            r13 = 0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r4 = 0
            if (r0 != 0) goto L_0x00d0
            q.b.a.b.h.b.g5 r0 = r2.f7133a
            q.b.a.b.h.b.w9 r11 = r0.mo8473p()
            q.b.a.b.h.b.g5 r0 = r2.f7133a
            android.content.Context r0 = r0.f7332a
            java.lang.String r12 = r0.getPackageName()
            r11.mo8279c()
            p124p.p126b.p127k.C1061o.m2524b(r0)
            p124p.p126b.p127k.C1061o.m2528b(r12)
            android.content.pm.PackageManager r16 = r0.getPackageManager()
            java.security.MessageDigest r13 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7419w()
            r19 = -1
            if (r13 != 0) goto L_0x007e
            q.b.a.b.h.b.b4 r0 = r11.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7153f
            java.lang.String r11 = "Could not get MD5 instance"
            r0.mo8432a(r11)
            goto L_0x00bd
        L_0x007e:
            if (r16 == 0) goto L_0x00cc
            boolean r12 = r11.mo8796a(r0, r12)     // Catch:{ NameNotFoundException -> 0x00c0 }
            if (r12 != 0) goto L_0x00cc
            q.b.a.b.d.r.a r0 = p213q.p217b.p218a.p231b.p239d.p248r.C2294b.m5363b(r0)     // Catch:{ NameNotFoundException -> 0x00c0 }
            q.b.a.b.h.b.g5 r12 = r11.f7133a     // Catch:{ NameNotFoundException -> 0x00c0 }
            android.content.Context r12 = r12.f7332a     // Catch:{ NameNotFoundException -> 0x00c0 }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c0 }
            r14 = 64
            android.content.pm.PackageInfo r0 = r0.mo7310b(r12, r14)     // Catch:{ NameNotFoundException -> 0x00c0 }
            android.content.pm.Signature[] r12 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00c0 }
            if (r12 == 0) goto L_0x00b2
            android.content.pm.Signature[] r12 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00c0 }
            int r12 = r12.length     // Catch:{ NameNotFoundException -> 0x00c0 }
            if (r12 <= 0) goto L_0x00b2
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00c0 }
            r0 = r0[r4]     // Catch:{ NameNotFoundException -> 0x00c0 }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x00c0 }
            byte[] r0 = r13.digest(r0)     // Catch:{ NameNotFoundException -> 0x00c0 }
            long r19 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7402a(r0)     // Catch:{ NameNotFoundException -> 0x00c0 }
            goto L_0x00bd
        L_0x00b2:
            q.b.a.b.h.b.b4 r0 = r11.mo8285i()     // Catch:{ NameNotFoundException -> 0x00c0 }
            q.b.a.b.h.b.e4 r0 = r0.f7156i     // Catch:{ NameNotFoundException -> 0x00c0 }
            java.lang.String r12 = "Could not get signatures"
            r0.mo8432a(r12)     // Catch:{ NameNotFoundException -> 0x00c0 }
        L_0x00bd:
            r11 = r19
            goto L_0x00ce
        L_0x00c0:
            r0 = move-exception
            q.b.a.b.h.b.b4 r11 = r11.mo8285i()
            q.b.a.b.h.b.e4 r11 = r11.f7153f
            java.lang.String r12 = "Package name not found"
            r11.mo8433a(r12, r0)
        L_0x00cc:
            r11 = 0
        L_0x00ce:
            r2.f7886g = r11
        L_0x00d0:
            long r13 = r2.f7886g
            q.b.a.b.h.b.g5 r0 = r2.f7133a
            boolean r16 = r0.mo8464b()
            q.b.a.b.h.b.o4 r0 = r2.mo8288l()
            boolean r0 = r0.f7639v
            r11 = 1
            r0 = r0 ^ r11
            r2.mo8279c()
            r2.mo8277a()
            q.b.a.b.h.b.g5 r12 = r2.f7133a
            boolean r12 = r12.mo8464b()
            if (r12 != 0) goto L_0x00f1
        L_0x00ee:
            r1 = 0
            goto L_0x016b
        L_0x00f1:
            q.b.a.b.g.e.be r12 = p213q.p217b.p218a.p231b.p251g.p256e.C2375be.f6353f
            java.lang.Object r12 = r12.mo7405a()
            q.b.a.b.g.e.zd r12 = (p213q.p217b.p218a.p231b.p251g.p256e.C2786zd) r12
            boolean r12 = r12.mo7547a()
            if (r12 == 0) goto L_0x0114
            q.b.a.b.h.b.g5 r12 = r2.f7133a
            q.b.a.b.h.b.ka r12 = r12.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r3 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7747r0
            boolean r3 = r12.mo8574a(r3)
            if (r3 == 0) goto L_0x0114
            q.b.a.b.h.b.b4 r3 = r2.mo8285i()
            q.b.a.b.h.b.e4 r3 = r3.f7161n
            java.lang.String r12 = "Disabled IID for tests."
            goto L_0x0167
        L_0x0114:
            q.b.a.b.h.b.g5 r3 = r2.f7133a     // Catch:{ ClassNotFoundException -> 0x00ee }
            android.content.Context r3 = r3.f7332a     // Catch:{ ClassNotFoundException -> 0x00ee }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00ee }
            java.lang.String r12 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r3 = r3.loadClass(r12)     // Catch:{ ClassNotFoundException -> 0x00ee }
            if (r3 != 0) goto L_0x0125
            goto L_0x00ee
        L_0x0125:
            java.lang.String r12 = "getInstance"
            java.lang.Class[] r4 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x015f }
            java.lang.Class<android.content.Context> r20 = android.content.Context.class
            r11 = 0
            r4[r11] = r20     // Catch:{ Exception -> 0x015f }
            java.lang.reflect.Method r4 = r3.getDeclaredMethod(r12, r4)     // Catch:{ Exception -> 0x015f }
            r12 = 1
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x015f }
            q.b.a.b.h.b.g5 r12 = r2.f7133a     // Catch:{ Exception -> 0x015f }
            android.content.Context r12 = r12.f7332a     // Catch:{ Exception -> 0x015f }
            r1 = 0
            r11[r1] = r12     // Catch:{ Exception -> 0x015f }
            r12 = 0
            java.lang.Object r4 = r4.invoke(r12, r11)     // Catch:{ Exception -> 0x015f }
            if (r4 != 0) goto L_0x0145
            r1 = r12
            goto L_0x016b
        L_0x0145:
            java.lang.String r11 = "getFirebaseInstanceId"
            java.lang.Class[] r12 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0156 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0156 }
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0156 }
            java.lang.Object r1 = r3.invoke(r4, r11)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0156 }
            goto L_0x016b
        L_0x0156:
            q.b.a.b.h.b.b4 r1 = r2.mo8285i()
            q.b.a.b.h.b.e4 r3 = r1.f7158k
            java.lang.String r12 = "Failed to retrieve Firebase Instance Id"
            goto L_0x0167
        L_0x015f:
            q.b.a.b.h.b.b4 r1 = r2.mo8285i()
            q.b.a.b.h.b.e4 r3 = r1.f7157j
            java.lang.String r12 = "Failed to obtain Firebase Analytics instance"
        L_0x0167:
            r3.mo8432a(r12)
            goto L_0x00ee
        L_0x016b:
            r22 = 0
            q.b.a.b.h.b.g5 r3 = r2.f7133a
            q.b.a.b.h.b.o4 r4 = r3.mo8470m()
            q.b.a.b.h.b.s4 r4 = r4.f7627j
            long r11 = r4.mo8708a()
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            long r11 = r4.longValue()
            r17 = 0
            int r11 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r11 != 0) goto L_0x018a
            long r3 = r3.f7331F
            goto L_0x0194
        L_0x018a:
            long r11 = r3.f7331F
            long r3 = r4.longValue()
            long r3 = java.lang.Math.min(r11, r3)
        L_0x0194:
            r24 = r3
            r2.mo8373v()
            int r3 = r2.f7889j
            q.b.a.b.h.b.g5 r4 = r2.f7133a
            q.b.a.b.h.b.ka r4 = r4.f7338g
            java.lang.Boolean r4 = r4.mo8586q()
            boolean r26 = r4.booleanValue()
            q.b.a.b.h.b.g5 r4 = r2.f7133a
            q.b.a.b.h.b.ka r4 = r4.f7338g
            r4.mo8277a()
            java.lang.String r11 = "google_analytics_ssaid_collection_enabled"
            java.lang.Boolean r4 = r4.mo8579d(r11)
            if (r4 == 0) goto L_0x01bf
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01bd
            goto L_0x01bf
        L_0x01bd:
            r11 = 0
            goto L_0x01c0
        L_0x01bf:
            r11 = 1
        L_0x01c0:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            boolean r27 = r4.booleanValue()
            q.b.a.b.h.b.o4 r4 = r2.mo8288l()
            r4.mo8279c()
            android.content.SharedPreferences r4 = r4.mo8667s()
            java.lang.String r11 = "deferred_analytics_collection"
            r12 = 0
            boolean r28 = r4.getBoolean(r11, r12)
            r2.mo8373v()
            java.lang.String r4 = r2.f7891l
            q.b.a.b.h.b.g5 r11 = r2.f7133a
            q.b.a.b.h.b.ka r11 = r11.f7338g
            java.lang.String r12 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r11 = r11.mo8579d(r12)
            if (r11 != 0) goto L_0x01ee
            r29 = 0
            goto L_0x01fa
        L_0x01ee:
            boolean r11 = r11.booleanValue()
            r12 = 1
            r11 = r11 ^ r12
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r29 = r11
        L_0x01fa:
            long r11 = r2.f7887h
            r17 = r4
            q.b.a.b.h.b.g5 r4 = r2.f7133a
            q.b.a.b.h.b.ka r4 = r4.f7338g
            r20 = r11
            q.b.a.b.h.b.r3<java.lang.Boolean> r11 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7717c0
            boolean r4 = r4.mo8574a(r11)
            if (r4 == 0) goto L_0x0211
            java.util.List<java.lang.String> r4 = r2.f7888i
            r31 = r4
            goto L_0x0213
        L_0x0211:
            r31 = 0
        L_0x0213:
            boolean r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2424ec.m5790b()
            if (r4 == 0) goto L_0x022d
            q.b.a.b.h.b.g5 r4 = r2.f7133a
            q.b.a.b.h.b.ka r4 = r4.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r11 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7741o0
            boolean r4 = r4.mo8574a(r11)
            if (r4 == 0) goto L_0x022d
            r2.mo8373v()
            java.lang.String r2 = r2.f7892m
            r32 = r2
            goto L_0x022f
        L_0x022d:
            r32 = 0
        L_0x022f:
            r11 = 31000(0x7918, double:1.5316E-319)
            r34 = r20
            r2 = r17
            r4 = r33
            r17 = r0
            r18 = r1
            r19 = r22
            r21 = r24
            r23 = r3
            r24 = r26
            r25 = r27
            r26 = r28
            r27 = r2
            r28 = r29
            r29 = r34
            r4.<init>(r5, r6, r7, r8, r10, r11, r13, r15, r16, r17, r18, r19, r21, r23, r24, r25, r26, r27, r28, r29, r31, r32)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3121t7.mo8725a(boolean):q.b.a.b.h.b.z9");
    }

    /* renamed from: x */
    public final boolean mo8375x() {
        return false;
    }

    /* renamed from: y */
    public final boolean mo8729y() {
        mo8279c();
        mo8373v();
        return this.f7868d != null;
    }

    /* renamed from: z */
    public final void mo8730z() {
        mo8279c();
        mo8373v();
        if (!mo8729y()) {
            if (mo8723D()) {
                this.f7867c.mo8682a();
                return;
            }
            if (!this.f7133a.f7338g.mo8588s()) {
                C2969g5 g5Var = this.f7133a;
                C3010ja jaVar = g5Var.f7337f;
                String str = "com.google.android.gms.measurement.AppMeasurementService";
                List queryIntentServices = g5Var.f7332a.getPackageManager().queryIntentServices(new Intent().setClassName(this.f7133a.f7332a, str), 65536);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    C2969g5 g5Var2 = this.f7133a;
                    Context context = g5Var2.f7332a;
                    C3010ja jaVar2 = g5Var2.f7337f;
                    intent.setComponent(new ComponentName(context, str));
                    this.f7867c.mo8683a(intent);
                    return;
                }
                mo8285i().f7153f.mo8432a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:57|58|59|60) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:73|74|75|76) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:43|44|45|46|212) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a1, code lost:
        r17 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a4, code lost:
        r17 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01a9, code lost:
        r17 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ad, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ae, code lost:
        r25 = r10;
        r10 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01b3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01b4, code lost:
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01b7, code lost:
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01ba, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01bb, code lost:
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01be, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01bf, code lost:
        r25 = r10;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01c4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01c8, code lost:
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01cb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01e9, code lost:
        if (r10.inTransaction() != false) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01eb, code lost:
        r10.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01fc, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x020e, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0238, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0239, code lost:
        r1 = r0;
        r25 = r12;
        r10 = r10;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0248, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x024d, code lost:
        r25.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r8.mo8285i().f7153f.mo8432a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r15.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e3, code lost:
        r15.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0101, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r8.mo8285i().f7153f.mo8432a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r15.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0115, code lost:
        r15.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0118, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0133, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r8.mo8285i().f7153f.mo8432a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r15.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014a, code lost:
        r15.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014d, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0103 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0135 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ad A[ExcHandler: all (th java.lang.Throwable), Splitter:B:31:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:18:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01e5 A[SYNTHETIC, Splitter:B:132:0x01e5] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x022f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x022f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x022f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8728a(p213q.p217b.p218a.p231b.p259h.p261b.C3117t3 r30, p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a r31, p213q.p217b.p218a.p231b.p259h.p261b.C3189z9 r32) {
        /*
            r29 = this;
            r1 = r30
            r2 = r31
            r3 = r32
            r29.mo8279c()
            r29.mo8277a()
            r29.mo8373v()
            r29.mo8721B()
            r4 = 0
            r5 = 100
            r6 = r4
            r0 = r5
        L_0x0017:
            r7 = 1001(0x3e9, float:1.403E-42)
            if (r6 >= r7) goto L_0x02d9
            if (r0 != r5) goto L_0x02d9
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            q.b.a.b.h.b.x3 r8 = r29.mo8301s()
            java.lang.String r9 = "Error reading entries from local database"
            r8.mo8279c()
            r8.mo8277a()
            boolean r0 = r8.f7955d
            if (r0 == 0) goto L_0x0037
        L_0x0032:
            r17 = r4
        L_0x0034:
            r10 = 0
            goto L_0x0260
        L_0x0037:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            q.b.a.b.h.b.g5 r0 = r8.f7133a
            android.content.Context r0 = r0.f7332a
            java.lang.String r12 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r12)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0051
            r17 = r4
        L_0x004e:
            r10 = r11
            goto L_0x0260
        L_0x0051:
            r12 = 5
            r13 = r4
            r14 = r12
        L_0x0054:
            if (r13 >= r12) goto L_0x0251
            r15 = 1
            android.database.sqlite.SQLiteDatabase r10 = r8.mo8817A()     // Catch:{ SQLiteFullException -> 0x0214, SQLiteDatabaseLockedException -> 0x0202, SQLiteException -> 0x01de, all -> 0x01d8 }
            if (r10 != 0) goto L_0x0065
            r8.f7955d = r15     // Catch:{ SQLiteFullException -> 0x01d6, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01d4, all -> 0x01cf }
            if (r10 == 0) goto L_0x0032
            r10.close()
            goto L_0x0032
        L_0x0065:
            r10.beginTransaction()     // Catch:{ SQLiteFullException -> 0x01d6, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01d4, all -> 0x01cf }
            long r16 = p213q.p217b.p218a.p231b.p259h.p261b.C3161x3.m7468a(r10)     // Catch:{ SQLiteFullException -> 0x01d6, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01d4, all -> 0x01cf }
            r26 = -1
            int r0 = (r16 > r26 ? 1 : (r16 == r26 ? 0 : -1))
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r12 = new java.lang.String[r15]     // Catch:{ SQLiteFullException -> 0x01d6, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01d4, all -> 0x01cf }
            java.lang.String r16 = java.lang.String.valueOf(r16)     // Catch:{ SQLiteFullException -> 0x01d6, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01d4, all -> 0x01cf }
            r12[r4] = r16     // Catch:{ SQLiteFullException -> 0x01d6, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01d4, all -> 0x01cf }
            r19 = r0
            r20 = r12
            goto L_0x0085
        L_0x0081:
            r19 = 0
            r20 = 0
        L_0x0085:
            java.lang.String r17 = "messages"
            java.lang.String r0 = "rowid"
            java.lang.String r12 = "type"
            java.lang.String r15 = "entry"
            java.lang.String[] r18 = new java.lang.String[]{r0, r12, r15}     // Catch:{ SQLiteFullException -> 0x01d6, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01d4, all -> 0x01cf }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid asc"
            java.lang.String r24 = java.lang.Integer.toString(r5)     // Catch:{ SQLiteFullException -> 0x01d6, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01d4, all -> 0x01cf }
            r16 = r10
            android.database.Cursor r12 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteFullException -> 0x01cb, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01be }
        L_0x00a1:
            boolean r0 = r12.moveToNext()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            if (r0 == 0) goto L_0x0169
            long r26 = r12.getLong(r4)     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            r15 = 1
            int r0 = r12.getInt(r15)     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            r15 = 2
            byte[] r5 = r12.getBlob(r15)     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            if (r0 != 0) goto L_0x00e7
            android.os.Parcel r15 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            int r0 = r5.length     // Catch:{ b -> 0x00d3 }
            r15.unmarshall(r5, r4, r0)     // Catch:{ b -> 0x00d3 }
            r15.setDataPosition(r4)     // Catch:{ b -> 0x00d3 }
            android.os.Parcelable$Creator<q.b.a.b.h.b.n> r0 = p213q.p217b.p218a.p231b.p259h.p261b.C3047n.CREATOR     // Catch:{ b -> 0x00d3 }
            java.lang.Object r0 = r0.createFromParcel(r15)     // Catch:{ b -> 0x00d3 }
            q.b.a.b.h.b.n r0 = (p213q.p217b.p218a.p231b.p259h.p261b.C3047n) r0     // Catch:{ b -> 0x00d3 }
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            if (r0 == 0) goto L_0x0165
            goto L_0x0146
        L_0x00d1:
            r0 = move-exception
            goto L_0x00e3
        L_0x00d3:
            q.b.a.b.h.b.b4 r0 = r8.mo8285i()     // Catch:{ all -> 0x00d1 }
            q.b.a.b.h.b.e4 r0 = r0.f7153f     // Catch:{ all -> 0x00d1 }
            java.lang.String r5 = "Failed to load event from local database"
            r0.mo8432a(r5)     // Catch:{ all -> 0x00d1 }
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            goto L_0x0165
        L_0x00e3:
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            throw r0     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
        L_0x00e7:
            r15 = 1
            if (r0 != r15) goto L_0x0119
            android.os.Parcel r15 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            int r0 = r5.length     // Catch:{ b -> 0x0103 }
            r15.unmarshall(r5, r4, r0)     // Catch:{ b -> 0x0103 }
            r15.setDataPosition(r4)     // Catch:{ b -> 0x0103 }
            android.os.Parcelable$Creator<q.b.a.b.h.b.s9> r0 = p213q.p217b.p218a.p231b.p259h.p261b.C3112s9.CREATOR     // Catch:{ b -> 0x0103 }
            java.lang.Object r0 = r0.createFromParcel(r15)     // Catch:{ b -> 0x0103 }
            q.b.a.b.h.b.s9 r0 = (p213q.p217b.p218a.p231b.p259h.p261b.C3112s9) r0     // Catch:{ b -> 0x0103 }
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            goto L_0x0112
        L_0x0101:
            r0 = move-exception
            goto L_0x0115
        L_0x0103:
            q.b.a.b.h.b.b4 r0 = r8.mo8285i()     // Catch:{ all -> 0x0101 }
            q.b.a.b.h.b.e4 r0 = r0.f7153f     // Catch:{ all -> 0x0101 }
            java.lang.String r5 = "Failed to load user property from local database"
            r0.mo8432a(r5)     // Catch:{ all -> 0x0101 }
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            r0 = 0
        L_0x0112:
            if (r0 == 0) goto L_0x0165
            goto L_0x0146
        L_0x0115:
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            throw r0     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
        L_0x0119:
            r15 = 2
            if (r0 != r15) goto L_0x014e
            android.os.Parcel r15 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            int r0 = r5.length     // Catch:{ b -> 0x0135 }
            r15.unmarshall(r5, r4, r0)     // Catch:{ b -> 0x0135 }
            r15.setDataPosition(r4)     // Catch:{ b -> 0x0135 }
            android.os.Parcelable$Creator<q.b.a.b.h.b.ia> r0 = p213q.p217b.p218a.p231b.p259h.p261b.C2998ia.CREATOR     // Catch:{ b -> 0x0135 }
            java.lang.Object r0 = r0.createFromParcel(r15)     // Catch:{ b -> 0x0135 }
            q.b.a.b.h.b.ia r0 = (p213q.p217b.p218a.p231b.p259h.p261b.C2998ia) r0     // Catch:{ b -> 0x0135 }
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            goto L_0x0144
        L_0x0133:
            r0 = move-exception
            goto L_0x014a
        L_0x0135:
            q.b.a.b.h.b.b4 r0 = r8.mo8285i()     // Catch:{ all -> 0x0133 }
            q.b.a.b.h.b.e4 r0 = r0.f7153f     // Catch:{ all -> 0x0133 }
            java.lang.String r5 = "Failed to load conditional user property from local database"
            r0.mo8432a(r5)     // Catch:{ all -> 0x0133 }
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            r0 = 0
        L_0x0144:
            if (r0 == 0) goto L_0x0165
        L_0x0146:
            r11.add(r0)     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            goto L_0x0165
        L_0x014a:
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            throw r0     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
        L_0x014e:
            r5 = 3
            if (r0 != r5) goto L_0x015a
            q.b.a.b.h.b.b4 r0 = r8.mo8285i()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            q.b.a.b.h.b.e4 r0 = r0.f7156i     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            java.lang.String r5 = "Skipping app launch break"
            goto L_0x0162
        L_0x015a:
            q.b.a.b.h.b.b4 r0 = r8.mo8285i()     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            q.b.a.b.h.b.e4 r0 = r0.f7153f     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
            java.lang.String r5 = "Unknown record type in local database"
        L_0x0162:
            r0.mo8432a(r5)     // Catch:{ SQLiteFullException -> 0x01ba, SQLiteDatabaseLockedException -> 0x01b7, SQLiteException -> 0x01b3, all -> 0x01ad }
        L_0x0165:
            r5 = 100
            goto L_0x00a1
        L_0x0169:
            java.lang.String r0 = "messages"
            java.lang.String r5 = "rowid <= ?"
            r15 = 1
            java.lang.String[] r4 = new java.lang.String[r15]     // Catch:{ SQLiteFullException -> 0x01a8, SQLiteDatabaseLockedException -> 0x01a4, SQLiteException -> 0x01a0, all -> 0x01ad }
            java.lang.String r15 = java.lang.Long.toString(r26)     // Catch:{ SQLiteFullException -> 0x01a8, SQLiteDatabaseLockedException -> 0x01a4, SQLiteException -> 0x01a0, all -> 0x01ad }
            r17 = 0
            r4[r17] = r15     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x019b, all -> 0x01ad }
            int r0 = r10.delete(r0, r5, r4)     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x019b, all -> 0x01ad }
            int r4 = r11.size()     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x019b, all -> 0x01ad }
            if (r0 >= r4) goto L_0x018d
            q.b.a.b.h.b.b4 r0 = r8.mo8285i()     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x019b, all -> 0x01ad }
            q.b.a.b.h.b.e4 r0 = r0.f7153f     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x019b, all -> 0x01ad }
            java.lang.String r4 = "Fewer entries removed from local database than expected"
            r0.mo8432a(r4)     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x019b, all -> 0x01ad }
        L_0x018d:
            r10.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x019b, all -> 0x01ad }
            r10.endTransaction()     // Catch:{ SQLiteFullException -> 0x019d, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x019b, all -> 0x01ad }
            r12.close()
            r10.close()
            goto L_0x004e
        L_0x019b:
            r0 = move-exception
            goto L_0x01e3
        L_0x019d:
            r0 = move-exception
            goto L_0x0219
        L_0x01a0:
            r0 = move-exception
            r17 = 0
            goto L_0x01e3
        L_0x01a4:
            r17 = 0
            goto L_0x0206
        L_0x01a8:
            r0 = move-exception
            r17 = 0
            goto L_0x0219
        L_0x01ad:
            r0 = move-exception
            r25 = r10
            r10 = r12
            goto L_0x0246
        L_0x01b3:
            r0 = move-exception
            r17 = r4
            goto L_0x01e3
        L_0x01b7:
            r17 = r4
            goto L_0x0206
        L_0x01ba:
            r0 = move-exception
            r17 = r4
            goto L_0x0219
        L_0x01be:
            r0 = move-exception
            r25 = r10
            r10 = 0
            goto L_0x0246
        L_0x01c4:
            r0 = move-exception
        L_0x01c5:
            r17 = r4
            goto L_0x01e2
        L_0x01c8:
            r17 = r4
            goto L_0x0205
        L_0x01cb:
            r0 = move-exception
        L_0x01cc:
            r17 = r4
            goto L_0x0218
        L_0x01cf:
            r0 = move-exception
            r25 = 0
            goto L_0x0240
        L_0x01d4:
            r0 = move-exception
            goto L_0x01c5
        L_0x01d6:
            r0 = move-exception
            goto L_0x01cc
        L_0x01d8:
            r0 = move-exception
            r10 = 0
            r25 = 0
            goto L_0x0246
        L_0x01de:
            r0 = move-exception
            r17 = r4
            r10 = 0
        L_0x01e2:
            r12 = 0
        L_0x01e3:
            if (r10 == 0) goto L_0x01ee
            boolean r4 = r10.inTransaction()     // Catch:{ all -> 0x0238 }
            if (r4 == 0) goto L_0x01ee
            r10.endTransaction()     // Catch:{ all -> 0x0238 }
        L_0x01ee:
            q.b.a.b.h.b.b4 r4 = r8.mo8285i()     // Catch:{ all -> 0x0238 }
            q.b.a.b.h.b.e4 r4 = r4.f7153f     // Catch:{ all -> 0x0238 }
            r4.mo8433a(r9, r0)     // Catch:{ all -> 0x0238 }
            r4 = 1
            r8.f7955d = r4     // Catch:{ all -> 0x0238 }
            if (r12 == 0) goto L_0x01ff
            r12.close()
        L_0x01ff:
            if (r10 == 0) goto L_0x022f
            goto L_0x022c
        L_0x0202:
            r17 = r4
            r10 = 0
        L_0x0205:
            r12 = 0
        L_0x0206:
            long r4 = (long) r14
            android.os.SystemClock.sleep(r4)     // Catch:{ all -> 0x0238 }
            int r14 = r14 + 20
            if (r12 == 0) goto L_0x0211
            r12.close()
        L_0x0211:
            if (r10 == 0) goto L_0x022f
            goto L_0x022c
        L_0x0214:
            r0 = move-exception
            r17 = r4
            r10 = 0
        L_0x0218:
            r12 = 0
        L_0x0219:
            q.b.a.b.h.b.b4 r4 = r8.mo8285i()     // Catch:{ all -> 0x0238 }
            q.b.a.b.h.b.e4 r4 = r4.f7153f     // Catch:{ all -> 0x0238 }
            r4.mo8433a(r9, r0)     // Catch:{ all -> 0x0238 }
            r4 = 1
            r8.f7955d = r4     // Catch:{ all -> 0x0238 }
            if (r12 == 0) goto L_0x022a
            r12.close()
        L_0x022a:
            if (r10 == 0) goto L_0x022f
        L_0x022c:
            r10.close()
        L_0x022f:
            int r13 = r13 + 1
            r4 = r17
            r5 = 100
            r12 = 5
            goto L_0x0054
        L_0x0238:
            r0 = move-exception
            r1 = r0
            r0 = r10
            r10 = r12
            r25 = r10
            r10 = r0
            r0 = r1
        L_0x0240:
            r28 = r25
            r25 = r10
            r10 = r28
        L_0x0246:
            if (r10 == 0) goto L_0x024b
            r10.close()
        L_0x024b:
            if (r25 == 0) goto L_0x0250
            r25.close()
        L_0x0250:
            throw r0
        L_0x0251:
            r17 = r4
            q.b.a.b.h.b.b4 r0 = r8.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7156i
            java.lang.String r4 = "Failed to read events from database in reasonable time"
            r0.mo8432a(r4)
            goto L_0x0034
        L_0x0260:
            if (r10 == 0) goto L_0x026b
            r7.addAll(r10)
            int r0 = r10.size()
            r4 = r0
            goto L_0x026d
        L_0x026b:
            r4 = r17
        L_0x026d:
            r5 = 100
            if (r2 == 0) goto L_0x0276
            if (r4 >= r5) goto L_0x0276
            r7.add(r2)
        L_0x0276:
            int r8 = r7.size()
            r0 = r17
        L_0x027c:
            if (r0 >= r8) goto L_0x02d2
            java.lang.Object r9 = r7.get(r0)
            int r10 = r0 + 1
            q.b.a.b.d.n.o.a r9 = (p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a) r9
            boolean r0 = r9 instanceof p213q.p217b.p218a.p231b.p259h.p261b.C3047n
            if (r0 == 0) goto L_0x029d
            q.b.a.b.h.b.n r9 = (p213q.p217b.p218a.p231b.p259h.p261b.C3047n) r9     // Catch:{ RemoteException -> 0x0290 }
            r1.mo8510a(r9, r3)     // Catch:{ RemoteException -> 0x0290 }
            goto L_0x02d0
        L_0x0290:
            r0 = move-exception
            q.b.a.b.h.b.b4 r9 = r29.mo8285i()
            q.b.a.b.h.b.e4 r9 = r9.f7153f
            java.lang.String r11 = "Failed to send event to the service"
        L_0x0299:
            r9.mo8433a(r11, r0)
            goto L_0x02d0
        L_0x029d:
            boolean r0 = r9 instanceof p213q.p217b.p218a.p231b.p259h.p261b.C3112s9
            if (r0 == 0) goto L_0x02b1
            q.b.a.b.h.b.s9 r9 = (p213q.p217b.p218a.p231b.p259h.p261b.C3112s9) r9     // Catch:{ RemoteException -> 0x02a7 }
            r1.mo8511a(r9, r3)     // Catch:{ RemoteException -> 0x02a7 }
            goto L_0x02d0
        L_0x02a7:
            r0 = move-exception
            q.b.a.b.h.b.b4 r9 = r29.mo8285i()
            q.b.a.b.h.b.e4 r9 = r9.f7153f
            java.lang.String r11 = "Failed to send user property to the service"
            goto L_0x0299
        L_0x02b1:
            boolean r0 = r9 instanceof p213q.p217b.p218a.p231b.p259h.p261b.C2998ia
            if (r0 == 0) goto L_0x02c5
            q.b.a.b.h.b.ia r9 = (p213q.p217b.p218a.p231b.p259h.p261b.C2998ia) r9     // Catch:{ RemoteException -> 0x02bb }
            r1.mo8508a(r9, r3)     // Catch:{ RemoteException -> 0x02bb }
            goto L_0x02d0
        L_0x02bb:
            r0 = move-exception
            q.b.a.b.h.b.b4 r9 = r29.mo8285i()
            q.b.a.b.h.b.e4 r9 = r9.f7153f
            java.lang.String r11 = "Failed to send conditional user property to the service"
            goto L_0x0299
        L_0x02c5:
            q.b.a.b.h.b.b4 r0 = r29.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7153f
            java.lang.String r9 = "Discarding data. Unrecognized parcel type."
            r0.mo8432a(r9)
        L_0x02d0:
            r0 = r10
            goto L_0x027c
        L_0x02d2:
            int r6 = r6 + 1
            r0 = r4
            r4 = r17
            goto L_0x0017
        L_0x02d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3121t7.mo8728a(q.b.a.b.h.b.t3, q.b.a.b.d.n.o.a, q.b.a.b.h.b.z9):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m7319a(C3121t7 t7Var, ComponentName componentName) {
        t7Var.mo8279c();
        if (t7Var.f7868d != null) {
            t7Var.f7868d = null;
            t7Var.mo8285i().f7161n.mo8433a("Disconnected from device MeasurementService", componentName);
            t7Var.mo8279c();
            t7Var.mo8730z();
        }
    }

    /* renamed from: a */
    public final void mo8727a(C2998ia iaVar) {
        boolean z;
        C1061o.m2524b(iaVar);
        mo8279c();
        mo8373v();
        C3010ja jaVar = this.f7133a.f7337f;
        C3161x3 s = mo8301s();
        s.mo8287k();
        byte[] a = C3156w9.m7412a((Parcelable) iaVar);
        if (a.length > 131072) {
            s.mo8285i().f7154g.mo8432a("Conditional user property too long for local database. Sending directly to service");
            z = false;
        } else {
            z = s.mo8818a(2, a);
        }
        C2984h8 h8Var = new C2984h8(this, true, z, new C2998ia(iaVar), mo8725a(true), iaVar);
        mo8726a((Runnable) h8Var);
    }

    /* renamed from: a */
    public final void mo8726a(Runnable runnable) {
        mo8279c();
        if (mo8729y()) {
            runnable.run();
        } else if (((long) this.f7872h.size()) >= 1000) {
            mo8285i().f7153f.mo8432a("Discarding data. Max runnable queue size reached");
        } else {
            this.f7872h.add(runnable);
            this.f7873i.mo8458a(60000);
            mo8730z();
        }
    }
}
