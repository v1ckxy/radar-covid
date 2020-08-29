package p213q.p217b.p317d.p322h.p323e.p326k;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: q.b.d.h.e.k.e */
public class C3938e {

    /* renamed from: a */
    public final Float f9602a;

    /* renamed from: b */
    public final boolean f9603b;

    public C3938e(Float f, boolean z) {
        this.f9603b = z;
        this.f9602a = f;
    }

    /* renamed from: a */
    public static C3938e m9345a(Context context) {
        Float f = null;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            if (intExtra != -1 && (intExtra == 2 || intExtra == 5)) {
                z = true;
            }
            int intExtra2 = registerReceiver.getIntExtra("level", -1);
            int intExtra3 = registerReceiver.getIntExtra("scale", -1);
            if (!(intExtra2 == -1 || intExtra3 == -1)) {
                f = Float.valueOf(((float) intExtra2) / ((float) intExtra3));
            }
        }
        return new C3938e(f, z);
    }

    /* renamed from: a */
    public int mo10128a() {
        if (this.f9603b) {
            Float f = this.f9602a;
            if (f != null) {
                return ((double) f.floatValue()) < 0.99d ? 2 : 3;
            }
        }
        return 1;
    }
}
