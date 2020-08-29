package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p251g.p256e.C2380c2;
import p213q.p217b.p218a.p231b.p251g.p256e.C2596o4;

/* renamed from: q.b.a.b.h.b.w4 */
public final class C3151w4 implements ServiceConnection {

    /* renamed from: a */
    public final String f7934a;

    /* renamed from: b */
    public final /* synthetic */ C3118t4 f7935b;

    public C3151w4(C3118t4 t4Var, String str) {
        this.f7935b = t4Var;
        this.f7934a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f7935b.f7861a.mo8285i().f7156i.mo8432a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            C2380c2 a = C2596o4.m6200a(iBinder);
            if (a == null) {
                this.f7935b.f7861a.mo8285i().f7156i.mo8432a("Install Referrer Service implementation was not found");
                return;
            }
            this.f7935b.f7861a.mo8285i().f7161n.mo8432a("Install Referrer Service connected");
            C3184z4 g = this.f7935b.f7861a.mo8283g();
            C3140v4 v4Var = new C3140v4(this, a, this);
            g.mo8846n();
            C1061o.m2524b(v4Var);
            g.mo8843a(new C2945e5<>(g, v4Var, "Task exception on worker thread"));
        } catch (Exception e) {
            this.f7935b.f7861a.mo8285i().f7156i.mo8433a("Exception occurred while calling Install Referrer API", e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f7935b.f7861a.mo8285i().f7161n.mo8432a("Install Referrer Service disconnected");
    }
}
