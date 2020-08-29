package p213q.p217b.p218a.p231b.p239d.p242n;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.C2236f.C2237a;
import p213q.p217b.p218a.p231b.p239d.p245p.C2277a;
import p213q.p217b.p218a.p231b.p251g.p254c.C2330g;

/* renamed from: q.b.a.b.d.n.e0 */
public final class C2235e0 extends C2236f {
    @GuardedBy("connectionStatus")

    /* renamed from: c */
    public final HashMap<C2237a, C2240g0> f6183c = new HashMap<>();

    /* renamed from: d */
    public final Context f6184d;

    /* renamed from: e */
    public final Handler f6185e;

    /* renamed from: f */
    public final C2277a f6186f;

    /* renamed from: g */
    public final long f6187g;

    /* renamed from: h */
    public final long f6188h;

    public C2235e0(Context context) {
        this.f6184d = context.getApplicationContext();
        this.f6185e = new C2330g(context.getMainLooper(), new C2238f0(this, null));
        this.f6186f = C2277a.m5128a();
        this.f6187g = 5000;
        this.f6188h = 300000;
    }

    /* renamed from: a */
    public final boolean mo7267a(C2237a aVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        C1061o.m2525b(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f6183c) {
            C2240g0 g0Var = (C2240g0) this.f6183c.get(aVar);
            if (g0Var == null) {
                g0Var = new C2240g0(this, aVar);
                g0Var.f6200a.put(serviceConnection, serviceConnection);
                g0Var.mo7274a(str);
                this.f6183c.put(aVar, g0Var);
            } else {
                this.f6185e.removeMessages(0, aVar);
                if (!g0Var.f6200a.containsKey(serviceConnection)) {
                    g0Var.f6200a.put(serviceConnection, serviceConnection);
                    int i = g0Var.f6201b;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(g0Var.f6205f, g0Var.f6203d);
                    } else if (i == 2) {
                        g0Var.mo7274a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = g0Var.f6202c;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo7268b(C2237a aVar, ServiceConnection serviceConnection, String str) {
        C1061o.m2525b(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f6183c) {
            C2240g0 g0Var = (C2240g0) this.f6183c.get(aVar);
            if (g0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (g0Var.f6200a.containsKey(serviceConnection)) {
                g0Var.f6200a.remove(serviceConnection);
                if (g0Var.f6200a.isEmpty()) {
                    this.f6185e.sendMessageDelayed(this.f6185e.obtainMessage(0, aVar), this.f6187g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
