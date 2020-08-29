package p213q.p217b.p218a.p231b.p259h.p261b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: q.b.a.b.h.b.e7 */
public final class C2947e7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3018k6 f7284e;

    public C2947e7(C3018k6 k6Var) {
        this.f7284e = k6Var;
    }

    public final void run() {
        C2914ba baVar = this.f7284e.f7490h;
        baVar.f7170a.mo8283g().mo8279c();
        if (baVar.mo8320b()) {
            String str = "_cc";
            if (baVar.mo8319a()) {
                baVar.f7170a.mo8470m().f7617A.mo8750a(null);
                Bundle bundle = new Bundle();
                String str2 = "(not set)";
                bundle.putString("source", str2);
                bundle.putString("medium", str2);
                bundle.putString("_cis", "intent");
                bundle.putLong(str, 1);
                baVar.f7170a.mo8472o().mo8561a("auto", "_cmpx", bundle);
            } else {
                String a = baVar.f7170a.mo8470m().f7617A.mo8749a();
                if (TextUtils.isEmpty(a)) {
                    baVar.f7170a.mo8285i().f7154g.mo8432a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((baVar.f7170a.mo8470m().f7618B.mo8708a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str3 : parse.getQueryParameterNames()) {
                        bundle2.putString(str3, parse.getQueryParameter(str3));
                    }
                    ((Bundle) pair.second).putLong(str, a2);
                    baVar.f7170a.mo8472o().mo8561a((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                baVar.f7170a.mo8470m().f7617A.mo8750a(null);
            }
            baVar.f7170a.mo8470m().f7618B.mo8709a(0);
        }
    }
}
