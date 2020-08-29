package p213q.p217b.p218a.p231b.p262i.p264c;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.i.c.e */
public final class C3204e implements Creator<TemporaryExposureKey> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        int i = 0;
        int i2 = 0;
        byte[] bArr = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                bArr = C1061o.m2536b(parcel, readInt);
            } else if (i4 == 2) {
                i = C1061o.m2561i(parcel, readInt);
            } else if (i4 == 3) {
                i3 = C1061o.m2561i(parcel, readInt);
            } else if (i4 != 4) {
                C1061o.m2564l(parcel, readInt);
            } else {
                i2 = C1061o.m2561i(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new TemporaryExposureKey(bArr, i, i3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TemporaryExposureKey[i];
    }
}
