package p213q.p217b.p218a.p231b.p239d.p242n;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2119d;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.d.n.b0 */
public final class C2227b0 extends C2258a {
    public static final Creator<C2227b0> CREATOR = new C2213a0();

    /* renamed from: e */
    public Bundle f6152e;

    /* renamed from: f */
    public C2119d[] f6153f;

    /* renamed from: g */
    public int f6154g;

    public C2227b0() {
    }

    public C2227b0(Bundle bundle, C2119d[] dVarArr, int i) {
        this.f6152e = bundle;
        this.f6153f = dVarArr;
        this.f6154g = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2482a(parcel, 1, this.f6152e, false);
        C1061o.m2490a(parcel, 2, (T[]) this.f6153f, i, false);
        C1061o.m2480a(parcel, 3, this.f6154g);
        C1061o.m2566n(parcel, a);
    }
}
