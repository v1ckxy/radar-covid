package p213q.p217b.p218a.p231b.p262i.p263b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.i.b.c */
public final class C3195c extends C2258a {
    public static final Creator<C3195c> CREATOR = new C3197e();

    /* renamed from: e */
    public long f8039e;

    /* renamed from: f */
    public int f8040f;

    /* renamed from: g */
    public long f8041g;

    /* renamed from: h */
    public long f8042h;

    public C3195c() {
    }

    public C3195c(long j, int i, long j2, long j3) {
        this.f8039e = j;
        this.f8040f = i;
        this.f8041g = j2;
        this.f8042h = j3;
    }

    public /* synthetic */ C3195c(C3196d dVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3195c) {
            C3195c cVar = (C3195c) obj;
            return C1061o.m2546c((Object) Long.valueOf(this.f8039e), (Object) Long.valueOf(cVar.f8039e)) && C1061o.m2546c((Object) Integer.valueOf(this.f8040f), (Object) Integer.valueOf(cVar.f8040f)) && C1061o.m2546c((Object) Long.valueOf(this.f8041g), (Object) Long.valueOf(cVar.f8041g)) && C1061o.m2546c((Object) Long.valueOf(this.f8042h), (Object) Long.valueOf(cVar.f8042h));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8039e), Integer.valueOf(this.f8040f), Long.valueOf(this.f8041g), Long.valueOf(this.f8042h)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2481a(parcel, 1, this.f8039e);
        C1061o.m2480a(parcel, 2, this.f8040f);
        C1061o.m2481a(parcel, 3, this.f8041g);
        C1061o.m2481a(parcel, 4, this.f8042h);
        C1061o.m2566n(parcel, a);
    }
}
