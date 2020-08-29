package p213q.p217b.p218a.p231b.p267j.p268b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.C2271w;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.j.b.l */
public final class C3229l extends C2258a {
    public static final Creator<C3229l> CREATOR = new C3228k();

    /* renamed from: e */
    public final int f8090e;

    /* renamed from: f */
    public final C2271w f8091f;

    public C3229l(int i, C2271w wVar) {
        this.f8090e = i;
        this.f8091f = wVar;
    }

    public C3229l(C2271w wVar) {
        this.f8090e = 1;
        this.f8091f = wVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f8090e);
        C1061o.m2484a(parcel, 2, (Parcelable) this.f8091f, i, false);
        C1061o.m2566n(parcel, a);
    }
}
