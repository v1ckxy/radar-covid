package p213q.p217b.p218a.p231b.p239d.p240m;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.d.m.m */
public final class C2211m implements Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = C1061o.m2561i(parcel, readInt);
            } else if (i3 == 2) {
                str = C1061o.m2548d(parcel, readInt);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) C1061o.m2458a(parcel, readInt, PendingIntent.CREATOR);
            } else if (i3 != 1000) {
                C1061o.m2564l(parcel, readInt);
            } else {
                i = C1061o.m2561i(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
