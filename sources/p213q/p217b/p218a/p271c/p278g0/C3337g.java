package p213q.p217b.p218a.p271c.p278g0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import java.util.Objects;
import p124p.p150h.p154f.C1335a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.p277f0.C3328a;
import p213q.p217b.p218a.p271c.p278g0.C3345k.C3346a;
import p213q.p217b.p218a.p271c.p278g0.C3348m.C3354f;
import p213q.p217b.p218a.p271c.p296y.C3495a;

/* renamed from: q.b.a.c.g0.g */
public class C3337g extends Drawable implements C3355n {

    /* renamed from: z */
    public static final Paint f8364z = new Paint(1);

    /* renamed from: e */
    public C3339b f8365e;

    /* renamed from: f */
    public final C3354f[] f8366f;

    /* renamed from: g */
    public final C3354f[] f8367g;

    /* renamed from: h */
    public boolean f8368h;

    /* renamed from: i */
    public final Matrix f8369i;

    /* renamed from: j */
    public final Path f8370j;

    /* renamed from: k */
    public final Path f8371k;

    /* renamed from: l */
    public final RectF f8372l;

    /* renamed from: m */
    public final RectF f8373m;

    /* renamed from: n */
    public final Region f8374n;

    /* renamed from: o */
    public final Region f8375o;

    /* renamed from: p */
    public C3342j f8376p;

    /* renamed from: q */
    public final Paint f8377q;

    /* renamed from: r */
    public final Paint f8378r;

    /* renamed from: s */
    public final C3328a f8379s;

    /* renamed from: t */
    public final C3346a f8380t;

    /* renamed from: u */
    public final C3345k f8381u;

    /* renamed from: v */
    public PorterDuffColorFilter f8382v;

    /* renamed from: w */
    public PorterDuffColorFilter f8383w;

    /* renamed from: x */
    public Rect f8384x;

    /* renamed from: y */
    public final RectF f8385y;

    /* renamed from: q.b.a.c.g0.g$a */
    public class C3338a implements C3346a {
        public C3338a() {
        }
    }

    /* renamed from: q.b.a.c.g0.g$b */
    public static final class C3339b extends ConstantState {

        /* renamed from: a */
        public C3342j f8387a;

        /* renamed from: b */
        public C3495a f8388b;

        /* renamed from: c */
        public ColorFilter f8389c;

        /* renamed from: d */
        public ColorStateList f8390d = null;

        /* renamed from: e */
        public ColorStateList f8391e = null;

        /* renamed from: f */
        public ColorStateList f8392f = null;

        /* renamed from: g */
        public ColorStateList f8393g = null;

        /* renamed from: h */
        public Mode f8394h = Mode.SRC_IN;

        /* renamed from: i */
        public Rect f8395i = null;

        /* renamed from: j */
        public float f8396j = 1.0f;

        /* renamed from: k */
        public float f8397k = 1.0f;

        /* renamed from: l */
        public float f8398l;

        /* renamed from: m */
        public int f8399m = 255;

        /* renamed from: n */
        public float f8400n = 0.0f;

        /* renamed from: o */
        public float f8401o = 0.0f;

        /* renamed from: p */
        public float f8402p = 0.0f;

        /* renamed from: q */
        public int f8403q = 0;

        /* renamed from: r */
        public int f8404r = 0;

        /* renamed from: s */
        public int f8405s = 0;

        /* renamed from: t */
        public int f8406t = 0;

        /* renamed from: u */
        public boolean f8407u = false;

        /* renamed from: v */
        public Style f8408v = Style.FILL_AND_STROKE;

        public C3339b(C3339b bVar) {
            this.f8387a = bVar.f8387a;
            this.f8388b = bVar.f8388b;
            this.f8398l = bVar.f8398l;
            this.f8389c = bVar.f8389c;
            this.f8390d = bVar.f8390d;
            this.f8391e = bVar.f8391e;
            this.f8394h = bVar.f8394h;
            this.f8393g = bVar.f8393g;
            this.f8399m = bVar.f8399m;
            this.f8396j = bVar.f8396j;
            this.f8405s = bVar.f8405s;
            this.f8403q = bVar.f8403q;
            this.f8407u = bVar.f8407u;
            this.f8397k = bVar.f8397k;
            this.f8400n = bVar.f8400n;
            this.f8401o = bVar.f8401o;
            this.f8402p = bVar.f8402p;
            this.f8404r = bVar.f8404r;
            this.f8406t = bVar.f8406t;
            this.f8392f = bVar.f8392f;
            this.f8408v = bVar.f8408v;
            if (bVar.f8395i != null) {
                this.f8395i = new Rect(bVar.f8395i);
            }
        }

        public C3339b(C3342j jVar, C3495a aVar) {
            this.f8387a = jVar;
            this.f8388b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C3337g gVar = new C3337g(this);
            gVar.f8368h = true;
            return gVar;
        }
    }

    public C3337g() {
        this(new C3342j());
    }

    public C3337g(C3339b bVar) {
        this.f8366f = new C3354f[4];
        this.f8367g = new C3354f[4];
        this.f8369i = new Matrix();
        this.f8370j = new Path();
        this.f8371k = new Path();
        this.f8372l = new RectF();
        this.f8373m = new RectF();
        this.f8374n = new Region();
        this.f8375o = new Region();
        this.f8377q = new Paint(1);
        this.f8378r = new Paint(1);
        this.f8379s = new C3328a();
        this.f8381u = new C3345k();
        this.f8385y = new RectF();
        this.f8365e = bVar;
        this.f8378r.setStyle(Style.STROKE);
        this.f8377q.setStyle(Style.FILL);
        f8364z.setColor(-1);
        f8364z.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        mo9083i();
        mo9066a(getState());
        this.f8380t = new C3338a();
    }

    public C3337g(C3342j jVar) {
        this(new C3339b(jVar, null));
    }

    /* renamed from: a */
    public final PorterDuffColorFilter mo9058a(ColorStateList colorStateList, Mode mode, Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList == null || mode == null) {
            if (z) {
                int color = paint.getColor();
                int a = mo9057a(color);
                if (a != color) {
                    porterDuffColorFilter = new PorterDuffColorFilter(a, Mode.SRC_IN);
                    return porterDuffColorFilter;
                }
            }
            porterDuffColorFilter = null;
            return porterDuffColorFilter;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo9057a(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: a */
    public void mo9059a(float f) {
        C3339b bVar = this.f8365e;
        if (bVar.f8401o != f) {
            bVar.f8401o = f;
            mo9086j();
        }
    }

    /* renamed from: a */
    public void mo9062a(Context context) {
        this.f8365e.f8388b = new C3495a(context);
        mo9086j();
    }

    /* renamed from: a */
    public void mo9063a(ColorStateList colorStateList) {
        C3339b bVar = this.f8365e;
        if (bVar.f8390d != colorStateList) {
            bVar.f8390d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: a */
    public final void mo9065a(RectF rectF, Path path) {
        mo9070b(rectF, path);
        if (this.f8365e.f8396j != 1.0f) {
            this.f8369i.reset();
            Matrix matrix = this.f8369i;
            float f = this.f8365e.f8396j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f8369i);
        }
        path.computeBounds(this.f8385y, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9066a(int[] r5) {
        /*
            r4 = this;
            q.b.a.c.g0.g$b r0 = r4.f8365e
            android.content.res.ColorStateList r0 = r0.f8390d
            r1 = 1
            if (r0 == 0) goto L_0x001e
            android.graphics.Paint r0 = r4.f8377q
            int r0 = r0.getColor()
            q.b.a.c.g0.g$b r2 = r4.f8365e
            android.content.res.ColorStateList r2 = r2.f8390d
            int r2 = r2.getColorForState(r5, r0)
            if (r0 == r2) goto L_0x001e
            android.graphics.Paint r0 = r4.f8377q
            r0.setColor(r2)
            r0 = r1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            q.b.a.c.g0.g$b r2 = r4.f8365e
            android.content.res.ColorStateList r2 = r2.f8391e
            if (r2 == 0) goto L_0x003b
            android.graphics.Paint r2 = r4.f8378r
            int r2 = r2.getColor()
            q.b.a.c.g0.g$b r3 = r4.f8365e
            android.content.res.ColorStateList r3 = r3.f8391e
            int r5 = r3.getColorForState(r5, r2)
            if (r2 == r5) goto L_0x003b
            android.graphics.Paint r0 = r4.f8378r
            r0.setColor(r5)
            goto L_0x003c
        L_0x003b:
            r1 = r0
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p271c.p278g0.C3337g.mo9066a(int[]):boolean");
    }

    /* renamed from: b */
    public RectF mo9067b() {
        Rect bounds = getBounds();
        this.f8372l.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        return this.f8372l;
    }

    /* renamed from: b */
    public void mo9068b(float f) {
        C3339b bVar = this.f8365e;
        if (bVar.f8397k != f) {
            bVar.f8397k = f;
            this.f8368h = true;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo9069b(ColorStateList colorStateList) {
        C3339b bVar = this.f8365e;
        if (bVar.f8391e != colorStateList) {
            bVar.f8391e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: b */
    public final void mo9070b(RectF rectF, Path path) {
        C3345k kVar = this.f8381u;
        C3339b bVar = this.f8365e;
        C3342j jVar = bVar.f8387a;
        float f = bVar.f8397k;
        kVar.mo9106a(jVar, f, rectF, this.f8380t, path);
    }

    /* renamed from: c */
    public final RectF mo9071c() {
        RectF b = mo9067b();
        float f = mo9075f();
        this.f8373m.set(b.left + f, b.top + f, b.right - f, b.bottom - f);
        return this.f8373m;
    }

    /* renamed from: d */
    public int mo9072d() {
        C3339b bVar = this.f8365e;
        return (int) (Math.sin(Math.toRadians((double) bVar.f8406t)) * ((double) bVar.f8405s));
    }

    /* JADX INFO: used method not loaded: q.b.a.c.g0.j.a(android.graphics.RectF):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00db, code lost:
        if ((!r2.f8387a.mo9100a(mo9067b()) && !r14.f8370j.isConvex()) != false) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            android.graphics.Paint r0 = r14.f8377q
            android.graphics.PorterDuffColorFilter r1 = r14.f8382v
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r14.f8377q
            int r0 = r0.getAlpha()
            android.graphics.Paint r1 = r14.f8377q
            q.b.a.c.g0.g$b r2 = r14.f8365e
            int r2 = r2.f8399m
            int r3 = r2 >>> 7
            int r2 = r2 + r3
            int r2 = r2 * r0
            int r2 = r2 >>> 8
            r1.setAlpha(r2)
            android.graphics.Paint r1 = r14.f8378r
            android.graphics.PorterDuffColorFilter r2 = r14.f8383w
            r1.setColorFilter(r2)
            android.graphics.Paint r1 = r14.f8378r
            q.b.a.c.g0.g$b r2 = r14.f8365e
            float r2 = r2.f8398l
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r14.f8378r
            int r1 = r1.getAlpha()
            android.graphics.Paint r2 = r14.f8378r
            q.b.a.c.g0.g$b r3 = r14.f8365e
            int r3 = r3.f8399m
            int r4 = r3 >>> 7
            int r3 = r3 + r4
            int r3 = r3 * r1
            int r3 = r3 >>> 8
            r2.setAlpha(r3)
            boolean r2 = r14.f8368h
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x00b6
            float r2 = r14.mo9075f()
            float r2 = -r2
            q.b.a.c.g0.g$b r5 = r14.f8365e
            q.b.a.c.g0.j r5 = r5.f8387a
            if (r5 == 0) goto L_0x00b5
            q.b.a.c.g0.j$b r6 = new q.b.a.c.g0.j$b
            r6.<init>(r5)
            q.b.a.c.g0.c r7 = r5.f8415e
            boolean r8 = r7 instanceof p213q.p217b.p218a.p271c.p278g0.C3340h
            if (r8 == 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            q.b.a.c.g0.b r8 = new q.b.a.c.g0.b
            r8.<init>(r2, r7)
            r7 = r8
        L_0x0064:
            r6.f8427e = r7
            q.b.a.c.g0.c r7 = r5.f8416f
            boolean r8 = r7 instanceof p213q.p217b.p218a.p271c.p278g0.C3340h
            if (r8 == 0) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            q.b.a.c.g0.b r8 = new q.b.a.c.g0.b
            r8.<init>(r2, r7)
            r7 = r8
        L_0x0073:
            r6.f8428f = r7
            q.b.a.c.g0.c r7 = r5.f8418h
            boolean r8 = r7 instanceof p213q.p217b.p218a.p271c.p278g0.C3340h
            if (r8 == 0) goto L_0x007c
            goto L_0x0082
        L_0x007c:
            q.b.a.c.g0.b r8 = new q.b.a.c.g0.b
            r8.<init>(r2, r7)
            r7 = r8
        L_0x0082:
            r6.f8430h = r7
            q.b.a.c.g0.c r5 = r5.f8417g
            boolean r7 = r5 instanceof p213q.p217b.p218a.p271c.p278g0.C3340h
            if (r7 == 0) goto L_0x008b
            goto L_0x0091
        L_0x008b:
            q.b.a.c.g0.b r7 = new q.b.a.c.g0.b
            r7.<init>(r2, r5)
            r5 = r7
        L_0x0091:
            r6.f8429g = r5
            q.b.a.c.g0.j r8 = r6.mo9102a()
            r14.f8376p = r8
            q.b.a.c.g0.k r7 = r14.f8381u
            q.b.a.c.g0.g$b r2 = r14.f8365e
            float r9 = r2.f8397k
            android.graphics.RectF r10 = r14.mo9071c()
            android.graphics.Path r12 = r14.f8371k
            r11 = 0
            r7.mo9106a(r8, r9, r10, r11, r12)
            android.graphics.RectF r2 = r14.mo9067b()
            android.graphics.Path r5 = r14.f8370j
            r14.mo9065a(r2, r5)
            r14.f8368h = r4
            goto L_0x00b6
        L_0x00b5:
            throw r3
        L_0x00b6:
            q.b.a.c.g0.g$b r2 = r14.f8365e
            int r5 = r2.f8403q
            r6 = 2
            r7 = 1
            if (r5 == r7) goto L_0x00df
            int r8 = r2.f8404r
            if (r8 <= 0) goto L_0x00df
            if (r5 == r6) goto L_0x00dd
            q.b.a.c.g0.j r2 = r2.f8387a
            android.graphics.RectF r5 = r14.mo9067b()
            boolean r2 = r2.mo9100a(r5)
            if (r2 != 0) goto L_0x00da
            android.graphics.Path r2 = r14.f8370j
            boolean r2 = r2.isConvex()
            if (r2 != 0) goto L_0x00da
            r2 = r7
            goto L_0x00db
        L_0x00da:
            r2 = r4
        L_0x00db:
            if (r2 == 0) goto L_0x00df
        L_0x00dd:
            r2 = r7
            goto L_0x00e0
        L_0x00df:
            r2 = r4
        L_0x00e0:
            if (r2 == 0) goto L_0x01b2
            r15.save()
            int r2 = r14.mo9072d()
            int r5 = r14.mo9074e()
            float r2 = (float) r2
            float r5 = (float) r5
            r15.translate(r2, r5)
            android.graphics.RectF r2 = r14.f8385y
            float r2 = r2.width()
            android.graphics.Rect r5 = r14.getBounds()
            int r5 = r5.width()
            float r5 = (float) r5
            float r2 = r2 - r5
            int r2 = (int) r2
            android.graphics.RectF r5 = r14.f8385y
            float r5 = r5.height()
            android.graphics.Rect r8 = r14.getBounds()
            int r8 = r8.height()
            float r8 = (float) r8
            float r5 = r5 - r8
            int r5 = (int) r5
            android.graphics.RectF r8 = r14.f8385y
            float r8 = r8.width()
            int r8 = (int) r8
            q.b.a.c.g0.g$b r9 = r14.f8365e
            int r9 = r9.f8404r
            int r9 = r9 * r6
            int r9 = r9 + r8
            int r9 = r9 + r2
            android.graphics.RectF r8 = r14.f8385y
            float r8 = r8.height()
            int r8 = (int) r8
            q.b.a.c.g0.g$b r10 = r14.f8365e
            int r10 = r10.f8404r
            int r10 = r10 * r6
            int r10 = r10 + r8
            int r10 = r10 + r5
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r9, r10, r6)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r6)
            android.graphics.Rect r9 = r14.getBounds()
            int r9 = r9.left
            q.b.a.c.g0.g$b r10 = r14.f8365e
            int r10 = r10.f8404r
            int r9 = r9 - r10
            int r9 = r9 - r2
            float r2 = (float) r9
            android.graphics.Rect r9 = r14.getBounds()
            int r9 = r9.top
            q.b.a.c.g0.g$b r10 = r14.f8365e
            int r10 = r10.f8404r
            int r9 = r9 - r10
            int r9 = r9 - r5
            float r5 = (float) r9
            float r9 = -r2
            float r10 = -r5
            r8.translate(r9, r10)
            q.b.a.c.g0.g$b r9 = r14.f8365e
            int r9 = r9.f8405s
            if (r9 == 0) goto L_0x0169
            android.graphics.Path r9 = r14.f8370j
            q.b.a.c.f0.a r10 = r14.f8379s
            android.graphics.Paint r10 = r10.f8353a
            r8.drawPath(r9, r10)
        L_0x0169:
            r9 = r4
        L_0x016a:
            r10 = 4
            if (r9 >= r10) goto L_0x018e
            q.b.a.c.g0.m$f[] r10 = r14.f8366f
            r10 = r10[r9]
            q.b.a.c.f0.a r11 = r14.f8379s
            q.b.a.c.g0.g$b r12 = r14.f8365e
            int r12 = r12.f8404r
            android.graphics.Matrix r13 = p213q.p217b.p218a.p271c.p278g0.C3348m.C3354f.f8466a
            r10.mo9107a(r13, r11, r12, r8)
            q.b.a.c.g0.m$f[] r10 = r14.f8367g
            r10 = r10[r9]
            q.b.a.c.f0.a r11 = r14.f8379s
            q.b.a.c.g0.g$b r12 = r14.f8365e
            int r12 = r12.f8404r
            android.graphics.Matrix r13 = p213q.p217b.p218a.p271c.p278g0.C3348m.C3354f.f8466a
            r10.mo9107a(r13, r11, r12, r8)
            int r9 = r9 + 1
            goto L_0x016a
        L_0x018e:
            int r9 = r14.mo9072d()
            int r10 = r14.mo9074e()
            int r11 = -r9
            float r11 = (float) r11
            int r12 = -r10
            float r12 = (float) r12
            r8.translate(r11, r12)
            android.graphics.Path r11 = r14.f8370j
            android.graphics.Paint r12 = f8364z
            r8.drawPath(r11, r12)
            float r9 = (float) r9
            float r10 = (float) r10
            r8.translate(r9, r10)
            r15.drawBitmap(r6, r2, r5, r3)
            r6.recycle()
            r15.restore()
        L_0x01b2:
            q.b.a.c.g0.g$b r2 = r14.f8365e
            android.graphics.Paint$Style r2 = r2.f8408v
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r2 == r3) goto L_0x01be
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            if (r2 != r3) goto L_0x01bf
        L_0x01be:
            r4 = r7
        L_0x01bf:
            if (r4 == 0) goto L_0x01d2
            android.graphics.Paint r7 = r14.f8377q
            android.graphics.Path r8 = r14.f8370j
            q.b.a.c.g0.g$b r2 = r14.f8365e
            q.b.a.c.g0.j r9 = r2.f8387a
            android.graphics.RectF r10 = r14.mo9067b()
            r5 = r14
            r6 = r15
            r5.mo9064a(r6, r7, r8, r9, r10)
        L_0x01d2:
            boolean r2 = r14.mo9082h()
            if (r2 == 0) goto L_0x01e7
            android.graphics.Paint r5 = r14.f8378r
            android.graphics.Path r6 = r14.f8371k
            q.b.a.c.g0.j r7 = r14.f8376p
            android.graphics.RectF r8 = r14.mo9071c()
            r3 = r14
            r4 = r15
            r3.mo9064a(r4, r5, r6, r7, r8)
        L_0x01e7:
            android.graphics.Paint r15 = r14.f8377q
            r15.setAlpha(r0)
            android.graphics.Paint r15 = r14.f8378r
            r15.setAlpha(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p271c.p278g0.C3337g.draw(android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public int mo9074e() {
        C3339b bVar = this.f8365e;
        return (int) (Math.cos(Math.toRadians((double) bVar.f8406t)) * ((double) bVar.f8405s));
    }

    /* renamed from: f */
    public final float mo9075f() {
        if (mo9082h()) {
            return this.f8378r.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: g */
    public float mo9076g() {
        return this.f8365e.f8387a.f8415e.mo9050a(mo9067b());
    }

    public ConstantState getConstantState() {
        return this.f8365e;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        C3339b bVar = this.f8365e;
        if (bVar.f8403q != 2) {
            if (bVar.f8387a.mo9100a(mo9067b())) {
                outline.setRoundRect(getBounds(), mo9076g());
                return;
            }
            mo9065a(mo9067b(), this.f8370j);
            if (this.f8370j.isConvex()) {
                outline.setConvexPath(this.f8370j);
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f8384x;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f8374n.set(getBounds());
        mo9065a(mo9067b(), this.f8370j);
        this.f8375o.setPath(this.f8370j, this.f8374n);
        this.f8374n.op(this.f8375o, Op.DIFFERENCE);
        return this.f8374n;
    }

    /* renamed from: h */
    public final boolean mo9082h() {
        Style style = this.f8365e.f8408v;
        return (style == Style.FILL_AND_STROKE || style == Style.STROKE) && this.f8378r.getStrokeWidth() > 0.0f;
    }

    /* renamed from: i */
    public final boolean mo9083i() {
        PorterDuffColorFilter porterDuffColorFilter = this.f8382v;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f8383w;
        C3339b bVar = this.f8365e;
        this.f8382v = mo9058a(bVar.f8393g, bVar.f8394h, this.f8377q, true);
        C3339b bVar2 = this.f8365e;
        this.f8383w = mo9058a(bVar2.f8392f, bVar2.f8394h, this.f8378r, false);
        C3339b bVar3 = this.f8365e;
        if (bVar3.f8407u) {
            this.f8379s.mo9049a(bVar3.f8393g.getColorForState(getState(), 0));
        }
        if (!Objects.equals(porterDuffColorFilter, this.f8382v) || !Objects.equals(porterDuffColorFilter2, this.f8383w)) {
            return true;
        }
        return false;
    }

    public void invalidateSelf() {
        this.f8368h = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.f8365e.f8393g;
            if (colorStateList == null || !colorStateList.isStateful()) {
                ColorStateList colorStateList2 = this.f8365e.f8392f;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.f8365e.f8391e;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        ColorStateList colorStateList4 = this.f8365e.f8390d;
                        if (colorStateList4 == null || !colorStateList4.isStateful()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: j */
    public final void mo9086j() {
        C3339b bVar = this.f8365e;
        float f = bVar.f8401o + bVar.f8402p;
        bVar.f8404r = (int) Math.ceil((double) (0.75f * f));
        this.f8365e.f8405s = (int) Math.ceil((double) (f * 0.25f));
        mo9083i();
        super.invalidateSelf();
    }

    public Drawable mutate() {
        this.f8365e = new C3339b(this.f8365e);
        return this;
    }

    public void onBoundsChange(Rect rect) {
        this.f8368h = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z = mo9066a(iArr) || mo9083i();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void setAlpha(int i) {
        C3339b bVar = this.f8365e;
        if (bVar.f8399m != i) {
            bVar.f8399m = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f8365e.f8389c = colorFilter;
        super.invalidateSelf();
    }

    public void setShapeAppearanceModel(C3342j jVar) {
        this.f8365e.f8387a = jVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f8365e.f8393g = colorStateList;
        mo9083i();
        super.invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        C3339b bVar = this.f8365e;
        if (bVar.f8394h != mode) {
            bVar.f8394h = mode;
            mo9083i();
            super.invalidateSelf();
        }
    }

    /* renamed from: a */
    public final int mo9057a(int i) {
        C3339b bVar = this.f8365e;
        float f = bVar.f8401o + bVar.f8402p + bVar.f8400n;
        C3495a aVar = bVar.f8388b;
        if (aVar == null || !aVar.f8896a) {
            return i;
        }
        if (!(C1335a.m3389b(i, 255) == aVar.f8898c)) {
            return i;
        }
        float f2 = aVar.f8899d;
        float f3 = 0.0f;
        if (f2 > 0.0f && f > 0.0f) {
            f3 = Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return C1335a.m3389b(C2286e.m5145a(C1335a.m3389b(i, 255), aVar.f8897b, f3), Color.alpha(i));
    }

    /* renamed from: a */
    public static C3337g m7717a(Context context, float f) {
        int a = C2286e.m5155a(context, C3294b.colorSurface, C3337g.class.getSimpleName());
        C3337g gVar = new C3337g();
        gVar.f8365e.f8388b = new C3495a(context);
        gVar.mo9086j();
        gVar.mo9063a(ColorStateList.valueOf(a));
        C3339b bVar = gVar.f8365e;
        if (bVar.f8401o != f) {
            bVar.f8401o = f;
            gVar.mo9086j();
        }
        return gVar;
    }

    /* renamed from: a */
    public final void mo9064a(Canvas canvas, Paint paint, Path path, C3342j jVar, RectF rectF) {
        if (jVar.mo9100a(rectF)) {
            float a = jVar.f8416f.mo9050a(rectF);
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: a */
    public void mo9060a(float f, int i) {
        this.f8365e.f8398l = f;
        invalidateSelf();
        mo9069b(ColorStateList.valueOf(i));
    }

    /* renamed from: a */
    public void mo9061a(float f, ColorStateList colorStateList) {
        this.f8365e.f8398l = f;
        invalidateSelf();
        mo9069b(colorStateList);
    }
}
