package p213q.p217b.p218a.p231b.p267j.p268b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p234b.p235a.p236a.p237a.C2109a;
import p213q.p217b.p218a.p231b.p239d.C2129i;
import p213q.p217b.p218a.p231b.p239d.p240m.C2150d.C2151a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2150d.C2152b;
import p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2217c;
import p213q.p217b.p218a.p231b.p239d.p242n.C2214b.C2218d;
import p213q.p217b.p218a.p231b.p239d.p242n.C2228c;
import p213q.p217b.p218a.p231b.p239d.p242n.C2234e;
import p213q.p217b.p218a.p231b.p239d.p242n.C2271w;
import p213q.p217b.p218a.p231b.p267j.C3235f;

/* renamed from: q.b.a.b.j.b.a */
public class C3218a extends C2234e<C3223f> implements C3235f {

    /* renamed from: A */
    public final C2228c f8081A;

    /* renamed from: B */
    public final Bundle f8082B;

    /* renamed from: C */
    public final Integer f8083C;

    /* renamed from: z */
    public final boolean f8084z;

    public C3218a(Context context, Looper looper, boolean z, C2228c cVar, Bundle bundle, C2151a aVar, C2152b bVar) {
        super(context, looper, 44, cVar, aVar, bVar);
        this.f8084z = z;
        this.f8081A = cVar;
        this.f8082B = bundle;
        this.f8083C = cVar.f6162h;
    }

    /* renamed from: a */
    public /* synthetic */ IInterface mo7219a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C3223f ? (C3223f) queryLocalInterface : new C3226i(iBinder);
    }

    /* renamed from: a */
    public final void mo8894a(C3221d dVar) {
        C1061o.m2525b(dVar, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account account = this.f8081A.f6155a;
            String str = "<<default account>>";
            if (account == null) {
                account = new Account(str, "com.google");
            }
            GoogleSignInAccount googleSignInAccount = null;
            if (str.equals(account.name)) {
                googleSignInAccount = C2109a.m4900a(this.f6117c).mo7086a();
            }
            Integer num = this.f8083C;
            C1061o.m2524b(num);
            ((C3223f) mo7243q()).mo8899a(new C3229l(new C2271w(account, num.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e) {
            String str2 = "SignInClientImpl";
            Log.w(str2, "Remote service probably died when signIn is called");
            try {
                dVar.mo7146a(new C3231n());
            } catch (RemoteException unused) {
                Log.wtf(str2, "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: d */
    public int mo7231d() {
        return C2129i.f5999a;
    }

    /* renamed from: j */
    public boolean mo7237j() {
        return this.f8084z;
    }

    /* renamed from: k */
    public final void mo8895k() {
        mo7224a((C2217c) new C2218d());
    }

    /* renamed from: o */
    public Bundle mo7241o() {
        if (!this.f6117c.getPackageName().equals(this.f8081A.f6159e)) {
            this.f8082B.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f8081A.f6159e);
        }
        return this.f8082B;
    }

    /* renamed from: r */
    public String mo7244r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: s */
    public String mo7245s() {
        return "com.google.android.gms.signin.service.START";
    }
}
