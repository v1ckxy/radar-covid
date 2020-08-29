package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import p124p.p126b.C1018a;
import p124p.p126b.C1023f;
import p124p.p126b.p127k.C1065r;
import p124p.p126b.p134p.C1099g;
import p124p.p126b.p134p.p135i.C1129m.C1130a;
import p124p.p126b.p136q.C1142a0;
import p124p.p126b.p136q.C1143a1;
import p124p.p126b.p136q.C1227z;
import p124p.p150h.p162l.C1398i;
import p124p.p150h.p162l.C1399j;
import p124p.p150h.p162l.C1400k;
import p124p.p150h.p162l.C1404o;
import p213q.p214a.p215a.p216a.C1965a;

public class ActionBarOverlayLayout extends ViewGroup implements C1227z, C1398i, C1399j {

    /* renamed from: F */
    public static final int[] f148F = {C1018a.actionBarSize, 16842841};

    /* renamed from: A */
    public ViewPropertyAnimator f149A;

    /* renamed from: B */
    public final AnimatorListenerAdapter f150B;

    /* renamed from: C */
    public final Runnable f151C;

    /* renamed from: D */
    public final Runnable f152D;

    /* renamed from: E */
    public final C1400k f153E;

    /* renamed from: e */
    public int f154e;

    /* renamed from: f */
    public int f155f;

    /* renamed from: g */
    public ContentFrameLayout f156g;

    /* renamed from: h */
    public ActionBarContainer f157h;

    /* renamed from: i */
    public C1142a0 f158i;

    /* renamed from: j */
    public Drawable f159j;

    /* renamed from: k */
    public boolean f160k;

    /* renamed from: l */
    public boolean f161l;

    /* renamed from: m */
    public boolean f162m;

    /* renamed from: n */
    public boolean f163n;

    /* renamed from: o */
    public boolean f164o;

    /* renamed from: p */
    public int f165p;

    /* renamed from: q */
    public int f166q;

    /* renamed from: r */
    public final Rect f167r;

    /* renamed from: s */
    public final Rect f168s;

    /* renamed from: t */
    public final Rect f169t;

    /* renamed from: u */
    public final Rect f170u;

    /* renamed from: v */
    public final Rect f171v;

    /* renamed from: w */
    public final Rect f172w;

    /* renamed from: x */
    public final Rect f173x;

    /* renamed from: y */
    public C0017d f174y;

    /* renamed from: z */
    public OverScroller f175z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0014a extends AnimatorListenerAdapter {
        public C0014a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f149A = null;
            actionBarOverlayLayout.f164o = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f149A = null;
            actionBarOverlayLayout.f164o = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class C0015b implements Runnable {
        public C0015b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo128b();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f149A = actionBarOverlayLayout.f157h.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f150B);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class C0016c implements Runnable {
        public C0016c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo128b();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f149A = actionBarOverlayLayout.f157h.animate().translationY((float) (-ActionBarOverlayLayout.this.f157h.getHeight())).setListener(ActionBarOverlayLayout.this.f150B);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0017d {
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0018e extends MarginLayoutParams {
        public C0018e(int i, int i2) {
            super(i, i2);
        }

        public C0018e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0018e(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f155f = 0;
        this.f167r = new Rect();
        this.f168s = new Rect();
        this.f169t = new Rect();
        this.f170u = new Rect();
        this.f171v = new Rect();
        this.f172w = new Rect();
        this.f173x = new Rect();
        this.f150B = new C0014a();
        this.f151C = new C0015b();
        this.f152D = new C0016c();
        mo119a(context);
        this.f153E = new C1400k();
    }

    /* renamed from: a */
    public void mo118a(int i) {
        mo145i();
        if (i == 2) {
            this.f158i.mo5043m();
        } else if (i == 5) {
            this.f158i.mo5044n();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: a */
    public final void mo119a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f148F);
        boolean z = false;
        this.f154e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f159j = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f160k = z;
        this.f175z = new OverScroller(context);
    }

    /* renamed from: a */
    public void mo120a(Menu menu, C1130a aVar) {
        mo145i();
        this.f158i.mo5023a(menu, aVar);
    }

    /* renamed from: a */
    public void mo121a(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public void mo122a(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            int i6 = this.f165p + i2;
            this.f165p = i6;
            setActionBarHideOffset(i6);
        }
    }

    /* renamed from: a */
    public void mo124a(View view, int i, int i2, int[] iArr, int i3) {
    }

    /* renamed from: a */
    public void mo125a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: a */
    public boolean mo126a() {
        mo145i();
        return this.f158i.mo5026a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo127a(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0018e) r3
            r0 = 1
            if (r5 == 0) goto L_0x0013
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L_0x0013
            r3.leftMargin = r1
            r5 = r0
            goto L_0x0014
        L_0x0013:
            r5 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x001f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L_0x001f
            r3.topMargin = r1
            r5 = r0
        L_0x001f:
            if (r8 == 0) goto L_0x002a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L_0x002a
            r3.rightMargin = r8
            r5 = r0
        L_0x002a:
            if (r7 == 0) goto L_0x0035
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L_0x0035
            r3.bottomMargin = r4
            goto L_0x0036
        L_0x0035:
            r0 = r5
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.mo127a(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: b */
    public void mo128b() {
        removeCallbacks(this.f151C);
        removeCallbacks(this.f152D);
        ViewPropertyAnimator viewPropertyAnimator = this.f149A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: b */
    public boolean mo129b(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: c */
    public void mo130c() {
        mo145i();
        this.f158i.mo5030c();
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0018e;
    }

    /* renamed from: d */
    public boolean mo132d() {
        mo145i();
        return this.f158i.mo5033d();
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f159j != null && !this.f160k) {
            if (this.f157h.getVisibility() == 0) {
                i = (int) (this.f157h.getTranslationY() + ((float) this.f157h.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.f159j.setBounds(0, i, getWidth(), this.f159j.getIntrinsicHeight() + i);
            this.f159j.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo134e() {
        mo145i();
        return this.f158i.mo5034e();
    }

    /* renamed from: f */
    public boolean mo135f() {
        mo145i();
        return this.f158i.mo5035f();
    }

    public boolean fitSystemWindows(Rect rect) {
        mo145i();
        int r = C1404o.m3557r(this) & 256;
        boolean a = mo127a((View) this.f157h, rect, true, true, false, true);
        this.f170u.set(rect);
        C1143a1.m2886a(this, this.f170u, this.f167r);
        if (!this.f171v.equals(this.f170u)) {
            this.f171v.set(this.f170u);
            a = true;
        }
        if (!this.f168s.equals(this.f167r)) {
            this.f168s.set(this.f167r);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo137g() {
        mo145i();
        return this.f158i.mo5036g();
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new C0018e(-1, -1);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0018e(getContext(), attributeSet);
    }

    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0018e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f157h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f153E.mo5895a();
    }

    public CharSequence getTitle() {
        mo145i();
        return this.f158i.getTitle();
    }

    /* renamed from: h */
    public void mo144h() {
        mo145i();
        this.f158i.mo5038h();
    }

    /* renamed from: i */
    public void mo145i() {
        C1142a0 a0Var;
        if (this.f156g == null) {
            this.f156g = (ContentFrameLayout) findViewById(C1023f.action_bar_activity_content);
            this.f157h = (ActionBarContainer) findViewById(C1023f.action_bar_container);
            View findViewById = findViewById(C1023f.action_bar);
            if (findViewById instanceof C1142a0) {
                a0Var = (C1142a0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                a0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder a = C1965a.m4756a("Can't make a decor toolbar out of ");
                a.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(a.toString());
            }
            this.f158i = a0Var;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo119a(getContext());
        C1404o.m3508C(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo128b();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0018e eVar = (C0018e) childAt.getLayoutParams();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        mo145i();
        measureChildWithMargins(this.f157h, i, 0, i2, 0);
        C0018e eVar = (C0018e) this.f157h.getLayoutParams();
        int max = Math.max(0, this.f157h.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f157h.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f157h.getMeasuredState());
        boolean z = (C1404o.m3557r(this) & 256) != 0;
        if (z) {
            i3 = this.f154e;
            if (this.f162m && this.f157h.getTabContainer() != null) {
                i3 += this.f154e;
            }
        } else {
            i3 = this.f157h.getVisibility() != 8 ? this.f157h.getMeasuredHeight() : 0;
        }
        this.f169t.set(this.f167r);
        this.f172w.set(this.f170u);
        Rect rect = (this.f161l || z) ? this.f172w : this.f169t;
        rect.top += i3;
        rect.bottom += 0;
        mo127a((View) this.f156g, this.f169t, true, true, true, true);
        if (!this.f173x.equals(this.f172w)) {
            this.f173x.set(this.f172w);
            this.f156g.mo284a(this.f172w);
        }
        measureChildWithMargins(this.f156g, i, 0, i2, 0);
        C0018e eVar2 = (C0018e) this.f156g.getLayoutParams();
        int max3 = Math.max(max, this.f156g.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f156g.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f156g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.f163n || !z) {
            return false;
        }
        this.f175z.fling(0, 0, 0, (int) f2, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        if (this.f175z.getFinalY() > this.f157h.getHeight()) {
            z2 = true;
        }
        if (z2) {
            mo128b();
            this.f152D.run();
        } else {
            mo128b();
            this.f151C.run();
        }
        this.f164o = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f165p + i2;
        this.f165p = i5;
        setActionBarHideOffset(i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f153E.f4160a = i;
        this.f165p = getActionBarHideOffset();
        mo128b();
        C0017d dVar = this.f174y;
        if (dVar != null) {
            C1065r rVar = (C1065r) dVar;
            C1099g gVar = rVar.f2832u;
            if (gVar != null) {
                gVar.mo4685a();
                rVar.f2832u = null;
            }
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f157h.getVisibility() != 0) {
            return false;
        }
        return this.f163n;
    }

    public void onStopNestedScroll(View view) {
        if (this.f163n && !this.f164o) {
            if (this.f165p <= this.f157h.getHeight()) {
                mo128b();
                postDelayed(this.f151C, 600);
            } else {
                mo128b();
                postDelayed(this.f152D, 600);
            }
        }
        C0017d dVar = this.f174y;
        if (dVar != null && ((C1065r) dVar) == null) {
            throw null;
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        mo145i();
        int i2 = this.f166q ^ i;
        this.f166q = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        C0017d dVar = this.f174y;
        if (dVar != null) {
            ((C1065r) dVar).f2827p = !z2;
            if (z || !z2) {
                C1065r rVar = (C1065r) this.f174y;
                if (rVar.f2829r) {
                    rVar.f2829r = false;
                    rVar.mo4539f(true);
                }
            } else {
                C1065r rVar2 = (C1065r) dVar;
                if (!rVar2.f2829r) {
                    rVar2.f2829r = true;
                    rVar2.mo4539f(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.f174y != null) {
            C1404o.m3508C(this);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f155f = i;
        C0017d dVar = this.f174y;
        if (dVar != null) {
            ((C1065r) dVar).f2826o = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        mo128b();
        this.f157h.setTranslationY((float) (-Math.max(0, Math.min(i, this.f157h.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0017d dVar) {
        this.f174y = dVar;
        if (getWindowToken() != null) {
            ((C1065r) this.f174y).f2826o = this.f155f;
            int i = this.f166q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C1404o.m3508C(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f162m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f163n) {
            this.f163n = z;
            if (!z) {
                mo128b();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo145i();
        this.f158i.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        mo145i();
        this.f158i.setIcon(drawable);
    }

    public void setLogo(int i) {
        mo145i();
        this.f158i.mo5031c(i);
    }

    public void setOverlayMode(boolean z) {
        this.f161l = z;
        this.f160k = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Callback callback) {
        mo145i();
        this.f158i.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo145i();
        this.f158i.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: a */
    public void mo123a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            int i6 = this.f165p + i2;
            this.f165p = i6;
            setActionBarHideOffset(i6);
        }
    }
}
