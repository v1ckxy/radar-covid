package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.h.b.ia */
public final class C2998ia extends C2258a {
    public static final Creator<C2998ia> CREATOR = new C3035la();

    /* renamed from: e */
    public String f7418e;

    /* renamed from: f */
    public String f7419f;

    /* renamed from: g */
    public C3112s9 f7420g;

    /* renamed from: h */
    public long f7421h;

    /* renamed from: i */
    public boolean f7422i;

    /* renamed from: j */
    public String f7423j;

    /* renamed from: k */
    public C3047n f7424k;

    /* renamed from: l */
    public long f7425l;

    /* renamed from: m */
    public C3047n f7426m;

    /* renamed from: n */
    public long f7427n;

    /* renamed from: o */
    public C3047n f7428o;

    public C2998ia(String str, String str2, C3112s9 s9Var, long j, boolean z, String str3, C3047n nVar, long j2, C3047n nVar2, long j3, C3047n nVar3) {
        this.f7418e = str;
        this.f7419f = str2;
        this.f7420g = s9Var;
        this.f7421h = j;
        this.f7422i = z;
        this.f7423j = str3;
        this.f7424k = nVar;
        this.f7425l = j2;
        this.f7426m = nVar2;
        this.f7427n = j3;
        this.f7428o = nVar3;
    }

    public C2998ia(C2998ia iaVar) {
        C1061o.m2524b(iaVar);
        this.f7418e = iaVar.f7418e;
        this.f7419f = iaVar.f7419f;
        this.f7420g = iaVar.f7420g;
        this.f7421h = iaVar.f7421h;
        this.f7422i = iaVar.f7422i;
        this.f7423j = iaVar.f7423j;
        this.f7424k = iaVar.f7424k;
        this.f7425l = iaVar.f7425l;
        this.f7426m = iaVar.f7426m;
        this.f7427n = iaVar.f7427n;
        this.f7428o = iaVar.f7428o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2485a(parcel, 2, this.f7418e, false);
        C1061o.m2485a(parcel, 3, this.f7419f, false);
        C1061o.m2484a(parcel, 4, (Parcelable) this.f7420g, i, false);
        C1061o.m2481a(parcel, 5, this.f7421h);
        C1061o.m2487a(parcel, 6, this.f7422i);
        C1061o.m2485a(parcel, 7, this.f7423j, false);
        C1061o.m2484a(parcel, 8, (Parcelable) this.f7424k, i, false);
        C1061o.m2481a(parcel, 9, this.f7425l);
        C1061o.m2484a(parcel, 10, (Parcelable) this.f7426m, i, false);
        C1061o.m2481a(parcel, 11, this.f7427n);
        C1061o.m2484a(parcel, 12, (Parcelable) this.f7428o, i, false);
        C1061o.m2566n(parcel, a);
    }
}
