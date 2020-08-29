package p213q.p217b.p218a.p231b.p251g.p257f;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Set;
import p124p.p143e.C1251c;
import p213q.p217b.p218a.p231b.p239d.C2119d;
import p213q.p217b.p218a.p231b.p239d.C2129i;
import p213q.p217b.p218a.p231b.p239d.p240m.C2150d.C2151a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2150d.C2152b;
import p213q.p217b.p218a.p231b.p239d.p242n.C2228c;
import p213q.p217b.p218a.p231b.p239d.p242n.C2234e;
import p213q.p217b.p218a.p231b.p262i.C3190a;
import p213q.p217b.p218a.p231b.p262i.C3216e;
import p213q.p217b.p218a.p231b.p262i.p263b.C3191a;

/* renamed from: q.b.a.b.g.f.p0 */
public final class C2848p0 extends C2234e<C2809f1> {

    /* renamed from: A */
    public final String f7075A = null;

    /* renamed from: B */
    public final Set<C2864t0> f7076B = new C1251c();

    /* renamed from: C */
    public final Set<C2868u0> f7077C = new C1251c();

    /* renamed from: D */
    public final Set<C2856r0> f7078D = new C1251c();

    /* renamed from: E */
    public C2798c2 f7079E;

    /* renamed from: z */
    public final long f7080z = ((long) hashCode());

    public C2848p0(Context context, Looper looper, C2228c cVar, C3191a aVar, C2151a aVar2, C2152b bVar) {
        super(context, looper, 54, cVar, aVar2, bVar);
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo7219a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        return queryLocalInterface instanceof C2809f1 ? (C2809f1) queryLocalInterface : new C2801d1(iBinder);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo7222a(IInterface iInterface) {
        C2809f1 f1Var = (C2809f1) iInterface;
        System.currentTimeMillis();
        this.f7079E = new C2798c2();
    }

    /* renamed from: c */
    public final boolean mo7230c() {
        return C3190a.m7518b(this.f6117c);
    }

    /* renamed from: d */
    public final int mo7231d() {
        return C2129i.f5999a;
    }

    /* renamed from: i */
    public final void mo7236i() {
        if (mo7227a()) {
            try {
                ((C2809f1) mo7243q()).mo8147a(new C2844o0());
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        mo8202w();
        super.mo7236i();
    }

    /* renamed from: n */
    public final C2119d[] mo7240n() {
        return new C2119d[]{C3216e.f8069b};
    }

    /* renamed from: o */
    public final Bundle mo7241o() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.f7080z);
        String str = this.f7075A;
        if (str != null) {
            bundle.putString("zeroPartyIdentifier", str);
        }
        return bundle;
    }

    /* renamed from: r */
    public final String mo7244r() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    /* renamed from: s */
    public final String mo7245s() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    /* renamed from: w */
    public final void mo8202w() {
        Iterator it = this.f7076B.iterator();
        if (!it.hasNext()) {
            Iterator it2 = this.f7077C.iterator();
            if (!it2.hasNext()) {
                Iterator it3 = this.f7078D.iterator();
                if (!it3.hasNext()) {
                    this.f7076B.clear();
                    this.f7077C.clear();
                    this.f7078D.clear();
                    C2798c2 c2Var = this.f7079E;
                    if (c2Var != null) {
                        c2Var.f7021a.shutdownNow();
                        InputStream inputStream = c2Var.f7022b;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        this.f7079E = null;
                        return;
                    }
                    return;
                }
                ((C2856r0) it3.next()).mo8213a();
                throw null;
            }
            ((C2868u0) it2.next()).mo8229a();
            throw null;
        }
        ((C2864t0) it.next()).mo8222a();
        throw null;
    }

    /* renamed from: a */
    public final void mo7220a(int i) {
        if (i == 1) {
            mo8202w();
        }
        System.currentTimeMillis();
    }
}
