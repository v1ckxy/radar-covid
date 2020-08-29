package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey;

/* renamed from: q.b.a.b.g.f.z */
public abstract class C2885z extends C2787a implements C2788a0 {
    public C2885z() {
        super("com.google.android.gms.nearby.exposurenotification.internal.ITemporaryExposureKeyListCallback");
    }

    /* renamed from: a */
    public final boolean mo8133a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo8136a((Status) C2860s0.m6662a(parcel, Status.CREATOR), parcel.createTypedArrayList(TemporaryExposureKey.CREATOR));
        return true;
    }
}
