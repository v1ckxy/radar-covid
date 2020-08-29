package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p262i.p264c.C3200a;

/* renamed from: q.b.a.b.g.f.l0 */
public final class C2832l0 implements Creator<C2816h0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        IBinder iBinder = null;
        C3200a aVar = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 3) {
                iBinder = C1061o.m2560h(parcel, readInt);
            } else if (i != 4) {
                C1061o.m2564l(parcel, readInt);
            } else {
                aVar = (C3200a) C1061o.m2458a(parcel, readInt, C3200a.CREATOR);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C2816h0(iBinder, aVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2816h0[i];
    }
}
