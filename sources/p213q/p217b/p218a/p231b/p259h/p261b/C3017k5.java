package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import p116io.jsonwebtoken.lang.Objects;

/* renamed from: q.b.a.b.h.b.k5 */
public final /* synthetic */ class C3017k5 implements Runnable {

    /* renamed from: e */
    public final C2981h5 f7482e;

    /* renamed from: f */
    public final C3189z9 f7483f;

    /* renamed from: g */
    public final Bundle f7484g;

    public C3017k5(C2981h5 h5Var, C3189z9 z9Var, Bundle bundle) {
        this.f7482e = h5Var;
        this.f7483f = z9Var;
        this.f7484g = bundle;
    }

    public final void run() {
        C2981h5 h5Var = this.f7482e;
        C3189z9 z9Var = this.f7483f;
        Bundle bundle = this.f7484g;
        C2939e d = h5Var.f7375a.mo8619d();
        String str = z9Var.f8017e;
        d.mo8279c();
        d.mo8649m();
        C3011k kVar = new C3011k(d.f7133a, Objects.EMPTY_STRING, str, "dep", 0, 0, bundle);
        byte[] f = d.mo8651p().mo8738a(kVar).mo8084f();
        d.mo8285i().f7161n.mo8434a("Saving default event parameters, appId, data size", d.mo8281e().mo8834a(str), Integer.valueOf(f.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", f);
        try {
            if (d.mo8425t().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                d.mo8285i().f7153f.mo8433a("Failed to insert default event parameters (got -1). appId", C2908b4.m6745a(str));
            }
        } catch (SQLiteException e) {
            d.mo8285i().f7153f.mo8434a("Error storing default event parameters. appId", C2908b4.m6745a(str), e);
        }
    }
}
