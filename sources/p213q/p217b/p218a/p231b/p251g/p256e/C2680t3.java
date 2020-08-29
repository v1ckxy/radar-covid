package p213q.p217b.p218a.p231b.p251g.p256e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q.b.a.b.g.e.t3 */
public final class C2680t3 extends C2338a implements C2380c2 {
    public C2680t3(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: a */
    public final Bundle mo7484a(Bundle bundle) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) bundle);
        Parcel a = mo7345a(1, d);
        Bundle bundle2 = (Bundle) C2724w.m6504a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
