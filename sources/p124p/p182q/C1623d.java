package p124p.p182q;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p124p.p182q.C1620c.C1621a;

/* renamed from: p.q.d */
public interface C1623d extends IInterface {

    /* renamed from: p.q.d$a */
    public static abstract class C1624a extends Binder implements C1623d {

        /* renamed from: p.q.d$a$a */
        public static class C1625a implements C1623d {

            /* renamed from: a */
            public IBinder f4767a;

            public C1625a(IBinder iBinder) {
                this.f4767a = iBinder;
            }

            /* renamed from: a */
            public int mo1351a(C1620c cVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4767a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1352a(int i, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f4767a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1353a(C1620c cVar, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.f4767a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4767a;
            }
        }

        public C1624a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: a */
        public static C1623d m4149a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1623d)) ? new C1625a(iBinder) : (C1623d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = "androidx.room.IMultiInstanceInvalidationService";
            if (i == 1) {
                parcel.enforceInterface(str);
                int a = mo1351a(C1621a.m4144a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(str);
                mo1353a(C1621a.m4144a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(str);
                mo1352a(parcel.readInt(), parcel.createStringArray());
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
    int mo1351a(C1620c cVar, String str);

    /* renamed from: a */
    void mo1352a(int i, String[] strArr);

    /* renamed from: a */
    void mo1353a(C1620c cVar, int i);
}
