package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p240m.C2157h;
import p213q.p217b.p218a.p231b.p239d.p240m.C2211m;
import p213q.p217b.p218a.p231b.p239d.p242n.C2254m;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

public final class Status extends C2258a implements C2157h, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new C2211m();

    /* renamed from: i */
    public static final Status f1058i = new Status(0, null);

    /* renamed from: j */
    public static final Status f1059j = new Status(15, null);

    /* renamed from: k */
    public static final Status f1060k = new Status(16, null);

    /* renamed from: e */
    public final int f1061e;

    /* renamed from: f */
    public final int f1062f;

    /* renamed from: g */
    public final String f1063g;

    /* renamed from: h */
    public final PendingIntent f1064h;

    static {
        new Status(14, null);
        new Status(8, null);
        new Status(17, null);
        new Status(18, null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f1061e = i;
        this.f1062f = i2;
        this.f1063g = str;
        this.f1064h = pendingIntent;
    }

    public Status(int i, String str) {
        this.f1061e = 1;
        this.f1062f = i;
        this.f1063g = str;
        this.f1064h = null;
    }

    /* renamed from: a */
    public final void mo1522a(Activity activity, int i) {
        if (this.f1064h != null) {
            PendingIntent pendingIntent = this.f1064h;
            C1061o.m2524b(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    /* renamed from: c */
    public final boolean mo1523c() {
        return this.f1062f <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f1061e == status.f1061e && this.f1062f == status.f1062f && C1061o.m2546c((Object) this.f1063g, (Object) status.f1063g) && C1061o.m2546c((Object) this.f1064h, (Object) status.f1064h);
    }

    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1061e), Integer.valueOf(this.f1062f), this.f1063g, this.f1064h});
    }

    public final String toString() {
        C2254m d = C1061o.m2550d((Object) this);
        String str = this.f1063g;
        if (str == null) {
            str = C1061o.m2526b(this.f1062f);
        }
        d.mo7283a("statusCode", str);
        d.mo7283a("resolution", this.f1064h);
        return d.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f1062f);
        C1061o.m2485a(parcel, 2, this.f1063g, false);
        C1061o.m2484a(parcel, 3, (Parcelable) this.f1064h, i, false);
        C1061o.m2480a(parcel, 1000, this.f1061e);
        C1061o.m2566n(parcel, a);
    }
}
