package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.g.f.q0 */
public final class C2852q0 implements Creator<C2844o0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        while (parcel.dataPosition() < b) {
            C1061o.m2564l(parcel, parcel.readInt());
        }
        C1061o.m2557f(parcel, b);
        return new C2844o0();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2844o0[i];
    }
}
