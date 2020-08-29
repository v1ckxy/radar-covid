package p213q.p217b.p218a.p231b.p270l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p213q.p217b.p218a.p231b.p251g.p258g.C2888a;

/* renamed from: q.b.a.b.l.k */
public final class C3259k {

    /* renamed from: a */
    public static final Executor f8131a = new C3260a();

    /* renamed from: b */
    public static final Executor f8132b = new C3248e0();

    /* renamed from: q.b.a.b.l.k$a */
    public static final class C3260a implements Executor {

        /* renamed from: e */
        public final Handler f8133e = new C2888a(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f8133e.post(runnable);
        }
    }
}
