package p213q.p217b.p218a.p231b.p267j.p268b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.j.b.b */
public final class C3219b implements Creator<C3220c> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = C1061o.m2561i(parcel, readInt);
            } else if (i3 == 2) {
                i2 = C1061o.m2561i(parcel, readInt);
            } else if (i3 != 3) {
                C1061o.m2564l(parcel, readInt);
            } else {
                intent = (Intent) C1061o.m2458a(parcel, readInt, Intent.CREATOR);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C3220c(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3220c[i];
    }
}
