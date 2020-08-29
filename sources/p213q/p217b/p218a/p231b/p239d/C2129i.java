package p213q.p217b.p218a.p231b.p239d;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p239d.p248r.C2294b;

/* renamed from: q.b.a.b.d.i */
public class C2129i {
    @Deprecated

    /* renamed from: a */
    public static final int f5999a = 12451000;

    /* renamed from: b */
    public static boolean f6000b = false;

    /* renamed from: c */
    public static boolean f6001c = false;

    /* renamed from: d */
    public static final AtomicBoolean f6002d = new AtomicBoolean();

    /* renamed from: e */
    public static final AtomicBoolean f6003e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static int m4922a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d4  */
    @java.lang.Deprecated
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m4923a(android.content.Context r11, int r12) {
        /*
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r11.getResources()     // Catch:{ all -> 0x000c }
            int r2 = p213q.p217b.p218a.p231b.p239d.C2131k.common_google_play_services_unknown_issue     // Catch:{ all -> 0x000c }
            r1.getString(r2)     // Catch:{ all -> 0x000c }
            goto L_0x0011
        L_0x000c:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            java.lang.String r3 = " but found "
            if (r1 != 0) goto L_0x0060
            java.util.concurrent.atomic.AtomicBoolean r1 = f6003e
            boolean r1 = r1.get()
            if (r1 != 0) goto L_0x0060
            p213q.p217b.p218a.p231b.p239d.p242n.C2263p0.m5118a(r11)
            int r1 = p213q.p217b.p218a.p231b.p239d.p242n.C2263p0.f6224d
            if (r1 == 0) goto L_0x0058
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r1 != r4) goto L_0x0034
            goto L_0x0060
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r12 = 320(0x140, float:4.48E-43)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            r0.append(r12)
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r12 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L_0x0058:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r11.<init>(r12)
            throw r11
        L_0x0060:
            boolean r1 = p124p.p126b.p127k.C1061o.m2545c(r11)
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x0098
            java.lang.Boolean r1 = p124p.p126b.p127k.C1061o.f2798l
            if (r1 != 0) goto L_0x008e
            android.content.pm.PackageManager r1 = r11.getPackageManager()
            java.lang.String r6 = "android.hardware.type.iot"
            boolean r1 = r1.hasSystemFeature(r6)
            if (r1 != 0) goto L_0x0087
            android.content.pm.PackageManager r1 = r11.getPackageManager()
            java.lang.String r6 = "android.hardware.type.embedded"
            boolean r1 = r1.hasSystemFeature(r6)
            if (r1 == 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r1 = r5
            goto L_0x0088
        L_0x0087:
            r1 = r4
        L_0x0088:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            p124p.p126b.p127k.C1061o.f2798l = r1
        L_0x008e:
            java.lang.Boolean r1 = p124p.p126b.p127k.C1061o.f2798l
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0098
            r1 = r4
            goto L_0x0099
        L_0x0098:
            r1 = r5
        L_0x0099:
            if (r12 < 0) goto L_0x009d
            r6 = r4
            goto L_0x009e
        L_0x009d:
            r6 = r5
        L_0x009e:
            p124p.p126b.p127k.C1061o.m2507a(r6)
            java.lang.String r6 = r11.getPackageName()
            android.content.pm.PackageManager r7 = r11.getPackageManager()
            r8 = 0
            r9 = 9
            if (r1 == 0) goto L_0x00be
            java.lang.String r8 = "com.android.vending"
            r10 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r8 = r7.getPackageInfo(r8, r10)     // Catch:{ NameNotFoundException -> 0x00b7 }
            goto L_0x00be
        L_0x00b7:
            java.lang.String r11 = java.lang.String.valueOf(r6)
            java.lang.String r12 = " requires the Google Play Store, but it is missing."
            goto L_0x00f3
        L_0x00be:
            r10 = 64
            android.content.pm.PackageInfo r10 = r7.getPackageInfo(r2, r10)     // Catch:{ NameNotFoundException -> 0x0159 }
            p213q.p217b.p218a.p231b.p239d.C2130j.m4929a(r11)
            boolean r11 = p213q.p217b.p218a.p231b.p239d.C2130j.m4931a(r10, r4)
            if (r11 != 0) goto L_0x00d4
            java.lang.String r11 = java.lang.String.valueOf(r6)
            java.lang.String r12 = " requires Google Play services, but their signature is invalid."
            goto L_0x00f3
        L_0x00d4:
            if (r1 == 0) goto L_0x00fd
            p124p.p126b.p127k.C1061o.m2524b(r8)
            boolean r11 = p213q.p217b.p218a.p231b.p239d.C2130j.m4931a(r8, r4)
            if (r11 == 0) goto L_0x00ed
            android.content.pm.Signature[] r11 = r8.signatures
            r11 = r11[r5]
            android.content.pm.Signature[] r1 = r10.signatures
            r1 = r1[r5]
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x00fd
        L_0x00ed:
            java.lang.String r11 = java.lang.String.valueOf(r6)
            java.lang.String r12 = " requires Google Play Store, but its signature is invalid."
        L_0x00f3:
            java.lang.String r11 = r11.concat(r12)
            android.util.Log.w(r0, r11)
            r4 = r9
            goto L_0x0166
        L_0x00fd:
            int r11 = r10.versionCode
            r1 = -1
            if (r11 != r1) goto L_0x0104
            r11 = r1
            goto L_0x0106
        L_0x0104:
            int r11 = r11 / 1000
        L_0x0106:
            if (r12 != r1) goto L_0x0109
            goto L_0x010b
        L_0x0109:
            int r1 = r12 / 1000
        L_0x010b:
            if (r11 >= r1) goto L_0x0139
            int r11 = r10.versionCode
            r1 = 82
            int r1 = p213q.p214a.p215a.p216a.C1965a.m4743a(r6, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Google Play services out of date for "
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = ".  Requires "
            r2.append(r1)
            r2.append(r12)
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            android.util.Log.w(r0, r11)
            r4 = 2
            goto L_0x0166
        L_0x0139:
            android.content.pm.ApplicationInfo r11 = r10.applicationInfo
            if (r11 != 0) goto L_0x0151
            android.content.pm.ApplicationInfo r11 = r7.getApplicationInfo(r2, r5)     // Catch:{ NameNotFoundException -> 0x0142 }
            goto L_0x0151
        L_0x0142:
            r11 = move-exception
            java.lang.String r12 = java.lang.String.valueOf(r6)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r12 = r12.concat(r1)
            android.util.Log.wtf(r0, r12, r11)
            goto L_0x0166
        L_0x0151:
            boolean r11 = r11.enabled
            if (r11 != 0) goto L_0x0157
            r4 = 3
            goto L_0x0166
        L_0x0157:
            r4 = r5
            goto L_0x0166
        L_0x0159:
            java.lang.String r11 = java.lang.String.valueOf(r6)
            java.lang.String r12 = " requires Google Play services, but they are missing."
            java.lang.String r11 = r11.concat(r12)
            android.util.Log.w(r0, r11)
        L_0x0166:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.C2129i.m4923a(android.content.Context, int):int");
    }

    @Deprecated
    /* renamed from: a */
    public static String m4924a(int i) {
        return C2115b.m4904a(i);
    }

    @TargetApi(19)
    @Deprecated
    /* renamed from: a */
    public static boolean m4925a(Context context, int i, String str) {
        return C2286e.m5300b(context, i, str);
    }

    /* renamed from: b */
    public static Context m4926b(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m4927b(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    /* renamed from: c */
    public static boolean m4928c(Context context) {
        if (!f6001c) {
            try {
                PackageInfo packageInfo = C2294b.m5363b(context).f6270a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C2130j.m4929a(context);
                if (packageInfo == null || C2130j.m4931a(packageInfo, false) || !C2130j.m4931a(packageInfo, true)) {
                    f6000b = false;
                } else {
                    f6000b = true;
                }
            } catch (NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } catch (Throwable th) {
                f6001c = true;
                throw th;
            }
            f6001c = true;
        }
        if (!f6000b) {
            return !"user".equals(Build.TYPE);
        }
    }
}
