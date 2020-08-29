package p213q.p217b.p218a.p231b.p250f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p213q.p217b.p218a.p231b.p249e.C2303a;
import p213q.p217b.p218a.p231b.p249e.C2303a.C2304a;
import p213q.p217b.p218a.p231b.p251g.p254c.C2325b;
import p213q.p217b.p218a.p231b.p251g.p254c.C2326c;

/* renamed from: q.b.a.b.f.h */
public final class C2314h extends C2325b implements C2315i {
    public C2314h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: a */
    public final C2303a mo7326a(C2303a aVar, String str, int i, C2303a aVar2) {
        Parcel d = mo7340d();
        C2326c.m5411a(d, (IInterface) aVar);
        d.writeString(str);
        d.writeInt(i);
        C2326c.m5411a(d, (IInterface) aVar2);
        Parcel a = mo7338a(2, d);
        C2303a a2 = C2304a.m5378a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final C2303a mo7327b(C2303a aVar, String str, int i, C2303a aVar2) {
        Parcel d = mo7340d();
        C2326c.m5411a(d, (IInterface) aVar);
        d.writeString(str);
        d.writeInt(i);
        C2326c.m5411a(d, (IInterface) aVar2);
        Parcel a = mo7338a(3, d);
        C2303a a2 = C2304a.m5378a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
