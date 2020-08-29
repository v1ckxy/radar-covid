package p213q.p217b.p218a.p231b.p251g.p256e;

import android.util.Log;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.g.e.g2 */
public final class C2449g2 extends C2758y1<Double> {
    public C2449g2(C2486i2 i2Var, String str, Double d, boolean z) {
        super(i2Var, str, d, z, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo7495a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String a = super.mo8111a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + C1965a.m4743a(a, 27));
        sb.append("Invalid double value for ");
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
