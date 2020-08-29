package p213q.p217b.p317d.p346k;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: q.b.d.k.d */
public class C4214d {

    /* renamed from: b */
    public static C4214d f10158b;

    /* renamed from: a */
    public final SharedPreferences f10159a;

    public C4214d(Context context) {
        this.f10159a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    /* renamed from: a */
    public static synchronized C4214d m9689a(Context context) {
        C4214d dVar;
        synchronized (C4214d.class) {
            if (f10158b == null) {
                f10158b = new C4214d(context);
            }
            dVar = f10158b;
        }
        return dVar;
    }

    /* renamed from: a */
    public synchronized boolean mo10395a(long j) {
        return mo10396a("fire-global", j);
    }

    /* renamed from: a */
    public synchronized boolean mo10396a(String str, long j) {
        if (!this.f10159a.contains(str)) {
            this.f10159a.edit().putLong(str, j).apply();
            return true;
        } else if (j - this.f10159a.getLong(str, -1) < 86400000) {
            return false;
        } else {
            this.f10159a.edit().putLong(str, j).apply();
            return true;
        }
    }
}
