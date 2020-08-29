package p213q.p217b.p218a.p231b.p239d.p246q;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: q.b.a.b.d.q.j */
public final class C2292j {

    /* renamed from: a */
    public static final IntentFilter f6267a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b */
    public static long f6268b;

    /* renamed from: c */
    public static float f6269c = Float.NaN;

    @TargetApi(20)
    /* renamed from: a */
    public static int m5358a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f6267a);
        int i = 0;
        int i2 = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (powerManager.isInteractive()) {
            i = 2;
        }
        return i | i2;
    }

    /* renamed from: b */
    public static synchronized float m5359b(Context context) {
        synchronized (C2292j.class) {
            if (SystemClock.elapsedRealtime() - f6268b >= 60000 || Float.isNaN(f6269c)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f6267a);
                if (registerReceiver != null) {
                    f6269c = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                f6268b = SystemClock.elapsedRealtime();
                float f = f6269c;
                return f;
            }
            float f2 = f6269c;
            return f2;
        }
    }
}
