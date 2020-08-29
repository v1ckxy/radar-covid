package p213q.p217b.p317d.p347l;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: q.b.d.l.n */
public final class C4247n {

    /* renamed from: a */
    public final Messenger f10225a;

    /* renamed from: b */
    public final C4256r0 f10226b;

    public C4247n(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f10225a = new Messenger(iBinder);
            this.f10226b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f10226b = new C4256r0(iBinder);
            this.f10225a = null;
        } else {
            String str = "Invalid interface descriptor: ";
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }
}
