package p213q.p217b.p218a.p231b.p239d.p240m.p241k;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p213q.p217b.p218a.p231b.p251g.p253b.C2320a;
import p213q.p217b.p218a.p231b.p251g.p253b.C2321b;
import p213q.p217b.p218a.p231b.p251g.p253b.C2322c;

/* renamed from: q.b.a.b.d.m.k.g */
public interface C2176g extends IInterface {

    /* renamed from: q.b.a.b.d.m.k.g$a */
    public static abstract class C2177a extends C2320a implements C2176g {

        /* renamed from: q.b.a.b.d.m.k.g$a$a */
        public static class C2178a extends C2321b implements C2176g {
            public C2178a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
            }

            /* renamed from: a */
            public final void mo7193a(Status status) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f6287b);
                C2322c.m5406a(obtain, (Parcelable) status);
                try {
                    this.f6286a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C2177a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        /* renamed from: a */
        public static C2176g m4999a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return queryLocalInterface instanceof C2176g ? (C2176g) queryLocalInterface : new C2178a(iBinder);
        }

        /* renamed from: a */
        public final boolean mo7194a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            mo7193a((Status) C2322c.m5405a(parcel, Status.CREATOR));
            return true;
        }
    }

    /* renamed from: a */
    void mo7193a(Status status);
}
