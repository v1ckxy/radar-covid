package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.g.f.e */
public final class C2803e extends C2258a {
    public static final Creator<C2803e> CREATOR = new C2815h();

    /* renamed from: e */
    public C2867u f7032e;

    /* renamed from: f */
    public C2847p f7033f;

    /* renamed from: g */
    public String f7034g;

    public C2803e() {
    }

    public C2803e(IBinder iBinder, IBinder iBinder2, String str) {
        C2867u uVar;
        C2847p pVar = null;
        if (iBinder == null) {
            uVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryResultListener");
            uVar = queryLocalInterface instanceof C2867u ? (C2867u) queryLocalInterface : new C2863t(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryCallback");
            pVar = queryLocalInterface2 instanceof C2847p ? (C2847p) queryLocalInterface2 : new C2855r(iBinder2);
        }
        this.f7032e = uVar;
        this.f7033f = pVar;
        this.f7034g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2803e) {
            C2803e eVar = (C2803e) obj;
            return C1061o.m2546c((Object) this.f7032e, (Object) eVar.f7032e) && C1061o.m2546c((Object) this.f7033f, (Object) eVar.f7033f) && C1061o.m2546c((Object) this.f7034g, (Object) eVar.f7034g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7032e, this.f7033f, this.f7034g});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C2867u uVar = this.f7032e;
        C1061o.m2483a(parcel, 1, uVar == null ? null : uVar.asBinder(), false);
        C1061o.m2483a(parcel, 2, this.f7033f.asBinder(), false);
        C1061o.m2485a(parcel, 3, this.f7034g, false);
        C1061o.m2566n(parcel, a);
    }

    public /* synthetic */ C2803e(C2807f fVar) {
    }
}
