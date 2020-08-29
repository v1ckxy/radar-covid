package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2124f;
import p213q.p217b.p218a.p231b.p239d.C2129i;
import p213q.p217b.p218a.p231b.p239d.p242n.C2214b;
import p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2215a;
import p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2216b;
import p213q.p217b.p218a.p231b.p239d.p242n.C2236f;

/* renamed from: q.b.a.b.h.b.y3 */
public final class C3172y3 extends C2214b<C3117t3> {
    public C3172y3(Context context, Looper looper, C2215a aVar, C2216b bVar) {
        C2236f a = C2236f.m5089a(context);
        C2124f fVar = C2124f.f5997b;
        C1061o.m2524b(aVar);
        C1061o.m2524b(bVar);
        super(context, looper, a, fVar, 93, aVar, bVar, null);
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo7219a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C3117t3 ? (C3117t3) queryLocalInterface : new C3139v3(iBinder);
    }

    /* renamed from: d */
    public final int mo7231d() {
        return C2129i.f5999a;
    }

    /* renamed from: r */
    public final String mo7244r() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* renamed from: s */
    public final String mo7245s() {
        return "com.google.android.gms.measurement.START";
    }
}
