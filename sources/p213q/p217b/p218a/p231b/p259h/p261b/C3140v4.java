package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.ServiceConnection;
import p213q.p217b.p218a.p231b.p251g.p256e.C2380c2;

/* renamed from: q.b.a.b.h.b.v4 */
public final class C3140v4 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C2380c2 f7916e;

    /* renamed from: f */
    public final /* synthetic */ ServiceConnection f7917f;

    /* renamed from: g */
    public final /* synthetic */ C3151w4 f7918g;

    public C3140v4(C3151w4 w4Var, C2380c2 c2Var, ServiceConnection serviceConnection) {
        this.f7918g = w4Var;
        this.f7916e = c2Var;
        this.f7917f = serviceConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            q.b.a.b.h.b.w4 r0 = r13.f7918g
            q.b.a.b.h.b.t4 r1 = r0.f7935b
            java.lang.String r0 = r0.f7934a
            q.b.a.b.g.e.c2 r2 = r13.f7916e
            android.content.ServiceConnection r3 = r13.f7917f
            q.b.a.b.h.b.g5 r4 = r1.f7861a
            q.b.a.b.h.b.z4 r4 = r4.mo8283g()
            r4.mo8279c()
            if (r2 != 0) goto L_0x0023
            q.b.a.b.h.b.g5 r0 = r1.f7861a
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7156i
            java.lang.String r2 = "Attempting to use Install Referrer Service while it is not initialized"
            r0.mo8432a(r2)
            goto L_0x0053
        L_0x0023:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "package_name"
            r4.putString(r5, r0)
            android.os.Bundle r0 = r2.mo7484a(r4)     // Catch:{ Exception -> 0x0041 }
            if (r0 != 0) goto L_0x0054
            q.b.a.b.h.b.g5 r0 = r1.f7861a     // Catch:{ Exception -> 0x0041 }
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()     // Catch:{ Exception -> 0x0041 }
            q.b.a.b.h.b.e4 r0 = r0.f7153f     // Catch:{ Exception -> 0x0041 }
            java.lang.String r2 = "Install Referrer Service returned a null response"
            r0.mo8432a(r2)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0053
        L_0x0041:
            r0 = move-exception
            q.b.a.b.h.b.g5 r2 = r1.f7861a
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7153f
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "Exception occurred while retrieving the Install Referrer"
            r2.mo8433a(r4, r0)
        L_0x0053:
            r0 = 0
        L_0x0054:
            q.b.a.b.h.b.g5 r2 = r1.f7861a
            q.b.a.b.h.b.z4 r2 = r2.mo8283g()
            r2.mo8279c()
            if (r0 == 0) goto L_0x0179
            r4 = 0
            java.lang.String r2 = "install_begin_timestamp_seconds"
            long r6 = r0.getLong(r2, r4)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x007a
            q.b.a.b.h.b.g5 r0 = r1.f7861a
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7156i
            java.lang.String r2 = "Service response is missing Install Referrer install timestamp"
            goto L_0x0176
        L_0x007a:
            java.lang.String r2 = "install_referrer"
            java.lang.String r2 = r0.getString(r2)
            if (r2 == 0) goto L_0x016c
            boolean r10 = r2.isEmpty()
            if (r10 == 0) goto L_0x008a
            goto L_0x016c
        L_0x008a:
            q.b.a.b.h.b.g5 r10 = r1.f7861a
            q.b.a.b.h.b.b4 r10 = r10.mo8285i()
            q.b.a.b.h.b.e4 r10 = r10.f7161n
            java.lang.String r11 = "InstallReferrer API result"
            r10.mo8433a(r11, r2)
            q.b.a.b.h.b.g5 r10 = r1.f7861a
            q.b.a.b.h.b.w9 r10 = r10.mo8473p()
            java.lang.String r11 = "?"
            int r12 = r2.length()
            if (r12 == 0) goto L_0x00aa
            java.lang.String r2 = r11.concat(r2)
            goto L_0x00af
        L_0x00aa:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r11)
        L_0x00af:
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.os.Bundle r2 = r10.mo8777a(r2)
            if (r2 != 0) goto L_0x00c5
            q.b.a.b.h.b.g5 r0 = r1.f7861a
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7153f
            java.lang.String r2 = "No campaign params defined in Install Referrer result"
            goto L_0x0176
        L_0x00c5:
            java.lang.String r10 = "medium"
            java.lang.String r10 = r2.getString(r10)
            if (r10 == 0) goto L_0x00df
            java.lang.String r11 = "(not set)"
            boolean r11 = r11.equalsIgnoreCase(r10)
            if (r11 != 0) goto L_0x00df
            java.lang.String r11 = "organic"
            boolean r10 = r11.equalsIgnoreCase(r10)
            if (r10 != 0) goto L_0x00df
            r10 = 1
            goto L_0x00e0
        L_0x00df:
            r10 = 0
        L_0x00e0:
            if (r10 == 0) goto L_0x00fe
            java.lang.String r10 = "referrer_click_timestamp_seconds"
            long r10 = r0.getLong(r10, r4)
            long r10 = r10 * r8
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00f9
            q.b.a.b.h.b.g5 r0 = r1.f7861a
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7153f
            java.lang.String r2 = "Install Referrer is missing click timestamp for ad campaign"
            goto L_0x0176
        L_0x00f9:
            java.lang.String r0 = "click_timestamp"
            r2.putLong(r0, r10)
        L_0x00fe:
            q.b.a.b.h.b.g5 r0 = r1.f7861a
            q.b.a.b.h.b.o4 r0 = r0.mo8470m()
            q.b.a.b.h.b.s4 r0 = r0.f7628k
            long r4 = r0.mo8708a()
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x011b
            q.b.a.b.h.b.g5 r0 = r1.f7861a
            q.b.a.b.h.b.ja r2 = r0.f7337f
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7161n
            java.lang.String r2 = "Install Referrer campaign has already been logged"
            goto L_0x0176
        L_0x011b:
            q.b.a.b.g.e.gb r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2458gb.f6550f
            java.lang.Object r0 = r0.mo7405a()
            q.b.a.b.g.e.fb r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2441fb) r0
            boolean r0 = r0.mo7653a()
            if (r0 == 0) goto L_0x013d
            q.b.a.b.h.b.g5 r0 = r1.f7861a
            q.b.a.b.h.b.ka r0 = r0.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7669B0
            boolean r0 = r0.mo8574a(r4)
            if (r0 == 0) goto L_0x013d
            q.b.a.b.h.b.g5 r0 = r1.f7861a
            boolean r0 = r0.mo8464b()
            if (r0 == 0) goto L_0x0179
        L_0x013d:
            q.b.a.b.h.b.g5 r0 = r1.f7861a
            q.b.a.b.h.b.o4 r0 = r0.mo8470m()
            q.b.a.b.h.b.s4 r0 = r0.f7628k
            r0.mo8709a(r6)
            q.b.a.b.h.b.g5 r0 = r1.f7861a
            q.b.a.b.h.b.ja r4 = r0.f7337f
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7161n
            java.lang.String r4 = "referrer API"
            java.lang.String r5 = "Logging Install Referrer campaign from sdk with "
            r0.mo8433a(r5, r4)
            java.lang.String r0 = "_cis"
            r2.putString(r0, r4)
            q.b.a.b.h.b.g5 r0 = r1.f7861a
            q.b.a.b.h.b.k6 r0 = r0.mo8472o()
            java.lang.String r4 = "auto"
            java.lang.String r5 = "_cmp"
            r0.mo8561a(r4, r5, r2)
            goto L_0x0179
        L_0x016c:
            q.b.a.b.h.b.g5 r0 = r1.f7861a
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7153f
            java.lang.String r2 = "No referrer defined in Install Referrer response"
        L_0x0176:
            r0.mo8432a(r2)
        L_0x0179:
            if (r3 == 0) goto L_0x0186
            q.b.a.b.d.p.a r0 = p213q.p217b.p218a.p231b.p239d.p245p.C2277a.m5128a()
            q.b.a.b.h.b.g5 r1 = r1.f7861a
            android.content.Context r1 = r1.f7332a
            r0.mo7298a(r1, r3)
        L_0x0186:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3140v4.run():void");
    }
}
