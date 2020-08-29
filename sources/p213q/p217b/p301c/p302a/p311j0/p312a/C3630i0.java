package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.Collections;
import java.util.List;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i;

/* renamed from: q.b.c.a.j0.a.i0 */
public abstract class C3630i0 {

    /* renamed from: a */
    public static final C3630i0 f9027a = new C3632b(null);

    /* renamed from: b */
    public static final C3630i0 f9028b = new C3633c(null);

    /* renamed from: q.b.c.a.j0.a.i0$b */
    public static final class C3632b extends C3630i0 {

        /* renamed from: c */
        public static final Class<?> f9029c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public /* synthetic */ C3632b(C3631a aVar) {
            super(null);
        }

        /* renamed from: a */
        public void mo9655a(Object obj, long j) {
            Object obj2;
            List list = (List) C3691q1.m8828h(obj, j);
            if (list instanceof C3627h0) {
                obj2 = ((C3627h0) list).mo9637n();
            } else if (!f9029c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C3592a1) || !(list instanceof C3603i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C3603i iVar = (C3603i) list;
                    if (iVar.mo9531s()) {
                        iVar.mo9530j();
                    }
                    return;
                }
            } else {
                return;
            }
            C3691q1.f9140f.mo9905a(obj, j, obj2);
        }

        /* renamed from: b */
        public <L> List<L> mo9657b(Object obj, long j) {
            return m8327a(obj, j, 10);
        }

        /* renamed from: a */
        public <E> void mo9656a(Object obj, Object obj2, long j) {
            List list = (List) C3691q1.m8828h(obj2, j);
            List a = m8327a(obj, j, list.size());
            int size = a.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                a.addAll(list);
            }
            if (size > 0) {
                list = a;
            }
            C3691q1.f9140f.mo9905a(obj, j, (Object) list);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
        /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<L>] */
        /* JADX WARNING: type inference failed for: r1v6 */
        /* JADX WARNING: type inference failed for: r6v2, types: [q.b.c.a.j0.a.b0$i] */
        /* JADX WARNING: type inference failed for: r1v9 */
        /* JADX WARNING: type inference failed for: r0v7 */
        /* JADX WARNING: type inference failed for: r6v4 */
        /* JADX WARNING: type inference failed for: r0v8 */
        /* JADX WARNING: type inference failed for: r0v9, types: [java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r6v5, types: [q.b.c.a.j0.a.b0$i] */
        /* JADX WARNING: type inference failed for: r0v11, types: [q.b.c.a.j0.a.g0] */
        /* JADX WARNING: type inference failed for: r0v12 */
        /* JADX WARNING: type inference failed for: r6v6 */
        /* JADX WARNING: type inference failed for: r1v14 */
        /* JADX WARNING: type inference failed for: r1v15 */
        /* JADX WARNING: type inference failed for: r0v13 */
        /* JADX WARNING: type inference failed for: r6v7 */
        /* JADX WARNING: type inference failed for: r0v14 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 8 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <L> java.util.List<L> m8327a(java.lang.Object r3, long r4, int r6) {
            /*
                java.lang.Object r0 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.m8828h(r3, r4)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002c
                boolean r1 = r0 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3627h0
                if (r1 == 0) goto L_0x0016
                q.b.c.a.j0.a.g0 r0 = new q.b.c.a.j0.a.g0
                r0.<init>(r6)
                goto L_0x005f
            L_0x0016:
                boolean r1 = r0 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3592a1
                if (r1 == 0) goto L_0x0026
                boolean r1 = r0 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i
                if (r1 == 0) goto L_0x0026
                q.b.c.a.j0.a.b0$i r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i) r0
                q.b.c.a.j0.a.b0$i r6 = r0.mo9516b(r6)
            L_0x0024:
                r0 = r6
                goto L_0x005f
            L_0x0026:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
                goto L_0x005f
            L_0x002c:
                java.lang.Class<?> r1 = f9029c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x0047
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
            L_0x0045:
                r0 = r1
                goto L_0x005f
            L_0x0047:
                boolean r1 = r0 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3686p1
                if (r1 == 0) goto L_0x0065
                q.b.c.a.j0.a.g0 r1 = new q.b.c.a.j0.a.g0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                q.b.c.a.j0.a.p1 r0 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3686p1) r0
                int r6 = r1.size()
                r1.addAll(r6, r0)
                goto L_0x0045
            L_0x005f:
                q.b.c.a.j0.a.q1$e r6 = p213q.p217b.p301c.p302a.p311j0.p312a.C3691q1.f9140f
                r6.mo9905a(r3, r4, r0)
                goto L_0x0080
            L_0x0065:
                boolean r1 = r0 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3592a1
                if (r1 == 0) goto L_0x0080
                boolean r1 = r0 instanceof p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i
                if (r1 == 0) goto L_0x0080
                r1 = r0
                q.b.c.a.j0.a.b0$i r1 = (p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3603i) r1
                boolean r2 = r1.mo9531s()
                if (r2 != 0) goto L_0x0080
                int r0 = r0.size()
                int r0 = r0 + r6
                q.b.c.a.j0.a.b0$i r6 = r1.mo9516b(r0)
                goto L_0x0024
            L_0x0080:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p311j0.p312a.C3630i0.C3632b.m8327a(java.lang.Object, long, int):java.util.List");
        }
    }

    /* renamed from: q.b.c.a.j0.a.i0$c */
    public static final class C3633c extends C3630i0 {
        public /* synthetic */ C3633c(C3631a aVar) {
            super(null);
        }

        /* renamed from: c */
        public static <E> C3603i<E> m8331c(Object obj, long j) {
            return (C3603i) C3691q1.m8828h(obj, j);
        }

        /* renamed from: a */
        public void mo9655a(Object obj, long j) {
            m8331c(obj, j).mo9530j();
        }

        /* renamed from: a */
        public <E> void mo9656a(Object obj, Object obj2, long j) {
            C3603i c = m8331c(obj, j);
            C3603i c2 = m8331c(obj2, j);
            int size = c.size();
            int size2 = c2.size();
            if (size > 0 && size2 > 0) {
                if (!c.mo9531s()) {
                    c = c.mo9516b(size2 + size);
                }
                c.addAll(c2);
            }
            if (size > 0) {
                c2 = c;
            }
            C3691q1.f9140f.mo9905a(obj, j, (Object) c2);
        }

        /* renamed from: b */
        public <L> List<L> mo9657b(Object obj, long j) {
            C3603i c = m8331c(obj, j);
            if (c.mo9531s()) {
                return c;
            }
            int size = c.size();
            C3603i b = c.mo9516b(size == 0 ? 10 : size * 2);
            C3691q1.f9140f.mo9905a(obj, j, (Object) b);
            return b;
        }
    }

    public /* synthetic */ C3630i0(C3631a aVar) {
    }

    /* renamed from: a */
    public abstract void mo9655a(Object obj, long j);

    /* renamed from: a */
    public abstract <L> void mo9656a(Object obj, Object obj2, long j);

    /* renamed from: b */
    public abstract <L> List<L> mo9657b(Object obj, long j);
}
