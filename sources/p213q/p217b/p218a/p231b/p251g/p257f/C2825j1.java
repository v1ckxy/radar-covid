package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.g.f.j1 */
public final class C2825j1 extends C2258a {
    public static final Creator<C2825j1> CREATOR = new C2821i1();

    /* renamed from: e */
    public String f7047e;

    /* renamed from: f */
    public int f7048f;

    public C2825j1() {
    }

    public C2825j1(String str, int i) {
        this.f7047e = str;
        this.f7048f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2825j1) {
            C2825j1 j1Var = (C2825j1) obj;
            return C1061o.m2546c((Object) this.f7047e, (Object) j1Var.f7047e) && C1061o.m2546c((Object) Integer.valueOf(this.f7048f), (Object) Integer.valueOf(j1Var.f7048f));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7047e, Integer.valueOf(this.f7048f)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2485a(parcel, 1, this.f7047e, false);
        C1061o.m2480a(parcel, 2, this.f7048f);
        C1061o.m2566n(parcel, a);
    }
}
