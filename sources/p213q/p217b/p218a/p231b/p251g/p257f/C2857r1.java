package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;
import p213q.p217b.p218a.p231b.p262i.p263b.C3198f;

/* renamed from: q.b.a.b.g.f.r1 */
public final class C2857r1 extends C2258a {
    public static final Creator<C2857r1> CREATOR = new C2853q1();

    /* renamed from: e */
    public String f7086e;

    /* renamed from: f */
    public int f7087f;

    /* renamed from: g */
    public C3198f f7088g;

    public C2857r1() {
    }

    public C2857r1(String str, int i, C3198f fVar) {
        this.f7086e = str;
        this.f7087f = i;
        this.f7088g = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2857r1) {
            C2857r1 r1Var = (C2857r1) obj;
            return C1061o.m2546c((Object) this.f7086e, (Object) r1Var.f7086e) && C1061o.m2546c((Object) Integer.valueOf(this.f7087f), (Object) Integer.valueOf(r1Var.f7087f)) && C1061o.m2546c((Object) this.f7088g, (Object) r1Var.f7088g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7086e, Integer.valueOf(this.f7087f), this.f7088g});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2485a(parcel, 1, this.f7086e, false);
        C1061o.m2480a(parcel, 2, this.f7087f);
        C1061o.m2484a(parcel, 3, (Parcelable) this.f7088g, i, false);
        C1061o.m2566n(parcel, a);
    }
}
