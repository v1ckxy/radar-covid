package p392u.p395p.p397k.p398a;

import java.io.Serializable;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4554g;
import p392u.C4560l;
import p392u.p395p.C4580d;
import p392u.p395p.p396j.C4590a;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.p.k.a.a */
public abstract class C4593a implements C4580d<Object>, C4596d, Serializable {

    /* renamed from: e */
    public final C4580d<Object> f10805e;

    public C4593a(C4580d<Object> dVar) {
        this.f10805e = dVar;
    }

    /* renamed from: a */
    public C4580d<C4560l> mo3782a(Object obj, C4580d<?> dVar) {
        if (dVar != null) {
            throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
        }
        C4638h.m10271a("completion");
        throw null;
    }

    /* renamed from: c */
    public abstract Object mo3783c(Object obj);

    /* renamed from: f */
    public void mo10916f() {
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Continuation at ");
        Object a2 = mo10915a();
        if (a2 == null) {
            a2 = getClass().getName();
        }
        a.append(a2);
        return a.toString();
    }

    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement mo10915a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Class r1 = r9.getClass()
            java.lang.Class<u.p.k.a.e> r2 = p392u.p395p.p397k.p398a.C4597e.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r2)
            u.p.k.a.e r1 = (p392u.p395p.p397k.p398a.C4597e) r1
            if (r1 == 0) goto L_0x011e
            int r2 = r1.mo10923v()
            r3 = 1
            if (r2 > r3) goto L_0x00f6
            r2 = 0
            r4 = -1
            java.lang.Class r5 = r9.getClass()     // Catch:{ Exception -> 0x003f }
            java.lang.String r6 = "label"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ Exception -> 0x003f }
            java.lang.String r6 = "field"
            p392u.p401r.p403c.C4638h.m10270a(r5, r6)     // Catch:{ Exception -> 0x003f }
            r5.setAccessible(r3)     // Catch:{ Exception -> 0x003f }
            java.lang.Object r5 = r5.get(r9)     // Catch:{ Exception -> 0x003f }
            boolean r6 = r5 instanceof java.lang.Integer     // Catch:{ Exception -> 0x003f }
            if (r6 != 0) goto L_0x0033
            r5 = r0
        L_0x0033:
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x003f }
            if (r5 == 0) goto L_0x003c
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x003f }
            goto L_0x003d
        L_0x003c:
            r5 = r2
        L_0x003d:
            int r5 = r5 - r3
            goto L_0x0040
        L_0x003f:
            r5 = r4
        L_0x0040:
            if (r5 >= 0) goto L_0x0043
            goto L_0x0049
        L_0x0043:
            int[] r3 = r1.mo10921l()
            r4 = r3[r5]
        L_0x0049:
            u.p.k.a.f r3 = p392u.p395p.p397k.p398a.C4598f.f10811c
            u.p.k.a.f$a r3 = p392u.p395p.p397k.p398a.C4598f.f10810b
            if (r3 == 0) goto L_0x0050
            goto L_0x0093
        L_0x0050:
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.String r5 = "getModule"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x008f }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x008f }
            java.lang.Class r5 = r9.getClass()     // Catch:{ Exception -> 0x008f }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Exception -> 0x008f }
            java.lang.String r6 = "java.lang.Module"
            java.lang.Class r5 = r5.loadClass(r6)     // Catch:{ Exception -> 0x008f }
            java.lang.String r6 = "getDescriptor"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x008f }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x008f }
            java.lang.Class r6 = r9.getClass()     // Catch:{ Exception -> 0x008f }
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ Exception -> 0x008f }
            java.lang.String r7 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch:{ Exception -> 0x008f }
            java.lang.String r7 = "name"
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x008f }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r8)     // Catch:{ Exception -> 0x008f }
            u.p.k.a.f$a r7 = new u.p.k.a.f$a     // Catch:{ Exception -> 0x008f }
            r7.<init>(r3, r5, r6)     // Catch:{ Exception -> 0x008f }
            p392u.p395p.p397k.p398a.C4598f.f10810b = r7     // Catch:{ Exception -> 0x008f }
            r3 = r7
            goto L_0x0093
        L_0x008f:
            u.p.k.a.f$a r3 = p392u.p395p.p397k.p398a.C4598f.f10809a
            p392u.p395p.p397k.p398a.C4598f.f10810b = r3
        L_0x0093:
            u.p.k.a.f$a r5 = p392u.p395p.p397k.p398a.C4598f.f10809a
            if (r3 != r5) goto L_0x0098
            goto L_0x00c8
        L_0x0098:
            java.lang.reflect.Method r5 = r3.f10812a
            if (r5 == 0) goto L_0x00c8
            java.lang.Class r6 = r9.getClass()
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Object r5 = r5.invoke(r6, r7)
            if (r5 == 0) goto L_0x00c8
            java.lang.reflect.Method r6 = r3.f10813b
            if (r6 == 0) goto L_0x00c8
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Object r5 = r6.invoke(r5, r7)
            if (r5 == 0) goto L_0x00c8
            java.lang.reflect.Method r3 = r3.f10814c
            if (r3 == 0) goto L_0x00bf
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r2 = r3.invoke(r5, r2)
            goto L_0x00c0
        L_0x00bf:
            r2 = r0
        L_0x00c0:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 != 0) goto L_0x00c5
            goto L_0x00c6
        L_0x00c5:
            r0 = r2
        L_0x00c6:
            java.lang.String r0 = (java.lang.String) r0
        L_0x00c8:
            if (r0 != 0) goto L_0x00cf
            java.lang.String r0 = r1.mo10919c()
            goto L_0x00e7
        L_0x00cf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r0 = 47
            r2.append(r0)
            java.lang.String r0 = r1.mo10919c()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x00e7:
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.String r3 = r1.mo10922m()
            java.lang.String r1 = r1.mo10920f()
            r2.<init>(r0, r3, r1, r4)
            r0 = r2
            goto L_0x011e
        L_0x00f6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Debug metadata version mismatch. Expected: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", got "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please update the Kotlin standard library."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x011e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p392u.p395p.p397k.p398a.C4593a.mo10915a():java.lang.StackTraceElement");
    }

    /* renamed from: a */
    public final void mo4217a(Object obj) {
        C4593a aVar = this;
        while (true) {
            C4580d<Object> dVar = aVar.f10805e;
            if (dVar != null) {
                try {
                    obj = aVar.mo3783c(obj);
                    if (obj != C4590a.COROUTINE_SUSPENDED) {
                        C4554g.m10210a(obj);
                        aVar.mo10916f();
                        if (dVar instanceof C4593a) {
                            aVar = (C4593a) dVar;
                        } else {
                            dVar.mo4217a(obj);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    obj = C2286e.m5184a(th);
                }
            } else {
                C4638h.m10269a();
                throw null;
            }
        }
    }
}
