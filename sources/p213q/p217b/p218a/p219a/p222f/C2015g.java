package p213q.p217b.p218a.p219a.p222f;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;

/* renamed from: q.b.a.a.f.g */
public final class C2015g implements C4427b<Executor> {

    /* renamed from: a */
    public static final C2015g f5782a = new C2015g();

    public Object get() {
        C2016h hVar = new C2016h(Executors.newSingleThreadExecutor());
        C2286e.m5279b(hVar, "Cannot return null from a non-@Nullable @Provides method");
        return hVar;
    }
}
