package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p240m.C2210l;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

public final class Scope extends C2258a implements ReflectedParcelable {
    public static final Creator<Scope> CREATOR = new C2210l();

    /* renamed from: e */
    public final int f1056e;

    /* renamed from: f */
    public final String f1057f;

    public Scope(int i, String str) {
        C1061o.m2467a(str, (Object) "scopeUri must not be null or empty");
        this.f1056e = i;
        this.f1057f = str;
    }

    public Scope(String str) {
        C1061o.m2467a(str, (Object) "scopeUri must not be null or empty");
        this.f1056e = 1;
        this.f1057f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f1057f.equals(((Scope) obj).f1057f);
    }

    public final int hashCode() {
        return this.f1057f.hashCode();
    }

    public final String toString() {
        return this.f1057f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f1056e);
        C1061o.m2485a(parcel, 2, this.f1057f, false);
        C1061o.m2566n(parcel, a);
    }
}
