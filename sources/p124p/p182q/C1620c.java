package p124p.p182q;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: p.q.c */
public interface C1620c extends IInterface {

    /* renamed from: p.q.c$a */
    public static abstract class C1621a extends Binder implements C1620c {

        /* renamed from: p.q.c$a$a */
        public static class C1622a implements C1620c {

            /* renamed from: a */
            public IBinder f4766a;

            public C1622a(IBinder iBinder) {
                this.f4766a = iBinder;
            }

            /* renamed from: a */
            public void mo6384a(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f4766a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4766a;
            }
        }

        public C1621a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: a */
        public static C1620c m4144a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1620c)) ? new C1622a(iBinder) : (C1620c) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = "androidx.room.IMultiInstanceInvalidationCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo6384a(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo6384a(String[] strArr);
}
