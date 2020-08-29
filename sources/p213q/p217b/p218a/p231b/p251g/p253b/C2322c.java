package p213q.p217b.p218a.p231b.p251g.p253b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: q.b.a.b.g.b.c */
public class C2322c {
    static {
        C2322c.class.getClassLoader();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m5405a(Parcel parcel, Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m5406a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
