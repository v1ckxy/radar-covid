package p213q.p217b.p218a.p231b.p259h.p261b;

import java.util.Map;

/* renamed from: q.b.a.b.h.b.l7 */
public final /* synthetic */ class C3031l7 implements Runnable {

    /* renamed from: e */
    public final C3007j7 f7517e;

    /* renamed from: f */
    public final int f7518f;

    /* renamed from: g */
    public final Exception f7519g;

    /* renamed from: h */
    public final byte[] f7520h;

    /* renamed from: i */
    public final Map f7521i;

    public C3031l7(C3007j7 j7Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f7517e = j7Var;
        this.f7518f = i;
        this.f7519g = exc;
        this.f7520h = bArr;
        this.f7521i = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae A[Catch:{ JSONException -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ba A[Catch:{ JSONException -> 0x00f1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            q.b.a.b.h.b.j7 r0 = r12.f7517e
            int r1 = r12.f7518f
            java.lang.Exception r2 = r12.f7519g
            byte[] r3 = r12.f7520h
            q.b.a.b.h.b.f5 r0 = r0.f7455f
            q.b.a.b.h.b.g5 r0 = r0.f7300a
            java.lang.String r4 = "gclid"
            java.lang.String r5 = ""
            r6 = 1
            r7 = 0
            r8 = 200(0xc8, float:2.8E-43)
            if (r1 == r8) goto L_0x001e
            r8 = 204(0xcc, float:2.86E-43)
            if (r1 == r8) goto L_0x001e
            r8 = 304(0x130, float:4.26E-43)
            if (r1 != r8) goto L_0x0022
        L_0x001e:
            if (r2 != 0) goto L_0x0022
            r8 = r6
            goto L_0x0023
        L_0x0022:
            r8 = r7
        L_0x0023:
            if (r8 != 0) goto L_0x0036
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7156i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Network Request for Deferred Deep Link failed. response, exception"
            r0.mo8434a(r3, r1, r2)
            goto L_0x00fd
        L_0x0036:
            q.b.a.b.h.b.o4 r1 = r0.mo8470m()
            q.b.a.b.h.b.q4 r1 = r1.f7641x
            r1.mo8696a(r6)
            int r1 = r3.length
            if (r1 != 0) goto L_0x004f
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7160m
            java.lang.String r1 = "Deferred Deep Link response empty."
            r0.mo8432a(r1)
            goto L_0x00fd
        L_0x004f:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00f1 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x00f1 }
            java.lang.String r1 = "deeplink"
            java.lang.String r1 = r2.optString(r1, r5)     // Catch:{ JSONException -> 0x00f1 }
            java.lang.String r3 = r2.optString(r4, r5)     // Catch:{ JSONException -> 0x00f1 }
            java.lang.String r5 = "timestamp"
            r8 = 0
            double r8 = r2.optDouble(r5, r8)     // Catch:{ JSONException -> 0x00f1 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00f1 }
            if (r2 == 0) goto L_0x007e
            q.b.a.b.h.b.b4 r1 = r0.mo8285i()     // Catch:{ JSONException -> 0x00f1 }
            q.b.a.b.h.b.e4 r1 = r1.f7160m     // Catch:{ JSONException -> 0x00f1 }
            java.lang.String r2 = "Deferred Deep Link is empty."
            r1.mo8432a(r2)     // Catch:{ JSONException -> 0x00f1 }
            goto L_0x00fd
        L_0x007e:
            q.b.a.b.h.b.w9 r2 = r0.mo8473p()     // Catch:{ JSONException -> 0x00f1 }
            r2.mo8277a()     // Catch:{ JSONException -> 0x00f1 }
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00f1 }
            if (r5 != 0) goto L_0x00ab
            q.b.a.b.h.b.g5 r2 = r2.f7133a     // Catch:{ JSONException -> 0x00f1 }
            android.content.Context r2 = r2.f7332a     // Catch:{ JSONException -> 0x00f1 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ JSONException -> 0x00f1 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ JSONException -> 0x00f1 }
            java.lang.String r10 = "android.intent.action.VIEW"
            android.net.Uri r11 = android.net.Uri.parse(r1)     // Catch:{ JSONException -> 0x00f1 }
            r5.<init>(r10, r11)     // Catch:{ JSONException -> 0x00f1 }
            java.util.List r2 = r2.queryIntentActivities(r5, r7)     // Catch:{ JSONException -> 0x00f1 }
            if (r2 == 0) goto L_0x00ab
            boolean r2 = r2.isEmpty()     // Catch:{ JSONException -> 0x00f1 }
            if (r2 != 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r6 = r7
        L_0x00ac:
            if (r6 != 0) goto L_0x00ba
            q.b.a.b.h.b.b4 r2 = r0.mo8285i()     // Catch:{ JSONException -> 0x00f1 }
            q.b.a.b.h.b.e4 r2 = r2.f7156i     // Catch:{ JSONException -> 0x00f1 }
            java.lang.String r4 = "Deferred Deep Link validation failed. gclid, deep link"
            r2.mo8434a(r4, r3, r1)     // Catch:{ JSONException -> 0x00f1 }
            goto L_0x00fd
        L_0x00ba:
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ JSONException -> 0x00f1 }
            r2.<init>()     // Catch:{ JSONException -> 0x00f1 }
            r2.putString(r4, r3)     // Catch:{ JSONException -> 0x00f1 }
            java.lang.String r3 = "_cis"
            java.lang.String r4 = "ddp"
            r2.putString(r3, r4)     // Catch:{ JSONException -> 0x00f1 }
            q.b.a.b.h.b.k6 r3 = r0.f7347p     // Catch:{ JSONException -> 0x00f1 }
            java.lang.String r4 = "auto"
            java.lang.String r5 = "_cmp"
            r3.mo8561a(r4, r5, r2)     // Catch:{ JSONException -> 0x00f1 }
            q.b.a.b.h.b.w9 r2 = r0.mo8473p()     // Catch:{ JSONException -> 0x00f1 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00f1 }
            if (r3 != 0) goto L_0x00fd
            boolean r1 = r2.mo8797a(r1, r8)     // Catch:{ JSONException -> 0x00f1 }
            if (r1 == 0) goto L_0x00fd
            android.content.Intent r1 = new android.content.Intent     // Catch:{ JSONException -> 0x00f1 }
            java.lang.String r3 = "android.google.analytics.action.DEEPLINK_ACTION"
            r1.<init>(r3)     // Catch:{ JSONException -> 0x00f1 }
            q.b.a.b.h.b.g5 r2 = r2.f7133a     // Catch:{ JSONException -> 0x00f1 }
            android.content.Context r2 = r2.f7332a     // Catch:{ JSONException -> 0x00f1 }
            r2.sendBroadcast(r1)     // Catch:{ JSONException -> 0x00f1 }
            goto L_0x00fd
        L_0x00f1:
            r1 = move-exception
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7153f
            java.lang.String r2 = "Failed to parse the Deferred Deep Link response. exception"
            r0.mo8433a(r2, r1)
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3031l7.run():void");
    }
}
