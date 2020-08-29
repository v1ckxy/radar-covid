package p213q.p217b.p218a.p231b.p267j.p268b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2115b;
import p213q.p217b.p218a.p231b.p239d.p242n.C2273y;

/* renamed from: q.b.a.b.j.b.m */
public final class C3230m implements Creator<C3231n> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        C2115b bVar = null;
        int i = 0;
        C2273y yVar = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = C1061o.m2561i(parcel, readInt);
            } else if (i2 == 2) {
                bVar = (C2115b) C1061o.m2458a(parcel, readInt, C2115b.CREATOR);
            } else if (i2 != 3) {
                C1061o.m2564l(parcel, readInt);
            } else {
                yVar = (C2273y) C1061o.m2458a(parcel, readInt, C2273y.CREATOR);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C3231n(i, bVar, yVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3231n[i];
    }
}
