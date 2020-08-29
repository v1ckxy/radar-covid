package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.h.b.z9 */
public final class C3189z9 extends C2258a {
    public static final Creator<C3189z9> CREATOR = new C3178y9();

    /* renamed from: e */
    public final String f8017e;

    /* renamed from: f */
    public final String f8018f;

    /* renamed from: g */
    public final String f8019g;

    /* renamed from: h */
    public final String f8020h;

    /* renamed from: i */
    public final long f8021i;

    /* renamed from: j */
    public final long f8022j;

    /* renamed from: k */
    public final String f8023k;

    /* renamed from: l */
    public final boolean f8024l;

    /* renamed from: m */
    public final boolean f8025m;

    /* renamed from: n */
    public final long f8026n;

    /* renamed from: o */
    public final String f8027o;

    /* renamed from: p */
    public final long f8028p;

    /* renamed from: q */
    public final long f8029q;

    /* renamed from: r */
    public final int f8030r;

    /* renamed from: s */
    public final boolean f8031s;

    /* renamed from: t */
    public final boolean f8032t;

    /* renamed from: u */
    public final boolean f8033u;

    /* renamed from: v */
    public final String f8034v;

    /* renamed from: w */
    public final Boolean f8035w;

    /* renamed from: x */
    public final long f8036x;

    /* renamed from: y */
    public final List<String> f8037y;

    /* renamed from: z */
    public final String f8038z;

    public C3189z9(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        C1061o.m2528b(str);
        this.f8017e = str;
        this.f8018f = TextUtils.isEmpty(str2) ? null : str2;
        this.f8019g = str3;
        this.f8026n = j;
        this.f8020h = str4;
        this.f8021i = j2;
        this.f8022j = j3;
        this.f8023k = str5;
        this.f8024l = z;
        this.f8025m = z2;
        this.f8027o = str6;
        this.f8028p = j4;
        this.f8029q = j5;
        this.f8030r = i;
        this.f8031s = z3;
        this.f8032t = z4;
        this.f8033u = z5;
        this.f8034v = str7;
        this.f8035w = bool;
        this.f8036x = j6;
        this.f8037y = list;
        this.f8038z = str8;
    }

    public C3189z9(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        this.f8017e = str;
        this.f8018f = str2;
        this.f8019g = str3;
        this.f8026n = j3;
        this.f8020h = str4;
        this.f8021i = j;
        this.f8022j = j2;
        this.f8023k = str5;
        this.f8024l = z;
        this.f8025m = z2;
        this.f8027o = str6;
        this.f8028p = j4;
        this.f8029q = j5;
        this.f8030r = i;
        this.f8031s = z3;
        this.f8032t = z4;
        this.f8033u = z5;
        this.f8034v = str7;
        this.f8035w = bool;
        this.f8036x = j6;
        this.f8037y = list;
        this.f8038z = str8;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2485a(parcel, 2, this.f8017e, false);
        C1061o.m2485a(parcel, 3, this.f8018f, false);
        C1061o.m2485a(parcel, 4, this.f8019g, false);
        C1061o.m2485a(parcel, 5, this.f8020h, false);
        C1061o.m2481a(parcel, 6, this.f8021i);
        C1061o.m2481a(parcel, 7, this.f8022j);
        C1061o.m2485a(parcel, 8, this.f8023k, false);
        C1061o.m2487a(parcel, 9, this.f8024l);
        C1061o.m2487a(parcel, 10, this.f8025m);
        C1061o.m2481a(parcel, 11, this.f8026n);
        C1061o.m2485a(parcel, 12, this.f8027o, false);
        C1061o.m2481a(parcel, 13, this.f8028p);
        C1061o.m2481a(parcel, 14, this.f8029q);
        C1061o.m2480a(parcel, 15, this.f8030r);
        C1061o.m2487a(parcel, 16, this.f8031s);
        C1061o.m2487a(parcel, 17, this.f8032t);
        C1061o.m2487a(parcel, 18, this.f8033u);
        C1061o.m2485a(parcel, 19, this.f8034v, false);
        Boolean bool = this.f8035w;
        if (bool != null) {
            C1061o.m2541c(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        C1061o.m2481a(parcel, 22, this.f8036x);
        C1061o.m2486a(parcel, 23, this.f8037y, false);
        C1061o.m2485a(parcel, 24, this.f8038z, false);
        C1061o.m2566n(parcel, a);
    }
}
