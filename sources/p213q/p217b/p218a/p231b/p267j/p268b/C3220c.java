package p213q.p217b.p218a.p231b.p267j.p268b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p240m.C2157h;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.j.b.c */
public final class C3220c extends C2258a implements C2157h {
    public static final Creator<C3220c> CREATOR = new C3219b();

    /* renamed from: e */
    public final int f8085e;

    /* renamed from: f */
    public int f8086f;

    /* renamed from: g */
    public Intent f8087g;

    public C3220c() {
        this.f8085e = 2;
        this.f8086f = 0;
        this.f8087g = null;
    }

    public C3220c(int i, int i2, Intent intent) {
        this.f8085e = i;
        this.f8086f = i2;
        this.f8087g = intent;
    }

    public final Status getStatus() {
        return this.f8086f == 0 ? Status.f1058i : Status.f1060k;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f8085e);
        C1061o.m2480a(parcel, 2, this.f8086f);
        C1061o.m2484a(parcel, 3, (Parcelable) this.f8087g, i, false);
        C1061o.m2566n(parcel, a);
    }
}
