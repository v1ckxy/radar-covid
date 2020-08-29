package p213q.p217b.p218a.p231b.p239d;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.d.s */
public final class C2295s implements Creator<C2115b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = C1061o.m2561i(parcel, readInt);
            } else if (i3 == 2) {
                i2 = C1061o.m2561i(parcel, readInt);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) C1061o.m2458a(parcel, readInt, PendingIntent.CREATOR);
            } else if (i3 != 4) {
                C1061o.m2564l(parcel, readInt);
            } else {
                str = C1061o.m2548d(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C2115b(i, i2, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2115b[i];
    }
}
