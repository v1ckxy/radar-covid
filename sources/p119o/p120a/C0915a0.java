package p119o.p120a;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p395p.C4583f;

/* renamed from: o.a.a0 */
public final class C0915a0 {

    /* renamed from: a */
    public static final List<CoroutineExceptionHandler> f2511a = C2286e.m5203a(C2286e.m5221a(C0000a.m0a()));

    /* renamed from: a */
    public static final void m2011a(C4583f fVar, Throwable th) {
        Throwable th2;
        for (CoroutineExceptionHandler handleException : f2511a) {
            try {
                handleException.handleException(fVar, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    C2286e.m5240a(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
