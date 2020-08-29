package p213q.p217b.p218a.p231b.p251g.p256e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q.b.a.b.g.e.e */
public final class C2410e extends C2338a implements C2376c {
    public C2410e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: a */
    public final int mo7469a() {
        Parcel a = mo7345a(2, mo7348d());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final void mo7470a(String str, String str2, Bundle bundle, long j) {
        Parcel d = mo7348d();
        d.writeString(str);
        d.writeString(str2);
        C2724w.m6506a(d, (Parcelable) bundle);
        d.writeLong(j);
        mo7347b(1, d);
    }
}
