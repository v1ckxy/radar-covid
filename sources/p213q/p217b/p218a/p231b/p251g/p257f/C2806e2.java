package p213q.p217b.p218a.p231b.p251g.p257f;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.g.f.e2 */
public final class C2806e2 implements Creator<C2802d2> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C1061o.m2522b(parcel);
        byte[] bArr = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        Uri uri = null;
        long j = 0;
        int i = 0;
        long j2 = -1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    j = C1061o.m2562j(parcel2, readInt);
                    break;
                case 2:
                    i = C1061o.m2561i(parcel2, readInt);
                    break;
                case 3:
                    bArr = C1061o.m2536b(parcel2, readInt);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) C1061o.m2458a(parcel2, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    str = C1061o.m2548d(parcel2, readInt);
                    break;
                case 6:
                    j2 = C1061o.m2562j(parcel2, readInt);
                    break;
                case 7:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) C1061o.m2458a(parcel2, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 8:
                    uri = (Uri) C1061o.m2458a(parcel2, readInt, Uri.CREATOR);
                    break;
                default:
                    C1061o.m2564l(parcel2, readInt);
                    break;
            }
        }
        C1061o.m2557f(parcel2, b);
        C2802d2 d2Var = new C2802d2(j, i, bArr, parcelFileDescriptor, str, j2, parcelFileDescriptor2, uri);
        return d2Var;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2802d2[i];
    }
}
