package p213q.p217b.p317d;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.C2254m;
import p213q.p217b.p218a.p231b.p239d.p242n.C2256n;
import p213q.p217b.p218a.p231b.p239d.p246q.C2288g;

/* renamed from: q.b.d.e */
public final class C3866e {

    /* renamed from: a */
    public final String f9471a;

    /* renamed from: b */
    public final String f9472b;

    /* renamed from: c */
    public final String f9473c;

    /* renamed from: d */
    public final String f9474d;

    /* renamed from: e */
    public final String f9475e;

    /* renamed from: f */
    public final String f9476f;

    /* renamed from: g */
    public final String f9477g;

    public C3866e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C1061o.m2534b(!C2288g.m5355a(str), (Object) "ApplicationId must be set.");
        this.f9472b = str;
        this.f9471a = str2;
        this.f9473c = str3;
        this.f9474d = str4;
        this.f9475e = str5;
        this.f9476f = str6;
        this.f9477g = str7;
    }

    /* renamed from: a */
    public static C3866e m9242a(Context context) {
        C2256n nVar = new C2256n(context);
        String a = nVar.mo7285a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        C3866e eVar = new C3866e(a, nVar.mo7285a("google_api_key"), nVar.mo7285a("firebase_database_url"), nVar.mo7285a("ga_trackingId"), nVar.mo7285a("gcm_defaultSenderId"), nVar.mo7285a("google_storage_bucket"), nVar.mo7285a("project_id"));
        return eVar;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C3866e)) {
            return false;
        }
        C3866e eVar = (C3866e) obj;
        if (C1061o.m2546c((Object) this.f9472b, (Object) eVar.f9472b) && C1061o.m2546c((Object) this.f9471a, (Object) eVar.f9471a) && C1061o.m2546c((Object) this.f9473c, (Object) eVar.f9473c) && C1061o.m2546c((Object) this.f9474d, (Object) eVar.f9474d) && C1061o.m2546c((Object) this.f9475e, (Object) eVar.f9475e) && C1061o.m2546c((Object) this.f9476f, (Object) eVar.f9476f) && C1061o.m2546c((Object) this.f9477g, (Object) eVar.f9477g)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9472b, this.f9471a, this.f9473c, this.f9474d, this.f9475e, this.f9476f, this.f9477g});
    }

    public String toString() {
        C2254m d = C1061o.m2550d((Object) this);
        d.mo7283a("applicationId", this.f9472b);
        d.mo7283a("apiKey", this.f9471a);
        d.mo7283a("databaseUrl", this.f9473c);
        d.mo7283a("gcmSenderId", this.f9475e);
        d.mo7283a("storageBucket", this.f9476f);
        d.mo7283a("projectId", this.f9477g);
        return d.toString();
    }
}
