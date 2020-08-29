package p213q.p217b.p218a.p231b.p239d.p240m;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.d.m.l */
public final class C2210l implements Creator<Scope> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = C1061o.m2561i(parcel, readInt);
            } else if (i2 != 2) {
                C1061o.m2564l(parcel, readInt);
            } else {
                str = C1061o.m2548d(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new Scope(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
