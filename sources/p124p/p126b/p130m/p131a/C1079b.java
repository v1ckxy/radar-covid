package p124p.p126b.p130m.p131a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.SparseArray;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p130m.p131a.C1084d.C1085a;

/* renamed from: p.b.m.a.b */
public class C1079b extends Drawable implements Callback {

    /* renamed from: e */
    public C1082c f2863e;

    /* renamed from: f */
    public Rect f2864f;

    /* renamed from: g */
    public Drawable f2865g;

    /* renamed from: h */
    public Drawable f2866h;

    /* renamed from: i */
    public int f2867i = 255;

    /* renamed from: j */
    public boolean f2868j;

    /* renamed from: k */
    public int f2869k = -1;

    /* renamed from: l */
    public boolean f2870l;

    /* renamed from: m */
    public Runnable f2871m;

    /* renamed from: n */
    public long f2872n;

    /* renamed from: o */
    public long f2873o;

    /* renamed from: p */
    public C1081b f2874p;

    /* renamed from: p.b.m.a.b$a */
    public class C1080a implements Runnable {
        public C1080a() {
        }

        public void run() {
            C1079b.this.mo4573a(true);
            C1079b.this.invalidateSelf();
        }
    }

    /* renamed from: p.b.m.a.b$b */
    public static class C1081b implements Callback {

        /* renamed from: e */
        public Callback f2876e;

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Callback callback = this.f2876e;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Callback callback = this.f2876e;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: p.b.m.a.b$c */
    public static abstract class C1082c extends ConstantState {

        /* renamed from: A */
        public int f2877A;

        /* renamed from: B */
        public int f2878B;

        /* renamed from: C */
        public boolean f2879C;

        /* renamed from: D */
        public ColorFilter f2880D;

        /* renamed from: E */
        public boolean f2881E;

        /* renamed from: F */
        public ColorStateList f2882F;

        /* renamed from: G */
        public Mode f2883G;

        /* renamed from: H */
        public boolean f2884H;

        /* renamed from: I */
        public boolean f2885I;

        /* renamed from: a */
        public final C1079b f2886a;

        /* renamed from: b */
        public Resources f2887b;

        /* renamed from: c */
        public int f2888c = 160;

        /* renamed from: d */
        public int f2889d;

        /* renamed from: e */
        public int f2890e;

        /* renamed from: f */
        public SparseArray<ConstantState> f2891f;

        /* renamed from: g */
        public Drawable[] f2892g;

        /* renamed from: h */
        public int f2893h;

        /* renamed from: i */
        public boolean f2894i;

        /* renamed from: j */
        public boolean f2895j;

        /* renamed from: k */
        public Rect f2896k;

        /* renamed from: l */
        public boolean f2897l;

        /* renamed from: m */
        public boolean f2898m;

        /* renamed from: n */
        public int f2899n;

        /* renamed from: o */
        public int f2900o;

        /* renamed from: p */
        public int f2901p;

        /* renamed from: q */
        public int f2902q;

        /* renamed from: r */
        public boolean f2903r;

        /* renamed from: s */
        public int f2904s;

        /* renamed from: t */
        public boolean f2905t;

        /* renamed from: u */
        public boolean f2906u;

        /* renamed from: v */
        public boolean f2907v;

        /* renamed from: w */
        public boolean f2908w;

        /* renamed from: x */
        public boolean f2909x;

        /* renamed from: y */
        public boolean f2910y;

        /* renamed from: z */
        public int f2911z;

        public C1082c(C1082c cVar, C1079b bVar, Resources resources) {
            this.f2894i = false;
            this.f2897l = false;
            this.f2909x = true;
            this.f2877A = 0;
            this.f2878B = 0;
            this.f2886a = bVar;
            Resources resources2 = resources != null ? resources : cVar != null ? cVar.f2887b : null;
            this.f2887b = resources2;
            int a = C1079b.m2624a(resources, cVar != null ? cVar.f2888c : 0);
            this.f2888c = a;
            if (cVar != null) {
                this.f2889d = cVar.f2889d;
                this.f2890e = cVar.f2890e;
                this.f2907v = true;
                this.f2908w = true;
                this.f2894i = cVar.f2894i;
                this.f2897l = cVar.f2897l;
                this.f2909x = cVar.f2909x;
                this.f2910y = cVar.f2910y;
                this.f2911z = cVar.f2911z;
                this.f2877A = cVar.f2877A;
                this.f2878B = cVar.f2878B;
                this.f2879C = cVar.f2879C;
                this.f2880D = cVar.f2880D;
                this.f2881E = cVar.f2881E;
                this.f2882F = cVar.f2882F;
                this.f2883G = cVar.f2883G;
                this.f2884H = cVar.f2884H;
                this.f2885I = cVar.f2885I;
                if (cVar.f2888c == a) {
                    if (cVar.f2895j) {
                        this.f2896k = new Rect(cVar.f2896k);
                        this.f2895j = true;
                    }
                    if (cVar.f2898m) {
                        this.f2899n = cVar.f2899n;
                        this.f2900o = cVar.f2900o;
                        this.f2901p = cVar.f2901p;
                        this.f2902q = cVar.f2902q;
                        this.f2898m = true;
                    }
                }
                if (cVar.f2903r) {
                    this.f2904s = cVar.f2904s;
                    this.f2903r = true;
                }
                if (cVar.f2905t) {
                    this.f2906u = cVar.f2906u;
                    this.f2905t = true;
                }
                Drawable[] drawableArr = cVar.f2892g;
                this.f2892g = new Drawable[drawableArr.length];
                this.f2893h = cVar.f2893h;
                SparseArray<ConstantState> sparseArray = cVar.f2891f;
                this.f2891f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f2893h);
                int i = this.f2893h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f2891f.put(i2, constantState);
                        } else {
                            this.f2892g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f2892g = new Drawable[10];
            this.f2893h = 0;
        }

        /* renamed from: a */
        public final int mo4608a(Drawable drawable) {
            int i = this.f2893h;
            if (i >= this.f2892g.length) {
                int i2 = i + 10;
                C1085a aVar = (C1085a) this;
                Drawable[] drawableArr = new Drawable[i2];
                System.arraycopy(aVar.f2892g, 0, drawableArr, 0, i);
                aVar.f2892g = drawableArr;
                int[][] iArr = new int[i2][];
                System.arraycopy(aVar.f2915J, 0, iArr, 0, i);
                aVar.f2915J = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f2886a);
            this.f2892g[i] = drawable;
            this.f2893h++;
            this.f2890e = drawable.getChangingConfigurations() | this.f2890e;
            this.f2903r = false;
            this.f2905t = false;
            this.f2896k = null;
            this.f2895j = false;
            this.f2898m = false;
            this.f2907v = false;
            return i;
        }

        /* renamed from: a */
        public final void mo4610a(Resources resources) {
            if (resources != null) {
                this.f2887b = resources;
                int a = C1079b.m2624a(resources, this.f2888c);
                int i = this.f2888c;
                this.f2888c = a;
                if (i != a) {
                    this.f2898m = false;
                    this.f2895j = false;
                }
            }
        }

        /* renamed from: a */
        public synchronized boolean mo4611a() {
            if (this.f2907v) {
                return this.f2908w;
            }
            mo4613c();
            this.f2907v = true;
            int i = this.f2893h;
            Drawable[] drawableArr = this.f2892g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f2908w = false;
                    return false;
                }
            }
            this.f2908w = true;
            return true;
        }

        /* renamed from: b */
        public void mo4612b() {
            this.f2898m = true;
            mo4613c();
            int i = this.f2893h;
            Drawable[] drawableArr = this.f2892g;
            this.f2900o = -1;
            this.f2899n = -1;
            this.f2902q = 0;
            this.f2901p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f2899n) {
                    this.f2899n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f2900o) {
                    this.f2900o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f2901p) {
                    this.f2901p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f2902q) {
                    this.f2902q = minimumHeight;
                }
            }
        }

        /* renamed from: c */
        public final void mo4613c() {
            SparseArray<ConstantState> sparseArray = this.f2891f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = this.f2891f.keyAt(i);
                    ConstantState constantState = (ConstantState) this.f2891f.valueAt(i);
                    Drawable[] drawableArr = this.f2892g;
                    Drawable newDrawable = constantState.newDrawable(this.f2887b);
                    newDrawable.setLayoutDirection(this.f2911z);
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f2886a);
                    drawableArr[keyAt] = mutate;
                }
                this.f2891f = null;
            }
        }

        public boolean canApplyTheme() {
            int i = this.f2893h;
            Drawable[] drawableArr = this.f2892g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    ConstantState constantState = (ConstantState) this.f2891f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public abstract void mo4566d();

        public int getChangingConfigurations() {
            return this.f2889d | this.f2890e;
        }

        /* renamed from: a */
        public final Drawable mo4609a(int i) {
            Drawable drawable = this.f2892g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<ConstantState> sparseArray = this.f2891f;
            if (sparseArray != null) {
                int indexOfKey = sparseArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    Drawable newDrawable = ((ConstantState) this.f2891f.valueAt(indexOfKey)).newDrawable(this.f2887b);
                    newDrawable.setLayoutDirection(this.f2911z);
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f2886a);
                    this.f2892g[i] = mutate;
                    this.f2891f.removeAt(indexOfKey);
                    if (this.f2891f.size() == 0) {
                        this.f2891f = null;
                    }
                    return mutate;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static int m2624a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* renamed from: a */
    public C1082c mo4554a() {
        throw null;
    }

    /* renamed from: a */
    public final void mo4572a(Drawable drawable) {
        if (this.f2874p == null) {
            this.f2874p = new C1081b();
        }
        C1081b bVar = this.f2874p;
        bVar.f2876e = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f2863e.f2877A <= 0 && this.f2868j) {
                drawable.setAlpha(this.f2867i);
            }
            if (this.f2863e.f2881E) {
                drawable.setColorFilter(this.f2863e.f2880D);
            } else {
                if (this.f2863e.f2884H) {
                    drawable.setTintList(this.f2863e.f2882F);
                }
                if (this.f2863e.f2885I) {
                    drawable.setTintMode(this.f2863e.f2883G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2863e.f2909x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f2863e.f2879C);
            Rect rect = this.f2864f;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C1081b bVar2 = this.f2874p;
            Callback callback = bVar2.f2876e;
            bVar2.f2876e = null;
            drawable.setCallback(callback);
        }
    }

    /* renamed from: a */
    public void mo4555a(C1082c cVar) {
        this.f2863e = cVar;
        int i = this.f2869k;
        if (i >= 0) {
            Drawable a = cVar.mo4609a(i);
            this.f2865g = a;
            if (a != null) {
                mo4572a(a);
            }
        }
        this.f2866h = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4573a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f2868j = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f2865g
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0034
            long r9 = r13.f2872n
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0036
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f2867i
            r3.setAlpha(r9)
            goto L_0x0034
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            p.b.m.a.b$c r10 = r13.f2863e
            int r10 = r10.f2877A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f2867i
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L_0x0037
        L_0x0034:
            r13.f2872n = r7
        L_0x0036:
            r3 = r6
        L_0x0037:
            android.graphics.drawable.Drawable r9 = r13.f2866h
            if (r9 == 0) goto L_0x005d
            long r10 = r13.f2873o
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x005f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004c
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f2866h = r0
            goto L_0x005d
        L_0x004c:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            p.b.m.a.b$c r4 = r13.f2863e
            int r4 = r4.f2878B
            int r3 = r3 / r4
            int r4 = r13.f2867i
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0060
        L_0x005d:
            r13.f2873o = r7
        L_0x005f:
            r0 = r3
        L_0x0060:
            if (r14 == 0) goto L_0x006c
            if (r0 == 0) goto L_0x006c
            java.lang.Runnable r14 = r13.f2871m
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p130m.p131a.C1079b.mo4573a(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4574a(int r10) {
        /*
            r9 = this;
            int r0 = r9.f2869k
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            p.b.m.a.b$c r0 = r9.f2863e
            int r0 = r0.f2878B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f2866h
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f2865g
            if (r0 == 0) goto L_0x0029
            r9.f2866h = r0
            p.b.m.a.b$c r0 = r9.f2863e
            int r0 = r0.f2878B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f2873o = r0
            goto L_0x0035
        L_0x0029:
            r9.f2866h = r4
            r9.f2873o = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f2865g
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            p.b.m.a.b$c r0 = r9.f2863e
            int r1 = r0.f2893h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo4609a(r10)
            r9.f2865g = r0
            r9.f2869k = r10
            if (r0 == 0) goto L_0x005a
            p.b.m.a.b$c r10 = r9.f2863e
            int r10 = r10.f2877A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f2872n = r2
        L_0x0051:
            r9.mo4572a(r0)
            goto L_0x005a
        L_0x0055:
            r9.f2865g = r4
            r10 = -1
            r9.f2869k = r10
        L_0x005a:
            long r0 = r9.f2872n
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L_0x0067
            long r1 = r9.f2873o
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r10 = r9.f2871m
            if (r10 != 0) goto L_0x0073
            p.b.m.a.b$a r10 = new p.b.m.a.b$a
            r10.<init>()
            r9.f2871m = r10
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r10)
        L_0x0076:
            r9.mo4573a(r0)
        L_0x0079:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p130m.p131a.C1079b.mo4574a(int):boolean");
    }

    public boolean canApplyTheme() {
        return this.f2863e.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f2865g;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2866h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f2867i;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2863e.getChangingConfigurations();
    }

    public final ConstantState getConstantState() {
        if (!this.f2863e.mo4611a()) {
            return null;
        }
        this.f2863e.f2889d = getChangingConfigurations();
        return this.f2863e;
    }

    public Drawable getCurrent() {
        return this.f2865g;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2864f;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        C1082c cVar = this.f2863e;
        if (cVar.f2897l) {
            if (!cVar.f2898m) {
                cVar.mo4612b();
            }
            return cVar.f2900o;
        }
        Drawable drawable = this.f2865g;
        return drawable != null ? drawable.getIntrinsicHeight() : -1;
    }

    public int getIntrinsicWidth() {
        C1082c cVar = this.f2863e;
        if (cVar.f2897l) {
            if (!cVar.f2898m) {
                cVar.mo4612b();
            }
            return cVar.f2899n;
        }
        Drawable drawable = this.f2865g;
        return drawable != null ? drawable.getIntrinsicWidth() : -1;
    }

    public int getMinimumHeight() {
        C1082c cVar = this.f2863e;
        if (cVar.f2897l) {
            if (!cVar.f2898m) {
                cVar.mo4612b();
            }
            return cVar.f2902q;
        }
        Drawable drawable = this.f2865g;
        return drawable != null ? drawable.getMinimumHeight() : 0;
    }

    public int getMinimumWidth() {
        C1082c cVar = this.f2863e;
        if (cVar.f2897l) {
            if (!cVar.f2898m) {
                cVar.mo4612b();
            }
            return cVar.f2901p;
        }
        Drawable drawable = this.f2865g;
        return drawable != null ? drawable.getMinimumWidth() : 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f2865g;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C1082c cVar = this.f2863e;
        if (cVar.f2903r) {
            return cVar.f2904s;
        }
        cVar.mo4613c();
        int i2 = cVar.f2893h;
        Drawable[] drawableArr = cVar.f2892g;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i3 = 1; i3 < i2; i3++) {
            i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
        }
        cVar.f2904s = i;
        cVar.f2903r = true;
        return i;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f2865g;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        C1082c cVar = this.f2863e;
        Rect rect2 = null;
        boolean z2 = false;
        if (!cVar.f2894i) {
            if (cVar.f2896k != null || cVar.f2895j) {
                rect2 = cVar.f2896k;
            } else {
                cVar.mo4613c();
                Rect rect3 = new Rect();
                int i = cVar.f2893h;
                Drawable[] drawableArr = cVar.f2892g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect3)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect3.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect3.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect3.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect3.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                cVar.f2895j = true;
                cVar.f2896k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            z = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f2865g;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f2863e.f2879C && getLayoutDirection() == 1) {
            z2 = true;
        }
        if (z2) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        C1082c cVar = this.f2863e;
        if (cVar != null) {
            cVar.f2903r = false;
            cVar.f2905t = false;
        }
        if (drawable == this.f2865g && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f2863e.f2879C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f2866h;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2866h = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f2865g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f2868j) {
                this.f2865g.setAlpha(this.f2867i);
            }
        }
        if (this.f2873o != 0) {
            this.f2873o = 0;
            z = true;
        }
        if (this.f2872n != 0) {
            this.f2872n = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f2870l && super.mutate() == this) {
            C1082c a = mo4554a();
            a.mo4566d();
            mo4555a(a);
            this.f2870l = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2866h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2865g;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        C1082c cVar = this.f2863e;
        int i2 = this.f2869k;
        int i3 = cVar.f2893h;
        Drawable[] drawableArr = cVar.f2892g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean layoutDirection = drawableArr[i4].setLayoutDirection(i);
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        cVar.f2911z = i;
        return z;
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f2866h;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f2865g;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f2865g && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f2868j || this.f2867i != i) {
            this.f2868j = true;
            this.f2867i = i;
            Drawable drawable = this.f2865g;
            if (drawable == null) {
                return;
            }
            if (this.f2872n == 0) {
                drawable.setAlpha(i);
            } else {
                mo4573a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C1082c cVar = this.f2863e;
        if (cVar.f2879C != z) {
            cVar.f2879C = z;
            Drawable drawable = this.f2865g;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C1082c cVar = this.f2863e;
        cVar.f2881E = true;
        if (cVar.f2880D != colorFilter) {
            cVar.f2880D = colorFilter;
            Drawable drawable = this.f2865g;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C1082c cVar = this.f2863e;
        if (cVar.f2909x != z) {
            cVar.f2909x = z;
            Drawable drawable = this.f2865g;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f2865g;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f2864f;
        if (rect == null) {
            this.f2864f = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f2865g;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C1082c cVar = this.f2863e;
        cVar.f2884H = true;
        if (cVar.f2882F != colorStateList) {
            cVar.f2882F = colorStateList;
            C1061o.m2477a(this.f2865g, colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        C1082c cVar = this.f2863e;
        cVar.f2885I = true;
        if (cVar.f2883G != mode) {
            cVar.f2883G = mode;
            C1061o.m2478a(this.f2865g, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f2866h;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f2865g;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f2865g && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
