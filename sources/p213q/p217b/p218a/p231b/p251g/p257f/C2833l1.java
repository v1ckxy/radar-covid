package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.g.f.l1 */
public final class C2833l1 extends C2258a {
    public static final Creator<C2833l1> CREATOR = new C2829k1();

    /* renamed from: e */
    public String f7050e;

    /* renamed from: f */
    public String f7051f;

    /* renamed from: g */
    public String f7052g;

    /* renamed from: h */
    public boolean f7053h;

    /* renamed from: i */
    public byte[] f7054i;

    /* renamed from: j */
    public byte[] f7055j;

    /* renamed from: k */
    public byte[] f7056k;

    /* renamed from: l */
    public boolean f7057l;

    public C2833l1() {
    }

    public C2833l1(String str, String str2, String str3, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z2) {
        this.f7050e = str;
        this.f7051f = str2;
        this.f7052g = str3;
        this.f7053h = z;
        this.f7054i = bArr;
        this.f7055j = bArr2;
        this.f7056k = bArr3;
        this.f7057l = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2833l1) {
            C2833l1 l1Var = (C2833l1) obj;
            return C1061o.m2546c((Object) this.f7050e, (Object) l1Var.f7050e) && C1061o.m2546c((Object) this.f7051f, (Object) l1Var.f7051f) && C1061o.m2546c((Object) this.f7052g, (Object) l1Var.f7052g) && C1061o.m2546c((Object) Boolean.valueOf(this.f7053h), (Object) Boolean.valueOf(l1Var.f7053h)) && Arrays.equals(this.f7054i, l1Var.f7054i) && Arrays.equals(this.f7055j, l1Var.f7055j) && Arrays.equals(this.f7056k, l1Var.f7056k) && C1061o.m2546c((Object) Boolean.valueOf(this.f7057l), (Object) Boolean.valueOf(l1Var.f7057l));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7050e, this.f7051f, this.f7052g, Boolean.valueOf(this.f7053h), Integer.valueOf(Arrays.hashCode(this.f7054i)), Integer.valueOf(Arrays.hashCode(this.f7055j)), Integer.valueOf(Arrays.hashCode(this.f7056k)), Boolean.valueOf(this.f7057l)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2485a(parcel, 1, this.f7050e, false);
        C1061o.m2485a(parcel, 2, this.f7051f, false);
        C1061o.m2485a(parcel, 3, this.f7052g, false);
        C1061o.m2487a(parcel, 4, this.f7053h);
        C1061o.m2488a(parcel, 5, this.f7054i, false);
        C1061o.m2488a(parcel, 6, this.f7055j, false);
        C1061o.m2488a(parcel, 7, this.f7056k, false);
        C1061o.m2487a(parcel, 8, this.f7057l);
        C1061o.m2566n(parcel, a);
    }
}
