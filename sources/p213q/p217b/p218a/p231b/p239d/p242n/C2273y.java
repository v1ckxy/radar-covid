package p213q.p217b.p218a.p231b.p239d.p242n;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2115b;
import p213q.p217b.p218a.p231b.p239d.p242n.C2241h.C2242a;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.d.n.y */
public final class C2273y extends C2258a {
    public static final Creator<C2273y> CREATOR = new C2272x();

    /* renamed from: e */
    public final int f6236e;

    /* renamed from: f */
    public IBinder f6237f;

    /* renamed from: g */
    public C2115b f6238g;

    /* renamed from: h */
    public boolean f6239h;

    /* renamed from: i */
    public boolean f6240i;

    public C2273y(int i, IBinder iBinder, C2115b bVar, boolean z, boolean z2) {
        this.f6236e = i;
        this.f6237f = iBinder;
        this.f6238g = bVar;
        this.f6239h = z;
        this.f6240i = z2;
    }

    /* renamed from: c */
    public final C2241h mo7295c() {
        IBinder iBinder = this.f6237f;
        if (iBinder == null) {
            return null;
        }
        return C2242a.m5095a(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2273y)) {
            return false;
        }
        C2273y yVar = (C2273y) obj;
        return this.f6238g.equals(yVar.f6238g) && C1061o.m2546c((Object) mo7295c(), (Object) yVar.mo7295c());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f6236e);
        C1061o.m2483a(parcel, 2, this.f6237f, false);
        C1061o.m2484a(parcel, 3, (Parcelable) this.f6238g, i, false);
        C1061o.m2487a(parcel, 4, this.f6239h);
        C1061o.m2487a(parcel, 5, this.f6240i);
        C1061o.m2566n(parcel, a);
    }
}
