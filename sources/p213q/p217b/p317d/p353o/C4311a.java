package p213q.p217b.p317d.p353o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import java.util.concurrent.atomic.AtomicBoolean;
import p124p.p150h.p152e.C1325a;
import p213q.p217b.p317d.p345j.C4208c;

/* renamed from: q.b.d.o.a */
public class C4311a {

    /* renamed from: a */
    public final Context f10364a;

    /* renamed from: b */
    public final SharedPreferences f10365b;

    /* renamed from: c */
    public final AtomicBoolean f10366c;

    public C4311a(Context context, String str, C4208c cVar) {
        Context context2 = (VERSION.SDK_INT < 24 || C1325a.m3378b(context)) ? context : VERSION.SDK_INT >= 24 ? context.createDeviceProtectedStorageContext() : null;
        this.f10364a = context2;
        StringBuilder sb = new StringBuilder();
        sb.append("com.google.firebase.common.prefs:");
        sb.append(str);
        this.f10365b = context.getSharedPreferences(sb.toString(), 0);
        String str2 = "firebase_data_collection_default_enabled";
        boolean z = true;
        if (this.f10365b.contains(str2)) {
            z = this.f10365b.getBoolean(str2, true);
        } else {
            try {
                PackageManager packageManager = this.f10364a.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.f10364a.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str2))) {
                        z = applicationInfo.metaData.getBoolean(str2);
                    }
                }
            } catch (NameNotFoundException unused) {
            }
        }
        this.f10366c = new AtomicBoolean(z);
    }
}
