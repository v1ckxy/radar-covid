package p213q.p217b.p317d.p322h.p323e.p326k;

import android.content.SharedPreferences;
import p213q.p217b.p218a.p231b.p270l.C3250f0;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p218a.p231b.p270l.C3257j;
import p213q.p217b.p317d.C3859c;

/* renamed from: q.b.d.h.e.k.l0 */
public class C3959l0 {

    /* renamed from: a */
    public Object f9660a = new Object();

    /* renamed from: b */
    public C3257j<Void> f9661b = new C3257j<>();

    /* renamed from: c */
    public final SharedPreferences f9662c;

    /* renamed from: d */
    public volatile boolean f9663d;

    /* renamed from: e */
    public volatile boolean f9664e;

    /* renamed from: f */
    public final C3859c f9665f;

    /* renamed from: g */
    public C3257j<Void> f9666g = new C3257j<>();

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3959l0(p213q.p217b.p317d.C3859c r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.f9660a = r0
            q.b.a.b.l.j r0 = new q.b.a.b.l.j
            r0.<init>()
            r4.f9661b = r0
            q.b.a.b.l.j r0 = new q.b.a.b.l.j
            r0.<init>()
            r4.f9666g = r0
            r4.f9665f = r5
            r5.mo10056a()
            android.content.Context r5 = r5.f9459a
            if (r5 == 0) goto L_0x008e
            android.content.SharedPreferences r0 = p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9370e(r5)
            r4.f9662c = r0
            r1 = 0
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r0 = r0.contains(r2)
            r2 = 1
            if (r0 == 0) goto L_0x003c
            android.content.SharedPreferences r5 = r4.f9662c
            java.lang.String r0 = "firebase_crashlytics_collection_enabled"
            boolean r5 = r5.getBoolean(r0, r2)
        L_0x0039:
            r1 = r2
            r2 = r5
            goto L_0x0076
        L_0x003c:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0065 }
            if (r0 == 0) goto L_0x0076
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0065 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r0.getApplicationInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x0065 }
            if (r5 == 0) goto L_0x0076
            android.os.Bundle r0 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0065 }
            if (r0 == 0) goto L_0x0076
            android.os.Bundle r0 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0065 }
            java.lang.String r3 = "firebase_crashlytics_collection_enabled"
            boolean r0 = r0.containsKey(r3)     // Catch:{ NameNotFoundException -> 0x0065 }
            if (r0 == 0) goto L_0x0076
            android.os.Bundle r5 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0065 }
            java.lang.String r0 = "firebase_crashlytics_collection_enabled"
            boolean r5 = r5.getBoolean(r0)     // Catch:{ NameNotFoundException -> 0x0065 }
            goto L_0x0039
        L_0x0065:
            r5 = move-exception
            q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            r3 = 3
            boolean r3 = r0.mo10110a(r3)
            if (r3 == 0) goto L_0x0076
            java.lang.String r0 = r0.f9553a
            java.lang.String r3 = "Unable to get PackageManager. Falling through"
            android.util.Log.d(r0, r3, r5)
        L_0x0076:
            r4.f9664e = r2
            r4.f9663d = r1
            java.lang.Object r5 = r4.f9660a
            monitor-enter(r5)
            boolean r0 = r4.mo10149a()     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0089
            q.b.a.b.l.j<java.lang.Void> r0 = r4.f9661b     // Catch:{ all -> 0x008b }
            r1 = 0
            r0.mo8941a(r1)     // Catch:{ all -> 0x008b }
        L_0x0089:
            monitor-exit(r5)     // Catch:{ all -> 0x008b }
            return
        L_0x008b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x008b }
            throw r0
        L_0x008e:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "null context"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p326k.C3959l0.<init>(q.b.d.c):void");
    }

    /* renamed from: a */
    public boolean mo10149a() {
        return this.f9663d ? this.f9664e : this.f9665f.mo10059d();
    }

    /* renamed from: b */
    public C3255i<Void> mo10150b() {
        C3250f0<TResult> f0Var;
        synchronized (this.f9660a) {
            f0Var = this.f9661b.f8128a;
        }
        return f0Var;
    }
}
