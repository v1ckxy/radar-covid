package p213q.p217b.p218a.p231b.p251g.p256e;

import android.util.Log;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.e.d2 */
public final class C2397d2 extends C2758y1<Boolean> {
    public C2397d2(C2486i2 i2Var, String str, Boolean bool, boolean z) {
        super(i2Var, str, bool, z, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo7495a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C2524k1.f6664c.matcher(str).matches()) {
                return Boolean.valueOf(true);
            }
            if (C2524k1.f6665d.matcher(str).matches()) {
                return Boolean.valueOf(false);
            }
        }
        String a = super.mo8111a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + C1965a.m4743a(a, 28));
        sb.append("Invalid boolean value for ");
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
