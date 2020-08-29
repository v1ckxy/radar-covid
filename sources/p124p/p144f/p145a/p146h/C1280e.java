package p124p.p144f.p145a.p146h;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p124p.p144f.p145a.C1267e;
import p124p.p144f.p145a.p146h.C1274c.C1277c;
import p124p.p144f.p145a.p146h.C1278d.C1279a;

/* renamed from: p.f.a.h.e */
public class C1280e extends C1290n {

    /* renamed from: A0 */
    public int f3762A0 = 0;

    /* renamed from: B0 */
    public int f3763B0 = 0;

    /* renamed from: C0 */
    public int f3764C0 = 7;

    /* renamed from: D0 */
    public boolean f3765D0 = false;

    /* renamed from: E0 */
    public boolean f3766E0 = false;

    /* renamed from: F0 */
    public boolean f3767F0 = false;

    /* renamed from: l0 */
    public boolean f3768l0 = false;

    /* renamed from: m0 */
    public C1267e f3769m0 = new C1267e();

    /* renamed from: n0 */
    public C1288m f3770n0;

    /* renamed from: o0 */
    public int f3771o0;

    /* renamed from: p0 */
    public int f3772p0;

    /* renamed from: q0 */
    public int f3773q0;

    /* renamed from: r0 */
    public int f3774r0;

    /* renamed from: s0 */
    public int f3775s0 = 0;

    /* renamed from: t0 */
    public int f3776t0 = 0;

    /* renamed from: u0 */
    public C1273b[] f3777u0 = new C1273b[4];

    /* renamed from: v0 */
    public C1273b[] f3778v0 = new C1273b[4];

    /* renamed from: w0 */
    public List<C1281f> f3779w0 = new ArrayList();

    /* renamed from: x0 */
    public boolean f3780x0 = false;

    /* renamed from: y0 */
    public boolean f3781y0 = false;

    /* renamed from: z0 */
    public boolean f3782z0 = false;

    /* renamed from: a */
    public void mo5669a(int i) {
        super.mo5669a(i);
        int size = this.f3827k0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C1278d) this.f3827k0.get(i2)).mo5669a(i);
        }
    }

    /* renamed from: a */
    public void mo5710a(C1278d dVar, int i) {
        if (i == 0) {
            int i2 = this.f3775s0 + 1;
            C1273b[] bVarArr = this.f3778v0;
            if (i2 >= bVarArr.length) {
                this.f3778v0 = (C1273b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            this.f3778v0[this.f3775s0] = new C1273b(dVar, 0, this.f3768l0);
            this.f3775s0++;
        } else if (i == 1) {
            int i3 = this.f3776t0 + 1;
            C1273b[] bVarArr2 = this.f3777u0;
            if (i3 >= bVarArr2.length) {
                this.f3777u0 = (C1273b[]) Arrays.copyOf(bVarArr2, bVarArr2.length * 2);
            }
            this.f3777u0[this.f3776t0] = new C1273b(dVar, 1, this.f3768l0);
            this.f3776t0++;
        }
    }

    /* renamed from: d */
    public void mo5711d(int i, int i2) {
        if (this.f3698C[0] != C1279a.WRAP_CONTENT) {
            C1286k kVar = this.f3726c;
            if (kVar != null) {
                kVar.mo5732a(i);
            }
        }
        if (this.f3698C[1] != C1279a.WRAP_CONTENT) {
            C1286k kVar2 = this.f3728d;
            if (kVar2 != null) {
                kVar2.mo5732a(i2);
            }
        }
    }

    /* renamed from: d */
    public boolean mo5712d(C1267e eVar) {
        mo5670a(eVar);
        int size = this.f3827k0.size();
        for (int i = 0; i < size; i++) {
            C1278d dVar = (C1278d) this.f3827k0.get(i);
            if (dVar instanceof C1280e) {
                C1279a[] aVarArr = dVar.f3698C;
                C1279a aVar = aVarArr[0];
                C1279a aVar2 = aVarArr[1];
                if (aVar == C1279a.WRAP_CONTENT) {
                    dVar.mo5686a(C1279a.FIXED);
                }
                if (aVar2 == C1279a.WRAP_CONTENT) {
                    dVar.mo5691b(C1279a.FIXED);
                }
                dVar.mo5670a(eVar);
                if (aVar == C1279a.WRAP_CONTENT) {
                    dVar.mo5686a(aVar);
                }
                if (aVar2 == C1279a.WRAP_CONTENT) {
                    dVar.mo5691b(aVar2);
                }
            } else {
                if (this.f3698C[0] != C1279a.WRAP_CONTENT && dVar.f3698C[0] == C1279a.MATCH_PARENT) {
                    int i2 = dVar.f3749s.f3673e;
                    int j = mo5705j() - dVar.f3751u.f3673e;
                    C1274c cVar = dVar.f3749s;
                    cVar.f3677i = eVar.mo5643a((Object) cVar);
                    C1274c cVar2 = dVar.f3751u;
                    cVar2.f3677i = eVar.mo5643a((Object) cVar2);
                    eVar.mo5648a(dVar.f3749s.f3677i, i2);
                    eVar.mo5648a(dVar.f3751u.f3677i, j);
                    dVar.f3722a = 2;
                    dVar.mo5681a(i2, j);
                }
                if (this.f3698C[1] != C1279a.WRAP_CONTENT && dVar.f3698C[1] == C1279a.MATCH_PARENT) {
                    int i3 = dVar.f3750t.f3673e;
                    int d = mo5696d() - dVar.f3752v.f3673e;
                    C1274c cVar3 = dVar.f3750t;
                    cVar3.f3677i = eVar.mo5643a((Object) cVar3);
                    C1274c cVar4 = dVar.f3752v;
                    cVar4.f3677i = eVar.mo5643a((Object) cVar4);
                    eVar.mo5648a(dVar.f3750t.f3677i, i3);
                    eVar.mo5648a(dVar.f3752v.f3677i, d);
                    if (dVar.f3712Q > 0 || dVar.f3720Y == 8) {
                        C1274c cVar5 = dVar.f3753w;
                        cVar5.f3677i = eVar.mo5643a((Object) cVar5);
                        eVar.mo5648a(dVar.f3753w.f3677i, dVar.f3712Q + i3);
                    }
                    dVar.f3724b = 2;
                    dVar.mo5694c(i3, d);
                }
                dVar.mo5670a(eVar);
            }
        }
        if (this.f3775s0 > 0) {
            C1061o.m2505a(this, eVar, 0);
        }
        if (this.f3776t0 > 0) {
            C1061o.m2505a(this, eVar, 1);
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo5713g(int i) {
        return (this.f3764C0 & i) == i;
    }

    /* renamed from: l */
    public void mo5707l() {
        this.f3769m0.mo5661f();
        this.f3771o0 = 0;
        this.f3773q0 = 0;
        this.f3772p0 = 0;
        this.f3774r0 = 0;
        this.f3779w0.clear();
        this.f3765D0 = false;
        super.mo5707l();
    }

    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r17v1 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r17v2 */
    /* JADX WARNING: type inference failed for: r18v1 */
    /* JADX WARNING: type inference failed for: r17v3 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r17v4 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r8v12, types: [boolean] */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: type inference failed for: r24v0 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r0v31 */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r24v1 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r0v33 */
    /* JADX WARNING: type inference failed for: r0v35 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r0v37 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: type inference failed for: r0v39 */
    /* JADX WARNING: type inference failed for: r17v5 */
    /* JADX WARNING: type inference failed for: r0v40 */
    /* JADX WARNING: type inference failed for: r17v6 */
    /* JADX WARNING: type inference failed for: r0v47 */
    /* JADX WARNING: type inference failed for: r0v49 */
    /* JADX WARNING: type inference failed for: r17v7 */
    /* JADX WARNING: type inference failed for: r0v50 */
    /* JADX WARNING: type inference failed for: r0v52 */
    /* JADX WARNING: type inference failed for: r17v8 */
    /* JADX WARNING: type inference failed for: r18v3 */
    /* JADX WARNING: type inference failed for: r18v4 */
    /* JADX WARNING: type inference failed for: r8v47 */
    /* JADX WARNING: type inference failed for: r18v5 */
    /* JADX WARNING: type inference failed for: r18v6 */
    /* JADX WARNING: type inference failed for: r18v7 */
    /* JADX WARNING: type inference failed for: r18v8 */
    /* JADX WARNING: type inference failed for: r8v57 */
    /* JADX WARNING: type inference failed for: r0v95 */
    /* JADX WARNING: type inference failed for: r0v96 */
    /* JADX WARNING: type inference failed for: r8v84 */
    /* JADX WARNING: type inference failed for: r8v85 */
    /* JADX WARNING: type inference failed for: r17v10 */
    /* JADX WARNING: type inference failed for: r17v11 */
    /* JADX WARNING: type inference failed for: r0v97 */
    /* JADX WARNING: type inference failed for: r8v86 */
    /* JADX WARNING: type inference failed for: r9v42 */
    /* JADX WARNING: type inference failed for: r8v87 */
    /* JADX WARNING: type inference failed for: r9v43 */
    /* JADX WARNING: type inference failed for: r0v98 */
    /* JADX WARNING: type inference failed for: r8v88 */
    /* JADX WARNING: type inference failed for: r8v89 */
    /* JADX WARNING: type inference failed for: r0v99 */
    /* JADX WARNING: type inference failed for: r17v12 */
    /* JADX WARNING: type inference failed for: r0v100 */
    /* JADX WARNING: type inference failed for: r0v101 */
    /* JADX WARNING: type inference failed for: r17v13 */
    /* JADX WARNING: type inference failed for: r0v102 */
    /* JADX WARNING: type inference failed for: r0v103 */
    /* JADX WARNING: type inference failed for: r17v14 */
    /* JADX WARNING: type inference failed for: r18v9 */
    /* JADX WARNING: type inference failed for: r18v10 */
    /* JADX WARNING: type inference failed for: r18v11 */
    /* JADX WARNING: type inference failed for: r18v12 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v17
      assigns: []
      uses: []
      mth insns count: 547
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
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03a7  */
    /* JADX WARNING: Unknown variable types count: 33 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5714p() {
        /*
            r25 = this;
            r1 = r25
            int r2 = r1.f3704I
            int r3 = r1.f3705J
            int r0 = r25.mo5705j()
            r4 = 0
            int r5 = java.lang.Math.max(r4, r0)
            int r0 = r25.mo5696d()
            int r6 = java.lang.Math.max(r4, r0)
            r1.f3766E0 = r4
            r1.f3767F0 = r4
            p.f.a.h.d r0 = r1.f3699D
            if (r0 == 0) goto L_0x00b3
            p.f.a.h.m r0 = r1.f3770n0
            if (r0 != 0) goto L_0x002a
            p.f.a.h.m r0 = new p.f.a.h.m
            r0.<init>(r1)
            r1.f3770n0 = r0
        L_0x002a:
            p.f.a.h.m r0 = r1.f3770n0
            r7 = 0
            if (r0 == 0) goto L_0x00b2
            int r8 = r1.f3704I
            r0.f3817a = r8
            int r8 = r1.f3705J
            r0.f3818b = r8
            int r8 = r25.mo5705j()
            r0.f3819c = r8
            int r8 = r25.mo5696d()
            r0.f3820d = r8
            java.util.ArrayList<p.f.a.h.m$a> r8 = r0.f3821e
            int r8 = r8.size()
            r9 = r4
        L_0x004a:
            if (r9 >= r8) goto L_0x0081
            java.util.ArrayList<p.f.a.h.m$a> r10 = r0.f3821e
            java.lang.Object r10 = r10.get(r9)
            p.f.a.h.m$a r10 = (p124p.p144f.p145a.p146h.C1288m.C1289a) r10
            p.f.a.h.c r11 = r10.f3822a
            p.f.a.h.c$c r11 = r11.f3671c
            p.f.a.h.c r11 = r1.mo5680a(r11)
            r10.f3822a = r11
            if (r11 == 0) goto L_0x0073
            p.f.a.h.c r12 = r11.f3672d
            r10.f3823b = r12
            int r11 = r11.mo5674a()
            r10.f3824c = r11
            p.f.a.h.c r11 = r10.f3822a
            p.f.a.h.c$b r12 = r11.f3675g
            r10.f3825d = r12
            int r11 = r11.f3676h
            goto L_0x007c
        L_0x0073:
            r10.f3823b = r7
            r10.f3824c = r4
            p.f.a.h.c$b r11 = p124p.p144f.p145a.p146h.C1274c.C1276b.STRONG
            r10.f3825d = r11
            r11 = r4
        L_0x007c:
            r10.f3826e = r11
            int r9 = r9 + 1
            goto L_0x004a
        L_0x0081:
            int r0 = r1.f3771o0
            r1.f3704I = r0
            int r0 = r1.f3772p0
            r1.f3705J = r0
            p.f.a.h.d r0 = r1.f3699D
            if (r0 == 0) goto L_0x0093
            boolean r7 = r0 instanceof p124p.p144f.p145a.p146h.C1280e
            if (r7 == 0) goto L_0x0093
            p.f.a.h.e r0 = (p124p.p144f.p145a.p146h.C1280e) r0
        L_0x0093:
            java.util.ArrayList<p.f.a.h.c> r0 = r1.f3697B
            int r0 = r0.size()
            r7 = r4
        L_0x009a:
            if (r7 >= r0) goto L_0x00aa
            java.util.ArrayList<p.f.a.h.c> r8 = r1.f3697B
            java.lang.Object r8 = r8.get(r7)
            p.f.a.h.c r8 = (p124p.p144f.p145a.p146h.C1274c) r8
            r8.mo5677c()
            int r7 = r7 + 1
            goto L_0x009a
        L_0x00aa:
            p.f.a.e r0 = r1.f3769m0
            p.f.a.c r0 = r0.f3626l
            r1.mo5683a(r0)
            goto L_0x00b7
        L_0x00b2:
            throw r7
        L_0x00b3:
            r1.f3704I = r4
            r1.f3705J = r4
        L_0x00b7:
            int r0 = r1.f3764C0
            r7 = 8
            r8 = 32
            r9 = 1
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r1.mo5713g(r7)
            if (r0 != 0) goto L_0x00c9
            r25.mo5715q()
        L_0x00c9:
            boolean r0 = r1.mo5713g(r8)
            if (r0 != 0) goto L_0x00dd
            boolean r0 = r1.mo5713g(r7)
            if (r0 != 0) goto L_0x00da
            int r0 = r1.f3764C0
            r1.mo5669a(r0)
        L_0x00da:
            r25.mo5718t()
        L_0x00dd:
            p.f.a.e r0 = r1.f3769m0
            r0.f3621g = r9
            goto L_0x00e6
        L_0x00e2:
            p.f.a.e r0 = r1.f3769m0
            r0.f3621g = r4
        L_0x00e6:
            p.f.a.h.d$a[] r0 = r1.f3698C
            r10 = r0[r9]
            r11 = r0[r4]
            r25.mo5717s()
            java.util.List<p.f.a.h.f> r0 = r1.f3779w0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0108
            java.util.List<p.f.a.h.f> r0 = r1.f3779w0
            r0.clear()
            java.util.List<p.f.a.h.f> r0 = r1.f3779w0
            p.f.a.h.f r12 = new p.f.a.h.f
            java.util.ArrayList<p.f.a.h.d> r13 = r1.f3827k0
            r12.<init>(r13)
            r0.add(r4, r12)
        L_0x0108:
            java.util.List<p.f.a.h.f> r0 = r1.f3779w0
            int r12 = r0.size()
            java.util.ArrayList<p.f.a.h.d> r13 = r1.f3827k0
            p.f.a.h.d$a r0 = r25.mo5698e()
            p.f.a.h.d$a r14 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r0 == r14) goto L_0x0123
            p.f.a.h.d$a r0 = r25.mo5704i()
            p.f.a.h.d$a r14 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r0 != r14) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r14 = r4
            goto L_0x0124
        L_0x0123:
            r14 = r9
        L_0x0124:
            r0 = r4
            r15 = r0
        L_0x0126:
            if (r15 >= r12) goto L_0x042d
            boolean r7 = r1.f3765D0
            if (r7 != 0) goto L_0x042d
            java.util.List<p.f.a.h.f> r7 = r1.f3779w0
            java.lang.Object r7 = r7.get(r15)
            p.f.a.h.f r7 = (p124p.p144f.p145a.p146h.C1281f) r7
            boolean r7 = r7.f3786d
            if (r7 == 0) goto L_0x013e
            r22 = r3
            r19 = r12
            goto L_0x041f
        L_0x013e:
            boolean r7 = r1.mo5713g(r8)
            if (r7 == 0) goto L_0x01ac
            p.f.a.h.d$a r7 = r25.mo5698e()
            p.f.a.h.d$a r8 = p124p.p144f.p145a.p146h.C1278d.C1279a.FIXED
            if (r7 != r8) goto L_0x019e
            p.f.a.h.d$a r7 = r25.mo5704i()
            p.f.a.h.d$a r8 = p124p.p144f.p145a.p146h.C1278d.C1279a.FIXED
            if (r7 != r8) goto L_0x019e
            java.util.List<p.f.a.h.f> r7 = r1.f3779w0
            java.lang.Object r7 = r7.get(r15)
            p.f.a.h.f r7 = (p124p.p144f.p145a.p146h.C1281f) r7
            java.util.List<p.f.a.h.d> r8 = r7.f3792j
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0165
            goto L_0x019b
        L_0x0165:
            java.util.List<p.f.a.h.d> r8 = r7.f3783a
            int r8 = r8.size()
        L_0x016b:
            if (r4 >= r8) goto L_0x0188
            java.util.List<p.f.a.h.d> r9 = r7.f3783a
            java.lang.Object r9 = r9.get(r4)
            p.f.a.h.d r9 = (p124p.p144f.p145a.p146h.C1278d) r9
            r17 = r8
            boolean r8 = r9.f3725b0
            if (r8 != 0) goto L_0x0182
            java.util.List<p.f.a.h.d> r8 = r7.f3792j
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r7.mo5719a(r8, r9)
        L_0x0182:
            int r4 = r4 + 1
            r8 = r17
            r9 = 1
            goto L_0x016b
        L_0x0188:
            java.util.List<p.f.a.h.d> r4 = r7.f3793k
            r4.clear()
            java.util.List<p.f.a.h.d> r4 = r7.f3793k
            java.util.List<p.f.a.h.d> r8 = r7.f3783a
            r4.addAll(r8)
            java.util.List<p.f.a.h.d> r4 = r7.f3793k
            java.util.List<p.f.a.h.d> r8 = r7.f3792j
            r4.removeAll(r8)
        L_0x019b:
            java.util.List<p.f.a.h.d> r4 = r7.f3792j
            goto L_0x01a8
        L_0x019e:
            java.util.List<p.f.a.h.f> r4 = r1.f3779w0
            java.lang.Object r4 = r4.get(r15)
            p.f.a.h.f r4 = (p124p.p144f.p145a.p146h.C1281f) r4
            java.util.List<p.f.a.h.d> r4 = r4.f3783a
        L_0x01a8:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r1.f3827k0 = r4
        L_0x01ac:
            r25.mo5717s()
            java.util.ArrayList<p.f.a.h.d> r4 = r1.f3827k0
            int r4 = r4.size()
            r7 = 0
        L_0x01b6:
            if (r7 >= r4) goto L_0x01cc
            java.util.ArrayList<p.f.a.h.d> r8 = r1.f3827k0
            java.lang.Object r8 = r8.get(r7)
            p.f.a.h.d r8 = (p124p.p144f.p145a.p146h.C1278d) r8
            boolean r9 = r8 instanceof p124p.p144f.p145a.p146h.C1290n
            if (r9 == 0) goto L_0x01c9
            p.f.a.h.n r8 = (p124p.p144f.p145a.p146h.C1290n) r8
            r8.mo5714p()
        L_0x01c9:
            int r7 = r7 + 1
            goto L_0x01b6
        L_0x01cc:
            r7 = r0
            r0 = 0
            r8 = 1
        L_0x01cf:
            if (r8 == 0) goto L_0x03f8
            r17 = r7
            r9 = 1
            int r7 = r0 + 1
            p.f.a.e r0 = r1.f3769m0     // Catch:{ Exception -> 0x0231 }
            r0.mo5661f()     // Catch:{ Exception -> 0x0231 }
            r25.mo5717s()     // Catch:{ Exception -> 0x0231 }
            p.f.a.e r0 = r1.f3769m0     // Catch:{ Exception -> 0x0231 }
            r1.mo5690b(r0)     // Catch:{ Exception -> 0x0231 }
            r0 = 0
        L_0x01e4:
            if (r0 >= r4) goto L_0x01fa
            java.util.ArrayList<p.f.a.h.d> r9 = r1.f3827k0     // Catch:{ Exception -> 0x0231 }
            java.lang.Object r9 = r9.get(r0)     // Catch:{ Exception -> 0x0231 }
            p.f.a.h.d r9 = (p124p.p144f.p145a.p146h.C1278d) r9     // Catch:{ Exception -> 0x0231 }
            r18 = r8
            p.f.a.e r8 = r1.f3769m0     // Catch:{ Exception -> 0x022f }
            r9.mo5690b(r8)     // Catch:{ Exception -> 0x022f }
            int r0 = r0 + 1
            r8 = r18
            goto L_0x01e4
        L_0x01fa:
            r18 = r8
            p.f.a.e r0 = r1.f3769m0     // Catch:{ Exception -> 0x022f }
            r1.mo5712d(r0)     // Catch:{ Exception -> 0x022f }
            p.f.a.e r0 = r1.f3769m0     // Catch:{ Exception -> 0x022b }
            boolean r8 = r0.f3621g     // Catch:{ Exception -> 0x022b }
            if (r8 == 0) goto L_0x0221
            r8 = 0
        L_0x0208:
            int r9 = r0.f3624j     // Catch:{ Exception -> 0x022b }
            if (r8 >= r9) goto L_0x0219
            p.f.a.b[] r9 = r0.f3620f     // Catch:{ Exception -> 0x022b }
            r9 = r9[r8]     // Catch:{ Exception -> 0x022b }
            boolean r9 = r9.f3610e     // Catch:{ Exception -> 0x022b }
            if (r9 != 0) goto L_0x0216
            r8 = 0
            goto L_0x021a
        L_0x0216:
            int r8 = r8 + 1
            goto L_0x0208
        L_0x0219:
            r8 = 1
        L_0x021a:
            if (r8 != 0) goto L_0x021d
            goto L_0x0221
        L_0x021d:
            r0.mo5645a()     // Catch:{ Exception -> 0x022b }
            goto L_0x0226
        L_0x0221:
            p.f.a.e$a r8 = r0.f3617c     // Catch:{ Exception -> 0x022b }
            r0.mo5647a(r8)     // Catch:{ Exception -> 0x022b }
        L_0x0226:
            r19 = r12
            r18 = 1
            goto L_0x024f
        L_0x022b:
            r0 = move-exception
            r18 = 1
            goto L_0x0234
        L_0x022f:
            r0 = move-exception
            goto L_0x0234
        L_0x0231:
            r0 = move-exception
            r18 = r8
        L_0x0234:
            r0.printStackTrace()
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r19 = r12
            java.lang.String r12 = "EXCEPTION : "
            r9.append(r12)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r8.println(r0)
        L_0x024f:
            r0 = 2
            if (r18 == 0) goto L_0x02b0
            p.f.a.e r8 = r1.f3769m0
            boolean[] r9 = p124p.p144f.p145a.p146h.C1284i.f3802a
            r16 = 0
            r9[r0] = r16
            r1.mo5695c(r8)
            java.util.ArrayList<p.f.a.h.d> r12 = r1.f3827k0
            int r12 = r12.size()
            r0 = r16
        L_0x0265:
            if (r0 >= r12) goto L_0x02ad
            r20 = r12
            java.util.ArrayList<p.f.a.h.d> r12 = r1.f3827k0
            java.lang.Object r12 = r12.get(r0)
            p.f.a.h.d r12 = (p124p.p144f.p145a.p146h.C1278d) r12
            r12.mo5695c(r8)
            r21 = r8
            p.f.a.h.d$a[] r8 = r12.f3698C
            r8 = r8[r16]
            r22 = r3
            p.f.a.h.d$a r3 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r8 != r3) goto L_0x028d
            int r3 = r12.mo5705j()
            int r8 = r12.f3715T
            if (r3 >= r8) goto L_0x028d
            r3 = 2
            r8 = 1
            r9[r3] = r8
            goto L_0x028e
        L_0x028d:
            r8 = 1
        L_0x028e:
            p.f.a.h.d$a[] r3 = r12.f3698C
            r3 = r3[r8]
            p.f.a.h.d$a r8 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r3 != r8) goto L_0x02a2
            int r3 = r12.mo5696d()
            int r8 = r12.f3716U
            if (r3 >= r8) goto L_0x02a2
            r3 = 2
            r8 = 1
            r9[r3] = r8
        L_0x02a2:
            int r0 = r0 + 1
            r12 = r20
            r8 = r21
            r3 = r22
            r16 = 0
            goto L_0x0265
        L_0x02ad:
            r22 = r3
            goto L_0x02f4
        L_0x02b0:
            r22 = r3
            p.f.a.e r0 = r1.f3769m0
            r1.mo5695c(r0)
            r0 = 0
        L_0x02b8:
            if (r0 >= r4) goto L_0x02f4
            java.util.ArrayList<p.f.a.h.d> r3 = r1.f3827k0
            java.lang.Object r3 = r3.get(r0)
            p.f.a.h.d r3 = (p124p.p144f.p145a.p146h.C1278d) r3
            p.f.a.h.d$a[] r8 = r3.f3698C
            r9 = 0
            r8 = r8[r9]
            p.f.a.h.d$a r9 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r8 != r9) goto L_0x02da
            int r8 = r3.mo5705j()
            int r9 = r3.f3715T
            if (r8 >= r9) goto L_0x02da
            boolean[] r0 = p124p.p144f.p145a.p146h.C1284i.f3802a
            r3 = 2
            r8 = 1
            r0[r3] = r8
            goto L_0x02f4
        L_0x02da:
            r8 = 1
            p.f.a.h.d$a[] r9 = r3.f3698C
            r9 = r9[r8]
            p.f.a.h.d$a r12 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r9 != r12) goto L_0x02f1
            int r9 = r3.mo5696d()
            int r3 = r3.f3716U
            if (r9 >= r3) goto L_0x02f1
            boolean[] r0 = p124p.p144f.p145a.p146h.C1284i.f3802a
            r3 = 2
            r0[r3] = r8
            goto L_0x02f4
        L_0x02f1:
            int r0 = r0 + 1
            goto L_0x02b8
        L_0x02f4:
            if (r14 == 0) goto L_0x0367
            r3 = 8
            if (r7 >= r3) goto L_0x0367
            boolean[] r0 = p124p.p144f.p145a.p146h.C1284i.f3802a
            r8 = 2
            boolean r0 = r0[r8]
            if (r0 == 0) goto L_0x0367
            r0 = 0
            r8 = 0
            r9 = 0
        L_0x0304:
            if (r0 >= r4) goto L_0x032a
            java.util.ArrayList<p.f.a.h.d> r12 = r1.f3827k0
            java.lang.Object r12 = r12.get(r0)
            p.f.a.h.d r12 = (p124p.p144f.p145a.p146h.C1278d) r12
            int r3 = r12.f3704I
            int r18 = r12.mo5705j()
            int r3 = r18 + r3
            int r8 = java.lang.Math.max(r8, r3)
            int r3 = r12.f3705J
            int r12 = r12.mo5696d()
            int r12 = r12 + r3
            int r9 = java.lang.Math.max(r9, r12)
            int r0 = r0 + 1
            r3 = 8
            goto L_0x0304
        L_0x032a:
            int r0 = r1.f3713R
            int r0 = java.lang.Math.max(r0, r8)
            int r3 = r1.f3714S
            int r3 = java.lang.Math.max(r3, r9)
            p.f.a.h.d$a r8 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r11 != r8) goto L_0x034e
            int r8 = r25.mo5705j()
            if (r8 >= r0) goto L_0x034e
            r1.mo5701f(r0)
            p.f.a.h.d$a[] r0 = r1.f3698C
            p.f.a.h.d$a r8 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            r9 = 0
            r0[r9] = r8
            r0 = 1
            r17 = 1
            goto L_0x034f
        L_0x034e:
            r0 = 0
        L_0x034f:
            p.f.a.h.d$a r8 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r10 != r8) goto L_0x0368
            int r8 = r25.mo5696d()
            if (r8 >= r3) goto L_0x0368
            r1.mo5699e(r3)
            p.f.a.h.d$a[] r0 = r1.f3698C
            p.f.a.h.d$a r3 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            r8 = 1
            r0[r8] = r3
            r0 = 1
            r17 = 1
            goto L_0x0368
        L_0x0367:
            r0 = 0
        L_0x0368:
            int r3 = r1.f3713R
            int r8 = r25.mo5705j()
            int r3 = java.lang.Math.max(r3, r8)
            int r8 = r25.mo5705j()
            if (r3 <= r8) goto L_0x0385
            r1.mo5701f(r3)
            p.f.a.h.d$a[] r0 = r1.f3698C
            p.f.a.h.d$a r3 = p124p.p144f.p145a.p146h.C1278d.C1279a.FIXED
            r8 = 0
            r0[r8] = r3
            r0 = 1
            r17 = 1
        L_0x0385:
            int r3 = r1.f3714S
            int r8 = r25.mo5696d()
            int r3 = java.lang.Math.max(r3, r8)
            int r8 = r25.mo5696d()
            if (r3 <= r8) goto L_0x03a2
            r1.mo5699e(r3)
            p.f.a.h.d$a[] r0 = r1.f3698C
            p.f.a.h.d$a r3 = p124p.p144f.p145a.p146h.C1278d.C1279a.FIXED
            r8 = 1
            r0[r8] = r3
            r0 = r8
            r9 = r0
            goto L_0x03a5
        L_0x03a2:
            r8 = 1
            r9 = r17
        L_0x03a5:
            if (r9 != 0) goto L_0x03ef
            p.f.a.h.d$a[] r3 = r1.f3698C
            r12 = 0
            r3 = r3[r12]
            p.f.a.h.d$a r12 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r3 != r12) goto L_0x03c7
            if (r5 <= 0) goto L_0x03c7
            int r3 = r25.mo5705j()
            if (r3 <= r5) goto L_0x03c7
            r1.f3766E0 = r8
            p.f.a.h.d$a[] r0 = r1.f3698C
            p.f.a.h.d$a r3 = p124p.p144f.p145a.p146h.C1278d.C1279a.FIXED
            r9 = 0
            r0[r9] = r3
            r1.mo5701f(r5)
            r0 = r8
            r9 = r0
            goto L_0x03cc
        L_0x03c7:
            r24 = r9
            r9 = r0
            r0 = r24
        L_0x03cc:
            p.f.a.h.d$a[] r3 = r1.f3698C
            r3 = r3[r8]
            p.f.a.h.d$a r12 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r3 != r12) goto L_0x03ea
            if (r6 <= 0) goto L_0x03ea
            int r3 = r25.mo5696d()
            if (r3 <= r6) goto L_0x03ea
            r1.f3767F0 = r8
            p.f.a.h.d$a[] r0 = r1.f3698C
            p.f.a.h.d$a r3 = p124p.p144f.p145a.p146h.C1278d.C1279a.FIXED
            r0[r8] = r3
            r1.mo5699e(r6)
            r8 = 1
            r9 = 1
            goto L_0x03f0
        L_0x03ea:
            r24 = r9
            r9 = r0
            r0 = r24
        L_0x03ef:
            r8 = r0
        L_0x03f0:
            r0 = r7
            r7 = r9
            r12 = r19
            r3 = r22
            goto L_0x01cf
        L_0x03f8:
            r22 = r3
            r17 = r7
            r19 = r12
            java.util.List<p.f.a.h.f> r0 = r1.f3779w0
            java.lang.Object r0 = r0.get(r15)
            p.f.a.h.f r0 = (p124p.p144f.p145a.p146h.C1281f) r0
            java.util.List<p.f.a.h.d> r3 = r0.f3793k
            int r3 = r3.size()
            r4 = 0
        L_0x040d:
            if (r4 >= r3) goto L_0x041d
            java.util.List<p.f.a.h.d> r7 = r0.f3793k
            java.lang.Object r7 = r7.get(r4)
            p.f.a.h.d r7 = (p124p.p144f.p145a.p146h.C1278d) r7
            r0.mo5720a(r7)
            int r4 = r4 + 1
            goto L_0x040d
        L_0x041d:
            r0 = r17
        L_0x041f:
            int r15 = r15 + 1
            r12 = r19
            r3 = r22
            r4 = 0
            r7 = 8
            r8 = 32
            r9 = 1
            goto L_0x0126
        L_0x042d:
            r22 = r3
            r1.f3827k0 = r13
            p.f.a.h.d r3 = r1.f3699D
            if (r3 == 0) goto L_0x04a3
            int r2 = r1.f3713R
            int r3 = r25.mo5705j()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.f3714S
            int r4 = r25.mo5696d()
            int r3 = java.lang.Math.max(r3, r4)
            p.f.a.h.m r4 = r1.f3770n0
            int r5 = r4.f3817a
            r1.f3704I = r5
            int r5 = r4.f3818b
            r1.f3705J = r5
            int r5 = r4.f3819c
            r1.mo5701f(r5)
            int r5 = r4.f3820d
            r1.mo5699e(r5)
            java.util.ArrayList<p.f.a.h.m$a> r5 = r4.f3821e
            int r5 = r5.size()
            r6 = 0
        L_0x0464:
            if (r6 >= r5) goto L_0x0490
            java.util.ArrayList<p.f.a.h.m$a> r7 = r4.f3821e
            java.lang.Object r7 = r7.get(r6)
            p.f.a.h.m$a r7 = (p124p.p144f.p145a.p146h.C1288m.C1289a) r7
            p.f.a.h.c r8 = r7.f3822a
            p.f.a.h.c$c r8 = r8.f3671c
            p.f.a.h.c r17 = r1.mo5680a(r8)
            p.f.a.h.c r8 = r7.f3823b
            int r9 = r7.f3824c
            p.f.a.h.c$b r12 = r7.f3825d
            int r7 = r7.f3826e
            r20 = -1
            r23 = 0
            r18 = r8
            r19 = r9
            r21 = r12
            r22 = r7
            r17.mo5675a(r18, r19, r20, r21, r22, r23)
            int r6 = r6 + 1
            goto L_0x0464
        L_0x0490:
            int r4 = r1.f3771o0
            int r2 = r2 + r4
            int r4 = r1.f3773q0
            int r2 = r2 + r4
            r1.mo5701f(r2)
            int r2 = r1.f3772p0
            int r3 = r3 + r2
            int r2 = r1.f3774r0
            int r3 = r3 + r2
            r1.mo5699e(r3)
            goto L_0x04a9
        L_0x04a3:
            r1.f3704I = r2
            r2 = r22
            r1.f3705J = r2
        L_0x04a9:
            if (r0 == 0) goto L_0x04b3
            p.f.a.h.d$a[] r0 = r1.f3698C
            r2 = 0
            r0[r2] = r11
            r2 = 1
            r0[r2] = r10
        L_0x04b3:
            p.f.a.e r0 = r1.f3769m0
            p.f.a.c r0 = r0.f3626l
            r1.mo5683a(r0)
            p.f.a.h.d r0 = r1.f3699D
            r2 = r1
        L_0x04bd:
            if (r0 == 0) goto L_0x04ca
            p.f.a.h.d r3 = r0.f3699D
            boolean r4 = r0 instanceof p124p.p144f.p145a.p146h.C1280e
            if (r4 == 0) goto L_0x04c8
            r2 = r0
            p.f.a.h.e r2 = (p124p.p144f.p145a.p146h.C1280e) r2
        L_0x04c8:
            r0 = r3
            goto L_0x04bd
        L_0x04ca:
            if (r1 != r2) goto L_0x04cf
            r25.mo5708o()
        L_0x04cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p144f.p145a.p146h.C1280e.mo5714p():void");
    }

    /* renamed from: q */
    public void mo5715q() {
        int size = this.f3827k0.size();
        mo5672m();
        for (int i = 0; i < size; i++) {
            ((C1278d) this.f3827k0.get(i)).mo5672m();
        }
    }

    /* renamed from: r */
    public void mo5716r() {
        mo5715q();
        mo5669a(this.f3764C0);
    }

    /* renamed from: s */
    public final void mo5717s() {
        this.f3775s0 = 0;
        this.f3776t0 = 0;
    }

    /* renamed from: t */
    public void mo5718t() {
        C1285j jVar = mo5680a(C1277c.LEFT).f3669a;
        C1285j jVar2 = mo5680a(C1277c.TOP).f3669a;
        jVar.mo5726a((C1285j) null, 0.0f);
        jVar2.mo5726a((C1285j) null, 0.0f);
    }
}
