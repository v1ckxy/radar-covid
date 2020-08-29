package p213q.p217b.p218a.p231b.p251g.p257f;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.g.f.t1 */
public final class C2865t1 extends C2258a {
    public static final Creator<C2865t1> CREATOR = new C2861s1();

    /* renamed from: e */
    public String f7091e;

    /* renamed from: f */
    public String f7092f;

    /* renamed from: g */
    public String f7093g;

    /* renamed from: h */
    public BluetoothDevice f7094h;

    /* renamed from: i */
    public byte[] f7095i;

    public C2865t1() {
    }

    public C2865t1(String str, String str2, String str3, BluetoothDevice bluetoothDevice, byte[] bArr) {
        this.f7091e = str;
        this.f7092f = str2;
        this.f7093g = str3;
        this.f7094h = bluetoothDevice;
        this.f7095i = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2865t1) {
            C2865t1 t1Var = (C2865t1) obj;
            return C1061o.m2546c((Object) this.f7091e, (Object) t1Var.f7091e) && C1061o.m2546c((Object) this.f7092f, (Object) t1Var.f7092f) && C1061o.m2546c((Object) this.f7093g, (Object) t1Var.f7093g) && C1061o.m2546c((Object) this.f7094h, (Object) t1Var.f7094h) && Arrays.equals(this.f7095i, t1Var.f7095i);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7091e, this.f7092f, this.f7093g, this.f7094h, Integer.valueOf(Arrays.hashCode(this.f7095i))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2485a(parcel, 1, this.f7091e, false);
        C1061o.m2485a(parcel, 2, this.f7092f, false);
        C1061o.m2485a(parcel, 3, this.f7093g, false);
        C1061o.m2484a(parcel, 4, (Parcelable) this.f7094h, i, false);
        C1061o.m2488a(parcel, 5, this.f7095i, false);
        C1061o.m2566n(parcel, a);
    }
}
