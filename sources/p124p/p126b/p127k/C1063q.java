package p124p.p126b.p127k;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* renamed from: p.b.k.q */
public class C1063q {

    /* renamed from: d */
    public static C1063q f2804d;

    /* renamed from: a */
    public final Context f2805a;

    /* renamed from: b */
    public final LocationManager f2806b;

    /* renamed from: c */
    public final C1064a f2807c = new C1064a();

    /* renamed from: p.b.k.q$a */
    public static class C1064a {

        /* renamed from: a */
        public boolean f2808a;

        /* renamed from: b */
        public long f2809b;
    }

    public C1063q(Context context, LocationManager locationManager) {
        this.f2805a = context;
        this.f2806b = locationManager;
    }

    /* renamed from: a */
    public final Location mo4535a(String str) {
        try {
            if (this.f2806b.isProviderEnabled(str)) {
                return this.f2806b.getLastKnownLocation(str);
            }
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }
}
