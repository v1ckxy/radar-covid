package p213q.p217b.p317d.p347l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p317d.C3859c;

/* renamed from: q.b.d.l.q */
public final class C4253q {

    /* renamed from: a */
    public final Context f10235a;
    @GuardedBy("this")

    /* renamed from: b */
    public String f10236b;
    @GuardedBy("this")

    /* renamed from: c */
    public String f10237c;
    @GuardedBy("this")

    /* renamed from: d */
    public int f10238d;
    @GuardedBy("this")

    /* renamed from: e */
    public int f10239e = 0;

    public C4253q(Context context) {
        this.f10235a = context;
    }

    /* renamed from: a */
    public static String m9735a(C3859c cVar) {
        cVar.mo10056a();
        String str = cVar.f9461c.f9475e;
        if (str != null) {
            return str;
        }
        cVar.mo10056a();
        String str2 = cVar.f9461c.f9472b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: a */
    public final synchronized int mo10441a() {
        if (this.f10239e != 0) {
            return this.f10239e;
        }
        PackageManager packageManager = this.f10235a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C2286e.m5333e()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f10239e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (C2286e.m5333e()) {
                this.f10239e = 2;
            } else {
                this.f10239e = 1;
            }
            return this.f10239e;
        }
        this.f10239e = 2;
        return 2;
    }

    /* renamed from: a */
    public final PackageInfo mo10442a(String str) {
        try {
            return this.f10235a.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: b */
    public final synchronized String mo10443b() {
        if (this.f10236b == null) {
            mo10446e();
        }
        return this.f10236b;
    }

    /* renamed from: c */
    public final synchronized String mo10444c() {
        if (this.f10237c == null) {
            mo10446e();
        }
        return this.f10237c;
    }

    /* renamed from: d */
    public final synchronized int mo10445d() {
        if (this.f10238d == 0) {
            PackageInfo a = mo10442a("com.google.android.gms");
            if (a != null) {
                this.f10238d = a.versionCode;
            }
        }
        return this.f10238d;
    }

    /* renamed from: e */
    public final synchronized void mo10446e() {
        PackageInfo a = mo10442a(this.f10235a.getPackageName());
        if (a != null) {
            this.f10236b = Integer.toString(a.versionCode);
            this.f10237c = a.versionName;
        }
    }
}
