package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.g.f.b0 */
public final class C2792b0 extends C2258a {
    public static final Creator<C2792b0> CREATOR = new C2808f0();

    /* renamed from: e */
    public C2843o f7017e;

    /* renamed from: f */
    public C2823j f7018f;

    public C2792b0() {
    }

    public C2792b0(IBinder iBinder, IBinder iBinder2) {
        C2843o oVar;
        C2823j jVar = null;
        if (iBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IBooleanResultListener");
            oVar = queryLocalInterface instanceof C2843o ? (C2843o) queryLocalInterface : new C2839n(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IBooleanCallback");
            jVar = queryLocalInterface2 instanceof C2823j ? (C2823j) queryLocalInterface2 : new C2831l(iBinder2);
        }
        this.f7017e = oVar;
        this.f7018f = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2792b0) {
            C2792b0 b0Var = (C2792b0) obj;
            return C1061o.m2546c((Object) this.f7017e, (Object) b0Var.f7017e) && C1061o.m2546c((Object) this.f7018f, (Object) b0Var.f7018f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7017e, this.f7018f});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C2843o oVar = this.f7017e;
        C1061o.m2483a(parcel, 1, oVar == null ? null : oVar.asBinder(), false);
        C1061o.m2483a(parcel, 2, this.f7018f.asBinder(), false);
        C1061o.m2566n(parcel, a);
    }

    public /* synthetic */ C2792b0(C2800d0 d0Var) {
    }
}
