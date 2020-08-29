package p213q.p217b.p301c.p302a;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.c.a.n */
public final class C3842n {

    /* renamed from: a */
    public static final CopyOnWriteArrayList<C3776m> f9436a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static C3776m m9197a(String str) {
        Iterator it = f9436a.iterator();
        while (it.hasNext()) {
            C3776m mVar = (C3776m) it.next();
            if (mVar.mo10022b(str)) {
                return mVar;
            }
        }
        throw new GeneralSecurityException(C1965a.m4751a("No KMS client does support: ", str));
    }
}
