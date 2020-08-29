package p213q.p217b.p317d.p347l;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: q.b.d.l.r0 */
public class C4256r0 implements Parcelable {
    public static final Creator<C4256r0> CREATOR = new C4254q0();

    /* renamed from: e */
    public Messenger f10240e;

    /* renamed from: f */
    public C4226d1 f10241f;

    /* renamed from: q.b.d.l.r0$a */
    public static final class C4257a extends ClassLoader {
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (FirebaseInstanceId.m1142h()) {
                Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            }
            return C4256r0.class;
        }
    }

    public C4256r0(IBinder iBinder) {
        this.f10240e = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder mo10449a() {
        Messenger messenger = this.f10240e;
        return messenger != null ? messenger.getBinder() : this.f10241f.asBinder();
    }

    /* renamed from: a */
    public final void mo10450a(Message message) {
        Messenger messenger = this.f10240e;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C4226d1 d1Var = this.f10241f;
        if (d1Var != null) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                d1Var.f10185a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } else {
            throw null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return mo10449a().equals(((C4256r0) obj).mo10449a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return mo10449a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f10240e;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f10241f.asBinder());
    }
}
