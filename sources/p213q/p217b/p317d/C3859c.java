package p213q.p217b.p317d;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;
import p124p.p126b.p127k.C1061o;
import p124p.p143e.C1248a;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2164c;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2164c.C2165a;
import p213q.p217b.p218a.p231b.p239d.p242n.C2254m;
import p213q.p217b.p218a.p231b.p239d.p246q.C2287f;
import p213q.p217b.p317d.p321g.C3884d;
import p213q.p217b.p317d.p321g.C3895m;
import p213q.p217b.p317d.p321g.C3904v;
import p213q.p217b.p317d.p345j.C4208c;
import p213q.p217b.p317d.p353o.C4311a;

/* renamed from: q.b.d.c */
public class C3859c {

    /* renamed from: i */
    public static final Object f9456i = new Object();

    /* renamed from: j */
    public static final Executor f9457j = new C3863d(null);
    @GuardedBy("LOCK")

    /* renamed from: k */
    public static final Map<String, C3859c> f9458k = new C1248a();

    /* renamed from: a */
    public final Context f9459a;

    /* renamed from: b */
    public final String f9460b;

    /* renamed from: c */
    public final C3866e f9461c;

    /* renamed from: d */
    public final C3895m f9462d;

    /* renamed from: e */
    public final AtomicBoolean f9463e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f9464f = new AtomicBoolean();

    /* renamed from: g */
    public final C3904v<C4311a> f9465g;

    /* renamed from: h */
    public final List<C3861b> f9466h = new CopyOnWriteArrayList();

    /* renamed from: q.b.d.c$b */
    public interface C3861b {
        /* renamed from: a */
        void mo10064a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: q.b.d.c$c */
    public static class C3862c implements C2165a {

        /* renamed from: a */
        public static AtomicReference<C3862c> f9467a = new AtomicReference<>();

        /* renamed from: a */
        public static /* synthetic */ void m9240a(Context context) {
            if (context.getApplicationContext() instanceof Application) {
                Application application = (Application) context.getApplicationContext();
                if (f9467a.get() == null) {
                    C3862c cVar = new C3862c();
                    if (f9467a.compareAndSet(null, cVar)) {
                        C2164c.m4961a(application);
                        C2164c.f6033i.mo7150a((C2165a) cVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo7162a(boolean z) {
            synchronized (C3859c.f9456i) {
                Iterator it = new ArrayList(C3859c.f9458k.values()).iterator();
                while (it.hasNext()) {
                    C3859c cVar = (C3859c) it.next();
                    if (cVar.f9463e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        for (C3861b a : cVar.f9466h) {
                            a.mo10064a(z);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: q.b.d.c$d */
    public static class C3863d implements Executor {

        /* renamed from: e */
        public static final Handler f9468e = new Handler(Looper.getMainLooper());

        public /* synthetic */ C3863d(C3860a aVar) {
        }

        public void execute(Runnable runnable) {
            f9468e.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: q.b.d.c$e */
    public static class C3864e extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference<C3864e> f9469b = new AtomicReference<>();

        /* renamed from: a */
        public final Context f9470a;

        public C3864e(Context context) {
            this.f9470a = context;
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C3859c.f9456i) {
                for (C3859c c : C3859c.f9458k.values()) {
                    c.mo10058c();
                }
            }
            this.f9470a.unregisterReceiver(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3859c(android.content.Context r13, java.lang.String r14, p213q.p217b.p317d.C3866e r15) {
        /*
            r12 = this;
            r12.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r12.f9463e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r12.f9464f = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r12.f9466h = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p124p.p126b.p127k.C1061o.m2524b(r13)
            r12.f9459a = r13
            p124p.p126b.p127k.C1061o.m2528b(r14)
            r12.f9460b = r14
            p124p.p126b.p127k.C1061o.m2524b(r15)
            r12.f9461c = r15
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r14 = com.google.firebase.components.ComponentDiscoveryService.class
            q.b.d.g.g r0 = new q.b.d.g.g
            r2 = 0
            r0.<init>(r14, r2)
            java.lang.String r14 = "ComponentDiscovery"
            android.content.pm.PackageManager r3 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r3 != 0) goto L_0x0040
            java.lang.String r0 = "Context has no PackageManager."
            goto L_0x0062
        L_0x0040:
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0069 }
            java.lang.Class<? extends android.app.Service> r5 = r0.f9512a     // Catch:{ NameNotFoundException -> 0x0069 }
            r4.<init>(r13, r5)     // Catch:{ NameNotFoundException -> 0x0069 }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r3 = r3.getServiceInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r3 != 0) goto L_0x0066
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0069 }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x0069 }
            java.lang.Class<? extends android.app.Service> r0 = r0.f9512a     // Catch:{ NameNotFoundException -> 0x0069 }
            r3.append(r0)     // Catch:{ NameNotFoundException -> 0x0069 }
            java.lang.String r0 = " has no service info."
            r3.append(r0)     // Catch:{ NameNotFoundException -> 0x0069 }
            java.lang.String r0 = r3.toString()     // Catch:{ NameNotFoundException -> 0x0069 }
        L_0x0062:
            android.util.Log.w(r14, r0)     // Catch:{ NameNotFoundException -> 0x0069 }
            goto L_0x006e
        L_0x0066:
            android.os.Bundle r0 = r3.metaData     // Catch:{ NameNotFoundException -> 0x0069 }
            goto L_0x006f
        L_0x0069:
            java.lang.String r0 = "Application info not found."
            android.util.Log.w(r14, r0)
        L_0x006e:
            r0 = r2
        L_0x006f:
            java.lang.String r3 = "com.google.firebase.components.ComponentRegistrar"
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r14, r0)
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00b3
        L_0x007d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r5 = r0.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x008a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00b2
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.get(r6)
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x008a
            java.lang.String r7 = "com.google.firebase.components:"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x008a
            r7 = 31
            java.lang.String r6 = r6.substring(r7)
            r4.add(r6)
            goto L_0x008a
        L_0x00b2:
            r0 = r4
        L_0x00b3:
            java.lang.String r4 = "Could not instantiate %s"
            java.lang.String r5 = "Could not instantiate %s."
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c0:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 2
            if (r7 == 0) goto L_0x0133
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Class r10 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException -> 0x0124, IllegalAccessException -> 0x011a, InstantiationException -> 0x0110, NoSuchMethodException -> 0x0106, InvocationTargetException -> 0x00fc }
            java.lang.Class<q.b.d.g.i> r11 = p213q.p217b.p317d.p321g.C3891i.class
            boolean r11 = r11.isAssignableFrom(r10)     // Catch:{ ClassNotFoundException -> 0x0124, IllegalAccessException -> 0x011a, InstantiationException -> 0x0110, NoSuchMethodException -> 0x0106, InvocationTargetException -> 0x00fc }
            if (r11 != 0) goto L_0x00ea
            java.lang.String r10 = "Class %s is not an instance of %s"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ ClassNotFoundException -> 0x0124, IllegalAccessException -> 0x011a, InstantiationException -> 0x0110, NoSuchMethodException -> 0x0106, InvocationTargetException -> 0x00fc }
            r9[r1] = r7     // Catch:{ ClassNotFoundException -> 0x0124, IllegalAccessException -> 0x011a, InstantiationException -> 0x0110, NoSuchMethodException -> 0x0106, InvocationTargetException -> 0x00fc }
            r9[r8] = r3     // Catch:{ ClassNotFoundException -> 0x0124, IllegalAccessException -> 0x011a, InstantiationException -> 0x0110, NoSuchMethodException -> 0x0106, InvocationTargetException -> 0x00fc }
            java.lang.String r9 = java.lang.String.format(r10, r9)     // Catch:{ ClassNotFoundException -> 0x0124, IllegalAccessException -> 0x011a, InstantiationException -> 0x0110, NoSuchMethodException -> 0x0106, InvocationTargetException -> 0x00fc }
            android.util.Log.w(r14, r9)     // Catch:{ ClassNotFoundException -> 0x0124, IllegalAccessException -> 0x011a, InstantiationException -> 0x0110, NoSuchMethodException -> 0x0106, InvocationTargetException -> 0x00fc }
            goto L_0x00c0
        L_0x00ea:
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0124, IllegalAccessException -> 0x011a, InstantiationException -> 0x0110, NoSuchMethodException -> 0x0106, InvocationTargetException -> 0x00fc }
            java.lang.reflect.Constructor r9 = r10.getDeclaredConstructor(r9)     // Catch:{ ClassNotFoundException -> 0x0124, IllegalAccessException -> 0x011a, InstantiationException -> 0x0110, NoSuchMethodException -> 0x0106, InvocationTargetException -> 0x00fc }
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0124, IllegalAccessException -> 0x011a, InstantiationException -> 0x0110, NoSuchMethodException -> 0x0106, InvocationTargetException -> 0x00fc }
            java.lang.Object r9 = r9.newInstance(r10)     // Catch:{ ClassNotFoundException -> 0x0124, IllegalAccessException -> 0x011a, InstantiationException -> 0x0110, NoSuchMethodException -> 0x0106, InvocationTargetException -> 0x00fc }
            q.b.d.g.i r9 = (p213q.p217b.p317d.p321g.C3891i) r9     // Catch:{ ClassNotFoundException -> 0x0124, IllegalAccessException -> 0x011a, InstantiationException -> 0x0110, NoSuchMethodException -> 0x0106, InvocationTargetException -> 0x00fc }
            r6.add(r9)     // Catch:{ ClassNotFoundException -> 0x0124, IllegalAccessException -> 0x011a, InstantiationException -> 0x0110, NoSuchMethodException -> 0x0106, InvocationTargetException -> 0x00fc }
            goto L_0x00c0
        L_0x00fc:
            r9 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            java.lang.String r7 = java.lang.String.format(r4, r8)
            goto L_0x012f
        L_0x0106:
            r9 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            java.lang.String r7 = java.lang.String.format(r4, r8)
            goto L_0x012f
        L_0x0110:
            r9 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            java.lang.String r7 = java.lang.String.format(r5, r8)
            goto L_0x012f
        L_0x011a:
            r9 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            java.lang.String r7 = java.lang.String.format(r5, r8)
            goto L_0x012f
        L_0x0124:
            r9 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            java.lang.String r7 = "Class %s is not an found."
            java.lang.String r7 = java.lang.String.format(r7, r8)
        L_0x012f:
            android.util.Log.w(r14, r7, r9)
            goto L_0x00c0
        L_0x0133:
            u.c r14 = p392u.C4550c.f10761i     // Catch:{ NoClassDefFoundError -> 0x013a }
            java.lang.String r14 = r14.toString()     // Catch:{ NoClassDefFoundError -> 0x013a }
            goto L_0x013b
        L_0x013a:
            r14 = r2
        L_0x013b:
            q.b.d.g.m r0 = new q.b.d.g.m
            java.util.concurrent.Executor r3 = f9457j
            r4 = 8
            q.b.d.g.d[] r4 = new p213q.p217b.p317d.p321g.C3884d[r4]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            java.lang.Class[] r7 = new java.lang.Class[r1]
            q.b.d.g.d r5 = p213q.p217b.p317d.p321g.C3884d.m9272a(r13, r5, r7)
            r4[r1] = r5
            java.lang.Class<q.b.d.c> r5 = p213q.p217b.p317d.C3859c.class
            java.lang.Class[] r7 = new java.lang.Class[r1]
            q.b.d.g.d r5 = p213q.p217b.p317d.p321g.C3884d.m9272a(r12, r5, r7)
            r4[r8] = r5
            java.lang.Class<q.b.d.e> r5 = p213q.p217b.p317d.C3866e.class
            java.lang.Class[] r7 = new java.lang.Class[r1]
            q.b.d.g.d r15 = p213q.p217b.p317d.p321g.C3884d.m9272a(r15, r5, r7)
            r4[r9] = r15
            r15 = 3
            java.lang.String r5 = "fire-android"
            java.lang.String r7 = ""
            q.b.d.g.d r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5216a(r5, r7)
            r4[r15] = r5
            r15 = 4
            java.lang.String r5 = "fire-core"
            java.lang.String r7 = "19.3.0"
            q.b.d.g.d r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5216a(r5, r7)
            r4[r15] = r5
            r15 = 5
            if (r14 == 0) goto L_0x0180
            java.lang.String r2 = "kotlin"
            q.b.d.g.d r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5216a(r2, r14)
        L_0x0180:
            r4[r15] = r2
            r14 = 6
            java.lang.Class<q.b.d.p.f> r15 = p213q.p217b.p317d.p354p.C4317f.class
            q.b.d.g.d$b r15 = p213q.p217b.p317d.p321g.C3884d.m9271a(r15)
            java.lang.Class<q.b.d.p.e> r2 = p213q.p217b.p317d.p354p.C4316e.class
            q.b.d.g.q r5 = new q.b.d.g.q
            r5.<init>(r2, r9, r1)
            r15.mo10081a(r5)
            q.b.d.p.b r1 = p213q.p217b.p317d.p354p.C4313b.f10369a
            r15.mo10080a(r1)
            q.b.d.g.d r15 = r15.mo10082a()
            r4[r14] = r15
            r14 = 7
            java.lang.Class<q.b.d.k.c> r15 = p213q.p217b.p317d.p346k.C4212c.class
            q.b.d.g.d$b r15 = p213q.p217b.p317d.p321g.C3884d.m9271a(r15)
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            q.b.d.g.q r1 = p213q.p217b.p317d.p321g.C3899q.m9288a(r1)
            r15.mo10081a(r1)
            q.b.d.k.a r1 = p213q.p217b.p317d.p346k.C4210a.f10150a
            r15.mo10080a(r1)
            q.b.d.g.d r15 = r15.mo10082a()
            r4[r14] = r15
            r0.<init>(r3, r6, r4)
            r12.f9462d = r0
            q.b.d.g.v r14 = new q.b.d.g.v
            q.b.d.b r15 = new q.b.d.b
            r15.<init>(r12, r13)
            r14.<init>(r15)
            r12.f9465g = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.C3859c.<init>(android.content.Context, java.lang.String, q.b.d.e):void");
    }

    /* renamed from: a */
    public static C3859c m9230a(Context context) {
        synchronized (f9456i) {
            if (f9458k.containsKey("[DEFAULT]")) {
                C3859c f = m9233f();
                return f;
            }
            C3866e a = C3866e.m9242a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            C3859c a2 = m9231a(context, a, "[DEFAULT]");
            return a2;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C4311a m9232a(C3859c cVar, Context context) {
        return new C4311a(context, cVar.mo10057b(), (C4208c) cVar.f9462d.mo10075a(C4208c.class));
    }

    /* renamed from: f */
    public static C3859c m9233f() {
        C3859c cVar;
        synchronized (f9456i) {
            cVar = (C3859c) f9458k.get("[DEFAULT]");
            if (cVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(C2287f.m5354a());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo10056a() {
        C1061o.m2534b(!this.f9464f.get(), (Object) "FirebaseApp was deleted");
    }

    /* renamed from: b */
    public String mo10057b() {
        String str;
        StringBuilder sb = new StringBuilder();
        mo10056a();
        byte[] bytes = this.f9460b.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bytes, 11);
        }
        sb.append(str);
        sb.append("+");
        mo10056a();
        byte[] bytes2 = this.f9461c.f9472b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo10058c() {
        if (!(VERSION.SDK_INT >= 24 ? ((UserManager) this.f9459a.getSystemService(UserManager.class)).isUserUnlocked() : true)) {
            Context context = this.f9459a;
            if (C3864e.f9469b.get() == null) {
                C3864e eVar = new C3864e(context);
                if (C3864e.f9469b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        C3895m mVar = this.f9462d;
        boolean e = mo10060e();
        for (Entry entry : mVar.f9518a.entrySet()) {
            C3884d dVar = (C3884d) entry.getKey();
            C3904v vVar = (C3904v) entry.getValue();
            boolean z = false;
            if (!(dVar.f9502c == 1)) {
                if (dVar.f9502c == 2) {
                    z = true;
                }
                if (z) {
                    if (!e) {
                    }
                }
            }
            vVar.get();
        }
        mVar.f9521d.mo10094a();
    }

    /* renamed from: d */
    public boolean mo10059d() {
        mo10056a();
        return ((C4311a) this.f9465g.get()).f10366c.get();
    }

    /* renamed from: e */
    public boolean mo10060e() {
        mo10056a();
        return "[DEFAULT]".equals(this.f9460b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3859c)) {
            return false;
        }
        String str = this.f9460b;
        C3859c cVar = (C3859c) obj;
        cVar.mo10056a();
        return str.equals(cVar.f9460b);
    }

    public int hashCode() {
        return this.f9460b.hashCode();
    }

    public String toString() {
        C2254m d = C1061o.m2550d((Object) this);
        d.mo7283a("name", this.f9460b);
        d.mo7283a("options", this.f9461c);
        return d.toString();
    }

    /* renamed from: a */
    public static C3859c m9231a(Context context, C3866e eVar, String str) {
        C3859c cVar;
        C3862c.m9240a(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f9456i) {
            boolean z = !f9458k.containsKey(trim);
            StringBuilder sb = new StringBuilder();
            sb.append("FirebaseApp name ");
            sb.append(trim);
            sb.append(" already exists!");
            C1061o.m2534b(z, (Object) sb.toString());
            C1061o.m2525b(context, (Object) "Application context cannot be null.");
            cVar = new C3859c(context, trim, eVar);
            f9458k.put(trim, cVar);
        }
        cVar.mo10058c();
        return cVar;
    }
}
