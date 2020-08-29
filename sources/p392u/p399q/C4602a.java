package p392u.p399q;

import java.lang.reflect.Method;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.q.a */
public class C4602a {

    /* renamed from: u.q.a$a */
    public static final class C4603a {

        /* renamed from: a */
        public static final Method f10816a;

        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v5 */
        /* JADX WARNING: type inference failed for: r5v7 */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
            if (p392u.p401r.p403c.C4638h.m10272a(r5, (java.lang.Object) r0) != false) goto L_0x003b;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableClass.methods"
                p392u.p401r.p403c.C4638h.m10270a(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x000e:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = "it"
                p392u.p401r.p403c.C4638h.m10270a(r6, r7)
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = p392u.p401r.p403c.C4638h.m10272a(r7, r8)
                r8 = 1
                if (r7 == 0) goto L_0x003a
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                p392u.p401r.p403c.C4638h.m10270a(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L_0x0033
                r5 = r7[r3]
            L_0x0033:
                boolean r5 = p392u.p401r.p403c.C4638h.m10272a(r5, r0)
                if (r5 == 0) goto L_0x003a
                goto L_0x003b
            L_0x003a:
                r8 = r3
            L_0x003b:
                if (r8 == 0) goto L_0x003f
                r5 = r6
                goto L_0x0042
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x000e
            L_0x0042:
                f10816a = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p392u.p399q.C4602a.C4603a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo10925a(Throwable th, Throwable th2) {
        if (th == null) {
            C4638h.m10271a("cause");
            throw null;
        } else if (th2 != null) {
            Method method = C4603a.f10816a;
            if (method != null) {
                method.invoke(th, new Object[]{th2});
            }
        } else {
            C4638h.m10271a("exception");
            throw null;
        }
    }
}
