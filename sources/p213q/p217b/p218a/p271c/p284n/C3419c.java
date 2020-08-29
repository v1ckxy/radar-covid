package p213q.p217b.p218a.p271c.p284n;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.BaseBehavior;
import p124p.p150h.p162l.C1404o;

/* renamed from: q.b.a.c.n.c */
public abstract class C3419c<V extends View> extends C3422e<V> {

    /* renamed from: d */
    public Runnable f8599d;

    /* renamed from: e */
    public OverScroller f8600e;

    /* renamed from: f */
    public boolean f8601f;

    /* renamed from: g */
    public int f8602g = -1;

    /* renamed from: h */
    public int f8603h;

    /* renamed from: i */
    public int f8604i = -1;

    /* renamed from: j */
    public VelocityTracker f8605j;

    /* renamed from: q.b.a.c.n.c$a */
    public class C3420a implements Runnable {

        /* renamed from: e */
        public final CoordinatorLayout f8606e;

        /* renamed from: f */
        public final V f8607f;

        public C3420a(CoordinatorLayout coordinatorLayout, V v) {
            this.f8606e = coordinatorLayout;
            this.f8607f = v;
        }

        public void run() {
            if (this.f8607f != null) {
                OverScroller overScroller = C3419c.this.f8600e;
                if (overScroller == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    C3419c cVar = C3419c.this;
                    cVar.mo9203c(this.f8606e, this.f8607f, cVar.f8600e.getCurrY());
                    C1404o.m3523a((View) this.f8607f, (Runnable) this);
                    return;
                }
                C3419c cVar2 = C3419c.this;
                CoordinatorLayout coordinatorLayout = this.f8606e;
                V v = this.f8607f;
                BaseBehavior baseBehavior = (BaseBehavior) cVar2;
                if (baseBehavior != null) {
                    AppBarLayout appBarLayout = (AppBarLayout) v;
                    baseBehavior.mo1674a(coordinatorLayout, appBarLayout);
                    if (appBarLayout.f1145m) {
                        appBarLayout.mo1640a(appBarLayout.mo1639a(baseBehavior.mo1673a(coordinatorLayout)));
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public C3419c() {
    }

    public C3419c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final int mo9202a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo1678b(coordinatorLayout, v, mo1679c() - i, i2, i3);
    }

    /* renamed from: a */
    public abstract boolean mo1677a(V v);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x008a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo662a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f8604i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f8604i = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.f8601f
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x0060
            r5 = -1
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x0051
            goto L_0x008a
        L_0x002f:
            int r6 = r4.f8602g
            if (r6 != r5) goto L_0x0034
            goto L_0x008a
        L_0x0034:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L_0x003b
            goto L_0x008a
        L_0x003b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f8603h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f8604i
            if (r6 <= r0) goto L_0x008a
            r4.f8601f = r2
            r4.f8603h = r5
            goto L_0x008a
        L_0x0051:
            r4.f8601f = r3
            r4.f8602g = r5
            android.view.VelocityTracker r5 = r4.f8605j
            if (r5 == 0) goto L_0x008a
            r5.recycle()
            r5 = 0
            r4.f8605j = r5
            goto L_0x008a
        L_0x0060:
            r4.f8601f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.mo1677a(r6)
            if (r2 == 0) goto L_0x008a
            boolean r5 = r5.mo603a(r6, r0, r1)
            if (r5 == 0) goto L_0x008a
            r4.f8603h = r1
            int r5 = r7.getPointerId(r3)
            r4.f8602g = r5
            android.view.VelocityTracker r5 = r4.f8605j
            if (r5 != 0) goto L_0x008a
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r4.f8605j = r5
        L_0x008a:
            android.view.VelocityTracker r5 = r4.f8605j
            if (r5 == 0) goto L_0x0091
            r5.addMovement(r7)
        L_0x0091:
            boolean r5 = r4.f8601f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p271c.p284n.C3419c.mo662a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public abstract int mo1678b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r0 != 3) goto L_0x0117;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo667b(androidx.coordinatorlayout.widget.CoordinatorLayout r21, V r22, android.view.MotionEvent r23) {
        /*
            r20 = this;
            r6 = r20
            r1 = r21
            r2 = r22
            r7 = r23
            int r0 = r6.f8604i
            if (r0 >= 0) goto L_0x001a
            android.content.Context r0 = r21.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.f8604i = r0
        L_0x001a:
            int r0 = r23.getActionMasked()
            r8 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00ef
            r4 = 0
            r5 = -1
            if (r0 == r8) goto L_0x006c
            r9 = 2
            if (r0 == r9) goto L_0x002e
            r1 = 3
            if (r0 == r1) goto L_0x00e1
            goto L_0x0117
        L_0x002e:
            int r0 = r6.f8602g
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r5) goto L_0x0037
            return r3
        L_0x0037:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r3 = r6.f8603h
            int r3 = r3 - r0
            boolean r4 = r6.f8601f
            if (r4 != 0) goto L_0x0052
            int r4 = java.lang.Math.abs(r3)
            int r5 = r6.f8604i
            if (r4 <= r5) goto L_0x0052
            r6.f8601f = r8
            if (r3 <= 0) goto L_0x0051
            int r3 = r3 - r5
            goto L_0x0052
        L_0x0051:
            int r3 = r3 + r5
        L_0x0052:
            boolean r4 = r6.f8601f
            if (r4 == 0) goto L_0x0117
            r6.f8603h = r0
            r0 = r2
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r0 = r0.getDownNestedScrollRange()
            int r4 = -r0
            r5 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r0.mo9202a(r1, r2, r3, r4, r5)
            goto L_0x0117
        L_0x006c:
            android.view.VelocityTracker r0 = r6.f8605j
            if (r0 == 0) goto L_0x00e1
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f8605j
            r9 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r9)
            android.view.VelocityTracker r0 = r6.f8605j
            int r9 = r6.f8602g
            float r0 = r0.getYVelocity(r9)
            r9 = r2
            com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
            int r10 = r9.getTotalScrollRange()
            int r10 = -r10
            r19 = 0
            java.lang.Runnable r11 = r6.f8599d
            if (r11 == 0) goto L_0x0095
            r2.removeCallbacks(r11)
            r6.f8599d = r4
        L_0x0095:
            android.widget.OverScroller r11 = r6.f8600e
            if (r11 != 0) goto L_0x00a4
            android.widget.OverScroller r11 = new android.widget.OverScroller
            android.content.Context r12 = r22.getContext()
            r11.<init>(r12)
            r6.f8600e = r11
        L_0x00a4:
            android.widget.OverScroller r11 = r6.f8600e
            r12 = 0
            int r13 = r20.mo9208b()
            r14 = 0
            int r15 = java.lang.Math.round(r0)
            r16 = 0
            r17 = 0
            r18 = r10
            r11.fling(r12, r13, r14, r15, r16, r17, r18, r19)
            android.widget.OverScroller r0 = r6.f8600e
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00cc
            q.b.a.c.n.c$a r0 = new q.b.a.c.n.c$a
            r0.<init>(r1, r2)
            r6.f8599d = r0
            p124p.p150h.p162l.C1404o.m3523a(r2, r0)
            goto L_0x00e1
        L_0x00cc:
            r0 = r6
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            r0.mo1674a(r1, r9)
            boolean r2 = r9.f1145m
            if (r2 == 0) goto L_0x00e1
            android.view.View r0 = r0.mo1673a(r1)
            boolean r0 = r9.mo1639a(r0)
            r9.mo1640a(r0)
        L_0x00e1:
            r6.f8601f = r3
            r6.f8602g = r5
            android.view.VelocityTracker r0 = r6.f8605j
            if (r0 == 0) goto L_0x0117
            r0.recycle()
            r6.f8605j = r4
            goto L_0x0117
        L_0x00ef:
            float r0 = r23.getX()
            int r0 = (int) r0
            float r4 = r23.getY()
            int r4 = (int) r4
            boolean r0 = r1.mo603a(r2, r0, r4)
            if (r0 == 0) goto L_0x011f
            boolean r0 = r6.mo1677a(r2)
            if (r0 == 0) goto L_0x011f
            r6.f8603h = r4
            int r0 = r7.getPointerId(r3)
            r6.f8602g = r0
            android.view.VelocityTracker r0 = r6.f8605j
            if (r0 != 0) goto L_0x0117
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f8605j = r0
        L_0x0117:
            android.view.VelocityTracker r0 = r6.f8605j
            if (r0 == 0) goto L_0x011e
            r0.addMovement(r7)
        L_0x011e:
            return r8
        L_0x011f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p271c.p284n.C3419c.mo667b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: c */
    public abstract int mo1679c();

    /* renamed from: c */
    public int mo9203c(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo1678b(coordinatorLayout, v, i, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
    }
}
