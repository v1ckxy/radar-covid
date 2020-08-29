package p213q.p217b.p218a.p231b.p239d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p124p.p126b.p127k.C1061o;

@CheckReturnValue
/* renamed from: q.b.a.b.d.j */
public class C2130j {
    @Nullable

    /* renamed from: b */
    public static C2130j f6004b;

    /* renamed from: a */
    public final Context f6005a;

    public C2130j(Context context) {
        this.f6005a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C2130j m4929a(Context context) {
        C1061o.m2524b(context);
        synchronized (C2130j.class) {
            if (f6004b == null) {
                C2297u.m5366a(context);
                f6004b = new C2130j(context);
            }
        }
        return f6004b;
    }

    @Nullable
    /* renamed from: a */
    public static C2298v m4930a(PackageInfo packageInfo, C2298v... vVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C2301y yVar = new C2301y(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < vVarArr.length; i++) {
            if (vVarArr[i].equals(yVar)) {
                return vVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m4931a(PackageInfo packageInfo, boolean z) {
        C2298v vVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                vVar = m4930a(packageInfo, C2114a0.f5973a);
            } else {
                vVar = m4930a(packageInfo, C2114a0.f5973a[0]);
            }
            if (vVar != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a9 A[LOOP:0: B:5:0x001b->B:43:0x00a9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b9 A[EDGE_INSN: B:57:0x00b9->B:46:0x00b9 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7118a(int r11) {
        /*
            r10 = this;
            android.content.Context r0 = r10.f6005a
            q.b.a.b.d.r.a r0 = p213q.p217b.p218a.p231b.p239d.p248r.C2294b.m5363b(r0)
            android.content.Context r0 = r0.f6270a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String[] r11 = r0.getPackagesForUid(r11)
            if (r11 == 0) goto L_0x00b3
            int r0 = r11.length
            if (r0 != 0) goto L_0x0017
            goto L_0x00b3
        L_0x0017:
            r0 = 0
            int r1 = r11.length
            r2 = 0
            r3 = r2
        L_0x001b:
            if (r3 >= r1) goto L_0x00ad
            r0 = r11[r3]
            android.content.Context r4 = r10.f6005a     // Catch:{ NameNotFoundException -> 0x008a }
            q.b.a.b.d.r.a r4 = p213q.p217b.p218a.p231b.p239d.p248r.C2294b.m5363b(r4)     // Catch:{ NameNotFoundException -> 0x008a }
            android.content.Context r4 = r4.f6270a     // Catch:{ NameNotFoundException -> 0x008a }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008a }
            r5 = 64
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x008a }
            android.content.Context r5 = r10.f6005a     // Catch:{ NameNotFoundException -> 0x008a }
            boolean r5 = p213q.p217b.p218a.p231b.p239d.C2129i.m4928c(r5)     // Catch:{ NameNotFoundException -> 0x008a }
            if (r4 != 0) goto L_0x0040
            java.lang.String r4 = "null pkg"
        L_0x003b:
            q.b.a.b.d.d0 r0 = p213q.p217b.p218a.p231b.p239d.C2120d0.m4909a(r4)     // Catch:{ NameNotFoundException -> 0x008a }
            goto L_0x00a4
        L_0x0040:
            android.content.pm.Signature[] r6 = r4.signatures     // Catch:{ NameNotFoundException -> 0x008a }
            if (r6 == 0) goto L_0x0087
            android.content.pm.Signature[] r6 = r4.signatures     // Catch:{ NameNotFoundException -> 0x008a }
            int r6 = r6.length     // Catch:{ NameNotFoundException -> 0x008a }
            r7 = 1
            if (r6 == r7) goto L_0x004b
            goto L_0x0087
        L_0x004b:
            q.b.a.b.d.y r6 = new q.b.a.b.d.y     // Catch:{ NameNotFoundException -> 0x008a }
            android.content.pm.Signature[] r8 = r4.signatures     // Catch:{ NameNotFoundException -> 0x008a }
            r8 = r8[r2]     // Catch:{ NameNotFoundException -> 0x008a }
            byte[] r8 = r8.toByteArray()     // Catch:{ NameNotFoundException -> 0x008a }
            r6.<init>(r8)     // Catch:{ NameNotFoundException -> 0x008a }
            java.lang.String r8 = r4.packageName     // Catch:{ NameNotFoundException -> 0x008a }
            q.b.a.b.d.d0 r5 = p213q.p217b.p218a.p231b.p239d.C2297u.m5365a(r8, r6, r5, r2)     // Catch:{ NameNotFoundException -> 0x008a }
            boolean r9 = r5.f5989a     // Catch:{ NameNotFoundException -> 0x008a }
            if (r9 == 0) goto L_0x0085
            android.content.pm.ApplicationInfo r9 = r4.applicationInfo     // Catch:{ NameNotFoundException -> 0x008a }
            if (r9 == 0) goto L_0x0085
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch:{ NameNotFoundException -> 0x008a }
            int r4 = r4.flags     // Catch:{ NameNotFoundException -> 0x008a }
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0085
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ NameNotFoundException -> 0x008a }
            q.b.a.b.d.d0 r6 = p213q.p217b.p218a.p231b.p239d.C2297u.m5367b(r8, r6, r2, r7)     // Catch:{ all -> 0x0080 }
            android.os.StrictMode.setThreadPolicy(r4)     // Catch:{ NameNotFoundException -> 0x008a }
            boolean r4 = r6.f5989a     // Catch:{ NameNotFoundException -> 0x008a }
            if (r4 == 0) goto L_0x0085
            java.lang.String r4 = "debuggable release cert app rejected"
            goto L_0x003b
        L_0x0080:
            r5 = move-exception
            android.os.StrictMode.setThreadPolicy(r4)     // Catch:{ NameNotFoundException -> 0x008a }
            throw r5     // Catch:{ NameNotFoundException -> 0x008a }
        L_0x0085:
            r0 = r5
            goto L_0x00a4
        L_0x0087:
            java.lang.String r4 = "single cert required"
            goto L_0x003b
        L_0x008a:
            java.lang.String r4 = "no pkg "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r0.length()
            if (r5 == 0) goto L_0x009b
            java.lang.String r0 = r4.concat(r0)
            goto L_0x00a0
        L_0x009b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
        L_0x00a0:
            q.b.a.b.d.d0 r0 = p213q.p217b.p218a.p231b.p239d.C2120d0.m4909a(r0)
        L_0x00a4:
            boolean r4 = r0.f5989a
            if (r4 == 0) goto L_0x00a9
            goto L_0x00b9
        L_0x00a9:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x00ad:
            p124p.p126b.p127k.C1061o.m2524b(r0)
            q.b.a.b.d.d0 r0 = (p213q.p217b.p218a.p231b.p239d.C2120d0) r0
            goto L_0x00b9
        L_0x00b3:
            java.lang.String r11 = "no pkgs"
            q.b.a.b.d.d0 r0 = p213q.p217b.p218a.p231b.p239d.C2120d0.m4909a(r11)
        L_0x00b9:
            boolean r11 = r0.f5989a
            if (r11 != 0) goto L_0x00db
            r11 = 3
            java.lang.String r1 = "GoogleCertificatesRslt"
            boolean r11 = android.util.Log.isLoggable(r1, r11)
            if (r11 == 0) goto L_0x00db
            java.lang.Throwable r11 = r0.f5991c
            if (r11 == 0) goto L_0x00d4
            java.lang.String r11 = r0.mo7108a()
            java.lang.Throwable r2 = r0.f5991c
            android.util.Log.d(r1, r11, r2)
            goto L_0x00db
        L_0x00d4:
            java.lang.String r11 = r0.mo7108a()
            android.util.Log.d(r1, r11)
        L_0x00db:
            boolean r11 = r0.f5989a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.C2130j.mo7118a(int):boolean");
    }
}
