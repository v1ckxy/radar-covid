package p213q.p217b.p218a.p231b.p239d.p242n;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;
import p213q.p217b.p218a.p231b.p239d.p242n.C2236f.C2237a;

/* renamed from: q.b.a.b.d.n.g0 */
public final class C2240g0 implements ServiceConnection, C2247i0 {

    /* renamed from: a */
    public final Map<ServiceConnection, ServiceConnection> f6200a = new HashMap();

    /* renamed from: b */
    public int f6201b = 2;

    /* renamed from: c */
    public boolean f6202c;

    /* renamed from: d */
    public IBinder f6203d;

    /* renamed from: e */
    public final C2237a f6204e;

    /* renamed from: f */
    public ComponentName f6205f;

    /* renamed from: g */
    public final /* synthetic */ C2235e0 f6206g;

    public C2240g0(C2235e0 e0Var, C2237a aVar) {
        this.f6206g = e0Var;
        this.f6204e = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7274a(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 3
            r9.f6201b = r0
            q.b.a.b.d.n.e0 r0 = r9.f6206g
            q.b.a.b.d.p.a r1 = r0.f6186f
            android.content.Context r2 = r0.f6184d
            q.b.a.b.d.n.f$a r0 = r9.f6204e
            java.lang.String r3 = r0.f6192a
            if (r3 == 0) goto L_0x0088
            boolean r3 = r0.f6196e
            r4 = 0
            if (r3 == 0) goto L_0x0078
            java.lang.String r3 = "ConnectionStatusConfig"
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = r0.f6192a
            java.lang.String r7 = "serviceActionBundleKey"
            r5.putString(r7, r6)
            android.content.ContentResolver r6 = r2.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x002f }
            android.net.Uri r7 = p213q.p217b.p218a.p231b.p239d.p242n.C2236f.C2237a.f6191f     // Catch:{ IllegalArgumentException -> 0x002f }
            java.lang.String r8 = "serviceIntentCall"
            android.os.Bundle r5 = r6.call(r7, r8, r4, r5)     // Catch:{ IllegalArgumentException -> 0x002f }
            goto L_0x004f
        L_0x002f:
            r5 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            int r6 = r6 + 34
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Dynamic intent resolution failed: "
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.util.Log.w(r3, r5)
            r5 = r4
        L_0x004f:
            if (r5 != 0) goto L_0x0052
            goto L_0x005a
        L_0x0052:
            java.lang.String r4 = "serviceResponseIntentKey"
            android.os.Parcelable r4 = r5.getParcelable(r4)
            android.content.Intent r4 = (android.content.Intent) r4
        L_0x005a:
            if (r4 != 0) goto L_0x0078
            java.lang.String r5 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = r0.f6192a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r7 = r6.length()
            if (r7 == 0) goto L_0x006f
            java.lang.String r5 = r5.concat(r6)
            goto L_0x0075
        L_0x006f:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            r5 = r6
        L_0x0075:
            android.util.Log.w(r3, r5)
        L_0x0078:
            if (r4 != 0) goto L_0x0094
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = r0.f6192a
            r3.<init>(r4)
            java.lang.String r0 = r0.f6193b
            android.content.Intent r0 = r3.setPackage(r0)
            goto L_0x0093
        L_0x0088:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.ComponentName r0 = r0.f6194c
            android.content.Intent r0 = r3.setComponent(r0)
        L_0x0093:
            r4 = r0
        L_0x0094:
            q.b.a.b.d.n.f$a r0 = r9.f6204e
            int r6 = r0.f6195d
            r3 = r10
            r5 = r9
            boolean r10 = r1.mo7300a(r2, r3, r4, r5, r6)
            r9.f6202c = r10
            if (r10 == 0) goto L_0x00b7
            q.b.a.b.d.n.e0 r10 = r9.f6206g
            android.os.Handler r10 = r10.f6185e
            r0 = 1
            q.b.a.b.d.n.f$a r1 = r9.f6204e
            android.os.Message r10 = r10.obtainMessage(r0, r1)
            q.b.a.b.d.n.e0 r0 = r9.f6206g
            android.os.Handler r1 = r0.f6185e
            long r2 = r0.f6188h
            r1.sendMessageDelayed(r10, r2)
            return
        L_0x00b7:
            r10 = 2
            r9.f6201b = r10
            q.b.a.b.d.n.e0 r10 = r9.f6206g     // Catch:{ IllegalArgumentException -> 0x00c5 }
            q.b.a.b.d.p.a r10 = r10.f6186f     // Catch:{ IllegalArgumentException -> 0x00c5 }
            q.b.a.b.d.n.e0 r0 = r9.f6206g     // Catch:{ IllegalArgumentException -> 0x00c5 }
            android.content.Context r0 = r0.f6184d     // Catch:{ IllegalArgumentException -> 0x00c5 }
            r10.mo7298a(r0, r9)     // Catch:{ IllegalArgumentException -> 0x00c5 }
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.p242n.C2240g0.mo7274a(java.lang.String):void");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f6206g.f6183c) {
            this.f6206g.f6185e.removeMessages(1, this.f6204e);
            this.f6203d = iBinder;
            this.f6205f = componentName;
            for (ServiceConnection onServiceConnected : this.f6200a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f6201b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6206g.f6183c) {
            this.f6206g.f6185e.removeMessages(1, this.f6204e);
            this.f6203d = null;
            this.f6205f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f6200a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f6201b = 2;
        }
    }
}
