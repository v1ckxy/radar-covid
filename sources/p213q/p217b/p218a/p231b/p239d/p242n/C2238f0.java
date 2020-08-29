package p213q.p217b.p218a.p231b.p239d.p242n;

import android.content.ComponentName;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.C2236f.C2237a;

/* renamed from: q.b.a.b.d.n.f0 */
public final class C2238f0 implements Callback {

    /* renamed from: a */
    public final /* synthetic */ C2235e0 f6197a;

    public /* synthetic */ C2238f0(C2235e0 e0Var, C2233d0 d0Var) {
        this.f6197a = e0Var;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f6197a.f6183c) {
                C2237a aVar = (C2237a) message.obj;
                C2240g0 g0Var = (C2240g0) this.f6197a.f6183c.get(aVar);
                if (g0Var != null && g0Var.f6200a.isEmpty()) {
                    if (g0Var.f6202c) {
                        g0Var.f6206g.f6185e.removeMessages(1, g0Var.f6204e);
                        C2235e0 e0Var = g0Var.f6206g;
                        e0Var.f6186f.mo7298a(e0Var.f6184d, g0Var);
                        g0Var.f6202c = false;
                        g0Var.f6201b = 2;
                    }
                    this.f6197a.f6183c.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f6197a.f6183c) {
                C2237a aVar2 = (C2237a) message.obj;
                C2240g0 g0Var2 = (C2240g0) this.f6197a.f6183c.get(aVar2);
                if (g0Var2 != null && g0Var2.f6201b == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = g0Var2.f6205f;
                    if (componentName == null) {
                        componentName = aVar2.f6194c;
                    }
                    if (componentName == null) {
                        String str = aVar2.f6193b;
                        C1061o.m2524b(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    g0Var2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
