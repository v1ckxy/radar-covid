package p213q.p217b.p218a.p231b.p239d.p242n;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2119d;

/* renamed from: q.b.a.b.d.n.a0 */
public final class C2213a0 implements Creator<C2227b0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        Bundle bundle = null;
        int i = 0;
        C2119d[] dVarArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                bundle = C1061o.m2457a(parcel, readInt);
            } else if (i2 == 2) {
                dVarArr = (C2119d[]) C1061o.m2537b(parcel, readInt, C2119d.CREATOR);
            } else if (i2 != 3) {
                C1061o.m2564l(parcel, readInt);
            } else {
                i = C1061o.m2561i(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C2227b0(bundle, dVarArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2227b0[i];
    }
}
