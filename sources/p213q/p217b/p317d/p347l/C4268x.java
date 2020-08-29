package p213q.p217b.p317d.p347l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;
import p116io.jsonwebtoken.lang.Strings;

/* renamed from: q.b.d.l.x */
public final class C4268x {

    /* renamed from: e */
    public static C4268x f10266e;
    @GuardedBy("this")

    /* renamed from: a */
    public String f10267a = null;

    /* renamed from: b */
    public Boolean f10268b = null;

    /* renamed from: c */
    public Boolean f10269c = null;

    /* renamed from: d */
    public final Queue<Intent> f10270d = new ArrayDeque();

    /* renamed from: a */
    public static synchronized C4268x m9759a() {
        C4268x xVar;
        synchronized (C4268x.class) {
            if (f10266e == null) {
                f10266e = new C4268x();
            }
            xVar = f10266e;
        }
        return xVar;
    }

    /* renamed from: a */
    public final synchronized String mo10465a(Context context, Intent intent) {
        String str;
        if (this.f10267a != null) {
            return this.f10267a;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            if (resolveService.serviceInfo != null) {
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    if (serviceInfo.name != null) {
                        if (serviceInfo.name.startsWith(Strings.CURRENT_PATH)) {
                            String valueOf = String.valueOf(context.getPackageName());
                            String valueOf2 = String.valueOf(serviceInfo.name);
                            str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                        } else {
                            str = serviceInfo.name;
                        }
                        this.f10267a = str;
                        return this.f10267a;
                    }
                }
                String str2 = "FirebaseInstanceId";
                String str3 = serviceInfo.packageName;
                String str4 = serviceInfo.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb.append(str3);
                sb.append(Strings.FOLDER_SEPARATOR);
                sb.append(str4);
                Log.e(str2, sb.toString());
                return null;
            }
        }
        Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* renamed from: a */
    public final boolean mo10466a(Context context) {
        if (this.f10268b == null) {
            this.f10268b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f10268b.booleanValue()) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            }
        }
        return this.f10268b.booleanValue();
    }

    /* renamed from: b */
    public final boolean mo10467b(Context context) {
        if (this.f10269c == null) {
            this.f10269c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f10268b.booleanValue()) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            }
        }
        return this.f10269c.booleanValue();
    }
}
