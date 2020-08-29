package p213q.p217b.p218a.p231b.p239d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p242n.C2244h0;
import p213q.p217b.p218a.p231b.p239d.p248r.C2294b;

/* renamed from: q.b.a.b.d.f */
public class C2124f {

    /* renamed from: a */
    public static final int f5996a = C2129i.f5999a;

    /* renamed from: b */
    public static final C2124f f5997b = new C2124f();

    /* renamed from: a */
    public Intent mo7111a(Context context, int i, String str) {
        String str2 = "com.google.android.gms";
        if (i == 1 || i == 2) {
            if (context != null && C1061o.m2545c(context)) {
                return C2244h0.m5097a();
            }
            StringBuilder a = C1965a.m4756a("gcore_");
            a.append(f5996a);
            String str3 = "-";
            a.append(str3);
            if (!TextUtils.isEmpty(str)) {
                a.append(str);
            }
            a.append(str3);
            if (context != null) {
                a.append(context.getPackageName());
            }
            a.append(str3);
            if (context != null) {
                try {
                    a.append(C2294b.m5363b(context).mo7310b(context.getPackageName(), 0).versionCode);
                } catch (NameNotFoundException unused) {
                }
            }
            return C2244h0.m5099a(str2, a.toString());
        } else if (i != 3) {
            return null;
        } else {
            return C2244h0.m5098a(str2);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo7110a(android.content.Context r7, int r8) {
        /*
            r6 = this;
            int r8 = p213q.p217b.p218a.p231b.p239d.C2129i.m4923a(r7, r8)
            r0 = 1
            r1 = 18
            if (r8 != r1) goto L_0x000a
            goto L_0x0044
        L_0x000a:
            r2 = 0
            if (r8 != r0) goto L_0x0043
            java.lang.String r3 = "com.google.android.gms"
            android.content.pm.PackageManager r4 = r7.getPackageManager()     // Catch:{ Exception -> 0x0043 }
            android.content.pm.PackageInstaller r4 = r4.getPackageInstaller()     // Catch:{ Exception -> 0x0043 }
            java.util.List r4 = r4.getAllSessions()     // Catch:{ Exception -> 0x0043 }
            java.util.Iterator r4 = r4.iterator()
        L_0x001f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0036
            java.lang.Object r5 = r4.next()
            android.content.pm.PackageInstaller$SessionInfo r5 = (android.content.pm.PackageInstaller.SessionInfo) r5
            java.lang.String r5 = r5.getAppPackageName()
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001f
            goto L_0x0044
        L_0x0036:
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r0 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo(r3, r0)     // Catch:{  }
            boolean r0 = r7.enabled     // Catch:{  }
            goto L_0x0044
        L_0x0043:
            r0 = r2
        L_0x0044:
            if (r0 == 0) goto L_0x0047
            r8 = r1
        L_0x0047:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.C2124f.mo7110a(android.content.Context, int):int");
    }
}
