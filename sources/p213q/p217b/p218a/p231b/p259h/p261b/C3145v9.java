package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.v9 */
public final class C3145v9 implements Creator<C3112s9> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C1061o.m2522b(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C1061o.m2561i(parcel2, readInt);
                    break;
                case 2:
                    str = C1061o.m2548d(parcel2, readInt);
                    break;
                case 3:
                    j = C1061o.m2562j(parcel2, readInt);
                    break;
                case 4:
                    int k = C1061o.m2563k(parcel2, readInt);
                    if (k != 0) {
                        C1061o.m2551d(parcel2, k, 8);
                        l = Long.valueOf(parcel.readLong());
                        break;
                    } else {
                        l = null;
                        break;
                    }
                case 5:
                    int k2 = C1061o.m2563k(parcel2, readInt);
                    if (k2 != 0) {
                        C1061o.m2551d(parcel2, k2, 4);
                        f = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f = null;
                        break;
                    }
                case 6:
                    str2 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 7:
                    str3 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 8:
                    int k3 = C1061o.m2563k(parcel2, readInt);
                    if (k3 != 0) {
                        C1061o.m2551d(parcel2, k3, 8);
                        d = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d = null;
                        break;
                    }
                default:
                    C1061o.m2564l(parcel2, readInt);
                    break;
            }
        }
        C1061o.m2557f(parcel2, b);
        C3112s9 s9Var = new C3112s9(i, str, j, l, f, str2, str3, d);
        return s9Var;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3112s9[i];
    }
}
