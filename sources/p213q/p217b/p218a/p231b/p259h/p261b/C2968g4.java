package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.h.b.g4 */
public final class C2968g4 {

    /* renamed from: a */
    public String f7321a;

    /* renamed from: b */
    public String f7322b;

    /* renamed from: c */
    public long f7323c;

    /* renamed from: d */
    public Bundle f7324d;

    public C2968g4(String str, String str2, Bundle bundle, long j) {
        this.f7321a = str;
        this.f7322b = str2;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f7324d = bundle;
        this.f7323c = j;
    }

    /* renamed from: a */
    public static C2968g4 m6912a(C3047n nVar) {
        C2968g4 g4Var = new C2968g4(nVar.f7582e, nVar.f7584g, nVar.f7583f.mo8637b(), nVar.f7585h);
        return g4Var;
    }

    /* renamed from: a */
    public final C3047n mo8461a() {
        C3047n nVar = new C3047n(this.f7321a, new C3036m(new Bundle(this.f7324d)), this.f7322b, this.f7323c);
        return nVar;
    }

    public final String toString() {
        String str = this.f7322b;
        String str2 = this.f7321a;
        String valueOf = String.valueOf(this.f7324d);
        StringBuilder sb = new StringBuilder(valueOf.length() + C1965a.m4743a(str2, C1965a.m4743a(str, 21)));
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return C1965a.m4754a(sb, ",params=", valueOf);
    }
}
