package p213q.p217b.p218a.p231b.p262i.p263b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.i.b.e */
public final class C3197e implements Creator<C3195c> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                j = C1061o.m2562j(parcel, readInt);
            } else if (i2 == 2) {
                i = C1061o.m2561i(parcel, readInt);
            } else if (i2 == 3) {
                j2 = C1061o.m2562j(parcel, readInt);
            } else if (i2 != 4) {
                C1061o.m2564l(parcel, readInt);
            } else {
                j3 = C1061o.m2562j(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        C3195c cVar = new C3195c(j, i, j2, j3);
        return cVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3195c[i];
    }
}
