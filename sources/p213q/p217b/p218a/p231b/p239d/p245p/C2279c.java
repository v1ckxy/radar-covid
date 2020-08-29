package p213q.p217b.p218a.p231b.p239d.p245p;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.List;
import p213q.p217b.p218a.p231b.p239d.p246q.C2292j;

/* renamed from: q.b.a.b.d.p.c */
public class C2279c {

    /* renamed from: a */
    public static C2279c f6246a = new C2279c();

    /* renamed from: b */
    public static Boolean f6247b;

    /* renamed from: a */
    public void mo7301a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        int i3 = i;
        List<String> list2 = list;
        if (f6247b == null) {
            f6247b = Boolean.valueOf(false);
        }
        if (f6247b.booleanValue()) {
            String str5 = "WakeLockTracker";
            if (TextUtils.isEmpty(str)) {
                String str6 = "missing wakeLock key. ";
                String valueOf = String.valueOf(str);
                Log.e(str5, valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6));
                return;
            }
            if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
                long currentTimeMillis = System.currentTimeMillis();
                String str7 = "com.google.android.gms";
                List<String> list3 = (list2 == null || list.size() != 1 || !str7.equals(list2.get(0))) ? list2 : null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int a = C2292j.m5358a(context);
                String packageName = context.getPackageName();
                WakeLockEvent wakeLockEvent = r1;
                String str8 = str5;
                WakeLockEvent wakeLockEvent2 = new WakeLockEvent(2, currentTimeMillis, i, str2, i2, list3, str, elapsedRealtime, a, str3, str7.equals(packageName) ? null : packageName, C2292j.m5359b(context), j, str4, false);
                try {
                    context.startService(new Intent().setComponent(C2278b.f6245a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
                } catch (Exception e) {
                    Log.wtf(str8, e);
                }
            }
        }
    }
}
