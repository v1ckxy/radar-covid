package p425x.p426a.p437c.p438a.p440b.p441a;

import java.security.PrivilegedAction;

/* renamed from: x.a.c.a.b.a.a */
public final class C5021a implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f11955a;

    public C5021a(String str) {
        this.f11955a = str;
    }

    public Object run() {
        try {
            return Class.forName(this.f11955a);
        } catch (Exception unused) {
            return null;
        }
    }
}
