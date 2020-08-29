package p119o.p120a;

import java.util.concurrent.CancellationException;
import p392u.p401r.p403c.C4638h;

/* renamed from: o.a.b1 */
public final class C0920b1 extends CancellationException {

    /* renamed from: e */
    public final C0916a1 f2516e;

    public C0920b1(String str, Throwable th, C0916a1 a1Var) {
        super(str);
        this.f2516e = a1Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r3.getCause(), (java.lang.Object) getCause()) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r3 == r2) goto L_0x0031
            boolean r0 = r3 instanceof p119o.p120a.C0920b1
            if (r0 == 0) goto L_0x002f
            o.a.b1 r3 = (p119o.p120a.C0920b1) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x002f
            o.a.a1 r0 = r3.f2516e
            o.a.a1 r1 = r2.f2516e
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x002f
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r0 = r2.getCause()
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r3, r0)
            if (r3 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = 0
            goto L_0x0032
        L_0x0031:
            r3 = 1
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C0920b1.equals(java.lang.Object):boolean");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            int hashCode = (this.f2516e.hashCode() + (message.hashCode() * 31)) * 31;
            Throwable cause = getCause();
            return hashCode + (cause != null ? cause.hashCode() : 0);
        }
        C4638h.m10269a();
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.f2516e);
        return sb.toString();
    }
}
