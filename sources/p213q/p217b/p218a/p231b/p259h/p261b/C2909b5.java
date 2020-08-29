package p213q.p217b.p218a.p231b.p259h.p261b;

import java.lang.Thread.UncaughtExceptionHandler;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.b5 */
public final class C2909b5 implements UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f7162a;

    /* renamed from: b */
    public final /* synthetic */ C3184z4 f7163b;

    public C2909b5(C3184z4 z4Var, String str) {
        this.f7163b = z4Var;
        C1061o.m2524b(str);
        this.f7162a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f7163b.mo8285i().f7153f.mo8433a(this.f7162a, th);
    }
}
