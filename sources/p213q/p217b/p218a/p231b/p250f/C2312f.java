package p213q.p217b.p218a.p231b.p250f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p213q.p217b.p218a.p231b.p249e.C2303a;
import p213q.p217b.p218a.p231b.p249e.C2303a.C2304a;
import p213q.p217b.p218a.p231b.p251g.p254c.C2325b;
import p213q.p217b.p218a.p231b.p251g.p254c.C2326c;

/* renamed from: q.b.a.b.f.f */
public final class C2312f extends C2325b implements C2313g {
    public C2312f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: a */
    public final int mo7321a(C2303a aVar, String str, boolean z) {
        Parcel d = mo7340d();
        C2326c.m5411a(d, (IInterface) aVar);
        d.writeString(str);
        d.writeInt(z ? 1 : 0);
        Parcel a = mo7338a(5, d);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final C2303a mo7322a(C2303a aVar, String str, int i) {
        Parcel d = mo7340d();
        C2326c.m5411a(d, (IInterface) aVar);
        d.writeString(str);
        d.writeInt(i);
        Parcel a = mo7338a(4, d);
        C2303a a2 = C2304a.m5378a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final int mo7323b() {
        Parcel a = mo7338a(6, mo7340d());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final int mo7324b(C2303a aVar, String str, boolean z) {
        Parcel d = mo7340d();
        C2326c.m5411a(d, (IInterface) aVar);
        d.writeString(str);
        d.writeInt(z ? 1 : 0);
        Parcel a = mo7338a(3, d);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final C2303a mo7325b(C2303a aVar, String str, int i) {
        Parcel d = mo7340d();
        C2326c.m5411a(d, (IInterface) aVar);
        d.writeString(str);
        d.writeInt(i);
        Parcel a = mo7338a(2, d);
        C2303a a2 = C2304a.m5378a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
