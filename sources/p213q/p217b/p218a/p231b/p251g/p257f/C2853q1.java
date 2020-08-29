package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p262i.p263b.C3198f;

/* renamed from: q.b.a.b.g.f.q1 */
public final class C2853q1 implements Creator<C2857r1> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        String str = null;
        int i = 0;
        C3198f fVar = null;
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
                fVar = (C3198f) C1061o.m2458a(parcel, readInt, C3198f.CREATOR);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C2857r1(str, i, fVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2857r1[i];
    }
}
