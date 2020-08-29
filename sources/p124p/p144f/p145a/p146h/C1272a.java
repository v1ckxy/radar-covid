package p124p.p144f.p145a.p146h;

import java.util.ArrayList;

/* renamed from: p.f.a.h.a */
public class C1272a extends C1283h {

    /* renamed from: m0 */
    public int f3649m0 = 0;

    /* renamed from: n0 */
    public ArrayList<C1285j> f3650n0 = new ArrayList<>(4);

    /* renamed from: o0 */
    public boolean f3651o0 = true;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r1 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5670a(p124p.p144f.p145a.C1267e r14) {
        /*
            r13 = this;
            p.f.a.h.c[] r0 = r13.f3696A
            p.f.a.h.c r1 = r13.f3749s
            r2 = 0
            r0[r2] = r1
            p.f.a.h.c r1 = r13.f3750t
            r3 = 2
            r0[r3] = r1
            p.f.a.h.c r1 = r13.f3751u
            r4 = 1
            r0[r4] = r1
            p.f.a.h.c r1 = r13.f3752v
            r5 = 3
            r0[r5] = r1
            r0 = r2
        L_0x0017:
            p.f.a.h.c[] r1 = r13.f3696A
            int r6 = r1.length
            if (r0 >= r6) goto L_0x0029
            r6 = r1[r0]
            r1 = r1[r0]
            p.f.a.g r1 = r14.mo5643a(r1)
            r6.f3677i = r1
            int r0 = r0 + 1
            goto L_0x0017
        L_0x0029:
            int r0 = r13.f3649m0
            if (r0 < 0) goto L_0x016d
            r6 = 4
            if (r0 >= r6) goto L_0x016d
            r0 = r1[r0]
            r1 = r2
        L_0x0033:
            int r6 = r13.f3801l0
            if (r1 >= r6) goto L_0x0068
            p.f.a.h.d[] r6 = r13.f3800k0
            r6 = r6[r1]
            boolean r7 = r13.f3651o0
            if (r7 != 0) goto L_0x0046
            boolean r7 = r6.mo5671a()
            if (r7 != 0) goto L_0x0046
            goto L_0x0065
        L_0x0046:
            int r7 = r13.f3649m0
            if (r7 == 0) goto L_0x004c
            if (r7 != r4) goto L_0x0056
        L_0x004c:
            p.f.a.h.d$a r7 = r6.mo5698e()
            p.f.a.h.d$a r8 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r7 != r8) goto L_0x0056
        L_0x0054:
            r1 = r4
            goto L_0x0069
        L_0x0056:
            int r7 = r13.f3649m0
            if (r7 == r3) goto L_0x005c
            if (r7 != r5) goto L_0x0065
        L_0x005c:
            p.f.a.h.d$a r6 = r6.mo5704i()
            p.f.a.h.d$a r7 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x0065
            goto L_0x0054
        L_0x0065:
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0068:
            r1 = r2
        L_0x0069:
            int r6 = r13.f3649m0
            if (r6 == 0) goto L_0x007b
            if (r6 != r4) goto L_0x0070
            goto L_0x007b
        L_0x0070:
            p.f.a.h.d r6 = r13.f3699D
            p.f.a.h.d$a r6 = r6.mo5704i()
            p.f.a.h.d$a r7 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r6 != r7) goto L_0x0086
            goto L_0x0085
        L_0x007b:
            p.f.a.h.d r6 = r13.f3699D
            p.f.a.h.d$a r6 = r6.mo5698e()
            p.f.a.h.d$a r7 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r6 != r7) goto L_0x0086
        L_0x0085:
            r1 = r2
        L_0x0086:
            r6 = r2
        L_0x0087:
            int r7 = r13.f3801l0
            if (r6 >= r7) goto L_0x0104
            p.f.a.h.d[] r7 = r13.f3800k0
            r7 = r7[r6]
            boolean r8 = r13.f3651o0
            if (r8 != 0) goto L_0x009a
            boolean r8 = r7.mo5671a()
            if (r8 != 0) goto L_0x009a
            goto L_0x0101
        L_0x009a:
            p.f.a.h.c[] r8 = r7.f3696A
            int r9 = r13.f3649m0
            r8 = r8[r9]
            p.f.a.g r8 = r14.mo5643a(r8)
            p.f.a.h.c[] r7 = r7.f3696A
            int r9 = r13.f3649m0
            r7 = r7[r9]
            r7.f3677i = r8
            r7 = 0
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 == 0) goto L_0x00db
            if (r9 != r3) goto L_0x00b4
            goto L_0x00db
        L_0x00b4:
            p.f.a.g r9 = r0.f3677i
            p.f.a.b r11 = r14.mo5653b()
            p.f.a.g r12 = r14.mo5656c()
            r12.f3636d = r2
            r11.mo5634a(r9, r8, r12, r2)
            if (r1 == 0) goto L_0x00d7
            p.f.a.a r8 = r11.f3609d
            float r8 = r8.mo5623a(r12)
            float r8 = r8 * r10
            int r8 = (int) r8
            p.f.a.g r7 = r14.mo5642a(r4, r7)
            p.f.a.a r9 = r11.f3609d
            float r8 = (float) r8
            r9.mo5628a(r7, r8)
        L_0x00d7:
            r14.mo5646a(r11)
            goto L_0x0101
        L_0x00db:
            p.f.a.g r9 = r0.f3677i
            p.f.a.b r11 = r14.mo5653b()
            p.f.a.g r12 = r14.mo5656c()
            r12.f3636d = r2
            r11.mo5637b(r9, r8, r12, r2)
            if (r1 == 0) goto L_0x00fe
            p.f.a.a r8 = r11.f3609d
            float r8 = r8.mo5623a(r12)
            float r8 = r8 * r10
            int r8 = (int) r8
            p.f.a.g r7 = r14.mo5642a(r4, r7)
            p.f.a.a r9 = r11.f3609d
            float r8 = (float) r8
            r9.mo5628a(r7, r8)
        L_0x00fe:
            r14.mo5646a(r11)
        L_0x0101:
            int r6 = r6 + 1
            goto L_0x0087
        L_0x0104:
            int r0 = r13.f3649m0
            r6 = 5
            r7 = 6
            if (r0 != 0) goto L_0x0125
            p.f.a.h.c r0 = r13.f3751u
            p.f.a.g r0 = r0.f3677i
            p.f.a.h.c r3 = r13.f3749s
            p.f.a.g r3 = r3.f3677i
            r14.mo5641a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x016d
            p.f.a.h.c r0 = r13.f3749s
            p.f.a.g r0 = r0.f3677i
            p.f.a.h.d r1 = r13.f3699D
            p.f.a.h.c r1 = r1.f3751u
        L_0x011f:
            p.f.a.g r1 = r1.f3677i
            r14.mo5641a(r0, r1, r2, r6)
            goto L_0x016d
        L_0x0125:
            if (r0 != r4) goto L_0x013d
            p.f.a.h.c r0 = r13.f3749s
            p.f.a.g r0 = r0.f3677i
            p.f.a.h.c r3 = r13.f3751u
            p.f.a.g r3 = r3.f3677i
            r14.mo5641a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x016d
            p.f.a.h.c r0 = r13.f3749s
            p.f.a.g r0 = r0.f3677i
            p.f.a.h.d r1 = r13.f3699D
            p.f.a.h.c r1 = r1.f3749s
            goto L_0x011f
        L_0x013d:
            if (r0 != r3) goto L_0x0155
            p.f.a.h.c r0 = r13.f3752v
            p.f.a.g r0 = r0.f3677i
            p.f.a.h.c r3 = r13.f3750t
            p.f.a.g r3 = r3.f3677i
            r14.mo5641a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x016d
            p.f.a.h.c r0 = r13.f3750t
            p.f.a.g r0 = r0.f3677i
            p.f.a.h.d r1 = r13.f3699D
            p.f.a.h.c r1 = r1.f3752v
            goto L_0x011f
        L_0x0155:
            if (r0 != r5) goto L_0x016d
            p.f.a.h.c r0 = r13.f3750t
            p.f.a.g r0 = r0.f3677i
            p.f.a.h.c r3 = r13.f3752v
            p.f.a.g r3 = r3.f3677i
            r14.mo5641a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x016d
            p.f.a.h.c r0 = r13.f3750t
            p.f.a.g r0 = r0.f3677i
            p.f.a.h.d r1 = r13.f3699D
            p.f.a.h.c r1 = r1.f3750t
            goto L_0x011f
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p144f.p145a.p146h.C1272a.mo5670a(p.f.a.e):void");
    }

    /* renamed from: a */
    public boolean mo5671a() {
        return true;
    }

    /* renamed from: m */
    public void mo5672m() {
        super.mo5672m();
        this.f3650n0.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5673n() {
        /*
            r11 = this;
            int r0 = r11.f3649m0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0020
            if (r0 == r4) goto L_0x001a
            if (r0 == r3) goto L_0x0015
            if (r0 == r2) goto L_0x0012
            return
        L_0x0012:
            p.f.a.h.c r0 = r11.f3752v
            goto L_0x001c
        L_0x0015:
            p.f.a.h.c r0 = r11.f3750t
        L_0x0017:
            p.f.a.h.j r0 = r0.f3669a
            goto L_0x0023
        L_0x001a:
            p.f.a.h.c r0 = r11.f3751u
        L_0x001c:
            p.f.a.h.j r0 = r0.f3669a
            r1 = r5
            goto L_0x0023
        L_0x0020:
            p.f.a.h.c r0 = r11.f3749s
            goto L_0x0017
        L_0x0023:
            java.util.ArrayList<p.f.a.h.j> r5 = r11.f3650n0
            int r5 = r5.size()
            r6 = 0
            r7 = 0
        L_0x002b:
            if (r7 >= r5) goto L_0x0055
            java.util.ArrayList<p.f.a.h.j> r8 = r11.f3650n0
            java.lang.Object r8 = r8.get(r7)
            p.f.a.h.j r8 = (p124p.p144f.p145a.p146h.C1285j) r8
            int r9 = r8.f3816b
            if (r9 == r4) goto L_0x003a
            return
        L_0x003a:
            int r9 = r11.f3649m0
            if (r9 == 0) goto L_0x0048
            if (r9 != r3) goto L_0x0041
            goto L_0x0048
        L_0x0041:
            float r9 = r8.f3807g
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x0052
            goto L_0x004e
        L_0x0048:
            float r9 = r8.f3807g
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0052
        L_0x004e:
            p.f.a.h.j r1 = r8.f3806f
            r6 = r1
            r1 = r9
        L_0x0052:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0055:
            r0.f3806f = r6
            r0.f3807g = r1
            r0.mo5733a()
            int r0 = r11.f3649m0
            if (r0 == 0) goto L_0x0070
            if (r0 == r4) goto L_0x006d
            if (r0 == r3) goto L_0x006a
            if (r0 == r2) goto L_0x0067
            return
        L_0x0067:
            p.f.a.h.c r0 = r11.f3750t
            goto L_0x0072
        L_0x006a:
            p.f.a.h.c r0 = r11.f3752v
            goto L_0x0072
        L_0x006d:
            p.f.a.h.c r0 = r11.f3749s
            goto L_0x0072
        L_0x0070:
            p.f.a.h.c r0 = r11.f3751u
        L_0x0072:
            p.f.a.h.j r0 = r0.f3669a
            r0.mo5726a(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p144f.p145a.p146h.C1272a.mo5673n():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008d A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5669a(int r8) {
        /*
            r7 = this;
            p.f.a.h.d r8 = r7.f3699D
            if (r8 != 0) goto L_0x0005
            return
        L_0x0005:
            p.f.a.h.e r8 = (p124p.p144f.p145a.p146h.C1280e) r8
            r0 = 2
            boolean r8 = r8.mo5713g(r0)
            if (r8 != 0) goto L_0x000f
            return
        L_0x000f:
            int r8 = r7.f3649m0
            r1 = 3
            r2 = 1
            if (r8 == 0) goto L_0x0027
            if (r8 == r2) goto L_0x0024
            if (r8 == r0) goto L_0x0021
            if (r8 == r1) goto L_0x001c
            return
        L_0x001c:
            p.f.a.h.c r8 = r7.f3752v
        L_0x001e:
            p.f.a.h.j r8 = r8.f3669a
            goto L_0x002a
        L_0x0021:
            p.f.a.h.c r8 = r7.f3750t
            goto L_0x001e
        L_0x0024:
            p.f.a.h.c r8 = r7.f3751u
            goto L_0x001e
        L_0x0027:
            p.f.a.h.c r8 = r7.f3749s
            goto L_0x001e
        L_0x002a:
            r3 = 5
            r8.f3808h = r3
            int r3 = r7.f3649m0
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0040
            if (r3 != r2) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            p.f.a.h.c r3 = r7.f3749s
            p.f.a.h.j r3 = r3.f3669a
            r3.mo5726a(r5, r4)
            p.f.a.h.c r3 = r7.f3751u
            goto L_0x0049
        L_0x0040:
            p.f.a.h.c r3 = r7.f3750t
            p.f.a.h.j r3 = r3.f3669a
            r3.mo5726a(r5, r4)
            p.f.a.h.c r3 = r7.f3752v
        L_0x0049:
            p.f.a.h.j r3 = r3.f3669a
            r3.mo5726a(r5, r4)
            java.util.ArrayList<p.f.a.h.j> r3 = r7.f3650n0
            r3.clear()
            r3 = 0
        L_0x0054:
            int r4 = r7.f3801l0
            if (r3 >= r4) goto L_0x0090
            p.f.a.h.d[] r4 = r7.f3800k0
            r4 = r4[r3]
            boolean r6 = r7.f3651o0
            if (r6 != 0) goto L_0x0067
            boolean r6 = r4.mo5671a()
            if (r6 != 0) goto L_0x0067
            goto L_0x008d
        L_0x0067:
            int r6 = r7.f3649m0
            if (r6 == 0) goto L_0x007e
            if (r6 == r2) goto L_0x007b
            if (r6 == r0) goto L_0x0078
            if (r6 == r1) goto L_0x0073
            r4 = r5
            goto L_0x0081
        L_0x0073:
            p.f.a.h.c r4 = r4.f3752v
        L_0x0075:
            p.f.a.h.j r4 = r4.f3669a
            goto L_0x0081
        L_0x0078:
            p.f.a.h.c r4 = r4.f3750t
            goto L_0x0075
        L_0x007b:
            p.f.a.h.c r4 = r4.f3751u
            goto L_0x0075
        L_0x007e:
            p.f.a.h.c r4 = r4.f3749s
            goto L_0x0075
        L_0x0081:
            if (r4 == 0) goto L_0x008d
            java.util.ArrayList<p.f.a.h.j> r6 = r7.f3650n0
            r6.add(r4)
            java.util.HashSet<p.f.a.h.l> r4 = r4.f3815a
            r4.add(r8)
        L_0x008d:
            int r3 = r3 + 1
            goto L_0x0054
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p144f.p145a.p146h.C1272a.mo5669a(int):void");
    }
}
