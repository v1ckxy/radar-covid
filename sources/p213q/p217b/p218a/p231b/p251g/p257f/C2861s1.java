package p213q.p217b.p218a.p231b.p251g.p257f;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.g.f.s1 */
public final class C2861s1 implements Creator<C2865t1> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        BluetoothDevice bluetoothDevice = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = C1061o.m2548d(parcel, readInt);
            } else if (i == 2) {
                str2 = C1061o.m2548d(parcel, readInt);
            } else if (i == 3) {
                str3 = C1061o.m2548d(parcel, readInt);
            } else if (i == 4) {
                bluetoothDevice = (BluetoothDevice) C1061o.m2458a(parcel, readInt, BluetoothDevice.CREATOR);
            } else if (i != 5) {
                C1061o.m2564l(parcel, readInt);
            } else {
                bArr = C1061o.m2536b(parcel, readInt);
            }
        }
        C1061o.m2557f(parcel, b);
        C2865t1 t1Var = new C2865t1(str, str2, str3, bluetoothDevice, bArr);
        return t1Var;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2865t1[i];
    }
}
