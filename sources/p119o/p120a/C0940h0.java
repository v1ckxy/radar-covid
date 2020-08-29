package p119o.p120a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p119o.p120a.p121a.C0909n;
import p392u.p395p.C4580d;
import p392u.p395p.C4583f;

/* renamed from: o.a.h0 */
public final class C0940h0<T> extends C0909n<T> {

    /* renamed from: i */
    public static final AtomicIntegerFieldUpdater f2557i = AtomicIntegerFieldUpdater.newUpdater(C0940h0.class, "_decision");
    public volatile int _decision = 0;

    public C0940h0(C4583f fVar, C4580d<? super T> dVar) {
        super(fVar, dVar);
    }

    /* renamed from: b */
    public void mo4190b(Object obj) {
        mo4191i(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4191i(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f2557i
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            u.p.d<T> r0 = r4.f2504h
            u.p.d r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5218a(r0)
            u.p.d<T> r1 = r4.f2504h
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5183a(r5, r1)
            p119o.p120a.C0937g0.m2094a(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C0940h0.mo4191i(java.lang.Object):void");
    }
}
