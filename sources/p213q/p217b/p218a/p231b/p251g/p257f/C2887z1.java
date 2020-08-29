package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;
import p213q.p217b.p218a.p231b.p262i.p263b.C3195c;

/* renamed from: q.b.a.b.g.f.z1 */
public final class C2887z1 extends C2258a {
    public static final Creator<C2887z1> CREATOR = new C2884y1();

    /* renamed from: e */
    public String f7109e;

    /* renamed from: f */
    public C3195c f7110f;

    public C2887z1() {
    }

    public C2887z1(String str, C3195c cVar) {
        this.f7109e = str;
        this.f7110f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2887z1) {
            C2887z1 z1Var = (C2887z1) obj;
            return C1061o.m2546c((Object) this.f7109e, (Object) z1Var.f7109e) && C1061o.m2546c((Object) this.f7110f, (Object) z1Var.f7110f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7109e, this.f7110f});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2485a(parcel, 1, this.f7109e, false);
        C1061o.m2484a(parcel, 2, (Parcelable) this.f7110f, i, false);
        C1061o.m2566n(parcel, a);
    }
}
