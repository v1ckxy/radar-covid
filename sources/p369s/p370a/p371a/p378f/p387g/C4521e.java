package p369s.p370a.p371a.p378f.p387g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: s.a.a.f.g.e */
public final class C4521e extends AtomicLong implements ThreadFactory {

    /* renamed from: e */
    public final String f10714e;

    /* renamed from: f */
    public final int f10715f;

    /* renamed from: g */
    public final boolean f10716g;

    /* renamed from: s.a.a.f.g.e$a */
    public static final class C4522a extends Thread {
        public C4522a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public C4521e(String str) {
        this.f10714e = str;
        this.f10715f = 5;
        this.f10716g = false;
    }

    public C4521e(String str, int i, boolean z) {
        this.f10714e = str;
        this.f10715f = i;
        this.f10716g = z;
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder(this.f10714e);
        sb.append('-');
        sb.append(incrementAndGet());
        String sb2 = sb.toString();
        Thread aVar = this.f10716g ? new C4522a(runnable, sb2) : new Thread(runnable, sb2);
        aVar.setPriority(this.f10715f);
        aVar.setDaemon(true);
        return aVar;
    }

    public String toString() {
        return C1965a.m4754a(C1965a.m4756a("RxThreadFactory["), this.f10714e, "]");
    }

    public C4521e(String str, int i) {
        this.f10714e = str;
        this.f10715f = i;
        this.f10716g = false;
    }
}
