package p392u.p399q.p400c;

import p392u.p399q.C4602a;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.q.c.a */
public class C4605a extends C4602a {
    /* renamed from: a */
    public void mo10925a(Throwable th, Throwable th2) {
        if (th == null) {
            C4638h.m10271a("cause");
            throw null;
        } else if (th2 != null) {
            th.addSuppressed(th2);
        } else {
            C4638h.m10271a("exception");
            throw null;
        }
    }
}
