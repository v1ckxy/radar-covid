package p410v.p411m0.p416g;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p116io.jsonwebtoken.lang.Objects;
import p116io.jsonwebtoken.lang.Strings;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p401r.p403c.C4638h;
import p410v.p411m0.C4737b;
import p410v.p411m0.p416g.C4822n.C4823a;
import p423w.C4882a0;
import p423w.C4892f;
import p423w.C4896i;
import p423w.C4897j;
import p423w.p424c0.C4889a;

/* renamed from: v.m0.g.d */
public final class C4793d {

    /* renamed from: a */
    public static final C4792c[] f11357a;

    /* renamed from: b */
    public static final Map<C4897j, Integer> f11358b;

    /* renamed from: c */
    public static final C4793d f11359c = new C4793d();

    /* renamed from: v.m0.g.d$a */
    public static final class C4794a {

        /* renamed from: a */
        public final List<C4792c> f11360a;

        /* renamed from: b */
        public final C4896i f11361b;

        /* renamed from: c */
        public C4792c[] f11362c;

        /* renamed from: d */
        public int f11363d;

        /* renamed from: e */
        public int f11364e;

        /* renamed from: f */
        public int f11365f;

        /* renamed from: g */
        public final int f11366g;

        /* renamed from: h */
        public int f11367h;

        public /* synthetic */ C4794a(C4882a0 a0Var, int i, int i2, int i3) {
            if ((i3 & 4) != 0) {
                i2 = i;
            }
            if (a0Var != null) {
                this.f11366g = i;
                this.f11367h = i2;
                this.f11360a = new ArrayList();
                this.f11361b = C0967p0.m2183a(a0Var);
                this.f11362c = new C4792c[8];
                this.f11363d = 7;
                return;
            }
            C4638h.m10271a("source");
            throw null;
        }

        /* renamed from: a */
        public final int mo11192a(int i) {
            return this.f11363d + 1 + i;
        }

        /* renamed from: a */
        public final void mo11194a() {
            C2286e.m5254a((Object[]) this.f11362c, (Object) null, 0, 0, 6);
            this.f11363d = this.f11362c.length - 1;
            this.f11364e = 0;
            this.f11365f = 0;
        }

        /* renamed from: a */
        public final void mo11195a(int i, C4792c cVar) {
            this.f11360a.add(cVar);
            int i2 = cVar.f11354a;
            if (i != -1) {
                C4792c cVar2 = this.f11362c[this.f11363d + 1 + i];
                if (cVar2 != null) {
                    i2 -= cVar2.f11354a;
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            }
            int i3 = this.f11367h;
            if (i2 > i3) {
                mo11194a();
                return;
            }
            int b = mo11196b((this.f11365f + i2) - i3);
            if (i == -1) {
                int i4 = this.f11364e + 1;
                C4792c[] cVarArr = this.f11362c;
                if (i4 > cVarArr.length) {
                    C4792c[] cVarArr2 = new C4792c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f11363d = this.f11362c.length - 1;
                    this.f11362c = cVarArr2;
                }
                int i5 = this.f11363d;
                this.f11363d = i5 - 1;
                this.f11362c[i5] = cVar;
                this.f11364e++;
            } else {
                this.f11362c[this.f11363d + 1 + i + b + i] = cVar;
            }
            this.f11365f += i2;
        }

        /* renamed from: b */
        public final int mo11196b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f11362c.length;
                while (true) {
                    length--;
                    if (length < this.f11363d || i <= 0) {
                        C4792c[] cVarArr = this.f11362c;
                        int i3 = this.f11363d;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i2, this.f11364e);
                        this.f11363d += i2;
                    } else {
                        C4792c cVar = this.f11362c[length];
                        if (cVar != null) {
                            int i4 = cVar.f11354a;
                            i -= i4;
                            this.f11365f -= i4;
                            this.f11364e--;
                            i2++;
                        } else {
                            C4638h.m10269a();
                            throw null;
                        }
                    }
                }
                C4792c[] cVarArr2 = this.f11362c;
                int i32 = this.f11363d;
                System.arraycopy(cVarArr2, i32 + 1, cVarArr2, i32 + 1 + i2, this.f11364e);
                this.f11363d += i2;
            }
            return i2;
        }

        /* renamed from: b */
        public final C4897j mo11197b() {
            int a = C4737b.m10442a(this.f11361b.readByte(), 255);
            byte b = 0;
            long a2 = (long) mo11193a(a, 127);
            if (!((a & 128) == 128)) {
                return this.f11361b.mo11446b(a2);
            }
            C4892f fVar = new C4892f();
            C4822n nVar = C4822n.f11512d;
            C4896i iVar = this.f11361b;
            if (iVar != null) {
                C4823a aVar = C4822n.f11511c;
                int i = 0;
                for (long j = 0; j < a2; j++) {
                    b = (b << 8) | (iVar.readByte() & 255);
                    i += 8;
                    while (i >= 8) {
                        int i2 = i - 8;
                        int i3 = (b >>> i2) & 255;
                        C4823a[] aVarArr = aVar.f11513a;
                        if (aVarArr != null) {
                            aVar = aVarArr[i3];
                            if (aVar == null) {
                                C4638h.m10269a();
                                throw null;
                            } else if (aVar.f11513a == null) {
                                fVar.writeByte(aVar.f11514b);
                                i -= aVar.f11515c;
                                aVar = C4822n.f11511c;
                            } else {
                                i = i2;
                            }
                        } else {
                            C4638h.m10269a();
                            throw null;
                        }
                    }
                }
                while (i > 0) {
                    int i4 = (b << (8 - i)) & 255;
                    C4823a[] aVarArr2 = aVar.f11513a;
                    if (aVarArr2 != null) {
                        C4823a aVar2 = aVarArr2[i4];
                        if (aVar2 != null) {
                            if (aVar2.f11513a != null || aVar2.f11515c > i) {
                                break;
                            }
                            fVar.writeByte(aVar2.f11514b);
                            i -= aVar2.f11515c;
                            aVar = C4822n.f11511c;
                        } else {
                            C4638h.m10269a();
                            throw null;
                        }
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
                return fVar.mo11464m();
            }
            C4638h.m10271a("source");
            throw null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p423w.C4897j mo11198c(int r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 < 0) goto L_0x000d
                v.m0.g.d r1 = p410v.p411m0.p416g.C4793d.f11359c
                v.m0.g.c[] r1 = p410v.p411m0.p416g.C4793d.f11357a
                int r1 = r1.length
                int r1 = r1 - r0
                if (r5 > r1) goto L_0x000d
                r1 = r0
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                if (r1 == 0) goto L_0x0017
                v.m0.g.d r0 = p410v.p411m0.p416g.C4793d.f11359c
                v.m0.g.c[] r0 = p410v.p411m0.p416g.C4793d.f11357a
                r5 = r0[r5]
                goto L_0x002d
            L_0x0017:
                v.m0.g.d r1 = p410v.p411m0.p416g.C4793d.f11359c
                v.m0.g.c[] r1 = p410v.p411m0.p416g.C4793d.f11357a
                int r1 = r1.length
                int r1 = r5 - r1
                int r1 = r4.mo11192a(r1)
                if (r1 < 0) goto L_0x0035
                v.m0.g.c[] r2 = r4.f11362c
                int r3 = r2.length
                if (r1 >= r3) goto L_0x0035
                r5 = r2[r1]
                if (r5 == 0) goto L_0x0030
            L_0x002d:
                w.j r5 = r5.f11355b
                return r5
            L_0x0030:
                p392u.p401r.p403c.C4638h.m10269a()
                r5 = 0
                throw r5
            L_0x0035:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "Header index too large "
                java.lang.StringBuilder r2 = p213q.p214a.p215a.p216a.C1965a.m4756a(r2)
                int r5 = r5 + r0
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p416g.C4793d.C4794a.mo11198c(int):w.j");
        }

        /* renamed from: a */
        public final int mo11193a(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int a = C4737b.m10442a(this.f11361b.readByte(), 255);
                if ((a & 128) == 0) {
                    return i2 + (a << i4);
                }
                i2 += (a & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: v.m0.g.d$b */
    public static final class C4795b {

        /* renamed from: a */
        public int f11368a;

        /* renamed from: b */
        public boolean f11369b;

        /* renamed from: c */
        public int f11370c;

        /* renamed from: d */
        public C4792c[] f11371d;

        /* renamed from: e */
        public int f11372e;

        /* renamed from: f */
        public int f11373f;

        /* renamed from: g */
        public int f11374g;

        /* renamed from: h */
        public int f11375h;

        /* renamed from: i */
        public final boolean f11376i;

        /* renamed from: j */
        public final C4892f f11377j;

        public /* synthetic */ C4795b(int i, boolean z, C4892f fVar, int i2) {
            if ((i2 & 1) != 0) {
                i = 4096;
            }
            if ((i2 & 2) != 0) {
                z = true;
            }
            if (fVar != null) {
                this.f11375h = i;
                this.f11376i = z;
                this.f11377j = fVar;
                this.f11368a = Integer.MAX_VALUE;
                this.f11370c = i;
                this.f11371d = new C4792c[8];
                this.f11372e = 7;
                return;
            }
            C4638h.m10271a("out");
            throw null;
        }

        /* renamed from: a */
        public final int mo11199a(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f11371d.length;
                while (true) {
                    length--;
                    if (length < this.f11372e || i <= 0) {
                        C4792c[] cVarArr = this.f11371d;
                        int i3 = this.f11372e;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i2, this.f11373f);
                        C4792c[] cVarArr2 = this.f11371d;
                        int i4 = this.f11372e;
                        Arrays.fill(cVarArr2, i4 + 1, i4 + 1 + i2, null);
                        this.f11372e += i2;
                    } else {
                        C4792c[] cVarArr3 = this.f11371d;
                        C4792c cVar = cVarArr3[length];
                        if (cVar != null) {
                            i -= cVar.f11354a;
                            int i5 = this.f11374g;
                            C4792c cVar2 = cVarArr3[length];
                            if (cVar2 != null) {
                                this.f11374g = i5 - cVar2.f11354a;
                                this.f11373f--;
                                i2++;
                            } else {
                                C4638h.m10269a();
                                throw null;
                            }
                        } else {
                            C4638h.m10269a();
                            throw null;
                        }
                    }
                }
                C4792c[] cVarArr4 = this.f11371d;
                int i32 = this.f11372e;
                System.arraycopy(cVarArr4, i32 + 1, cVarArr4, i32 + 1 + i2, this.f11373f);
                C4792c[] cVarArr22 = this.f11371d;
                int i42 = this.f11372e;
                Arrays.fill(cVarArr22, i42 + 1, i42 + 1 + i2, null);
                this.f11372e += i2;
            }
            return i2;
        }

        /* renamed from: a */
        public final void mo11200a() {
            C2286e.m5254a((Object[]) this.f11371d, (Object) null, 0, 0, 6);
            this.f11372e = this.f11371d.length - 1;
            this.f11373f = 0;
            this.f11374g = 0;
        }

        /* renamed from: a */
        public final void mo11201a(int i, int i2, int i3) {
            int i4;
            C4892f fVar;
            if (i < i2) {
                fVar = this.f11377j;
                i4 = i | i3;
            } else {
                this.f11377j.writeByte(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f11377j.writeByte(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                fVar = this.f11377j;
            }
            fVar.writeByte(i4);
        }

        /* renamed from: a */
        public final void mo11203a(C4792c cVar) {
            int i = cVar.f11354a;
            int i2 = this.f11370c;
            if (i > i2) {
                mo11200a();
                return;
            }
            mo11199a((this.f11374g + i) - i2);
            int i3 = this.f11373f + 1;
            C4792c[] cVarArr = this.f11371d;
            if (i3 > cVarArr.length) {
                C4792c[] cVarArr2 = new C4792c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f11372e = this.f11371d.length - 1;
                this.f11371d = cVarArr2;
            }
            int i4 = this.f11372e;
            this.f11372e = i4 - 1;
            this.f11371d[i4] = cVar;
            this.f11373f++;
            this.f11374g += i;
        }

        /* JADX WARNING: type inference failed for: r3v4, types: [int] */
        /* JADX WARNING: type inference failed for: r3v5, types: [int, long] */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: type inference failed for: r3v7 */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11204a(p423w.C4897j r13) {
            /*
                r12 = this;
                if (r13 == 0) goto L_0x008e
                boolean r0 = r12.f11376i
                r1 = 127(0x7f, float:1.78E-43)
                r2 = 0
                if (r0 == 0) goto L_0x0081
                v.m0.g.n r0 = p410v.p411m0.p416g.C4822n.f11512d
                int r0 = r13.mo11503g()
                r3 = 0
                r5 = r2
                r6 = r3
            L_0x0013:
                r8 = 255(0xff, float:3.57E-43)
                if (r5 >= r0) goto L_0x0028
                byte r9 = r13.mo11495a(r5)
                int r8 = p410v.p411m0.C4737b.m10442a(r9, r8)
                byte[] r9 = p410v.p411m0.p416g.C4822n.f11510b
                byte r8 = r9[r8]
                long r8 = (long) r8
                long r6 = r6 + r8
                int r5 = r5 + 1
                goto L_0x0013
            L_0x0028:
                r0 = 7
                long r9 = (long) r0
                long r6 = r6 + r9
                r0 = 3
                long r5 = r6 >> r0
                int r0 = (int) r5
                int r5 = r13.mo11503g()
                if (r0 >= r5) goto L_0x0081
                w.f r0 = new w.f
                r0.<init>()
                v.m0.g.n r5 = p410v.p411m0.p416g.C4822n.f11512d
                int r5 = r13.mo11503g()
                r6 = r3
                r3 = r2
            L_0x0042:
                r4 = 8
                if (r2 >= r5) goto L_0x0068
                byte r9 = r13.mo11495a(r2)
                int r9 = p410v.p411m0.C4737b.m10442a(r9, r8)
                int[] r10 = p410v.p411m0.p416g.C4822n.f11509a
                r10 = r10[r9]
                byte[] r11 = p410v.p411m0.p416g.C4822n.f11510b
                byte r9 = r11[r9]
                long r6 = r6 << r9
                long r10 = (long) r10
                long r6 = r6 | r10
                int r3 = r3 + r9
            L_0x005a:
                if (r3 < r4) goto L_0x0065
                int r3 = r3 + -8
                long r9 = r6 >> r3
                int r9 = (int) r9
                r0.writeByte(r9)
                goto L_0x005a
            L_0x0065:
                int r2 = r2 + 1
                goto L_0x0042
            L_0x0068:
                if (r3 <= 0) goto L_0x0076
                int r4 = r4 - r3
                long r4 = r6 << r4
                r6 = 255(0xff, double:1.26E-321)
                long r2 = r6 >>> r3
                long r2 = r2 | r4
                int r13 = (int) r2
                r0.writeByte(r13)
            L_0x0076:
                w.j r13 = r0.mo11464m()
                int r0 = r13.mo11503g()
                r2 = 128(0x80, float:1.794E-43)
                goto L_0x0085
            L_0x0081:
                int r0 = r13.mo11503g()
            L_0x0085:
                r12.mo11201a(r0, r1, r2)
                w.f r0 = r12.f11377j
                r0.mo11443a(r13)
                return
            L_0x008e:
                java.lang.String r13 = "data"
                p392u.p401r.p403c.C4638h.m10271a(r13)
                r13 = 0
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p416g.C4793d.C4795b.mo11204a(w.j):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11202a(java.util.List<p410v.p411m0.p416g.C4792c> r14) {
            /*
                r13 = this;
                r0 = 0
                if (r14 == 0) goto L_0x010c
                boolean r1 = r13.f11369b
                r2 = 0
                if (r1 == 0) goto L_0x0021
                int r1 = r13.f11368a
                int r3 = r13.f11370c
                r4 = 32
                r5 = 31
                if (r1 >= r3) goto L_0x0015
                r13.mo11201a(r1, r5, r4)
            L_0x0015:
                r13.f11369b = r2
                r1 = 2147483647(0x7fffffff, float:NaN)
                r13.f11368a = r1
                int r1 = r13.f11370c
                r13.mo11201a(r1, r5, r4)
            L_0x0021:
                int r1 = r14.size()
                r3 = r2
            L_0x0026:
                if (r3 >= r1) goto L_0x010b
                java.lang.Object r4 = r14.get(r3)
                v.m0.g.c r4 = (p410v.p411m0.p416g.C4792c) r4
                w.j r5 = r4.f11355b
                w.j r5 = r5.mo11507k()
                w.j r6 = r4.f11356c
                v.m0.g.d r7 = p410v.p411m0.p416g.C4793d.f11359c
                java.util.Map<w.j, java.lang.Integer> r7 = p410v.p411m0.p416g.C4793d.f11358b
                java.lang.Object r7 = r7.get(r5)
                java.lang.Integer r7 = (java.lang.Integer) r7
                r8 = -1
                if (r7 == 0) goto L_0x0074
                int r7 = r7.intValue()
                int r7 = r7 + 1
                r9 = 7
                r10 = 2
                if (r10 <= r7) goto L_0x004e
                goto L_0x0072
            L_0x004e:
                if (r9 < r7) goto L_0x0072
                v.m0.g.d r9 = p410v.p411m0.p416g.C4793d.f11359c
                v.m0.g.c[] r9 = p410v.p411m0.p416g.C4793d.f11357a
                int r10 = r7 + -1
                r9 = r9[r10]
                w.j r9 = r9.f11356c
                boolean r9 = p392u.p401r.p403c.C4638h.m10272a(r9, r6)
                if (r9 == 0) goto L_0x0061
                goto L_0x0075
            L_0x0061:
                v.m0.g.d r9 = p410v.p411m0.p416g.C4793d.f11359c
                v.m0.g.c[] r9 = p410v.p411m0.p416g.C4793d.f11357a
                r9 = r9[r7]
                w.j r9 = r9.f11356c
                boolean r9 = p392u.p401r.p403c.C4638h.m10272a(r9, r6)
                if (r9 == 0) goto L_0x0072
                int r9 = r7 + 1
                goto L_0x0076
            L_0x0072:
                r9 = r8
                goto L_0x0076
            L_0x0074:
                r7 = r8
            L_0x0075:
                r9 = r7
            L_0x0076:
                if (r9 != r8) goto L_0x00bf
                int r10 = r13.f11372e
                int r10 = r10 + 1
                v.m0.g.c[] r11 = r13.f11371d
                int r11 = r11.length
            L_0x007f:
                if (r10 >= r11) goto L_0x00bf
                v.m0.g.c[] r12 = r13.f11371d
                r12 = r12[r10]
                if (r12 == 0) goto L_0x00bb
                w.j r12 = r12.f11355b
                boolean r12 = p392u.p401r.p403c.C4638h.m10272a(r12, r5)
                if (r12 == 0) goto L_0x00b8
                v.m0.g.c[] r12 = r13.f11371d
                r12 = r12[r10]
                if (r12 == 0) goto L_0x00b4
                w.j r12 = r12.f11356c
                boolean r12 = p392u.p401r.p403c.C4638h.m10272a(r12, r6)
                if (r12 == 0) goto L_0x00a7
                int r9 = r13.f11372e
                int r10 = r10 - r9
                v.m0.g.d r9 = p410v.p411m0.p416g.C4793d.f11359c
                v.m0.g.c[] r9 = p410v.p411m0.p416g.C4793d.f11357a
                int r9 = r9.length
                int r9 = r9 + r10
                goto L_0x00bf
            L_0x00a7:
                if (r7 != r8) goto L_0x00b8
                int r7 = r13.f11372e
                int r7 = r10 - r7
                v.m0.g.d r12 = p410v.p411m0.p416g.C4793d.f11359c
                v.m0.g.c[] r12 = p410v.p411m0.p416g.C4793d.f11357a
                int r12 = r12.length
                int r7 = r7 + r12
                goto L_0x00b8
            L_0x00b4:
                p392u.p401r.p403c.C4638h.m10269a()
                throw r0
            L_0x00b8:
                int r10 = r10 + 1
                goto L_0x007f
            L_0x00bb:
                p392u.p401r.p403c.C4638h.m10269a()
                throw r0
            L_0x00bf:
                if (r9 == r8) goto L_0x00c9
                r4 = 127(0x7f, float:1.78E-43)
                r5 = 128(0x80, float:1.794E-43)
                r13.mo11201a(r9, r4, r5)
                goto L_0x0100
            L_0x00c9:
                r9 = 64
                if (r7 != r8) goto L_0x00d6
                w.f r7 = r13.f11377j
                r7.writeByte(r9)
                r13.mo11204a(r5)
                goto L_0x00fa
            L_0x00d6:
                w.j r8 = p410v.p411m0.p416g.C4792c.f11348d
                if (r5 == 0) goto L_0x010a
                if (r8 == 0) goto L_0x0104
                boolean r8 = p423w.p424c0.C4889a.m10946b(r5, r8)
                if (r8 == 0) goto L_0x00f5
                w.j r8 = p410v.p411m0.p416g.C4792c.f11353i
                boolean r5 = p392u.p401r.p403c.C4638h.m10272a(r8, r5)
                r5 = r5 ^ 1
                if (r5 == 0) goto L_0x00f5
                r4 = 15
                r13.mo11201a(r7, r4, r2)
                r13.mo11204a(r6)
                goto L_0x0100
            L_0x00f5:
                r5 = 63
                r13.mo11201a(r7, r5, r9)
            L_0x00fa:
                r13.mo11204a(r6)
                r13.mo11203a(r4)
            L_0x0100:
                int r3 = r3 + 1
                goto L_0x0026
            L_0x0104:
                java.lang.String r14 = "prefix"
                p392u.p401r.p403c.C4638h.m10271a(r14)
                throw r0
            L_0x010a:
                throw r0
            L_0x010b:
                return
            L_0x010c:
                java.lang.String r14 = "headerBlock"
                p392u.p401r.p403c.C4638h.m10271a(r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p416g.C4793d.C4795b.mo11202a(java.util.List):void");
        }
    }

    static {
        C4897j jVar = C4792c.f11353i;
        String str = Objects.EMPTY_STRING;
        C4792c cVar = new C4792c(jVar, str);
        f11357a = new C4792c[]{cVar, new C4792c(C4792c.f11350f, "GET"), new C4792c(C4792c.f11350f, "POST"), new C4792c(C4792c.f11351g, Strings.FOLDER_SEPARATOR), new C4792c(C4792c.f11351g, "/index.html"), new C4792c(C4792c.f11352h, "http"), new C4792c(C4792c.f11352h, "https"), new C4792c(C4792c.f11349e, "200"), new C4792c(C4792c.f11349e, "204"), new C4792c(C4792c.f11349e, "206"), new C4792c(C4792c.f11349e, "304"), new C4792c(C4792c.f11349e, "400"), new C4792c(C4792c.f11349e, "404"), new C4792c(C4792c.f11349e, "500"), new C4792c("accept-charset", str), new C4792c("accept-encoding", "gzip, deflate"), new C4792c("accept-language", str), new C4792c("accept-ranges", str), new C4792c("accept", str), new C4792c("access-control-allow-origin", str), new C4792c("age", str), new C4792c("allow", str), new C4792c("authorization", str), new C4792c("cache-control", str), new C4792c("content-disposition", str), new C4792c("content-encoding", str), new C4792c("content-language", str), new C4792c("content-length", str), new C4792c("content-location", str), new C4792c("content-range", str), new C4792c("content-type", str), new C4792c("cookie", str), new C4792c("date", str), new C4792c("etag", str), new C4792c("expect", str), new C4792c("expires", str), new C4792c("from", str), new C4792c("host", str), new C4792c("if-match", str), new C4792c("if-modified-since", str), new C4792c("if-none-match", str), new C4792c("if-range", str), new C4792c("if-unmodified-since", str), new C4792c("last-modified", str), new C4792c("link", str), new C4792c("location", str), new C4792c("max-forwards", str), new C4792c("proxy-authenticate", str), new C4792c("proxy-authorization", str), new C4792c("range", str), new C4792c("referer", str), new C4792c("refresh", str), new C4792c("retry-after", str), new C4792c("server", str), new C4792c("set-cookie", str), new C4792c("strict-transport-security", str), new C4792c("transfer-encoding", str), new C4792c("user-agent", str), new C4792c("vary", str), new C4792c("via", str), new C4792c("www-authenticate", str)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(f11357a.length);
        int length = f11357a.length;
        for (int i = 0; i < length; i++) {
            if (!linkedHashMap.containsKey(f11357a[i].f11355b)) {
                linkedHashMap.put(f11357a[i].f11355b, Integer.valueOf(i));
            }
        }
        Map<C4897j, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C4638h.m10270a((Object) unmodifiableMap, "Collections.unmodifiableMap(result)");
        f11358b = unmodifiableMap;
    }

    /* renamed from: a */
    public final C4897j mo11191a(C4897j jVar) {
        if (jVar != null) {
            int g = jVar.mo11503g();
            for (int i = 0; i < g; i++) {
                byte b = (byte) 65;
                byte b2 = (byte) 90;
                byte a = jVar.mo11495a(i);
                if (b <= a && b2 >= a) {
                    StringBuilder a2 = C1965a.m4756a("PROTOCOL_ERROR response malformed: mixed case name: ");
                    a2.append(C4889a.m10953h(jVar));
                    throw new IOException(a2.toString());
                }
            }
            return jVar;
        }
        C4638h.m10271a("name");
        throw null;
    }
}
