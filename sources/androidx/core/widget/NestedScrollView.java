package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import androidx.recyclerview.widget.RecyclerView;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1032b;
import p124p.p150h.p162l.C1387a;
import p124p.p150h.p162l.C1395f;
import p124p.p150h.p162l.C1397h;
import p124p.p150h.p162l.C1399j;
import p124p.p150h.p162l.C1400k;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.p163y.C1429b;
import p124p.p150h.p162l.p163y.C1429b.C1430a;
import p213q.p214a.p215a.p216a.C1965a;

public class NestedScrollView extends FrameLayout implements C1399j, C1395f {

    /* renamed from: E */
    public static final C0077a f554E = new C0077a();

    /* renamed from: F */
    public static final int[] f555F = {16843130};

    /* renamed from: A */
    public final C1400k f556A;

    /* renamed from: B */
    public final C1397h f557B;

    /* renamed from: C */
    public float f558C;

    /* renamed from: D */
    public C0078b f559D;

    /* renamed from: e */
    public long f560e;

    /* renamed from: f */
    public final Rect f561f;

    /* renamed from: g */
    public OverScroller f562g;

    /* renamed from: h */
    public EdgeEffect f563h;

    /* renamed from: i */
    public EdgeEffect f564i;

    /* renamed from: j */
    public int f565j;

    /* renamed from: k */
    public boolean f566k;

    /* renamed from: l */
    public boolean f567l;

    /* renamed from: m */
    public View f568m;

    /* renamed from: n */
    public boolean f569n;

    /* renamed from: o */
    public VelocityTracker f570o;

    /* renamed from: p */
    public boolean f571p;

    /* renamed from: q */
    public boolean f572q;

    /* renamed from: r */
    public int f573r;

    /* renamed from: s */
    public int f574s;

    /* renamed from: t */
    public int f575t;

    /* renamed from: u */
    public int f576u;

    /* renamed from: v */
    public final int[] f577v;

    /* renamed from: w */
    public final int[] f578w;

    /* renamed from: x */
    public int f579x;

    /* renamed from: y */
    public int f580y;

    /* renamed from: z */
    public C0079c f581z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0077a extends C1387a {
        /* renamed from: a */
        public void mo768a(View view, C1429b bVar) {
            this.f4146a.onInitializeAccessibilityNodeInfo(view, bVar.f4203a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.f4203a.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    bVar.f4203a.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        bVar.mo5947a(C1430a.f4208g);
                        bVar.mo5947a(C1430a.f4212k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        bVar.mo5947a(C1430a.f4207f);
                        bVar.mo5947a(C1430a.f4213l);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo770b(View view, AccessibilityEvent accessibilityEvent) {
            this.f4146a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        /* renamed from: a */
        public boolean mo769a(View view, int i, Bundle bundle) {
            int min;
            if (super.mo769a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo692a(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo692a(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C0078b {
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public static class C0079c extends BaseSavedState {
        public static final Creator<C0079c> CREATOR = new C0080a();

        /* renamed from: e */
        public int f582e;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        public class C0080a implements Creator<C0079c> {
            public Object createFromParcel(Parcel parcel) {
                return new C0079c(parcel);
            }

            public Object[] newArray(int i) {
                return new C0079c[i];
            }
        }

        public C0079c(Parcel parcel) {
            super(parcel);
            this.f582e = parcel.readInt();
        }

        public C0079c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("HorizontalScrollView.SavedState{");
            a.append(Integer.toHexString(System.identityHashCode(this)));
            a.append(" scrollPosition=");
            return C1965a.m4753a(a, this.f582e, Objects.ARRAY_END);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f582e);
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f561f = new Rect();
        this.f566k = true;
        this.f567l = false;
        this.f568m = null;
        this.f569n = false;
        this.f572q = true;
        this.f576u = -1;
        this.f577v = new int[2];
        this.f578w = new int[2];
        this.f562g = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f573r = viewConfiguration.getScaledTouchSlop();
        this.f574s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f575t = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f555F, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f556A = new C1400k();
        this.f557B = new C1397h(this);
        setNestedScrollingEnabled(true);
        C1404o.m3526a((View) this, (C1387a) f554E);
    }

    /* renamed from: a */
    public static boolean m230a(View view, View view2) {
        boolean z = true;
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m230a((View) parent, view2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public static int m231b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f558C == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f558C = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f558C;
    }

    /* renamed from: a */
    public int mo690a(Rect rect) {
        int i = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        if (rect.bottom > i3 && rect.top > scrollY) {
            i = Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        } else if (rect.top < scrollY && rect.bottom < i3) {
            i = Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
        return i;
    }

    /* renamed from: a */
    public final void mo691a() {
        this.f562g.abortAnimation();
        this.f557B.mo5894c(1);
    }

    /* renamed from: a */
    public final void mo692a(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f560e > 250) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.f562g.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
                mo696a(z);
            } else {
                if (!this.f562g.isFinished()) {
                    mo691a();
                }
                scrollBy(i, i2);
            }
            this.f560e = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo693a(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f557B.mo5886a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: a */
    public final void mo694a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f576u) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f565j = (int) motionEvent.getY(i);
            this.f576u = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f570o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    public final void mo695a(View view) {
        view.getDrawingRect(this.f561f);
        offsetDescendantRectToMyCoords(view, this.f561f);
        int a = mo690a(this.f561f);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: a */
    public void mo122a(View view, int i, int i2, int i3, int i4, int i5) {
        mo693a(i4, i5, (int[]) null);
    }

    /* renamed from: a */
    public void mo123a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo693a(i4, i5, iArr);
    }

    /* renamed from: a */
    public void mo124a(View view, int i, int i2, int[] iArr, int i3) {
        mo701a(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: a */
    public boolean mo698a(int i, int i2) {
        return this.f557B.mo5889a(i, i2);
    }

    /* renamed from: a */
    public boolean mo701a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f557B.mo5891a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public final boolean mo703a(View view, int i, int i2) {
        view.getDrawingRect(this.f561f);
        offsetDescendantRectToMyCoords(view, this.f561f);
        return this.f561f.bottom + i >= getScrollY() && this.f561f.top - i <= getScrollY() + i2;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public final void mo709b(int i) {
        if (i == 0) {
            return;
        }
        if (this.f572q) {
            mo692a(0, i, 250, false);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: b */
    public boolean mo129b(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: c */
    public final void mo710c() {
        if (getOverScrollMode() == 2) {
            this.f563h = null;
            this.f564i = null;
        } else if (this.f563h == null) {
            Context context = getContext();
            this.f563h = new EdgeEffect(context);
            this.f564i = new EdgeEffect(context);
        }
    }

    /* renamed from: c */
    public void mo711c(int i) {
        if (getChildCount() > 0) {
            this.f562g.fling(getScrollX(), getScrollY(), 0, i, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0, 0);
            mo696a(true);
        }
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f562g.isFinished()) {
            this.f562g.computeScrollOffset();
            int currY = this.f562g.getCurrY();
            int i = currY - this.f580y;
            this.f580y = currY;
            int[] iArr = this.f578w;
            boolean z = false;
            iArr[1] = 0;
            mo701a(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f578w[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo700a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f578w;
                iArr2[1] = 0;
                this.f557B.mo5893b(0, scrollY2, 0, i3, this.f577v, 1, iArr2);
                i2 = i3 - this.f578w[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    mo710c();
                    if (i2 < 0) {
                        if (this.f563h.isFinished()) {
                            edgeEffect = this.f563h;
                        }
                    } else if (this.f564i.isFinished()) {
                        edgeEffect = this.f564i;
                    }
                    edgeEffect.onAbsorb((int) this.f562g.getCurrVelocity());
                }
                mo691a();
            }
            if (!this.f562g.isFinished()) {
                C1404o.m3507B(this);
            } else {
                this.f557B.mo5894c(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    /* renamed from: d */
    public final void mo719d() {
        VelocityTracker velocityTracker = this.f570o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f570o = null;
        }
    }

    /* renamed from: d */
    public boolean mo720d(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f561f;
        rect.top = 0;
        rect.bottom = height;
        if (z) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                this.f561f.bottom = getPaddingBottom() + childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
                Rect rect2 = this.f561f;
                rect2.top = rect2.bottom - height;
            }
        }
        Rect rect3 = this.f561f;
        return mo699a(i, rect3.top, rect3.bottom);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo702a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f557B.mo5888a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f557B.mo5887a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo701a(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f557B.mo5890a(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f563h != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f563h.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f563h.setSize(width, height);
                if (this.f563h.draw(canvas)) {
                    C1404o.m3507B(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f564i.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (getClipToPadding()) {
                    width2 -= getPaddingRight() + getPaddingLeft();
                    i2 = 0 + getPaddingLeft();
                }
                if (getClipToPadding()) {
                    height2 -= getPaddingBottom() + getPaddingTop();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f564i.setSize(width2, height2);
                if (this.f564i.draw(canvas)) {
                    C1404o.m3507B(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo727e(int i) {
        return this.f557B.mo5885a(i) != null;
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f556A.mo5895a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return mo727e(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f557B.f4158d;
    }

    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f567l = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f569n) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r11.f569n
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L_0x00ac
            r4 = -1
            if (r0 == r2) goto L_0x0085
            if (r0 == r1) goto L_0x0024
            r1 = 3
            if (r0 == r1) goto L_0x0085
            r1 = 6
            if (r0 == r1) goto L_0x001f
            goto L_0x0115
        L_0x001f:
            r11.mo694a(r12)
            goto L_0x0115
        L_0x0024:
            int r0 = r11.f576u
            if (r0 != r4) goto L_0x002a
            goto L_0x0115
        L_0x002a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L_0x004d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto L_0x0115
        L_0x004d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.f565j
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.f573r
            if (r4 <= r5) goto L_0x0115
            int r4 = r11.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto L_0x0115
            r11.f569n = r2
            r11.f565j = r0
            android.view.VelocityTracker r0 = r11.f570o
            if (r0 != 0) goto L_0x0073
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f570o = r0
        L_0x0073:
            android.view.VelocityTracker r0 = r11.f570o
            r0.addMovement(r12)
            r11.f579x = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto L_0x0115
            r12.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0115
        L_0x0085:
            r11.f569n = r3
            r11.f576u = r4
            r11.mo719d()
            android.widget.OverScroller r4 = r11.f562g
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x00a6
            p124p.p150h.p162l.C1404o.m3507B(r11)
        L_0x00a6:
            p.h.l.h r12 = r11.f557B
            r12.mo5894c(r3)
            goto L_0x0115
        L_0x00ac:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            int r5 = r11.getChildCount()
            if (r5 <= 0) goto L_0x00e0
            int r5 = r11.getScrollY()
            android.view.View r6 = r11.getChildAt(r3)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L_0x00e0
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L_0x00e0
            int r5 = r6.getLeft()
            if (r4 < r5) goto L_0x00e0
            int r5 = r6.getRight()
            if (r4 >= r5) goto L_0x00e0
            r4 = r2
            goto L_0x00e1
        L_0x00e0:
            r4 = r3
        L_0x00e1:
            if (r4 != 0) goto L_0x00e9
            r11.f569n = r3
            r11.mo719d()
            goto L_0x0115
        L_0x00e9:
            r11.f565j = r0
            int r0 = r12.getPointerId(r3)
            r11.f576u = r0
            android.view.VelocityTracker r0 = r11.f570o
            if (r0 != 0) goto L_0x00fc
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f570o = r0
            goto L_0x00ff
        L_0x00fc:
            r0.clear()
        L_0x00ff:
            android.view.VelocityTracker r0 = r11.f570o
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.f562g
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.f562g
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r2
            r11.f569n = r12
            r11.mo698a(r1, r3)
        L_0x0115:
            boolean r12 = r11.f569n
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f566k = false;
        View view = this.f568m;
        if (view != null && m230a(view, (View) this)) {
            mo695a(this.f568m);
        }
        this.f568m = null;
        if (!this.f567l) {
            if (this.f581z != null) {
                scrollTo(getScrollX(), this.f581z.f582e);
                this.f581z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int b = m231b(scrollY, paddingTop, i5);
            if (b != scrollY) {
                scrollTo(getScrollX(), b);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f567l = true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f571p && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo711c((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return this.f557B.mo5887a(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo701a(i, i2, iArr, (int[]) null, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo693a(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f556A.f4160a = i;
        mo698a(2, 0);
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, null, i) : instance.findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !(true ^ mo703a(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0079c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0079c cVar = (C0079c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f581z = cVar;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0079c cVar = new C0079c(super.onSaveInstanceState());
        cVar.f582e = getScrollY();
        return cVar;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0078b bVar = this.f559D;
        if (bVar != null) {
            C1032b bVar2 = (C1032b) bVar;
            AlertController.m12a(this, bVar2.f2678a, bVar2.f2679b);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && mo703a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f561f);
            offsetDescendantRectToMyCoords(findFocus, this.f561f);
            mo709b(mo690a(this.f561f));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f556A.f4160a = 0;
        this.f557B.mo5894c(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r9.f562g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0205, code lost:
        if (r9.f562g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0207;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            r22 = this;
            r9 = r22
            r10 = r23
            android.view.VelocityTracker r0 = r9.f570o
            if (r0 != 0) goto L_0x000e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.f570o = r0
        L_0x000e:
            int r0 = r23.getActionMasked()
            r11 = 0
            if (r0 != 0) goto L_0x0017
            r9.f579x = r11
        L_0x0017:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r23)
            int r1 = r9.f579x
            float r1 = (float) r1
            r2 = 0
            r12.offsetLocation(r2, r1)
            r1 = 2
            r13 = 1
            if (r0 == 0) goto L_0x0210
            r3 = -1
            if (r0 == r13) goto L_0x01c5
            if (r0 == r1) goto L_0x0081
            r1 = 3
            if (r0 == r1) goto L_0x005b
            r1 = 5
            if (r0 == r1) goto L_0x0048
            r1 = 6
            if (r0 == r1) goto L_0x0036
            goto L_0x0246
        L_0x0036:
            r22.mo694a(r23)
            int r0 = r9.f576u
            int r0 = r10.findPointerIndex(r0)
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            r9.f565j = r0
            goto L_0x0246
        L_0x0048:
            int r0 = r23.getActionIndex()
            float r1 = r10.getY(r0)
            int r1 = (int) r1
            r9.f565j = r1
            int r0 = r10.getPointerId(r0)
            r9.f576u = r0
            goto L_0x0246
        L_0x005b:
            boolean r0 = r9.f569n
            if (r0 == 0) goto L_0x020a
            int r0 = r22.getChildCount()
            if (r0 <= 0) goto L_0x020a
            android.widget.OverScroller r14 = r9.f562g
            int r15 = r22.getScrollX()
            int r16 = r22.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r22.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x020a
            goto L_0x0207
        L_0x0081:
            int r0 = r9.f576u
            int r14 = r10.findPointerIndex(r0)
            if (r14 != r3) goto L_0x00a4
            java.lang.String r0 = "Invalid pointerId="
            java.lang.StringBuilder r0 = p213q.p214a.p215a.p216a.C1965a.m4756a(r0)
            int r1 = r9.f576u
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x0246
        L_0x00a4:
            float r0 = r10.getY(r14)
            int r6 = (int) r0
            int r0 = r9.f565j
            int r0 = r0 - r6
            boolean r1 = r9.f569n
            if (r1 != 0) goto L_0x00ca
            int r1 = java.lang.Math.abs(r0)
            int r2 = r9.f573r
            if (r1 <= r2) goto L_0x00ca
            android.view.ViewParent r1 = r22.getParent()
            if (r1 == 0) goto L_0x00c1
            r1.requestDisallowInterceptTouchEvent(r13)
        L_0x00c1:
            r9.f569n = r13
            int r1 = r9.f573r
            if (r0 <= 0) goto L_0x00c9
            int r0 = r0 - r1
            goto L_0x00ca
        L_0x00c9:
            int r0 = r0 + r1
        L_0x00ca:
            r7 = r0
            boolean r0 = r9.f569n
            if (r0 == 0) goto L_0x0246
            r1 = 0
            int[] r3 = r9.f578w
            int[] r4 = r9.f577v
            r5 = 0
            r0 = r22
            r2 = r7
            boolean r0 = r0.mo701a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00ec
            int[] r0 = r9.f578w
            r0 = r0[r13]
            int r7 = r7 - r0
            int r0 = r9.f579x
            int[] r1 = r9.f577v
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.f579x = r0
        L_0x00ec:
            r15 = r7
            int[] r0 = r9.f577v
            r0 = r0[r13]
            int r6 = r6 - r0
            r9.f565j = r6
            int r16 = r22.getScrollY()
            int r8 = r22.getScrollRange()
            int r0 = r22.getOverScrollMode()
            if (r0 == 0) goto L_0x010a
            if (r0 != r13) goto L_0x0107
            if (r8 <= 0) goto L_0x0107
            goto L_0x010a
        L_0x0107:
            r17 = r11
            goto L_0x010c
        L_0x010a:
            r17 = r13
        L_0x010c:
            r1 = 0
            r3 = 0
            int r4 = r22.getScrollY()
            r5 = 0
            r7 = 0
            r18 = 0
            r0 = r22
            r2 = r15
            r6 = r8
            r21 = r8
            r8 = r18
            boolean r0 = r0.mo700a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x012f
            boolean r0 = r9.mo727e(r11)
            if (r0 != 0) goto L_0x012f
            android.view.VelocityTracker r0 = r9.f570o
            r0.clear()
        L_0x012f:
            int r0 = r22.getScrollY()
            int r3 = r0 - r16
            int r5 = r15 - r3
            int[] r8 = r9.f578w
            r8[r13] = r11
            r2 = 0
            r4 = 0
            int[] r6 = r9.f577v
            r7 = 0
            p.h.l.h r1 = r9.f557B
            r1.mo5893b(r2, r3, r4, r5, r6, r7, r8)
            int r0 = r9.f565j
            int[] r1 = r9.f577v
            r2 = r1[r13]
            int r0 = r0 - r2
            r9.f565j = r0
            int r0 = r9.f579x
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.f579x = r0
            if (r17 == 0) goto L_0x0246
            int[] r0 = r9.f578w
            r0 = r0[r13]
            int r15 = r15 - r0
            r22.mo710c()
            int r0 = r16 + r15
            if (r0 >= 0) goto L_0x0184
            android.widget.EdgeEffect r0 = r9.f563h
            float r1 = (float) r15
            int r2 = r22.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r10.getX(r14)
            int r3 = r22.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            r0.onPull(r1, r2)
            android.widget.EdgeEffect r0 = r9.f564i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01ae
            android.widget.EdgeEffect r0 = r9.f564i
            goto L_0x01ab
        L_0x0184:
            r1 = r21
            if (r0 <= r1) goto L_0x01ae
            android.widget.EdgeEffect r0 = r9.f564i
            float r1 = (float) r15
            int r2 = r22.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r10.getX(r14)
            int r4 = r22.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            r0.onPull(r1, r2)
            android.widget.EdgeEffect r0 = r9.f563h
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01ae
            android.widget.EdgeEffect r0 = r9.f563h
        L_0x01ab:
            r0.onRelease()
        L_0x01ae:
            android.widget.EdgeEffect r0 = r9.f563h
            if (r0 == 0) goto L_0x0246
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01c0
            android.widget.EdgeEffect r0 = r9.f564i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0246
        L_0x01c0:
            p124p.p150h.p162l.C1404o.m3507B(r22)
            goto L_0x0246
        L_0x01c5:
            android.view.VelocityTracker r0 = r9.f570o
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r9.f575t
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r9.f576u
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r9.f574s
            if (r1 < r4) goto L_0x01ed
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r9.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x020a
            r9.dispatchNestedFling(r2, r1, r13)
            r9.mo711c(r0)
            goto L_0x020a
        L_0x01ed:
            android.widget.OverScroller r14 = r9.f562g
            int r15 = r22.getScrollX()
            int r16 = r22.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r22.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x020a
        L_0x0207:
            p124p.p150h.p162l.C1404o.m3507B(r22)
        L_0x020a:
            r9.f576u = r3
            r22.mo708b()
            goto L_0x0246
        L_0x0210:
            int r0 = r22.getChildCount()
            if (r0 != 0) goto L_0x0217
            return r11
        L_0x0217:
            android.widget.OverScroller r0 = r9.f562g
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r13
            r9.f569n = r0
            if (r0 == 0) goto L_0x022b
            android.view.ViewParent r0 = r22.getParent()
            if (r0 == 0) goto L_0x022b
            r0.requestDisallowInterceptTouchEvent(r13)
        L_0x022b:
            android.widget.OverScroller r0 = r9.f562g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0236
            r22.mo691a()
        L_0x0236:
            float r0 = r23.getY()
            int r0 = (int) r0
            r9.f565j = r0
            int r0 = r10.getPointerId(r11)
            r9.f576u = r0
            r9.mo698a(r1, r11)
        L_0x0246:
            android.view.VelocityTracker r0 = r9.f570o
            if (r0 == 0) goto L_0x024d
            r0.addMovement(r12)
        L_0x024d:
            r12.recycle()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f566k) {
            mo695a(view2);
        } else {
            this.f568m = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a = mo690a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo692a(0, a, 250, false);
            }
        }
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            mo719d();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f566k = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int b = m231b(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), width);
            int b2 = m231b(i2, height, height2);
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f571p) {
            this.f571p = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        C1397h hVar = this.f557B;
        if (hVar.f4158d) {
            C1404o.m3509D(hVar.f4157c);
        }
        hVar.f4158d = z;
    }

    public void setOnScrollChangeListener(C0078b bVar) {
        this.f559D = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f572q = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.f557B.mo5889a(i, 0);
    }

    public void stopNestedScroll() {
        this.f557B.mo5894c(0);
    }

    /* renamed from: a */
    public boolean mo697a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !mo703a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            mo709b(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f561f);
            offsetDescendantRectToMyCoords(findNextFocus, this.f561f);
            mo709b(mo690a(this.f561f));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!mo703a(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: b */
    public final void mo708b() {
        this.f569n = false;
        mo719d();
        this.f557B.mo5894c(0);
        EdgeEffect edgeEffect = this.f563h;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f564i.onRelease();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo702a(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.f561f
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = r1
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0061
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x0061
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00fa
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x00eb
            r4 = 20
            if (r0 == r4) goto L_0x00db
            r4 = 62
            if (r0 == r4) goto L_0x007c
            goto L_0x00fa
        L_0x007c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r5 = r3
        L_0x0084:
            if (r5 != r3) goto L_0x0088
            r7 = r1
            goto L_0x0089
        L_0x0088:
            r7 = r2
        L_0x0089:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00be
            android.graphics.Rect r7 = r6.f561f
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00d0
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r7
            android.graphics.Rect r7 = r6.f561f
            int r3 = r7.top
            int r3 = r3 + r0
            if (r3 <= r1) goto L_0x00d0
            int r1 = r1 - r0
            goto L_0x00ce
        L_0x00be:
            android.graphics.Rect r7 = r6.f561f
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.f561f
            int r1 = r7.top
            if (r1 >= 0) goto L_0x00d0
            r1 = r2
        L_0x00ce:
            r7.top = r1
        L_0x00d0:
            android.graphics.Rect r7 = r6.f561f
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.mo699a(r5, r1, r0)
            goto L_0x00fa
        L_0x00db:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00e6
            boolean r2 = r6.mo697a(r3)
            goto L_0x00fa
        L_0x00e6:
            boolean r2 = r6.mo720d(r3)
            goto L_0x00fa
        L_0x00eb:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00f6
            boolean r2 = r6.mo697a(r5)
            goto L_0x00fa
        L_0x00f6:
            boolean r2 = r6.mo720d(r5)
        L_0x00fa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo702a(android.view.KeyEvent):boolean");
    }

    /* renamed from: a */
    public void mo125a(View view, View view2, int i, int i2) {
        C1400k kVar = this.f556A;
        if (i2 == 1) {
            kVar.f4161b = i;
        } else {
            kVar.f4160a = i;
        }
        mo698a(2, i2);
    }

    /* renamed from: a */
    public void mo121a(View view, int i) {
        C1400k kVar = this.f556A;
        if (i == 1) {
            kVar.f4161b = 0;
        } else {
            kVar.f4160a = 0;
        }
        this.f557B.mo5894c(i);
    }

    /* renamed from: a */
    public boolean mo700a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        int overScrollMode = getOverScrollMode();
        boolean z3 = super.computeHorizontalScrollRange() > super.computeHorizontalScrollExtent();
        boolean z4 = computeVerticalScrollRange() > super.computeVerticalScrollExtent();
        boolean z5 = overScrollMode == 0 || (overScrollMode == 1 && z3);
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        int i9 = i3 + i;
        int i10 = !z5 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z6 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z = true;
        } else if (i9 < i13) {
            z = true;
            i9 = i13;
        } else {
            z = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z2 = true;
        } else if (i11 < i15) {
            z2 = true;
            i11 = i15;
        } else {
            z2 = false;
        }
        if (z2 && !mo727e(1)) {
            this.f562g.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i9, i11);
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo696a(boolean z) {
        if (z) {
            mo698a(2, 1);
        } else {
            this.f557B.mo5894c(1);
        }
        this.f580y = getScrollY();
        C1404o.m3507B(this);
    }

    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo699a(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r17.getHeight()
            int r5 = r17.getScrollY()
            int r4 = r4 + r5
            r8 = 33
            if (r1 != r8) goto L_0x0017
            r8 = 1
            goto L_0x0018
        L_0x0017:
            r8 = 0
        L_0x0018:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0024:
            if (r12 >= r10) goto L_0x006c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r6 = r14.getBottom()
            if (r2 >= r6) goto L_0x0069
            if (r15 >= r3) goto L_0x0069
            if (r2 >= r15) goto L_0x003f
            if (r6 >= r3) goto L_0x003f
            r16 = 1
            goto L_0x0041
        L_0x003f:
            r16 = 0
        L_0x0041:
            if (r11 != 0) goto L_0x0047
            r11 = r14
            r13 = r16
            goto L_0x0069
        L_0x0047:
            if (r8 == 0) goto L_0x004f
            int r7 = r11.getTop()
            if (r15 < r7) goto L_0x0057
        L_0x004f:
            if (r8 != 0) goto L_0x0059
            int r7 = r11.getBottom()
            if (r6 <= r7) goto L_0x0059
        L_0x0057:
            r6 = 1
            goto L_0x005a
        L_0x0059:
            r6 = 0
        L_0x005a:
            if (r13 == 0) goto L_0x0061
            if (r16 == 0) goto L_0x0069
            if (r6 == 0) goto L_0x0069
            goto L_0x0068
        L_0x0061:
            if (r16 == 0) goto L_0x0066
            r11 = r14
            r13 = 1
            goto L_0x0069
        L_0x0066:
            if (r6 == 0) goto L_0x0069
        L_0x0068:
            r11 = r14
        L_0x0069:
            int r12 = r12 + 1
            goto L_0x0024
        L_0x006c:
            if (r11 != 0) goto L_0x006f
            r11 = r0
        L_0x006f:
            if (r2 < r5) goto L_0x0075
            if (r3 > r4) goto L_0x0075
            r6 = 0
            goto L_0x007f
        L_0x0075:
            if (r8 == 0) goto L_0x0079
            int r2 = r2 - r5
            goto L_0x007b
        L_0x0079:
            int r2 = r3 - r4
        L_0x007b:
            r0.mo709b(r2)
            r6 = 1
        L_0x007f:
            android.view.View r2 = r17.findFocus()
            if (r11 == r2) goto L_0x0088
            r11.requestFocus(r1)
        L_0x0088:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo699a(int, int, int):boolean");
    }
}
