package p213q.p217b.p317d.p347l;

import android.content.Intent;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p270l.C3255i;

/* renamed from: q.b.d.l.f1 */
public final class C4232f1 implements C4219b0 {

    /* renamed from: a */
    public final ExecutorService f10201a;

    public C4232f1(ExecutorService executorService) {
        this.f10201a = executorService;
    }

    /* renamed from: a */
    public final C3255i<Integer> mo10405a(Intent intent) {
        return C2286e.m5211a((Executor) this.f10201a, (Callable<TResult>) new C4229e1<TResult>(intent));
    }
}
