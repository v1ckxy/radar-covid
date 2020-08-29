package p213q.p217b.p218a.p231b.p239d.p242n;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;
import p213q.p217b.p218a.p231b.p239d.p248r.C2294b;

/* renamed from: q.b.a.b.d.n.p0 */
public final class C2263p0 {

    /* renamed from: a */
    public static Object f6221a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    public static boolean f6222b;

    /* renamed from: c */
    public static String f6223c;

    /* renamed from: d */
    public static int f6224d;

    /* renamed from: a */
    public static void m5118a(Context context) {
        synchronized (f6221a) {
            if (!f6222b) {
                f6222b = true;
                try {
                    Bundle bundle = C2294b.m5363b(context).mo7308a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f6223c = bundle.getString("com.google.app.id");
                        f6224d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
