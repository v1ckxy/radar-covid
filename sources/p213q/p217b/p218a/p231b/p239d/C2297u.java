package p213q.p217b.p218a.p231b.p239d;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.C0194a;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.C2255m0;
import p213q.p217b.p218a.p231b.p239d.p242n.C2257n0;
import p213q.p217b.p218a.p231b.p249e.C2306b;

@CheckReturnValue
/* renamed from: q.b.a.b.d.u */
public final class C2297u {

    /* renamed from: a */
    public static volatile C2257n0 f6273a;

    /* renamed from: b */
    public static final Object f6274b = new Object();

    /* renamed from: c */
    public static Context f6275c;

    /* renamed from: a */
    public static C2120d0 m5365a(String str, C2298v vVar, boolean z, boolean z2) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m5367b(str, vVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m5366a(android.content.Context r2) {
        /*
            java.lang.Class<q.b.a.b.d.u> r0 = p213q.p217b.p218a.p231b.p239d.C2297u.class
            monitor-enter(r0)
            android.content.Context r1 = f6275c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            f6275c = r2     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.C2297u.m5366a(android.content.Context):void");
    }

    /* renamed from: b */
    public static C2120d0 m5367b(String str, C2298v vVar, boolean z, boolean z2) {
        try {
            if (f6273a == null) {
                C1061o.m2524b(f6275c);
                synchronized (f6274b) {
                    if (f6273a == null) {
                        f6273a = C2255m0.m5108a(DynamiteModule.m892a(f6275c, DynamiteModule.f1100j, "com.google.android.gms.googlecertificates").mo1539a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            C1061o.m2524b(f6275c);
            try {
                if (f6273a.mo7286a(new C2116b0(str, vVar, z, z2), new C2306b(f6275c.getPackageManager()))) {
                    return C2120d0.f5988d;
                }
                return C2120d0.m4910a((Callable<String>) new C2299w<String>(z, str, vVar));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return new C2120d0(false, "module call", e);
            }
        } catch (C0194a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String str2 = "module init: ";
            String valueOf = String.valueOf(e2.getMessage());
            return new C2120d0(false, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e2);
        }
    }
}
