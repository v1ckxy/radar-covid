package p124p.p167j.p169b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p124p.p150h.p162l.C1404o;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.j.b.e */
public class C1468e {

    /* renamed from: v */
    public static final Interpolator f4293v = new C1469a();

    /* renamed from: a */
    public int f4294a;

    /* renamed from: b */
    public int f4295b;

    /* renamed from: c */
    public int f4296c = -1;

    /* renamed from: d */
    public float[] f4297d;

    /* renamed from: e */
    public float[] f4298e;

    /* renamed from: f */
    public float[] f4299f;

    /* renamed from: g */
    public float[] f4300g;

    /* renamed from: h */
    public int[] f4301h;

    /* renamed from: i */
    public int[] f4302i;

    /* renamed from: j */
    public int[] f4303j;

    /* renamed from: k */
    public int f4304k;

    /* renamed from: l */
    public VelocityTracker f4305l;

    /* renamed from: m */
    public float f4306m;

    /* renamed from: n */
    public float f4307n;

    /* renamed from: o */
    public int f4308o;

    /* renamed from: p */
    public OverScroller f4309p;

    /* renamed from: q */
    public final C1471c f4310q;

    /* renamed from: r */
    public View f4311r;

    /* renamed from: s */
    public boolean f4312s;

    /* renamed from: t */
    public final ViewGroup f4313t;

    /* renamed from: u */
    public final Runnable f4314u = new C1470b();

    /* renamed from: p.j.b.e$a */
    public static class C1469a implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: p.j.b.e$b */
    public class C1470b implements Runnable {
        public C1470b() {
        }

        public void run() {
            C1468e.this.mo6020c(0);
        }
    }

    /* renamed from: p.j.b.e$c */
    public static abstract class C1471c {
        /* renamed from: a */
        public int mo1689a(View view) {
            return 0;
        }

        /* renamed from: a */
        public abstract int mo1690a(View view, int i, int i2);

        /* renamed from: a */
        public abstract void mo1691a(int i);

        /* renamed from: a */
        public abstract void mo1692a(View view, float f, float f2);

        /* renamed from: a */
        public void mo1693a(View view, int i) {
        }

        /* renamed from: a */
        public abstract void mo1694a(View view, int i, int i2, int i3, int i4);

        /* renamed from: b */
        public int mo1778b(View view) {
            return 0;
        }

        /* renamed from: b */
        public abstract int mo1695b(View view, int i, int i2);

        /* renamed from: b */
        public abstract boolean mo1696b(View view, int i);
    }

    public C1468e(Context context, ViewGroup viewGroup, C1471c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f4313t = viewGroup;
            this.f4310q = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f4308o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f4295b = viewConfiguration.getScaledTouchSlop();
            this.f4306m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f4307n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f4309p = new OverScroller(context, f4293v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    public final float mo6000a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            f3 = -f3;
        }
        return f3;
    }

    /* renamed from: a */
    public final int mo6001a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            i3 = -i3;
        }
        return i3;
    }

    /* renamed from: a */
    public void mo6003a() {
        this.f4296c = -1;
        float[] fArr = this.f4297d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f4298e, 0.0f);
            Arrays.fill(this.f4299f, 0.0f);
            Arrays.fill(this.f4300g, 0.0f);
            Arrays.fill(this.f4301h, 0);
            Arrays.fill(this.f4302i, 0);
            Arrays.fill(this.f4303j, 0);
            this.f4304k = 0;
        }
        VelocityTracker velocityTracker = this.f4305l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4305l = null;
        }
    }

    /* renamed from: a */
    public final void mo6004a(float f, float f2) {
        this.f4312s = true;
        this.f4310q.mo1692a(this.f4311r, f, f2);
        this.f4312s = false;
        if (this.f4294a == 1) {
            mo6020c(0);
        }
    }

    /* renamed from: a */
    public void mo6008a(View view, int i) {
        if (view.getParent() == this.f4313t) {
            this.f4311r = view;
            this.f4296c = i;
            this.f4310q.mo1693a(view, i);
            mo6020c(1);
            return;
        }
        StringBuilder a = C1965a.m4756a("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        a.append(this.f4313t);
        a.append(")");
        throw new IllegalArgumentException(a.toString());
    }

    /* renamed from: a */
    public final boolean mo6011a(View view, float f, float f2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        boolean z2 = this.f4310q.mo1689a(view) > 0;
        boolean z3 = this.f4310q.mo1778b(view) > 0;
        if (z2 && z3) {
            float f3 = (f2 * f2) + (f * f);
            int i = this.f4295b;
            if (f3 > ((float) (i * i))) {
                z = true;
            }
            return z;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.f4295b)) {
                z = true;
            }
            return z;
        } else {
            if (z3 && Math.abs(f2) > ((float) this.f4295b)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    public boolean mo6012a(boolean z) {
        if (this.f4294a == 2) {
            boolean computeScrollOffset = this.f4309p.computeScrollOffset();
            int currX = this.f4309p.getCurrX();
            int currY = this.f4309p.getCurrY();
            int left = currX - this.f4311r.getLeft();
            int top = currY - this.f4311r.getTop();
            if (left != 0) {
                C1404o.m3535b(this.f4311r, left);
            }
            if (top != 0) {
                C1404o.m3539c(this.f4311r, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f4310q.mo1694a(this.f4311r, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f4309p.getFinalX() && currY == this.f4309p.getFinalY()) {
                this.f4309p.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f4313t.post(this.f4314u);
                } else {
                    mo6020c(0);
                }
            }
        }
        return this.f4294a == 2;
    }

    /* renamed from: b */
    public final int mo6013b(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f4313t.getWidth();
        float f = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f))) * f) + f;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: b */
    public final void mo6014b() {
        this.f4305l.computeCurrentVelocity(1000, this.f4306m);
        mo6004a(mo6000a(this.f4305l.getXVelocity(this.f4296c), this.f4307n, this.f4306m), mo6000a(this.f4305l.getYVelocity(this.f4296c), this.f4307n, this.f4306m));
    }

    /* renamed from: b */
    public final void mo6016b(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (mo6017b(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f4299f[pointerId] = x;
                this.f4300g[pointerId] = y;
            }
        }
    }

    /* renamed from: b */
    public boolean mo6018b(int i, int i2) {
        if (this.f4312s) {
            return mo6010a(i, i2, (int) this.f4305l.getXVelocity(this.f4296c), (int) this.f4305l.getYVelocity(this.f4296c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: b */
    public boolean mo6019b(View view, int i) {
        if (view == this.f4311r && this.f4296c == i) {
            return true;
        }
        if (view == null || !this.f4310q.mo1696b(view, i)) {
            return false;
        }
        this.f4296c = i;
        mo6008a(view, i);
        return true;
    }

    /* renamed from: c */
    public void mo6020c(int i) {
        this.f4313t.removeCallbacks(this.f4314u);
        if (this.f4294a != i) {
            this.f4294a = i;
            this.f4310q.mo1691a(i);
            if (this.f4294a == 0) {
                this.f4311r = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
        if (r12 != r11) goto L_0x00e4;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6021c(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo6003a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f4305l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f4305l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f4305l
            r4.addMovement(r1)
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0102
            if (r2 == r7) goto L_0x00fd
            if (r2 == r5) goto L_0x006e
            r8 = 3
            if (r2 == r8) goto L_0x00fd
            r8 = 5
            if (r2 == r8) goto L_0x003e
            r4 = 6
            if (r2 == r4) goto L_0x0036
        L_0x0033:
            r2 = r6
            goto L_0x0131
        L_0x0036:
            int r1 = r1.getPointerId(r3)
            r0.mo6006a(r1)
            goto L_0x0033
        L_0x003e:
            int r2 = r1.getPointerId(r3)
            float r8 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.mo6015b(r8, r1, r2)
            int r3 = r0.f4294a
            if (r3 != 0) goto L_0x005e
            int[] r1 = r0.f4301h
            r1 = r1[r2]
            r1 = r1 & r6
            if (r1 == 0) goto L_0x0033
            p.j.b.e$c r1 = r0.f4310q
            if (r1 == 0) goto L_0x005d
            goto L_0x0033
        L_0x005d:
            throw r4
        L_0x005e:
            if (r3 != r5) goto L_0x0033
            int r3 = (int) r8
            int r1 = (int) r1
            android.view.View r1 = r0.mo6002a(r3, r1)
            android.view.View r3 = r0.f4311r
            if (r1 != r3) goto L_0x0033
            r0.mo6019b(r1, r2)
            goto L_0x0033
        L_0x006e:
            float[] r2 = r0.f4297d
            if (r2 == 0) goto L_0x0033
            float[] r2 = r0.f4298e
            if (r2 != 0) goto L_0x0077
            goto L_0x0033
        L_0x0077:
            int r2 = r17.getPointerCount()
            r3 = r6
        L_0x007c:
            if (r3 >= r2) goto L_0x00f9
            int r4 = r1.getPointerId(r3)
            boolean r5 = r0.mo6017b(r4)
            if (r5 != 0) goto L_0x008a
            goto L_0x00f5
        L_0x008a:
            float r5 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f4297d
            r9 = r9[r4]
            float r9 = r5 - r9
            float[] r10 = r0.f4298e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r5 = (int) r5
            int r8 = (int) r8
            android.view.View r5 = r0.mo6002a(r5, r8)
            if (r5 == 0) goto L_0x00ae
            boolean r8 = r0.mo6011a(r5, r9, r10)
            if (r8 == 0) goto L_0x00ae
            r8 = r7
            goto L_0x00af
        L_0x00ae:
            r8 = r6
        L_0x00af:
            if (r8 == 0) goto L_0x00e4
            int r11 = r5.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            p.j.b.e$c r14 = r0.f4310q
            int r12 = r14.mo1690a(r5, r13, r12)
            int r13 = r5.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            p.j.b.e$c r6 = r0.f4310q
            int r6 = r6.mo1695b(r5, r15, r14)
            p.j.b.e$c r14 = r0.f4310q
            int r14 = r14.mo1689a(r5)
            p.j.b.e$c r15 = r0.f4310q
            int r15 = r15.mo1778b(r5)
            if (r14 == 0) goto L_0x00dd
            if (r14 <= 0) goto L_0x00e4
            if (r12 != r11) goto L_0x00e4
        L_0x00dd:
            if (r15 == 0) goto L_0x00f9
            if (r15 <= 0) goto L_0x00e4
            if (r6 != r13) goto L_0x00e4
            goto L_0x00f9
        L_0x00e4:
            r0.mo6005a(r9, r10, r4)
            int r6 = r0.f4294a
            if (r6 != r7) goto L_0x00ec
            goto L_0x00f9
        L_0x00ec:
            if (r8 == 0) goto L_0x00f5
            boolean r4 = r0.mo6019b(r5, r4)
            if (r4 == 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            int r3 = r3 + 1
            r6 = 0
            goto L_0x007c
        L_0x00f9:
            r16.mo6016b(r17)
            goto L_0x0100
        L_0x00fd:
            r16.mo6003a()
        L_0x0100:
            r2 = 0
            goto L_0x0131
        L_0x0102:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r6 = 0
            int r1 = r1.getPointerId(r6)
            r0.mo6015b(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo6002a(r2, r3)
            android.view.View r3 = r0.f4311r
            if (r2 != r3) goto L_0x0123
            int r3 = r0.f4294a
            if (r3 != r5) goto L_0x0123
            r0.mo6019b(r2, r1)
        L_0x0123:
            int[] r2 = r0.f4301h
            r1 = r2[r1]
            r2 = 0
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0131
            p.j.b.e$c r1 = r0.f4310q
            if (r1 == 0) goto L_0x0130
            goto L_0x0131
        L_0x0130:
            throw r4
        L_0x0131:
            int r1 = r0.f4294a
            if (r1 != r7) goto L_0x0137
            r6 = r7
            goto L_0x0138
        L_0x0137:
            r6 = r2
        L_0x0138:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p167j.p169b.C1468e.mo6021c(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final boolean mo6009a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f4301h[i] & i2) != i2 || (0 & i2) == 0 || (this.f4303j[i] & i2) == i2 || (this.f4302i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f4295b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f4310q == null) {
            throw null;
        } else if ((this.f4302i[i] & i2) != 0 || abs <= ((float) this.f4295b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo6017b(int i) {
        if ((this.f4304k & (1 << i)) != 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received ");
        sb.append("for this pointer before ACTION_MOVE. It likely happened because ");
        sb.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        return false;
    }

    /* renamed from: a */
    public final void mo6006a(int i) {
        if (this.f4297d != null) {
            boolean z = true;
            int i2 = 1 << i;
            if ((this.f4304k & i2) == 0) {
                z = false;
            }
            if (z) {
                this.f4297d[i] = 0.0f;
                this.f4298e[i] = 0.0f;
                this.f4299f[i] = 0.0f;
                this.f4300g[i] = 0.0f;
                this.f4301h[i] = 0;
                this.f4302i[i] = 0;
                this.f4303j[i] = 0;
                this.f4304k &= ~i2;
            }
        }
    }

    /* renamed from: b */
    public final void mo6015b(float f, float f2, int i) {
        float[] fArr = this.f4297d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            float[] fArr6 = this.f4297d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f4298e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f4299f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f4300g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f4301h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f4302i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f4303j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f4297d = fArr2;
            this.f4298e = fArr3;
            this.f4299f = fArr4;
            this.f4300g = fArr5;
            this.f4301h = iArr;
            this.f4302i = iArr2;
            this.f4303j = iArr3;
        }
        float[] fArr10 = this.f4297d;
        this.f4299f[i] = f;
        fArr10[i] = f;
        float[] fArr11 = this.f4298e;
        this.f4300g[i] = f2;
        fArr11[i] = f2;
        int[] iArr7 = this.f4301h;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f4313t.getLeft() + this.f4308o) {
            i2 = 1;
        }
        if (i5 < this.f4313t.getTop() + this.f4308o) {
            i2 |= 4;
        }
        if (i4 > this.f4313t.getRight() - this.f4308o) {
            i2 |= 2;
        }
        if (i5 > this.f4313t.getBottom() - this.f4308o) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f4304k |= 1 << i;
    }

    /* renamed from: a */
    public View mo6002a(int i, int i2) {
        int childCount = this.f4313t.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            ViewGroup viewGroup = this.f4313t;
            if (this.f4310q != null) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                    return childAt;
                }
            } else {
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo6010a(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f4311r.getLeft();
        int top = this.f4311r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f4309p.abortAnimation();
            mo6020c(0);
            return false;
        }
        View view = this.f4311r;
        int a = mo6001a(i3, (int) this.f4307n, (int) this.f4306m);
        int a2 = mo6001a(i4, (int) this.f4307n, (int) this.f4306m);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(a);
        int abs4 = Math.abs(a2);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (a != 0) {
            f = (float) abs3;
            f2 = (float) i7;
        } else {
            f = (float) abs;
            f2 = (float) i8;
        }
        float f5 = f / f2;
        if (a2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i7;
        } else {
            f4 = (float) abs2;
            f3 = (float) i8;
        }
        float f6 = f4 / f3;
        int b = mo6013b(i5, a, this.f4310q.mo1689a(view));
        this.f4309p.startScroll(left, top, i5, i6, (int) ((((float) mo6013b(i6, a2, this.f4310q.mo1778b(view))) * f6) + (((float) b) * f5)));
        mo6020c(2);
        return true;
    }

    /* renamed from: a */
    public void mo6007a(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo6003a();
        }
        if (this.f4305l == null) {
            this.f4305l = VelocityTracker.obtain();
        }
        this.f4305l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f4294a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (mo6017b(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.f4297d[pointerId];
                                float f2 = y - this.f4298e[pointerId];
                                mo6005a(f, f2, pointerId);
                                if (this.f4294a != 1) {
                                    View a = mo6002a((int) x, (int) y);
                                    if (mo6011a(a, f, f2) && mo6019b(a, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (mo6017b(this.f4296c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f4296c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f4299f;
                        int i3 = this.f4296c;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.f4300g[i3]);
                        int left = this.f4311r.getLeft() + i4;
                        int top = this.f4311r.getTop() + i5;
                        int left2 = this.f4311r.getLeft();
                        int top2 = this.f4311r.getTop();
                        if (i4 != 0) {
                            left = this.f4310q.mo1690a(this.f4311r, left, i4);
                            C1404o.m3535b(this.f4311r, left - left2);
                        }
                        int i6 = left;
                        if (i5 != 0) {
                            top = this.f4310q.mo1695b(this.f4311r, top, i5);
                            C1404o.m3539c(this.f4311r, top - top2);
                        }
                        int i7 = top;
                        if (!(i4 == 0 && i5 == 0)) {
                            this.f4310q.mo1694a(this.f4311r, i6, i7, i6 - left2, i7 - top2);
                        }
                    } else {
                        return;
                    }
                    mo6016b(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        mo6015b(x3, y3, pointerId2);
                        if (this.f4294a == 0) {
                            mo6019b(mo6002a((int) x3, (int) y3), pointerId2);
                            if ((this.f4301h[pointerId2] & 0) != 0 && this.f4310q == null) {
                                throw null;
                            }
                            return;
                        }
                        int i8 = (int) x3;
                        int i9 = (int) y3;
                        View view = this.f4311r;
                        if (view != null && i8 >= view.getLeft() && i8 < view.getRight() && i9 >= view.getTop() && i9 < view.getBottom()) {
                            i2 = 1;
                        }
                        if (i2 != 0) {
                            mo6019b(this.f4311r, pointerId2);
                            return;
                        }
                        return;
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f4294a == 1 && pointerId3 == this.f4296c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i2);
                                if (pointerId4 != this.f4296c) {
                                    View a2 = mo6002a((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view2 = this.f4311r;
                                    if (a2 == view2 && mo6019b(view2, pointerId4)) {
                                        i = this.f4296c;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                mo6014b();
                            }
                        }
                        mo6006a(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f4294a == 1) {
                    mo6004a(0.0f, 0.0f);
                }
            } else if (this.f4294a == 1) {
                mo6014b();
            }
            mo6003a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View a3 = mo6002a((int) x4, (int) y4);
        mo6015b(x4, y4, pointerId5);
        mo6019b(a3, pointerId5);
        if ((this.f4301h[pointerId5] & 0) != 0 && this.f4310q == null) {
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo6005a(float f, float f2, int i) {
        int i2 = 1;
        if (!mo6009a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (mo6009a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (mo6009a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (mo6009a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f4302i;
            iArr[i] = iArr[i] | i2;
            if (this.f4310q == null) {
                throw null;
            }
        }
    }
}
