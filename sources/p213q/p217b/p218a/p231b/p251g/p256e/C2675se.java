package p213q.p217b.p218a.p231b.p251g.p256e;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: q.b.a.b.g.e.se */
public abstract class C2675se extends C2677t0 implements C2626pe {
    public C2675se() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: a */
    public final boolean mo7410a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo7874a((Bundle) C2724w.m6504a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
