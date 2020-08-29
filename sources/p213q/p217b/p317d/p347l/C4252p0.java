package p213q.p217b.p317d.p347l;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p213q.p217b.p218a.p231b.p239d.p246q.p247i.C2290a;

/* renamed from: q.b.d.l.p0 */
public final class C4252p0 {

    /* renamed from: a */
    public static final Executor f10234a = C4250o0.f10229e;

    /* renamed from: a */
    public static ExecutorService m9734a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2290a("firebase-iid-executor"));
        return threadPoolExecutor;
    }
}
