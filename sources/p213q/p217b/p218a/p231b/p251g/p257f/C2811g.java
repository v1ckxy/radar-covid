package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.g.f.g */
public final class C2811g extends C2258a {
    public static final Creator<C2811g> CREATOR = new C2827k();

    /* renamed from: e */
    public C2882y f7042e;

    /* renamed from: f */
    public C2788a0 f7043f;

    public C2811g() {
    }

    public C2811g(IBinder iBinder, IBinder iBinder2) {
        C2882y yVar;
        C2788a0 a0Var = null;
        if (iBinder == null) {
            yVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.ITemporaryExposureKeyHistoryResultListener");
            yVar = queryLocalInterface instanceof C2882y ? (C2882y) queryLocalInterface : new C2879x(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.ITemporaryExposureKeyListCallback");
            a0Var = queryLocalInterface2 instanceof C2788a0 ? (C2788a0) queryLocalInterface2 : new C2796c0(iBinder2);
        }
        this.f7042e = yVar;
        this.f7043f = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2811g) {
            C2811g gVar = (C2811g) obj;
            return C1061o.m2546c((Object) this.f7042e, (Object) gVar.f7042e) && C1061o.m2546c((Object) this.f7043f, (Object) gVar.f7043f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7042e, this.f7043f});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C2882y yVar = this.f7042e;
        C1061o.m2483a(parcel, 1, yVar == null ? null : yVar.asBinder(), false);
        C1061o.m2483a(parcel, 2, this.f7043f.asBinder(), false);
        C1061o.m2566n(parcel, a);
    }

    public /* synthetic */ C2811g(C2819i iVar) {
    }
}
