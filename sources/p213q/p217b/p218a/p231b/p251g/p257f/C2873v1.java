package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.g.f.v1 */
public final class C2873v1 extends C2258a {
    public static final Creator<C2873v1> CREATOR = new C2869u1();

    /* renamed from: e */
    public String f7102e;

    public C2873v1() {
    }

    public C2873v1(String str) {
        this.f7102e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2873v1)) {
            return false;
        }
        return C1061o.m2546c((Object) this.f7102e, (Object) ((C2873v1) obj).f7102e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7102e});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2485a(parcel, 1, this.f7102e, false);
        C1061o.m2566n(parcel, a);
    }
}
