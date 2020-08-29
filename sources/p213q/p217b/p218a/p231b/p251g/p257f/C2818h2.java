package p213q.p217b.p218a.p231b.p251g.p257f;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p213q.p217b.p218a.p231b.p239d.C2129i;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2167d;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2186k;
import p213q.p217b.p218a.p231b.p239d.p242n.C2228c;
import p213q.p217b.p218a.p231b.p239d.p242n.C2234e;

/* renamed from: q.b.a.b.g.f.h2 */
public final class C2818h2 extends C2234e<C2822i2> {
    public C2818h2(Context context, Looper looper, C2167d dVar, C2186k kVar, C2228c cVar) {
        super(context, looper, 69, cVar, dVar, kVar);
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo7219a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        return queryLocalInterface instanceof C2822i2 ? (C2822i2) queryLocalInterface : new C2830k2(iBinder);
    }

    /* renamed from: d */
    public final int mo7231d() {
        return C2129i.f5999a;
    }

    /* renamed from: r */
    public final String mo7244r() {
        return "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
    }

    /* renamed from: s */
    public final String mo7245s() {
        return "com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapService.START";
    }
}
