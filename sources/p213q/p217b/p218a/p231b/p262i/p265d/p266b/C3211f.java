package p213q.p217b.p218a.p231b.p262i.p265d.p266b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.i.d.b.f */
public final class C3211f implements Creator<ClientAppContext> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C1061o.m2561i(parcel, readInt);
                    break;
                case 2:
                    str = C1061o.m2548d(parcel, readInt);
                    break;
                case 3:
                    str2 = C1061o.m2548d(parcel, readInt);
                    break;
                case 4:
                    z = C1061o.m2559g(parcel, readInt);
                    break;
                case 5:
                    i2 = C1061o.m2561i(parcel, readInt);
                    break;
                case 6:
                    str3 = C1061o.m2548d(parcel, readInt);
                    break;
                default:
                    C1061o.m2564l(parcel, readInt);
                    break;
            }
        }
        C1061o.m2557f(parcel, b);
        ClientAppContext clientAppContext = new ClientAppContext(i, str, str2, z, i2, str3);
        return clientAppContext;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientAppContext[i];
    }
}
