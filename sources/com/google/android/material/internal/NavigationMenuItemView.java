package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import p124p.p126b.C1018a;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p134p.p135i.C1118i;
import p124p.p126b.p134p.p135i.C1131n.C1132a;
import p124p.p126b.p136q.C1167f0.C1168a;
import p124p.p150h.p162l.C1387a;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.p163y.C1429b;
import p213q.p217b.p218a.p271c.C3318d;
import p213q.p217b.p218a.p271c.C3325e;
import p213q.p217b.p218a.p271c.C3327f;
import p213q.p217b.p218a.p271c.C3356h;
import p213q.p217b.p218a.p271c.p273b0.C3299e;

public class NavigationMenuItemView extends C3299e implements C1132a {

    /* renamed from: J */
    public static final int[] f1342J = {16842912};

    /* renamed from: A */
    public boolean f1343A;

    /* renamed from: B */
    public boolean f1344B;

    /* renamed from: C */
    public final CheckedTextView f1345C;

    /* renamed from: D */
    public FrameLayout f1346D;

    /* renamed from: E */
    public C1118i f1347E;

    /* renamed from: F */
    public ColorStateList f1348F;

    /* renamed from: G */
    public boolean f1349G;

    /* renamed from: H */
    public Drawable f1350H;

    /* renamed from: I */
    public final C1387a f1351I;

    /* renamed from: z */
    public int f1352z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C0243a extends C1387a {
        public C0243a() {
        }

        /* renamed from: a */
        public void mo768a(View view, C1429b bVar) {
            this.f4146a.onInitializeAccessibilityNodeInfo(view, bVar.f4203a);
            bVar.f4203a.setCheckable(NavigationMenuItemView.this.f1344B);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1351I = new C0243a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(C3356h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C3318d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C3327f.design_menu_item_text);
        this.f1345C = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C1404o.m3526a((View) this.f1345C, this.f1351I);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1346D == null) {
                this.f1346D = (FrameLayout) ((ViewStub) findViewById(C3327f.design_menu_item_action_area_stub)).inflate();
            }
            this.f1346D.removeAllViews();
            this.f1346D.addView(view);
        }
    }

    /* renamed from: a */
    public void mo38a(C1118i iVar, int i) {
        int i2;
        C1168a aVar;
        StateListDrawable stateListDrawable;
        this.f1347E = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C1018a.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1342J, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            C1404o.m3522a((View) this, (Drawable) stateListDrawable);
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.f3108e);
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.f3120q);
        C1061o.m2492a((View) this, iVar.f3121r);
        C1118i iVar2 = this.f1347E;
        if (!(iVar2.f3108e == null && iVar2.getIcon() == null && this.f1347E.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.f1345C.setVisibility(8);
            FrameLayout frameLayout = this.f1346D;
            if (frameLayout != null) {
                aVar = (C1168a) frameLayout.getLayoutParams();
                i2 = -1;
            } else {
                return;
            }
        } else {
            this.f1345C.setVisibility(0);
            FrameLayout frameLayout2 = this.f1346D;
            if (frameLayout2 != null) {
                aVar = (C1168a) frameLayout2.getLayoutParams();
                i2 = -2;
            } else {
                return;
            }
        }
        aVar.width = i2;
        this.f1346D.setLayoutParams(aVar);
    }

    /* renamed from: b */
    public boolean mo40b() {
        return false;
    }

    public C1118i getItemData() {
        return this.f1347E;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1118i iVar = this.f1347E;
        if (iVar != null && iVar.isCheckable() && this.f1347E.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f1342J);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f1344B != z) {
            this.f1344B = z;
            this.f1351I.mo5868a((View) this.f1345C, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f1345C.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1349G) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f1348F);
            }
            int i = this.f1352z;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1343A) {
            if (this.f1350H == null) {
                Drawable drawable2 = getResources().getDrawable(C3325e.navigation_empty_icon, getContext().getTheme());
                this.f1350H = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f1352z;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1350H;
        }
        this.f1345C.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1345C.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1352z = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1348F = colorStateList;
        this.f1349G = colorStateList != null;
        C1118i iVar = this.f1347E;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1345C.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f1343A = z;
    }

    public void setTextAppearance(int i) {
        this.f1345C.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1345C.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1345C.setText(charSequence);
    }
}
