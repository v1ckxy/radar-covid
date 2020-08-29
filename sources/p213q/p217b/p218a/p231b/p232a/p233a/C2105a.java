package p213q.p217b.p218a.p231b.p232a.p233a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.C2113a;
import p213q.p217b.p218a.p231b.p239d.C2124f;
import p213q.p217b.p218a.p231b.p239d.C2126g;
import p213q.p217b.p218a.p231b.p239d.C2129i;
import p213q.p217b.p218a.p231b.p239d.p245p.C2277a;
import p213q.p217b.p218a.p231b.p251g.p252a.C2317b;
import p213q.p217b.p218a.p231b.p251g.p252a.C2318c;

@ParametersAreNonnullByDefault
/* renamed from: q.b.a.b.a.a.a */
public class C2105a {
    @GuardedBy("this")

    /* renamed from: a */
    public C2113a f5952a;
    @GuardedBy("this")

    /* renamed from: b */
    public C2317b f5953b;
    @GuardedBy("this")

    /* renamed from: c */
    public boolean f5954c;

    /* renamed from: d */
    public final Object f5955d = new Object();
    @GuardedBy("mAutoDisconnectTaskLock")

    /* renamed from: e */
    public C2107b f5956e;
    @GuardedBy("this")

    /* renamed from: f */
    public final Context f5957f;

    /* renamed from: g */
    public final boolean f5958g;

    /* renamed from: h */
    public final long f5959h;

    /* renamed from: q.b.a.b.a.a.a$a */
    public static final class C2106a {

        /* renamed from: a */
        public final String f5960a;

        /* renamed from: b */
        public final boolean f5961b;

        public C2106a(String str, boolean z) {
            this.f5960a = str;
            this.f5961b = z;
        }

        public final String toString() {
            String str = this.f5960a;
            boolean z = this.f5961b;
            StringBuilder sb = new StringBuilder(C1965a.m4743a(str, 7));
            sb.append(Objects.ARRAY_START);
            sb.append(str);
            sb.append(Objects.ARRAY_END);
            sb.append(z);
            return sb.toString();
        }
    }

    /* renamed from: q.b.a.b.a.a.a$b */
    public static class C2107b extends Thread {

        /* renamed from: e */
        public WeakReference<C2105a> f5962e;

        /* renamed from: f */
        public long f5963f;

        /* renamed from: g */
        public CountDownLatch f5964g = new CountDownLatch(1);

        /* renamed from: h */
        public boolean f5965h = false;

        public C2107b(C2105a aVar, long j) {
            this.f5962e = new WeakReference<>(aVar);
            this.f5963f = j;
            start();
        }

        public final void run() {
            try {
                if (!this.f5964g.await(this.f5963f, TimeUnit.MILLISECONDS)) {
                    C2105a aVar = (C2105a) this.f5962e.get();
                    if (aVar != null) {
                        aVar.mo7077a();
                        this.f5965h = true;
                    }
                }
            } catch (InterruptedException unused) {
                C2105a aVar2 = (C2105a) this.f5962e.get();
                if (aVar2 != null) {
                    aVar2.mo7077a();
                    this.f5965h = true;
                }
            }
        }
    }

    public C2105a(Context context, long j, boolean z, boolean z2) {
        C1061o.m2524b(context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
        }
        this.f5957f = context;
        this.f5954c = false;
        this.f5959h = j;
        this.f5958g = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f A[SYNTHETIC, Splitter:B:17:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041 A[SYNTHETIC, Splitter:B:25:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0051 A[SYNTHETIC, Splitter:B:33:0x0051] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p213q.p217b.p218a.p231b.p232a.p233a.C2105a.C2106a m4893a(android.content.Context r15) {
        /*
            java.lang.String r0 = "Error while reading from SharedPreferences "
            java.lang.String r1 = "GmscoreFlag"
            r2 = 0
            r3 = 0
            android.content.Context r4 = p213q.p217b.p218a.p231b.p239d.C2129i.m4926b(r15)     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            java.lang.String r5 = "google_ads_flags"
            android.content.SharedPreferences r2 = r4.getSharedPreferences(r5, r3)     // Catch:{ all -> 0x0014 }
            goto L_0x001a
        L_0x0014:
            r4 = move-exception
            java.lang.String r5 = "Error while getting SharedPreferences "
            android.util.Log.w(r1, r5, r4)
        L_0x001a:
            java.lang.String r4 = "gads:ad_id_app_context:enabled"
            if (r2 != 0) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            boolean r4 = r2.getBoolean(r4, r3)     // Catch:{ all -> 0x0024 }
            goto L_0x0029
        L_0x0024:
            r4 = move-exception
            android.util.Log.w(r1, r0, r4)
        L_0x0028:
            r4 = r3
        L_0x0029:
            java.lang.String r5 = "gads:ad_id_app_context:ping_ratio"
            r6 = 0
            if (r2 != 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            float r5 = r2.getFloat(r5, r6)     // Catch:{ all -> 0x0035 }
            r13 = r5
            goto L_0x003a
        L_0x0035:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L_0x0039:
            r13 = r6
        L_0x003a:
            java.lang.String r5 = "gads:ad_id_use_shared_preference:experiment_id"
            java.lang.String r6 = ""
            if (r2 != 0) goto L_0x0041
            goto L_0x004b
        L_0x0041:
            java.lang.String r5 = r2.getString(r5, r6)     // Catch:{ all -> 0x0047 }
            r14 = r5
            goto L_0x004c
        L_0x0047:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L_0x004b:
            r14 = r6
        L_0x004c:
            java.lang.String r5 = "gads:ad_id_use_persistent_service:enabled"
            if (r2 != 0) goto L_0x0051
            goto L_0x005b
        L_0x0051:
            boolean r0 = r2.getBoolean(r5, r3)     // Catch:{ all -> 0x0057 }
            r10 = r0
            goto L_0x005c
        L_0x0057:
            r2 = move-exception
            android.util.Log.w(r1, r0, r2)
        L_0x005b:
            r10 = r3
        L_0x005c:
            q.b.a.b.a.a.a r0 = new q.b.a.b.a.a.a
            r7 = -1
            r5 = r0
            r6 = r15
            r9 = r4
            r5.<init>(r6, r7, r9, r10)
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0084 }
            r0.mo7078a(r3)     // Catch:{ all -> 0x0084 }
            q.b.a.b.a.a.a$a r15 = r0.mo7080b()     // Catch:{ all -> 0x0084 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0084 }
            long r9 = r5 - r1
            r12 = 0
            r5 = r0
            r6 = r15
            r7 = r4
            r8 = r13
            r11 = r14
            r5.mo7079a(r6, r7, r8, r9, r11, r12)     // Catch:{ all -> 0x0084 }
            r0.mo7077a()
            return r15
        L_0x0084:
            r15 = move-exception
            r6 = 0
            r9 = -1
            r5 = r0
            r7 = r4
            r8 = r13
            r11 = r14
            r12 = r15
            r5.mo7079a(r6, r7, r8, r9, r11, r12)     // Catch:{ all -> 0x0091 }
            throw r15     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r15 = move-exception
            r0.mo7077a()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p232a.p233a.C2105a.m4893a(android.content.Context):q.b.a.b.a.a.a$a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7077a() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            p124p.p126b.p127k.C1061o.m2544c(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f5957f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            q.b.a.b.d.a r0 = r3.f5952a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f5954c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            q.b.a.b.d.p.a r0 = p213q.p217b.p218a.p231b.p239d.p245p.C2277a.m5128a()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f5957f     // Catch:{ all -> 0x001f }
            q.b.a.b.d.a r2 = r3.f5952a     // Catch:{ all -> 0x001f }
            r0.mo7298a(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f5954c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f5953b = r0     // Catch:{ all -> 0x0033 }
            r3.f5952a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p232a.p233a.C2105a.mo7077a():void");
    }

    /* renamed from: b */
    public C2106a mo7080b() {
        C2106a aVar;
        C1061o.m2544c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f5954c) {
                synchronized (this.f5955d) {
                    if (this.f5956e == null || !this.f5956e.f5965h) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    mo7078a(false);
                    if (!this.f5954c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C1061o.m2524b(this.f5952a);
            C1061o.m2524b(this.f5953b);
            aVar = new C2106a(this.f5953b.getId(), this.f5953b.mo7328a(true));
        }
        mo7081c();
        return aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7081c() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f5955d
            monitor-enter(r0)
            q.b.a.b.a.a.a$b r1 = r5.f5956e     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            q.b.a.b.a.a.a$b r1 = r5.f5956e     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.f5964g     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            q.b.a.b.a.a.a$b r1 = r5.f5956e     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r5.f5959h     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0024
            q.b.a.b.a.a.a$b r1 = new q.b.a.b.a.a.a$b     // Catch:{ all -> 0x0026 }
            long r2 = r5.f5959h     // Catch:{ all -> 0x0026 }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0026 }
            r5.f5956e = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p232a.p233a.C2105a.mo7081c():void");
    }

    public void finalize() {
        mo7077a();
        super.finalize();
    }

    /* renamed from: a */
    public static C2113a m4894a(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int a = C2124f.f5997b.mo7110a(context, C2129i.f5999a);
            if (a == 0 || a == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                C2113a aVar = new C2113a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (C2277a.m5128a().mo7299a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (NameNotFoundException unused) {
            throw new C2126g(9);
        }
    }

    /* renamed from: a */
    public final void mo7078a(boolean z) {
        C1061o.m2544c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f5954c) {
                mo7077a();
            }
            C2113a a = m4894a(this.f5957f, this.f5958g);
            this.f5952a = a;
            try {
                this.f5953b = C2318c.m5401a(a.mo7090a(10000, TimeUnit.MILLISECONDS));
                this.f5954c = true;
                if (z) {
                    mo7081c();
                }
            } catch (InterruptedException unused) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo7079a(C2106a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        String str3 = "0";
        hashMap.put("app_context", z ? str2 : str3);
        if (aVar != null) {
            if (!aVar.f5961b) {
                str2 = str3;
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (aVar != null) {
            String str4 = aVar.f5960a;
            if (str4 != null) {
                hashMap.put("ad_id_size", Integer.toString(str4.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C2108b(hashMap).start();
        return true;
    }
}
