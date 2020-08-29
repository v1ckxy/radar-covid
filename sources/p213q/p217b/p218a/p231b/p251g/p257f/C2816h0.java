package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2176g;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2176g.C2177a;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;
import p213q.p217b.p218a.p231b.p262i.p264c.C3200a;

/* renamed from: q.b.a.b.g.f.h0 */
public final class C2816h0 extends C2258a {
    public static final Creator<C2816h0> CREATOR = new C2832l0();

    /* renamed from: e */
    public C2176g f7045e;

    /* renamed from: f */
    public C3200a f7046f;

    public C2816h0() {
    }

    public C2816h0(IBinder iBinder, C3200a aVar) {
        this.f7045e = C2177a.m4999a(iBinder);
        this.f7046f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2816h0) {
            C2816h0 h0Var = (C2816h0) obj;
            return C1061o.m2546c((Object) this.f7045e, (Object) h0Var.f7045e) && C1061o.m2546c((Object) this.f7046f, (Object) h0Var.f7046f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7045e, this.f7046f});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2483a(parcel, 3, this.f7045e.asBinder(), false);
        C1061o.m2484a(parcel, 4, (Parcelable) this.f7046f, i, false);
        C1061o.m2566n(parcel, a);
    }

    public /* synthetic */ C2816h0(C2824j0 j0Var) {
    }
}
