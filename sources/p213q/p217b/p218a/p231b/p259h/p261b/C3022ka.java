package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2287f;
import p213q.p217b.p218a.p231b.p239d.p248r.C2294b;
import p213q.p217b.p218a.p231b.p251g.p256e.C2405da;
import p213q.p217b.p218a.p231b.p251g.p256e.C2657rc;
import p213q.p217b.p218a.p231b.p251g.p256e.C2706uc;

/* renamed from: q.b.a.b.h.b.ka */
public final class C3022ka extends C2898a6 {

    /* renamed from: b */
    public Boolean f7500b;

    /* renamed from: c */
    public C2903b f7501c = C2915c.f7171a;

    /* renamed from: d */
    public Boolean f7502d;

    public C3022ka(C2969g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: u */
    public static long m7048u() {
        return ((Long) C3069p.f7672D.mo8702a(null)).longValue();
    }

    /* renamed from: a */
    public final int mo8571a(String str) {
        return Math.max(Math.min(mo8576b(str, C3069p.f7682I), 100), 25);
    }

    /* renamed from: a */
    public final boolean mo8574a(C3095r3<Boolean> r3Var) {
        return mo8578c(null, r3Var);
    }

    /* renamed from: b */
    public final int mo8575b(String str) {
        if (!C2405da.m5643b() || !mo8578c(null, C3069p.f7687K0)) {
            return 500;
        }
        return Math.max(Math.min(mo8576b(str, C3069p.f7680H), RecyclerView.MAX_SCROLL_DURATION), 500);
    }

    /* renamed from: c */
    public final int mo8577c(String str) {
        return mo8576b(str, C3069p.f7740o);
    }

    /* renamed from: c */
    public final boolean mo8578c(String str, C3095r3<Boolean> r3Var) {
        Object a;
        if (str != null) {
            String a2 = this.f7501c.mo8263a(str, r3Var.f7811a);
            if (!TextUtils.isEmpty(a2)) {
                a = r3Var.mo8702a(Boolean.valueOf(Boolean.parseBoolean(a2)));
                return ((Boolean) a).booleanValue();
            }
        }
        a = r3Var.mo8702a(null);
        return ((Boolean) a).booleanValue();
    }

    /* renamed from: d */
    public final Boolean mo8579d(String str) {
        C1061o.m2528b(str);
        Bundle t = mo8589t();
        if (t == null) {
            mo8285i().f7153f.mo8432a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!t.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(t.getBoolean(str));
        }
    }

    /* renamed from: d */
    public final boolean mo8580d(String str, C3095r3<Boolean> r3Var) {
        return mo8578c(str, r3Var);
    }

    /* renamed from: e */
    public final boolean mo8581e(String str) {
        return "1".equals(this.f7501c.mo8263a(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: m */
    public final int mo8582m() {
        if (!C2405da.m5643b() || !this.f7133a.f7338g.mo8578c(null, C3069p.f7689L0) || mo8287k().mo8815u() < 201500) {
            return 25;
        }
        return 100;
    }

    /* renamed from: n */
    public final long mo8583n() {
        C3010ja jaVar = this.f7133a.f7337f;
        return 31000;
    }

    /* renamed from: o */
    public final boolean mo8584o() {
        if (this.f7502d == null) {
            synchronized (this) {
                if (this.f7502d == null) {
                    ApplicationInfo applicationInfo = this.f7133a.f7332a.getApplicationInfo();
                    String a = C2287f.m5354a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f7502d = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.f7502d == null) {
                        this.f7502d = Boolean.TRUE;
                        mo8285i().f7153f.mo8432a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f7502d.booleanValue();
    }

    /* renamed from: p */
    public final boolean mo8585p() {
        C3010ja jaVar = this.f7133a.f7337f;
        Boolean d = mo8579d("firebase_analytics_collection_deactivated");
        return d != null && d.booleanValue();
    }

    /* renamed from: q */
    public final Boolean mo8586q() {
        mo8277a();
        Boolean d = mo8579d("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(d == null || d.booleanValue());
    }

    /* renamed from: r */
    public final Boolean mo8587r() {
        mo8277a();
        boolean z = true;
        if (!((C2706uc) C2657rc.f6852f.mo7405a()).mo8039a() || !mo8574a(C3069p.f7671C0)) {
            return Boolean.valueOf(true);
        }
        Boolean d = mo8579d("google_analytics_automatic_screen_reporting_enabled");
        if (d != null && !d.booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: s */
    public final boolean mo8588s() {
        if (this.f7500b == null) {
            Boolean d = mo8579d("app_measurement_lite");
            this.f7500b = d;
            if (d == null) {
                this.f7500b = Boolean.valueOf(false);
            }
        }
        return this.f7500b.booleanValue() || !this.f7133a.f7336e;
    }

    /* renamed from: t */
    public final Bundle mo8589t() {
        try {
            if (this.f7133a.f7332a.getPackageManager() == null) {
                mo8285i().f7153f.mo8432a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = C2294b.m5363b(this.f7133a.f7332a).mo7308a(this.f7133a.f7332a.getPackageName(), 128);
            if (a != null) {
                return a.metaData;
            }
            mo8285i().f7153f.mo8432a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (NameNotFoundException e) {
            mo8285i().f7153f.mo8433a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: a */
    public final long mo8572a(String str, C3095r3<Long> r3Var) {
        if (str != null) {
            String a = this.f7501c.mo8263a(str, r3Var.f7811a);
            if (!TextUtils.isEmpty(a)) {
                try {
                    return ((Long) r3Var.mo8702a(Long.valueOf(Long.parseLong(a)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) r3Var.mo8702a(null)).longValue();
    }

    /* renamed from: b */
    public final int mo8576b(String str, C3095r3<Integer> r3Var) {
        if (str != null) {
            String a = this.f7501c.mo8263a(str, r3Var.f7811a);
            if (!TextUtils.isEmpty(a)) {
                try {
                    return ((Integer) r3Var.mo8702a(Integer.valueOf(Integer.parseInt(a)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) r3Var.mo8702a(null)).intValue();
    }

    /* renamed from: a */
    public final String mo8573a(String str, String str2) {
        String str3;
        C2944e4 e4Var;
        Class<String> cls = String.class;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke(null, new Object[]{str, str2});
        } catch (ClassNotFoundException e) {
            e = e;
            e4Var = mo8285i().f7153f;
            str3 = "Could not find SystemProperties class";
            e4Var.mo8433a(str3, e);
            return str2;
        } catch (NoSuchMethodException e2) {
            e = e2;
            e4Var = mo8285i().f7153f;
            str3 = "Could not find SystemProperties.get() method";
            e4Var.mo8433a(str3, e);
            return str2;
        } catch (IllegalAccessException e3) {
            e = e3;
            e4Var = mo8285i().f7153f;
            str3 = "Could not access SystemProperties.get()";
            e4Var.mo8433a(str3, e);
            return str2;
        } catch (InvocationTargetException e4) {
            e = e4;
            e4Var = mo8285i().f7153f;
            str3 = "SystemProperties.get() threw an exception";
            e4Var.mo8433a(str3, e);
            return str2;
        }
    }
}
