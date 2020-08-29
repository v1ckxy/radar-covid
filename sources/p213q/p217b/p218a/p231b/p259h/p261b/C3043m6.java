package p213q.p217b.p218a.p231b.p259h.p261b;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.m6 */
public final /* synthetic */ class C3043m6 implements Runnable {

    /* renamed from: e */
    public final C3018k6 f7566e;

    public C3043m6(C3018k6 k6Var) {
        this.f7566e = k6Var;
    }

    public final void run() {
        String str;
        C2944e4 e4Var;
        NetworkInfo networkInfo;
        URL url;
        C3018k6 k6Var = this.f7566e;
        k6Var.mo8279c();
        if (k6Var.mo8288l().f7641x.mo8697a()) {
            k6Var.mo8285i().f7160m.mo8432a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = k6Var.mo8288l().f7642y.mo8708a();
        k6Var.mo8288l().f7642y.mo8709a(a + 1);
        if (a >= 5) {
            k6Var.mo8285i().f7156i.mo8432a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            k6Var.mo8288l().f7641x.mo8696a(true);
            return;
        }
        C2969g5 g5Var = k6Var.f7133a;
        g5Var.mo8283g().mo8279c();
        C2969g5.m6917a((C3185z5) g5Var.mo8468k());
        C3128u3 v = g5Var.mo8479v();
        v.mo8373v();
        String str2 = v.f7882c;
        Pair a2 = g5Var.mo8470m().mo8662a(str2);
        if (!g5Var.f7338g.mo8586q().booleanValue() || ((Boolean) a2.second).booleanValue() || TextUtils.isEmpty((CharSequence) a2.first)) {
            e4Var = g5Var.mo8285i().f7160m;
            str = "ADID unavailable to retrieve Deferred Deep Link. Skipping";
        } else {
            C2983h7 k = g5Var.mo8468k();
            k.mo8846n();
            try {
                networkInfo = ((ConnectivityManager) k.f7133a.f7332a.getSystemService("connectivity")).getActiveNetworkInfo();
            } catch (SecurityException unused) {
                networkInfo = null;
            }
            if (!(networkInfo != null && networkInfo.isConnected())) {
                e4Var = g5Var.mo8285i().f7156i;
                str = "Network is not available for Deferred Deep Link request. Skipping";
            } else {
                C3156w9 p = g5Var.mo8473p();
                g5Var.mo8479v().f7133a.f7338g.mo8583n();
                String str3 = (String) a2.first;
                long a3 = g5Var.mo8470m().f7642y.mo8708a() - 1;
                if (p != null) {
                    try {
                        C1061o.m2528b(str3);
                        C1061o.m2528b(str2);
                        String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(31000), Integer.valueOf(p.mo8815u())}), str3, str2, Long.valueOf(a3)});
                        if (str2.equals(p.f7133a.f7338g.mo8573a("debug.deferred.deeplink", Objects.EMPTY_STRING))) {
                            format = format.concat("&ddl_test=1");
                        }
                        url = new URL(format);
                    } catch (IllegalArgumentException | MalformedURLException e) {
                        p.mo8285i().f7153f.mo8433a("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
                        url = null;
                    }
                    C2983h7 k2 = g5Var.mo8468k();
                    C2957f5 f5Var = new C2957f5(g5Var);
                    k2.mo8279c();
                    k2.mo8846n();
                    C1061o.m2524b(url);
                    C1061o.m2524b(f5Var);
                    k2.mo8283g().mo8844b(new C3007j7(k2, str2, url, f5Var));
                }
                throw null;
            }
        }
        e4Var.mo8432a(str);
    }
}
