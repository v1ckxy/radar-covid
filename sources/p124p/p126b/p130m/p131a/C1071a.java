package p124p.p126b.p130m.p131a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import p124p.p126b.p130m.p131a.C1079b.C1082c;
import p124p.p126b.p130m.p131a.C1084d.C1085a;
import p124p.p143e.C1253e;
import p124p.p143e.C1262i;
import p124p.p192v.p193a.p194a.C1748c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: p.b.m.a.a */
public class C1071a extends C1084d {

    /* renamed from: s */
    public C1074c f2849s;

    /* renamed from: t */
    public C1078g f2850t;

    /* renamed from: u */
    public int f2851u;

    /* renamed from: v */
    public int f2852v;

    /* renamed from: w */
    public boolean f2853w;

    /* renamed from: p.b.m.a.a$b */
    public static class C1073b extends C1078g {

        /* renamed from: a */
        public final Animatable f2854a;

        public C1073b(Animatable animatable) {
            super(null);
            this.f2854a = animatable;
        }

        /* renamed from: c */
        public void mo4561c() {
            this.f2854a.start();
        }

        /* renamed from: d */
        public void mo4562d() {
            this.f2854a.stop();
        }
    }

    /* renamed from: p.b.m.a.a$c */
    public static class C1074c extends C1085a {

        /* renamed from: K */
        public C1253e<Long> f2855K;

        /* renamed from: L */
        public C1262i<Integer> f2856L;

        public C1074c(C1074c cVar, C1071a aVar, Resources resources) {
            C1262i<Integer> iVar;
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f2855K = cVar.f2855K;
                iVar = cVar.f2856L;
            } else {
                this.f2855K = new C1253e<>();
                iVar = new C1262i<>(10);
            }
            this.f2856L = iVar;
        }

        /* renamed from: a */
        public static long m2609a(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* renamed from: a */
        public int mo4563a(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo4608a(drawable);
            long a2 = m2609a(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f2855K.mo5512a(a2, Long.valueOf(j2 | j));
            if (z) {
                this.f2855K.mo5512a(m2609a(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* renamed from: b */
        public int mo4564b(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.f2856L.mo5615b(i, Integer.valueOf(0))).intValue();
        }

        /* renamed from: b */
        public int mo4565b(int[] iArr) {
            int a = super.mo4649a(iArr);
            return a >= 0 ? a : super.mo4649a(StateSet.WILD_CARD);
        }

        /* renamed from: d */
        public void mo4566d() {
            this.f2855K = this.f2855K.clone();
            this.f2856L = this.f2856L.clone();
        }

        public Drawable newDrawable() {
            return new C1071a(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1071a(this, resources);
        }
    }

    /* renamed from: p.b.m.a.a$d */
    public static class C1075d extends C1078g {

        /* renamed from: a */
        public final C1748c f2857a;

        public C1075d(C1748c cVar) {
            super(null);
            this.f2857a = cVar;
        }

        /* renamed from: c */
        public void mo4561c() {
            this.f2857a.start();
        }

        /* renamed from: d */
        public void mo4562d() {
            this.f2857a.stop();
        }
    }

    /* renamed from: p.b.m.a.a$e */
    public static class C1076e extends C1078g {

        /* renamed from: a */
        public final ObjectAnimator f2858a;

        /* renamed from: b */
        public final boolean f2859b;

        public C1076e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C1077f fVar = new C1077f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            ofInt.setAutoCancel(true);
            ofInt.setDuration((long) fVar.f2862c);
            ofInt.setInterpolator(fVar);
            this.f2859b = z2;
            this.f2858a = ofInt;
        }

        /* renamed from: a */
        public boolean mo4569a() {
            return this.f2859b;
        }

        /* renamed from: b */
        public void mo4570b() {
            this.f2858a.reverse();
        }

        /* renamed from: c */
        public void mo4561c() {
            this.f2858a.start();
        }

        /* renamed from: d */
        public void mo4562d() {
            this.f2858a.cancel();
        }
    }

    /* renamed from: p.b.m.a.a$f */
    public static class C1077f implements TimeInterpolator {

        /* renamed from: a */
        public int[] f2860a;

        /* renamed from: b */
        public int f2861b;

        /* renamed from: c */
        public int f2862c;

        public C1077f(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f2861b = numberOfFrames;
            int[] iArr = this.f2860a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f2860a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f2860a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f2862c = i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f2862c)) + 0.5f);
            int i2 = this.f2861b;
            int[] iArr = this.f2860a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f2862c) : 0.0f);
        }
    }

    /* renamed from: p.b.m.a.a$g */
    public static abstract class C1078g {
        public /* synthetic */ C1078g(C1072a aVar) {
        }

        /* renamed from: a */
        public boolean mo4569a() {
            return false;
        }

        /* renamed from: b */
        public void mo4570b() {
        }

        /* renamed from: c */
        public abstract void mo4561c();

        /* renamed from: d */
        public abstract void mo4562d();
    }

    static {
        Class<C1071a> cls = C1071a.class;
    }

    public C1071a() {
        this(null, null);
    }

    public C1071a(C1074c cVar, Resources resources) {
        super(null);
        this.f2851u = -1;
        this.f2852v = -1;
        C1074c cVar2 = new C1074c(cVar, this, resources);
        super.mo4555a(cVar2);
        this.f2849s = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: a */
    public C1082c mo4554a() {
        return new C1074c(this.f2849s, this, null);
    }

    /* renamed from: a */
    public void mo4555a(C1082c cVar) {
        super.mo4555a(cVar);
        if (cVar instanceof C1074c) {
            this.f2849s = (C1074c) cVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C1078g gVar = this.f2850t;
        if (gVar != null) {
            gVar.mo4562d();
            this.f2850t = null;
            mo4574a(this.f2851u);
            this.f2851u = -1;
            this.f2852v = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f2853w) {
            super.mutate();
            if (this == this) {
                this.f2849s.mo4566d();
                this.f2853w = true;
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e1, code lost:
        if (mo4574a(r0) == false) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r15) {
        /*
            r14 = this;
            p.b.m.a.a$c r0 = r14.f2849s
            int r0 = r0.mo4565b(r15)
            int r1 = r14.f2869k
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x00e4
            p.b.m.a.a$g r4 = r14.f2850t
            if (r4 == 0) goto L_0x0030
            int r1 = r14.f2851u
            if (r0 != r1) goto L_0x0017
        L_0x0014:
            r1 = r2
            goto L_0x00db
        L_0x0017:
            int r1 = r14.f2852v
            if (r0 != r1) goto L_0x002b
            boolean r1 = r4.mo4569a()
            if (r1 == 0) goto L_0x002b
            r4.mo4570b()
            int r1 = r14.f2852v
            r14.f2851u = r1
            r14.f2852v = r0
            goto L_0x0014
        L_0x002b:
            int r1 = r14.f2851u
            r4.mo4562d()
        L_0x0030:
            r4 = 0
            r14.f2850t = r4
            r4 = -1
            r14.f2852v = r4
            r14.f2851u = r4
            p.b.m.a.a$c r4 = r14.f2849s
            int r5 = r4.mo4564b(r1)
            int r6 = r4.mo4564b(r0)
            if (r6 == 0) goto L_0x00da
            if (r5 != 0) goto L_0x0048
            goto L_0x00da
        L_0x0048:
            long r7 = p124p.p126b.p130m.p131a.C1071a.C1074c.m2609a(r5, r6)
            p.e.e<java.lang.Long> r9 = r4.f2855K
            r10 = -1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            java.lang.Object r7 = r9.mo5516b(r7, r12)
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            int r7 = (int) r7
            if (r7 >= 0) goto L_0x0063
            goto L_0x00da
        L_0x0063:
            long r8 = p124p.p126b.p130m.p131a.C1071a.C1074c.m2609a(r5, r6)
            p.e.e<java.lang.Long> r12 = r4.f2855K
            java.lang.Long r13 = java.lang.Long.valueOf(r10)
            java.lang.Object r8 = r12.mo5516b(r8, r13)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            r12 = 8589934592(0x200000000, double:4.243991582E-314)
            long r8 = r8 & r12
            r12 = 0
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x0085
            r8 = r2
            goto L_0x0086
        L_0x0085:
            r8 = r3
        L_0x0086:
            r14.mo4574a(r7)
            android.graphics.drawable.Drawable r7 = r14.f2865g
            boolean r9 = r7 instanceof android.graphics.drawable.AnimationDrawable
            if (r9 == 0) goto L_0x00b8
            long r5 = p124p.p126b.p130m.p131a.C1071a.C1074c.m2609a(r5, r6)
            p.e.e<java.lang.Long> r4 = r4.f2855K
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            java.lang.Object r4 = r4.mo5516b(r5, r9)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r9 = 4294967296(0x100000000, double:2.121995791E-314)
            long r4 = r4 & r9
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x00af
            r4 = r2
            goto L_0x00b0
        L_0x00af:
            r4 = r3
        L_0x00b0:
            p.b.m.a.a$e r5 = new p.b.m.a.a$e
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            r5.<init>(r7, r4, r8)
            goto L_0x00cf
        L_0x00b8:
            boolean r4 = r7 instanceof p124p.p192v.p193a.p194a.C1748c
            if (r4 == 0) goto L_0x00c4
            p.b.m.a.a$d r5 = new p.b.m.a.a$d
            p.v.a.a.c r7 = (p124p.p192v.p193a.p194a.C1748c) r7
            r5.<init>(r7)
            goto L_0x00cf
        L_0x00c4:
            boolean r4 = r7 instanceof android.graphics.drawable.Animatable
            if (r4 == 0) goto L_0x00da
            p.b.m.a.a$b r5 = new p.b.m.a.a$b
            android.graphics.drawable.Animatable r7 = (android.graphics.drawable.Animatable) r7
            r5.<init>(r7)
        L_0x00cf:
            r5.mo4561c()
            r14.f2850t = r5
            r14.f2852v = r1
            r14.f2851u = r0
            goto L_0x0014
        L_0x00da:
            r1 = r3
        L_0x00db:
            if (r1 != 0) goto L_0x00e5
            boolean r0 = r14.mo4574a(r0)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            r2 = r3
        L_0x00e5:
            android.graphics.drawable.Drawable r0 = r14.f2865g
            if (r0 == 0) goto L_0x00ee
            boolean r15 = r0.setState(r15)
            r2 = r2 | r15
        L_0x00ee:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p130m.p131a.C1071a.onStateChange(int[]):boolean");
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f2850t != null && (visible || z2)) {
            if (z) {
                this.f2850t.mo4561c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    /* renamed from: a */
    public C1085a m2605a() {
        return new C1074c(this.f2849s, this, null);
    }

    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r12v7, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v10, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d3, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(p213q.p214a.p215a.p216a.C1965a.m4755a(r2, new java.lang.StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p124p.p126b.p130m.p131a.C1071a m2603a(android.content.Context r17, android.content.res.Resources r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20, android.content.res.Resources.Theme r21) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.String r5 = r19.getName()
            java.lang.String r6 = "animated-selector"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x01ef
            p.b.m.a.a r5 = new p.b.m.a.a
            r6 = 0
            r5.<init>(r6, r6)
            int[] r7 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableCompat
            android.content.res.TypedArray r7 = p124p.p126b.p127k.C1061o.m2453a(r1, r4, r3, r7)
            int r8 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableCompat_android_visible
            r9 = 1
            boolean r8 = r7.getBoolean(r8, r9)
            r5.setVisible(r8, r9)
            p.b.m.a.a$c r8 = r5.f2849s
            int r10 = r8.f2889d
            int r11 = r7.getChangingConfigurations()
            r10 = r10 | r11
            r8.f2889d = r10
            int r10 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableCompat_android_variablePadding
            boolean r11 = r8.f2894i
            boolean r10 = r7.getBoolean(r10, r11)
            r8.f2894i = r10
            int r10 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableCompat_android_constantSize
            boolean r11 = r8.f2897l
            boolean r10 = r7.getBoolean(r10, r11)
            r8.f2897l = r10
            int r10 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableCompat_android_enterFadeDuration
            int r11 = r8.f2877A
            int r10 = r7.getInt(r10, r11)
            r8.f2877A = r10
            int r10 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableCompat_android_exitFadeDuration
            int r11 = r8.f2878B
            int r10 = r7.getInt(r10, r11)
            r8.f2878B = r10
            int r10 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableCompat_android_dither
            boolean r8 = r8.f2909x
            boolean r8 = r7.getBoolean(r10, r8)
            r5.setDither(r8)
            p.b.m.a.b$c r8 = r5.f2863e
            r8.mo4610a(r1)
            r7.recycle()
            int r7 = r19.getDepth()
            int r7 = r7 + r9
        L_0x0077:
            int r8 = r19.next()
            if (r8 == r9) goto L_0x01e7
            int r10 = r19.getDepth()
            if (r10 >= r7) goto L_0x0086
            r11 = 3
            if (r8 == r11) goto L_0x01e7
        L_0x0086:
            r11 = 2
            if (r8 == r11) goto L_0x008a
            goto L_0x0077
        L_0x008a:
            if (r10 <= r7) goto L_0x008d
            goto L_0x0077
        L_0x008d:
            java.lang.String r8 = r19.getName()
            java.lang.String r9 = "item"
            boolean r8 = r8.equals(r9)
            r10 = -1
            r11 = 0
            if (r8 == 0) goto L_0x0142
            int[] r8 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableItem
            android.content.res.TypedArray r8 = p124p.p126b.p127k.C1061o.m2453a(r1, r4, r3, r8)
            int r12 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableItem_android_id
            int r12 = r8.getResourceId(r12, r11)
            int r13 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableItem_android_drawable
            int r10 = r8.getResourceId(r13, r10)
            if (r10 <= 0) goto L_0x00b7
            p.b.q.k0 r6 = p124p.p126b.p136q.C1185k0.m2968a()
            android.graphics.drawable.Drawable r6 = r6.mo5221b(r0, r10)
        L_0x00b7:
            r8.recycle()
            int r8 = r20.getAttributeCount()
            int[] r10 = new int[r8]
            r13 = r11
            r14 = r13
        L_0x00c2:
            if (r13 >= r8) goto L_0x00e4
            int r15 = r3.getAttributeNameResource(r13)
            if (r15 == 0) goto L_0x00e1
            r9 = 16842960(0x10100d0, float:2.369414E-38)
            if (r15 == r9) goto L_0x00e1
            r9 = 16843161(0x1010199, float:2.3694704E-38)
            if (r15 == r9) goto L_0x00e1
            int r9 = r14 + 1
            boolean r16 = r3.getAttributeBooleanValue(r13, r11)
            if (r16 == 0) goto L_0x00dd
            goto L_0x00de
        L_0x00dd:
            int r15 = -r15
        L_0x00de:
            r10[r14] = r15
            r14 = r9
        L_0x00e1:
            int r13 = r13 + 1
            goto L_0x00c2
        L_0x00e4:
            int[] r8 = android.util.StateSet.trimStateSet(r10, r14)
            java.lang.String r9 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r6 != 0) goto L_0x011c
        L_0x00ec:
            int r6 = r19.next()
            r10 = 4
            if (r6 != r10) goto L_0x00f4
            goto L_0x00ec
        L_0x00f4:
            r10 = 2
            if (r6 != r10) goto L_0x010d
            java.lang.String r6 = r19.getName()
            java.lang.String r10 = "vector"
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x0108
            p.v.a.a.g r6 = p124p.p192v.p193a.p194a.C1755g.createFromXmlInner(r18, r19, r20, r21)
            goto L_0x011c
        L_0x0108:
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromXmlInner(r18, r19, r20, r21)
            goto L_0x011c
        L_0x010d:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4755a(r2, r1, r9)
            r0.<init>(r1)
            throw r0
        L_0x011c:
            if (r6 == 0) goto L_0x0133
            p.b.m.a.a$c r9 = r5.f2849s
            int r6 = r9.mo4608a(r6)
            int[][] r10 = r9.f2915J
            r10[r6] = r8
            p.e.i<java.lang.Integer> r8 = r9.f2856L
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r8.mo5619c(r6, r9)
            goto L_0x01e3
        L_0x0133:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4755a(r2, r1, r9)
            r0.<init>(r1)
            throw r0
        L_0x0142:
            java.lang.String r6 = r19.getName()
            java.lang.String r8 = "transition"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x01e3
            int[] r6 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableTransition
            android.content.res.TypedArray r6 = p124p.p126b.p127k.C1061o.m2453a(r1, r4, r3, r6)
            int r8 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableTransition_android_fromId
            int r8 = r6.getResourceId(r8, r10)
            int r9 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableTransition_android_toId
            int r9 = r6.getResourceId(r9, r10)
            int r12 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableTransition_android_drawable
            int r12 = r6.getResourceId(r12, r10)
            if (r12 <= 0) goto L_0x0171
            p.b.q.k0 r13 = p124p.p126b.p136q.C1185k0.m2968a()
            android.graphics.drawable.Drawable r12 = r13.mo5221b(r0, r12)
            goto L_0x0172
        L_0x0171:
            r12 = 0
        L_0x0172:
            int r13 = p124p.p126b.p132n.C1087b.AnimatedStateListDrawableTransition_android_reversible
            boolean r11 = r6.getBoolean(r13, r11)
            r6.recycle()
            java.lang.String r6 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r12 != 0) goto L_0x01b5
        L_0x017f:
            int r12 = r19.next()
            r13 = 4
            if (r12 != r13) goto L_0x0187
            goto L_0x017f
        L_0x0187:
            r13 = 2
            if (r12 != r13) goto L_0x01a6
            java.lang.String r12 = r19.getName()
            java.lang.String r13 = "animated-vector"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x01a0
            p.v.a.a.c r12 = new p.v.a.a.c
            r13 = 0
            r12.<init>(r0, r13, r13)
            r12.inflate(r1, r2, r3, r4)
            goto L_0x01b6
        L_0x01a0:
            r13 = 0
            android.graphics.drawable.Drawable r12 = android.graphics.drawable.Drawable.createFromXmlInner(r18, r19, r20, r21)
            goto L_0x01b6
        L_0x01a6:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4755a(r2, r1, r6)
            r0.<init>(r1)
            throw r0
        L_0x01b5:
            r13 = 0
        L_0x01b6:
            if (r12 == 0) goto L_0x01d4
            if (r8 == r10) goto L_0x01c3
            if (r9 == r10) goto L_0x01c3
            p.b.m.a.a$c r6 = r5.f2849s
            r6.mo4563a(r8, r9, r12, r11)
            r6 = r13
            goto L_0x01e4
        L_0x01c3:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4755a(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        L_0x01d4:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4755a(r2, r1, r6)
            r0.<init>(r1)
            throw r0
        L_0x01e3:
            r6 = 0
        L_0x01e4:
            r9 = 1
            goto L_0x0077
        L_0x01e7:
            int[] r0 = r5.getState()
            r5.onStateChange(r0)
            return r5
        L_0x01ef:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r19.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid animated-selector tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p130m.p131a.C1071a.m2603a(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):p.b.m.a.a");
    }
}
