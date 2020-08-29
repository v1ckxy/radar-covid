package p213q.p217b.p218a.p231b.p239d.p242n;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2115b;

/* renamed from: q.b.a.b.d.n.x */
public final class C2272x implements Creator<C2273y> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        IBinder iBinder = null;
        C2115b bVar = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = C1061o.m2561i(parcel, readInt);
            } else if (i2 == 2) {
                iBinder = C1061o.m2560h(parcel, readInt);
            } else if (i2 == 3) {
                bVar = (C2115b) C1061o.m2458a(parcel, readInt, C2115b.CREATOR);
            } else if (i2 == 4) {
                z = C1061o.m2559g(parcel, readInt);
            } else if (i2 != 5) {
                C1061o.m2564l(parcel, readInt);
            } else {
                z2 = C1061o.m2559g(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        C2273y yVar = new C2273y(i, iBinder, bVar, z, z2);
        return yVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2273y[i];
    }
}
