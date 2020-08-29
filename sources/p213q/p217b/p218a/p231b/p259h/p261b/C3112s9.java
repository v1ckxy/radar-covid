package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.h.b.s9 */
public final class C3112s9 extends C2258a {
    public static final Creator<C3112s9> CREATOR = new C3145v9();

    /* renamed from: e */
    public final int f7850e;

    /* renamed from: f */
    public final String f7851f;

    /* renamed from: g */
    public final long f7852g;

    /* renamed from: h */
    public final Long f7853h;

    /* renamed from: i */
    public final String f7854i;

    /* renamed from: j */
    public final String f7855j;

    /* renamed from: k */
    public final Double f7856k;

    public C3112s9(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f7850e = i;
        this.f7851f = str;
        this.f7852g = j;
        this.f7853h = l;
        if (i == 1) {
            this.f7856k = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f7856k = d;
        }
        this.f7854i = str2;
        this.f7855j = str3;
    }

    public C3112s9(String str, long j, Object obj, String str2) {
        C1061o.m2528b(str);
        this.f7850e = 2;
        this.f7851f = str;
        this.f7852g = j;
        this.f7855j = str2;
        if (obj == null) {
            this.f7853h = null;
            this.f7856k = null;
            this.f7854i = null;
        } else if (obj instanceof Long) {
            this.f7853h = (Long) obj;
            this.f7856k = null;
            this.f7854i = null;
        } else if (obj instanceof String) {
            this.f7853h = null;
            this.f7856k = null;
            this.f7854i = (String) obj;
        } else if (obj instanceof Double) {
            this.f7853h = null;
            this.f7856k = (Double) obj;
            this.f7854i = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public C3112s9(C3134u9 u9Var) {
        this(u9Var.f7909c, u9Var.f7910d, u9Var.f7911e, u9Var.f7908b);
    }

    /* renamed from: a */
    public final Object mo8714a() {
        Long l = this.f7853h;
        if (l != null) {
            return l;
        }
        Double d = this.f7856k;
        if (d != null) {
            return d;
        }
        String str = this.f7854i;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f7850e);
        C1061o.m2485a(parcel, 2, this.f7851f, false);
        C1061o.m2481a(parcel, 3, this.f7852g);
        Long l = this.f7853h;
        if (l != null) {
            C1061o.m2541c(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        C1061o.m2485a(parcel, 6, this.f7854i, false);
        C1061o.m2485a(parcel, 7, this.f7855j, false);
        Double d = this.f7856k;
        if (d != null) {
            C1061o.m2541c(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        C1061o.m2566n(parcel, a);
    }
}
