package p213q.p217b.p218a.p231b.p251g.p257f;

import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: q.b.a.b.g.f.c2 */
public final class C2798c2 {

    /* renamed from: a */
    public final ExecutorService f7021a;

    /* renamed from: b */
    public volatile InputStream f7022b = null;

    public C2798c2() {
        C2883y0 y0Var = C2872v0.f7101a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7021a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
