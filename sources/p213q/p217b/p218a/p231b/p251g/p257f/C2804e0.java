package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey;
import java.util.Arrays;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2176g;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2176g.C2177a;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;
import p213q.p217b.p218a.p231b.p262i.p264c.C3200a;

/* renamed from: q.b.a.b.g.f.e0 */
public final class C2804e0 extends C2258a {
    public static final Creator<C2804e0> CREATOR = new C2820i0();

    /* renamed from: e */
    public List<TemporaryExposureKey> f7035e;

    /* renamed from: f */
    public C2176g f7036f;

    /* renamed from: g */
    public List<ParcelFileDescriptor> f7037g;

    /* renamed from: h */
    public C3200a f7038h;

    /* renamed from: i */
    public String f7039i;

    public C2804e0() {
    }

    public /* synthetic */ C2804e0(C2812g0 g0Var) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2804e0) {
            C2804e0 e0Var = (C2804e0) obj;
            return C1061o.m2546c((Object) this.f7035e, (Object) e0Var.f7035e) && C1061o.m2546c((Object) this.f7036f, (Object) e0Var.f7036f) && C1061o.m2546c((Object) this.f7037g, (Object) e0Var.f7037g) && C1061o.m2546c((Object) this.f7038h, (Object) e0Var.f7038h) && C1061o.m2546c((Object) this.f7039i, (Object) e0Var.f7039i);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7035e, this.f7036f, this.f7037g, this.f7038h, this.f7039i});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2531b(parcel, 1, this.f7035e, false);
        C1061o.m2483a(parcel, 2, this.f7036f.asBinder(), false);
        C1061o.m2531b(parcel, 3, this.f7037g, false);
        C1061o.m2484a(parcel, 4, (Parcelable) this.f7038h, i, false);
        C1061o.m2485a(parcel, 5, this.f7039i, false);
        C1061o.m2566n(parcel, a);
    }

    public C2804e0(List<TemporaryExposureKey> list, IBinder iBinder, List<ParcelFileDescriptor> list2, C3200a aVar, String str) {
        C2176g a = C2177a.m4999a(iBinder);
        this.f7035e = list;
        this.f7036f = a;
        this.f7037g = list2;
        this.f7038h = aVar;
        this.f7039i = str;
    }
}
