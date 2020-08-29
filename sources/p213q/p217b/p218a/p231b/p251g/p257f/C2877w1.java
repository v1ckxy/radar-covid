package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.g.f.w1 */
public final class C2877w1 implements Creator<C2881x1> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        String str = null;
        boolean z = false;
        C2802d2 d2Var = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = C1061o.m2548d(parcel, readInt);
            } else if (i == 2) {
                d2Var = (C2802d2) C1061o.m2458a(parcel, readInt, C2802d2.CREATOR);
            } else if (i != 3) {
                C1061o.m2564l(parcel, readInt);
            } else {
                z = C1061o.m2559g(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C2881x1(str, d2Var, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2881x1[i];
    }
}
