package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.m4 */
public class C3041m4 extends BroadcastReceiver {

    /* renamed from: a */
    public final C3033l9 f7561a;

    /* renamed from: b */
    public boolean f7562b;

    /* renamed from: c */
    public boolean f7563c;

    static {
        Class<C3041m4> cls = C3041m4.class;
    }

    public C3041m4(C3033l9 l9Var) {
        C1061o.m2524b(l9Var);
        this.f7561a = l9Var;
    }

    /* renamed from: a */
    public final void mo8644a() {
        this.f7561a.mo8623m();
        this.f7561a.mo8283g().mo8279c();
        this.f7561a.mo8283g().mo8279c();
        if (this.f7562b) {
            this.f7561a.mo8285i().f7161n.mo8432a("Unregistering connectivity change receiver");
            this.f7562b = false;
            this.f7563c = false;
            try {
                this.f7561a.f7537i.f7332a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f7561a.mo8285i().f7153f.mo8433a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f7561a.mo8623m();
        String action = intent.getAction();
        this.f7561a.mo8285i().f7161n.mo8433a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean s = this.f7561a.mo8616c().mo8452s();
            if (this.f7563c != s) {
                this.f7563c = s;
                C3184z4 g = this.f7561a.mo8283g();
                C3028l4 l4Var = new C3028l4(this, s);
                g.mo8846n();
                C1061o.m2524b(l4Var);
                g.mo8843a(new C2945e5<>(g, l4Var, "Task exception on worker thread"));
            }
            return;
        }
        this.f7561a.mo8285i().f7156i.mo8433a("NetworkBroadcastReceiver received unknown action", action);
    }
}
