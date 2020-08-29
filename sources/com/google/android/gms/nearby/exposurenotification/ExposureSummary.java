package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.Locale;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;
import p213q.p217b.p218a.p231b.p262i.p264c.C3203d;

public final class ExposureSummary extends C2258a implements ReflectedParcelable {
    public static final Creator<ExposureSummary> CREATOR = new C3203d();

    /* renamed from: e */
    public int f1122e;

    /* renamed from: f */
    public int f1123f;

    /* renamed from: g */
    public int f1124g;

    /* renamed from: h */
    public int[] f1125h;

    /* renamed from: i */
    public int f1126i;

    public ExposureSummary(int i, int i2, int i3, int[] iArr, int i4) {
        this.f1122e = i;
        this.f1123f = i2;
        this.f1124g = i3;
        this.f1125h = iArr;
        this.f1126i = i4;
    }

    /* renamed from: c */
    public final int[] mo1623c() {
        int[] iArr = this.f1125h;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ExposureSummary) {
            ExposureSummary exposureSummary = (ExposureSummary) obj;
            if (C1061o.m2546c((Object) Integer.valueOf(this.f1122e), (Object) Integer.valueOf(exposureSummary.f1122e)) && C1061o.m2546c((Object) Integer.valueOf(this.f1123f), (Object) Integer.valueOf(exposureSummary.f1123f)) && C1061o.m2546c((Object) Integer.valueOf(this.f1124g), (Object) Integer.valueOf(exposureSummary.f1124g)) && Arrays.equals(this.f1125h, exposureSummary.mo1623c()) && C1061o.m2546c((Object) Integer.valueOf(this.f1126i), (Object) Integer.valueOf(exposureSummary.f1126i))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1122e), Integer.valueOf(this.f1123f), Integer.valueOf(this.f1124g), this.f1125h, Integer.valueOf(this.f1126i)});
    }

    public final String toString() {
        return String.format(Locale.US, "ExposureSummary<daysSinceLastExposure: %d, matchedKeyCount: %d, maximumRiskScore: %d, attenuationDurations: %s, summationRiskScore: %d>", new Object[]{Integer.valueOf(this.f1122e), Integer.valueOf(this.f1123f), Integer.valueOf(this.f1124g), Arrays.toString(this.f1125h), Integer.valueOf(this.f1126i)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f1122e);
        C1061o.m2480a(parcel, 2, this.f1123f);
        C1061o.m2480a(parcel, 3, this.f1124g);
        C1061o.m2489a(parcel, 4, mo1623c(), false);
        C1061o.m2480a(parcel, 5, this.f1126i);
        C1061o.m2566n(parcel, a);
    }
}
