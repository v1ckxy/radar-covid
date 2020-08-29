package p213q.p217b.p218a.p231b.p239d;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.C2254m;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.d.d */
public class C2119d extends C2258a {
    public static final Creator<C2119d> CREATOR = new C2296t();

    /* renamed from: e */
    public final String f5985e;
    @Deprecated

    /* renamed from: f */
    public final int f5986f;

    /* renamed from: g */
    public final long f5987g;

    public C2119d(String str, int i, long j) {
        this.f5985e = str;
        this.f5986f = i;
        this.f5987g = j;
    }

    public C2119d(String str, long j) {
        this.f5985e = str;
        this.f5987g = j;
        this.f5986f = -1;
    }

    /* renamed from: c */
    public long mo7103c() {
        long j = this.f5987g;
        return j == -1 ? (long) this.f5986f : j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2119d) {
            C2119d dVar = (C2119d) obj;
            String str = this.f5985e;
            if (((str != null && str.equals(dVar.f5985e)) || (this.f5985e == null && dVar.f5985e == null)) && mo7103c() == dVar.mo7103c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5985e, Long.valueOf(mo7103c())});
    }

    public String toString() {
        C2254m d = C1061o.m2550d((Object) this);
        d.mo7283a("name", this.f5985e);
        d.mo7283a("version", Long.valueOf(mo7103c()));
        return d.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2485a(parcel, 1, this.f5985e, false);
        C1061o.m2480a(parcel, 2, this.f5986f);
        C1061o.m2481a(parcel, 3, mo7103c());
        C1061o.m2566n(parcel, a);
    }
}
