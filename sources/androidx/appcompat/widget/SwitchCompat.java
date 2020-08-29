package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.VelocityTracker;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import p124p.p126b.C1018a;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p126b.p136q.C1143a1;
import p124p.p126b.p136q.C1145b0;
import p124p.p126b.p136q.C1214v;
import p124p.p150h.p162l.C1404o;

public class SwitchCompat extends CompoundButton {

    /* renamed from: R */
    public static final Property<SwitchCompat, Float> f319R = new C0054a(Float.class, "thumbPos");

    /* renamed from: S */
    public static final int[] f320S = {16842912};

    /* renamed from: A */
    public int f321A;

    /* renamed from: B */
    public float f322B;

    /* renamed from: C */
    public int f323C;

    /* renamed from: D */
    public int f324D;

    /* renamed from: E */
    public int f325E;

    /* renamed from: F */
    public int f326F;

    /* renamed from: G */
    public int f327G;

    /* renamed from: H */
    public int f328H;

    /* renamed from: I */
    public int f329I;

    /* renamed from: J */
    public final TextPaint f330J;

    /* renamed from: K */
    public ColorStateList f331K;

    /* renamed from: L */
    public Layout f332L;

    /* renamed from: M */
    public Layout f333M;

    /* renamed from: N */
    public TransformationMethod f334N;

    /* renamed from: O */
    public ObjectAnimator f335O;

    /* renamed from: P */
    public final C1214v f336P;

    /* renamed from: Q */
    public final Rect f337Q;

    /* renamed from: e */
    public Drawable f338e;

    /* renamed from: f */
    public ColorStateList f339f;

    /* renamed from: g */
    public Mode f340g;

    /* renamed from: h */
    public boolean f341h;

    /* renamed from: i */
    public boolean f342i;

    /* renamed from: j */
    public Drawable f343j;

    /* renamed from: k */
    public ColorStateList f344k;

    /* renamed from: l */
    public Mode f345l;

    /* renamed from: m */
    public boolean f346m;

    /* renamed from: n */
    public boolean f347n;

    /* renamed from: o */
    public int f348o;

    /* renamed from: p */
    public int f349p;

    /* renamed from: q */
    public int f350q;

    /* renamed from: r */
    public boolean f351r;

    /* renamed from: s */
    public CharSequence f352s;

    /* renamed from: t */
    public CharSequence f353t;

    /* renamed from: u */
    public boolean f354u;

    /* renamed from: v */
    public int f355v;

    /* renamed from: w */
    public int f356w;

    /* renamed from: x */
    public float f357x;

    /* renamed from: y */
    public float f358y;

    /* renamed from: z */
    public VelocityTracker f359z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    public static class C0054a extends Property<SwitchCompat, Float> {
        public C0054a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(((SwitchCompat) obj).f322B);
        }

        public void set(Object obj, Object obj2) {
            ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1018a.switchStyle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0108, code lost:
        if (r7 != null) goto L_0x010f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r10.<init>(r11, r12, r13)
            r0 = 0
            r10.f339f = r0
            r10.f340g = r0
            r1 = 0
            r10.f341h = r1
            r10.f342i = r1
            r10.f344k = r0
            r10.f345l = r0
            r10.f346m = r1
            r10.f347n = r1
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r10.f359z = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r10.f337Q = r2
            android.text.TextPaint r2 = new android.text.TextPaint
            r3 = 1
            r2.<init>(r3)
            r10.f330J = r2
            android.content.res.Resources r2 = r10.getResources()
            android.text.TextPaint r4 = r10.f330J
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r4.density = r2
            int[] r2 = p124p.p126b.C1027j.SwitchCompat
            p.b.q.u0 r4 = new p.b.q.u0
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r12, r2, r13, r1)
            r4.<init>(r11, r2)
            int r2 = p124p.p126b.C1027j.SwitchCompat_android_thumb
            android.graphics.drawable.Drawable r2 = r4.mo5318b(r2)
            r10.f338e = r2
            if (r2 == 0) goto L_0x0050
            r2.setCallback(r10)
        L_0x0050:
            int r2 = p124p.p126b.C1027j.SwitchCompat_track
            android.graphics.drawable.Drawable r2 = r4.mo5318b(r2)
            r10.f343j = r2
            if (r2 == 0) goto L_0x005d
            r2.setCallback(r10)
        L_0x005d:
            int r2 = p124p.p126b.C1027j.SwitchCompat_android_textOn
            java.lang.CharSequence r2 = r4.mo5324e(r2)
            r10.f352s = r2
            int r2 = p124p.p126b.C1027j.SwitchCompat_android_textOff
            java.lang.CharSequence r2 = r4.mo5324e(r2)
            r10.f353t = r2
            int r2 = p124p.p126b.C1027j.SwitchCompat_showText
            boolean r2 = r4.mo5316a(r2, r3)
            r10.f354u = r2
            int r2 = p124p.p126b.C1027j.SwitchCompat_thumbTextPadding
            int r2 = r4.mo5319c(r2, r1)
            r10.f348o = r2
            int r2 = p124p.p126b.C1027j.SwitchCompat_switchMinWidth
            int r2 = r4.mo5319c(r2, r1)
            r10.f349p = r2
            int r2 = p124p.p126b.C1027j.SwitchCompat_switchPadding
            int r2 = r4.mo5319c(r2, r1)
            r10.f350q = r2
            int r2 = p124p.p126b.C1027j.SwitchCompat_splitTrack
            boolean r2 = r4.mo5316a(r2, r1)
            r10.f351r = r2
            int r2 = p124p.p126b.C1027j.SwitchCompat_thumbTint
            android.content.res.ColorStateList r2 = r4.mo5314a(r2)
            if (r2 == 0) goto L_0x00a1
            r10.f339f = r2
            r10.f341h = r3
        L_0x00a1:
            int r2 = p124p.p126b.C1027j.SwitchCompat_thumbTintMode
            r5 = -1
            int r2 = r4.mo5321d(r2, r5)
            android.graphics.PorterDuff$Mode r2 = p124p.p126b.p136q.C1145b0.m2889a(r2, r0)
            android.graphics.PorterDuff$Mode r6 = r10.f340g
            if (r6 == r2) goto L_0x00b4
            r10.f340g = r2
            r10.f342i = r3
        L_0x00b4:
            boolean r2 = r10.f341h
            if (r2 != 0) goto L_0x00bc
            boolean r2 = r10.f342i
            if (r2 == 0) goto L_0x00bf
        L_0x00bc:
            r10.mo386a()
        L_0x00bf:
            int r2 = p124p.p126b.C1027j.SwitchCompat_trackTint
            android.content.res.ColorStateList r2 = r4.mo5314a(r2)
            if (r2 == 0) goto L_0x00cb
            r10.f344k = r2
            r10.f346m = r3
        L_0x00cb:
            int r2 = p124p.p126b.C1027j.SwitchCompat_trackTintMode
            int r2 = r4.mo5321d(r2, r5)
            android.graphics.PorterDuff$Mode r2 = p124p.p126b.p136q.C1145b0.m2889a(r2, r0)
            android.graphics.PorterDuff$Mode r6 = r10.f345l
            if (r6 == r2) goto L_0x00dd
            r10.f345l = r2
            r10.f347n = r3
        L_0x00dd:
            boolean r2 = r10.f346m
            if (r2 != 0) goto L_0x00e5
            boolean r2 = r10.f347n
            if (r2 == 0) goto L_0x00e8
        L_0x00e5:
            r10.mo387b()
        L_0x00e8:
            int r2 = p124p.p126b.C1027j.SwitchCompat_switchTextAppearance
            int r2 = r4.mo5327g(r2, r1)
            if (r2 == 0) goto L_0x01a5
            int[] r6 = p124p.p126b.C1027j.TextAppearance
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r2, r6)
            int r6 = p124p.p126b.C1027j.TextAppearance_android_textColor
            boolean r7 = r2.hasValue(r6)
            if (r7 == 0) goto L_0x010b
            int r7 = r2.getResourceId(r6, r1)
            if (r7 == 0) goto L_0x010b
            android.content.res.ColorStateList r7 = p124p.p126b.p128l.p129a.C1070a.m2601a(r11, r7)
            if (r7 == 0) goto L_0x010b
            goto L_0x010f
        L_0x010b:
            android.content.res.ColorStateList r7 = r2.getColorStateList(r6)
        L_0x010f:
            if (r7 == 0) goto L_0x0112
            goto L_0x0116
        L_0x0112:
            android.content.res.ColorStateList r7 = r10.getTextColors()
        L_0x0116:
            r10.f331K = r7
            int r6 = p124p.p126b.C1027j.TextAppearance_android_textSize
            int r6 = r2.getDimensionPixelSize(r6, r1)
            if (r6 == 0) goto L_0x0133
            float r6 = (float) r6
            android.text.TextPaint r7 = r10.f330J
            float r7 = r7.getTextSize()
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0133
            android.text.TextPaint r7 = r10.f330J
            r7.setTextSize(r6)
            r10.requestLayout()
        L_0x0133:
            int r6 = p124p.p126b.C1027j.TextAppearance_android_typeface
            int r6 = r2.getInt(r6, r5)
            int r7 = p124p.p126b.C1027j.TextAppearance_android_textStyle
            int r5 = r2.getInt(r7, r5)
            r7 = 2
            if (r6 == r3) goto L_0x014f
            if (r6 == r7) goto L_0x014c
            r8 = 3
            if (r6 == r8) goto L_0x0149
            r6 = r0
            goto L_0x0151
        L_0x0149:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            goto L_0x0151
        L_0x014c:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
            goto L_0x0151
        L_0x014f:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
        L_0x0151:
            r8 = 0
            if (r5 <= 0) goto L_0x0182
            if (r6 != 0) goto L_0x015b
            android.graphics.Typeface r6 = android.graphics.Typeface.defaultFromStyle(r5)
            goto L_0x015f
        L_0x015b:
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r5)
        L_0x015f:
            r10.setSwitchTypeface(r6)
            if (r6 == 0) goto L_0x0169
            int r6 = r6.getStyle()
            goto L_0x016a
        L_0x0169:
            r6 = r1
        L_0x016a:
            int r6 = ~r6
            r5 = r5 & r6
            android.text.TextPaint r6 = r10.f330J
            r9 = r5 & 1
            if (r9 == 0) goto L_0x0173
            goto L_0x0174
        L_0x0173:
            r3 = r1
        L_0x0174:
            r6.setFakeBoldText(r3)
            android.text.TextPaint r3 = r10.f330J
            r5 = r5 & r7
            if (r5 == 0) goto L_0x017e
            r8 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x017e:
            r3.setTextSkewX(r8)
            goto L_0x018f
        L_0x0182:
            android.text.TextPaint r3 = r10.f330J
            r3.setFakeBoldText(r1)
            android.text.TextPaint r3 = r10.f330J
            r3.setTextSkewX(r8)
            r10.setSwitchTypeface(r6)
        L_0x018f:
            int r3 = p124p.p126b.C1027j.TextAppearance_textAllCaps
            boolean r1 = r2.getBoolean(r3, r1)
            if (r1 == 0) goto L_0x01a0
            p.b.o.a r0 = new p.b.o.a
            android.content.Context r1 = r10.getContext()
            r0.<init>(r1)
        L_0x01a0:
            r10.f334N = r0
            r2.recycle()
        L_0x01a5:
            p.b.q.v r0 = new p.b.q.v
            r0.<init>(r10)
            r10.f336P = r0
            r0.mo5334a(r12, r13)
            android.content.res.TypedArray r12 = r4.f3426b
            r12.recycle()
            android.view.ViewConfiguration r11 = android.view.ViewConfiguration.get(r11)
            int r12 = r11.getScaledTouchSlop()
            r10.f356w = r12
            int r11 = r11.getScaledMinimumFlingVelocity()
            r10.f321A = r11
            r10.refreshDrawableState()
            boolean r11 = r10.isChecked()
            r10.setChecked(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private boolean getTargetCheckedState() {
        return this.f322B > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C1143a1.m2887a(this) ? 1.0f - this.f322B : this.f322B) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f343j;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f337Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f338e;
        Rect c = drawable2 != null ? C1145b0.m2892c(drawable2) : C1145b0.f3197c;
        return ((((this.f323C - this.f325E) - rect.left) - rect.right) - c.left) - c.right;
    }

    /* renamed from: a */
    public final Layout mo385a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f334N;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f330J;
        StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        return staticLayout;
    }

    /* renamed from: a */
    public final void mo386a() {
        if (this.f338e == null) {
            return;
        }
        if (this.f341h || this.f342i) {
            Drawable mutate = this.f338e.mutate();
            this.f338e = mutate;
            if (this.f341h) {
                mutate.setTintList(this.f339f);
            }
            if (this.f342i) {
                this.f338e.setTintMode(this.f340g);
            }
            if (this.f338e.isStateful()) {
                this.f338e.setState(getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final void mo387b() {
        if (this.f343j == null) {
            return;
        }
        if (this.f346m || this.f347n) {
            Drawable mutate = this.f343j.mutate();
            this.f343j = mutate;
            if (this.f346m) {
                mutate.setTintList(this.f344k);
            }
            if (this.f347n) {
                this.f343j.setTintMode(this.f345l);
            }
            if (this.f343j.isStateful()) {
                this.f343j.setState(getDrawableState());
            }
        }
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f337Q;
        int i3 = this.f326F;
        int i4 = this.f327G;
        int i5 = this.f328H;
        int i6 = this.f329I;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f338e;
        Rect c = drawable != null ? C1145b0.m2892c(drawable) : C1145b0.f3197c;
        Drawable drawable2 = this.f343j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (c != null) {
                int i8 = c.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = c.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = c.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = c.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f343j.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f343j.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f338e;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f325E + rect.right;
            this.f338e.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f338e;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.f343j;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f338e;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f343j;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C1143a1.m2887a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f323C;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingLeft += this.f350q;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C1143a1.m2887a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f323C;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingRight += this.f350q;
        }
        return compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f354u;
    }

    public boolean getSplitTrack() {
        return this.f351r;
    }

    public int getSwitchMinWidth() {
        return this.f349p;
    }

    public int getSwitchPadding() {
        return this.f350q;
    }

    public CharSequence getTextOff() {
        return this.f353t;
    }

    public CharSequence getTextOn() {
        return this.f352s;
    }

    public Drawable getThumbDrawable() {
        return this.f338e;
    }

    public int getThumbTextPadding() {
        return this.f348o;
    }

    public ColorStateList getThumbTintList() {
        return this.f339f;
    }

    public Mode getThumbTintMode() {
        return this.f340g;
    }

    public Drawable getTrackDrawable() {
        return this.f343j;
    }

    public ColorStateList getTrackTintList() {
        return this.f344k;
    }

    public Mode getTrackTintMode() {
        return this.f345l;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f338e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f343j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f335O;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f335O.end();
            this.f335O = null;
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f320S);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f337Q;
        Drawable drawable = this.f343j;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f327G + rect.top;
        int i3 = this.f329I - rect.bottom;
        Drawable drawable2 = this.f338e;
        if (drawable != null) {
            if (!this.f351r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect c = C1145b0.m2892c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c.left;
                rect.right -= c.right;
                int save = canvas.save();
                canvas.clipRect(rect, Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f332L : this.f333M;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f331K;
            if (colorStateList != null) {
                this.f330J.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f330J.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i2 + i3) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f352s : this.f353t;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.f338e != null) {
            Rect rect = this.f337Q;
            Drawable drawable = this.f343j;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c = C1145b0.m2892c(this.f338e);
            i5 = Math.max(0, c.left - rect.left);
            i10 = Math.max(0, c.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C1143a1.m2887a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f323C + i7) - i5) - i10;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i10;
            i7 = (i6 - this.f323C) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i11 = this.f324D;
            int i12 = height - (i11 / 2);
            int i13 = i12;
            i8 = i11 + i12;
            i9 = i13;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.f324D + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f324D;
        }
        this.f326F = i7;
        this.f327G = i9;
        this.f329I = i8;
        this.f328H = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f354u) {
            if (this.f332L == null) {
                this.f332L = mo385a(this.f352s);
            }
            if (this.f333M == null) {
                this.f333M = mo385a(this.f353t);
            }
        }
        Rect rect = this.f337Q;
        Drawable drawable = this.f338e;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f338e.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f338e.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (this.f354u) {
            i5 = (this.f348o * 2) + Math.max(this.f332L.getWidth(), this.f333M.getWidth());
        } else {
            i5 = 0;
        }
        this.f325E = Math.max(i5, i4);
        Drawable drawable2 = this.f343j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.f343j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.f338e;
        if (drawable3 != null) {
            Rect c = C1145b0.m2892c(drawable3);
            i7 = Math.max(i7, c.left);
            i8 = Math.max(i8, c.right);
        }
        int max = Math.max(this.f349p, (this.f325E * 2) + i7 + i8);
        int max2 = Math.max(i6, i3);
        this.f323C = max;
        this.f324D = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f352s : this.f353t;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != 3) goto L_0x0152;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            android.view.VelocityTracker r0 = r10.f359z
            r0.addMovement(r11)
            int r0 = r11.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00ff
            r3 = 3
            r4 = 0
            r5 = 2
            if (r0 == r2) goto L_0x0092
            if (r0 == r5) goto L_0x0018
            if (r0 == r3) goto L_0x0092
            goto L_0x0152
        L_0x0018:
            int r0 = r10.f355v
            if (r0 == r2) goto L_0x005e
            if (r0 == r5) goto L_0x0020
            goto L_0x0152
        L_0x0020:
            float r11 = r11.getX()
            int r0 = r10.getThumbScrollRange()
            float r1 = r10.f357x
            float r1 = r11 - r1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0033
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x003c
        L_0x0033:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r1 = r3
            goto L_0x003c
        L_0x0039:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = r0
        L_0x003c:
            boolean r0 = p124p.p126b.p136q.C1143a1.m2887a(r10)
            if (r0 == 0) goto L_0x0043
            float r1 = -r1
        L_0x0043:
            float r0 = r10.f322B
            float r0 = r0 + r1
            int r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x004b
            goto L_0x0052
        L_0x004b:
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0051
            r4 = r3
            goto L_0x0052
        L_0x0051:
            r4 = r0
        L_0x0052:
            float r0 = r10.f322B
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005d
            r10.f357x = r11
            r10.setThumbPosition(r4)
        L_0x005d:
            return r2
        L_0x005e:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r10.f357x
            float r3 = r0 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.f356w
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0084
            float r3 = r10.f358y
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.f356w
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0152
        L_0x0084:
            r10.f355v = r5
            android.view.ViewParent r11 = r10.getParent()
            r11.requestDisallowInterceptTouchEvent(r2)
            r10.f357x = r0
            r10.f358y = r1
            return r2
        L_0x0092:
            int r0 = r10.f355v
            if (r0 != r5) goto L_0x00f7
            r10.f355v = r1
            int r0 = r11.getAction()
            if (r0 != r2) goto L_0x00a6
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto L_0x00a6
            r0 = r2
            goto L_0x00a7
        L_0x00a6:
            r0 = r1
        L_0x00a7:
            boolean r5 = r10.isChecked()
            if (r0 == 0) goto L_0x00dd
            android.view.VelocityTracker r0 = r10.f359z
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
            android.view.VelocityTracker r0 = r10.f359z
            float r0 = r0.getXVelocity()
            float r6 = java.lang.Math.abs(r0)
            int r7 = r10.f321A
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d8
            boolean r6 = p124p.p126b.p136q.C1143a1.m2887a(r10)
            if (r6 == 0) goto L_0x00d0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d6
            goto L_0x00d4
        L_0x00d0:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d6
        L_0x00d4:
            r0 = r2
            goto L_0x00de
        L_0x00d6:
            r0 = r1
            goto L_0x00de
        L_0x00d8:
            boolean r0 = r10.getTargetCheckedState()
            goto L_0x00de
        L_0x00dd:
            r0 = r5
        L_0x00de:
            if (r0 == r5) goto L_0x00e3
            r10.playSoundEffect(r1)
        L_0x00e3:
            r10.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r11)
            r0.setAction(r3)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r11)
            return r2
        L_0x00f7:
            r10.f355v = r1
            android.view.VelocityTracker r0 = r10.f359z
            r0.clear()
            goto L_0x0152
        L_0x00ff:
            float r0 = r11.getX()
            float r3 = r11.getY()
            boolean r4 = r10.isEnabled()
            if (r4 == 0) goto L_0x0152
            android.graphics.drawable.Drawable r4 = r10.f338e
            if (r4 != 0) goto L_0x0112
            goto L_0x014a
        L_0x0112:
            int r4 = r10.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r10.f338e
            android.graphics.Rect r6 = r10.f337Q
            r5.getPadding(r6)
            int r5 = r10.f327G
            int r6 = r10.f356w
            int r5 = r5 - r6
            int r7 = r10.f326F
            int r7 = r7 + r4
            int r7 = r7 - r6
            int r4 = r10.f325E
            int r4 = r4 + r7
            android.graphics.Rect r8 = r10.f337Q
            int r9 = r8.left
            int r4 = r4 + r9
            int r8 = r8.right
            int r4 = r4 + r8
            int r4 = r4 + r6
            int r8 = r10.f329I
            int r8 = r8 + r6
            float r6 = (float) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x014a
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x014a
            float r4 = (float) r5
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x014a
            float r4 = (float) r8
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x014a
            r1 = r2
        L_0x014a:
            if (r1 == 0) goto L_0x0152
            r10.f355v = r2
            r10.f357x = r0
            r10.f358y = r3
        L_0x0152:
            boolean r11 = super.onTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        float f = 1.0f;
        if (getWindowToken() == null || !C1404o.m3563x(this)) {
            ObjectAnimator objectAnimator = this.f335O;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!isChecked) {
                f = 0.0f;
            }
            setThumbPosition(f);
            return;
        }
        if (!isChecked) {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f319R, new float[]{f});
        this.f335O = ofFloat;
        ofFloat.setDuration(250);
        this.f335O.setAutoCancel(true);
        this.f335O.start();
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1061o.m2460a((TextView) this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f354u != z) {
            this.f354u = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f351r = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f349p = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f350q = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f330J.getTypeface() != null && !this.f330J.getTypeface().equals(typeface)) || (this.f330J.getTypeface() == null && typeface != null)) {
            this.f330J.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f353t = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f352s = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f338e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f338e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f322B = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C1070a.m2602b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f348o = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f339f = colorStateList;
        this.f341h = true;
        mo386a();
    }

    public void setThumbTintMode(Mode mode) {
        this.f340g = mode;
        this.f342i = true;
        mo386a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f343j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f343j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C1070a.m2602b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f344k = colorStateList;
        this.f346m = true;
        mo387b();
    }

    public void setTrackTintMode(Mode mode) {
        this.f345l = mode;
        this.f347n = true;
        mo387b();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f338e || drawable == this.f343j;
    }
}
