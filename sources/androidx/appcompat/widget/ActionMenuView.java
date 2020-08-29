package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar.C0060f;
import androidx.recyclerview.widget.RecyclerView;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p134p.p135i.C1114g.C1115a;
import p124p.p126b.p134p.p135i.C1114g.C1116b;
import p124p.p126b.p134p.p135i.C1118i;
import p124p.p126b.p134p.p135i.C1129m;
import p124p.p126b.p134p.p135i.C1129m.C1130a;
import p124p.p126b.p134p.p135i.C1131n;
import p124p.p126b.p136q.C1143a1;
import p124p.p126b.p136q.C1147c;
import p124p.p126b.p136q.C1147c.C1151d;
import p124p.p126b.p136q.C1167f0;
import p124p.p126b.p136q.C1167f0.C1168a;
import p213q.p214a.p215a.p216a.C1965a;

public class ActionMenuView extends C1167f0 implements C1116b, C1131n {

    /* renamed from: A */
    public boolean f179A;

    /* renamed from: B */
    public int f180B;

    /* renamed from: C */
    public int f181C;

    /* renamed from: D */
    public int f182D;

    /* renamed from: E */
    public C0023e f183E;

    /* renamed from: t */
    public C1114g f184t;

    /* renamed from: u */
    public Context f185u;

    /* renamed from: v */
    public int f186v;

    /* renamed from: w */
    public boolean f187w;

    /* renamed from: x */
    public C1147c f188x;

    /* renamed from: y */
    public C1130a f189y;

    /* renamed from: z */
    public C1115a f190z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0019a {
        /* renamed from: a */
        boolean mo39a();

        /* renamed from: c */
        boolean mo41c();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0020b implements C1130a {
        /* renamed from: a */
        public void mo196a(C1114g gVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo197a(C1114g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0021c extends C1168a {
        @ExportedProperty

        /* renamed from: c */
        public boolean f191c;
        @ExportedProperty

        /* renamed from: d */
        public int f192d;
        @ExportedProperty

        /* renamed from: e */
        public int f193e;
        @ExportedProperty

        /* renamed from: f */
        public boolean f194f;
        @ExportedProperty

        /* renamed from: g */
        public boolean f195g;

        /* renamed from: h */
        public boolean f196h;

        public C0021c(int i, int i2) {
            super(i, i2);
            this.f191c = false;
        }

        public C0021c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0021c(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0021c(C0021c cVar) {
            super(cVar);
            this.f191c = cVar.f191c;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0022d implements C1115a {
        public C0022d() {
        }

        /* renamed from: a */
        public void mo198a(C1114g gVar) {
            C1115a aVar = ActionMenuView.this.f190z;
            if (aVar != null) {
                aVar.mo198a(gVar);
            }
        }

        /* renamed from: a */
        public boolean mo199a(C1114g gVar, MenuItem menuItem) {
            C0023e eVar = ActionMenuView.this.f183E;
            if (eVar == null) {
                return false;
            }
            C0060f fVar = Toolbar.this.f370K;
            return fVar != null ? fVar.onMenuItemClick(menuItem) : false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0023e {
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f181C = (int) (56.0f * f);
        this.f182D = (int) (f * 4.0f);
        this.f185u = context;
        this.f186v = 0;
    }

    /* renamed from: a */
    public static int m57a(View view, int i, int i2, int i3, int i4) {
        C0021c cVar = (C0021c) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo42d();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f191c || !z2) {
            z = false;
        }
        cVar.f194f = z;
        cVar.f192d = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: a */
    public void mo61a(C1114g gVar) {
        this.f184t = gVar;
    }

    /* renamed from: a */
    public boolean mo62a(C1118i iVar) {
        return this.f184t.mo4810a((MenuItem) iVar, (C1129m) null, 0);
    }

    /* renamed from: b */
    public boolean mo176b(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0019a)) {
            z = false | ((C0019a) childAt).mo39a();
        }
        if (i > 0 && (childAt2 instanceof C0019a)) {
            z |= ((C0019a) childAt2).mo41c();
        }
        return z;
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0021c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public C0021c generateDefaultLayoutParams() {
        C0021c cVar = new C0021c(-2, -2);
        cVar.f3279b = 16;
        return cVar;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0021c(getContext(), attributeSet);
    }

    public C0021c generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0021c cVar = layoutParams instanceof C0021c ? new C0021c((C0021c) layoutParams) : new C0021c(layoutParams);
        if (cVar.f3279b <= 0) {
            cVar.f3279b = 16;
        }
        return cVar;
    }

    public Menu getMenu() {
        if (this.f184t == null) {
            Context context = getContext();
            C1114g gVar = new C1114g(context);
            this.f184t = gVar;
            gVar.f3076e = new C0022d();
            C1147c cVar = new C1147c(context);
            this.f188x = cVar;
            cVar.f3206q = true;
            cVar.f3207r = true;
            C1130a aVar = this.f189y;
            if (aVar == null) {
                aVar = new C0020b();
            }
            cVar.f3009i = aVar;
            this.f184t.mo4807a((C1129m) this.f188x, this.f185u);
            C1147c cVar2 = this.f188x;
            cVar2.f3012l = this;
            this.f184t = cVar2.f3007g;
        }
        return this.f184t;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1147c cVar = this.f188x;
        C1151d dVar = cVar.f3203n;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.f3205p) {
            return cVar.f3204o;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f186v;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1147c cVar = this.f188x;
        if (cVar != null) {
            cVar.mo536a(false);
            if (this.f188x.mo5058f()) {
                this.f188x.mo5056c();
                this.f188x.mo5059g();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1147c cVar = this.f188x;
        if (cVar != null) {
            cVar.mo5055a();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f179A) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a = C1143a1.m2887a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0021c cVar = (C0021c) childAt.getLayoutParams();
                if (cVar.f191c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo176b(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i5 = getPaddingLeft() + cVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    mo176b(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int i16 = 0;
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i16 < childCount) {
                View childAt3 = getChildAt(i16);
                C0021c cVar2 = (C0021c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f191c) {
                    int i17 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i16++;
            }
        } else {
            int paddingLeft = getPaddingLeft();
            while (i16 < childCount) {
                View childAt4 = getChildAt(i16);
                C0021c cVar3 = (C0021c) childAt4.getLayoutParams();
                if (childAt4.getVisibility() != 8 && !cVar3.f191c) {
                    int i19 = paddingLeft + cVar3.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i20 = i7 - (measuredHeight4 / 2);
                    childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                    paddingLeft = C1965a.m4742a(measuredWidth4, cVar3.rightMargin, max, i19);
                }
                i16++;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        boolean z4 = this.f179A;
        boolean z5 = MeasureSpec.getMode(i) == 1073741824;
        this.f179A = z5;
        if (z4 != z5) {
            this.f180B = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (this.f179A) {
            C1114g gVar = this.f184t;
            if (!(gVar == null || size == this.f180B)) {
                this.f180B = size;
                gVar.mo4824b(true);
            }
        }
        int childCount = getChildCount();
        if (!this.f179A || childCount <= 0) {
            int i7 = i2;
            for (int i8 = 0; i8 < childCount; i8++) {
                C0021c cVar = (C0021c) getChildAt(i8).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i);
        int size3 = MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f181C;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z6 = false;
        long j = 0;
        while (i18 < childCount2) {
            View childAt = getChildAt(i18);
            int i19 = size3;
            int i20 = i9;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i21 = i14 + 1;
                if (z7) {
                    int i22 = this.f182D;
                    i6 = i21;
                    z3 = false;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i6 = i21;
                    z3 = false;
                }
                C0021c cVar2 = (C0021c) childAt.getLayoutParams();
                cVar2.f196h = z3;
                cVar2.f193e = z3 ? 1 : 0;
                cVar2.f192d = z3;
                cVar2.f194f = z3;
                cVar2.leftMargin = z3;
                cVar2.rightMargin = z3;
                cVar2.f195g = z7 && ((ActionMenuItemView) childAt).mo42d();
                int a = m57a(childAt, i13, cVar2.f191c ? 1 : i11, childMeasureSpec, paddingBottom);
                i16 = Math.max(i16, a);
                if (cVar2.f194f) {
                    i17++;
                }
                if (cVar2.f191c) {
                    z6 = true;
                }
                i11 -= a;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (a == 1) {
                    j |= (long) (1 << i18);
                }
                i14 = i6;
            }
            i18++;
            size3 = i19;
            i9 = i20;
        }
        int i23 = i9;
        int i24 = size3;
        boolean z8 = z6 && i14 == 2;
        boolean z9 = false;
        while (true) {
            if (i17 <= 0 || i11 <= 0) {
                i3 = i15;
                z = z9;
            } else {
                int i25 = Integer.MAX_VALUE;
                int i26 = 0;
                int i27 = 0;
                long j2 = 0;
                while (i26 < childCount2) {
                    int i28 = i15;
                    C0021c cVar3 = (C0021c) getChildAt(i26).getLayoutParams();
                    boolean z10 = z9;
                    if (cVar3.f194f) {
                        int i29 = cVar3.f192d;
                        if (i29 < i25) {
                            j2 = 1 << i26;
                            i25 = i29;
                            i27 = 1;
                        } else if (i29 == i25) {
                            i27++;
                            j2 |= 1 << i26;
                        }
                    }
                    i26++;
                    z9 = z10;
                    i15 = i28;
                }
                i3 = i15;
                z = z9;
                j |= j2;
                if (i27 > i11) {
                    break;
                }
                int i30 = i25 + 1;
                int i31 = 0;
                while (i31 < childCount2) {
                    View childAt2 = getChildAt(i31);
                    C0021c cVar4 = (C0021c) childAt2.getLayoutParams();
                    int i32 = i17;
                    long j3 = (long) (1 << i31);
                    if ((j2 & j3) == 0) {
                        if (cVar4.f192d == i30) {
                            j |= j3;
                        }
                        z2 = z8;
                    } else {
                        if (!z8 || !cVar4.f195g || i11 != 1) {
                            z2 = z8;
                        } else {
                            int i33 = this.f182D;
                            z2 = z8;
                            childAt2.setPadding(i33 + i13, 0, i33, 0);
                        }
                        cVar4.f192d++;
                        cVar4.f196h = true;
                        i11--;
                    }
                    i31++;
                    i17 = i32;
                    z8 = z2;
                }
                i15 = i3;
                z9 = true;
            }
        }
        i3 = i15;
        z = z9;
        boolean z11 = !z6 && i14 == 1;
        if (i11 > 0 && j != 0 && (i11 < i14 - 1 || z11 || i16 > 1)) {
            float bitCount = (float) Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((C0021c) getChildAt(0).getLayoutParams()).f195g) {
                    bitCount -= 0.5f;
                }
                int i34 = childCount2 - 1;
                if ((j & ((long) (1 << i34))) != 0 && !((C0021c) getChildAt(i34).getLayoutParams()).f195g) {
                    bitCount -= 0.5f;
                }
            }
            int i35 = bitCount > 0.0f ? (int) (((float) (i11 * i13)) / bitCount) : 0;
            for (int i36 = 0; i36 < childCount2; i36++) {
                if ((j & ((long) (1 << i36))) != 0) {
                    View childAt3 = getChildAt(i36);
                    C0021c cVar5 = (C0021c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.f193e = i35;
                        cVar5.f196h = true;
                        if (i36 == 0 && !cVar5.f195g) {
                            cVar5.leftMargin = (-i35) / 2;
                        }
                        z = true;
                    } else if (cVar5.f191c) {
                        cVar5.f193e = i35;
                        cVar5.f196h = true;
                        cVar5.rightMargin = (-i35) / 2;
                        z = true;
                    } else {
                        if (i36 != 0) {
                            cVar5.leftMargin = i35 / 2;
                        }
                        if (i36 != childCount2 - 1) {
                            cVar5.rightMargin = i35 / 2;
                        }
                    }
                }
            }
        }
        if (z) {
            for (int i37 = 0; i37 < childCount2; i37++) {
                View childAt4 = getChildAt(i37);
                C0021c cVar6 = (C0021c) childAt4.getLayoutParams();
                if (cVar6.f196h) {
                    childAt4.measure(MeasureSpec.makeMeasureSpec((cVar6.f192d * i13) + cVar6.f193e, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i5 = i23;
            i4 = i3;
        } else {
            i4 = i24;
            i5 = i23;
        }
        setMeasuredDimension(i5, i4);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f188x.f3211v = z;
    }

    public void setOnMenuItemClickListener(C0023e eVar) {
        this.f183E = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1147c cVar = this.f188x;
        C1151d dVar = cVar.f3203n;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.f3205p = true;
        cVar.f3204o = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.f187w = z;
    }

    public void setPopupTheme(int i) {
        if (this.f186v != i) {
            this.f186v = i;
            if (i == 0) {
                this.f185u = getContext();
            } else {
                this.f185u = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C1147c cVar) {
        this.f188x = cVar;
        cVar.f3012l = this;
        this.f184t = cVar.f3007g;
    }

    /* renamed from: generateLayoutParams reason: collision with other method in class */
    public C1168a m11848generateLayoutParams(AttributeSet attributeSet) {
        return new C0021c(getContext(), attributeSet);
    }
}
