package p124p.p144f.p145a.p146h;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: p.f.a.h.f */
public class C1281f {

    /* renamed from: a */
    public List<C1278d> f3783a;

    /* renamed from: b */
    public int f3784b = -1;

    /* renamed from: c */
    public int f3785c = -1;

    /* renamed from: d */
    public boolean f3786d = false;

    /* renamed from: e */
    public final int[] f3787e = {-1, -1};

    /* renamed from: f */
    public List<C1278d> f3788f = new ArrayList();

    /* renamed from: g */
    public List<C1278d> f3789g = new ArrayList();

    /* renamed from: h */
    public HashSet<C1278d> f3790h = new HashSet<>();

    /* renamed from: i */
    public HashSet<C1278d> f3791i = new HashSet<>();

    /* renamed from: j */
    public List<C1278d> f3792j = new ArrayList();

    /* renamed from: k */
    public List<C1278d> f3793k = new ArrayList();

    public C1281f(List<C1278d> list) {
        this.f3783a = list;
    }

    public C1281f(List<C1278d> list, boolean z) {
        this.f3783a = list;
        this.f3786d = z;
    }

    /* renamed from: a */
    public final void mo5719a(ArrayList<C1278d> arrayList, C1278d dVar) {
        if (!dVar.f3729d0) {
            arrayList.add(dVar);
            dVar.f3729d0 = true;
            if (!dVar.mo5706k()) {
                if (dVar instanceof C1283h) {
                    C1283h hVar = (C1283h) dVar;
                    int i = hVar.f3801l0;
                    for (int i2 = 0; i2 < i; i2++) {
                        mo5719a(arrayList, hVar.f3800k0[i2]);
                    }
                }
                for (C1274c cVar : dVar.f3696A) {
                    C1274c cVar2 = cVar.f3672d;
                    if (cVar2 != null) {
                        C1278d dVar2 = cVar2.f3670b;
                        if (dVar2 != dVar.f3699D) {
                            mo5719a(arrayList, dVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5720a(p124p.p144f.p145a.p146h.C1278d r7) {
        /*
            r6 = this;
            boolean r0 = r7.f3725b0
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r7.mo5706k()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            p.f.a.h.c r0 = r7.f3751u
            p.f.a.h.c r0 = r0.f3672d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 == 0) goto L_0x001b
            p.f.a.h.c r3 = r7.f3751u
            goto L_0x001d
        L_0x001b:
            p.f.a.h.c r3 = r7.f3749s
        L_0x001d:
            p.f.a.h.c r3 = r3.f3672d
            if (r3 == 0) goto L_0x0043
            p.f.a.h.d r4 = r3.f3670b
            boolean r5 = r4.f3727c0
            if (r5 != 0) goto L_0x002a
            r6.mo5720a(r4)
        L_0x002a:
            p.f.a.h.c$c r4 = r3.f3671c
            p.f.a.h.c$c r5 = p124p.p144f.p145a.p146h.C1274c.C1277c.RIGHT
            if (r4 != r5) goto L_0x003a
            p.f.a.h.d r3 = r3.f3670b
            int r4 = r3.f3704I
            int r3 = r3.mo5705j()
            int r3 = r3 + r4
            goto L_0x0044
        L_0x003a:
            p.f.a.h.c$c r5 = p124p.p144f.p145a.p146h.C1274c.C1277c.LEFT
            if (r4 != r5) goto L_0x0043
            p.f.a.h.d r3 = r3.f3670b
            int r3 = r3.f3704I
            goto L_0x0044
        L_0x0043:
            r3 = r1
        L_0x0044:
            if (r0 == 0) goto L_0x004e
            p.f.a.h.c r0 = r7.f3751u
            int r0 = r0.mo5674a()
            int r3 = r3 - r0
            goto L_0x005a
        L_0x004e:
            p.f.a.h.c r0 = r7.f3749s
            int r0 = r0.mo5674a()
            int r4 = r7.mo5705j()
            int r4 = r4 + r0
            int r3 = r3 + r4
        L_0x005a:
            int r0 = r7.mo5705j()
            int r0 = r3 - r0
            r7.mo5681a(r0, r3)
            p.f.a.h.c r0 = r7.f3753w
            p.f.a.h.c r0 = r0.f3672d
            if (r0 == 0) goto L_0x0085
            p.f.a.h.d r1 = r0.f3670b
            boolean r3 = r1.f3727c0
            if (r3 != 0) goto L_0x0072
            r6.mo5720a(r1)
        L_0x0072:
            p.f.a.h.d r0 = r0.f3670b
            int r1 = r0.f3705J
            int r0 = r0.f3712Q
            int r1 = r1 + r0
            int r0 = r7.f3712Q
            int r1 = r1 - r0
            int r0 = r7.f3701F
            int r0 = r0 + r1
            r7.mo5694c(r1, r0)
            r7.f3727c0 = r2
            return
        L_0x0085:
            p.f.a.h.c r0 = r7.f3752v
            p.f.a.h.c r0 = r0.f3672d
            if (r0 == 0) goto L_0x008c
            r1 = r2
        L_0x008c:
            if (r1 == 0) goto L_0x0091
            p.f.a.h.c r0 = r7.f3752v
            goto L_0x0093
        L_0x0091:
            p.f.a.h.c r0 = r7.f3750t
        L_0x0093:
            p.f.a.h.c r0 = r0.f3672d
            if (r0 == 0) goto L_0x00b8
            p.f.a.h.d r4 = r0.f3670b
            boolean r5 = r4.f3727c0
            if (r5 != 0) goto L_0x00a0
            r6.mo5720a(r4)
        L_0x00a0:
            p.f.a.h.c$c r4 = r0.f3671c
            p.f.a.h.c$c r5 = p124p.p144f.p145a.p146h.C1274c.C1277c.BOTTOM
            if (r4 != r5) goto L_0x00b0
            p.f.a.h.d r0 = r0.f3670b
            int r3 = r0.f3705J
            int r0 = r0.mo5696d()
            int r3 = r3 + r0
            goto L_0x00b8
        L_0x00b0:
            p.f.a.h.c$c r5 = p124p.p144f.p145a.p146h.C1274c.C1277c.TOP
            if (r4 != r5) goto L_0x00b8
            p.f.a.h.d r0 = r0.f3670b
            int r3 = r0.f3705J
        L_0x00b8:
            if (r1 == 0) goto L_0x00c2
            p.f.a.h.c r0 = r7.f3752v
            int r0 = r0.mo5674a()
            int r3 = r3 - r0
            goto L_0x00ce
        L_0x00c2:
            p.f.a.h.c r0 = r7.f3750t
            int r0 = r0.mo5674a()
            int r1 = r7.mo5696d()
            int r1 = r1 + r0
            int r3 = r3 + r1
        L_0x00ce:
            int r0 = r7.mo5696d()
            int r0 = r3 - r0
            r7.mo5694c(r0, r3)
            r7.f3727c0 = r2
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p144f.p145a.p146h.C1281f.mo5720a(p.f.a.h.d):void");
    }

    /* renamed from: a */
    public void mo5721a(C1278d dVar, int i) {
        HashSet<C1278d> hashSet;
        if (i == 0) {
            hashSet = this.f3790h;
        } else if (i == 1) {
            hashSet = this.f3791i;
        } else {
            return;
        }
        hashSet.add(dVar);
    }
}
