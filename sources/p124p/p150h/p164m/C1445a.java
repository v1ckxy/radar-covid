package p124p.p150h.p164m;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p124p.p150h.p162l.C1404o;

/* renamed from: p.h.m.a */
public abstract class C1445a implements OnTouchListener {

    /* renamed from: u */
    public static final int f4222u = ViewConfiguration.getTapTimeout();

    /* renamed from: e */
    public final C1446a f4223e = new C1446a();

    /* renamed from: f */
    public final Interpolator f4224f = new AccelerateInterpolator();

    /* renamed from: g */
    public final View f4225g;

    /* renamed from: h */
    public Runnable f4226h;

    /* renamed from: i */
    public float[] f4227i = {0.0f, 0.0f};

    /* renamed from: j */
    public float[] f4228j = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: k */
    public int f4229k;

    /* renamed from: l */
    public int f4230l;

    /* renamed from: m */
    public float[] f4231m = {0.0f, 0.0f};

    /* renamed from: n */
    public float[] f4232n = {0.0f, 0.0f};

    /* renamed from: o */
    public float[] f4233o = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: p */
    public boolean f4234p;

    /* renamed from: q */
    public boolean f4235q;

    /* renamed from: r */
    public boolean f4236r;

    /* renamed from: s */
    public boolean f4237s;

    /* renamed from: t */
    public boolean f4238t;

    /* renamed from: p.h.m.a$a */
    public static class C1446a {

        /* renamed from: a */
        public int f4239a;

        /* renamed from: b */
        public int f4240b;

        /* renamed from: c */
        public float f4241c;

        /* renamed from: d */
        public float f4242d;

        /* renamed from: e */
        public long f4243e = Long.MIN_VALUE;

        /* renamed from: f */
        public long f4244f = 0;

        /* renamed from: g */
        public int f4245g = 0;

        /* renamed from: h */
        public int f4246h = 0;

        /* renamed from: i */
        public long f4247i = -1;

        /* renamed from: j */
        public float f4248j;

        /* renamed from: k */
        public int f4249k;

        /* renamed from: a */
        public final float mo5969a(long j) {
            if (j < this.f4243e) {
                return 0.0f;
            }
            long j2 = this.f4247i;
            if (j2 < 0 || j < j2) {
                return C1445a.m3647a(((float) (j - this.f4243e)) / ((float) this.f4239a), 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f4248j;
            return (C1445a.m3647a(((float) j3) / ((float) this.f4249k), 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    /* renamed from: p.h.m.a$b */
    public class C1447b implements Runnable {
        public C1447b() {
        }

        public void run() {
            C1445a aVar = C1445a.this;
            if (aVar.f4237s) {
                if (aVar.f4235q) {
                    aVar.f4235q = false;
                    C1446a aVar2 = aVar.f4223e;
                    if (aVar2 != null) {
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.f4243e = currentAnimationTimeMillis;
                        aVar2.f4247i = -1;
                        aVar2.f4244f = currentAnimationTimeMillis;
                        aVar2.f4248j = 0.5f;
                        aVar2.f4245g = 0;
                        aVar2.f4246h = 0;
                    } else {
                        throw null;
                    }
                }
                C1446a aVar3 = C1445a.this.f4223e;
                if ((aVar3.f4247i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar3.f4247i + ((long) aVar3.f4249k)) || !C1445a.this.mo5967b()) {
                    C1445a.this.f4237s = false;
                    return;
                }
                C1445a aVar4 = C1445a.this;
                if (aVar4.f4236r) {
                    aVar4.f4236r = false;
                    if (aVar4 != null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        aVar4.f4225g.onTouchEvent(obtain);
                        obtain.recycle();
                    } else {
                        throw null;
                    }
                }
                if (aVar3.f4244f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = aVar3.mo5969a(currentAnimationTimeMillis2);
                    float f = (a * 4.0f) + (-4.0f * a * a);
                    long j = currentAnimationTimeMillis2 - aVar3.f4244f;
                    aVar3.f4244f = currentAnimationTimeMillis2;
                    float f2 = ((float) j) * f;
                    aVar3.f4245g = (int) (aVar3.f4241c * f2);
                    int i = (int) (f2 * aVar3.f4242d);
                    aVar3.f4246h = i;
                    ((C1449c) C1445a.this).f4252v.scrollListBy(i);
                    C1404o.m3523a(C1445a.this.f4225g, (Runnable) this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public C1445a(View view) {
        this.f4225g = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        int i = (int) ((f * 315.0f) + 0.5f);
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        float[] fArr = this.f4233o;
        float f3 = f2 / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float f4 = (float) i;
        float[] fArr2 = this.f4232n;
        float f5 = f4 / 1000.0f;
        fArr2[0] = f5;
        fArr2[1] = f5;
        this.f4229k = 1;
        float[] fArr3 = this.f4228j;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f4227i;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f4231m;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f4230l = f4222u;
        C1446a aVar = this.f4223e;
        aVar.f4239a = 500;
        aVar.f4240b = 500;
    }

    /* renamed from: a */
    public static float m3647a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    public final float mo5964a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f4229k;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f4237s || this.f4229k != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo5965a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f4227i
            r0 = r0[r4]
            float[] r1 = r3.f4228j
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m3647a(r0, r2, r1)
            float r1 = r3.mo5964a(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.mo5964a(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0025
            android.view.animation.Interpolator r6 = r3.f4224f
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x002f
        L_0x0025:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0038
            android.view.animation.Interpolator r6 = r3.f4224f
            float r5 = r6.getInterpolation(r5)
        L_0x002f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m3647a(r5, r6, r0)
            goto L_0x0039
        L_0x0038:
            r5 = r2
        L_0x0039:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003e
            return r2
        L_0x003e:
            float[] r0 = r3.f4231m
            r0 = r0[r4]
            float[] r1 = r3.f4232n
            r1 = r1[r4]
            float[] r2 = r3.f4233o
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0053
            float r5 = r5 * r0
            float r4 = m3647a(r5, r1, r4)
            return r4
        L_0x0053:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = m3647a(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p164m.C1445a.mo5965a(int, float, float, float):float");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5967b() {
        /*
            r9 = this;
            p.h.m.a$a r0 = r9.f4223e
            float r1 = r0.f4242d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f4241c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            p.h.m.c r4 = (p124p.p150h.p164m.C1449c) r4
            android.widget.ListView r4 = r4.f4252v
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = r3
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = r2
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = r3
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p164m.C1445a.mo5967b():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f4238t
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007d
        L_0x0016:
            r5.mo5966a()
            goto L_0x007d
        L_0x001a:
            r5.f4236r = r2
            r5.f4234p = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f4225g
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.mo5965a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f4225g
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.mo5965a(r2, r7, r6, r3)
            p.h.m.a$a r7 = r5.f4223e
            r7.f4241c = r0
            r7.f4242d = r6
            boolean r6 = r5.f4237s
            if (r6 != 0) goto L_0x007d
            boolean r6 = r5.mo5967b()
            if (r6 == 0) goto L_0x007d
            java.lang.Runnable r6 = r5.f4226h
            if (r6 != 0) goto L_0x0061
            p.h.m.a$b r6 = new p.h.m.a$b
            r6.<init>()
            r5.f4226h = r6
        L_0x0061:
            r5.f4237s = r2
            r5.f4235q = r2
            boolean r6 = r5.f4234p
            if (r6 != 0) goto L_0x0076
            int r6 = r5.f4230l
            if (r6 <= 0) goto L_0x0076
            android.view.View r7 = r5.f4225g
            java.lang.Runnable r0 = r5.f4226h
            long r3 = (long) r6
            p124p.p150h.p162l.C1404o.m3524a(r7, r0, r3)
            goto L_0x007b
        L_0x0076:
            java.lang.Runnable r6 = r5.f4226h
            r6.run()
        L_0x007b:
            r5.f4234p = r2
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p164m.C1445a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo5966a() {
        int i = 0;
        if (this.f4235q) {
            this.f4237s = false;
            return;
        }
        C1446a aVar = this.f4223e;
        if (aVar != null) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i2 = (int) (currentAnimationTimeMillis - aVar.f4243e);
            int i3 = aVar.f4240b;
            if (i2 > i3) {
                i = i3;
            } else if (i2 >= 0) {
                i = i2;
            }
            aVar.f4249k = i;
            aVar.f4248j = aVar.mo5969a(currentAnimationTimeMillis);
            aVar.f4247i = currentAnimationTimeMillis;
            return;
        }
        throw null;
    }
}
