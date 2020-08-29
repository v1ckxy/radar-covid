package p003f.p004a.p005a.p006a.p007a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build.VERSION;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.a.a.k */
public final class C0434k implements C0433j {

    /* renamed from: a */
    public final Context f1818a;

    public C0434k(Context context) {
        if (context != null) {
            this.f1818a = context;
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }

    /* renamed from: a */
    public boolean mo3690a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f1818a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3);
        }
        return false;
    }

    /* renamed from: b */
    public int mo3691b() {
        PackageInfo packageInfo = this.f1818a.getPackageManager().getPackageInfo(this.f1818a.getPackageName(), 0);
        if (VERSION.SDK_INT < 28) {
            return packageInfo.versionCode;
        }
        C4638h.m10270a((Object) packageInfo, "it");
        return (int) packageInfo.getLongVersionCode();
    }
}
