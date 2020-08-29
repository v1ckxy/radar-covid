package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.C3400k;
import p213q.p217b.p218a.p271c.C3406l;
import p213q.p217b.p218a.p271c.p273b0.C3298d;
import p213q.p217b.p218a.p271c.p273b0.C3310j;

public class ChipGroup extends C3298d {

    /* renamed from: h */
    public int f1298h;

    /* renamed from: i */
    public int f1299i;

    /* renamed from: j */
    public boolean f1300j;

    /* renamed from: k */
    public C0231d f1301k;

    /* renamed from: l */
    public final C0229b f1302l;

    /* renamed from: m */
    public C0232e f1303m;

    /* renamed from: n */
    public int f1304n;

    /* renamed from: o */
    public boolean f1305o;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C0229b implements OnCheckedChangeListener {
        public /* synthetic */ C0229b(C0228a aVar) {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f1305o) {
                int id = compoundButton.getId();
                if (z) {
                    ChipGroup chipGroup = ChipGroup.this;
                    int i = chipGroup.f1304n;
                    if (!(i == -1 || i == id || !chipGroup.f1300j)) {
                        chipGroup.mo1995a(i, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                } else {
                    ChipGroup chipGroup2 = ChipGroup.this;
                    if (chipGroup2.f1304n == id) {
                        chipGroup2.setCheckedId(-1);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C0230c extends MarginLayoutParams {
        public C0230c(int i, int i2) {
            super(i, i2);
        }

        public C0230c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0230c(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C0231d {
        /* renamed from: a */
        void mo2024a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    public class C0232e implements OnHierarchyChangeListener {

        /* renamed from: e */
        public OnHierarchyChangeListener f1307e;

        public /* synthetic */ C0232e(C0228a aVar) {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f1302l);
            }
            OnHierarchyChangeListener onHierarchyChangeListener = this.f1307e;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            OnHierarchyChangeListener onHierarchyChangeListener = this.f1307e;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3294b.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1302l = new C0229b(null);
        this.f1303m = new C0232e(null);
        this.f1304n = -1;
        this.f1305o = false;
        TypedArray b = C3310j.m7691b(context, attributeSet, C3406l.ChipGroup, i, C3400k.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = b.getDimensionPixelOffset(C3406l.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(b.getDimensionPixelOffset(C3406l.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(b.getDimensionPixelOffset(C3406l.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(b.getBoolean(C3406l.ChipGroup_singleLine, false));
        setSingleSelection(b.getBoolean(C3406l.ChipGroup_singleSelection, false));
        int resourceId = b.getResourceId(C3406l.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.f1304n = resourceId;
        }
        b.recycle();
        super.setOnHierarchyChangeListener(this.f1303m);
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f1304n = i;
        C0231d dVar = this.f1301k;
        if (dVar != null && this.f1300j) {
            dVar.mo2024a(this, i);
        }
    }

    /* renamed from: a */
    public final void mo1995a(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f1305o = true;
            ((Chip) findViewById).setChecked(z);
            this.f1305o = false;
        }
    }

    /* renamed from: a */
    public boolean mo1996a() {
        return this.f8278g;
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f1304n;
                if (i2 != -1 && this.f1300j) {
                    mo1995a(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0230c);
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new C0230c(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0230c(getContext(), attributeSet);
    }

    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0230c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f1300j) {
            return this.f1304n;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f1298h;
    }

    public int getChipSpacingVertical() {
        return this.f1299i;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f1304n;
        if (i != -1) {
            mo1995a(i, true);
            setCheckedId(this.f1304n);
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f1298h != i) {
            this.f1298h = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f1299i != i) {
            this.f1299i = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C0231d dVar) {
        this.f1301k = dVar;
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1303m.f1307e = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f1300j != z) {
            this.f1300j = z;
            this.f1305o = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f1305o = false;
            setCheckedId(-1);
        }
    }
}
