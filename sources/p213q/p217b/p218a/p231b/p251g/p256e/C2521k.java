package p213q.p217b.p218a.p231b.p251g.p256e;

import android.content.Context;
import android.os.Bundle;
import p213q.p217b.p218a.p231b.p251g.p256e.C2462h.C2463a;

/* renamed from: q.b.a.b.g.e.k */
public final class C2521k extends C2463a {

    /* renamed from: i */
    public final /* synthetic */ String f6657i;

    /* renamed from: j */
    public final /* synthetic */ String f6658j;

    /* renamed from: k */
    public final /* synthetic */ Context f6659k;

    /* renamed from: l */
    public final /* synthetic */ Bundle f6660l;

    /* renamed from: m */
    public final /* synthetic */ C2462h f6661m;

    public C2521k(C2462h hVar, String str, String str2, Context context, Bundle bundle) {
        this.f6661m = hVar;
        this.f6657i = str;
        this.f6658j = str2;
        this.f6659k = context;
        this.f6660l = bundle;
        super(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad A[Catch:{ Exception -> 0x00ae }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7349a() {
        /*
            r14 = this;
            r0 = 1
            r1 = 0
            q.b.a.b.g.e.h r2 = r14.f6661m     // Catch:{ Exception -> 0x00ae }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ae }
            r3.<init>()     // Catch:{ Exception -> 0x00ae }
            r2.f6559e = r3     // Catch:{ Exception -> 0x00ae }
            java.lang.String r2 = r14.f6657i     // Catch:{ Exception -> 0x00ae }
            java.lang.String r3 = r14.f6658j     // Catch:{ Exception -> 0x00ae }
            boolean r2 = p213q.p217b.p218a.p231b.p251g.p256e.C2462h.m5878a(r2, r3)     // Catch:{ Exception -> 0x00ae }
            r3 = 0
            if (r2 == 0) goto L_0x0022
            java.lang.String r2 = r14.f6658j     // Catch:{ Exception -> 0x00ae }
            java.lang.String r4 = r14.f6657i     // Catch:{ Exception -> 0x00ae }
            q.b.a.b.g.e.h r5 = r14.f6661m     // Catch:{ Exception -> 0x00ae }
            java.lang.String r5 = r5.f6555a     // Catch:{ Exception -> 0x00ae }
            r11 = r2
            r10 = r4
            r9 = r5
            goto L_0x0025
        L_0x0022:
            r9 = r3
            r10 = r9
            r11 = r10
        L_0x0025:
            android.content.Context r2 = r14.f6659k     // Catch:{ Exception -> 0x00ae }
            p213q.p217b.p218a.p231b.p251g.p256e.C2462h.m5877a(r2)     // Catch:{ Exception -> 0x00ae }
            java.lang.Boolean r2 = p213q.p217b.p218a.p231b.p251g.p256e.C2462h.f6554j     // Catch:{ Exception -> 0x00ae }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x00ae }
            if (r2 != 0) goto L_0x0037
            if (r10 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r2 = r1
            goto L_0x0038
        L_0x0037:
            r2 = r0
        L_0x0038:
            q.b.a.b.g.e.h r4 = r14.f6661m     // Catch:{ Exception -> 0x00ae }
            q.b.a.b.g.e.h r5 = r14.f6661m     // Catch:{ Exception -> 0x00ae }
            android.content.Context r6 = r14.f6659k     // Catch:{ Exception -> 0x00ae }
            if (r5 == 0) goto L_0x00ad
            java.lang.String r7 = "com.google.android.gms.measurement.dynamite"
            if (r2 == 0) goto L_0x0047
            com.google.android.gms.dynamite.DynamiteModule$b r8 = com.google.android.gms.dynamite.DynamiteModule.f1101k     // Catch:{ a -> 0x0058 }
            goto L_0x0049
        L_0x0047:
            com.google.android.gms.dynamite.DynamiteModule$b r8 = com.google.android.gms.dynamite.DynamiteModule.f1099i     // Catch:{ a -> 0x0058 }
        L_0x0049:
            com.google.android.gms.dynamite.DynamiteModule r6 = com.google.android.gms.dynamite.DynamiteModule.m892a(r6, r8, r7)     // Catch:{ a -> 0x0058 }
            java.lang.String r8 = "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"
            android.os.IBinder r6 = r6.mo1539a(r8)     // Catch:{ a -> 0x0058 }
            q.b.a.b.g.e.oe r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2589ne.asInterface(r6)     // Catch:{ a -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r6 = move-exception
            r5.mo7688a(r6, r0, r1)     // Catch:{ Exception -> 0x00ae }
        L_0x005c:
            r4.f6562h = r3     // Catch:{ Exception -> 0x00ae }
            q.b.a.b.g.e.h r3 = r14.f6661m     // Catch:{ Exception -> 0x00ae }
            q.b.a.b.g.e.oe r3 = r3.f6562h     // Catch:{ Exception -> 0x00ae }
            if (r3 != 0) goto L_0x006e
            q.b.a.b.g.e.h r2 = r14.f6661m     // Catch:{ Exception -> 0x00ae }
            java.lang.String r2 = r2.f6555a     // Catch:{ Exception -> 0x00ae }
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch:{ Exception -> 0x00ae }
            return
        L_0x006e:
            android.content.Context r3 = r14.f6659k     // Catch:{ Exception -> 0x00ae }
            int r3 = com.google.android.gms.dynamite.DynamiteModule.m890a(r3, r7)     // Catch:{ Exception -> 0x00ae }
            android.content.Context r4 = r14.f6659k     // Catch:{ Exception -> 0x00ae }
            int r4 = com.google.android.gms.dynamite.DynamiteModule.m891a(r4, r7, r1)     // Catch:{ Exception -> 0x00ae }
            if (r2 == 0) goto L_0x0087
            int r2 = java.lang.Math.max(r3, r4)     // Catch:{ Exception -> 0x00ae }
            if (r4 >= r3) goto L_0x0084
            r3 = r0
            goto L_0x0085
        L_0x0084:
            r3 = r1
        L_0x0085:
            r8 = r3
            goto L_0x0091
        L_0x0087:
            if (r3 <= 0) goto L_0x008a
            r4 = r3
        L_0x008a:
            if (r3 <= 0) goto L_0x008e
            r2 = r0
            goto L_0x008f
        L_0x008e:
            r2 = r1
        L_0x008f:
            r8 = r2
            r2 = r4
        L_0x0091:
            q.b.a.b.g.e.f r13 = new q.b.a.b.g.e.f     // Catch:{ Exception -> 0x00ae }
            r4 = 31000(0x7918, double:1.5316E-319)
            long r6 = (long) r2     // Catch:{ Exception -> 0x00ae }
            android.os.Bundle r12 = r14.f6660l     // Catch:{ Exception -> 0x00ae }
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00ae }
            q.b.a.b.g.e.h r2 = r14.f6661m     // Catch:{ Exception -> 0x00ae }
            q.b.a.b.g.e.oe r2 = r2.f6562h     // Catch:{ Exception -> 0x00ae }
            android.content.Context r3 = r14.f6659k     // Catch:{ Exception -> 0x00ae }
            q.b.a.b.e.b r4 = new q.b.a.b.e.b     // Catch:{ Exception -> 0x00ae }
            r4.<init>(r3)     // Catch:{ Exception -> 0x00ae }
            long r5 = r14.f6563e     // Catch:{ Exception -> 0x00ae }
            r2.initialize(r4, r13, r5)     // Catch:{ Exception -> 0x00ae }
            return
        L_0x00ad:
            throw r3     // Catch:{ Exception -> 0x00ae }
        L_0x00ae:
            r2 = move-exception
            q.b.a.b.g.e.h r3 = r14.f6661m
            r3.mo7688a(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2521k.mo7349a():void");
    }
}
