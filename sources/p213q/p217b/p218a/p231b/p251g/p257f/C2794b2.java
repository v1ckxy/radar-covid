package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.g.f.b2 */
public final class C2794b2 extends C2258a {
    public static final Creator<C2794b2> CREATOR = new C2790a2();

    /* renamed from: e */
    public int f7019e;

    public C2794b2() {
    }

    public C2794b2(int i) {
        this.f7019e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2794b2)) {
            return false;
        }
        return C1061o.m2546c((Object) Integer.valueOf(this.f7019e), (Object) Integer.valueOf(((C2794b2) obj).f7019e));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7019e)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f7019e);
        C1061o.m2566n(parcel, a);
    }
}
