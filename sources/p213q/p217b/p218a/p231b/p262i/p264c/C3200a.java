package p213q.p217b.p218a.p231b.p262i.p264c;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Locale;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.i.c.a */
public final class C3200a extends C2258a {
    public static final Creator<C3200a> CREATOR = new C3202c();

    /* renamed from: e */
    public int f8046e;

    /* renamed from: f */
    public int[] f8047f;

    /* renamed from: g */
    public int f8048g;

    /* renamed from: h */
    public int[] f8049h;

    /* renamed from: i */
    public int f8050i;

    /* renamed from: j */
    public int[] f8051j;

    /* renamed from: k */
    public int f8052k;

    /* renamed from: l */
    public int[] f8053l;

    /* renamed from: m */
    public int f8054m;

    /* renamed from: n */
    public int[] f8055n;

    public C3200a(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4, int[] iArr4, int i5, int[] iArr5) {
        this.f8046e = i;
        this.f8047f = iArr;
        this.f8048g = i2;
        this.f8049h = iArr2;
        this.f8050i = i3;
        this.f8051j = iArr3;
        this.f8052k = i4;
        this.f8053l = iArr4;
        this.f8054m = i5;
        this.f8055n = iArr5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3200a) {
            C3200a aVar = (C3200a) obj;
            if (C1061o.m2546c((Object) Integer.valueOf(this.f8046e), (Object) Integer.valueOf(aVar.f8046e))) {
                int[] iArr = this.f8047f;
                int[] iArr2 = aVar.f8047f;
                if (Arrays.equals(iArr, Arrays.copyOf(iArr2, iArr2.length)) && C1061o.m2546c((Object) Integer.valueOf(this.f8048g), (Object) Integer.valueOf(aVar.f8048g))) {
                    int[] iArr3 = this.f8049h;
                    int[] iArr4 = aVar.f8049h;
                    if (Arrays.equals(iArr3, Arrays.copyOf(iArr4, iArr4.length)) && C1061o.m2546c((Object) Integer.valueOf(this.f8050i), (Object) Integer.valueOf(aVar.f8050i))) {
                        int[] iArr5 = this.f8051j;
                        int[] iArr6 = aVar.f8051j;
                        if (Arrays.equals(iArr5, Arrays.copyOf(iArr6, iArr6.length)) && C1061o.m2546c((Object) Integer.valueOf(this.f8052k), (Object) Integer.valueOf(aVar.f8052k))) {
                            int[] iArr7 = this.f8053l;
                            int[] iArr8 = aVar.f8053l;
                            if (Arrays.equals(iArr7, Arrays.copyOf(iArr8, iArr8.length)) && C1061o.m2546c((Object) Integer.valueOf(this.f8054m), (Object) Integer.valueOf(aVar.f8054m))) {
                                int[] iArr9 = this.f8055n;
                                int[] iArr10 = aVar.f8055n;
                                if (Arrays.equals(iArr9, Arrays.copyOf(iArr10, iArr10.length))) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8046e), this.f8047f, Integer.valueOf(this.f8048g), this.f8049h, Integer.valueOf(this.f8050i), this.f8051j, Integer.valueOf(this.f8052k), this.f8053l, Integer.valueOf(this.f8054m), this.f8055n});
    }

    public final String toString() {
        return String.format(Locale.US, "ExposureConfiguration<minimumRiskScore: %d, attenuationScores: %s, attenuationWeight: %d, daysSinceLastExposureScores: %s, daysSinceLastExposureWeight: %d, durationScores: %s, durationWeight: %d, transmissionRiskScores: %s, transmissionRiskWeight: %d, durationAtAttenuationThresholds: %s>", new Object[]{Integer.valueOf(this.f8046e), Arrays.toString(this.f8047f), Integer.valueOf(this.f8048g), Arrays.toString(this.f8049h), Integer.valueOf(this.f8050i), Arrays.toString(this.f8051j), Integer.valueOf(this.f8052k), Arrays.toString(this.f8053l), Integer.valueOf(this.f8054m), Arrays.toString(this.f8055n)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f8046e);
        int[] iArr = this.f8047f;
        C1061o.m2489a(parcel, 2, Arrays.copyOf(iArr, iArr.length), false);
        C1061o.m2480a(parcel, 3, this.f8048g);
        int[] iArr2 = this.f8049h;
        C1061o.m2489a(parcel, 4, Arrays.copyOf(iArr2, iArr2.length), false);
        C1061o.m2480a(parcel, 5, this.f8050i);
        int[] iArr3 = this.f8051j;
        C1061o.m2489a(parcel, 6, Arrays.copyOf(iArr3, iArr3.length), false);
        C1061o.m2480a(parcel, 7, this.f8052k);
        int[] iArr4 = this.f8053l;
        C1061o.m2489a(parcel, 8, Arrays.copyOf(iArr4, iArr4.length), false);
        C1061o.m2480a(parcel, 9, this.f8054m);
        int[] iArr5 = this.f8055n;
        C1061o.m2489a(parcel, 10, Arrays.copyOf(iArr5, iArr5.length), false);
        C1061o.m2566n(parcel, a);
    }
}
