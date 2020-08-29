package p213q.p217b.p218a.p231b.p251g.p257f;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.g.f.d2 */
public final class C2802d2 extends C2258a {
    public static final Creator<C2802d2> CREATOR = new C2806e2();

    /* renamed from: e */
    public long f7024e;

    /* renamed from: f */
    public int f7025f;

    /* renamed from: g */
    public byte[] f7026g;

    /* renamed from: h */
    public ParcelFileDescriptor f7027h;

    /* renamed from: i */
    public String f7028i;

    /* renamed from: j */
    public long f7029j = -1;

    /* renamed from: k */
    public ParcelFileDescriptor f7030k;

    /* renamed from: l */
    public Uri f7031l;

    public C2802d2() {
    }

    public C2802d2(long j, int i, byte[] bArr, ParcelFileDescriptor parcelFileDescriptor, String str, long j2, ParcelFileDescriptor parcelFileDescriptor2, Uri uri) {
        this.f7024e = j;
        this.f7025f = i;
        this.f7026g = bArr;
        this.f7027h = parcelFileDescriptor;
        this.f7028i = str;
        this.f7029j = j2;
        this.f7030k = parcelFileDescriptor2;
        this.f7031l = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2802d2) {
            C2802d2 d2Var = (C2802d2) obj;
            return C1061o.m2546c((Object) Long.valueOf(this.f7024e), (Object) Long.valueOf(d2Var.f7024e)) && C1061o.m2546c((Object) Integer.valueOf(this.f7025f), (Object) Integer.valueOf(d2Var.f7025f)) && Arrays.equals(this.f7026g, d2Var.f7026g) && C1061o.m2546c((Object) this.f7027h, (Object) d2Var.f7027h) && C1061o.m2546c((Object) this.f7028i, (Object) d2Var.f7028i) && C1061o.m2546c((Object) Long.valueOf(this.f7029j), (Object) Long.valueOf(d2Var.f7029j)) && C1061o.m2546c((Object) this.f7030k, (Object) d2Var.f7030k) && C1061o.m2546c((Object) this.f7031l, (Object) d2Var.f7031l);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7024e), Integer.valueOf(this.f7025f), Integer.valueOf(Arrays.hashCode(this.f7026g)), this.f7027h, this.f7028i, Long.valueOf(this.f7029j), this.f7030k, this.f7031l});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2481a(parcel, 1, this.f7024e);
        C1061o.m2480a(parcel, 2, this.f7025f);
        C1061o.m2488a(parcel, 3, this.f7026g, false);
        C1061o.m2484a(parcel, 4, (Parcelable) this.f7027h, i, false);
        C1061o.m2485a(parcel, 5, this.f7028i, false);
        C1061o.m2481a(parcel, 6, this.f7029j);
        C1061o.m2484a(parcel, 7, (Parcelable) this.f7030k, i, false);
        C1061o.m2484a(parcel, 8, (Parcelable) this.f7031l, i, false);
        C1061o.m2566n(parcel, a);
    }
}
