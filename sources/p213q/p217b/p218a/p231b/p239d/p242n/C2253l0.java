package p213q.p217b.p218a.p231b.p239d.p242n;

import android.os.IBinder;
import android.os.Parcel;
import p213q.p217b.p218a.p231b.p249e.C2303a;
import p213q.p217b.p218a.p231b.p249e.C2303a.C2304a;
import p213q.p217b.p218a.p231b.p251g.p254c.C2325b;

/* renamed from: q.b.a.b.d.n.l0 */
public final class C2253l0 extends C2325b implements C2251k0 {
    public C2253l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: b */
    public final C2303a mo7281b() {
        Parcel a = mo7338a(1, mo7340d());
        C2303a a2 = C2304a.m5378a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final int mo7282c() {
        Parcel a = mo7338a(2, mo7340d());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
