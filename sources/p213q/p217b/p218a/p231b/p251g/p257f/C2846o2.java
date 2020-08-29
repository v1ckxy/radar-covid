package p213q.p217b.p218a.p231b.p251g.p257f;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p213q.p217b.p218a.p231b.p239d.C2119d;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2167d;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2186k;
import p213q.p217b.p218a.p231b.p239d.p242n.C2228c;
import p213q.p217b.p218a.p231b.p239d.p242n.C2234e;
import p213q.p217b.p218a.p231b.p262i.C3190a;
import p213q.p217b.p218a.p231b.p262i.C3216e;

/* renamed from: q.b.a.b.g.f.o2 */
public final class C2846o2 extends C2234e<C2875w> {
    public C2846o2(Context context, Looper looper, C2167d dVar, C2186k kVar, C2228c cVar) {
        super(context, looper, 236, cVar, dVar, kVar);
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo7219a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.INearbyExposureNotificationService");
        return queryLocalInterface instanceof C2875w ? (C2875w) queryLocalInterface : new C2871v(iBinder);
    }

    /* renamed from: c */
    public final boolean mo7230c() {
        return C3190a.m7518b(this.f6117c);
    }

    /* renamed from: d */
    public final int mo7231d() {
        return 201516000;
    }

    /* renamed from: n */
    public final C2119d[] mo7240n() {
        return new C2119d[]{C3216e.f8070c};
    }

    /* renamed from: r */
    public final String mo7244r() {
        return "com.google.android.gms.nearby.exposurenotification.internal.INearbyExposureNotificationService";
    }

    /* renamed from: s */
    public final String mo7245s() {
        return "com.google.android.gms.nearby.exposurenotification.START";
    }

    /* renamed from: t */
    public final boolean mo7246t() {
        return true;
    }
}
