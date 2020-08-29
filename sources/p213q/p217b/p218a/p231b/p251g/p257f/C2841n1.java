package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.g.f.n1 */
public final class C2841n1 extends C2258a {
    public static final Creator<C2841n1> CREATOR = new C2837m1();

    /* renamed from: e */
    public String f7071e;

    /* renamed from: f */
    public int f7072f;

    /* renamed from: g */
    public byte[] f7073g;

    public C2841n1() {
    }

    public C2841n1(String str, int i, byte[] bArr) {
        this.f7071e = str;
        this.f7072f = i;
        this.f7073g = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2841n1) {
            C2841n1 n1Var = (C2841n1) obj;
            return C1061o.m2546c((Object) this.f7071e, (Object) n1Var.f7071e) && C1061o.m2546c((Object) Integer.valueOf(this.f7072f), (Object) Integer.valueOf(n1Var.f7072f)) && Arrays.equals(this.f7073g, n1Var.f7073g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7071e, Integer.valueOf(this.f7072f), Integer.valueOf(Arrays.hashCode(this.f7073g))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2485a(parcel, 1, this.f7071e, false);
        C1061o.m2480a(parcel, 2, this.f7072f);
        C1061o.m2488a(parcel, 3, this.f7073g, false);
        C1061o.m2566n(parcel, a);
    }
}
