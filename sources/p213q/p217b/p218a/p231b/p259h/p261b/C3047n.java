package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.h.b.n */
public final class C3047n extends C2258a {
    public static final Creator<C3047n> CREATOR = new C3080q();

    /* renamed from: e */
    public final String f7582e;

    /* renamed from: f */
    public final C3036m f7583f;

    /* renamed from: g */
    public final String f7584g;

    /* renamed from: h */
    public final long f7585h;

    public C3047n(String str, C3036m mVar, String str2, long j) {
        this.f7582e = str;
        this.f7583f = mVar;
        this.f7584g = str2;
        this.f7585h = j;
    }

    public C3047n(C3047n nVar, long j) {
        C1061o.m2524b(nVar);
        this.f7582e = nVar.f7582e;
        this.f7583f = nVar.f7583f;
        this.f7584g = nVar.f7584g;
        this.f7585h = j;
    }

    public final String toString() {
        String str = this.f7584g;
        String str2 = this.f7582e;
        String valueOf = String.valueOf(this.f7583f);
        StringBuilder sb = new StringBuilder(valueOf.length() + C1965a.m4743a(str2, C1965a.m4743a(str, 21)));
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return C1965a.m4754a(sb, ",params=", valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2485a(parcel, 2, this.f7582e, false);
        C1061o.m2484a(parcel, 3, (Parcelable) this.f7583f, i, false);
        C1061o.m2485a(parcel, 4, this.f7584g, false);
        C1061o.m2481a(parcel, 5, this.f7585h);
        C1061o.m2566n(parcel, a);
    }
}
