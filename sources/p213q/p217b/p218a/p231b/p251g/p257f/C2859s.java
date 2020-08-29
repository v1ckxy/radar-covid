package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;

/* renamed from: q.b.a.b.g.f.s */
public abstract class C2859s extends C2787a implements C2847p {
    public C2859s() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryCallback");
    }

    /* renamed from: a */
    public final boolean mo8133a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo8146a((Status) C2860s0.m6662a(parcel, Status.CREATOR), (ExposureSummary) C2860s0.m6662a(parcel, ExposureSummary.CREATOR));
        return true;
    }
}
