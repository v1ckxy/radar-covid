package p213q.p217b.p218a.p231b.p251g.p256e;

import android.util.Log;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.e.e2 */
public final class C2414e2 extends C2758y1<Long> {
    public C2414e2(C2486i2 i2Var, String str, Long l, boolean z) {
        super(i2Var, str, l, z, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo7495a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String a = super.mo8111a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + C1965a.m4743a(a, 25));
        sb.append("Invalid long value for ");
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
