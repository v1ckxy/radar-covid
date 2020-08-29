package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.g.f.h */
public final class C2815h implements Creator<C2803e> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                iBinder = C1061o.m2560h(parcel, readInt);
            } else if (i == 2) {
                iBinder2 = C1061o.m2560h(parcel, readInt);
            } else if (i != 3) {
                C1061o.m2564l(parcel, readInt);
            } else {
                str = C1061o.m2548d(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C2803e(iBinder, iBinder2, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2803e[i];
    }
}
