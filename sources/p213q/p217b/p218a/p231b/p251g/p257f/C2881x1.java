package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.g.f.x1 */
public final class C2881x1 extends C2258a {
    public static final Creator<C2881x1> CREATOR = new C2877w1();

    /* renamed from: e */
    public String f7106e;

    /* renamed from: f */
    public C2802d2 f7107f;

    /* renamed from: g */
    public boolean f7108g;

    public C2881x1() {
    }

    public C2881x1(String str, C2802d2 d2Var, boolean z) {
        this.f7106e = str;
        this.f7107f = d2Var;
        this.f7108g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2881x1) {
            C2881x1 x1Var = (C2881x1) obj;
            return C1061o.m2546c((Object) this.f7106e, (Object) x1Var.f7106e) && C1061o.m2546c((Object) this.f7107f, (Object) x1Var.f7107f) && C1061o.m2546c((Object) Boolean.valueOf(this.f7108g), (Object) Boolean.valueOf(x1Var.f7108g));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7106e, this.f7107f, Boolean.valueOf(this.f7108g)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2485a(parcel, 1, this.f7106e, false);
        C1061o.m2484a(parcel, 2, (Parcelable) this.f7107f, i, false);
        C1061o.m2487a(parcel, 3, this.f7108g);
        C1061o.m2566n(parcel, a);
    }
}
