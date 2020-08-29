package p425x.p426a.p445e.p456c.p458b;

import java.security.PrivilegedAction;

/* renamed from: x.a.e.c.b.b */
public final class C5125b implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f12289a;

    public C5125b(String str) {
        this.f12289a = str;
    }

    public Object run() {
        try {
            return Class.forName(this.f12289a);
        } catch (Exception unused) {
            return null;
        }
    }
}
