package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p262i.p263b.C3195c;

/* renamed from: q.b.a.b.g.f.y1 */
public final class C2884y1 implements Creator<C2887z1> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        String str = null;
        C3195c cVar = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = C1061o.m2548d(parcel, readInt);
            } else if (i != 2) {
                C1061o.m2564l(parcel, readInt);
            } else {
                cVar = (C3195c) C1061o.m2458a(parcel, readInt, C3195c.CREATOR);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C2887z1(str, cVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2887z1[i];
    }
}
