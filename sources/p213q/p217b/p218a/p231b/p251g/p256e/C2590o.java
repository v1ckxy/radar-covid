package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: q.b.a.b.g.e.o */
public final class C2590o implements ThreadFactory {

    /* renamed from: e */
    public ThreadFactory f6755e = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f6755e.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
