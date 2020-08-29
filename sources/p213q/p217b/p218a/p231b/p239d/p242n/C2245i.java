package p213q.p217b.p218a.p231b.p239d.p242n;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2224j;
import p213q.p217b.p218a.p231b.p251g.p254c.C2324a;
import p213q.p217b.p218a.p231b.p251g.p254c.C2326c;

/* renamed from: q.b.a.b.d.n.i */
public interface C2245i extends IInterface {

    /* renamed from: q.b.a.b.d.n.i$a */
    public static abstract class C2246a extends C2324a implements C2245i {
        public C2246a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* renamed from: a */
        public final boolean mo7278a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ((C2224j) this).mo7261a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C2326c.m5410a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                parcel.readInt();
                Bundle bundle = (Bundle) C2326c.m5410a(parcel, Bundle.CREATOR);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            } else if (i != 3) {
                return false;
            } else {
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                C2227b0 b0Var = (C2227b0) C2326c.m5410a(parcel, C2227b0.CREATOR);
                C2224j jVar = (C2224j) this;
                C1061o.m2525b(jVar.f6147a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                C1061o.m2524b(b0Var);
                jVar.f6147a.f6135u = b0Var;
                jVar.mo7261a(readInt, readStrongBinder, b0Var.f6152e);
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
