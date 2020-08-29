package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.o */
public final class C3058o implements Creator<C3036m> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                C1061o.m2564l(parcel, readInt);
            } else {
                bundle = C1061o.m2457a(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C3036m(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3036m[i];
    }
}
