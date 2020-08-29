package p213q.p217b.p218a.p231b.p239d;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;

/* renamed from: q.b.a.b.d.h */
public final class C2128h extends C2129i {
    /* renamed from: d */
    public static Resources m4921d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException unused) {
            return null;
        }
    }
}
