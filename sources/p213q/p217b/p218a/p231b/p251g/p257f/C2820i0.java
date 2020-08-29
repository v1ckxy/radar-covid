package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p262i.p264c.C3200a;

/* renamed from: q.b.a.b.g.f.i0 */
public final class C2820i0 implements Creator<C2804e0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        List list = null;
        IBinder iBinder = null;
        List list2 = null;
        C3200a aVar = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                list = C1061o.m2539c(parcel, readInt, TemporaryExposureKey.CREATOR);
            } else if (i == 2) {
                iBinder = C1061o.m2560h(parcel, readInt);
            } else if (i == 3) {
                list2 = C1061o.m2539c(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (i == 4) {
                aVar = (C3200a) C1061o.m2458a(parcel, readInt, C3200a.CREATOR);
            } else if (i != 5) {
                C1061o.m2564l(parcel, readInt);
            } else {
                str = C1061o.m2548d(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        C2804e0 e0Var = new C2804e0(list, iBinder, list2, aVar, str);
        return e0Var;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2804e0[i];
    }
}
