package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2285d;
import p213q.p217b.p218a.p231b.p262i.p264c.C3204e;

public final class TemporaryExposureKey extends C2258a implements ReflectedParcelable {
    public static final Creator<TemporaryExposureKey> CREATOR = new C3204e();

    /* renamed from: e */
    public byte[] f1127e;

    /* renamed from: f */
    public int f1128f;

    /* renamed from: g */
    public int f1129g;

    /* renamed from: h */
    public int f1130h;

    public TemporaryExposureKey(byte[] bArr, int i, int i2, int i3) {
        this.f1127e = bArr;
        this.f1128f = i;
        this.f1129g = i2;
        this.f1130h = i3;
    }

    /* renamed from: c */
    public final byte[] mo1628c() {
        byte[] bArr = this.f1127e;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TemporaryExposureKey) {
            TemporaryExposureKey temporaryExposureKey = (TemporaryExposureKey) obj;
            if (Arrays.equals(this.f1127e, temporaryExposureKey.mo1628c()) && C1061o.m2546c((Object) Integer.valueOf(this.f1128f), (Object) Integer.valueOf(temporaryExposureKey.f1128f)) && C1061o.m2546c((Object) Integer.valueOf(this.f1129g), (Object) Integer.valueOf(temporaryExposureKey.f1129g)) && C1061o.m2546c((Object) Integer.valueOf(this.f1130h), (Object) Integer.valueOf(temporaryExposureKey.f1130h))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1127e, Integer.valueOf(this.f1128f), Integer.valueOf(this.f1129g), Integer.valueOf(this.f1130h)});
    }

    public final String toString() {
        return String.format(Locale.US, "TemporaryExposureKey<keyData: %s, rollingStartIntervalNumber: %s, transmissionRiskLevel: %d, rollingPeriod: %d>", new Object[]{C2285d.m5138a(this.f1127e), new Date(TimeUnit.MINUTES.toMillis(((long) this.f1128f) * 10)), Integer.valueOf(this.f1129g), Integer.valueOf(this.f1130h)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2488a(parcel, 1, mo1628c(), false);
        C1061o.m2480a(parcel, 2, this.f1128f);
        C1061o.m2480a(parcel, 3, this.f1129g);
        C1061o.m2480a(parcel, 4, this.f1130h);
        C1061o.m2566n(parcel, a);
    }
}
