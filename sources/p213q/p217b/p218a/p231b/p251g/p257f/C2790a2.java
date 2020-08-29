package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.g.f.a2 */
public final class C2790a2 implements Creator<C2794b2> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                C1061o.m2564l(parcel, readInt);
            } else {
                i = C1061o.m2561i(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C2794b2(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2794b2[i];
    }
}
