package p213q.p217b.p218a.p231b.p262i.p265d.p266b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.i.d.b.g */
public final class C3212g implements Creator<C3213h> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        int i = 0;
        ClientAppContext clientAppContext = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = C1061o.m2561i(parcel, readInt);
            } else if (i3 == 2) {
                clientAppContext = (ClientAppContext) C1061o.m2458a(parcel, readInt, ClientAppContext.CREATOR);
            } else if (i3 != 3) {
                C1061o.m2564l(parcel, readInt);
            } else {
                i2 = C1061o.m2561i(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C3213h(i, clientAppContext, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3213h[i];
    }
}
