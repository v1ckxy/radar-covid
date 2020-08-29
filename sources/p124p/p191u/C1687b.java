package p124p.p191u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import p124p.p150h.p162l.C1404o;
import p124p.p191u.C1718i.C1722d;

/* renamed from: p.u.b */
public class C1687b extends C1718i {

    /* renamed from: P */
    public static final String[] f4947P = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: Q */
    public static final Property<Drawable, PointF> f4948Q = new C1689b(PointF.class, "boundsOrigin");

    /* renamed from: R */
    public static final Property<C1698k, PointF> f4949R;

    /* renamed from: S */
    public static final Property<C1698k, PointF> f4950S;

    /* renamed from: T */
    public static final Property<View, PointF> f4951T;

    /* renamed from: U */
    public static final Property<View, PointF> f4952U;

    /* renamed from: V */
    public static final Property<View, PointF> f4953V = new C1694g(PointF.class, "position");

    /* renamed from: W */
    public static C1716g f4954W = new C1716g();

    /* renamed from: M */
    public int[] f4955M = new int[2];

    /* renamed from: N */
    public boolean f4956N = false;

    /* renamed from: O */
    public boolean f4957O = false;

    /* renamed from: p.u.b$a */
    public class C1688a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f4958a;

        /* renamed from: b */
        public final /* synthetic */ BitmapDrawable f4959b;

        /* renamed from: c */
        public final /* synthetic */ View f4960c;

        /* renamed from: d */
        public final /* synthetic */ float f4961d;

        public C1688a(C1687b bVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f4958a = viewGroup;
            this.f4959b = bitmapDrawable;
            this.f4960c = view;
            this.f4961d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C1738u a = C1739v.m4374a(this.f4958a);
            ((C1737t) a).f5078a.remove(this.f4959b);
            C1739v.f5079a.mo6509a(this.f4960c, this.f4961d);
        }
    }

    /* renamed from: p.u.b$b */
    public static class C1689b extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f4962a = new Rect();

        public C1689b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.f4962a);
            Rect rect = this.f4962a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        public void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.f4962a);
            this.f4962a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f4962a);
        }
    }

    /* renamed from: p.u.b$c */
    public static class C1690c extends Property<C1698k, PointF> {
        public C1690c(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            C1698k kVar = (C1698k) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            C1698k kVar = (C1698k) obj;
            PointF pointF = (PointF) obj2;
            if (kVar != null) {
                kVar.f4973a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                kVar.f4974b = round;
                int i = kVar.f4978f + 1;
                kVar.f4978f = i;
                if (i == kVar.f4979g) {
                    C1739v.m4375a(kVar.f4977e, kVar.f4973a, round, kVar.f4975c, kVar.f4976d);
                    kVar.f4978f = 0;
                    kVar.f4979g = 0;
                    return;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: p.u.b$d */
    public static class C1691d extends Property<C1698k, PointF> {
        public C1691d(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            C1698k kVar = (C1698k) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            C1698k kVar = (C1698k) obj;
            PointF pointF = (PointF) obj2;
            if (kVar != null) {
                kVar.f4975c = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                kVar.f4976d = round;
                int i = kVar.f4979g + 1;
                kVar.f4979g = i;
                if (kVar.f4978f == i) {
                    C1739v.m4375a(kVar.f4977e, kVar.f4973a, kVar.f4974b, kVar.f4975c, round);
                    kVar.f4978f = 0;
                    kVar.f4979g = 0;
                    return;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: p.u.b$e */
    public static class C1692e extends Property<View, PointF> {
        public C1692e(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C1739v.m4375a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: p.u.b$f */
    public static class C1693f extends Property<View, PointF> {
        public C1693f(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C1739v.m4375a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: p.u.b$g */
    public static class C1694g extends Property<View, PointF> {
        public C1694g(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C1739v.m4375a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: p.u.b$h */
    public class C1695h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1698k f4963a;
        public C1698k mViewBounds = this.f4963a;

        public C1695h(C1687b bVar, C1698k kVar) {
            this.f4963a = kVar;
        }
    }

    /* renamed from: p.u.b$i */
    public class C1696i extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f4964a;

        /* renamed from: b */
        public final /* synthetic */ View f4965b;

        /* renamed from: c */
        public final /* synthetic */ Rect f4966c;

        /* renamed from: d */
        public final /* synthetic */ int f4967d;

        /* renamed from: e */
        public final /* synthetic */ int f4968e;

        /* renamed from: f */
        public final /* synthetic */ int f4969f;

        /* renamed from: g */
        public final /* synthetic */ int f4970g;

        public C1696i(C1687b bVar, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f4965b = view;
            this.f4966c = rect;
            this.f4967d = i;
            this.f4968e = i2;
            this.f4969f = i3;
            this.f4970g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f4964a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f4964a) {
                C1404o.m3521a(this.f4965b, this.f4966c);
                C1739v.m4375a(this.f4965b, this.f4967d, this.f4968e, this.f4969f, this.f4970g);
            }
        }
    }

    /* renamed from: p.u.b$j */
    public class C1697j extends C1725l {

        /* renamed from: a */
        public boolean f4971a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f4972b;

        public C1697j(C1687b bVar, ViewGroup viewGroup) {
            this.f4972b = viewGroup;
        }

        /* renamed from: b */
        public void mo6535b(C1718i iVar) {
            C1736s.m4373a(this.f4972b, false);
            this.f4971a = true;
        }

        /* renamed from: c */
        public void mo6536c(C1718i iVar) {
            C1736s.m4373a(this.f4972b, false);
        }

        /* renamed from: d */
        public void mo6537d(C1718i iVar) {
            C1736s.m4373a(this.f4972b, true);
        }

        /* renamed from: e */
        public void mo6538e(C1718i iVar) {
            if (!this.f4971a) {
                C1736s.m4373a(this.f4972b, false);
            }
            iVar.mo6574b((C1722d) this);
        }
    }

    /* renamed from: p.u.b$k */
    public static class C1698k {

        /* renamed from: a */
        public int f4973a;

        /* renamed from: b */
        public int f4974b;

        /* renamed from: c */
        public int f4975c;

        /* renamed from: d */
        public int f4976d;

        /* renamed from: e */
        public View f4977e;

        /* renamed from: f */
        public int f4978f;

        /* renamed from: g */
        public int f4979g;

        public C1698k(View view) {
            this.f4977e = view;
        }
    }

    static {
        String str = "topLeft";
        f4949R = new C1690c(PointF.class, str);
        String str2 = "bottomRight";
        f4950S = new C1691d(PointF.class, str2);
        f4951T = new C1692e(PointF.class, str2);
        f4952U = new C1693f(PointF.class, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo6515a(android.view.ViewGroup r19, p124p.p191u.C1734q r20, p124p.p191u.C1734q r21) {
        /*
            r18 = this;
            r8 = r18
            r0 = r20
            r1 = r21
            if (r0 == 0) goto L_0x025e
            if (r1 != 0) goto L_0x000c
            goto L_0x025e
        L_0x000c:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.f5070a
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f5070a
            java.lang.String r5 = "android:changeBounds:parent"
            java.lang.Object r3 = r3.get(r5)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r4 = r4.get(r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r3 == 0) goto L_0x025c
            if (r4 != 0) goto L_0x0024
            goto L_0x025c
        L_0x0024:
            android.view.View r9 = r1.f5071b
            boolean r5 = r8.f4957O
            r10 = 1
            if (r5 == 0) goto L_0x003b
            p.u.q r5 = r8.mo6575b(r3, r10)
            if (r5 != 0) goto L_0x0034
            if (r3 != r4) goto L_0x0039
            goto L_0x003b
        L_0x0034:
            android.view.View r3 = r5.f5071b
            if (r4 != r3) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r3 = 0
            goto L_0x003c
        L_0x003b:
            r3 = r10
        L_0x003c:
            if (r3 == 0) goto L_0x01b3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.f5070a
            java.lang.String r4 = "android:changeBounds:bounds"
            java.lang.Object r3 = r3.get(r4)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.f5070a
            java.lang.Object r4 = r5.get(r4)
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            int r5 = r3.left
            int r7 = r4.left
            int r11 = r3.top
            int r12 = r4.top
            int r13 = r3.right
            int r14 = r4.right
            int r3 = r3.bottom
            int r15 = r4.bottom
            int r4 = r13 - r5
            int r2 = r3 - r11
            int r10 = r14 - r7
            int r6 = r15 - r12
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f5070a
            r16 = r9
            java.lang.String r9 = "android:changeBounds:clip"
            java.lang.Object r0 = r0.get(r9)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f5070a
            java.lang.Object r1 = r1.get(r9)
            r9 = r1
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            if (r4 == 0) goto L_0x0081
            if (r2 != 0) goto L_0x0085
        L_0x0081:
            if (r10 == 0) goto L_0x0094
            if (r6 == 0) goto L_0x0094
        L_0x0085:
            if (r5 != r7) goto L_0x008c
            if (r11 == r12) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r1 = 0
            goto L_0x008d
        L_0x008c:
            r1 = 1
        L_0x008d:
            if (r13 != r14) goto L_0x0091
            if (r3 == r15) goto L_0x0095
        L_0x0091:
            int r1 = r1 + 1
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            if (r0 == 0) goto L_0x009d
            boolean r17 = r0.equals(r9)
            if (r17 == 0) goto L_0x00a1
        L_0x009d:
            if (r0 != 0) goto L_0x00a3
            if (r9 == 0) goto L_0x00a3
        L_0x00a1:
            int r1 = r1 + 1
        L_0x00a3:
            if (r1 <= 0) goto L_0x01ec
            r19 = r9
            boolean r9 = r8.f4956N
            r20 = r0
            r0 = 2
            if (r9 != 0) goto L_0x012a
            r9 = r16
            p124p.p191u.C1739v.m4375a(r9, r5, r11, r13, r3)
            if (r1 != r0) goto L_0x0106
            if (r4 != r10) goto L_0x00c6
            if (r2 != r6) goto L_0x00c6
            p.u.e r0 = r8.f5024I
            float r1 = (float) r5
            float r2 = (float) r11
            float r3 = (float) r7
            float r4 = (float) r12
            android.graphics.Path r0 = r0.mo6557a(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = f4953V
            goto L_0x0124
        L_0x00c6:
            p.u.b$k r1 = new p.u.b$k
            r1.<init>(r9)
            p.u.e r2 = r8.f5024I
            float r4 = (float) r5
            float r5 = (float) r11
            float r6 = (float) r7
            float r7 = (float) r12
            android.graphics.Path r2 = r2.mo6557a(r4, r5, r6, r7)
            android.util.Property<p.u.b$k, android.graphics.PointF> r4 = f4949R
            android.animation.ObjectAnimator r2 = p124p.p126b.p127k.C1061o.m2446a(r1, r4, r2)
            p.u.e r4 = r8.f5024I
            float r5 = (float) r13
            float r3 = (float) r3
            float r6 = (float) r14
            float r7 = (float) r15
            android.graphics.Path r3 = r4.mo6557a(r5, r3, r6, r7)
            android.util.Property<p.u.b$k, android.graphics.PointF> r4 = f4950S
            android.animation.ObjectAnimator r3 = p124p.p126b.p127k.C1061o.m2446a(r1, r4, r3)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r5 = 0
            r0[r5] = r2
            r2 = 1
            r0[r2] = r3
            r4.playTogether(r0)
            p.u.b$h r0 = new p.u.b$h
            r0.<init>(r8, r1)
            r4.addListener(r0)
            r0 = r4
            goto L_0x0198
        L_0x0106:
            if (r5 != r7) goto L_0x0118
            if (r11 == r12) goto L_0x010b
            goto L_0x0118
        L_0x010b:
            p.u.e r0 = r8.f5024I
            float r1 = (float) r13
            float r2 = (float) r3
            float r3 = (float) r14
            float r4 = (float) r15
            android.graphics.Path r0 = r0.mo6557a(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = f4951T
            goto L_0x0124
        L_0x0118:
            p.u.e r0 = r8.f5024I
            float r1 = (float) r5
            float r2 = (float) r11
            float r3 = (float) r7
            float r4 = (float) r12
            android.graphics.Path r0 = r0.mo6557a(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = f4952U
        L_0x0124:
            android.animation.ObjectAnimator r0 = p124p.p126b.p127k.C1061o.m2446a(r9, r1, r0)
            goto L_0x0198
        L_0x012a:
            r9 = r16
            int r1 = java.lang.Math.max(r4, r10)
            int r3 = java.lang.Math.max(r2, r6)
            int r1 = r1 + r5
            int r3 = r3 + r11
            p124p.p191u.C1739v.m4375a(r9, r5, r11, r1, r3)
            if (r5 != r7) goto L_0x0140
            if (r11 == r12) goto L_0x013e
            goto L_0x0140
        L_0x013e:
            r11 = 0
            goto L_0x0151
        L_0x0140:
            p.u.e r1 = r8.f5024I
            float r3 = (float) r5
            float r5 = (float) r11
            float r11 = (float) r7
            float r13 = (float) r12
            android.graphics.Path r1 = r1.mo6557a(r3, r5, r11, r13)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = f4953V
            android.animation.ObjectAnimator r1 = p124p.p126b.p127k.C1061o.m2446a(r9, r3, r1)
            r11 = r1
        L_0x0151:
            if (r20 != 0) goto L_0x015a
            android.graphics.Rect r1 = new android.graphics.Rect
            r3 = 0
            r1.<init>(r3, r3, r4, r2)
            goto L_0x015d
        L_0x015a:
            r3 = 0
            r1 = r20
        L_0x015d:
            if (r19 != 0) goto L_0x0165
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r3, r3, r10, r6)
            goto L_0x0167
        L_0x0165:
            r2 = r19
        L_0x0167:
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L_0x0193
            p124p.p150h.p162l.C1404o.m3521a(r9, r1)
            p.u.g r4 = f4954W
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r1
            r1 = 1
            r0[r1] = r2
            java.lang.String r1 = "clipBounds"
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofObject(r9, r1, r4, r0)
            p.u.b$i r13 = new p.u.b$i
            r0 = r13
            r1 = r18
            r2 = r9
            r3 = r19
            r4 = r7
            r5 = r12
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.addListener(r13)
            r2 = r10
            goto L_0x0194
        L_0x0193:
            r2 = 0
        L_0x0194:
            android.animation.Animator r0 = p124p.p191u.C1733p.m4371a(r11, r2)
        L_0x0198:
            android.view.ViewParent r1 = r9.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x01b2
            android.view.ViewParent r1 = r9.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 1
            p124p.p191u.C1736s.m4373a(r1, r2)
            p.u.b$j r2 = new p.u.b$j
            r2.<init>(r8, r1)
            r8.mo6565a(r2)
        L_0x01b2:
            return r0
        L_0x01b3:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.f5070a
            java.lang.String r3 = "android:changeBounds:windowX"
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f5070a
            java.lang.String r4 = "android:changeBounds:windowY"
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.f5070a
            java.lang.Object r3 = r5.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f5070a
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r2 != r3) goto L_0x01ee
            if (r0 == r1) goto L_0x01ec
            goto L_0x01ee
        L_0x01ec:
            r0 = 0
            return r0
        L_0x01ee:
            int[] r4 = r8.f4955M
            r5 = r19
            r5.getLocationInWindow(r4)
            int r4 = r9.getWidth()
            int r6 = r9.getHeight()
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r6, r7)
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r4)
            r9.draw(r6)
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            r6.<init>(r4)
            float r7 = p124p.p191u.C1739v.m4376b(r9)
            r4 = 0
            p.u.b0 r10 = p124p.p191u.C1739v.f5079a
            r10.mo6509a(r9, r4)
            android.view.ViewOverlay r4 = r19.getOverlay()
            r4.add(r6)
            p.u.e r4 = r8.f5024I
            int[] r10 = r8.f4955M
            r11 = 0
            r12 = r10[r11]
            int r2 = r2 - r12
            float r2 = (float) r2
            r12 = 1
            r13 = r10[r12]
            int r0 = r0 - r13
            float r0 = (float) r0
            r13 = r10[r11]
            int r3 = r3 - r13
            float r3 = (float) r3
            r10 = r10[r12]
            int r1 = r1 - r10
            float r1 = (float) r1
            android.graphics.Path r0 = r4.mo6557a(r2, r0, r3, r1)
            android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> r1 = f4948Q
            r2 = 0
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofObject(r1, r2, r0)
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r12]
            r2 = 0
            r1[r2] = r0
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r6, r1)
            p.u.b$a r11 = new p.u.b$a
            r0 = r11
            r1 = r18
            r2 = r19
            r3 = r6
            r4 = r9
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r10.addListener(r11)
            return r10
        L_0x025c:
            r0 = 0
            return r0
        L_0x025e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p191u.C1687b.mo6515a(android.view.ViewGroup, p.u.q, p.u.q):android.animation.Animator");
    }

    /* renamed from: a */
    public void mo6516a(C1734q qVar) {
        mo6519d(qVar);
    }

    /* renamed from: c */
    public void mo6517c(C1734q qVar) {
        mo6519d(qVar);
    }

    /* renamed from: c */
    public String[] mo6518c() {
        return f4947P;
    }

    /* renamed from: d */
    public final void mo6519d(C1734q qVar) {
        View view = qVar.f5071b;
        if (C1404o.m3563x(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            qVar.f5070a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            qVar.f5070a.put("android:changeBounds:parent", qVar.f5071b.getParent());
            if (this.f4957O) {
                qVar.f5071b.getLocationInWindow(this.f4955M);
                qVar.f5070a.put("android:changeBounds:windowX", Integer.valueOf(this.f4955M[0]));
                qVar.f5070a.put("android:changeBounds:windowY", Integer.valueOf(this.f4955M[1]));
            }
            if (this.f4956N) {
                qVar.f5070a.put("android:changeBounds:clip", view.getClipBounds());
            }
        }
    }
}
