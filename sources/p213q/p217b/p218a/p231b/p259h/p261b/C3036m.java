package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Iterator;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.h.b.m */
public final class C3036m extends C2258a implements Iterable<String> {
    public static final Creator<C3036m> CREATOR = new C3058o();

    /* renamed from: e */
    public final Bundle f7556e;

    public C3036m(Bundle bundle) {
        this.f7556e = bundle;
    }

    /* renamed from: a */
    public final Object mo8636a(String str) {
        return this.f7556e.get(str);
    }

    /* renamed from: b */
    public final Bundle mo8637b() {
        return new Bundle(this.f7556e);
    }

    /* renamed from: b */
    public final Long mo8638b(String str) {
        return Long.valueOf(this.f7556e.getLong(str));
    }

    /* renamed from: c */
    public final Double mo8639c(String str) {
        return Double.valueOf(this.f7556e.getDouble(str));
    }

    /* renamed from: d */
    public final String mo8640d(String str) {
        return this.f7556e.getString(str);
    }

    public final Iterator<String> iterator() {
        return new C3023l(this);
    }

    public final String toString() {
        return this.f7556e.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2482a(parcel, 2, mo8637b(), false);
        C1061o.m2566n(parcel, a);
    }
}
