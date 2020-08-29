package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p126b.p136q.C1166f;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.C3400k;
import p213q.p217b.p218a.p271c.C3406l;
import p213q.p217b.p218a.p271c.p273b0.C3310j;
import p213q.p217b.p218a.p271c.p276e0.C3326a;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p278g0.C3337g.C3339b;
import p213q.p217b.p218a.p271c.p278g0.C3342j;
import p213q.p217b.p218a.p271c.p278g0.C3355n;
import p213q.p217b.p218a.p271c.p289s.C3445a;

public class MaterialButton extends C1166f implements Checkable, C3355n {

    /* renamed from: s */
    public static final int[] f1262s = {16842911};

    /* renamed from: t */
    public static final int[] f1263t = {16842912};

    /* renamed from: u */
    public static final int f1264u = C3400k.Widget_MaterialComponents_Button;

    /* renamed from: g */
    public final C3445a f1265g;

    /* renamed from: h */
    public final LinkedHashSet<C0224a> f1266h;

    /* renamed from: i */
    public C0225b f1267i;

    /* renamed from: j */
    public Mode f1268j;

    /* renamed from: k */
    public ColorStateList f1269k;

    /* renamed from: l */
    public Drawable f1270l;

    /* renamed from: m */
    public int f1271m;

    /* renamed from: n */
    public int f1272n;

    /* renamed from: o */
    public int f1273o;

    /* renamed from: p */
    public boolean f1274p;

    /* renamed from: q */
    public boolean f1275q;

    /* renamed from: r */
    public int f1276r;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C0224a {
        /* renamed from: a */
        void mo1846a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    public interface C0225b {
        /* renamed from: a */
        void mo1847a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3294b.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        super(C3310j.m7690b(context, attributeSet2, i2, f1264u), attributeSet2, i2);
        this.f1266h = new LinkedHashSet<>();
        this.f1274p = false;
        this.f1275q = false;
        Context context2 = getContext();
        TypedArray b = C3310j.m7691b(context2, attributeSet, C3406l.MaterialButton, i, f1264u, new int[0]);
        this.f1273o = b.getDimensionPixelSize(C3406l.MaterialButton_iconPadding, 0);
        this.f1268j = C2286e.m5175a(b.getInt(C3406l.MaterialButton_iconTintMode, -1), Mode.SRC_IN);
        this.f1269k = C2286e.m5173a(getContext(), b, C3406l.MaterialButton_iconTint);
        this.f1270l = C2286e.m5277b(getContext(), b, C3406l.MaterialButton_icon);
        this.f1276r = b.getInteger(C3406l.MaterialButton_iconGravity, 1);
        this.f1271m = b.getDimensionPixelSize(C3406l.MaterialButton_iconSize, 0);
        C3445a aVar = new C3445a(this, C3342j.m7744a(context2, attributeSet2, i2, f1264u).mo9102a());
        this.f1265g = aVar;
        if (aVar != null) {
            aVar.f8716c = b.getDimensionPixelOffset(C3406l.MaterialButton_android_insetLeft, 0);
            aVar.f8717d = b.getDimensionPixelOffset(C3406l.MaterialButton_android_insetRight, 0);
            aVar.f8718e = b.getDimensionPixelOffset(C3406l.MaterialButton_android_insetTop, 0);
            aVar.f8719f = b.getDimensionPixelOffset(C3406l.MaterialButton_android_insetBottom, 0);
            if (b.hasValue(C3406l.MaterialButton_cornerRadius)) {
                int dimensionPixelSize = b.getDimensionPixelSize(C3406l.MaterialButton_cornerRadius, -1);
                aVar.f8720g = dimensionPixelSize;
                aVar.mo9293a(aVar.f8715b.mo9099a((float) dimensionPixelSize));
                aVar.f8729p = true;
            }
            aVar.f8721h = b.getDimensionPixelSize(C3406l.MaterialButton_strokeWidth, 0);
            aVar.f8722i = C2286e.m5175a(b.getInt(C3406l.MaterialButton_backgroundTintMode, -1), Mode.SRC_IN);
            aVar.f8723j = C2286e.m5173a(aVar.f8714a.getContext(), b, C3406l.MaterialButton_backgroundTint);
            aVar.f8724k = C2286e.m5173a(aVar.f8714a.getContext(), b, C3406l.MaterialButton_strokeColor);
            aVar.f8725l = C2286e.m5173a(aVar.f8714a.getContext(), b, C3406l.MaterialButton_rippleColor);
            aVar.f8730q = b.getBoolean(C3406l.MaterialButton_android_checkable, false);
            int dimensionPixelSize2 = b.getDimensionPixelSize(C3406l.MaterialButton_elevation, 0);
            int p = C1404o.m3555p(aVar.f8714a);
            int paddingTop = aVar.f8714a.getPaddingTop();
            int paddingEnd = aVar.f8714a.getPaddingEnd();
            int paddingBottom = aVar.f8714a.getPaddingBottom();
            MaterialButton materialButton = aVar.f8714a;
            C3337g gVar = new C3337g(aVar.f8715b);
            gVar.mo9062a(aVar.f8714a.getContext());
            gVar.setTintList(aVar.f8723j);
            Mode mode = aVar.f8722i;
            if (mode != null) {
                gVar.setTintMode(mode);
            }
            gVar.mo9061a((float) aVar.f8721h, aVar.f8724k);
            C3337g gVar2 = new C3337g(aVar.f8715b);
            gVar2.setTint(0);
            gVar2.mo9060a((float) aVar.f8721h, aVar.f8727n ? C2286e.m5156a((View) aVar.f8714a, C3294b.colorSurface) : 0);
            C3337g gVar3 = new C3337g(aVar.f8715b);
            aVar.f8726m = gVar3;
            gVar3.setTint(-1);
            ColorStateList a = C3326a.m7708a(aVar.f8725l);
            InsetDrawable insetDrawable = new InsetDrawable(new LayerDrawable(new Drawable[]{gVar2, gVar}), aVar.f8716c, aVar.f8718e, aVar.f8717d, aVar.f8719f);
            RippleDrawable rippleDrawable = new RippleDrawable(a, insetDrawable, aVar.f8726m);
            aVar.f8731r = rippleDrawable;
            materialButton.setInternalBackground(rippleDrawable);
            C3337g b2 = aVar.mo9294b();
            if (b2 != null) {
                b2.mo9059a((float) dimensionPixelSize2);
            }
            aVar.f8714a.setPaddingRelative(p + aVar.f8716c, paddingTop + aVar.f8718e, paddingEnd + aVar.f8717d, paddingBottom + aVar.f8719f);
            b.recycle();
            setCompoundDrawablePadding(this.f1273o);
            mo1785a(this.f1270l != null);
            return;
        }
        throw null;
    }

    private String getA11yClassName() {
        return (mo1786a() ? CompoundButton.class : Button.class).getName();
    }

    /* renamed from: a */
    public boolean mo1786a() {
        C3445a aVar = this.f1265g;
        return aVar != null && aVar.f8730q;
    }

    /* renamed from: b */
    public final boolean mo1787b() {
        C3445a aVar = this.f1265g;
        return aVar != null && !aVar.f8728o;
    }

    /* renamed from: c */
    public final void mo1788c() {
        if (!(this.f1270l == null || getLayout() == null)) {
            int i = this.f1276r;
            boolean z = true;
            if (i == 1 || i == 3) {
                this.f1272n = 0;
                mo1785a(false);
            } else {
                TextPaint paint = getPaint();
                String charSequence = getText().toString();
                if (getTransformationMethod() != null) {
                    charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
                }
                int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
                int i2 = this.f1271m;
                if (i2 == 0) {
                    i2 = this.f1270l.getIntrinsicWidth();
                }
                int measuredWidth = (((((getMeasuredWidth() - min) - C1404o.m3554o(this)) - i2) - this.f1273o) - getPaddingStart()) / 2;
                boolean z2 = C1404o.m3551l(this) == 1;
                if (this.f1276r != 4) {
                    z = false;
                }
                if (z2 != z) {
                    measuredWidth = -measuredWidth;
                }
                if (this.f1272n != measuredWidth) {
                    this.f1272n = measuredWidth;
                    mo1785a(false);
                }
            }
        }
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (mo1787b()) {
            return this.f1265g.f8720g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f1270l;
    }

    public int getIconGravity() {
        return this.f1276r;
    }

    public int getIconPadding() {
        return this.f1273o;
    }

    public int getIconSize() {
        return this.f1271m;
    }

    public ColorStateList getIconTint() {
        return this.f1269k;
    }

    public Mode getIconTintMode() {
        return this.f1268j;
    }

    public ColorStateList getRippleColor() {
        if (mo1787b()) {
            return this.f1265g.f8725l;
        }
        return null;
    }

    public C3342j getShapeAppearanceModel() {
        if (mo1787b()) {
            return this.f1265g.f8715b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (mo1787b()) {
            return this.f1265g.f8724k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (mo1787b()) {
            return this.f1265g.f8721h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (mo1787b()) {
            return this.f1265g.f8723j;
        }
        return super.getSupportBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        if (mo1787b()) {
            return this.f1265g.f8722i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f1274p;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2286e.m5230a((View) this, this.f1265g.mo9294b());
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo1786a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f1262s);
        }
        if (this.f1274p) {
            Button.mergeDrawableStates(onCreateDrawableState, f1263t);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1274p);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo1786a());
        accessibilityNodeInfo.setChecked(this.f1274p);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo1788c();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        mo1788c();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (mo1787b()) {
            C3445a aVar = this.f1265g;
            if (aVar.mo9294b() != null) {
                aVar.mo9294b().setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (mo1787b()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                C3445a aVar = this.f1265g;
                aVar.f8728o = true;
                aVar.f8714a.setSupportBackgroundTintList(aVar.f8723j);
                aVar.f8714a.setSupportBackgroundTintMode(aVar.f8722i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C1070a.m2602b(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (mo1787b()) {
            this.f1265g.f8730q = z;
        }
    }

    public void setChecked(boolean z) {
        if (mo1786a() && isEnabled() && this.f1274p != z) {
            this.f1274p = z;
            refreshDrawableState();
            if (!this.f1275q) {
                this.f1275q = true;
                Iterator it = this.f1266h.iterator();
                while (it.hasNext()) {
                    ((C0224a) it.next()).mo1846a(this, this.f1274p);
                }
                this.f1275q = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (mo1787b()) {
            C3445a aVar = this.f1265g;
            if (!aVar.f8729p || aVar.f8720g != i) {
                aVar.f8720g = i;
                aVar.f8729p = true;
                aVar.mo9293a(aVar.f8715b.mo9099a((float) i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (mo1787b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (mo1787b()) {
            C3337g b = this.f1265g.mo9294b();
            C3339b bVar = b.f8365e;
            if (bVar.f8401o != f) {
                bVar.f8401o = f;
                b.mo9086j();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f1270l != drawable) {
            this.f1270l = drawable;
            mo1785a(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.f1276r != i) {
            this.f1276r = i;
            mo1788c();
        }
    }

    public void setIconPadding(int i) {
        if (this.f1273o != i) {
            this.f1273o = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C1070a.m2602b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f1271m != i) {
            this.f1271m = i;
            mo1785a(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1269k != colorStateList) {
            this.f1269k = colorStateList;
            mo1785a(false);
        }
    }

    public void setIconTintMode(Mode mode) {
        if (this.f1268j != mode) {
            this.f1268j = mode;
            mo1785a(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C1070a.m2601a(getContext(), i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(C0225b bVar) {
        this.f1267i = bVar;
    }

    public void setPressed(boolean z) {
        C0225b bVar = this.f1267i;
        if (bVar != null) {
            bVar.mo1847a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (mo1787b()) {
            C3445a aVar = this.f1265g;
            if (aVar.f8725l != colorStateList) {
                aVar.f8725l = colorStateList;
                if (aVar.f8714a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) aVar.f8714a.getBackground()).setColor(C3326a.m7708a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (mo1787b()) {
            setRippleColor(C1070a.m2601a(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C3342j jVar) {
        if (mo1787b()) {
            this.f1265g.mo9293a(jVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (mo1787b()) {
            C3445a aVar = this.f1265g;
            aVar.f8727n = z;
            aVar.mo9296d();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (mo1787b()) {
            C3445a aVar = this.f1265g;
            if (aVar.f8724k != colorStateList) {
                aVar.f8724k = colorStateList;
                aVar.mo9296d();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (mo1787b()) {
            setStrokeColor(C1070a.m2601a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (mo1787b()) {
            C3445a aVar = this.f1265g;
            if (aVar.f8721h != i) {
                aVar.f8721h = i;
                aVar.mo9296d();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (mo1787b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (mo1787b()) {
            C3445a aVar = this.f1265g;
            if (aVar.f8723j != colorStateList) {
                aVar.f8723j = colorStateList;
                if (aVar.mo9294b() != null) {
                    aVar.mo9294b().setTintList(aVar.f8723j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (mo1787b()) {
            C3445a aVar = this.f1265g;
            if (aVar.f8722i != mode) {
                aVar.f8722i = mode;
                if (aVar.mo9294b() != null && aVar.f8722i != null) {
                    aVar.mo9294b().setTintMode(aVar.f8722i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void toggle() {
        setChecked(!this.f1274p);
    }

    /* renamed from: a */
    public final void mo1785a(boolean z) {
        Drawable drawable = this.f1270l;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f1270l = mutate;
            mutate.setTintList(this.f1269k);
            Mode mode = this.f1268j;
            if (mode != null) {
                this.f1270l.setTintMode(mode);
            }
            int i = this.f1271m;
            if (i == 0) {
                i = this.f1270l.getIntrinsicWidth();
            }
            int i2 = this.f1271m;
            if (i2 == 0) {
                i2 = this.f1270l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1270l;
            int i3 = this.f1272n;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.f1276r;
        boolean z3 = i4 == 1 || i4 == 2;
        if (z) {
            Drawable drawable3 = this.f1270l;
            if (z3) {
                setCompoundDrawablesRelative(drawable3, null, null, null);
            } else {
                setCompoundDrawablesRelative(null, null, drawable3, null);
            }
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable4 = compoundDrawablesRelative[0];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((z3 && drawable4 != this.f1270l) || (!z3 && drawable5 != this.f1270l)) {
            z2 = true;
        }
        if (z2) {
            Drawable drawable6 = this.f1270l;
            if (z3) {
                setCompoundDrawablesRelative(drawable6, null, null, null);
            } else {
                setCompoundDrawablesRelative(null, null, drawable6, null);
            }
        }
    }
}
