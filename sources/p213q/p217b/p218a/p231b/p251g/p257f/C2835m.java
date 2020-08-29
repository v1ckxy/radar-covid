package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: q.b.a.b.g.f.m */
public abstract class C2835m extends C2787a implements C2823j {
    public C2835m() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IBooleanCallback");
    }

    /* renamed from: a */
    public final boolean mo8133a(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        if (i != 1) {
            return false;
        }
        Status status = (Status) C2860s0.m6662a(parcel, Status.CREATOR);
        if (parcel.readInt() != 0) {
            z = true;
        }
        mo8139a(status, z);
        return true;
    }
}
