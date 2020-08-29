package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Collections;
import java.util.List;

/* renamed from: q.b.a.b.g.e.b7 */
public final class C2364b7 extends C2779z6 {

    /* renamed from: c */
    public static final Class<?> f6335c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C2364b7(C2385c7 c7Var) {
        super(null);
    }

    /* renamed from: a */
    public final void mo7412a(Object obj, long j) {
        Object obj2;
        List list = (List) C2366b9.m5496f(obj, j);
        if (list instanceof C2347a7) {
            obj2 = ((C2347a7) list).mo7402e();
        } else if (!f6335c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C2780z7) || !(list instanceof C2635q6)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C2635q6 q6Var = (C2635q6) list;
                if (q6Var.mo7387a()) {
                    q6Var.mo7391b();
                }
                return;
            }
        } else {
            return;
        }
        C2366b9.m5485a(obj, j, obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void mo7413a(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5496f(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0035
            boolean r2 = r1 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2347a7
            if (r2 == 0) goto L_0x0020
            q.b.a.b.g.e.x6 r1 = new q.b.a.b.g.e.x6
            r1.<init>(r0)
            goto L_0x0083
        L_0x0020:
            boolean r2 = r1 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2780z7
            if (r2 == 0) goto L_0x002f
            boolean r2 = r1 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2635q6
            if (r2 == 0) goto L_0x002f
            q.b.a.b.g.e.q6 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2635q6) r1
            q.b.a.b.g.e.q6 r0 = r1.mo7414a(r0)
            goto L_0x0082
        L_0x002f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L_0x0083
        L_0x0035:
            java.lang.Class<?> r2 = f6335c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x004f
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            goto L_0x0066
        L_0x004f:
            boolean r2 = r1 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2718v8
            if (r2 == 0) goto L_0x0068
            q.b.a.b.g.e.x6 r2 = new q.b.a.b.g.e.x6
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            q.b.a.b.g.e.v8 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2718v8) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
        L_0x0066:
            r1 = r2
            goto L_0x0083
        L_0x0068:
            boolean r2 = r1 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2780z7
            if (r2 == 0) goto L_0x0086
            boolean r2 = r1 instanceof p213q.p217b.p218a.p231b.p251g.p256e.C2635q6
            if (r2 == 0) goto L_0x0086
            r2 = r1
            q.b.a.b.g.e.q6 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2635q6) r2
            boolean r3 = r2.mo7387a()
            if (r3 != 0) goto L_0x0086
            int r1 = r1.size()
            int r1 = r1 + r0
            q.b.a.b.g.e.q6 r0 = r2.mo7414a(r1)
        L_0x0082:
            r1 = r0
        L_0x0083:
            p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5485a(r5, r7, r1)
        L_0x0086:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0095
            if (r2 <= 0) goto L_0x0095
            r1.addAll(r6)
        L_0x0095:
            if (r0 <= 0) goto L_0x0098
            r6 = r1
        L_0x0098:
            p213q.p217b.p218a.p231b.p251g.p256e.C2366b9.m5485a(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2364b7.mo7413a(java.lang.Object, java.lang.Object, long):void");
    }
}
