package p213q.p217b.p218a.p231b.p262i.p264c;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.i.c.c */
public final class C3202c implements Creator<C3200a> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        int[] iArr = null;
        int[] iArr2 = null;
        int[] iArr3 = null;
        int[] iArr4 = null;
        int[] iArr5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C1061o.m2561i(parcel, readInt);
                    break;
                case 2:
                    iArr = C1061o.m2547c(parcel, readInt);
                    break;
                case 3:
                    i2 = C1061o.m2561i(parcel, readInt);
                    break;
                case 4:
                    iArr2 = C1061o.m2547c(parcel, readInt);
                    break;
                case 5:
                    i3 = C1061o.m2561i(parcel, readInt);
                    break;
                case 6:
                    iArr3 = C1061o.m2547c(parcel, readInt);
                    break;
                case 7:
                    i4 = C1061o.m2561i(parcel, readInt);
                    break;
                case 8:
                    iArr4 = C1061o.m2547c(parcel, readInt);
                    break;
                case 9:
                    i5 = C1061o.m2561i(parcel, readInt);
                    break;
                case 10:
                    iArr5 = C1061o.m2547c(parcel, readInt);
                    break;
                default:
                    C1061o.m2564l(parcel, readInt);
                    break;
            }
        }
        C1061o.m2557f(parcel, b);
        C3200a aVar = new C3200a(i, iArr, i2, iArr2, i3, iArr3, i4, iArr4, i5, iArr5);
        return aVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3200a[i];
    }
}
