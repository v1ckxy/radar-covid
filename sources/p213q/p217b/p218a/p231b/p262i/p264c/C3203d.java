package p213q.p217b.p218a.p231b.p262i.p264c;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.i.c.d */
public final class C3203d implements Creator<ExposureSummary> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int[] iArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i5 = 65535 & readInt;
            if (i5 == 1) {
                i = C1061o.m2561i(parcel, readInt);
            } else if (i5 == 2) {
                i2 = C1061o.m2561i(parcel, readInt);
            } else if (i5 == 3) {
                i3 = C1061o.m2561i(parcel, readInt);
            } else if (i5 == 4) {
                iArr = C1061o.m2547c(parcel, readInt);
            } else if (i5 != 5) {
                C1061o.m2564l(parcel, readInt);
            } else {
                i4 = C1061o.m2561i(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        ExposureSummary exposureSummary = new ExposureSummary(i, i2, i3, iArr, i4);
        return exposureSummary;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExposureSummary[i];
    }
}
