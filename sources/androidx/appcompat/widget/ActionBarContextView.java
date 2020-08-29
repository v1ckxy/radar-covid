package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p124p.p126b.C1018a;
import p124p.p126b.C1023f;
import p124p.p126b.C1024g;
import p124p.p126b.C1027j;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p126b.p134p.C1089a;
import p124p.p126b.p136q.C1140a;
import p124p.p126b.p136q.C1143a1;
import p124p.p126b.p136q.C1147c;
import p124p.p150h.p162l.C1404o;

public class ActionBarContextView extends C1140a {

    /* renamed from: m */
    public CharSequence f136m;

    /* renamed from: n */
    public CharSequence f137n;

    /* renamed from: o */
    public View f138o;

    /* renamed from: p */
    public View f139p;

    /* renamed from: q */
    public LinearLayout f140q;

    /* renamed from: r */
    public TextView f141r;

    /* renamed from: s */
    public TextView f142s;

    /* renamed from: t */
    public int f143t;

    /* renamed from: u */
    public int f144u;

    /* renamed from: v */
    public boolean f145v;

    /* renamed from: w */
    public int f146w;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class C0013a implements OnClickListener {

        /* renamed from: e */
        public final /* synthetic */ C1089a f147e;

        public C0013a(ActionBarContextView actionBarContextView, C1089a aVar) {
            this.f147e = aVar;
        }

        public void onClick(View view) {
            this.f147e.mo4540a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1018a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1027j.ActionMode, i, 0);
        int i2 = C1027j.ActionMode_background;
        if (obtainStyledAttributes.hasValue(i2)) {
            int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
            if (resourceId != 0) {
                drawable = C1070a.m2602b(context, resourceId);
                C1404o.m3522a((View) this, drawable);
                this.f143t = obtainStyledAttributes.getResourceId(C1027j.ActionMode_titleTextStyle, 0);
                this.f144u = obtainStyledAttributes.getResourceId(C1027j.ActionMode_subtitleTextStyle, 0);
                this.f3186i = obtainStyledAttributes.getLayoutDimension(C1027j.ActionMode_height, 0);
                this.f146w = obtainStyledAttributes.getResourceId(C1027j.ActionMode_closeItemLayout, C1024g.abc_action_mode_close_item_material);
                obtainStyledAttributes.recycle();
            }
        }
        drawable = obtainStyledAttributes.getDrawable(i2);
        C1404o.m3522a((View) this, drawable);
        this.f143t = obtainStyledAttributes.getResourceId(C1027j.ActionMode_titleTextStyle, 0);
        this.f144u = obtainStyledAttributes.getResourceId(C1027j.ActionMode_subtitleTextStyle, 0);
        this.f3186i = obtainStyledAttributes.getLayoutDimension(C1027j.ActionMode_height, 0);
        this.f146w = obtainStyledAttributes.getResourceId(C1027j.ActionMode_closeItemLayout, C1024g.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo97a() {
        if (this.f140q == null) {
            LayoutInflater.from(getContext()).inflate(C1024g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f140q = linearLayout;
            this.f141r = (TextView) linearLayout.findViewById(C1023f.action_bar_title);
            this.f142s = (TextView) this.f140q.findViewById(C1023f.action_bar_subtitle);
            if (this.f143t != 0) {
                this.f141r.setTextAppearance(getContext(), this.f143t);
            }
            if (this.f144u != 0) {
                this.f142s.setTextAppearance(getContext(), this.f144u);
            }
        }
        this.f141r.setText(this.f136m);
        this.f142s.setText(this.f137n);
        boolean z = !TextUtils.isEmpty(this.f136m);
        boolean z2 = !TextUtils.isEmpty(this.f137n);
        int i = 0;
        this.f142s.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f140q;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f140q.getParent() == null) {
            addView(this.f140q);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo98a(p124p.p126b.p134p.C1089a r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f138o
            r1 = 0
            if (r0 != 0) goto L_0x0016
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.f146w
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.f138o = r0
            goto L_0x001e
        L_0x0016:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0021
            android.view.View r0 = r6.f138o
        L_0x001e:
            r6.addView(r0)
        L_0x0021:
            android.view.View r0 = r6.f138o
            int r2 = p124p.p126b.C1023f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r2)
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            android.view.Menu r7 = r7.mo4548c()
            p.b.p.i.g r7 = (p124p.p126b.p134p.p135i.C1114g) r7
            p.b.q.c r0 = r6.f3185h
            if (r0 == 0) goto L_0x003e
            r0.mo5055a()
        L_0x003e:
            p.b.q.c r0 = new p.b.q.c
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f3185h = r0
            r2 = 1
            r0.f3206q = r2
            r0.f3207r = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            p.b.q.c r3 = r6.f3185h
            android.content.Context r4 = r6.f3183f
            r7.mo4807a(r3, r4)
            p.b.q.c r7 = r6.f3185h
            p.b.p.i.n r3 = r7.f3012l
            if (r3 != 0) goto L_0x0076
            android.view.LayoutInflater r4 = r7.f3008h
            int r5 = r7.f3010j
            android.view.View r1 = r4.inflate(r5, r6, r1)
            p.b.p.i.n r1 = (p124p.p126b.p134p.p135i.C1131n) r1
            r7.f3012l = r1
            p.b.p.i.g r4 = r7.f3007g
            r1.mo61a(r4)
            r7.mo536a(r2)
        L_0x0076:
            p.b.p.i.n r1 = r7.f3012l
            if (r3 == r1) goto L_0x0080
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L_0x0080:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f3184g = r1
            r7 = 0
            p124p.p150h.p162l.C1404o.m3522a(r1, r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f3184g
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.mo98a(p.b.p.a):void");
    }

    /* renamed from: b */
    public void mo99b() {
        removeAllViews();
        this.f139p = null;
        this.f3184g = null;
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f137n;
    }

    public CharSequence getTitle() {
        return this.f136m;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1147c cVar = this.f3185h;
        if (cVar != null) {
            cVar.mo5056c();
            this.f3185h.mo5057e();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f136m);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a = C1143a1.m2887a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f138o;
        if (!(view == null || view.getVisibility() == 8)) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f138o.getLayoutParams();
            int i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = a ? paddingRight - i5 : paddingRight + i5;
            int a2 = i7 + mo5015a(this.f138o, i7, paddingTop, paddingTop2, a);
            paddingRight = a ? a2 - i6 : a2 + i6;
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.f140q;
        if (!(linearLayout == null || this.f139p != null || linearLayout.getVisibility() == 8)) {
            i8 += mo5015a(this.f140q, i8, paddingTop, paddingTop2, a);
        }
        int i9 = i8;
        View view2 = this.f139p;
        if (view2 != null) {
            mo5015a(view2, i9, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f3184g;
        if (actionMenuView != null) {
            mo5015a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(ActionBarContextView.class.getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (MeasureSpec.getMode(i2) != 0) {
            int size = MeasureSpec.getSize(i);
            int i4 = this.f3186i;
            if (i4 <= 0) {
                i4 = MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingBottom;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, RecyclerView.UNDEFINED_DURATION);
            View view = this.f138o;
            if (view != null) {
                int a = mo5014a(view, paddingLeft, makeMeasureSpec, 0);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f138o.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f3184g;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo5014a(this.f3184g, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f140q;
            if (linearLayout != null && this.f139p == null) {
                if (this.f145v) {
                    this.f140q.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f140q.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f140q.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo5014a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f139p;
            if (view2 != null) {
                LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i7 = layoutParams.width;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f139p.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i6), MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f3186i <= 0) {
                int childCount = getChildCount();
                i4 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i4) {
                        i4 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i4);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ActionBarContextView.class.getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public void setContentHeight(int i) {
        this.f3186i = i;
    }

    public void setCustomView(View view) {
        View view2 = this.f139p;
        if (view2 != null) {
            removeView(view2);
        }
        this.f139p = view;
        if (view != null) {
            LinearLayout linearLayout = this.f140q;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.f140q = null;
            }
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f137n = charSequence;
        mo97a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f136m = charSequence;
        mo97a();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f145v) {
            requestLayout();
        }
        this.f145v = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
