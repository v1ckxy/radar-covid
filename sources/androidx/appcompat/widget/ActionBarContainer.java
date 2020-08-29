package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import p124p.p126b.C1023f;
import p124p.p126b.C1027j;
import p124p.p126b.p136q.C1144b;
import p124p.p126b.p136q.C1197n0;
import p124p.p150h.p162l.C1404o;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: e */
    public boolean f126e;

    /* renamed from: f */
    public View f127f;

    /* renamed from: g */
    public View f128g;

    /* renamed from: h */
    public View f129h;

    /* renamed from: i */
    public Drawable f130i;

    /* renamed from: j */
    public Drawable f131j;

    /* renamed from: k */
    public Drawable f132k;

    /* renamed from: l */
    public boolean f133l;

    /* renamed from: m */
    public boolean f134m;

    /* renamed from: n */
    public int f135n;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1404o.m3522a((View) this, (Drawable) new C1144b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1027j.ActionBar);
        this.f130i = obtainStyledAttributes.getDrawable(C1027j.ActionBar_background);
        this.f131j = obtainStyledAttributes.getDrawable(C1027j.ActionBar_backgroundStacked);
        this.f135n = obtainStyledAttributes.getDimensionPixelSize(C1027j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == C1023f.split_action_bar) {
            this.f133l = true;
            this.f132k = obtainStyledAttributes.getDrawable(C1027j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f133l ? !(this.f130i == null && this.f131j == null) : this.f132k != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    public final int mo77a(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean mo78b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f130i;
        if (drawable != null && drawable.isStateful()) {
            this.f130i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f131j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f131j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f132k;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f132k.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f127f;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f130i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f131j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f132k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f128g = findViewById(C1023f.action_bar);
        this.f129h = findViewById(C1023f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f126e || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f127f
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f133l
            if (r6 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r5 = r4.f132k
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00b6
        L_0x0048:
            r9 = r0
            goto L_0x00b6
        L_0x004a:
            android.graphics.drawable.Drawable r6 = r4.f130i
            if (r6 == 0) goto L_0x009b
            android.view.View r6 = r4.f128g
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0074
            android.graphics.drawable.Drawable r6 = r4.f130i
            android.view.View r7 = r4.f128g
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f128g
            int r8 = r8.getTop()
            android.view.View r0 = r4.f128g
            int r0 = r0.getRight()
            android.view.View r2 = r4.f128g
        L_0x006c:
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x009a
        L_0x0074:
            android.view.View r6 = r4.f129h
            if (r6 == 0) goto L_0x0095
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0095
            android.graphics.drawable.Drawable r6 = r4.f130i
            android.view.View r7 = r4.f129h
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f129h
            int r8 = r8.getTop()
            android.view.View r0 = r4.f129h
            int r0 = r0.getRight()
            android.view.View r2 = r4.f129h
            goto L_0x006c
        L_0x0095:
            android.graphics.drawable.Drawable r6 = r4.f130i
            r6.setBounds(r0, r0, r0, r0)
        L_0x009a:
            r0 = r9
        L_0x009b:
            r4.f134m = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f131j
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00b6:
            if (r9 == 0) goto L_0x00bb
            r4.invalidate()
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f128g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f135n
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f128g
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f127f
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f128g
            boolean r0 = r3.mo78b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f128g
        L_0x0042:
            int r0 = r3.mo77a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f129h
            boolean r0 = r3.mo78b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f129h
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f127f
            int r1 = r3.mo77a(r1)
            int r1 = r1 + r0
            int r4 = java.lang.Math.min(r1, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f130i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f130i);
        }
        this.f130i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f128g;
            if (view != null) {
                this.f130i.setBounds(view.getLeft(), this.f128g.getTop(), this.f128g.getRight(), this.f128g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f133l ? !(this.f130i == null && this.f131j == null) : this.f132k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2 = this.f132k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f132k);
        }
        this.f132k = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f133l) {
                Drawable drawable3 = this.f132k;
                if (drawable3 != null) {
                    drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                }
            }
        }
        if (!this.f133l ? this.f130i == null && this.f131j == null : this.f132k == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f131j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f131j);
        }
        this.f131j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f134m) {
                Drawable drawable3 = this.f131j;
                if (drawable3 != null) {
                    drawable3.setBounds(this.f127f.getLeft(), this.f127f.getTop(), this.f127f.getRight(), this.f127f.getBottom());
                }
            }
        }
        boolean z = true;
        if (!this.f133l ? !(this.f130i == null && this.f131j == null) : this.f132k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(C1197n0 n0Var) {
        View view = this.f127f;
        if (view != null) {
            removeView(view);
        }
        this.f127f = n0Var;
        if (n0Var != null) {
            addView(n0Var);
            ViewGroup.LayoutParams layoutParams = n0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            n0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f126e = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f130i;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f131j;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f132k;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f130i && !this.f133l) || (drawable == this.f131j && this.f134m) || ((drawable == this.f132k && this.f133l) || super.verifyDrawable(drawable));
    }
}
