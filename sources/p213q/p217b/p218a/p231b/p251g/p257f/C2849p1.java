package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.g.f.p1 */
public final class C2849p1 extends C2258a {
    public static final Creator<C2849p1> CREATOR = new C2845o1();

    /* renamed from: e */
    public String f7081e;

    public C2849p1() {
    }

    public C2849p1(String str) {
        this.f7081e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2849p1)) {
            return false;
        }
        return C1061o.m2546c((Object) this.f7081e, (Object) ((C2849p1) obj).f7081e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7081e});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2485a(parcel, 1, this.f7081e, false);
        C1061o.m2566n(parcel, a);
    }
}
