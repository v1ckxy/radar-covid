package p213q.p217b.p218a.p231b.p262i.p265d.p266b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.i.d.b.h */
public final class C3213h extends C2258a {
    public static final Creator<C3213h> CREATOR = new C3212g();

    /* renamed from: e */
    public final int f8065e;
    @Deprecated

    /* renamed from: f */
    public final ClientAppContext f8066f;

    /* renamed from: g */
    public final int f8067g;

    public C3213h(int i) {
        this.f8065e = 1;
        this.f8066f = null;
        this.f8067g = i;
    }

    public C3213h(int i, ClientAppContext clientAppContext, int i2) {
        this.f8065e = i;
        this.f8066f = clientAppContext;
        this.f8067g = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f8065e);
        C1061o.m2484a(parcel, 2, (Parcelable) this.f8066f, i, false);
        C1061o.m2480a(parcel, 3, this.f8067g);
        C1061o.m2566n(parcel, a);
    }
}
