package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.y9 */
public final class C3178y9 implements Creator<C3189z9> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C1061o.m2522b(parcel);
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        List list = null;
        String str8 = null;
        long j6 = -2147483648L;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = C1061o.m2548d(parcel2, readInt);
                    break;
                case 3:
                    str2 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 4:
                    str3 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 5:
                    str4 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 6:
                    j = C1061o.m2562j(parcel2, readInt);
                    break;
                case 7:
                    j2 = C1061o.m2562j(parcel2, readInt);
                    break;
                case 8:
                    str5 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 9:
                    z3 = C1061o.m2559g(parcel2, readInt);
                    break;
                case 10:
                    z = C1061o.m2559g(parcel2, readInt);
                    break;
                case 11:
                    j6 = C1061o.m2562j(parcel2, readInt);
                    break;
                case 12:
                    str6 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 13:
                    j3 = C1061o.m2562j(parcel2, readInt);
                    break;
                case 14:
                    j4 = C1061o.m2562j(parcel2, readInt);
                    break;
                case 15:
                    i = C1061o.m2561i(parcel2, readInt);
                    break;
                case 16:
                    z4 = C1061o.m2559g(parcel2, readInt);
                    break;
                case 17:
                    z5 = C1061o.m2559g(parcel2, readInt);
                    break;
                case 18:
                    z2 = C1061o.m2559g(parcel2, readInt);
                    break;
                case 19:
                    str7 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 21:
                    int k = C1061o.m2563k(parcel2, readInt);
                    if (k != 0) {
                        C1061o.m2551d(parcel2, k, 4);
                        bool = Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                case 22:
                    j5 = C1061o.m2562j(parcel2, readInt);
                    break;
                case 23:
                    list = C1061o.m2554e(parcel2, readInt);
                    break;
                case 24:
                    str8 = C1061o.m2548d(parcel2, readInt);
                    break;
                default:
                    C1061o.m2564l(parcel2, readInt);
                    break;
            }
        }
        C1061o.m2557f(parcel2, b);
        C3189z9 z9Var = new C3189z9(str, str2, str3, str4, j, j2, str5, z3, z, j6, str6, j3, j4, i, z4, z5, z2, str7, bool, j5, list, str8);
        return z9Var;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3189z9[i];
    }
}
