package p124p.p150h.p151d;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: p.h.d.b */
public final class C1311b {

    /* renamed from: a */
    public static final Class<?> f3937a;

    /* renamed from: b */
    public static final Field f3938b;

    /* renamed from: c */
    public static final Field f3939c;

    /* renamed from: d */
    public static final Method f3940d;

    /* renamed from: e */
    public static final Method f3941e;

    /* renamed from: f */
    public static final Method f3942f;

    /* renamed from: g */
    public static final Handler f3943g = new Handler(Looper.getMainLooper());

    /* renamed from: p.h.d.b$a */
    public class C1312a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C1314c f3944e;

        /* renamed from: f */
        public final /* synthetic */ Object f3945f;

        public C1312a(C1314c cVar, Object obj) {
            this.f3944e = cVar;
            this.f3945f = obj;
        }

        public void run() {
            this.f3944e.f3948e = this.f3945f;
        }
    }

    /* renamed from: p.h.d.b$b */
    public class C1313b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Application f3946e;

        /* renamed from: f */
        public final /* synthetic */ C1314c f3947f;

        public C1313b(Application application, C1314c cVar) {
            this.f3946e = application;
            this.f3947f = cVar;
        }

        public void run() {
            this.f3946e.unregisterActivityLifecycleCallbacks(this.f3947f);
        }
    }

    /* renamed from: p.h.d.b$c */
    public static final class C1314c implements ActivityLifecycleCallbacks {

        /* renamed from: e */
        public Object f3948e;

        /* renamed from: f */
        public Activity f3949f;

        /* renamed from: g */
        public boolean f3950g = false;

        /* renamed from: h */
        public boolean f3951h = false;

        /* renamed from: i */
        public boolean f3952i = false;

        public C1314c(Activity activity) {
            this.f3949f = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f3949f == activity) {
                this.f3949f = null;
                this.f3951h = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f3951h && !this.f3952i && !this.f3950g) {
                Object obj = this.f3948e;
                boolean z = false;
                try {
                    Object obj2 = C1311b.f3939c.get(activity);
                    if (obj2 == obj) {
                        C1311b.f3943g.postAtFrontOfQueue(new C1315c(C1311b.f3938b.get(activity), obj2));
                        z = true;
                    }
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th);
                }
                if (z) {
                    this.f3952i = true;
                    this.f3948e = null;
                }
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f3949f == activity) {
                this.f3950g = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[SYNTHETIC, Splitter:B:25:0x005d] */
    static {
        /*
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            f3943g = r0
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            f3937a = r1
            r1 = 1
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r2 = r0
        L_0x0024:
            f3938b = r2
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ all -> 0x0032 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0033
        L_0x0032:
            r2 = r0
        L_0x0033:
            f3939c = r2
            java.lang.Class<?> r2 = f3937a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r2 != 0) goto L_0x0040
        L_0x003e:
            r2 = r0
            goto L_0x0055
        L_0x0040:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x003e }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x003e }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003e }
            r7[r1] = r8     // Catch:{ all -> 0x003e }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch:{ all -> 0x003e }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x003e }
            r2.setAccessible(r1)     // Catch:{ all -> 0x003e }
        L_0x0055:
            f3940d = r2
            java.lang.Class<?> r2 = f3937a
            if (r2 != 0) goto L_0x005d
        L_0x005b:
            r2 = r0
            goto L_0x006e
        L_0x005d:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x005b }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x005b }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x005b }
            r7[r1] = r8     // Catch:{ all -> 0x005b }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x005b }
            r2.setAccessible(r1)     // Catch:{ all -> 0x005b }
        L_0x006e:
            f3941e = r2
            java.lang.Class<?> r2 = f3937a
            boolean r4 = m3360a()
            if (r4 == 0) goto L_0x00b3
            if (r2 != 0) goto L_0x007b
            goto L_0x00b3
        L_0x007b:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x00b3 }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x00b3 }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r1] = r6     // Catch:{ all -> 0x00b3 }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch:{ all -> 0x00b3 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00b3 }
            r7[r3] = r5     // Catch:{ all -> 0x00b3 }
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b3 }
            r7[r3] = r5     // Catch:{ all -> 0x00b3 }
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            r7[r3] = r5     // Catch:{ all -> 0x00b3 }
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            r7[r3] = r5     // Catch:{ all -> 0x00b3 }
            r3 = 7
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b3 }
            r7[r3] = r5     // Catch:{ all -> 0x00b3 }
            r3 = 8
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b3 }
            r7[r3] = r5     // Catch:{ all -> 0x00b3 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x00b3 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x00b3 }
            r0 = r2
        L_0x00b3:
            f3942f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p151d.C1311b.<clinit>():void");
    }

    /* renamed from: a */
    public static boolean m3360a() {
        int i = VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: a */
    public static boolean m3361a(Activity activity) {
        Application application;
        C1314c cVar;
        if (VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m3360a() && f3942f == null) {
            return false;
        } else {
            if (f3941e == null && f3940d == null) {
                return false;
            }
            try {
                Object obj = f3939c.get(activity);
                if (obj == null) {
                    return false;
                }
                Object obj2 = f3938b.get(activity);
                if (obj2 == null) {
                    return false;
                }
                application = activity.getApplication();
                cVar = new C1314c(activity);
                application.registerActivityLifecycleCallbacks(cVar);
                f3943g.post(new C1312a(cVar, obj));
                if (m3360a()) {
                    f3942f.invoke(obj2, new Object[]{obj, null, null, Integer.valueOf(0), Boolean.valueOf(false), null, null, Boolean.valueOf(false), Boolean.valueOf(false)});
                } else {
                    activity.recreate();
                }
                f3943g.post(new C1313b(application, cVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
