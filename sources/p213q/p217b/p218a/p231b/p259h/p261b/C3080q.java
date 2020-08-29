package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.q */
public final class C3080q implements Creator<C3047n> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        String str = null;
        C3036m mVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = C1061o.m2548d(parcel, readInt);
            } else if (i == 3) {
                mVar = (C3036m) C1061o.m2458a(parcel, readInt, C3036m.CREATOR);
            } else if (i == 4) {
                str2 = C1061o.m2548d(parcel, readInt);
            } else if (i != 5) {
                C1061o.m2564l(parcel, readInt);
            } else {
                j = C1061o.m2562j(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        C3047n nVar = new C3047n(str, mVar, str2, j);
        return nVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3047n[i];
    }
}
