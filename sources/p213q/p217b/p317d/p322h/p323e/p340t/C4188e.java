package p213q.p217b.p317d.p322h.p323e.p340t;

/* renamed from: q.b.d.h.e.t.e */
public class C4188e {

    /* renamed from: a */
    public final String f10123a;

    /* renamed from: b */
    public final String f10124b;

    /* renamed from: c */
    public final StackTraceElement[] f10125c;

    /* renamed from: d */
    public final C4188e f10126d;

    public C4188e(Throwable th, C4187d dVar) {
        this.f10123a = th.getLocalizedMessage();
        this.f10124b = th.getClass().getName();
        this.f10125c = dVar.mo10383a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f10126d = cause != null ? new C4188e(cause, dVar) : null;
    }
}
