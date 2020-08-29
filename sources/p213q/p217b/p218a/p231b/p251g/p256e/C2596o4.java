package p213q.p217b.p218a.p231b.p251g.p256e;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: q.b.a.b.g.e.o4 */
public abstract class C2596o4 extends C2677t0 implements C2380c2 {
    /* renamed from: a */
    public static C2380c2 m6200a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof C2380c2 ? (C2380c2) queryLocalInterface : new C2680t3(iBinder);
    }
}
