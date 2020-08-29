package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.la */
public final class C3035la implements Creator<C2998ia> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C1061o.m2522b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        C3112s9 s9Var = null;
        String str3 = null;
        C3047n nVar = null;
        C3047n nVar2 = null;
        C3047n nVar3 = null;
        boolean z = false;
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
                    s9Var = (C3112s9) C1061o.m2458a(parcel2, readInt, C3112s9.CREATOR);
                    break;
                case 5:
                    j = C1061o.m2562j(parcel2, readInt);
                    break;
                case 6:
                    z = C1061o.m2559g(parcel2, readInt);
                    break;
                case 7:
                    str3 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 8:
                    nVar = (C3047n) C1061o.m2458a(parcel2, readInt, C3047n.CREATOR);
                    break;
                case 9:
                    j2 = C1061o.m2562j(parcel2, readInt);
                    break;
                case 10:
                    nVar2 = (C3047n) C1061o.m2458a(parcel2, readInt, C3047n.CREATOR);
                    break;
                case 11:
                    j3 = C1061o.m2562j(parcel2, readInt);
                    break;
                case 12:
                    nVar3 = (C3047n) C1061o.m2458a(parcel2, readInt, C3047n.CREATOR);
                    break;
                default:
                    C1061o.m2564l(parcel2, readInt);
                    break;
            }
        }
        C1061o.m2557f(parcel2, b);
        C2998ia iaVar = new C2998ia(str, str2, s9Var, j, z, str3, nVar, j2, nVar2, j3, nVar3);
        return iaVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2998ia[i];
    }
}
