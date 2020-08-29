package p213q.p217b.p218a.p231b.p251g.p256e;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.g.e.f */
public final class C2427f extends C2258a {
    public static final Creator<C2427f> CREATOR = new C2482i();

    /* renamed from: e */
    public final long f6506e;

    /* renamed from: f */
    public final long f6507f;

    /* renamed from: g */
    public final boolean f6508g;

    /* renamed from: h */
    public final String f6509h;

    /* renamed from: i */
    public final String f6510i;

    /* renamed from: j */
    public final String f6511j;

    /* renamed from: k */
    public final Bundle f6512k;

    public C2427f(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f6506e = j;
        this.f6507f = j2;
        this.f6508g = z;
        this.f6509h = str;
        this.f6510i = str2;
        this.f6511j = str3;
        this.f6512k = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2481a(parcel, 1, this.f6506e);
        C1061o.m2481a(parcel, 2, this.f6507f);
        C1061o.m2487a(parcel, 3, this.f6508g);
        C1061o.m2485a(parcel, 4, this.f6509h, false);
        C1061o.m2485a(parcel, 5, this.f6510i, false);
        C1061o.m2485a(parcel, 6, this.f6511j, false);
        C1061o.m2482a(parcel, 7, this.f6512k, false);
        C1061o.m2566n(parcel, a);
    }
}
