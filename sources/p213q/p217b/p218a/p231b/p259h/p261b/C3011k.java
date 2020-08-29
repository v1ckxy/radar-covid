package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.h.b.k */
public final class C3011k {

    /* renamed from: a */
    public final String f7466a;

    /* renamed from: b */
    public final String f7467b;

    /* renamed from: c */
    public final String f7468c;

    /* renamed from: d */
    public final long f7469d;

    /* renamed from: e */
    public final long f7470e;

    /* renamed from: f */
    public final C3036m f7471f;

    public C3011k(C2969g5 g5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C3036m mVar;
        C1061o.m2528b(str2);
        C1061o.m2528b(str3);
        this.f7466a = str2;
        this.f7467b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f7468c = str;
        this.f7469d = j;
        this.f7470e = j2;
        if (j2 != 0 && j2 > j) {
            g5Var.mo8285i().f7156i.mo8433a("Event created with reverse previous/current timestamps. appId", C2908b4.m6745a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            mVar = new C3036m(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    g5Var.mo8285i().f7153f.mo8432a("Param name can't be null");
                } else {
                    Object a = g5Var.mo8473p().mo8781a(str4, bundle2.get(str4));
                    if (a == null) {
                        g5Var.mo8285i().f7156i.mo8433a("Param value can't be null", g5Var.mo8474q().mo8837b(str4));
                    } else {
                        g5Var.mo8473p().mo8786a(bundle2, str4, a);
                    }
                }
                it.remove();
            }
            mVar = new C3036m(bundle2);
        }
        this.f7471f = mVar;
    }

    /* renamed from: a */
    public final C3011k mo8549a(C2969g5 g5Var, long j) {
        C3011k kVar = new C3011k(g5Var, this.f7468c, this.f7466a, this.f7467b, this.f7469d, j, this.f7471f);
        return kVar;
    }

    public final String toString() {
        String str = this.f7466a;
        String str2 = this.f7467b;
        String valueOf = String.valueOf(this.f7471f);
        StringBuilder sb = new StringBuilder(valueOf.length() + C1965a.m4743a(str2, C1965a.m4743a(str, 33)));
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public C3011k(C2969g5 g5Var, String str, String str2, String str3, long j, long j2, C3036m mVar) {
        C1061o.m2528b(str2);
        C1061o.m2528b(str3);
        C1061o.m2524b(mVar);
        this.f7466a = str2;
        this.f7467b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f7468c = str;
        this.f7469d = j;
        this.f7470e = j2;
        if (j2 != 0 && j2 > j) {
            g5Var.mo8285i().f7156i.mo8434a("Event created with reverse previous/current timestamps. appId, name", C2908b4.m6745a(str2), C2908b4.m6745a(str3));
        }
        this.f7471f = mVar;
    }
}
