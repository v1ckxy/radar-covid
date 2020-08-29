package p124p.p144f.p145a;

import java.util.Arrays;
import java.util.HashMap;
import p124p.p144f.p145a.C1270g.C1271a;
import p124p.p144f.p145a.p146h.C1274c;

/* renamed from: p.f.a.e */
public class C1267e {

    /* renamed from: p */
    public static int f3614p = 1000;

    /* renamed from: a */
    public int f3615a;

    /* renamed from: b */
    public HashMap<String, C1270g> f3616b;

    /* renamed from: c */
    public C1268a f3617c;

    /* renamed from: d */
    public int f3618d;

    /* renamed from: e */
    public int f3619e;

    /* renamed from: f */
    public C1264b[] f3620f;

    /* renamed from: g */
    public boolean f3621g;

    /* renamed from: h */
    public boolean[] f3622h;

    /* renamed from: i */
    public int f3623i;

    /* renamed from: j */
    public int f3624j;

    /* renamed from: k */
    public int f3625k;

    /* renamed from: l */
    public final C1265c f3626l;

    /* renamed from: m */
    public C1270g[] f3627m;

    /* renamed from: n */
    public int f3628n;

    /* renamed from: o */
    public final C1268a f3629o;

    /* renamed from: p.f.a.e$a */
    public interface C1268a {
        /* renamed from: a */
        void mo5636a(C1270g gVar);
    }

    public C1267e() {
        this.f3615a = 0;
        this.f3616b = null;
        this.f3618d = 32;
        this.f3619e = 32;
        this.f3620f = null;
        this.f3621g = false;
        this.f3622h = new boolean[32];
        this.f3623i = 1;
        this.f3624j = 0;
        this.f3625k = 32;
        this.f3627m = new C1270g[f3614p];
        this.f3628n = 0;
        this.f3620f = new C1264b[32];
        mo5660e();
        C1265c cVar = new C1265c();
        this.f3626l = cVar;
        this.f3617c = new C1266d(cVar);
        this.f3629o = new C1264b(this.f3626l);
    }

    /* renamed from: a */
    public C1270g mo5642a(int i, String str) {
        if (this.f3623i + 1 >= this.f3619e) {
            mo5659d();
        }
        C1270g a = mo5644a(C1271a.ERROR, str);
        int i2 = this.f3615a + 1;
        this.f3615a = i2;
        this.f3623i++;
        a.f3634b = i2;
        a.f3636d = i;
        this.f3626l.f3613c[i2] = a;
        this.f3617c.mo5636a(a);
        return a;
    }

    /* renamed from: a */
    public final C1270g mo5644a(C1271a aVar, String str) {
        C1270g gVar = (C1270g) this.f3626l.f3612b.mo5662a();
        if (gVar == null) {
            gVar = new C1270g(aVar);
        } else {
            gVar.mo5664a();
        }
        gVar.f3639g = aVar;
        int i = this.f3628n;
        int i2 = f3614p;
        if (i >= i2) {
            int i3 = i2 * 2;
            f3614p = i3;
            this.f3627m = (C1270g[]) Arrays.copyOf(this.f3627m, i3);
        }
        C1270g[] gVarArr = this.f3627m;
        int i4 = this.f3628n;
        this.f3628n = i4 + 1;
        gVarArr[i4] = gVar;
        return gVar;
    }

    /* renamed from: a */
    public final void mo5645a() {
        for (int i = 0; i < this.f3624j; i++) {
            C1264b bVar = this.f3620f[i];
            bVar.f3606a.f3637e = bVar.f3607b;
        }
    }

    /* renamed from: a */
    public void mo5650a(C1270g gVar, C1270g gVar2, C1270g gVar3, C1270g gVar4, float f, int i) {
        C1264b b = mo5653b();
        b.mo5635a(gVar, gVar2, gVar3, gVar4, f);
        if (i != 6) {
            b.mo5633a(this, i);
        }
        mo5646a(b);
    }

    /* renamed from: b */
    public final void mo5654b(C1264b bVar) {
        C1264b[] bVarArr = this.f3620f;
        int i = this.f3624j;
        if (bVarArr[i] != null) {
            this.f3626l.f3611a.mo5663a(bVarArr[i]);
        }
        C1264b[] bVarArr2 = this.f3620f;
        int i2 = this.f3624j;
        bVarArr2[i2] = bVar;
        C1270g gVar = bVar.f3606a;
        gVar.f3635c = i2;
        this.f3624j = i2 + 1;
        gVar.mo5667c(bVar);
    }

    /* renamed from: b */
    public void mo5655b(C1270g gVar, C1270g gVar2, int i, int i2) {
        C1264b b = mo5653b();
        C1270g c = mo5656c();
        c.f3636d = 0;
        b.mo5634a(gVar, gVar2, c, i);
        if (i2 != 6) {
            int a = (int) (b.f3609d.mo5623a(c) * -1.0f);
            b.f3609d.mo5628a(mo5642a(i2, (String) null), (float) a);
        }
        mo5646a(b);
    }

    /* renamed from: c */
    public C1270g mo5656c() {
        if (this.f3623i + 1 >= this.f3619e) {
            mo5659d();
        }
        C1270g a = mo5644a(C1271a.SLACK, (String) null);
        int i = this.f3615a + 1;
        this.f3615a = i;
        this.f3623i++;
        a.f3634b = i;
        this.f3626l.f3613c[i] = a;
        return a;
    }

    /* renamed from: c */
    public void mo5658c(C1270g gVar, C1270g gVar2, int i, int i2) {
        C1264b b = mo5653b();
        C1270g c = mo5656c();
        c.f3636d = 0;
        b.mo5637b(gVar, gVar2, c, i);
        if (i2 != 6) {
            int a = (int) (b.f3609d.mo5623a(c) * -1.0f);
            b.f3609d.mo5628a(mo5642a(i2, (String) null), (float) a);
        }
        mo5646a(b);
    }

    /* renamed from: d */
    public final void mo5659d() {
        int i = this.f3618d * 2;
        this.f3618d = i;
        this.f3620f = (C1264b[]) Arrays.copyOf(this.f3620f, i);
        C1265c cVar = this.f3626l;
        cVar.f3613c = (C1270g[]) Arrays.copyOf(cVar.f3613c, this.f3618d);
        int i2 = this.f3618d;
        this.f3622h = new boolean[i2];
        this.f3619e = i2;
        this.f3625k = i2;
    }

    /* renamed from: e */
    public final void mo5660e() {
        int i = 0;
        while (true) {
            C1264b[] bVarArr = this.f3620f;
            if (i < bVarArr.length) {
                C1264b bVar = bVarArr[i];
                if (bVar != null) {
                    this.f3626l.f3611a.mo5663a(bVar);
                }
                this.f3620f[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public void mo5661f() {
        C1265c cVar;
        int i = 0;
        while (true) {
            cVar = this.f3626l;
            C1270g[] gVarArr = cVar.f3613c;
            if (i >= gVarArr.length) {
                break;
            }
            C1270g gVar = gVarArr[i];
            if (gVar != null) {
                gVar.mo5664a();
            }
            i++;
        }
        C1269f<C1270g> fVar = cVar.f3612b;
        C1270g[] gVarArr2 = this.f3627m;
        int i2 = this.f3628n;
        if (fVar != null) {
            if (i2 > gVarArr2.length) {
                i2 = gVarArr2.length;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                C1270g gVar2 = gVarArr2[i3];
                int i4 = fVar.f3631b;
                Object[] objArr = fVar.f3630a;
                if (i4 < objArr.length) {
                    objArr[i4] = gVar2;
                    fVar.f3631b = i4 + 1;
                }
            }
            this.f3628n = 0;
            Arrays.fill(this.f3626l.f3613c, null);
            HashMap<String, C1270g> hashMap = this.f3616b;
            if (hashMap != null) {
                hashMap.clear();
            }
            this.f3615a = 0;
            C1264b bVar = (C1264b) this.f3617c;
            bVar.f3609d.mo5627a();
            bVar.f3606a = null;
            bVar.f3607b = 0.0f;
            this.f3623i = 1;
            for (int i5 = 0; i5 < this.f3624j; i5++) {
                this.f3620f[i5].f3608c = false;
            }
            mo5660e();
            this.f3624j = 0;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public void mo5649a(C1270g gVar, C1270g gVar2, int i, float f, C1270g gVar3, C1270g gVar4, int i2, int i3) {
        float f2;
        C1264b b = mo5653b();
        if (gVar2 == gVar3) {
            b.f3609d.mo5628a(gVar, 1.0f);
            b.f3609d.mo5628a(gVar4, 1.0f);
            b.f3609d.mo5628a(gVar2, -2.0f);
        } else {
            if (f == 0.5f) {
                b.f3609d.mo5628a(gVar, 1.0f);
                b.f3609d.mo5628a(gVar2, -1.0f);
                b.f3609d.mo5628a(gVar3, -1.0f);
                b.f3609d.mo5628a(gVar4, 1.0f);
                if (i > 0 || i2 > 0) {
                    f2 = (float) ((-i) + i2);
                }
            } else if (f <= 0.0f) {
                b.f3609d.mo5628a(gVar, -1.0f);
                b.f3609d.mo5628a(gVar2, 1.0f);
                f2 = (float) i;
            } else if (f >= 1.0f) {
                b.f3609d.mo5628a(gVar3, -1.0f);
                b.f3609d.mo5628a(gVar4, 1.0f);
                f2 = (float) i2;
            } else {
                float f3 = 1.0f - f;
                b.f3609d.mo5628a(gVar, f3 * 1.0f);
                b.f3609d.mo5628a(gVar2, f3 * -1.0f);
                b.f3609d.mo5628a(gVar3, -1.0f * f);
                b.f3609d.mo5628a(gVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    b.f3607b = (((float) i2) * f) + (((float) (-i)) * f3);
                }
            }
            b.f3607b = f2;
        }
        if (i3 != 6) {
            b.mo5633a(this, i3);
        }
        mo5646a(b);
    }

    /* renamed from: b */
    public C1264b mo5653b() {
        C1264b bVar = (C1264b) this.f3626l.f3611a.mo5662a();
        if (bVar == null) {
            bVar = new C1264b(this.f3626l);
        } else {
            bVar.f3606a = null;
            bVar.f3609d.mo5627a();
            bVar.f3607b = 0.0f;
            bVar.f3610e = false;
        }
        C1270g.f3632k++;
        return bVar;
    }

    /* renamed from: c */
    public final void mo5657c(C1264b bVar) {
        if (this.f3624j > 0) {
            C1263a aVar = bVar.f3609d;
            C1264b[] bVarArr = this.f3620f;
            int i = aVar.f3603i;
            loop0:
            while (true) {
                int i2 = 0;
                while (i != -1 && i2 < aVar.f3595a) {
                    C1270g gVar = aVar.f3597c.f3613c[aVar.f3600f[i]];
                    if (gVar.f3635c != -1) {
                        float f = aVar.f3602h[i];
                        aVar.mo5624a(gVar, true);
                        C1264b bVar2 = bVarArr[gVar.f3635c];
                        if (!bVar2.f3610e) {
                            C1263a aVar2 = bVar2.f3609d;
                            int i3 = aVar2.f3603i;
                            int i4 = 0;
                            while (i3 != -1 && i4 < aVar2.f3595a) {
                                aVar.mo5629a(aVar.f3597c.f3613c[aVar2.f3600f[i3]], aVar2.f3602h[i3] * f, true);
                                i3 = aVar2.f3601g[i3];
                                i4++;
                            }
                        }
                        bVar.f3607b = (bVar2.f3607b * f) + bVar.f3607b;
                        bVar2.f3606a.mo5666b(bVar);
                        i = aVar.f3603i;
                    } else {
                        i = aVar.f3601g[i];
                        i2++;
                    }
                }
            }
            if (bVar.f3609d.f3595a == 0) {
                bVar.f3610e = true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x00dc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5646a(p124p.p144f.p145a.C1264b r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            int r2 = r0.f3624j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f3625k
            if (r2 >= r4) goto L_0x0016
            int r2 = r0.f3623i
            int r2 = r2 + r3
            int r4 = r0.f3619e
            if (r2 < r4) goto L_0x0019
        L_0x0016:
            r18.mo5659d()
        L_0x0019:
            boolean r2 = r1.f3610e
            if (r2 != 0) goto L_0x018c
            r18.mo5657c(r19)
            p.f.a.g r2 = r1.f3606a
            r5 = 0
            if (r2 != 0) goto L_0x0033
            float r2 = r1.f3607b
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0033
            p.f.a.a r2 = r1.f3609d
            int r2 = r2.f3595a
            if (r2 != 0) goto L_0x0033
            r2 = r3
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 == 0) goto L_0x0037
            return
        L_0x0037:
            float r2 = r1.f3607b
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r7 = -1
            if (r6 >= 0) goto L_0x005c
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r6
            r1.f3607b = r2
            p.f.a.a r2 = r1.f3609d
            int r8 = r2.f3603i
            r9 = 0
        L_0x0048:
            if (r8 == r7) goto L_0x005c
            int r10 = r2.f3595a
            if (r9 >= r10) goto L_0x005c
            float[] r10 = r2.f3602h
            r11 = r10[r8]
            float r11 = r11 * r6
            r10[r8] = r11
            int[] r10 = r2.f3601g
            r8 = r10[r8]
            int r9 = r9 + 1
            goto L_0x0048
        L_0x005c:
            p.f.a.a r2 = r1.f3609d
            int r6 = r2.f3603i
            r12 = r5
            r14 = r12
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
        L_0x0067:
            if (r6 == r7) goto L_0x00e4
            int r4 = r2.f3595a
            if (r9 >= r4) goto L_0x00e4
            float[] r4 = r2.f3602h
            r16 = r4[r6]
            r17 = 981668463(0x3a83126f, float:0.001)
            p.f.a.c r7 = r2.f3597c
            p.f.a.g[] r7 = r7.f3613c
            int[] r8 = r2.f3600f
            r8 = r8[r6]
            r7 = r7[r8]
            int r8 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x008c
            r8 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r8 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0099
            r4[r6] = r5
            goto L_0x0092
        L_0x008c:
            int r8 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r8 >= 0) goto L_0x0099
            r4[r6] = r5
        L_0x0092:
            p.f.a.b r4 = r2.f3596b
            r7.mo5666b(r4)
            r16 = r5
        L_0x0099:
            int r4 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00dc
            p.f.a.g$a r4 = r7.f3639g
            p.f.a.g$a r8 = p124p.p144f.p145a.C1270g.C1271a.UNRESTRICTED
            if (r4 != r8) goto L_0x00bd
            if (r11 != 0) goto L_0x00a6
            goto L_0x00aa
        L_0x00a6:
            int r4 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b0
        L_0x00aa:
            boolean r4 = r2.mo5631b(r7)
            r13 = r4
            goto L_0x00b9
        L_0x00b0:
            if (r13 != 0) goto L_0x00dc
            boolean r4 = r2.mo5631b(r7)
            if (r4 == 0) goto L_0x00dc
            r13 = r3
        L_0x00b9:
            r11 = r7
            r12 = r16
            goto L_0x00dc
        L_0x00bd:
            if (r11 != 0) goto L_0x00dc
            int r4 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00dc
            if (r10 != 0) goto L_0x00c6
            goto L_0x00ca
        L_0x00c6:
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d0
        L_0x00ca:
            boolean r4 = r2.mo5631b(r7)
            r15 = r4
            goto L_0x00d9
        L_0x00d0:
            if (r15 != 0) goto L_0x00dc
            boolean r4 = r2.mo5631b(r7)
            if (r4 == 0) goto L_0x00dc
            r15 = r3
        L_0x00d9:
            r10 = r7
            r14 = r16
        L_0x00dc:
            int[] r4 = r2.f3601g
            r6 = r4[r6]
            int r9 = r9 + 1
            r7 = -1
            goto L_0x0067
        L_0x00e4:
            if (r11 == 0) goto L_0x00e7
            r10 = r11
        L_0x00e7:
            if (r10 != 0) goto L_0x00eb
            r2 = r3
            goto L_0x00ef
        L_0x00eb:
            r1.mo5639b(r10)
            r2 = 0
        L_0x00ef:
            p.f.a.a r4 = r1.f3609d
            int r4 = r4.f3595a
            if (r4 != 0) goto L_0x00f7
            r1.f3610e = r3
        L_0x00f7:
            if (r2 == 0) goto L_0x0174
            int r2 = r0.f3623i
            int r2 = r2 + r3
            int r4 = r0.f3619e
            if (r2 < r4) goto L_0x0103
            r18.mo5659d()
        L_0x0103:
            p.f.a.g$a r2 = p124p.p144f.p145a.C1270g.C1271a.SLACK
            r4 = 0
            p.f.a.g r2 = r0.mo5644a(r2, r4)
            int r4 = r0.f3615a
            int r4 = r4 + r3
            r0.f3615a = r4
            int r6 = r0.f3623i
            int r6 = r6 + r3
            r0.f3623i = r6
            r2.f3634b = r4
            p.f.a.c r6 = r0.f3626l
            p.f.a.g[] r6 = r6.f3613c
            r6[r4] = r2
            r1.f3606a = r2
            r18.mo5654b(r19)
            p.f.a.e$a r4 = r0.f3629o
            p.f.a.b r4 = (p124p.p144f.p145a.C1264b) r4
            if (r4 == 0) goto L_0x0172
            r6 = 0
            r4.f3606a = r6
            p.f.a.a r6 = r4.f3609d
            r6.mo5627a()
            r6 = 0
        L_0x0130:
            p.f.a.a r7 = r1.f3609d
            int r8 = r7.f3595a
            if (r6 >= r8) goto L_0x0148
            p.f.a.g r7 = r7.mo5625a(r6)
            p.f.a.a r8 = r1.f3609d
            float r8 = r8.mo5630b(r6)
            p.f.a.a r9 = r4.f3609d
            r9.mo5629a(r7, r8, r3)
            int r6 = r6 + 1
            goto L_0x0130
        L_0x0148:
            p.f.a.e$a r4 = r0.f3629o
            r0.mo5652b(r4)
            int r4 = r2.f3635c
            r6 = -1
            if (r4 != r6) goto L_0x0170
            p.f.a.g r4 = r1.f3606a
            if (r4 != r2) goto L_0x0162
            p.f.a.a r4 = r1.f3609d
            r6 = 0
            p.f.a.g r2 = r4.mo5626a(r6, r2)
            if (r2 == 0) goto L_0x0162
            r1.mo5639b(r2)
        L_0x0162:
            boolean r2 = r1.f3610e
            if (r2 != 0) goto L_0x016b
            p.f.a.g r2 = r1.f3606a
            r2.mo5667c(r1)
        L_0x016b:
            int r2 = r0.f3624j
            int r2 = r2 - r3
            r0.f3624j = r2
        L_0x0170:
            r2 = r3
            goto L_0x0175
        L_0x0172:
            r2 = 0
            throw r2
        L_0x0174:
            r2 = 0
        L_0x0175:
            p.f.a.g r4 = r1.f3606a
            if (r4 == 0) goto L_0x0186
            p.f.a.g$a r4 = r4.f3639g
            p.f.a.g$a r6 = p124p.p144f.p145a.C1270g.C1271a.UNRESTRICTED
            if (r4 == r6) goto L_0x0187
            float r4 = r1.f3607b
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0186
            goto L_0x0187
        L_0x0186:
            r3 = 0
        L_0x0187:
            if (r3 != 0) goto L_0x018a
            return
        L_0x018a:
            r4 = r2
            goto L_0x018d
        L_0x018c:
            r4 = 0
        L_0x018d:
            if (r4 != 0) goto L_0x0192
            r18.mo5654b(r19)
        L_0x0192:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p144f.p145a.C1267e.mo5646a(p.f.a.b):void");
    }

    /* renamed from: b */
    public int mo5651b(Object obj) {
        C1270g gVar = ((C1274c) obj).f3677i;
        if (gVar != null) {
            return (int) (gVar.f3637e + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo5652b(C1268a aVar) {
        boolean z;
        for (int i = 0; i < this.f3623i; i++) {
            this.f3622h[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.f3623i * 2) {
                return i2;
            }
            C1264b bVar = (C1264b) aVar;
            C1270g gVar = bVar.f3606a;
            if (gVar != null) {
                this.f3622h[gVar.f3634b] = true;
            }
            C1270g a = bVar.f3609d.mo5626a(this.f3622h, (C1270g) null);
            if (a != null) {
                boolean[] zArr = this.f3622h;
                int i3 = a.f3634b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f3624j; i5++) {
                    C1264b bVar2 = this.f3620f[i5];
                    if (bVar2.f3606a.f3639g != C1271a.UNRESTRICTED && !bVar2.f3610e) {
                        C1263a aVar2 = bVar2.f3609d;
                        int i6 = aVar2.f3603i;
                        if (i6 != -1) {
                            int i7 = 0;
                            while (true) {
                                if (i6 == -1 || i7 >= aVar2.f3595a) {
                                    break;
                                } else if (aVar2.f3600f[i6] == a.f3634b) {
                                    z = true;
                                    break;
                                } else {
                                    i6 = aVar2.f3601g[i6];
                                    i7++;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            float a2 = bVar2.f3609d.mo5623a(a);
                            if (a2 < 0.0f) {
                                float f2 = (-bVar2.f3607b) / a2;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C1264b bVar3 = this.f3620f[i4];
                    bVar3.f3606a.f3635c = -1;
                    bVar3.mo5639b(a);
                    C1270g gVar2 = bVar3.f3606a;
                    gVar2.f3635c = i4;
                    gVar2.mo5667c(bVar3);
                }
            }
            z2 = true;
        }
        return i2;
    }

    /* renamed from: a */
    public C1264b mo5641a(C1270g gVar, C1270g gVar2, int i, int i2) {
        C1264b b = mo5653b();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            b.f3607b = (float) i;
        }
        if (!z) {
            b.f3609d.mo5628a(gVar, -1.0f);
            b.f3609d.mo5628a(gVar2, 1.0f);
        } else {
            b.f3609d.mo5628a(gVar, 1.0f);
            b.f3609d.mo5628a(gVar2, -1.0f);
        }
        if (i2 != 6) {
            b.mo5633a(this, i2);
        }
        mo5646a(b);
        return b;
    }

    /* renamed from: a */
    public void mo5648a(C1270g gVar, int i) {
        C1264b bVar;
        C1263a aVar;
        float f;
        int i2 = gVar.f3635c;
        if (i2 != -1) {
            C1264b bVar2 = this.f3620f[i2];
            if (!bVar2.f3610e) {
                if (bVar2.f3609d.f3595a == 0) {
                    bVar2.f3610e = true;
                } else {
                    bVar = mo5653b();
                    if (i < 0) {
                        bVar.f3607b = (float) (i * -1);
                        aVar = bVar.f3609d;
                        f = 1.0f;
                    } else {
                        bVar.f3607b = (float) i;
                        aVar = bVar.f3609d;
                        f = -1.0f;
                    }
                    aVar.mo5628a(gVar, f);
                }
            }
            bVar2.f3607b = (float) i;
            return;
        }
        bVar = mo5653b();
        bVar.f3606a = gVar;
        float f2 = (float) i;
        gVar.f3637e = f2;
        bVar.f3607b = f2;
        bVar.f3610e = true;
        mo5646a(bVar);
    }

    /* renamed from: a */
    public C1270g mo5643a(Object obj) {
        C1270g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f3623i + 1 >= this.f3619e) {
            mo5659d();
        }
        if (obj instanceof C1274c) {
            C1274c cVar = (C1274c) obj;
            gVar = cVar.f3677i;
            if (gVar == null) {
                cVar.mo5678d();
                gVar = cVar.f3677i;
            }
            int i = gVar.f3634b;
            if (i == -1 || i > this.f3615a || this.f3626l.f3613c[i] == null) {
                if (gVar.f3634b != -1) {
                    gVar.mo5664a();
                }
                int i2 = this.f3615a + 1;
                this.f3615a = i2;
                this.f3623i++;
                gVar.f3634b = i2;
                gVar.f3639g = C1271a.UNRESTRICTED;
                this.f3626l.f3613c[i2] = gVar;
            }
        }
        return gVar;
    }

    /* renamed from: a */
    public void mo5647a(C1268a aVar) {
        float f;
        boolean z;
        mo5657c((C1264b) aVar);
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f3624j) {
                z = false;
                break;
            }
            C1264b[] bVarArr = this.f3620f;
            if (bVarArr[i].f3606a.f3639g != C1271a.UNRESTRICTED && bVarArr[i].f3607b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                i2++;
                float f2 = Float.MAX_VALUE;
                int i3 = -1;
                int i4 = -1;
                int i5 = 0;
                int i6 = 0;
                while (i5 < this.f3624j) {
                    C1264b bVar = this.f3620f[i5];
                    if (bVar.f3606a.f3639g != C1271a.UNRESTRICTED && !bVar.f3610e && bVar.f3607b < f) {
                        int i7 = 1;
                        while (i7 < this.f3623i) {
                            C1270g gVar = this.f3626l.f3613c[i7];
                            float a = bVar.f3609d.mo5623a(gVar);
                            if (a > f) {
                                for (int i8 = 0; i8 < 7; i8++) {
                                    float f3 = gVar.f3638f[i8] / a;
                                    if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                        i6 = i8;
                                        f2 = f3;
                                        i3 = i5;
                                        i4 = i7;
                                    }
                                }
                            }
                            i7++;
                            f = 0.0f;
                        }
                    }
                    i5++;
                    f = 0.0f;
                }
                if (i3 != -1) {
                    C1264b bVar2 = this.f3620f[i3];
                    bVar2.f3606a.f3635c = -1;
                    bVar2.mo5639b(this.f3626l.f3613c[i4]);
                    C1270g gVar2 = bVar2.f3606a;
                    gVar2.f3635c = i3;
                    gVar2.mo5667c(bVar2);
                } else {
                    z2 = true;
                }
                if (i2 > this.f3623i / 2) {
                    z2 = true;
                }
                f = 0.0f;
            }
        }
        mo5652b(aVar);
        mo5645a();
    }
}
