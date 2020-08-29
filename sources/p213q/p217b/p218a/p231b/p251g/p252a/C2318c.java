package p213q.p217b.p218a.p231b.p251g.p252a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: q.b.a.b.g.a.c */
public abstract class C2318c extends Binder implements C2317b, IInterface {
    /* renamed from: a */
    public static C2317b m5401a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C2317b ? (C2317b) queryLocalInterface : new C2319d(iBinder);
    }
}
