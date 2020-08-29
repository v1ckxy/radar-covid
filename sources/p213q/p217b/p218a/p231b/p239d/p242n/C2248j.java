package p213q.p217b.p218a.p231b.p239d.p242n;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: q.b.a.b.d.n.j */
public final class C2248j implements C2250k {

    /* renamed from: a */
    public final IBinder f6207a;

    public C2248j(IBinder iBinder) {
        this.f6207a = iBinder;
    }

    /* renamed from: a */
    public final void mo7279a(C2245i iVar, C2232d dVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
            if (dVar != null) {
                obtain.writeInt(1);
                dVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6207a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f6207a;
    }
}
