package p213q.p217b.p218a.p231b.p239d;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.d.a */
public class C2113a implements ServiceConnection {

    /* renamed from: a */
    public boolean f5971a = false;

    /* renamed from: b */
    public final BlockingQueue<IBinder> f5972b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder mo7090a(long j, TimeUnit timeUnit) {
        C1061o.m2544c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f5971a) {
            this.f5971a = true;
            IBinder iBinder = (IBinder) this.f5972b.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5972b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
