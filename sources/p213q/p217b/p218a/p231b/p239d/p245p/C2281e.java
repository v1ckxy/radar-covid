package p213q.p217b.p218a.p231b.p239d.p245p;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.List;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.d.p.e */
public final class C2281e implements Creator<WakeLockEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C1061o.m2522b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C1061o.m2561i(parcel2, readInt);
                    break;
                case 2:
                    j = C1061o.m2562j(parcel2, readInt);
                    break;
                case 4:
                    str = C1061o.m2548d(parcel2, readInt);
                    break;
                case 5:
                    i3 = C1061o.m2561i(parcel2, readInt);
                    break;
                case 6:
                    list = C1061o.m2554e(parcel2, readInt);
                    break;
                case 8:
                    j2 = C1061o.m2562j(parcel2, readInt);
                    break;
                case 10:
                    str3 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 11:
                    i2 = C1061o.m2561i(parcel2, readInt);
                    break;
                case 12:
                    str2 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 13:
                    str4 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 14:
                    i4 = C1061o.m2561i(parcel2, readInt);
                    break;
                case 15:
                    C1061o.m2530b(parcel2, readInt, 4);
                    f = parcel.readFloat();
                    break;
                case 16:
                    j3 = C1061o.m2562j(parcel2, readInt);
                    break;
                case 17:
                    str5 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 18:
                    z = C1061o.m2559g(parcel2, readInt);
                    break;
                default:
                    C1061o.m2564l(parcel2, readInt);
                    break;
            }
        }
        C1061o.m2557f(parcel2, b);
        WakeLockEvent wakeLockEvent = new WakeLockEvent(i, j, i2, str, i3, list, str2, j2, i4, str3, str4, f, j3, str5, z);
        return wakeLockEvent;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
