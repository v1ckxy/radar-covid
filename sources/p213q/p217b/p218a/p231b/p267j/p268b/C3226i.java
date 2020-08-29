package p213q.p217b.p218a.p231b.p267j.p268b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p213q.p217b.p218a.p231b.p251g.p253b.C2321b;
import p213q.p217b.p218a.p231b.p251g.p253b.C2322c;

/* renamed from: q.b.a.b.j.b.i */
public final class C3226i extends C2321b implements C3223f {
    public C3226i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo8899a(C3229l lVar, C3221d dVar) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6287b);
        C2322c.m5406a(obtain, (Parcelable) lVar);
        if (dVar == null) {
            iBinder = null;
        } else {
            iBinder = dVar.asBinder();
        }
        obtain.writeStrongBinder(iBinder);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.f6286a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
