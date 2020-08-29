package p213q.p217b.p218a.p231b.p239d.p246q.p247i;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.d.q.i.a */
public class C2290a implements ThreadFactory {

    /* renamed from: e */
    public final String f6263e;

    /* renamed from: f */
    public final ThreadFactory f6264f = Executors.defaultThreadFactory();

    public C2290a(String str) {
        C1061o.m2525b(str, (Object) "Name must not be null");
        this.f6263e = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f6264f.newThread(new C2291b(runnable, 0));
        newThread.setName(this.f6263e);
        return newThread;
    }
}
