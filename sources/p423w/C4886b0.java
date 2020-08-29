package p423w;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: w.b0 */
public class C4886b0 {

    /* renamed from: d */
    public static final C4886b0 f11649d = new C4887a();

    /* renamed from: a */
    public boolean f11650a;

    /* renamed from: b */
    public long f11651b;

    /* renamed from: c */
    public long f11652c;

    /* renamed from: w.b0$a */
    public static final class C4887a extends C4886b0 {
        /* renamed from: a */
        public C4886b0 mo11424a(long j) {
            return this;
        }

        /* renamed from: a */
        public C4886b0 mo11425a(long j, TimeUnit timeUnit) {
            if (timeUnit != null) {
                return this;
            }
            C4638h.m10271a("unit");
            throw null;
        }

        /* renamed from: e */
        public void mo11429e() {
        }
    }

    /* renamed from: a */
    public C4886b0 mo11423a() {
        this.f11650a = false;
        return this;
    }

    /* renamed from: a */
    public C4886b0 mo11424a(long j) {
        this.f11650a = true;
        this.f11651b = j;
        return this;
    }

    /* renamed from: a */
    public C4886b0 mo11425a(long j, TimeUnit timeUnit) {
        if (timeUnit != null) {
            if (j >= 0) {
                this.f11652c = timeUnit.toNanos(j);
                return this;
            }
            throw new IllegalArgumentException(C1965a.m4748a("timeout < 0: ", j).toString());
        }
        C4638h.m10271a("unit");
        throw null;
    }

    /* renamed from: b */
    public C4886b0 mo11426b() {
        this.f11652c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo11427c() {
        if (this.f11650a) {
            return this.f11651b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public boolean mo11428d() {
        return this.f11650a;
    }

    /* renamed from: e */
    public void mo11429e() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f11650a && this.f11651b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
