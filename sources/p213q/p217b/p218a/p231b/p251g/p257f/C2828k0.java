package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2176g;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2176g.C2177a;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.g.f.k0 */
public final class C2828k0 extends C2258a {
    public static final Creator<C2828k0> CREATOR = new C2840n0();

    /* renamed from: e */
    public C2176g f7049e;

    public C2828k0() {
    }

    public C2828k0(IBinder iBinder) {
        this.f7049e = C2177a.m4999a(iBinder);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2828k0)) {
            return false;
        }
        return C1061o.m2546c((Object) this.f7049e, (Object) ((C2828k0) obj).f7049e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7049e});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2483a(parcel, 1, this.f7049e.asBinder(), false);
        C1061o.m2566n(parcel, a);
    }

    public /* synthetic */ C2828k0(C2836m0 m0Var) {
    }
}
