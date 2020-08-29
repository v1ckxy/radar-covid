package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p239d.p246q.p247i.C2290a;
import p213q.p217b.p218a.p231b.p270l.C3244c0;
import p213q.p217b.p218a.p231b.p270l.C3246d0;
import p213q.p217b.p218a.p231b.p270l.C3250f0;
import p213q.p217b.p218a.p231b.p270l.C3252g0;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p218a.p231b.p270l.C3270u;
import p213q.p217b.p317d.C3857a;
import p213q.p217b.p317d.C3859c;
import p213q.p217b.p317d.p345j.C4207b;
import p213q.p217b.p317d.p345j.C4209d;
import p213q.p217b.p317d.p346k.C4212c;
import p213q.p217b.p317d.p347l.C4215a;
import p213q.p217b.p317d.p347l.C4216a0;
import p213q.p217b.p317d.p347l.C4220b1;
import p213q.p217b.p317d.p347l.C4225d0;
import p213q.p217b.p317d.p347l.C4253q;
import p213q.p217b.p317d.p347l.C4259s0;
import p213q.p217b.p317d.p347l.C4261t0;
import p213q.p217b.p317d.p347l.C4263u0;
import p213q.p217b.p317d.p347l.C4264v;
import p213q.p217b.p317d.p347l.C4265v0;
import p213q.p217b.p317d.p347l.C4272z;
import p213q.p217b.p317d.p350n.C4283g;
import p213q.p217b.p317d.p354p.C4317f;

public class FirebaseInstanceId {

    /* renamed from: i */
    public static final long f1536i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    public static C4216a0 f1537j;
    @GuardedBy("FirebaseInstanceId.class")

    /* renamed from: k */
    public static ScheduledExecutorService f1538k;

    /* renamed from: a */
    public final Executor f1539a;

    /* renamed from: b */
    public final C3859c f1540b;

    /* renamed from: c */
    public final C4253q f1541c;

    /* renamed from: d */
    public final C4220b1 f1542d;

    /* renamed from: e */
    public final C4264v f1543e;

    /* renamed from: f */
    public final C4283g f1544f;
    @GuardedBy("this")

    /* renamed from: g */
    public boolean f1545g = false;

    /* renamed from: h */
    public final C0329a f1546h;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    public class C0329a {

        /* renamed from: a */
        public boolean f1547a;

        /* renamed from: b */
        public final C4209d f1548b;
        @GuardedBy("this")

        /* renamed from: c */
        public boolean f1549c;
        @GuardedBy("this")

        /* renamed from: d */
        public C4207b<C3857a> f1550d;
        @GuardedBy("this")

        /* renamed from: e */
        public Boolean f1551e;

        public C0329a(C4209d dVar) {
            this.f1548b = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            return r1.f1547a && r1.f1552f.f1540b.mo10059d();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean mo3060a() {
            /*
                r1 = this;
                monitor-enter(r1)
                r1.mo3061b()     // Catch:{ all -> 0x0023 }
                java.lang.Boolean r0 = r1.f1551e     // Catch:{ all -> 0x0023 }
                if (r0 == 0) goto L_0x0010
                java.lang.Boolean r0 = r1.f1551e     // Catch:{ all -> 0x0023 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0023 }
                monitor-exit(r1)
                return r0
            L_0x0010:
                boolean r0 = r1.f1547a     // Catch:{ all -> 0x0023 }
                if (r0 == 0) goto L_0x0021
                com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.this     // Catch:{ all -> 0x0023 }
                q.b.d.c r0 = r0.f1540b     // Catch:{ all -> 0x0023 }
                boolean r0 = r0.mo10059d()     // Catch:{ all -> 0x0023 }
                if (r0 == 0) goto L_0x0021
                r0 = 1
            L_0x001f:
                monitor-exit(r1)
                return r0
            L_0x0021:
                r0 = 0
                goto L_0x001f
            L_0x0023:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.C0329a.mo3060a():boolean");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|(1:15)) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r1 = r4.f1552f.f1540b;
            r1.mo10056a();
            r1 = r1.f9459a;
            r2 = new android.content.Intent("com.google.firebase.MESSAGING_EVENT");
            r2.setPackage(r1.getPackageName());
            r3 = false;
            r1 = r1.getPackageManager().resolveService(r2, 0);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x000f */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void mo3061b() {
            /*
                r4 = this;
                monitor-enter(r4)
                boolean r0 = r4.f1549c     // Catch:{ all -> 0x0056 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r4)
                return
            L_0x0007:
                r0 = 1
                java.lang.String r1 = "com.google.firebase.messaging.FirebaseMessaging"
                java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x000f }
            L_0x000d:
                r3 = r0
                goto L_0x0036
            L_0x000f:
                com.google.firebase.iid.FirebaseInstanceId r1 = com.google.firebase.iid.FirebaseInstanceId.this     // Catch:{ all -> 0x0056 }
                q.b.d.c r1 = r1.f1540b     // Catch:{ all -> 0x0056 }
                r1.mo10056a()     // Catch:{ all -> 0x0056 }
                android.content.Context r1 = r1.f9459a     // Catch:{ all -> 0x0056 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x0056 }
                java.lang.String r3 = "com.google.firebase.MESSAGING_EVENT"
                r2.<init>(r3)     // Catch:{ all -> 0x0056 }
                java.lang.String r3 = r1.getPackageName()     // Catch:{ all -> 0x0056 }
                r2.setPackage(r3)     // Catch:{ all -> 0x0056 }
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x0056 }
                r3 = 0
                android.content.pm.ResolveInfo r1 = r1.resolveService(r2, r3)     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x0036
                android.content.pm.ServiceInfo r1 = r1.serviceInfo     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x0036
                goto L_0x000d
            L_0x0036:
                r4.f1547a = r3     // Catch:{ all -> 0x0056 }
                java.lang.Boolean r1 = r4.mo3062c()     // Catch:{ all -> 0x0056 }
                r4.f1551e = r1     // Catch:{ all -> 0x0056 }
                if (r1 != 0) goto L_0x0052
                boolean r1 = r4.f1547a     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x0052
                q.b.d.l.y0 r1 = new q.b.d.l.y0     // Catch:{ all -> 0x0056 }
                r1.<init>(r4)     // Catch:{ all -> 0x0056 }
                r4.f1550d = r1     // Catch:{ all -> 0x0056 }
                q.b.d.j.d r2 = r4.f1548b     // Catch:{ all -> 0x0056 }
                java.lang.Class<q.b.d.a> r3 = p213q.p217b.p317d.C3857a.class
                r2.mo10096a(r3, r1)     // Catch:{ all -> 0x0056 }
            L_0x0052:
                r4.f1549c = r0     // Catch:{ all -> 0x0056 }
                monitor-exit(r4)
                return
            L_0x0056:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.C0329a.mo3061b():void");
        }

        /* renamed from: c */
        public final Boolean mo3062c() {
            String str = "firebase_messaging_auto_init_enabled";
            C3859c cVar = FirebaseInstanceId.this.f1540b;
            cVar.mo10056a();
            Context context = cVar.f9459a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            String str2 = "auto_init";
            if (sharedPreferences.contains(str2)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
            return null;
        }
    }

    public FirebaseInstanceId(C3859c cVar, C4253q qVar, Executor executor, Executor executor2, C4209d dVar, C4317f fVar, C4212c cVar2, C4283g gVar) {
        C3859c cVar3 = cVar;
        Executor executor3 = executor2;
        if (C4253q.m9735a(cVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f1537j == null) {
                    cVar.mo10056a();
                    f1537j = new C4216a0(cVar3.f9459a);
                }
            }
            this.f1540b = cVar3;
            C4253q qVar2 = qVar;
            this.f1541c = qVar2;
            C4220b1 b1Var = new C4220b1(cVar, qVar2, executor, fVar, cVar2, gVar);
            this.f1542d = b1Var;
            this.f1539a = executor3;
            this.f1546h = new C0329a(dVar);
            Executor executor4 = executor;
            this.f1543e = new C4264v(executor);
            this.f1544f = gVar;
            executor2.execute(new C4261t0(this));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* renamed from: a */
    public static void m1139a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f1538k == null) {
                f1538k = new ScheduledThreadPoolExecutor(1, new C2290a("FirebaseInstanceId"));
            }
            f1538k.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: g */
    public static FirebaseInstanceId m1141g() {
        return getInstance(C3859c.m9233f());
    }

    @Keep
    public static FirebaseInstanceId getInstance(C3859c cVar) {
        cVar.mo10056a();
        return (FirebaseInstanceId) cVar.f9462d.mo10075a(FirebaseInstanceId.class);
    }

    /* renamed from: h */
    public static boolean m1142h() {
        String str = "FirebaseInstanceId";
        return Log.isLoggable(str, 3) || (VERSION.SDK_INT == 23 && Log.isLoggable(str, 3));
    }

    /* renamed from: a */
    public final synchronized void mo3052a(long j) {
        m1139a(new C4225d0(this, Math.min(Math.max(30, j << 1), f1536i)), j);
        this.f1545g = true;
    }

    /* renamed from: a */
    public final synchronized void mo3053a(boolean z) {
        this.f1545g = z;
    }

    /* renamed from: a */
    public final boolean mo3054a(C4272z zVar) {
        if (zVar != null) {
            return (System.currentTimeMillis() > (zVar.f10280c + C4272z.f10277d) ? 1 : (System.currentTimeMillis() == (zVar.f10280c + C4272z.f10277d) ? 0 : -1)) > 0 || !this.f1541c.mo10443b().equals(zVar.f10279b);
        }
    }

    /* renamed from: b */
    public final synchronized void mo3055b() {
        f1537j.mo10400a();
        if (this.f1546h.mo3060a()) {
            mo3057d();
        }
    }

    /* renamed from: c */
    public final void mo3056c() {
        if (mo3054a(f1537j.mo10399a(mo3059f(), C4253q.m9735a(this.f1540b), "*"))) {
            mo3057d();
        }
    }

    /* renamed from: d */
    public final synchronized void mo3057d() {
        if (!this.f1545g) {
            mo3052a(0);
        }
    }

    /* renamed from: e */
    public final String mo3058e() {
        try {
            f1537j.mo10398a(this.f1540b.mo10057b());
            C3255i id = this.f1544f.getId();
            C1061o.m2525b(id, (Object) "Task must not be null");
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Executor executor = C4265v0.f10253e;
            C4263u0 u0Var = new C4263u0(countDownLatch);
            C3250f0 f0Var = (C3250f0) id;
            C3244c0<TResult> c0Var = f0Var.f8121b;
            C3252g0.m7579a(executor);
            c0Var.mo8917a((C3246d0<TResult>) new C3270u<TResult>(executor, u0Var));
            f0Var.mo8938f();
            countDownLatch.await(30000, TimeUnit.MILLISECONDS);
            if (id.mo8936d()) {
                return (String) id.mo8931b();
            }
            if (((C3250f0) id).f8123d) {
                throw new CancellationException("Task is already canceled");
            }
            throw new IllegalStateException(id.mo8920a());
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    public final String mo3059f() {
        C3859c cVar = this.f1540b;
        cVar.mo10056a();
        return "[DEFAULT]".equals(cVar.f9460b) ? Objects.EMPTY_STRING : this.f1540b.mo10057b();
    }

    /* renamed from: a */
    public final String mo3051a() {
        String a = C4253q.m9735a(this.f1540b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            try {
                return ((C4215a) C2286e.m5187a(C2286e.m5291b(null).mo8932b(this.f1539a, new C4259s0(this, a, "*")), 30000, TimeUnit.MILLISECONDS)).mo10397a();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                        mo3055b();
                    }
                    throw ((IOException) cause);
                } else if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else {
                    throw new IOException(e);
                }
            } catch (InterruptedException | TimeoutException unused) {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("MAIN_THREAD");
        }
    }
}
