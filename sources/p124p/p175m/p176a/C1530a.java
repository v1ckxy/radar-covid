package p124p.p175m.p176a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* renamed from: p.m.a.a */
public abstract class C1530a extends BroadcastReceiver {

    /* renamed from: a */
    public static final SparseArray<WakeLock> f4543a = new SparseArray<>();

    /* renamed from: b */
    public static int f4544b = 1;

    /* renamed from: a */
    public static boolean m3911a(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f4543a) {
            WakeLock wakeLock = (WakeLock) f4543a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f4543a.remove(intExtra);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No active wake lock id #");
            sb.append(intExtra);
            Log.w("WakefulBroadcastReceiv.", sb.toString());
            return true;
        }
    }

    /* renamed from: b */
    public static ComponentName m3912b(Context context, Intent intent) {
        synchronized (f4543a) {
            int i = f4544b;
            int i2 = f4544b + 1;
            f4544b = i2;
            if (i2 <= 0) {
                f4544b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append("androidx.core:wake:");
            sb.append(startService.flattenToShortString());
            WakeLock newWakeLock = powerManager.newWakeLock(1, sb.toString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f4543a.put(i, newWakeLock);
            return startService;
        }
    }
}
