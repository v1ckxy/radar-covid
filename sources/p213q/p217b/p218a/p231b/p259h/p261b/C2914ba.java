package p213q.p217b.p218a.p231b.p259h.p261b;

import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;

/* renamed from: q.b.a.b.h.b.ba */
public final class C2914ba {

    /* renamed from: a */
    public final C2969g5 f7170a;

    public C2914ba(C2969g5 g5Var) {
        this.f7170a = g5Var;
    }

    /* renamed from: a */
    public final void mo8318a(String str, Bundle bundle) {
        String str2;
        this.f7170a.mo8283g().mo8279c();
        if (!this.f7170a.mo8464b()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Builder builder = new Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f7170a.mo8470m().f7617A.mo8750a(str2);
                C3107s4 s4Var = this.f7170a.mo8470m().f7618B;
                if (((C2284c) this.f7170a.f7345n) != null) {
                    s4Var.mo8709a(System.currentTimeMillis());
                    return;
                }
                throw null;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo8320b() {
        return this.f7170a.mo8470m().f7618B.mo8708a() > 0;
    }

    /* renamed from: a */
    public final boolean mo8319a() {
        if (!mo8320b()) {
            return false;
        }
        if (((C2284c) this.f7170a.f7345n) == null) {
            throw null;
        } else if (System.currentTimeMillis() - this.f7170a.mo8470m().f7618B.mo8708a() > this.f7170a.f7338g.mo8572a((String) null, C3069p.f7703S0)) {
            return true;
        } else {
            return false;
        }
    }
}
