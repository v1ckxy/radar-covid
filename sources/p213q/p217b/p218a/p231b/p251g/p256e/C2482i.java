package p213q.p217b.p218a.p231b.p251g.p256e;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.g.e.i */
public final class C2482i implements Creator<C2427f> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C1061o.m2522b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    j = C1061o.m2562j(parcel2, readInt);
                    break;
                case 2:
                    j2 = C1061o.m2562j(parcel2, readInt);
                    break;
                case 3:
                    z = C1061o.m2559g(parcel2, readInt);
                    break;
                case 4:
                    str = C1061o.m2548d(parcel2, readInt);
                    break;
                case 5:
                    str2 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 6:
                    str3 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 7:
                    bundle = C1061o.m2457a(parcel2, readInt);
                    break;
                default:
                    C1061o.m2564l(parcel2, readInt);
                    break;
            }
        }
        C1061o.m2557f(parcel2, b);
        C2427f fVar = new C2427f(j, j2, z, str, str2, str3, bundle);
        return fVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2427f[i];
    }
}
