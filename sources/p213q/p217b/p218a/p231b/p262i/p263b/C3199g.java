package p213q.p217b.p218a.p231b.p262i.p263b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.i.b.g */
public final class C3199g implements Creator<C3198f> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i = C1061o.m2561i(parcel, readInt);
            } else if (i4 == 2) {
                i2 = C1061o.m2561i(parcel, readInt);
            } else if (i4 != 3) {
                C1061o.m2564l(parcel, readInt);
            } else {
                i3 = C1061o.m2561i(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C3198f(i, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3198f[i];
    }
}
