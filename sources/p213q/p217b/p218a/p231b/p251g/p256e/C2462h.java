package p213q.p217b.p218a.p231b.p251g.p256e;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2283b;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;
import p213q.p217b.p218a.p231b.p259h.p260a.C2889a;
import p213q.p217b.p218a.p231b.p259h.p261b.C2994i6;

/* renamed from: q.b.a.b.g.e.h */
public class C2462h {

    /* renamed from: i */
    public static volatile C2462h f6553i;

    /* renamed from: j */
    public static Boolean f6554j;

    /* renamed from: a */
    public final String f6555a;

    /* renamed from: b */
    public final C2283b f6556b;

    /* renamed from: c */
    public final ExecutorService f6557c;

    /* renamed from: d */
    public final C2889a f6558d;

    /* renamed from: e */
    public List<Pair<C2994i6, C2465c>> f6559e;

    /* renamed from: f */
    public int f6560f;

    /* renamed from: g */
    public boolean f6561g;

    /* renamed from: h */
    public C2606oe f6562h;

    /* renamed from: q.b.a.b.g.e.h$a */
    public abstract class C2463a implements Runnable {

        /* renamed from: e */
        public final long f6563e;

        /* renamed from: f */
        public final long f6564f;

        /* renamed from: g */
        public final boolean f6565g;

        public C2463a(boolean z) {
            if (((C2284c) C2462h.this.f6556b) != null) {
                this.f6563e = System.currentTimeMillis();
                if (((C2284c) C2462h.this.f6556b) != null) {
                    this.f6564f = SystemClock.elapsedRealtime();
                    this.f6565g = z;
                    return;
                }
                throw null;
            }
            throw null;
        }

        /* renamed from: a */
        public abstract void mo7349a();

        /* renamed from: b */
        public void mo7690b() {
        }

        public void run() {
            if (C2462h.this.f6561g) {
                mo7690b();
                return;
            }
            try {
                mo7349a();
            } catch (Exception e) {
                C2462h.this.mo7688a(e, false, this.f6565g);
                mo7690b();
            }
        }
    }

    /* renamed from: q.b.a.b.g.e.h$b */
    public class C2464b implements ActivityLifecycleCallbacks {
        public C2464b() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C2462h hVar = C2462h.this;
            hVar.f6557c.execute(new C2394d0(this, activity, bundle));
        }

        public final void onActivityDestroyed(Activity activity) {
            C2462h hVar = C2462h.this;
            hVar.f6557c.execute(new C2483i0(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            C2462h hVar = C2462h.this;
            hVar.f6557c.execute(new C2411e0(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            C2462h hVar = C2462h.this;
            hVar.f6557c.execute(new C2428f0(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C2571me meVar = new C2571me();
            C2462h hVar = C2462h.this;
            hVar.f6557c.execute(new C2446g0(this, activity, meVar));
            Bundle b = meVar.mo7875b(50);
            if (b != null) {
                bundle.putAll(b);
            }
        }

        public final void onActivityStarted(Activity activity) {
            C2462h hVar = C2462h.this;
            hVar.f6557c.execute(new C2377c0(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            C2462h hVar = C2462h.this;
            hVar.f6557c.execute(new C2466h0(this, activity));
        }
    }

    /* renamed from: q.b.a.b.g.e.h$c */
    public static class C2465c extends C2355b {

        /* renamed from: a */
        public final C2994i6 f6568a;

        public C2465c(C2994i6 i6Var) {
            this.f6568a = i6Var;
        }

        /* renamed from: a */
        public final int mo7469a() {
            return System.identityHashCode(this.f6568a);
        }

        /* renamed from: a */
        public final void mo7470a(String str, String str2, Bundle bundle, long j) {
            this.f6568a.mo1622a(str, str2, bundle, j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2462h(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, android.os.Bundle r13) {
        /*
            r8 = this;
            r8.<init>()
            if (r10 == 0) goto L_0x000b
            boolean r0 = m5878a(r11, r12)
            if (r0 != 0) goto L_0x000d
        L_0x000b:
            java.lang.String r10 = "FA"
        L_0x000d:
            r8.f6555a = r10
            q.b.a.b.d.q.c r10 = p213q.p217b.p218a.p231b.p239d.p246q.C2284c.f6249a
            r8.f6556b = r10
            q.b.a.b.g.e.d8 r10 = p213q.p217b.p218a.p231b.p251g.p256e.C2453g6.f6547a
            q.b.a.b.g.e.o r7 = new q.b.a.b.g.e.o
            r7.<init>()
            java.util.concurrent.ThreadPoolExecutor r10 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 1
            r2 = 1
            r3 = 60
            r0 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r0 = 1
            r10.allowCoreThreadTimeOut(r0)
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.unconfigurableExecutorService(r10)
            r8.f6557c = r10
            q.b.a.b.h.a.a r10 = new q.b.a.b.h.a.a
            r10.<init>(r8)
            r8.f6558d = r10
            r10 = 0
            java.lang.String r1 = "google_app_id"
            java.lang.String r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5189a(r9, r1)     // Catch:{ IllegalStateException -> 0x0047 }
            if (r1 == 0) goto L_0x0047
            r1 = r0
            goto L_0x0048
        L_0x0047:
            r1 = r10
        L_0x0048:
            if (r1 == 0) goto L_0x0057
            java.lang.String r1 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0051 }
            r1 = r0
            goto L_0x0052
        L_0x0051:
            r1 = r10
        L_0x0052:
            if (r1 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r1 = r10
            goto L_0x0058
        L_0x0057:
            r1 = r0
        L_0x0058:
            if (r1 != 0) goto L_0x0064
            r8.f6561g = r0
            java.lang.String r9 = r8.f6555a
            java.lang.String r10 = "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection."
            android.util.Log.w(r9, r10)
            return
        L_0x0064:
            boolean r1 = m5878a(r11, r12)
            if (r1 != 0) goto L_0x008a
            if (r11 == 0) goto L_0x0076
            if (r12 == 0) goto L_0x0076
            java.lang.String r10 = r8.f6555a
            java.lang.String r0 = "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy"
            android.util.Log.v(r10, r0)
            goto L_0x008a
        L_0x0076:
            if (r11 != 0) goto L_0x007a
            r1 = r0
            goto L_0x007b
        L_0x007a:
            r1 = r10
        L_0x007b:
            if (r12 != 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r0 = r10
        L_0x007f:
            r10 = r1 ^ r0
            if (r10 == 0) goto L_0x008a
            java.lang.String r10 = r8.f6555a
            java.lang.String r0 = "Specified origin or custom app id is null. Both parameters will be ignored."
            android.util.Log.w(r10, r0)
        L_0x008a:
            q.b.a.b.g.e.k r10 = new q.b.a.b.g.e.k
            r1 = r10
            r2 = r8
            r3 = r11
            r4 = r12
            r5 = r9
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ExecutorService r11 = r8.f6557c
            r11.execute(r10)
            android.content.Context r9 = r9.getApplicationContext()
            android.app.Application r9 = (android.app.Application) r9
            if (r9 != 0) goto L_0x00aa
            java.lang.String r9 = r8.f6555a
            java.lang.String r10 = "Unable to register lifecycle notifications. Application null."
            android.util.Log.w(r9, r10)
            return
        L_0x00aa:
            q.b.a.b.g.e.h$b r10 = new q.b.a.b.g.e.h$b
            r10.<init>()
            r9.registerActivityLifecycleCallbacks(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2462h.<init>(android.content.Context, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: a */
    public static C2462h m5876a(Context context, String str, String str2, String str3, Bundle bundle) {
        C1061o.m2524b(context);
        if (f6553i == null) {
            synchronized (C2462h.class) {
                if (f6553i == null) {
                    C2462h hVar = new C2462h(context, str, str2, str3, bundle);
                    f6553i = hVar;
                }
            }
        }
        return f6553i;
    }

    /* renamed from: a */
    public final void mo7688a(Exception exc, boolean z, boolean z2) {
        this.f6561g |= z;
        if (z) {
            Log.w(this.f6555a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        String str = "Error with data collection. Data lost.";
        if (z2) {
            this.f6557c.execute(new C2740x(this, str, exc));
        }
        Log.w(this.f6555a, str, exc);
    }

    /* renamed from: a */
    public final void mo7689a(String str, String str2, Bundle bundle) {
        C2356b0 b0Var = new C2356b0(this, null, str, str2, bundle, true, true);
        this.f6557c.execute(b0Var);
    }

    /* renamed from: a */
    public static boolean m5878a(String str, String str2) {
        boolean z;
        if (!(str2 == null || str == null)) {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x002e A[SYNTHETIC, Splitter:B:22:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0036  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5877a(android.content.Context r6) {
        /*
            java.lang.Class<q.b.a.b.g.e.h> r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2462h.class
            monitor-enter(r0)
            r1 = 0
            java.lang.Boolean r2 = f6554j     // Catch:{ Exception -> 0x0057 }
            if (r2 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x000a:
            java.lang.String r2 = "app_measurement_internal_disable_startup_flags"
            p124p.p126b.p127k.C1061o.m2528b(r2)     // Catch:{ Exception -> 0x0057 }
            q.b.a.b.d.r.a r3 = p213q.p217b.p218a.p231b.p239d.p248r.C2294b.m5363b(r6)     // Catch:{ NameNotFoundException -> 0x002b }
            java.lang.String r4 = r6.getPackageName()     // Catch:{ NameNotFoundException -> 0x002b }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r3.mo7308a(r4, r5)     // Catch:{ NameNotFoundException -> 0x002b }
            if (r3 == 0) goto L_0x002b
            android.os.Bundle r4 = r3.metaData     // Catch:{ NameNotFoundException -> 0x002b }
            if (r4 != 0) goto L_0x0024
            goto L_0x002b
        L_0x0024:
            android.os.Bundle r3 = r3.metaData     // Catch:{ NameNotFoundException -> 0x002b }
            boolean r2 = r3.getBoolean(r2)     // Catch:{ NameNotFoundException -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r2 = r1
        L_0x002c:
            if (r2 == 0) goto L_0x0036
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0057 }
            f6554j = r6     // Catch:{ Exception -> 0x0057 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x0036:
            java.lang.String r2 = "com.google.android.gms.measurement.prefs"
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r2, r1)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = "allow_remote_dynamite"
            boolean r2 = r6.getBoolean(r2, r1)     // Catch:{ Exception -> 0x0057 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0057 }
            f6554j = r2     // Catch:{ Exception -> 0x0057 }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = "allow_remote_dynamite"
            r6.remove(r2)     // Catch:{ Exception -> 0x0057 }
            r6.apply()     // Catch:{ Exception -> 0x0057 }
            goto L_0x0065
        L_0x0055:
            r6 = move-exception
            goto L_0x0067
        L_0x0057:
            r6 = move-exception
            java.lang.String r2 = "FA"
            java.lang.String r3 = "Exception reading flag from SharedPreferences."
            android.util.Log.e(r2, r3, r6)     // Catch:{ all -> 0x0055 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0055 }
            f6554j = r6     // Catch:{ all -> 0x0055 }
        L_0x0065:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x0067:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2462h.m5877a(android.content.Context):void");
    }
}
