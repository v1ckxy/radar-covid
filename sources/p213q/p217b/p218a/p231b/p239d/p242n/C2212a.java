package p213q.p217b.p218a.p231b.p239d.p242n;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.C2241h.C2242a;

/* renamed from: q.b.a.b.d.n.a */
public class C2212a extends C2242a {
    /* renamed from: a */
    public static Account m5030a(C2241h hVar) {
        Account account;
        if (hVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = hVar.mo7277a();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
            C1061o.m2524b(account);
            return account;
        }
        account = null;
        C1061o.m2524b(account);
        return account;
    }
}
