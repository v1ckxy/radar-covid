package p213q.p217b.p218a.p231b.p262i.p263b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.i.b.f */
public final class C3198f extends C2258a {
    public static final Creator<C3198f> CREATOR = new C3199g();

    /* renamed from: e */
    public int f8043e;

    /* renamed from: f */
    public int f8044f;

    /* renamed from: g */
    public int f8045g;

    public C3198f() {
    }

    public C3198f(int i, int i2, int i3) {
        this.f8043e = i;
        this.f8044f = i2;
        this.f8045g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3198f) {
            C3198f fVar = (C3198f) obj;
            return C1061o.m2546c((Object) Integer.valueOf(this.f8043e), (Object) Integer.valueOf(fVar.f8043e)) && C1061o.m2546c((Object) Integer.valueOf(this.f8044f), (Object) Integer.valueOf(fVar.f8044f)) && C1061o.m2546c((Object) Integer.valueOf(this.f8045g), (Object) Integer.valueOf(fVar.f8045g));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8043e), Integer.valueOf(this.f8044f), Integer.valueOf(this.f8045g)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f8043e);
        C1061o.m2480a(parcel, 2, this.f8044f);
        C1061o.m2480a(parcel, 3, this.f8045g);
        C1061o.m2566n(parcel, a);
    }
}
