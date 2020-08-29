package p365r.p366a.p367f;

import androidx.fragment.app.Fragment;
import p365r.p366a.C4416a;
import p365r.p366a.C4420d;
import p365r.p366a.C4422e;

/* renamed from: r.a.f.c */
public abstract class C4425c extends Fragment implements C4422e {

    /* renamed from: b0 */
    public C4420d<Object> f10524b0;

    public C4425c() {
    }

    public C4425c(int i) {
        super(i);
    }

    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: type inference failed for: r0v3, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: type inference failed for: r0v4, types: [p.k.a.e, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r0v7, types: [android.app.Application] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [androidx.fragment.app.Fragment]
      assigns: [androidx.fragment.app.Fragment, ?[OBJECT, ARRAY], p.k.a.e]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], ?[OBJECT, ARRAY], androidx.fragment.app.Fragment, android.app.Activity]
      mth insns count: 44
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo790a(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "fragment"
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5279b(r6, r0)
            r0 = r6
        L_0x0006:
            androidx.fragment.app.Fragment r0 = r0.f630y
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            boolean r3 = r0 instanceof p365r.p366a.C4422e
            if (r3 == 0) goto L_0x0006
            goto L_0x0026
        L_0x0011:
            p.k.a.e r0 = r6.mo777Q()
            boolean r3 = r0 instanceof p365r.p366a.C4422e
            if (r3 == 0) goto L_0x001a
            goto L_0x0026
        L_0x001a:
            android.app.Application r3 = r0.getApplication()
            boolean r3 = r3 instanceof p365r.p366a.C4422e
            if (r3 == 0) goto L_0x0065
            android.app.Application r0 = r0.getApplication()
        L_0x0026:
            r.a.e r0 = (p365r.p366a.C4422e) r0
            r3 = 3
            java.lang.String r4 = "dagger.android.support"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L_0x0051
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            r3[r1] = r5
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            r3[r2] = r1
            java.lang.String r1 = "An injector for %s was found in %s"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            android.util.Log.d(r4, r1)
        L_0x0051:
            r.a.a r1 = r0.mo10710k()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "%s.androidInjector() returned null"
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5182a(r1, r2, r0)
            r1.mo3887a(r6)
            super.mo790a(r7)
            return
        L_0x0065:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Class r2 = r6.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            r0[r1] = r2
            java.lang.String r1 = "No injector was found for %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p365r.p366a.p367f.C4425c.mo790a(android.content.Context):void");
    }

    /* renamed from: k */
    public C4416a<Object> mo10710k() {
        return this.f10524b0;
    }
}
