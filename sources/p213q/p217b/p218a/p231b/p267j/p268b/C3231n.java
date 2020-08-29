package p213q.p217b.p218a.p231b.p267j.p268b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2115b;
import p213q.p217b.p218a.p231b.p239d.p242n.C2273y;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.j.b.n */
public final class C3231n extends C2258a {
    public static final Creator<C3231n> CREATOR = new C3230m();

    /* renamed from: e */
    public final int f8092e;

    /* renamed from: f */
    public final C2115b f8093f;

    /* renamed from: g */
    public final C2273y f8094g;

    public C3231n() {
        C2115b bVar = new C2115b(8, null);
        this.f8092e = 1;
        this.f8093f = bVar;
        this.f8094g = null;
    }

    public C3231n(int i, C2115b bVar, C2273y yVar) {
        this.f8092e = i;
        this.f8093f = bVar;
        this.f8094g = yVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f8092e);
        C1061o.m2484a(parcel, 2, (Parcelable) this.f8093f, i, false);
        C1061o.m2484a(parcel, 3, (Parcelable) this.f8094g, i, false);
        C1061o.m2566n(parcel, a);
    }
}
