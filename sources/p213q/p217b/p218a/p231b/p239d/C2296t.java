package p213q.p217b.p218a.p231b.p239d;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.d.t */
public final class C2296t implements Creator<C2119d> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = C1061o.m2548d(parcel, readInt);
            } else if (i2 == 2) {
                i = C1061o.m2561i(parcel, readInt);
            } else if (i2 != 3) {
                C1061o.m2564l(parcel, readInt);
            } else {
                j = C1061o.m2562j(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C2119d(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2119d[i];
    }
}
