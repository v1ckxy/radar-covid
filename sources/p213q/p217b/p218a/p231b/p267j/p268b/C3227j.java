package p213q.p217b.p218a.p231b.p267j.p268b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.j.b.j */
public final class C3227j implements Creator<C3225h> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                arrayList = C1061o.m2554e(parcel, readInt);
            } else if (i != 2) {
                C1061o.m2564l(parcel, readInt);
            } else {
                str = C1061o.m2548d(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C3225h(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3225h[i];
    }
}
