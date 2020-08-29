package p213q.p217b.p218a.p231b.p239d.p245p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import p213q.p217b.p218a.p231b.p239d.p242n.C2247i0;
import p213q.p217b.p218a.p231b.p251g.p254c.C2331h;
import p213q.p217b.p218a.p231b.p251g.p254c.C2332i;
import p213q.p217b.p218a.p231b.p251g.p254c.C2333j;

/* renamed from: q.b.a.b.d.p.a */
public class C2277a {

    /* renamed from: b */
    public static final Object f6241b = new Object();

    /* renamed from: c */
    public static volatile C2277a f6242c;

    /* renamed from: d */
    public static C2331h<Boolean> f6243d;

    /* renamed from: a */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f6244a = new ConcurrentHashMap<>();

    static {
        C2331h<Boolean> hVar = C2280d.f6248e;
        if (!(hVar instanceof C2332i) && !(hVar instanceof C2333j)) {
            hVar = hVar instanceof Serializable ? new C2333j<>(hVar) : new C2332i<>(hVar);
        }
        f6243d = hVar;
    }

    /* renamed from: a */
    public static C2277a m5128a() {
        if (f6242c == null) {
            synchronized (f6241b) {
                if (f6242c == null) {
                    f6242c = new C2277a();
                }
            }
        }
        return f6242c;
    }

    /* renamed from: a */
    public static boolean m5129a(ServiceConnection serviceConnection) {
        return ((Boolean) f6243d.mo7302a()).booleanValue() && !(serviceConnection instanceof C2247i0);
    }

    /* renamed from: b */
    public static final /* synthetic */ boolean m5130b() {
        return false;
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public void mo7298a(Context context, ServiceConnection serviceConnection) {
        String str = "Exception thrown while unbinding";
        String str2 = "ConnectionTracker";
        if (!m5129a(serviceConnection) || !this.f6244a.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException e) {
                Log.w(str2, str, e);
            }
            return;
        }
        try {
            context.unbindService((ServiceConnection) this.f6244a.get(serviceConnection));
        } catch (IllegalArgumentException | IllegalStateException e2) {
            Log.w(str2, str, e2);
        } catch (Throwable th) {
            this.f6244a.remove(serviceConnection);
            throw th;
        }
        this.f6244a.remove(serviceConnection);
    }

    /* renamed from: a */
    public boolean mo7299a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo7300a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7300a(android.content.Context r5, java.lang.String r6, android.content.Intent r7, android.content.ServiceConnection r8, int r9) {
        /*
            r4 = this;
            android.content.ComponentName r0 = r7.getComponent()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0009
            goto L_0x0029
        L_0x0009:
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r3 = "com.google.android.gms"
            r3.equals(r0)
            q.b.a.b.d.r.a r3 = p213q.p217b.p218a.p231b.p239d.p248r.C2294b.m5363b(r5)     // Catch:{ NameNotFoundException -> 0x0029 }
            android.content.Context r3 = r3.f6270a     // Catch:{ NameNotFoundException -> 0x0029 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0029 }
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0029 }
            int r0 = r0.flags     // Catch:{ NameNotFoundException -> 0x0029 }
            r3 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0029
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            java.lang.String r3 = "ConnectionTracker"
            if (r0 == 0) goto L_0x0034
            java.lang.String r5 = "Attempted to bind to a service in a STOPPED package."
            android.util.Log.w(r3, r5)
            goto L_0x0075
        L_0x0034:
            boolean r0 = m5129a(r8)
            if (r0 == 0) goto L_0x0070
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r0 = r4.f6244a
            java.lang.Object r0 = r0.putIfAbsent(r8, r8)
            android.content.ServiceConnection r0 = (android.content.ServiceConnection) r0
            if (r0 == 0) goto L_0x005d
            if (r8 == r0) goto L_0x005d
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r8
            r0[r1] = r6
            r6 = 2
            java.lang.String r1 = r7.getAction()
            r0[r6] = r1
            java.lang.String r6 = "Duplicate binding with the same ServiceConnection: %s, %s, %s."
            java.lang.String r6 = java.lang.String.format(r6, r0)
            android.util.Log.w(r3, r6)
        L_0x005d:
            boolean r5 = r5.bindService(r7, r8, r9)     // Catch:{ all -> 0x0069 }
            if (r5 != 0) goto L_0x0074
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r6 = r4.f6244a
            r6.remove(r8, r8)
            goto L_0x0074
        L_0x0069:
            r5 = move-exception
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r6 = r4.f6244a
            r6.remove(r8, r8)
            throw r5
        L_0x0070:
            boolean r5 = r5.bindService(r7, r8, r9)
        L_0x0074:
            r2 = r5
        L_0x0075:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.p245p.C2277a.mo7300a(android.content.Context, java.lang.String, android.content.Intent, android.content.ServiceConnection, int):boolean");
    }
}
