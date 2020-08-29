package p124p.p199y.p200x.p210t;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import java.util.HashMap;
import java.util.WeakHashMap;
import p124p.p199y.C1800l;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.y.x.t.l */
public class C1942l {

    /* renamed from: a */
    public static final String f5586a = C1800l.m4459a("WakeLocks");

    /* renamed from: b */
    public static final WeakHashMap<WakeLock, String> f5587b = new WeakHashMap<>();

    /* renamed from: a */
    public static WakeLock m4709a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String a = C1965a.m4751a("WorkManager: ", str);
        WakeLock newWakeLock = powerManager.newWakeLock(1, a);
        synchronized (f5587b) {
            f5587b.put(newWakeLock, a);
        }
        return newWakeLock;
    }

    /* renamed from: a */
    public static void m4710a() {
        HashMap hashMap = new HashMap();
        synchronized (f5587b) {
            hashMap.putAll(f5587b);
        }
        for (WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                C1800l.m4460a().mo6785d(f5586a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
    }
}
