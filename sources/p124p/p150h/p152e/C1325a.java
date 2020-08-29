package p124p.p150h.p152e;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import java.io.File;

/* renamed from: p.h.e.a */
public class C1325a {

    /* renamed from: a */
    public static final Object f4014a = new Object();

    /* renamed from: a */
    public static int m3373a(Context context, int i) {
        return context.getColor(i);
    }

    /* renamed from: a */
    public static int m3374a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: a */
    public static File m3375a(Context context) {
        return context.getNoBackupFilesDir();
    }

    /* renamed from: a */
    public static boolean m3376a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    /* renamed from: b */
    public static Drawable m3377b(Context context, int i) {
        return context.getDrawable(i);
    }

    /* renamed from: b */
    public static boolean m3378b(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }
}
