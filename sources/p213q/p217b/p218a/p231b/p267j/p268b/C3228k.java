package p213q.p217b.p218a.p231b.p267j.p268b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.C2271w;

/* renamed from: q.b.a.b.j.b.k */
public final class C3228k implements Creator<C3229l> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        int i = 0;
        C2271w wVar = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = C1061o.m2561i(parcel, readInt);
            } else if (i2 != 2) {
                C1061o.m2564l(parcel, readInt);
            } else {
                wVar = (C2271w) C1061o.m2458a(parcel, readInt, C2271w.CREATOR);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C3229l(i, wVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3229l[i];
    }
}
