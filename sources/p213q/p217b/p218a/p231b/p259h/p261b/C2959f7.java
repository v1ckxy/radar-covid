package p213q.p217b.p218a.p231b.p259h.p261b;

import android.net.Uri;

/* renamed from: q.b.a.b.h.b.f7 */
public final class C2959f7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ boolean f7301e;

    /* renamed from: f */
    public final /* synthetic */ Uri f7302f;

    /* renamed from: g */
    public final /* synthetic */ String f7303g;

    /* renamed from: h */
    public final /* synthetic */ String f7304h;

    /* renamed from: i */
    public final /* synthetic */ C2971g7 f7305i;

    public C2959f7(C2971g7 g7Var, boolean z, Uri uri, String str, String str2) {
        this.f7305i = g7Var;
        this.f7301e = z;
        this.f7302f = uri;
        this.f7303g = str;
        this.f7304h = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (r2.f7360e.f7133a.f7338g.mo8574a(p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7731j0) == false) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e A[SYNTHETIC, Splitter:B:32:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0101 A[Catch:{ Exception -> 0x01d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0114 A[SYNTHETIC, Splitter:B:52:0x0114] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0143 A[Catch:{ Exception -> 0x01d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0145 A[Catch:{ Exception -> 0x01d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01bd A[Catch:{ Exception -> 0x01d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c9 A[Catch:{ Exception -> 0x01d5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            q.b.a.b.h.b.g7 r2 = r1.f7305i
            boolean r0 = r1.f7301e
            android.net.Uri r3 = r1.f7302f
            java.lang.String r4 = r1.f7303g
            java.lang.String r5 = r1.f7304h
            q.b.a.b.h.b.k6 r6 = r2.f7360e
            r6.mo8279c()
            q.b.a.b.h.b.k6 r6 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.g5 r6 = r6.f7133a     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.ka r6 = r6.f7338g     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7729i0     // Catch:{ Exception -> 0x01d5 }
            boolean r6 = r6.mo8574a(r7)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r7 = "Activity created with data 'referrer' without required params"
            java.lang.String r8 = "utm_medium"
            java.lang.String r9 = "_cis"
            java.lang.String r10 = "utm_source"
            java.lang.String r11 = "utm_campaign"
            java.lang.String r12 = "gclid"
            if (r6 != 0) goto L_0x0047
            q.b.a.b.h.b.k6 r6 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.g5 r6 = r6.f7133a     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.ka r6 = r6.f7338g     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r14 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7733k0     // Catch:{ Exception -> 0x01d5 }
            boolean r6 = r6.mo8574a(r14)     // Catch:{ Exception -> 0x01d5 }
            if (r6 != 0) goto L_0x0047
            q.b.a.b.h.b.k6 r6 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.g5 r6 = r6.f7133a     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.ka r6 = r6.f7338g     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r14 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7731j0     // Catch:{ Exception -> 0x01d5 }
            boolean r6 = r6.mo8574a(r14)     // Catch:{ Exception -> 0x01d5 }
            if (r6 == 0) goto L_0x0075
        L_0x0047:
            q.b.a.b.h.b.k6 r6 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.w9 r6 = r6.mo8287k()     // Catch:{ Exception -> 0x01d5 }
            boolean r14 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x01d5 }
            if (r14 == 0) goto L_0x0054
            goto L_0x0075
        L_0x0054:
            boolean r14 = r5.contains(r12)     // Catch:{ Exception -> 0x01d5 }
            if (r14 != 0) goto L_0x0077
            boolean r14 = r5.contains(r11)     // Catch:{ Exception -> 0x01d5 }
            if (r14 != 0) goto L_0x0077
            boolean r14 = r5.contains(r10)     // Catch:{ Exception -> 0x01d5 }
            if (r14 != 0) goto L_0x0077
            boolean r14 = r5.contains(r8)     // Catch:{ Exception -> 0x01d5 }
            if (r14 != 0) goto L_0x0077
            q.b.a.b.h.b.b4 r6 = r6.mo8285i()     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.e4 r6 = r6.f7160m     // Catch:{ Exception -> 0x01d5 }
            r6.mo8432a(r7)     // Catch:{ Exception -> 0x01d5 }
        L_0x0075:
            r6 = 0
            goto L_0x0099
        L_0x0077:
            java.lang.String r14 = "https://google.com/search?"
            int r15 = r5.length()     // Catch:{ Exception -> 0x01d5 }
            if (r15 == 0) goto L_0x0084
            java.lang.String r14 = r14.concat(r5)     // Catch:{ Exception -> 0x01d5 }
            goto L_0x008a
        L_0x0084:
            java.lang.String r15 = new java.lang.String     // Catch:{ Exception -> 0x01d5 }
            r15.<init>(r14)     // Catch:{ Exception -> 0x01d5 }
            r14 = r15
        L_0x008a:
            android.net.Uri r14 = android.net.Uri.parse(r14)     // Catch:{ Exception -> 0x01d5 }
            android.os.Bundle r6 = r6.mo8777a(r14)     // Catch:{ Exception -> 0x01d5 }
            if (r6 == 0) goto L_0x0099
            java.lang.String r14 = "referrer"
            r6.putString(r9, r14)     // Catch:{ Exception -> 0x01d5 }
        L_0x0099:
            r14 = 1
            java.lang.String r13 = "_cmp"
            if (r0 == 0) goto L_0x0101
            q.b.a.b.h.b.k6 r0 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.w9 r0 = r0.mo8287k()     // Catch:{ Exception -> 0x01d5 }
            android.os.Bundle r0 = r0.mo8777a(r3)     // Catch:{ Exception -> 0x01d5 }
            if (r0 == 0) goto L_0x00fe
            java.lang.String r3 = "intent"
            r0.putString(r9, r3)     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.k6 r3 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.g5 r3 = r3.f7133a     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.ka r3 = r3.f7338g     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r9 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7729i0     // Catch:{ Exception -> 0x01d5 }
            boolean r3 = r3.mo8574a(r9)     // Catch:{ Exception -> 0x01d5 }
            if (r3 == 0) goto L_0x00e1
            boolean r3 = r0.containsKey(r12)     // Catch:{ Exception -> 0x01d5 }
            if (r3 != 0) goto L_0x00e1
            if (r6 == 0) goto L_0x00e1
            boolean r3 = r6.containsKey(r12)     // Catch:{ Exception -> 0x01d5 }
            if (r3 == 0) goto L_0x00e1
            java.lang.String r3 = "_cer"
            java.lang.String r9 = "gclid=%s"
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r17 = r6.getString(r12)     // Catch:{ Exception -> 0x01d5 }
            r16 = 0
            r15[r16] = r17     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r9 = java.lang.String.format(r9, r15)     // Catch:{ Exception -> 0x01d5 }
            r0.putString(r3, r9)     // Catch:{ Exception -> 0x01d5 }
            goto L_0x00e3
        L_0x00e1:
            r16 = 0
        L_0x00e3:
            q.b.a.b.h.b.k6 r3 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            r3.mo8561a(r4, r13, r0)     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.k6 r3 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.g5 r3 = r3.f7133a     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.ka r3 = r3.f7338g     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r9 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7701R0     // Catch:{ Exception -> 0x01d5 }
            boolean r3 = r3.mo8574a(r9)     // Catch:{ Exception -> 0x01d5 }
            if (r3 == 0) goto L_0x0104
            q.b.a.b.h.b.k6 r3 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.ba r3 = r3.f7490h     // Catch:{ Exception -> 0x01d5 }
            r3.mo8318a(r4, r0)     // Catch:{ Exception -> 0x01d5 }
            goto L_0x0104
        L_0x00fe:
            r16 = 0
            goto L_0x0104
        L_0x0101:
            r16 = 0
            r0 = 0
        L_0x0104:
            q.b.a.b.h.b.k6 r3 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.g5 r3 = r3.f7133a     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.ka r3 = r3.f7338g     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r9 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7733k0     // Catch:{ Exception -> 0x01d5 }
            boolean r3 = r3.mo8574a(r9)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r9 = "auto"
            if (r3 == 0) goto L_0x013d
            q.b.a.b.h.b.k6 r3 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.g5 r3 = r3.f7133a     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.ka r3 = r3.f7338g     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r15 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7731j0     // Catch:{ Exception -> 0x01d5 }
            boolean r3 = r3.mo8574a(r15)     // Catch:{ Exception -> 0x01d5 }
            if (r3 != 0) goto L_0x013d
            if (r6 == 0) goto L_0x013d
            boolean r3 = r6.containsKey(r12)     // Catch:{ Exception -> 0x01d5 }
            if (r3 == 0) goto L_0x013d
            if (r0 == 0) goto L_0x0132
            boolean r0 = r0.containsKey(r12)     // Catch:{ Exception -> 0x01d5 }
            if (r0 != 0) goto L_0x013d
        L_0x0132:
            q.b.a.b.h.b.k6 r0 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r3 = "_lgclid"
            java.lang.String r15 = r6.getString(r12)     // Catch:{ Exception -> 0x01d5 }
            r0.mo8563a(r9, r3, r15)     // Catch:{ Exception -> 0x01d5 }
        L_0x013d:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x01d5 }
            if (r0 == 0) goto L_0x0145
            goto L_0x01e3
        L_0x0145:
            q.b.a.b.h.b.k6 r0 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.e4 r0 = r0.f7160m     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r3 = "Activity created with referrer"
            r0.mo8433a(r3, r5)     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.k6 r0 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.g5 r0 = r0.f7133a     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.ka r0 = r0.f7338g     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r3 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7731j0     // Catch:{ Exception -> 0x01d5 }
            boolean r0 = r0.mo8574a(r3)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r3 = "_ldl"
            if (r0 == 0) goto L_0x0190
            if (r6 == 0) goto L_0x017f
            q.b.a.b.h.b.k6 r0 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            r0.mo8561a(r4, r13, r6)     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.k6 r0 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.g5 r0 = r0.f7133a     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.ka r0 = r0.f7338g     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7701R0     // Catch:{ Exception -> 0x01d5 }
            boolean r0 = r0.mo8574a(r5)     // Catch:{ Exception -> 0x01d5 }
            if (r0 == 0) goto L_0x018c
            q.b.a.b.h.b.k6 r0 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.ba r0 = r0.f7490h     // Catch:{ Exception -> 0x01d5 }
            r0.mo8318a(r4, r6)     // Catch:{ Exception -> 0x01d5 }
            goto L_0x018c
        L_0x017f:
            q.b.a.b.h.b.k6 r0 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.e4 r0 = r0.f7160m     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r4 = "Referrer does not contain valid parameters"
            r0.mo8433a(r4, r5)     // Catch:{ Exception -> 0x01d5 }
        L_0x018c:
            q.b.a.b.h.b.k6 r0 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            r5 = 0
            goto L_0x01d1
        L_0x0190:
            boolean r0 = r5.contains(r12)     // Catch:{ Exception -> 0x01d5 }
            if (r0 == 0) goto L_0x01b9
            boolean r0 = r5.contains(r11)     // Catch:{ Exception -> 0x01d5 }
            if (r0 != 0) goto L_0x01bb
            boolean r0 = r5.contains(r10)     // Catch:{ Exception -> 0x01d5 }
            if (r0 != 0) goto L_0x01bb
            boolean r0 = r5.contains(r8)     // Catch:{ Exception -> 0x01d5 }
            if (r0 != 0) goto L_0x01bb
            java.lang.String r0 = "utm_term"
            boolean r0 = r5.contains(r0)     // Catch:{ Exception -> 0x01d5 }
            if (r0 != 0) goto L_0x01bb
            java.lang.String r0 = "utm_content"
            boolean r0 = r5.contains(r0)     // Catch:{ Exception -> 0x01d5 }
            if (r0 == 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b9:
            r14 = r16
        L_0x01bb:
            if (r14 != 0) goto L_0x01c9
            q.b.a.b.h.b.k6 r0 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()     // Catch:{ Exception -> 0x01d5 }
            q.b.a.b.h.b.e4 r0 = r0.f7160m     // Catch:{ Exception -> 0x01d5 }
            r0.mo8432a(r7)     // Catch:{ Exception -> 0x01d5 }
            goto L_0x01e3
        L_0x01c9:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x01d5 }
            if (r0 != 0) goto L_0x01e3
            q.b.a.b.h.b.k6 r0 = r2.f7360e     // Catch:{ Exception -> 0x01d5 }
        L_0x01d1:
            r0.mo8563a(r9, r3, r5)     // Catch:{ Exception -> 0x01d5 }
            goto L_0x01e3
        L_0x01d5:
            r0 = move-exception
            q.b.a.b.h.b.k6 r2 = r2.f7360e
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7153f
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.mo8433a(r3, r0)
        L_0x01e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2959f7.run():void");
    }
}
