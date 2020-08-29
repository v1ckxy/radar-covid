package p124p.p196x.p198c;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0129t;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2.C0166g;

/* renamed from: p.x.c.f */
public final class C1781f extends C0129t {

    /* renamed from: a */
    public C0166g f5206a;

    /* renamed from: b */
    public final ViewPager2 f5207b;

    /* renamed from: c */
    public final RecyclerView f5208c;

    /* renamed from: d */
    public final LinearLayoutManager f5209d;

    /* renamed from: e */
    public int f5210e;

    /* renamed from: f */
    public int f5211f;

    /* renamed from: g */
    public C1782a f5212g = new C1782a();

    /* renamed from: h */
    public int f5213h;

    /* renamed from: i */
    public int f5214i;

    /* renamed from: j */
    public boolean f5215j;

    /* renamed from: k */
    public boolean f5216k;

    /* renamed from: l */
    public boolean f5217l;

    /* renamed from: m */
    public boolean f5218m;

    /* renamed from: p.x.c.f$a */
    public static final class C1782a {

        /* renamed from: a */
        public int f5219a;

        /* renamed from: b */
        public float f5220b;

        /* renamed from: c */
        public int f5221c;

        /* renamed from: a */
        public void mo6763a() {
            this.f5219a = -1;
            this.f5220b = 0.0f;
            this.f5221c = 0;
        }
    }

    public C1781f(ViewPager2 viewPager2) {
        this.f5207b = viewPager2;
        RecyclerView recyclerView = viewPager2.f949n;
        this.f5208c = recyclerView;
        this.f5209d = (LinearLayoutManager) recyclerView.getLayoutManager();
        mo6759a();
    }

    /* renamed from: a */
    public final void mo6759a() {
        this.f5210e = 0;
        this.f5211f = 0;
        this.f5212g.mo6763a();
        this.f5213h = -1;
        this.f5214i = -1;
        this.f5215j = false;
        this.f5216k = false;
        this.f5218m = false;
        this.f5217l = false;
    }

    /* renamed from: a */
    public final void mo6760a(int i) {
        C0166g gVar = this.f5206a;
        if (gVar != null) {
            gVar.mo1407b(i);
        }
    }

    /* renamed from: a */
    public void mo1256a(RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.f5210e == 1 && this.f5211f == 1) && i == 1) {
            this.f5218m = false;
            this.f5210e = 1;
            int i2 = this.f5214i;
            if (i2 != -1) {
                this.f5213h = i2;
                this.f5214i = -1;
            } else if (this.f5213h == -1) {
                this.f5213h = this.f5209d.mo923t();
            }
            mo6762b(1);
            return;
        }
        int i3 = this.f5210e;
        if (!(i3 == 1 || i3 == 4) || i != 2) {
            int i4 = this.f5210e;
            if ((i4 == 1 || i4 == 4) && i == 0) {
                mo6761b();
                if (!this.f5216k) {
                    int i5 = this.f5212g.f5219a;
                    if (i5 != -1) {
                        C0166g gVar = this.f5206a;
                        if (gVar != null) {
                            gVar.mo1428a(i5, 0.0f, 0);
                        }
                    }
                } else {
                    C1782a aVar = this.f5212g;
                    if (aVar.f5221c == 0) {
                        int i6 = this.f5213h;
                        int i7 = aVar.f5219a;
                        if (i6 != i7) {
                            mo6760a(i7);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    mo6762b(0);
                    mo6759a();
                }
            }
            if (this.f5210e == 2 && i == 0 && this.f5217l) {
                mo6761b();
                C1782a aVar2 = this.f5212g;
                if (aVar2.f5221c == 0) {
                    int i8 = this.f5214i;
                    int i9 = aVar2.f5219a;
                    if (i8 != i9) {
                        if (i9 == -1) {
                            i9 = 0;
                        }
                        mo6760a(i9);
                    }
                    mo6762b(0);
                    mo6759a();
                }
            }
            return;
        }
        if (this.f5216k) {
            mo6762b(2);
            this.f5215j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0150, code lost:
        if (r4[r2 - 1][1] >= r3) goto L_0x0153;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x017a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x018a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6761b() {
        /*
            r13 = this;
            p.x.c.f$a r0 = r13.f5212g
            androidx.recyclerview.widget.LinearLayoutManager r1 = r13.f5209d
            int r1 = r1.mo923t()
            r0.f5219a = r1
            r2 = -1
            if (r1 != r2) goto L_0x0011
            r0.mo6763a()
            return
        L_0x0011:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r13.f5209d
            android.view.View r1 = r2.mo903b(r1)
            if (r1 != 0) goto L_0x001d
            r0.mo6763a()
            return
        L_0x001d:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r13.f5209d
            r3 = 0
            if (r2 == 0) goto L_0x01af
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$p r2 = (androidx.recyclerview.widget.RecyclerView.C0125p) r2
            android.graphics.Rect r2 = r2.f819b
            int r2 = r2.left
            androidx.recyclerview.widget.LinearLayoutManager r4 = r13.f5209d
            if (r4 == 0) goto L_0x01ae
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$p r4 = (androidx.recyclerview.widget.RecyclerView.C0125p) r4
            android.graphics.Rect r4 = r4.f819b
            int r4 = r4.right
            androidx.recyclerview.widget.LinearLayoutManager r5 = r13.f5209d
            if (r5 == 0) goto L_0x01ad
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$p r5 = (androidx.recyclerview.widget.RecyclerView.C0125p) r5
            android.graphics.Rect r5 = r5.f819b
            int r5 = r5.top
            androidx.recyclerview.widget.LinearLayoutManager r6 = r13.f5209d
            if (r6 == 0) goto L_0x01ac
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$p r3 = (androidx.recyclerview.widget.RecyclerView.C0125p) r3
            android.graphics.Rect r3 = r3.f819b
            int r3 = r3.bottom
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x006c
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r7 = r6.leftMargin
            int r2 = r2 + r7
            int r7 = r6.rightMargin
            int r4 = r4 + r7
            int r7 = r6.topMargin
            int r5 = r5 + r7
            int r6 = r6.bottomMargin
            int r3 = r3 + r6
        L_0x006c:
            int r6 = r1.getHeight()
            int r6 = r6 + r5
            int r6 = r6 + r3
            int r3 = r1.getWidth()
            int r3 = r3 + r2
            int r3 = r3 + r4
            androidx.recyclerview.widget.LinearLayoutManager r4 = r13.f5209d
            int r4 = r4.f698s
            r7 = 0
            r8 = 1
            if (r4 != 0) goto L_0x0082
            r4 = r8
            goto L_0x0083
        L_0x0082:
            r4 = r7
        L_0x0083:
            if (r4 == 0) goto L_0x009c
            int r1 = r1.getLeft()
            int r1 = r1 - r2
            androidx.recyclerview.widget.RecyclerView r2 = r13.f5208c
            int r2 = r2.getPaddingLeft()
            int r1 = r1 - r2
            androidx.viewpager2.widget.ViewPager2 r2 = r13.f5207b
            boolean r2 = r2.mo1377a()
            if (r2 == 0) goto L_0x009a
            int r1 = -r1
        L_0x009a:
            r6 = r3
            goto L_0x00a8
        L_0x009c:
            int r1 = r1.getTop()
            int r1 = r1 - r5
            androidx.recyclerview.widget.RecyclerView r2 = r13.f5208c
            int r2 = r2.getPaddingTop()
            int r1 = r1 - r2
        L_0x00a8:
            int r1 = -r1
            r0.f5221c = r1
            if (r1 >= 0) goto L_0x01a2
            p.x.c.b r1 = new p.x.c.b
            androidx.recyclerview.widget.LinearLayoutManager r2 = r13.f5209d
            r1.<init>(r2)
            androidx.recyclerview.widget.LinearLayoutManager r2 = r1.f5201a
            int r2 = r2.mo1222d()
            if (r2 != 0) goto L_0x00be
            goto L_0x0153
        L_0x00be:
            androidx.recyclerview.widget.LinearLayoutManager r3 = r1.f5201a
            int r3 = r3.f698s
            if (r3 != 0) goto L_0x00c6
            r3 = r8
            goto L_0x00c7
        L_0x00c6:
            r3 = r7
        L_0x00c7:
            r4 = 2
            int[] r5 = new int[r4]
            r5[r8] = r4
            r5[r7] = r2
            java.lang.Class<int> r4 = int.class
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r5)
            int[][] r4 = (int[][]) r4
            r5 = r7
        L_0x00d7:
            if (r5 >= r2) goto L_0x0121
            androidx.recyclerview.widget.LinearLayoutManager r6 = r1.f5201a
            android.view.View r6 = r6.mo1219c(r5)
            if (r6 == 0) goto L_0x0119
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            boolean r10 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r10 == 0) goto L_0x00ec
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            goto L_0x00ee
        L_0x00ec:
            android.view.ViewGroup$MarginLayoutParams r9 = p124p.p196x.p198c.C1777b.f5200b
        L_0x00ee:
            r10 = r4[r5]
            if (r3 == 0) goto L_0x00f9
            int r11 = r6.getLeft()
            int r12 = r9.leftMargin
            goto L_0x00ff
        L_0x00f9:
            int r11 = r6.getTop()
            int r12 = r9.topMargin
        L_0x00ff:
            int r11 = r11 - r12
            r10[r7] = r11
            r10 = r4[r5]
            if (r3 == 0) goto L_0x010d
            int r6 = r6.getRight()
            int r9 = r9.rightMargin
            goto L_0x0113
        L_0x010d:
            int r6 = r6.getBottom()
            int r9 = r9.bottomMargin
        L_0x0113:
            int r6 = r6 + r9
            r10[r8] = r6
            int r5 = r5 + 1
            goto L_0x00d7
        L_0x0119:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "null view contained in the view hierarchy"
            r0.<init>(r1)
            throw r0
        L_0x0121:
            p.x.c.a r3 = new p.x.c.a
            r3.<init>(r1)
            java.util.Arrays.sort(r4, r3)
            r3 = r8
        L_0x012a:
            if (r3 >= r2) goto L_0x013c
            int r5 = r3 + -1
            r5 = r4[r5]
            r5 = r5[r8]
            r6 = r4[r3]
            r6 = r6[r7]
            if (r5 == r6) goto L_0x0139
            goto L_0x0155
        L_0x0139:
            int r3 = r3 + 1
            goto L_0x012a
        L_0x013c:
            r3 = r4[r7]
            r3 = r3[r8]
            r5 = r4[r7]
            r5 = r5[r7]
            int r3 = r3 - r5
            r5 = r4[r7]
            r5 = r5[r7]
            if (r5 > 0) goto L_0x0155
            int r2 = r2 - r8
            r2 = r4[r2]
            r2 = r2[r8]
            if (r2 >= r3) goto L_0x0153
            goto L_0x0155
        L_0x0153:
            r2 = r8
            goto L_0x0156
        L_0x0155:
            r2 = r7
        L_0x0156:
            if (r2 == 0) goto L_0x0160
            androidx.recyclerview.widget.LinearLayoutManager r2 = r1.f5201a
            int r2 = r2.mo1222d()
            if (r2 > r8) goto L_0x017f
        L_0x0160:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r1.f5201a
            int r2 = r2.mo1222d()
            r3 = r7
        L_0x0167:
            if (r3 >= r2) goto L_0x017a
            androidx.recyclerview.widget.LinearLayoutManager r4 = r1.f5201a
            android.view.View r4 = r4.mo1219c(r3)
            boolean r4 = p124p.p196x.p198c.C1777b.m4426a(r4)
            if (r4 == 0) goto L_0x0177
            r1 = r8
            goto L_0x017b
        L_0x0177:
            int r3 = r3 + 1
            goto L_0x0167
        L_0x017a:
            r1 = r7
        L_0x017b:
            if (r1 == 0) goto L_0x017f
            r1 = r8
            goto L_0x0180
        L_0x017f:
            r1 = r7
        L_0x0180:
            if (r1 == 0) goto L_0x018a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            r0.<init>(r1)
            throw r0
        L_0x018a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r8]
            int r0 = r0.f5221c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r7] = r0
            java.lang.String r0 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x01a2:
            if (r6 != 0) goto L_0x01a6
            r1 = 0
            goto L_0x01a9
        L_0x01a6:
            float r1 = (float) r1
            float r2 = (float) r6
            float r1 = r1 / r2
        L_0x01a9:
            r0.f5220b = r1
            return
        L_0x01ac:
            throw r3
        L_0x01ad:
            throw r3
        L_0x01ae:
            throw r3
        L_0x01af:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p196x.p198c.C1781f.mo6761b():void");
    }

    /* renamed from: b */
    public final void mo6762b(int i) {
        if ((this.f5210e != 3 || this.f5211f != 0) && this.f5211f != i) {
            this.f5211f = i;
            C0166g gVar = this.f5206a;
            if (gVar != null) {
                gVar.mo1406a(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r4.f5213h != r6) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r6 < 0) == r4.f5207b.mo1377a()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1257a(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            r5 = 1
            r4.f5216k = r5
            r4.mo6761b()
            boolean r0 = r4.f5215j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003a
            r4.f5215j = r2
            if (r7 > 0) goto L_0x0022
            if (r7 != 0) goto L_0x0020
            if (r6 >= 0) goto L_0x0016
            r6 = r5
            goto L_0x0017
        L_0x0016:
            r6 = r2
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r7 = r4.f5207b
            boolean r7 = r7.mo1377a()
            if (r6 != r7) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r6 = r2
            goto L_0x0023
        L_0x0022:
            r6 = r5
        L_0x0023:
            if (r6 == 0) goto L_0x002f
            p.x.c.f$a r6 = r4.f5212g
            int r7 = r6.f5221c
            if (r7 == 0) goto L_0x002f
            int r6 = r6.f5219a
            int r6 = r6 + r5
            goto L_0x0033
        L_0x002f:
            p.x.c.f$a r6 = r4.f5212g
            int r6 = r6.f5219a
        L_0x0033:
            r4.f5214i = r6
            int r7 = r4.f5213h
            if (r7 == r6) goto L_0x0048
            goto L_0x0045
        L_0x003a:
            int r6 = r4.f5210e
            if (r6 != 0) goto L_0x0048
            p.x.c.f$a r6 = r4.f5212g
            int r6 = r6.f5219a
            if (r6 != r1) goto L_0x0045
            r6 = r2
        L_0x0045:
            r4.mo6760a(r6)
        L_0x0048:
            p.x.c.f$a r6 = r4.f5212g
            int r6 = r6.f5219a
            if (r6 != r1) goto L_0x004f
            r6 = r2
        L_0x004f:
            p.x.c.f$a r7 = r4.f5212g
            float r0 = r7.f5220b
            int r7 = r7.f5221c
            androidx.viewpager2.widget.ViewPager2$g r3 = r4.f5206a
            if (r3 == 0) goto L_0x005c
            r3.mo1428a(r6, r0, r7)
        L_0x005c:
            p.x.c.f$a r6 = r4.f5212g
            int r6 = r6.f5219a
            int r7 = r4.f5214i
            if (r6 == r7) goto L_0x0066
            if (r7 != r1) goto L_0x0076
        L_0x0066:
            p.x.c.f$a r6 = r4.f5212g
            int r6 = r6.f5221c
            if (r6 != 0) goto L_0x0076
            int r6 = r4.f5211f
            if (r6 == r5) goto L_0x0076
            r4.mo6762b(r2)
            r4.mo6759a()
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p196x.p198c.C1781f.mo1257a(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
