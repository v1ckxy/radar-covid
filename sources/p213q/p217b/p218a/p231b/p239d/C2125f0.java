package p213q.p217b.p218a.p231b.p239d;

import java.util.concurrent.Callable;

/* renamed from: q.b.a.b.d.f0 */
public final class C2125f0 extends C2120d0 {

    /* renamed from: e */
    public final Callable<String> f5998e;

    public /* synthetic */ C2125f0(Callable callable, C2127g0 g0Var) {
        super(false, null, null);
        this.f5998e = callable;
    }

    /* renamed from: a */
    public final String mo7108a() {
        try {
            return (String) this.f5998e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
