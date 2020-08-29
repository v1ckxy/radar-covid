package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.y4 */
public final class C3173y4 {

    /* renamed from: a */
    public final C3162x4 f7979a;

    public C3173y4(C3162x4 x4Var) {
        C1061o.m2524b(x4Var);
        this.f7979a = x4Var;
    }

    /* renamed from: a */
    public static boolean m7486a(Context context) {
        C1061o.m2524b(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }
}
