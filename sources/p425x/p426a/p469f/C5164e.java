package p425x.p426a.p469f;

import java.security.PrivilegedAction;
import java.security.Security;

/* renamed from: x.a.f.e */
public final class C5164e implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f12352a;

    public C5164e(String str) {
        this.f12352a = str;
    }

    public Object run() {
        return Security.getProperty(this.f12352a);
    }
}
