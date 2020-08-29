package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.g.f.k1 */
public final class C2829k1 implements Creator<C2833l1> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = C1061o.m2548d(parcel, readInt);
                    break;
                case 2:
                    str2 = C1061o.m2548d(parcel, readInt);
                    break;
                case 3:
                    str3 = C1061o.m2548d(parcel, readInt);
                    break;
                case 4:
                    z = C1061o.m2559g(parcel, readInt);
                    break;
                case 5:
                    bArr = C1061o.m2536b(parcel, readInt);
                    break;
                case 6:
                    bArr2 = C1061o.m2536b(parcel, readInt);
                    break;
                case 7:
                    bArr3 = C1061o.m2536b(parcel, readInt);
                    break;
                case 8:
                    z2 = C1061o.m2559g(parcel, readInt);
                    break;
                default:
                    C1061o.m2564l(parcel, readInt);
                    break;
            }
        }
        C1061o.m2557f(parcel, b);
        C2833l1 l1Var = new C2833l1(str, str2, str3, z, bArr, bArr2, bArr3, z2);
        return l1Var;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2833l1[i];
    }
}
