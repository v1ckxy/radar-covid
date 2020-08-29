package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView.BufferType;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.lang.ref.WeakReference;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p150h.p160j.C1369a;
import p124p.p150h.p160j.C1373c;
import p124p.p150h.p160j.C1374d;
import p124p.p150h.p160j.C1374d.C1378d;
import p124p.p150h.p162l.C1387a;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.p163y.C1429b;
import p124p.p150h.p162l.p163y.C1429b.C1430a;
import p124p.p167j.p169b.C1461a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.C3369j;
import p213q.p217b.p218a.p271c.p275d0.C3321b;
import p213q.p217b.p218a.p271c.p275d0.C3324d;
import p213q.p217b.p218a.p271c.p276e0.C3326a;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p278g0.C3337g.C3339b;
import p213q.p217b.p218a.p271c.p278g0.C3342j;
import p213q.p217b.p218a.p271c.p278g0.C3355n;
import p213q.p217b.p218a.p271c.p283m.C3413g;
import p213q.p217b.p218a.p271c.p292v.C3450b;
import p213q.p217b.p218a.p271c.p292v.C3450b.C3451a;

public class Chip extends AppCompatCheckBox implements C3451a, C3355n {

    /* renamed from: x */
    public static final Rect f1277x = new Rect();

    /* renamed from: y */
    public static final int[] f1278y = {16842913};

    /* renamed from: z */
    public static final int[] f1279z = {16842911};

    /* renamed from: h */
    public C3450b f1280h;

    /* renamed from: i */
    public InsetDrawable f1281i;

    /* renamed from: j */
    public RippleDrawable f1282j;

    /* renamed from: k */
    public OnClickListener f1283k;

    /* renamed from: l */
    public OnCheckedChangeListener f1284l;

    /* renamed from: m */
    public boolean f1285m;

    /* renamed from: n */
    public boolean f1286n;

    /* renamed from: o */
    public boolean f1287o;

    /* renamed from: p */
    public boolean f1288p;

    /* renamed from: q */
    public boolean f1289q;

    /* renamed from: r */
    public int f1290r;

    /* renamed from: s */
    public int f1291s;

    /* renamed from: t */
    public final C0227b f1292t;

    /* renamed from: u */
    public final Rect f1293u;

    /* renamed from: v */
    public final RectF f1294v;

    /* renamed from: w */
    public final C3324d f1295w;

    /* renamed from: com.google.android.material.chip.Chip$a */
    public class C0226a extends C3324d {
        public C0226a() {
        }

        /* renamed from: a */
        public void mo1990a(int i) {
        }

        /* renamed from: a */
        public void mo1991a(Typeface typeface, boolean z) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            C3450b bVar = chip.f1280h;
            if (bVar.f8758G0) {
                charSequence = bVar.f8759H;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    public class C0227b extends C1461a {
        public C0227b(Chip chip) {
            super(chip);
        }

        /* renamed from: a */
        public void mo1993a(List<Integer> list) {
            boolean z = false;
            list.add(Integer.valueOf(0));
            if (Chip.this.mo1850b()) {
                C3450b bVar = Chip.this.f1280h;
                if (bVar != null && bVar.f8767N) {
                    z = true;
                }
                if (z) {
                    list.add(Integer.valueOf(1));
                }
            }
        }

        /* renamed from: a */
        public boolean mo1994a(int i, int i2, Bundle bundle) {
            boolean z = false;
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    Chip chip = Chip.this;
                    chip.playSoundEffect(0);
                    OnClickListener onClickListener = chip.f1283k;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    chip.f1292t.mo5991a(1, 1);
                }
            }
            return z;
        }

        /* renamed from: a */
        public void mo1992a(int i, C1429b bVar) {
            CharSequence charSequence = Objects.EMPTY_STRING;
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C3369j.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(i2, objArr).trim();
                }
                bVar.f4203a.setContentDescription(closeIconContentDescription);
                bVar.f4203a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                bVar.mo5947a(C1430a.f4206e);
                bVar.f4203a.setEnabled(Chip.this.isEnabled());
                return;
            }
            bVar.f4203a.setContentDescription(charSequence);
            bVar.f4203a.setBoundsInParent(Chip.f1277x);
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3294b.chipStyle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0308  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            r12 = this;
            r12.<init>(r13, r14, r15)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.f1293u = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r12.f1294v = r0
            com.google.android.material.chip.Chip$a r0 = new com.google.android.material.chip.Chip$a
            r0.<init>()
            r12.f1295w = r0
            r0 = 8388627(0x800013, float:1.175497E-38)
            r1 = 1
            if (r14 != 0) goto L_0x001f
            goto L_0x007f
        L_0x001f:
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            java.lang.String r3 = "background"
            java.lang.String r3 = r14.getAttributeValue(r2, r3)
            java.lang.String r4 = "Chip"
            if (r3 == 0) goto L_0x0030
            java.lang.String r3 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r4, r3)
        L_0x0030:
            java.lang.String r3 = "drawableLeft"
            java.lang.String r3 = r14.getAttributeValue(r2, r3)
            if (r3 != 0) goto L_0x0330
            java.lang.String r3 = "drawableStart"
            java.lang.String r3 = r14.getAttributeValue(r2, r3)
            if (r3 != 0) goto L_0x0328
            java.lang.String r3 = "drawableEnd"
            java.lang.String r3 = r14.getAttributeValue(r2, r3)
            java.lang.String r5 = "Please set end drawable using R.attr#closeIcon."
            if (r3 != 0) goto L_0x0322
            java.lang.String r3 = "drawableRight"
            java.lang.String r3 = r14.getAttributeValue(r2, r3)
            if (r3 != 0) goto L_0x031c
            java.lang.String r3 = "singleLine"
            boolean r3 = r14.getAttributeBooleanValue(r2, r3, r1)
            if (r3 == 0) goto L_0x0314
            java.lang.String r3 = "lines"
            int r3 = r14.getAttributeIntValue(r2, r3, r1)
            if (r3 != r1) goto L_0x0314
            java.lang.String r3 = "minLines"
            int r3 = r14.getAttributeIntValue(r2, r3, r1)
            if (r3 != r1) goto L_0x0314
            java.lang.String r3 = "maxLines"
            int r3 = r14.getAttributeIntValue(r2, r3, r1)
            if (r3 != r1) goto L_0x0314
            java.lang.String r3 = "gravity"
            int r2 = r14.getAttributeIntValue(r2, r3, r0)
            if (r2 == r0) goto L_0x007f
            java.lang.String r2 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r4, r2)
        L_0x007f:
            int r9 = p213q.p217b.p218a.p271c.C3400k.Widget_MaterialComponents_Chip_Action
            q.b.a.c.v.b r2 = new q.b.a.c.v.b
            r2.<init>(r13, r14, r15, r9)
            android.content.Context r5 = r2.f8786g0
            int[] r7 = p213q.p217b.p218a.p271c.C3406l.Chip
            r3 = 0
            int[] r10 = new int[r3]
            r6 = r14
            r8 = r15
            android.content.res.TypedArray r4 = p213q.p217b.p218a.p271c.p273b0.C3310j.m7691b(r5, r6, r7, r8, r9, r10)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_shapeAppearance
            boolean r5 = r4.hasValue(r5)
            r2.f8762I0 = r5
            android.content.Context r5 = r2.f8786g0
            int r6 = p213q.p217b.p218a.p271c.C3406l.Chip_chipSurfaceColor
            android.content.res.ColorStateList r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5173a(r5, r4, r6)
            android.content.res.ColorStateList r6 = r2.f8745A
            if (r6 == r5) goto L_0x00b0
            r2.f8745A = r5
            int[] r5 = r2.getState()
            r2.onStateChange(r5)
        L_0x00b0:
            android.content.Context r5 = r2.f8786g0
            int r6 = p213q.p217b.p218a.p271c.C3406l.Chip_chipBackgroundColor
            android.content.res.ColorStateList r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5173a(r5, r4, r6)
            r2.mo9343c(r5)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_chipMinHeight
            r6 = 0
            float r5 = r4.getDimension(r5, r6)
            r2.mo9355f(r5)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_chipCornerRadius
            boolean r5 = r4.hasValue(r5)
            if (r5 == 0) goto L_0x00d6
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_chipCornerRadius
            float r5 = r4.getDimension(r5, r6)
            r2.mo9342c(r5)
        L_0x00d6:
            android.content.Context r5 = r2.f8786g0
            int r7 = p213q.p217b.p218a.p271c.C3406l.Chip_chipStrokeColor
            android.content.res.ColorStateList r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5173a(r5, r4, r7)
            r2.mo9352e(r5)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_chipStrokeWidth
            float r5 = r4.getDimension(r5, r6)
            r2.mo9363h(r5)
            android.content.Context r5 = r2.f8786g0
            int r7 = p213q.p217b.p218a.p271c.C3406l.Chip_rippleColor
            android.content.res.ColorStateList r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5173a(r5, r4, r7)
            r2.mo9358g(r5)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_android_text
            java.lang.CharSequence r5 = r4.getText(r5)
            r2.mo9334a(r5)
            android.content.Context r5 = r2.f8786g0
            int r7 = p213q.p217b.p218a.p271c.C3406l.Chip_android_textAppearance
            boolean r8 = r4.hasValue(r7)
            if (r8 == 0) goto L_0x0114
            int r7 = r4.getResourceId(r7, r3)
            if (r7 == 0) goto L_0x0114
            q.b.a.c.d0.b r8 = new q.b.a.c.d0.b
            r8.<init>(r5, r7)
            goto L_0x0115
        L_0x0114:
            r8 = 0
        L_0x0115:
            r2.mo9335a(r8)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_android_ellipsize
            int r5 = r4.getInt(r5, r3)
            if (r5 == r1) goto L_0x012d
            r7 = 2
            if (r5 == r7) goto L_0x012a
            r7 = 3
            if (r5 == r7) goto L_0x0127
            goto L_0x0131
        L_0x0127:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            goto L_0x012f
        L_0x012a:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x012f
        L_0x012d:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.START
        L_0x012f:
            r2.f8756F0 = r5
        L_0x0131:
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_chipIconVisible
            boolean r5 = r4.getBoolean(r5, r3)
            r2.mo9346c(r5)
            java.lang.String r5 = "http://schemas.android.com/apk/res-auto"
            if (r14 == 0) goto L_0x0157
            java.lang.String r7 = "chipIconEnabled"
            java.lang.String r7 = r14.getAttributeValue(r5, r7)
            if (r7 == 0) goto L_0x0157
            java.lang.String r7 = "chipIconVisible"
            java.lang.String r7 = r14.getAttributeValue(r5, r7)
            if (r7 != 0) goto L_0x0157
            int r7 = p213q.p217b.p218a.p271c.C3406l.Chip_chipIconEnabled
            boolean r7 = r4.getBoolean(r7, r3)
            r2.mo9346c(r7)
        L_0x0157:
            android.content.Context r7 = r2.f8786g0
            int r8 = p213q.p217b.p218a.p271c.C3406l.Chip_chipIcon
            android.graphics.drawable.Drawable r7 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5277b(r7, r4, r8)
            r2.mo9345c(r7)
            int r7 = p213q.p217b.p218a.p271c.C3406l.Chip_chipIconTint
            boolean r7 = r4.hasValue(r7)
            if (r7 == 0) goto L_0x0175
            android.content.Context r7 = r2.f8786g0
            int r8 = p213q.p217b.p218a.p271c.C3406l.Chip_chipIconTint
            android.content.res.ColorStateList r7 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5173a(r7, r4, r8)
            r2.mo9348d(r7)
        L_0x0175:
            int r7 = p213q.p217b.p218a.p271c.C3406l.Chip_chipIconSize
            float r7 = r4.getDimension(r7, r6)
            r2.mo9351e(r7)
            int r7 = p213q.p217b.p218a.p271c.C3406l.Chip_closeIconVisible
            boolean r7 = r4.getBoolean(r7, r3)
            r2.mo9350d(r7)
            if (r14 == 0) goto L_0x01a2
            java.lang.String r7 = "closeIconEnabled"
            java.lang.String r7 = r14.getAttributeValue(r5, r7)
            if (r7 == 0) goto L_0x01a2
            java.lang.String r7 = "closeIconVisible"
            java.lang.String r7 = r14.getAttributeValue(r5, r7)
            if (r7 != 0) goto L_0x01a2
            int r7 = p213q.p217b.p218a.p271c.C3406l.Chip_closeIconEnabled
            boolean r7 = r4.getBoolean(r7, r3)
            r2.mo9350d(r7)
        L_0x01a2:
            android.content.Context r7 = r2.f8786g0
            int r8 = p213q.p217b.p218a.p271c.C3406l.Chip_closeIcon
            android.graphics.drawable.Drawable r7 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5277b(r7, r4, r8)
            r2.mo9349d(r7)
            android.content.Context r7 = r2.f8786g0
            int r8 = p213q.p217b.p218a.p271c.C3406l.Chip_closeIconTint
            android.content.res.ColorStateList r7 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5173a(r7, r4, r8)
            r2.mo9356f(r7)
            int r7 = p213q.p217b.p218a.p271c.C3406l.Chip_closeIconSize
            float r7 = r4.getDimension(r7, r6)
            r2.mo9366j(r7)
            int r7 = p213q.p217b.p218a.p271c.C3406l.Chip_android_checkable
            boolean r7 = r4.getBoolean(r7, r3)
            r2.mo9336a(r7)
            int r7 = p213q.p217b.p218a.p271c.C3406l.Chip_checkedIconVisible
            boolean r7 = r4.getBoolean(r7, r3)
            r2.mo9340b(r7)
            if (r14 == 0) goto L_0x01ee
            java.lang.String r7 = "checkedIconEnabled"
            java.lang.String r7 = r14.getAttributeValue(r5, r7)
            if (r7 == 0) goto L_0x01ee
            java.lang.String r7 = "checkedIconVisible"
            java.lang.String r5 = r14.getAttributeValue(r5, r7)
            if (r5 != 0) goto L_0x01ee
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_checkedIconEnabled
            boolean r5 = r4.getBoolean(r5, r3)
            r2.mo9340b(r5)
        L_0x01ee:
            android.content.Context r5 = r2.f8786g0
            int r7 = p213q.p217b.p218a.p271c.C3406l.Chip_checkedIcon
            android.graphics.drawable.Drawable r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5277b(r5, r4, r7)
            r2.mo9339b(r5)
            android.content.Context r5 = r2.f8786g0
            int r7 = p213q.p217b.p218a.p271c.C3406l.Chip_showMotionSpec
            q.b.a.c.m.g r5 = p213q.p217b.p218a.p271c.p283m.C3413g.m7808a(r5, r4, r7)
            r2.f8776W = r5
            android.content.Context r5 = r2.f8786g0
            int r7 = p213q.p217b.p218a.p271c.C3406l.Chip_hideMotionSpec
            q.b.a.c.m.g r5 = p213q.p217b.p218a.p271c.p283m.C3413g.m7808a(r5, r4, r7)
            r2.f8777X = r5
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_chipStartPadding
            float r5 = r4.getDimension(r5, r6)
            r2.mo9357g(r5)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_iconStartPadding
            float r5 = r4.getDimension(r5, r6)
            r2.mo9372m(r5)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_iconEndPadding
            float r5 = r4.getDimension(r5, r6)
            r2.mo9370l(r5)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_textStartPadding
            float r5 = r4.getDimension(r5, r6)
            r2.mo9376o(r5)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_textEndPadding
            float r5 = r4.getDimension(r5, r6)
            r2.mo9374n(r5)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_closeIconStartPadding
            float r5 = r4.getDimension(r5, r6)
            r2.mo9368k(r5)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_closeIconEndPadding
            float r5 = r4.getDimension(r5, r6)
            r2.mo9364i(r5)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_chipEndPadding
            float r5 = r4.getDimension(r5, r6)
            r2.mo9347d(r5)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_android_maxWidth
            r6 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r4.getDimensionPixelSize(r5, r6)
            r2.f8760H0 = r5
            r4.recycle()
            int[] r8 = p213q.p217b.p218a.p271c.C3406l.Chip
            int r10 = p213q.p217b.p218a.p271c.C3400k.Widget_MaterialComponents_Chip_Action
            int[] r11 = new int[r3]
            r6 = r13
            r7 = r14
            r9 = r15
            android.content.res.TypedArray r4 = p213q.p217b.p218a.p271c.p273b0.C3310j.m7691b(r6, r7, r8, r9, r10, r11)
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_ensureMinTouchTargetSize
            boolean r5 = r4.getBoolean(r5, r3)
            r12.f1289q = r5
            android.content.Context r5 = r12.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 48
            float r6 = (float) r6
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r1, r6, r5)
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            float r1 = (float) r5
            int r5 = p213q.p217b.p218a.p271c.C3406l.Chip_chipMinTouchTargetSize
            float r1 = r4.getDimension(r5, r1)
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r1 = (int) r5
            r12.f1291s = r1
            r4.recycle()
            r12.setChipDrawable(r2)
            float r1 = p124p.p150h.p162l.C1404o.m3547h(r12)
            r2.mo9059a(r1)
            int[] r6 = p213q.p217b.p218a.p271c.C3406l.Chip
            int r8 = p213q.p217b.p218a.p271c.C3400k.Widget_MaterialComponents_Chip_Action
            int[] r9 = new int[r3]
            r4 = r13
            r5 = r14
            r7 = r15
            android.content.res.TypedArray r13 = p213q.p217b.p218a.p271c.p273b0.C3310j.m7691b(r4, r5, r6, r7, r8, r9)
            int r14 = p213q.p217b.p218a.p271c.C3406l.Chip_shapeAppearance
            boolean r14 = r13.hasValue(r14)
            r13.recycle()
            com.google.android.material.chip.Chip$b r13 = new com.google.android.material.chip.Chip$b
            r13.<init>(r12)
            r12.f1292t = r13
            int r15 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r15 < r1) goto L_0x02d3
            p124p.p150h.p162l.C1404o.m3526a(r12, r13)
            goto L_0x02d6
        L_0x02d3:
            r12.mo1855e()
        L_0x02d6:
            if (r14 != 0) goto L_0x02e0
            q.b.a.c.v.a r13 = new q.b.a.c.v.a
            r13.<init>(r12)
            r12.setOutlineProvider(r13)
        L_0x02e0:
            boolean r13 = r12.f1285m
            r12.setChecked(r13)
            java.lang.CharSequence r13 = r2.f8759H
            r12.setText(r13)
            android.text.TextUtils$TruncateAt r13 = r2.f8756F0
            r12.setEllipsize(r13)
            r12.setIncludeFontPadding(r3)
            r12.mo1889i()
            q.b.a.c.v.b r13 = r12.f1280h
            boolean r13 = r13.f8758G0
            if (r13 != 0) goto L_0x02fe
            r12.setSingleLine()
        L_0x02fe:
            r12.setGravity(r0)
            r12.mo1888h()
            boolean r13 = r12.f1289q
            if (r13 == 0) goto L_0x030d
            int r13 = r12.f1291s
            r12.setMinHeight(r13)
        L_0x030d:
            int r13 = r12.getLayoutDirection()
            r12.f1290r = r13
            return
        L_0x0314:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r14 = "Chip does not support multi-line text"
            r13.<init>(r14)
            throw r13
        L_0x031c:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            r13.<init>(r5)
            throw r13
        L_0x0322:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            r13.<init>(r5)
            throw r13
        L_0x0328:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r14 = "Please set start drawable using R.attr#chipIcon."
            r13.<init>(r14)
            throw r13
        L_0x0330:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r14 = "Please set left drawable using R.attr#chipIcon."
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f1294v.setEmpty();
        if (mo1850b()) {
            C3450b bVar = this.f1280h;
            bVar.mo9344c(bVar.getBounds(), this.f1294v);
        }
        return this.f1294v;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f1293u.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f1293u;
    }

    private C3321b getTextAppearance() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8793n0.f8297f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f1287o != z) {
            this.f1287o = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f1286n != z) {
            this.f1286n = z;
            refreshDrawableState();
        }
    }

    /* renamed from: a */
    public void mo1848a() {
        mo1849a(this.f1291s);
        mo1856f();
        mo1888h();
        requestLayout();
        invalidateOutline();
    }

    /* renamed from: a */
    public boolean mo1849a(int i) {
        this.f1291s = i;
        int i2 = 0;
        if (!this.f1289q) {
            mo1852d();
            return false;
        }
        int max = Math.max(0, i - ((int) this.f1280h.f8749C));
        int max2 = Math.max(0, i - this.f1280h.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i3 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i2 = max / 2;
            }
            int i4 = i2;
            if (this.f1281i != null) {
                Rect rect = new Rect();
                this.f1281i.getPadding(rect);
                if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                    return true;
                }
            }
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
            InsetDrawable insetDrawable = new InsetDrawable(this.f1280h, i3, i4, i3, i4);
            this.f1281i = insetDrawable;
            return true;
        }
        mo1852d();
        return false;
    }

    /* renamed from: b */
    public final boolean mo1850b() {
        C3450b bVar = this.f1280h;
        return (bVar == null || bVar.mo9373n() == null) ? false : true;
    }

    /* renamed from: c */
    public boolean mo1851c() {
        C3450b bVar = this.f1280h;
        return bVar != null && bVar.f8773T;
    }

    /* renamed from: d */
    public final void mo1852d() {
        if (this.f1281i != null) {
            this.f1281i = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            mo1856f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            java.lang.Class<p.j.b.a> r0 = p124p.p167j.p169b.C1461a.class
            int r1 = r10.getAction()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 10
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L_0x0051
            java.lang.String r1 = "m"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            r1.setAccessible(r4)     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            com.google.android.material.chip.Chip$b r6 = r9.f1292t     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            int r1 = r1.intValue()     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            if (r1 == r2) goto L_0x0051
            java.lang.String r1 = "f"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            r6[r5] = r7     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r6)     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            r0.setAccessible(r4)     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            com.google.android.material.chip.Chip$b r1 = r9.f1292t     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            r6[r5] = r7     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            r0.invoke(r1, r6)     // Catch:{ NoSuchMethodException -> 0x0049, IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0045, NoSuchFieldException -> 0x0043 }
            r0 = r4
            goto L_0x0052
        L_0x0043:
            r0 = move-exception
            goto L_0x004a
        L_0x0045:
            r0 = move-exception
            goto L_0x004a
        L_0x0047:
            r0 = move-exception
            goto L_0x004a
        L_0x0049:
            r0 = move-exception
        L_0x004a:
            java.lang.String r1 = "Unable to send Accessibility Exit event"
            java.lang.String r6 = "Chip"
            android.util.Log.e(r6, r1, r0)
        L_0x0051:
            r0 = r5
        L_0x0052:
            if (r0 != 0) goto L_0x00c4
            com.google.android.material.chip.Chip$b r0 = r9.f1292t
            android.view.accessibility.AccessibilityManager r1 = r0.f4282h
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L_0x00b9
            android.view.accessibility.AccessibilityManager r1 = r0.f4282h
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L_0x0067
            goto L_0x00b9
        L_0x0067:
            int r1 = r10.getAction()
            r6 = 7
            r7 = 256(0x100, float:3.59E-43)
            r8 = 128(0x80, float:1.794E-43)
            if (r1 == r6) goto L_0x0089
            r6 = 9
            if (r1 == r6) goto L_0x0089
            if (r1 == r3) goto L_0x0079
            goto L_0x00b9
        L_0x0079:
            int r1 = r0.f4287m
            if (r1 == r2) goto L_0x00b9
            if (r1 != r2) goto L_0x0080
            goto L_0x00b7
        L_0x0080:
            r0.f4287m = r2
            r0.mo5991a(r2, r8)
            r0.mo5991a(r1, r7)
            goto L_0x00b7
        L_0x0089:
            float r1 = r10.getX()
            float r3 = r10.getY()
            com.google.android.material.chip.Chip r6 = com.google.android.material.chip.Chip.this
            boolean r6 = r6.mo1850b()
            if (r6 == 0) goto L_0x00a7
            com.google.android.material.chip.Chip r6 = com.google.android.material.chip.Chip.this
            android.graphics.RectF r6 = r6.getCloseIconTouchBounds()
            boolean r1 = r6.contains(r1, r3)
            if (r1 == 0) goto L_0x00a7
            r1 = r4
            goto L_0x00a8
        L_0x00a7:
            r1 = r5
        L_0x00a8:
            int r3 = r0.f4287m
            if (r3 != r1) goto L_0x00ad
            goto L_0x00b5
        L_0x00ad:
            r0.f4287m = r1
            r0.mo5991a(r1, r8)
            r0.mo5991a(r3, r7)
        L_0x00b5:
            if (r1 == r2) goto L_0x00b9
        L_0x00b7:
            r0 = r4
            goto L_0x00ba
        L_0x00b9:
            r0 = r5
        L_0x00ba:
            if (r0 != 0) goto L_0x00c4
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r4 = r5
        L_0x00c4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C0227b bVar = this.f1292t;
        if (bVar != null) {
            int i = 0;
            if (keyEvent.getAction() != 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 61) {
                    int i2 = 66;
                    if (keyCode != 66) {
                        switch (keyCode) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                if (keyEvent.hasNoModifiers()) {
                                    if (keyCode == 19) {
                                        i2 = 33;
                                    } else if (keyCode == 21) {
                                        i2 = 17;
                                    } else if (keyCode != 22) {
                                        i2 = 130;
                                    }
                                    int repeatCount = keyEvent.getRepeatCount() + 1;
                                    int i3 = 0;
                                    while (i < repeatCount && bVar.mo5992a(i2, (Rect) null)) {
                                        i++;
                                        i3 = 1;
                                    }
                                    i = i3;
                                    break;
                                }
                                break;
                            case 23:
                                break;
                        }
                    }
                    if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                        int i4 = bVar.f4286l;
                        if (i4 != Integer.MIN_VALUE) {
                            bVar.mo1994a(i4, 16, null);
                        }
                        i = 1;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = bVar.mo5992a(2, (Rect) null);
                } else if (keyEvent.hasModifiers(1)) {
                    i = bVar.mo5992a(1, (Rect) null);
                }
            }
            if (i == 0 || this.f1292t.f4286l == Integer.MIN_VALUE) {
                return super.dispatchKeyEvent(keyEvent);
            }
            return true;
        }
        throw null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3450b bVar = this.f1280h;
        int i = 0;
        if (bVar != null && C3450b.m7865f(bVar.f8768O)) {
            C3450b bVar2 = this.f1280h;
            int isEnabled = isEnabled();
            if (this.f1288p) {
                isEnabled++;
            }
            if (this.f1287o) {
                isEnabled++;
            }
            if (this.f1286n) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.f1288p) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f1287o) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f1286n) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            i = bVar2.mo9341b(iArr);
        }
        if (i != 0) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void mo1855e() {
        C0227b bVar;
        if (VERSION.SDK_INT < 24) {
            if (mo1850b()) {
                C3450b bVar2 = this.f1280h;
                if (bVar2 != null && bVar2.f8767N) {
                    bVar = this.f1292t;
                    C1404o.m3526a((View) this, (C1387a) bVar);
                }
            }
            bVar = null;
            C1404o.m3526a((View) this, (C1387a) bVar);
        }
    }

    /* renamed from: f */
    public final void mo1856f() {
        if (C3326a.f8335a) {
            mo1857g();
            return;
        }
        this.f1280h.mo9354e(true);
        C1404o.m3522a((View) this, getBackgroundDrawable());
        if (getBackgroundDrawable() == this.f1281i && this.f1280h.getCallback() == null) {
            this.f1280h.setCallback(this.f1281i);
        }
    }

    /* renamed from: g */
    public final void mo1857g() {
        this.f1282j = new RippleDrawable(C3326a.m7708a(this.f1280h.f8757G), getBackgroundDrawable(), null);
        this.f1280h.mo9354e(false);
        C1404o.m3522a((View) this, (Drawable) this.f1282j);
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1281i;
        return insetDrawable == null ? this.f1280h : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8775V;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8747B;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.mo9371m();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1280h;
    }

    public float getChipEndPadding() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8785f0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            Drawable drawable = bVar.f8763J;
            if (drawable != null) {
                return C1061o.m2456a(drawable);
            }
        }
        return null;
    }

    public float getChipIconSize() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8765L;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8764K;
        }
        return null;
    }

    public float getChipMinHeight() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8749C;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8778Y;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8753E;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8755F;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.mo9373n();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8772S;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8784e0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8771R;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8783d0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8770Q;
        }
        return null;
    }

    public TruncateAt getEllipsize() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8756F0;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        C0227b bVar = this.f1292t;
        if (bVar.f4286l == 1 || bVar.f4285k == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C3413g getHideMotionSpec() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8777X;
        }
        return null;
    }

    public float getIconEndPadding() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8780a0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8779Z;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8757G;
        }
        return null;
    }

    public C3342j getShapeAppearanceModel() {
        return this.f1280h.f8365e.f8387a;
    }

    public C3413g getShowMotionSpec() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8776W;
        }
        return null;
    }

    public float getTextEndPadding() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8782c0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            return bVar.f8781b0;
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final void mo1888h() {
        if (!TextUtils.isEmpty(getText())) {
            C3450b bVar = this.f1280h;
            if (bVar != null) {
                int l = (int) (bVar.mo9369l() + bVar.f8785f0 + bVar.f8782c0);
                C3450b bVar2 = this.f1280h;
                C1404o.m3517a(this, (int) (bVar2.mo9367k() + bVar2.f8778Y + bVar2.f8781b0), getPaddingTop(), l, getPaddingBottom());
            }
        }
    }

    /* renamed from: i */
    public final void mo1889i() {
        TextPaint paint = getPaint();
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            paint.drawableState = bVar.getState();
        }
        C3321b textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo9046a(getContext(), paint, this.f1295w);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2286e.m5230a((View) this, (C3337g) this.f1280h);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f1278y);
        }
        if (mo1851c()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f1279z);
        }
        return onCreateDrawableState;
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C0227b bVar = this.f1292t;
        int i2 = bVar.f4286l;
        if (i2 != Integer.MIN_VALUE) {
            bVar.mo5993b(i2);
        }
        if (z) {
            bVar.mo5992a(i, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (mo1851c() || isClickable()) ? mo1851c() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View";
        accessibilityNodeInfo.setClassName(str);
        accessibilityNodeInfo.setCheckable(mo1851c());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f1290r != i) {
            this.f1290r = i;
            mo1888h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0040
            goto L_0x004c
        L_0x0021:
            boolean r0 = r5.f1286n
            if (r0 == 0) goto L_0x004c
            if (r1 != 0) goto L_0x004a
            r5.setCloseIconPressed(r2)
            goto L_0x004a
        L_0x002b:
            boolean r0 = r5.f1286n
            if (r0 == 0) goto L_0x0040
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f1283k
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            com.google.android.material.chip.Chip$b r0 = r5.f1292t
            r0.mo5991a(r3, r3)
            r0 = r3
            goto L_0x0041
        L_0x0040:
            r0 = r2
        L_0x0041:
            r5.setCloseIconPressed(r2)
            goto L_0x004d
        L_0x0045:
            if (r1 == 0) goto L_0x004c
            r5.setCloseIconPressed(r3)
        L_0x004a:
            r0 = r3
            goto L_0x004d
        L_0x004c:
            r0 = r2
        L_0x004d:
            if (r0 != 0) goto L_0x0055
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1282j) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1282j) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9336a(z);
        }
    }

    public void setCheckableResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9336a(bVar.f8786g0.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        C3450b bVar = this.f1280h;
        if (bVar == null) {
            this.f1285m = z;
        } else if (bVar.f8773T) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z) {
                OnCheckedChangeListener onCheckedChangeListener = this.f1284l;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(this, z);
                }
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9339b(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9339b(C1070a.m2602b(bVar.f8786g0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9340b(bVar.f8786g0.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9340b(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C3450b bVar = this.f1280h;
        if (bVar != null && bVar.f8747B != colorStateList) {
            bVar.f8747B = colorStateList;
            bVar.onStateChange(bVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9343c(C1070a.m2601a(bVar.f8786g0, i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9342c(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9342c(bVar.f8786g0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C3450b bVar) {
        C3450b bVar2 = this.f1280h;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.f8754E0 = new WeakReference<>(null);
            }
            this.f1280h = bVar;
            bVar.f8758G0 = false;
            if (bVar != null) {
                bVar.f8754E0 = new WeakReference<>(this);
                mo1849a(this.f1291s);
                mo1856f();
                return;
            }
            throw null;
        }
    }

    public void setChipEndPadding(float f) {
        C3450b bVar = this.f1280h;
        if (bVar != null && bVar.f8785f0 != f) {
            bVar.f8785f0 = f;
            bVar.invalidateSelf();
            bVar.mo9375o();
        }
    }

    public void setChipEndPaddingResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9347d(bVar.f8786g0.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9345c(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9345c(C1070a.m2602b(bVar.f8786g0, i));
        }
    }

    public void setChipIconSize(float f) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9351e(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9351e(bVar.f8786g0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9348d(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9348d(C1070a.m2601a(bVar.f8786g0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9346c(bVar.f8786g0.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9346c(z);
        }
    }

    public void setChipMinHeight(float f) {
        C3450b bVar = this.f1280h;
        if (bVar != null && bVar.f8749C != f) {
            bVar.f8749C = f;
            bVar.invalidateSelf();
            bVar.mo9375o();
        }
    }

    public void setChipMinHeightResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9355f(bVar.f8786g0.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f) {
        C3450b bVar = this.f1280h;
        if (bVar != null && bVar.f8778Y != f) {
            bVar.f8778Y = f;
            bVar.invalidateSelf();
            bVar.mo9375o();
        }
    }

    public void setChipStartPaddingResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9357g(bVar.f8786g0.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9352e(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9352e(C1070a.m2601a(bVar.f8786g0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9363h(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9363h(bVar.f8786g0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9349d(drawable);
        }
        mo1855e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder;
        C3450b bVar = this.f1280h;
        if (bVar != null && bVar.f8772S != charSequence) {
            C1369a a = C1369a.m3452a();
            C1373c cVar = a.f4117c;
            if (charSequence == null) {
                spannableStringBuilder = null;
            } else {
                boolean a2 = ((C1378d) cVar).mo5856a(charSequence, 0, charSequence.length());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                boolean z = (a.f4116b & 2) != 0;
                String str = Objects.EMPTY_STRING;
                if (z) {
                    boolean a3 = ((C1378d) (a2 ? C1374d.f4129b : C1374d.f4128a)).mo5856a(charSequence, 0, charSequence.length());
                    String str2 = (a.f4115a || (!a3 && C1369a.m3451a(charSequence) != 1)) ? (!a.f4115a || (a3 && C1369a.m3451a(charSequence) != -1)) ? str : C1369a.f4112f : C1369a.f4111e;
                    spannableStringBuilder2.append(str2);
                }
                if (a2 != a.f4115a) {
                    spannableStringBuilder2.append(a2 ? (char) 8235 : 8234);
                    spannableStringBuilder2.append(charSequence);
                    spannableStringBuilder2.append(8236);
                } else {
                    spannableStringBuilder2.append(charSequence);
                }
                boolean a4 = ((C1378d) (a2 ? C1374d.f4129b : C1374d.f4128a)).mo5856a(charSequence, 0, charSequence.length());
                if (!a.f4115a && (a4 || C1369a.m3453b(charSequence) == 1)) {
                    str = C1369a.f4111e;
                } else if (a.f4115a && (!a4 || C1369a.m3453b(charSequence) == -1)) {
                    str = C1369a.f4112f;
                }
                spannableStringBuilder2.append(str);
                spannableStringBuilder = spannableStringBuilder2;
            }
            bVar.f8772S = spannableStringBuilder;
            bVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9364i(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9364i(bVar.f8786g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9349d(C1070a.m2602b(bVar.f8786g0, i));
        }
        mo1855e();
    }

    public void setCloseIconSize(float f) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9366j(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9366j(bVar.f8786g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9368k(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9368k(bVar.f8786g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9356f(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9356f(C1070a.m2601a(bVar.f8786g0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9350d(z);
        }
        mo1855e();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            C3339b bVar2 = bVar.f8365e;
            if (bVar2.f8401o != f) {
                bVar2.f8401o = f;
                bVar.mo9086j();
            }
        }
    }

    public void setEllipsize(TruncateAt truncateAt) {
        if (this.f1280h != null) {
            if (truncateAt != TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C3450b bVar = this.f1280h;
                if (bVar != null) {
                    bVar.f8756F0 = truncateAt;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f1289q = z;
        mo1849a(this.f1291s);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C3413g gVar) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.f8777X = gVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.f8777X = C3413g.m7807a(bVar.f8786g0, i);
        }
    }

    public void setIconEndPadding(float f) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9370l(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9370l(bVar.f8786g0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9372m(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9372m(bVar.f8786g0.getResources().getDimension(i));
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f1280h != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.f8760H0 = i;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(OnCheckedChangeListener onCheckedChangeListener) {
        this.f1284l = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(OnClickListener onClickListener) {
        this.f1283k = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9358g(colorStateList);
        }
        if (!this.f1280h.f8750C0) {
            mo1857g();
        }
    }

    public void setRippleColorResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9358g(C1070a.m2601a(bVar.f8786g0, i));
            if (!this.f1280h.f8750C0) {
                mo1857g();
            }
        }
    }

    public void setShapeAppearanceModel(C3342j jVar) {
        C3450b bVar = this.f1280h;
        bVar.f8365e.f8387a = jVar;
        bVar.invalidateSelf();
    }

    public void setShowMotionSpec(C3413g gVar) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.f8776W = gVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.f8776W = C3413g.m7807a(bVar.f8786g0, i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (this.f1280h != null) {
            if (charSequence == null) {
                charSequence = Objects.EMPTY_STRING;
            }
            super.setText(this.f1280h.f8758G0 ? null : charSequence, bufferType);
            C3450b bVar = this.f1280h;
            if (bVar != null) {
                bVar.mo9334a(charSequence);
            }
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.f8793n0.mo9032a(new C3321b(bVar.f8786g0, i), bVar.f8786g0);
        }
        mo1889i();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C3450b bVar = this.f1280h;
        if (bVar != null && bVar.f8782c0 != f) {
            bVar.f8782c0 = f;
            bVar.invalidateSelf();
            bVar.mo9375o();
        }
    }

    public void setTextEndPaddingResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9374n(bVar.f8786g0.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f) {
        C3450b bVar = this.f1280h;
        if (bVar != null && bVar.f8781b0 != f) {
            bVar.f8781b0 = f;
            bVar.invalidateSelf();
            bVar.mo9375o();
        }
    }

    public void setTextStartPaddingResource(int i) {
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.mo9376o(bVar.f8786g0.getResources().getDimension(i));
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3450b bVar = this.f1280h;
        if (bVar != null) {
            bVar.f8793n0.mo9032a(new C3321b(bVar.f8786g0, i), bVar.f8786g0);
        }
        mo1889i();
    }

    public void setTextAppearance(C3321b bVar) {
        C3450b bVar2 = this.f1280h;
        if (bVar2 != null) {
            bVar2.f8793n0.mo9032a(bVar, bVar2.f8786g0);
        }
        mo1889i();
    }
}
