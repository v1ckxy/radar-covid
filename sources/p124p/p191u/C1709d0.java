package p124p.p191u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p124p.p191u.C1718i.C1722d;

/* renamed from: p.u.d0 */
public abstract class C1709d0 extends C1718i {

    /* renamed from: N */
    public static final String[] f4998N = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: M */
    public int f4999M = 3;

    /* renamed from: p.u.d0$a */
    public static class C1710a extends AnimatorListenerAdapter implements C1722d {

        /* renamed from: a */
        public final View f5000a;

        /* renamed from: b */
        public final int f5001b;

        /* renamed from: c */
        public final ViewGroup f5002c;

        /* renamed from: d */
        public final boolean f5003d;

        /* renamed from: e */
        public boolean f5004e;

        /* renamed from: f */
        public boolean f5005f = false;

        public C1710a(View view, int i, boolean z) {
            this.f5000a = view;
            this.f5001b = i;
            this.f5002c = (ViewGroup) view.getParent();
            this.f5003d = z;
            mo6550a(true);
        }

        /* renamed from: a */
        public final void mo6549a() {
            if (!this.f5005f) {
                C1739v.f5079a.mo6510a(this.f5000a, this.f5001b);
                ViewGroup viewGroup = this.f5002c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            mo6550a(false);
        }

        /* renamed from: a */
        public void mo6545a(C1718i iVar) {
        }

        /* renamed from: a */
        public final void mo6550a(boolean z) {
            if (this.f5003d && this.f5004e != z) {
                ViewGroup viewGroup = this.f5002c;
                if (viewGroup != null) {
                    this.f5004e = z;
                    C1736s.m4373a(viewGroup, z);
                }
            }
        }

        /* renamed from: b */
        public void mo6535b(C1718i iVar) {
        }

        /* renamed from: c */
        public void mo6536c(C1718i iVar) {
            mo6550a(false);
        }

        /* renamed from: d */
        public void mo6537d(C1718i iVar) {
            mo6550a(true);
        }

        /* renamed from: e */
        public void mo6538e(C1718i iVar) {
            mo6549a();
            iVar.mo6574b((C1722d) this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f5005f = true;
        }

        public void onAnimationEnd(Animator animator) {
            mo6549a();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f5005f) {
                C1739v.f5079a.mo6510a(this.f5000a, this.f5001b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f5005f) {
                C1739v.f5079a.mo6510a(this.f5000a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: p.u.d0$b */
    public static class C1711b {

        /* renamed from: a */
        public boolean f5006a;

        /* renamed from: b */
        public boolean f5007b;

        /* renamed from: c */
        public int f5008c;

        /* renamed from: d */
        public int f5009d;

        /* renamed from: e */
        public ViewGroup f5010e;

        /* renamed from: f */
        public ViewGroup f5011f;
    }

    /* renamed from: a */
    public abstract Animator mo6542a(ViewGroup viewGroup, View view, C1734q qVar, C1734q qVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (mo6547b(mo6575b(r13, false), mo6579c(r13, false)).f5006a != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e1, code lost:
        if (r12.f5046z != false) goto L_0x00e3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo6515a(android.view.ViewGroup r13, p124p.p191u.C1734q r14, p124p.p191u.C1734q r15) {
        /*
            r12 = this;
            p.u.d0$b r0 = r12.mo6547b(r14, r15)
            boolean r1 = r0.f5006a
            r2 = 0
            if (r1 == 0) goto L_0x0162
            android.view.ViewGroup r1 = r0.f5010e
            if (r1 != 0) goto L_0x0011
            android.view.ViewGroup r1 = r0.f5011f
            if (r1 == 0) goto L_0x0162
        L_0x0011:
            boolean r1 = r0.f5007b
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0061
            int r13 = r12.f4999M
            r13 = r13 & r3
            if (r13 != r3) goto L_0x0060
            if (r15 != 0) goto L_0x001f
            goto L_0x0060
        L_0x001f:
            if (r14 != 0) goto L_0x003a
            android.view.View r13 = r15.f5071b
            android.view.ViewParent r13 = r13.getParent()
            android.view.View r13 = (android.view.View) r13
            p.u.q r0 = r12.mo6575b(r13, r4)
            p.u.q r13 = r12.mo6579c(r13, r4)
            p.u.d0$b r13 = r12.mo6547b(r0, r13)
            boolean r13 = r13.f5006a
            if (r13 == 0) goto L_0x003a
            goto L_0x0060
        L_0x003a:
            android.view.View r13 = r15.f5071b
            r15 = r12
            p.u.c r15 = (p124p.p191u.C1700c) r15
            r0 = 0
            if (r14 == 0) goto L_0x0053
            java.util.Map<java.lang.String, java.lang.Object> r14 = r14.f5070a
            java.lang.String r1 = "android:fade:transitionAlpha"
            java.lang.Object r14 = r14.get(r1)
            java.lang.Float r14 = (java.lang.Float) r14
            if (r14 == 0) goto L_0x0053
            float r14 = r14.floatValue()
            goto L_0x0054
        L_0x0053:
            r14 = r0
        L_0x0054:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r0 = r14
        L_0x005c:
            android.animation.Animator r2 = r15.mo6541a(r13, r0, r1)
        L_0x0060:
            return r2
        L_0x0061:
            int r0 = r0.f5009d
            int r1 = r12.f4999M
            r5 = 2
            r1 = r1 & r5
            if (r1 == r5) goto L_0x006b
            goto L_0x0162
        L_0x006b:
            if (r14 != 0) goto L_0x006f
            goto L_0x0162
        L_0x006f:
            android.view.View r1 = r14.f5071b
            if (r15 == 0) goto L_0x0076
            android.view.View r6 = r15.f5071b
            goto L_0x0077
        L_0x0076:
            r6 = r2
        L_0x0077:
            int r7 = p124p.p191u.C1714f.save_overlay_view
            java.lang.Object r7 = r1.getTag(r7)
            android.view.View r7 = (android.view.View) r7
            if (r7 == 0) goto L_0x0085
            r6 = r2
            r8 = r3
            goto L_0x00eb
        L_0x0085:
            if (r6 == 0) goto L_0x0098
            android.view.ViewParent r7 = r6.getParent()
            if (r7 != 0) goto L_0x008e
            goto L_0x0098
        L_0x008e:
            r7 = 4
            if (r0 != r7) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            if (r1 != r6) goto L_0x009d
        L_0x0094:
            r8 = r4
            r7 = r6
            r6 = r2
            goto L_0x00a0
        L_0x0098:
            if (r6 == 0) goto L_0x009d
            r7 = r2
            r8 = r4
            goto L_0x00a0
        L_0x009d:
            r6 = r2
            r7 = r6
            r8 = r3
        L_0x00a0:
            if (r8 == 0) goto L_0x00e7
            android.view.ViewParent r8 = r1.getParent()
            if (r8 != 0) goto L_0x00a9
            goto L_0x00e3
        L_0x00a9:
            android.view.ViewParent r8 = r1.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x00e7
            android.view.ViewParent r8 = r1.getParent()
            android.view.View r8 = (android.view.View) r8
            p.u.q r9 = r12.mo6579c(r8, r3)
            p.u.q r10 = r12.mo6575b(r8, r3)
            p.u.d0$b r9 = r12.mo6547b(r9, r10)
            boolean r9 = r9.f5006a
            if (r9 != 0) goto L_0x00cc
            android.view.View r6 = p124p.p191u.C1733p.m4372a(r13, r1, r8)
            goto L_0x00e7
        L_0x00cc:
            int r9 = r8.getId()
            android.view.ViewParent r8 = r8.getParent()
            if (r8 != 0) goto L_0x00e7
            r8 = -1
            if (r9 == r8) goto L_0x00e7
            android.view.View r8 = r13.findViewById(r9)
            if (r8 == 0) goto L_0x00e7
            boolean r8 = r12.f5046z
            if (r8 == 0) goto L_0x00e7
        L_0x00e3:
            r8 = r4
            r6 = r7
            r7 = r1
            goto L_0x00eb
        L_0x00e7:
            r8 = r4
            r11 = r7
            r7 = r6
            r6 = r11
        L_0x00eb:
            if (r7 == 0) goto L_0x013d
            if (r8 != 0) goto L_0x011f
            java.util.Map<java.lang.String, java.lang.Object> r0 = r14.f5070a
            java.lang.String r2 = "android:visibility:screenLocation"
            java.lang.Object r0 = r0.get(r2)
            int[] r0 = (int[]) r0
            r2 = r0[r4]
            r0 = r0[r3]
            int[] r5 = new int[r5]
            r13.getLocationOnScreen(r5)
            r4 = r5[r4]
            int r2 = r2 - r4
            int r4 = r7.getLeft()
            int r2 = r2 - r4
            r7.offsetLeftAndRight(r2)
            r2 = r5[r3]
            int r0 = r0 - r2
            int r2 = r7.getTop()
            int r0 = r0 - r2
            r7.offsetTopAndBottom(r0)
            android.view.ViewGroupOverlay r0 = r13.getOverlay()
            r0.add(r7)
        L_0x011f:
            android.animation.Animator r2 = r12.mo6542a(r13, r7, r14, r15)
            if (r8 != 0) goto L_0x0162
            if (r2 != 0) goto L_0x012f
            android.view.ViewGroupOverlay r13 = r13.getOverlay()
            r13.remove(r7)
            goto L_0x0162
        L_0x012f:
            int r14 = p124p.p191u.C1714f.save_overlay_view
            r1.setTag(r14, r7)
            p.u.c0 r14 = new p.u.c0
            r14.<init>(r12, r13, r7, r1)
            r12.mo6565a(r14)
            goto L_0x0162
        L_0x013d:
            if (r6 == 0) goto L_0x0162
            int r1 = r6.getVisibility()
            p.u.b0 r2 = p124p.p191u.C1739v.f5079a
            r2.mo6510a(r6, r4)
            android.animation.Animator r2 = r12.mo6542a(r13, r6, r14, r15)
            if (r2 == 0) goto L_0x015d
            p.u.d0$a r13 = new p.u.d0$a
            r13.<init>(r6, r0, r3)
            r2.addListener(r13)
            r2.addPauseListener(r13)
            r12.mo6565a(r13)
            goto L_0x0162
        L_0x015d:
            p.u.b0 r13 = p124p.p191u.C1739v.f5079a
            r13.mo6510a(r6, r1)
        L_0x0162:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p191u.C1709d0.mo6515a(android.view.ViewGroup, p.u.q, p.u.q):android.animation.Animator");
    }

    /* renamed from: a */
    public void mo6516a(C1734q qVar) {
        mo6548d(qVar);
    }

    /* renamed from: a */
    public boolean mo6546a(C1734q qVar, C1734q qVar2) {
        boolean z = false;
        if (qVar == null && qVar2 == null) {
            return false;
        }
        if (!(qVar == null || qVar2 == null)) {
            String str = "android:visibility:visibility";
            if (qVar2.f5070a.containsKey(str) != qVar.f5070a.containsKey(str)) {
                return false;
            }
        }
        C1711b b = mo6547b(qVar, qVar2);
        if (b.f5006a && (b.f5008c == 0 || b.f5009d == 0)) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (r9 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (r0.f5010e == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r0.f5008c == 0) goto L_0x0097;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p124p.p191u.C1709d0.C1711b mo6547b(p124p.p191u.C1734q r8, p124p.p191u.C1734q r9) {
        /*
            r7 = this;
            p.u.d0$b r0 = new p.u.d0$b
            r0.<init>()
            r1 = 0
            r0.f5006a = r1
            r0.f5007b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f5070a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f5070a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f5008c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f5070a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f5010e = r6
            goto L_0x0037
        L_0x0033:
            r0.f5008c = r4
            r0.f5010e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f5070a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f5070a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f5009d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f5070a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f5011f = r2
            goto L_0x005e
        L_0x005a:
            r0.f5009d = r4
            r0.f5011f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0086
            if (r9 == 0) goto L_0x0086
            int r8 = r0.f5008c
            int r9 = r0.f5009d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r8 = r0.f5010e
            android.view.ViewGroup r9 = r0.f5011f
            if (r8 != r9) goto L_0x0070
            return r0
        L_0x0070:
            int r8 = r0.f5008c
            int r9 = r0.f5009d
            if (r8 == r9) goto L_0x007c
            if (r8 != 0) goto L_0x0079
            goto L_0x0097
        L_0x0079:
            if (r9 != 0) goto L_0x009a
            goto L_0x008c
        L_0x007c:
            android.view.ViewGroup r8 = r0.f5011f
            if (r8 != 0) goto L_0x0081
            goto L_0x0097
        L_0x0081:
            android.view.ViewGroup r8 = r0.f5010e
            if (r8 != 0) goto L_0x009a
            goto L_0x008c
        L_0x0086:
            if (r8 != 0) goto L_0x0091
            int r8 = r0.f5009d
            if (r8 != 0) goto L_0x0091
        L_0x008c:
            r0.f5007b = r2
        L_0x008e:
            r0.f5006a = r2
            goto L_0x009a
        L_0x0091:
            if (r9 != 0) goto L_0x009a
            int r8 = r0.f5008c
            if (r8 != 0) goto L_0x009a
        L_0x0097:
            r0.f5007b = r1
            goto L_0x008e
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p191u.C1709d0.mo6547b(p.u.q, p.u.q):p.u.d0$b");
    }

    /* renamed from: c */
    public String[] mo6518c() {
        return f4998N;
    }

    /* renamed from: d */
    public final void mo6548d(C1734q qVar) {
        String str = "android:visibility:visibility";
        qVar.f5070a.put(str, Integer.valueOf(qVar.f5071b.getVisibility()));
        qVar.f5070a.put("android:visibility:parent", qVar.f5071b.getParent());
        int[] iArr = new int[2];
        qVar.f5071b.getLocationOnScreen(iArr);
        qVar.f5070a.put("android:visibility:screenLocation", iArr);
    }
}
