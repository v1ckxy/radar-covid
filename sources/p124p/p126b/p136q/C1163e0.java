package p124p.p126b.p136q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p124p.p126b.p134p.p135i.C1134p;

/* renamed from: p.b.q.e0 */
public abstract class C1163e0 implements OnTouchListener, OnAttachStateChangeListener {

    /* renamed from: e */
    public final float f3250e;

    /* renamed from: f */
    public final int f3251f;

    /* renamed from: g */
    public final int f3252g;

    /* renamed from: h */
    public final View f3253h;

    /* renamed from: i */
    public Runnable f3254i;

    /* renamed from: j */
    public Runnable f3255j;

    /* renamed from: k */
    public boolean f3256k;

    /* renamed from: l */
    public int f3257l;

    /* renamed from: m */
    public final int[] f3258m = new int[2];

    /* renamed from: p.b.q.e0$a */
    public class C1164a implements Runnable {
        public C1164a() {
        }

        public void run() {
            ViewParent parent = C1163e0.this.f3253h.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: p.b.q.e0$b */
    public class C1165b implements Runnable {
        public C1165b() {
        }

        public void run() {
            C1163e0 e0Var = C1163e0.this;
            e0Var.mo5102a();
            View view = e0Var.f3253h;
            if (view.isEnabled() && !view.isLongClickable() && e0Var.mo60c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                e0Var.f3256k = true;
            }
        }
    }

    public C1163e0(View view) {
        this.f3253h = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3250e = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3251f = tapTimeout;
        this.f3252g = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void mo5102a() {
        Runnable runnable = this.f3255j;
        if (runnable != null) {
            this.f3253h.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f3254i;
        if (runnable2 != null) {
            this.f3253h.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract C1134p mo59b();

    /* renamed from: c */
    public abstract boolean mo60c();

    /* renamed from: d */
    public boolean mo5063d() {
        C1134p b = mo59b();
        if (b != null && b.mo4766a()) {
            b.dismiss();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r4 != 3) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r12 = r11.f3256k
            r0 = 3
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L_0x0071
            android.view.View r3 = r11.f3253h
            p.b.p.i.p r4 = r11.mo59b()
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.mo4766a()
            if (r5 != 0) goto L_0x0016
            goto L_0x0061
        L_0x0016:
            android.widget.ListView r4 = r4.mo4774e()
            p.b.q.c0 r4 = (p124p.p126b.p136q.C1157c0) r4
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0025
            goto L_0x0061
        L_0x0025:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r13)
            int[] r6 = r11.f3258m
            r3.getLocationOnScreen(r6)
            r3 = r6[r2]
            float r3 = (float) r3
            r6 = r6[r1]
            float r6 = (float) r6
            r5.offsetLocation(r3, r6)
            int[] r3 = r11.f3258m
            r4.getLocationOnScreen(r3)
            r6 = r3[r2]
            int r6 = -r6
            float r6 = (float) r6
            r3 = r3[r1]
            int r3 = -r3
            float r3 = (float) r3
            r5.offsetLocation(r6, r3)
            int r3 = r11.f3257l
            boolean r3 = r4.mo5070a(r5, r3)
            r5.recycle()
            int r13 = r13.getActionMasked()
            if (r13 == r1) goto L_0x005a
            if (r13 == r0) goto L_0x005a
            r13 = r1
            goto L_0x005b
        L_0x005a:
            r13 = r2
        L_0x005b:
            if (r3 == 0) goto L_0x0061
            if (r13 == 0) goto L_0x0061
            r13 = r1
            goto L_0x0062
        L_0x0061:
            r13 = r2
        L_0x0062:
            if (r13 != 0) goto L_0x006e
            boolean r13 = r11.mo5063d()
            if (r13 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r13 = r2
            goto L_0x0128
        L_0x006e:
            r13 = r1
            goto L_0x0128
        L_0x0071:
            android.view.View r3 = r11.f3253h
            boolean r4 = r3.isEnabled()
            if (r4 != 0) goto L_0x007c
        L_0x0079:
            r13 = r2
            goto L_0x0106
        L_0x007c:
            int r4 = r13.getActionMasked()
            if (r4 == 0) goto L_0x00d8
            if (r4 == r1) goto L_0x00d4
            r5 = 2
            if (r4 == r5) goto L_0x008a
            if (r4 == r0) goto L_0x00d4
            goto L_0x0079
        L_0x008a:
            int r0 = r11.f3257l
            int r0 = r13.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0079
            float r4 = r13.getX(r0)
            float r13 = r13.getY(r0)
            float r0 = r11.f3250e
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00c5
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00c5
            int r5 = r3.getRight()
            int r6 = r3.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c5
            int r4 = r3.getBottom()
            int r5 = r3.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x00c5
            r13 = r1
            goto L_0x00c6
        L_0x00c5:
            r13 = r2
        L_0x00c6:
            if (r13 != 0) goto L_0x0079
            r11.mo5102a()
            android.view.ViewParent r13 = r3.getParent()
            r13.requestDisallowInterceptTouchEvent(r1)
            r13 = r1
            goto L_0x0106
        L_0x00d4:
            r11.mo5102a()
            goto L_0x0079
        L_0x00d8:
            int r13 = r13.getPointerId(r2)
            r11.f3257l = r13
            java.lang.Runnable r13 = r11.f3254i
            if (r13 != 0) goto L_0x00e9
            p.b.q.e0$a r13 = new p.b.q.e0$a
            r13.<init>()
            r11.f3254i = r13
        L_0x00e9:
            java.lang.Runnable r13 = r11.f3254i
            int r0 = r11.f3251f
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            java.lang.Runnable r13 = r11.f3255j
            if (r13 != 0) goto L_0x00fc
            p.b.q.e0$b r13 = new p.b.q.e0$b
            r13.<init>()
            r11.f3255j = r13
        L_0x00fc:
            java.lang.Runnable r13 = r11.f3255j
            int r0 = r11.f3252g
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            goto L_0x0079
        L_0x0106:
            if (r13 == 0) goto L_0x0110
            boolean r13 = r11.mo60c()
            if (r13 == 0) goto L_0x0110
            r13 = r1
            goto L_0x0111
        L_0x0110:
            r13 = r2
        L_0x0111:
            if (r13 == 0) goto L_0x0128
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            android.view.View r3 = r11.f3253h
            r3.onTouchEvent(r0)
            r0.recycle()
        L_0x0128:
            r11.f3256k = r13
            if (r13 != 0) goto L_0x0130
            if (r12 == 0) goto L_0x012f
            goto L_0x0130
        L_0x012f:
            r1 = r2
        L_0x0130:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1163e0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f3256k = false;
        this.f3257l = -1;
        Runnable runnable = this.f3254i;
        if (runnable != null) {
            this.f3253h.removeCallbacks(runnable);
        }
    }
}
