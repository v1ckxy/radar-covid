package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;
import p213q.p217b.p218a.p231b.p239d.p245p.C2277a;
import p213q.p217b.p218a.p231b.p239d.p248r.C2293a;
import p213q.p217b.p218a.p231b.p239d.p248r.C2294b;

/* renamed from: q.b.a.b.h.b.t4 */
public final class C3118t4 {

    /* renamed from: a */
    public final C2969g5 f7861a;

    public C3118t4(C2969g5 g5Var) {
        this.f7861a = g5Var;
    }

    /* renamed from: a */
    public final void mo8716a(String str) {
        if (str == null || str.isEmpty()) {
            this.f7861a.mo8285i().f7157j.mo8432a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f7861a.mo8283g().mo8279c();
        if (!mo8717a()) {
            this.f7861a.mo8285i().f7159l.mo8432a("Install Referrer Reporter is not available");
            return;
        }
        C3151w4 w4Var = new C3151w4(this, str);
        this.f7861a.mo8283g().mo8279c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        String str2 = "com.android.vending";
        intent.setComponent(new ComponentName(str2, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f7861a.f7332a.getPackageManager();
        if (packageManager == null) {
            this.f7861a.mo8285i().f7157j.mo8432a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f7861a.mo8285i().f7159l.mo8432a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = ((ResolveInfo) queryIntentServices.get(0)).serviceInfo;
        if (serviceInfo != null) {
            String str3 = serviceInfo.packageName;
            if (serviceInfo.name == null || !str2.equals(str3) || !mo8717a()) {
                this.f7861a.mo8285i().f7156i.mo8432a("Play Store version 8.3.73 or higher required for Install Referrer");
            } else {
                try {
                    this.f7861a.mo8285i().f7161n.mo8433a("Install Referrer Service is", C2277a.m5128a().mo7299a(this.f7861a.f7332a, new Intent(intent), w4Var, 1) ? "available" : "not available");
                } catch (Exception e) {
                    this.f7861a.mo8285i().f7153f.mo8433a("Exception occurred while binding to Install Referrer Service", e.getMessage());
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo8717a() {
        boolean z = false;
        try {
            C2293a b = C2294b.m5363b(this.f7861a.f7332a);
            if (b == null) {
                this.f7861a.mo8285i().f7161n.mo8432a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (b.f6270a.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            this.f7861a.mo8285i().f7161n.mo8433a("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
