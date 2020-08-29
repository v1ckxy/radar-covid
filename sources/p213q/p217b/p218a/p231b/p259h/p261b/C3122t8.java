package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.Intent;

/* renamed from: q.b.a.b.h.b.t8 */
public final /* synthetic */ class C3122t8 implements Runnable {

    /* renamed from: e */
    public final C3133u8 f7874e;

    /* renamed from: f */
    public final int f7875f;

    /* renamed from: g */
    public final C2908b4 f7876g;

    /* renamed from: h */
    public final Intent f7877h;

    public C3122t8(C3133u8 u8Var, int i, C2908b4 b4Var, Intent intent) {
        this.f7874e = u8Var;
        this.f7875f = i;
        this.f7876g = b4Var;
        this.f7877h = intent;
    }

    public final void run() {
        C3133u8 u8Var = this.f7874e;
        int i = this.f7875f;
        C2908b4 b4Var = this.f7876g;
        Intent intent = this.f7877h;
        if (((C3177y8) u8Var.f7906a).mo1564a(i)) {
            b4Var.f7161n.mo8433a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            u8Var.mo8754a().f7161n.mo8432a("Completed wakeful intent.");
            ((C3177y8) u8Var.f7906a).mo1563a(intent);
        }
    }
}
