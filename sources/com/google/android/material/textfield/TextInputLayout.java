package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p126b.p136q.C1145b0;
import p124p.p126b.p136q.C1178i;
import p124p.p126b.p136q.C1213u0;
import p124p.p126b.p136q.C1218w;
import p124p.p150h.p152e.C1325a;
import p124p.p150h.p162l.C1387a;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.p163y.C1429b;
import p124p.p167j.p168a.C1458a;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.C3316c;
import p213q.p217b.p218a.p271c.C3318d;
import p213q.p217b.p218a.p271c.C3327f;
import p213q.p217b.p218a.p271c.C3356h;
import p213q.p217b.p218a.p271c.C3369j;
import p213q.p217b.p218a.p271c.C3400k;
import p213q.p217b.p218a.p271c.C3406l;
import p213q.p217b.p218a.p271c.p273b0.C3295a;
import p213q.p217b.p218a.p271c.p273b0.C3296b;
import p213q.p217b.p218a.p271c.p273b0.C3310j;
import p213q.p217b.p218a.p271c.p275d0.C3319a;
import p213q.p217b.p218a.p271c.p275d0.C3321b;
import p213q.p217b.p218a.p271c.p275d0.C3324d;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p278g0.C3342j;
import p213q.p217b.p218a.p271c.p278g0.C3342j.C3344b;
import p213q.p217b.p218a.p271c.p281j0.C3370a;
import p213q.p217b.p218a.p271c.p281j0.C3378f;
import p213q.p217b.p218a.p271c.p281j0.C3379g;
import p213q.p217b.p218a.p271c.p281j0.C3380h;
import p213q.p217b.p218a.p271c.p281j0.C3391n;
import p213q.p217b.p218a.p271c.p281j0.C3392o;
import p213q.p217b.p218a.p271c.p281j0.C3394p;
import p213q.p217b.p218a.p271c.p281j0.C3395q;
import p213q.p217b.p218a.p271c.p283m.C3407a;

public class TextInputLayout extends LinearLayout {

    /* renamed from: v0 */
    public static final int f1359v0 = C3400k.Widget_Design_TextInputLayout;

    /* renamed from: A */
    public int f1360A;

    /* renamed from: B */
    public final int f1361B;

    /* renamed from: C */
    public final int f1362C;

    /* renamed from: D */
    public int f1363D;

    /* renamed from: E */
    public int f1364E;

    /* renamed from: F */
    public final Rect f1365F;

    /* renamed from: G */
    public final Rect f1366G;

    /* renamed from: H */
    public final RectF f1367H;

    /* renamed from: I */
    public Typeface f1368I;

    /* renamed from: J */
    public final CheckableImageButton f1369J;

    /* renamed from: K */
    public ColorStateList f1370K;

    /* renamed from: L */
    public boolean f1371L;

    /* renamed from: M */
    public Mode f1372M;

    /* renamed from: N */
    public boolean f1373N;

    /* renamed from: O */
    public Drawable f1374O;

    /* renamed from: P */
    public OnLongClickListener f1375P;

    /* renamed from: Q */
    public final LinkedHashSet<C0249f> f1376Q;

    /* renamed from: R */
    public int f1377R;

    /* renamed from: S */
    public final SparseArray<C3391n> f1378S;

    /* renamed from: T */
    public final CheckableImageButton f1379T;

    /* renamed from: U */
    public final LinkedHashSet<C0250g> f1380U;

    /* renamed from: V */
    public ColorStateList f1381V;

    /* renamed from: W */
    public boolean f1382W;

    /* renamed from: a0 */
    public Mode f1383a0;

    /* renamed from: b0 */
    public boolean f1384b0;

    /* renamed from: c0 */
    public Drawable f1385c0;

    /* renamed from: d0 */
    public Drawable f1386d0;

    /* renamed from: e */
    public final FrameLayout f1387e;

    /* renamed from: e0 */
    public final CheckableImageButton f1388e0;

    /* renamed from: f */
    public final FrameLayout f1389f;

    /* renamed from: f0 */
    public OnLongClickListener f1390f0;

    /* renamed from: g */
    public EditText f1391g;

    /* renamed from: g0 */
    public ColorStateList f1392g0;

    /* renamed from: h */
    public CharSequence f1393h;

    /* renamed from: h0 */
    public ColorStateList f1394h0;

    /* renamed from: i */
    public final C3392o f1395i;

    /* renamed from: i0 */
    public final int f1396i0;

    /* renamed from: j */
    public boolean f1397j;

    /* renamed from: j0 */
    public final int f1398j0;

    /* renamed from: k */
    public int f1399k;

    /* renamed from: k0 */
    public int f1400k0;

    /* renamed from: l */
    public boolean f1401l;

    /* renamed from: l0 */
    public int f1402l0;

    /* renamed from: m */
    public TextView f1403m;

    /* renamed from: m0 */
    public final int f1404m0;

    /* renamed from: n */
    public int f1405n;

    /* renamed from: n0 */
    public final int f1406n0;

    /* renamed from: o */
    public int f1407o;

    /* renamed from: o0 */
    public final int f1408o0;

    /* renamed from: p */
    public ColorStateList f1409p;

    /* renamed from: p0 */
    public boolean f1410p0;

    /* renamed from: q */
    public ColorStateList f1411q;

    /* renamed from: q0 */
    public final C3296b f1412q0;

    /* renamed from: r */
    public boolean f1413r;

    /* renamed from: r0 */
    public boolean f1414r0;

    /* renamed from: s */
    public CharSequence f1415s;

    /* renamed from: s0 */
    public ValueAnimator f1416s0;

    /* renamed from: t */
    public boolean f1417t;

    /* renamed from: t0 */
    public boolean f1418t0;

    /* renamed from: u */
    public C3337g f1419u;

    /* renamed from: u0 */
    public boolean f1420u0;

    /* renamed from: v */
    public C3337g f1421v;

    /* renamed from: w */
    public C3342j f1422w;

    /* renamed from: x */
    public final int f1423x;

    /* renamed from: y */
    public int f1424y;

    /* renamed from: z */
    public final int f1425z;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C0244a implements TextWatcher {
        public C0244a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo2185a(!textInputLayout.f1420u0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f1397j) {
                textInputLayout2.mo2181a(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class C0245b implements Runnable {
        public C0245b() {
        }

        public void run() {
            TextInputLayout.this.f1379T.performClick();
            TextInputLayout.this.f1379T.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class C0246c implements Runnable {
        public C0246c() {
        }

        public void run() {
            TextInputLayout.this.f1391g.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C0247d implements AnimatorUpdateListener {
        public C0247d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f1412q0.mo9003c(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C0248e extends C1387a {

        /* renamed from: d */
        public final TextInputLayout f1430d;

        public C0248e(TextInputLayout textInputLayout) {
            this.f1430d = textInputLayout;
        }

        /* renamed from: a */
        public void mo768a(View view, C1429b bVar) {
            this.f4146a.onInitializeAccessibilityNodeInfo(view, bVar.f4203a);
            EditText editText = this.f1430d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f1430d.getHint();
            CharSequence error = this.f1430d.getError();
            CharSequence counterOverflowDescription = this.f1430d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                bVar.f4203a.setText(text);
            } else if (z2) {
                bVar.f4203a.setText(hint);
            }
            if (z2) {
                bVar.mo5945a(hint);
                if (!z && z2) {
                    z4 = true;
                }
                if (VERSION.SDK_INT >= 26) {
                    bVar.f4203a.setShowingHintText(z4);
                } else {
                    bVar.mo5944a(4, z4);
                }
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                bVar.f4203a.setError(error);
                bVar.f4203a.setContentInvalid(true);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C0249f {
        /* renamed from: a */
        void mo2309a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C0250g {
        /* renamed from: a */
        void mo2310a(TextInputLayout textInputLayout, int i);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    public static class C0251h extends C1458a {
        public static final Creator<C0251h> CREATOR = new C0252a();

        /* renamed from: g */
        public CharSequence f1431g;

        /* renamed from: h */
        public boolean f1432h;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        public static class C0252a implements ClassLoaderCreator<C0251h> {
            public Object createFromParcel(Parcel parcel) {
                return new C0251h(parcel, null);
            }

            public Object[] newArray(int i) {
                return new C0251h[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0251h(parcel, classLoader);
            }
        }

        public C0251h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1431g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f1432h = z;
        }

        public C0251h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("TextInputLayout.SavedState{");
            a.append(Integer.toHexString(System.identityHashCode(this)));
            a.append(" error=");
            a.append(this.f1431g);
            a.append(Objects.ARRAY_END);
            return a.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4274e, i);
            TextUtils.writeToParcel(this.f1431g, parcel, i);
            parcel.writeInt(this.f1432h ? 1 : 0);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3294b.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i;
        super(C3310j.m7690b(context, attributeSet2, i3, f1359v0), attributeSet2, i3);
        this.f1395i = new C3392o(this);
        this.f1365F = new Rect();
        this.f1366G = new Rect();
        this.f1367H = new RectF();
        this.f1376Q = new LinkedHashSet<>();
        this.f1377R = 0;
        this.f1378S = new SparseArray<>();
        this.f1380U = new LinkedHashSet<>();
        this.f1412q0 = new C3296b(this);
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1387e = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.f1387e);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f1389f = frameLayout2;
        frameLayout2.setLayoutParams(new LayoutParams(-2, -2, 8388629));
        this.f1387e.addView(this.f1389f);
        C3296b bVar = this.f1412q0;
        bVar.f8240L = C3407a.f8572a;
        bVar.mo9006e();
        C3296b bVar2 = this.f1412q0;
        bVar2.f8239K = C3407a.f8572a;
        bVar2.mo9006e();
        C3296b bVar3 = this.f1412q0;
        if (bVar3.f8255h != 8388659) {
            bVar3.f8255h = 8388659;
            bVar3.mo9006e();
        }
        int[] iArr = C3406l.TextInputLayout;
        int i4 = f1359v0;
        int[] iArr2 = {C3406l.TextInputLayout_counterTextAppearance, C3406l.TextInputLayout_counterOverflowTextAppearance, C3406l.TextInputLayout_errorTextAppearance, C3406l.TextInputLayout_helperTextTextAppearance, C3406l.TextInputLayout_hintTextAppearance};
        C3310j.m7687a(context2, attributeSet2, i3, i4);
        C3310j.m7688a(context2, attributeSet, iArr, i, i4, iArr2);
        C1213u0 u0Var = new C1213u0(context2, context2.obtainStyledAttributes(attributeSet2, iArr, i3, i4));
        this.f1413r = u0Var.mo5316a(C3406l.TextInputLayout_hintEnabled, true);
        setHint(u0Var.mo5324e(C3406l.TextInputLayout_android_hint));
        this.f1414r0 = u0Var.mo5316a(C3406l.TextInputLayout_hintAnimationEnabled, true);
        this.f1422w = C3342j.m7744a(context2, attributeSet2, i3, f1359v0).mo9102a();
        this.f1423x = context2.getResources().getDimensionPixelOffset(C3318d.mtrl_textinput_box_label_cutout_padding);
        this.f1425z = u0Var.mo5317b(C3406l.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f1361B = u0Var.mo5319c(C3406l.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(C3318d.mtrl_textinput_box_stroke_width_default));
        this.f1362C = u0Var.mo5319c(C3406l.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(C3318d.mtrl_textinput_box_stroke_width_focused));
        this.f1360A = this.f1361B;
        float a = u0Var.mo5312a(C3406l.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float a2 = u0Var.mo5312a(C3406l.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float a3 = u0Var.mo5312a(C3406l.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float a4 = u0Var.mo5312a(C3406l.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        C3342j jVar = this.f1422w;
        if (jVar != null) {
            C3344b bVar4 = new C3344b(jVar);
            if (a >= 0.0f) {
                bVar4.mo9104c(a);
            }
            if (a2 >= 0.0f) {
                bVar4.mo9105d(a2);
            }
            if (a3 >= 0.0f) {
                bVar4.mo9103b(a3);
            }
            if (a4 >= 0.0f) {
                bVar4.mo9101a(a4);
            }
            this.f1422w = bVar4.mo9102a();
            ColorStateList a5 = C2286e.m5174a(context2, u0Var, C3406l.TextInputLayout_boxBackgroundColor);
            if (a5 != null) {
                int defaultColor = a5.getDefaultColor();
                this.f1402l0 = defaultColor;
                this.f1364E = defaultColor;
                if (a5.isStateful()) {
                    this.f1404m0 = a5.getColorForState(new int[]{-16842910}, -1);
                    i2 = a5.getColorForState(new int[]{16843623}, -1);
                } else {
                    ColorStateList a6 = C1070a.m2601a(context2, C3316c.mtrl_filled_background_color);
                    this.f1404m0 = a6.getColorForState(new int[]{-16842910}, -1);
                    i2 = a6.getColorForState(new int[]{16843623}, -1);
                }
                this.f1406n0 = i2;
            } else {
                this.f1364E = 0;
                this.f1402l0 = 0;
                this.f1404m0 = 0;
                this.f1406n0 = 0;
            }
            if (u0Var.mo5326f(C3406l.TextInputLayout_android_textColorHint)) {
                ColorStateList a7 = u0Var.mo5314a(C3406l.TextInputLayout_android_textColorHint);
                this.f1394h0 = a7;
                this.f1392g0 = a7;
            }
            ColorStateList a8 = C2286e.m5174a(context2, u0Var, C3406l.TextInputLayout_boxStrokeColor);
            if (a8 == null || !a8.isStateful()) {
                this.f1400k0 = u0Var.mo5313a(C3406l.TextInputLayout_boxStrokeColor, 0);
                this.f1396i0 = C1325a.m3373a(context2, C3316c.mtrl_textinput_default_box_stroke_color);
                this.f1408o0 = context2.getColor(C3316c.mtrl_textinput_disabled_color);
                this.f1398j0 = context2.getColor(C3316c.mtrl_textinput_hovered_box_stroke_color);
            } else {
                this.f1396i0 = a8.getDefaultColor();
                this.f1408o0 = a8.getColorForState(new int[]{-16842910}, -1);
                this.f1398j0 = a8.getColorForState(new int[]{16843623}, -1);
                this.f1400k0 = a8.getColorForState(new int[]{16842908}, -1);
            }
            if (u0Var.mo5327g(C3406l.TextInputLayout_hintTextAppearance, -1) != -1) {
                setHintTextAppearance(u0Var.mo5327g(C3406l.TextInputLayout_hintTextAppearance, 0));
            }
            int g = u0Var.mo5327g(C3406l.TextInputLayout_errorTextAppearance, 0);
            boolean a9 = u0Var.mo5316a(C3406l.TextInputLayout_errorEnabled, false);
            CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C3356h.design_text_input_end_icon, this.f1387e, false);
            this.f1388e0 = checkableImageButton;
            this.f1387e.addView(checkableImageButton);
            this.f1388e0.setVisibility(8);
            if (u0Var.mo5326f(C3406l.TextInputLayout_errorIconDrawable)) {
                setErrorIconDrawable(u0Var.mo5318b(C3406l.TextInputLayout_errorIconDrawable));
            }
            if (u0Var.mo5326f(C3406l.TextInputLayout_errorIconTint)) {
                setErrorIconTintList(C2286e.m5174a(context2, u0Var, C3406l.TextInputLayout_errorIconTint));
            }
            if (u0Var.mo5326f(C3406l.TextInputLayout_errorIconTintMode)) {
                setErrorIconTintMode(C2286e.m5175a(u0Var.mo5321d(C3406l.TextInputLayout_errorIconTintMode, -1), (Mode) null));
            }
            this.f1388e0.setContentDescription(getResources().getText(C3369j.error_icon_content_description));
            C1404o.m3545f(this.f1388e0, 2);
            this.f1388e0.setClickable(false);
            this.f1388e0.setPressable(false);
            this.f1388e0.setFocusable(false);
            int g2 = u0Var.mo5327g(C3406l.TextInputLayout_helperTextTextAppearance, 0);
            boolean a10 = u0Var.mo5316a(C3406l.TextInputLayout_helperTextEnabled, false);
            CharSequence e = u0Var.mo5324e(C3406l.TextInputLayout_helperText);
            boolean a11 = u0Var.mo5316a(C3406l.TextInputLayout_counterEnabled, false);
            setCounterMaxLength(u0Var.mo5321d(C3406l.TextInputLayout_counterMaxLength, -1));
            this.f1407o = u0Var.mo5327g(C3406l.TextInputLayout_counterTextAppearance, 0);
            this.f1405n = u0Var.mo5327g(C3406l.TextInputLayout_counterOverflowTextAppearance, 0);
            CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C3356h.design_text_input_start_icon, this.f1387e, false);
            this.f1369J = checkableImageButton2;
            this.f1387e.addView(checkableImageButton2);
            this.f1369J.setVisibility(8);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            if (u0Var.mo5326f(C3406l.TextInputLayout_startIconDrawable)) {
                setStartIconDrawable(u0Var.mo5318b(C3406l.TextInputLayout_startIconDrawable));
                if (u0Var.mo5326f(C3406l.TextInputLayout_startIconContentDescription)) {
                    setStartIconContentDescription(u0Var.mo5324e(C3406l.TextInputLayout_startIconContentDescription));
                }
                setStartIconCheckable(u0Var.mo5316a(C3406l.TextInputLayout_startIconCheckable, true));
            }
            if (u0Var.mo5326f(C3406l.TextInputLayout_startIconTint)) {
                setStartIconTintList(C2286e.m5174a(context2, u0Var, C3406l.TextInputLayout_startIconTint));
            }
            if (u0Var.mo5326f(C3406l.TextInputLayout_startIconTintMode)) {
                setStartIconTintMode(C2286e.m5175a(u0Var.mo5321d(C3406l.TextInputLayout_startIconTintMode, -1), (Mode) null));
            }
            setHelperTextEnabled(a10);
            setHelperText(e);
            setHelperTextTextAppearance(g2);
            setErrorEnabled(a9);
            setErrorTextAppearance(g);
            setCounterTextAppearance(this.f1407o);
            setCounterOverflowTextAppearance(this.f1405n);
            if (u0Var.mo5326f(C3406l.TextInputLayout_errorTextColor)) {
                setErrorTextColor(u0Var.mo5314a(C3406l.TextInputLayout_errorTextColor));
            }
            if (u0Var.mo5326f(C3406l.TextInputLayout_helperTextTextColor)) {
                setHelperTextColor(u0Var.mo5314a(C3406l.TextInputLayout_helperTextTextColor));
            }
            if (u0Var.mo5326f(C3406l.TextInputLayout_hintTextColor)) {
                setHintTextColor(u0Var.mo5314a(C3406l.TextInputLayout_hintTextColor));
            }
            if (u0Var.mo5326f(C3406l.TextInputLayout_counterTextColor)) {
                setCounterTextColor(u0Var.mo5314a(C3406l.TextInputLayout_counterTextColor));
            }
            if (u0Var.mo5326f(C3406l.TextInputLayout_counterOverflowTextColor)) {
                setCounterOverflowTextColor(u0Var.mo5314a(C3406l.TextInputLayout_counterOverflowTextColor));
            }
            setCounterEnabled(a11);
            setBoxBackgroundMode(u0Var.mo5321d(C3406l.TextInputLayout_boxBackgroundMode, 0));
            CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C3356h.design_text_input_end_icon, this.f1389f, false);
            this.f1379T = checkableImageButton3;
            this.f1389f.addView(checkableImageButton3);
            this.f1379T.setVisibility(8);
            this.f1378S.append(-1, new C3378f(this));
            this.f1378S.append(0, new C3394p(this));
            this.f1378S.append(1, new C3395q(this));
            this.f1378S.append(2, new C3370a(this));
            this.f1378S.append(3, new C3380h(this));
            if (u0Var.mo5326f(C3406l.TextInputLayout_endIconMode)) {
                setEndIconMode(u0Var.mo5321d(C3406l.TextInputLayout_endIconMode, 0));
                if (u0Var.mo5326f(C3406l.TextInputLayout_endIconDrawable)) {
                    setEndIconDrawable(u0Var.mo5318b(C3406l.TextInputLayout_endIconDrawable));
                }
                if (u0Var.mo5326f(C3406l.TextInputLayout_endIconContentDescription)) {
                    setEndIconContentDescription(u0Var.mo5324e(C3406l.TextInputLayout_endIconContentDescription));
                }
                setEndIconCheckable(u0Var.mo5316a(C3406l.TextInputLayout_endIconCheckable, true));
            } else if (u0Var.mo5326f(C3406l.TextInputLayout_passwordToggleEnabled)) {
                setEndIconMode(u0Var.mo5316a(C3406l.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
                setEndIconDrawable(u0Var.mo5318b(C3406l.TextInputLayout_passwordToggleDrawable));
                setEndIconContentDescription(u0Var.mo5324e(C3406l.TextInputLayout_passwordToggleContentDescription));
                if (u0Var.mo5326f(C3406l.TextInputLayout_passwordToggleTint)) {
                    setEndIconTintList(C2286e.m5174a(context2, u0Var, C3406l.TextInputLayout_passwordToggleTint));
                }
                if (u0Var.mo5326f(C3406l.TextInputLayout_passwordToggleTintMode)) {
                    setEndIconTintMode(C2286e.m5175a(u0Var.mo5321d(C3406l.TextInputLayout_passwordToggleTintMode, -1), (Mode) null));
                }
            }
            if (!u0Var.mo5326f(C3406l.TextInputLayout_passwordToggleEnabled)) {
                if (u0Var.mo5326f(C3406l.TextInputLayout_endIconTint)) {
                    setEndIconTintList(C2286e.m5174a(context2, u0Var, C3406l.TextInputLayout_endIconTint));
                }
                if (u0Var.mo5326f(C3406l.TextInputLayout_endIconTintMode)) {
                    setEndIconTintMode(C2286e.m5175a(u0Var.mo5321d(C3406l.TextInputLayout_endIconTintMode, -1), (Mode) null));
                }
            }
            u0Var.f3426b.recycle();
            setImportantForAccessibility(2);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static void m1091a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m1091a((ViewGroup) childAt, z);
            }
        }
    }

    private C3391n getEndIconDelegate() {
        C3391n nVar = (C3391n) this.f1378S.get(this.f1377R);
        return nVar != null ? nVar : (C3391n) this.f1378S.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f1388e0.getVisibility() == 0) {
            return this.f1388e0;
        }
        if (!mo2195f() || !mo2196g()) {
            return null;
        }
        return this.f1379T;
    }

    private void setEditText(EditText editText) {
        if (this.f1391g == null) {
            if (this.f1377R != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f1391g = editText;
            mo2231h();
            setTextInputAccessibilityDelegate(new C0248e(this));
            this.f1412q0.mo8997a(this.f1391g.getTypeface());
            C3296b bVar = this.f1412q0;
            float textSize = this.f1391g.getTextSize();
            if (bVar.f8256i != textSize) {
                bVar.f8256i = textSize;
                bVar.mo9006e();
            }
            int gravity = this.f1391g.getGravity();
            C3296b bVar2 = this.f1412q0;
            int i = (gravity & -113) | 48;
            if (bVar2.f8255h != i) {
                bVar2.f8255h = i;
                bVar2.mo9006e();
            }
            C3296b bVar3 = this.f1412q0;
            if (bVar3.f8254g != gravity) {
                bVar3.f8254g = gravity;
                bVar3.mo9006e();
            }
            this.f1391g.addTextChangedListener(new C0244a());
            if (this.f1392g0 == null) {
                this.f1392g0 = this.f1391g.getHintTextColors();
            }
            if (this.f1413r) {
                if (TextUtils.isEmpty(this.f1415s)) {
                    CharSequence hint = this.f1391g.getHint();
                    this.f1393h = hint;
                    setHint(hint);
                    this.f1391g.setHint(null);
                }
                this.f1417t = true;
            }
            if (this.f1403m != null) {
                mo2181a(this.f1391g.getText().length());
            }
            mo2235l();
            this.f1395i.mo9162a();
            this.f1369J.bringToFront();
            this.f1389f.bringToFront();
            this.f1388e0.bringToFront();
            Iterator it = this.f1376Q.iterator();
            while (it.hasNext()) {
                ((C0249f) it.next()).mo2309a(this);
            }
            mo2185a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.f1388e0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f1389f;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (!mo2195f()) {
            mo2236m();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f1415s)) {
            this.f1415s = charSequence;
            C3296b bVar = this.f1412q0;
            if (charSequence == null || !TextUtils.equals(bVar.f8270w, charSequence)) {
                bVar.f8270w = charSequence;
                bVar.f8271x = null;
                Bitmap bitmap = bVar.f8229A;
                if (bitmap != null) {
                    bitmap.recycle();
                    bVar.f8229A = null;
                }
                bVar.mo9006e();
            }
            if (!this.f1410p0) {
                mo2232i();
            }
        }
    }

    /* renamed from: a */
    public void mo2180a(float f) {
        if (this.f1412q0.f8250c != f) {
            if (this.f1416s0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f1416s0 = valueAnimator;
                valueAnimator.setInterpolator(C3407a.f8573b);
                this.f1416s0.setDuration(167);
                this.f1416s0.addUpdateListener(new C0247d());
            }
            this.f1416s0.setFloatValues(new float[]{this.f1412q0.f8250c, f});
            this.f1416s0.start();
        }
    }

    /* renamed from: a */
    public void mo2184a(C0249f fVar) {
        this.f1376Q.add(fVar);
        if (this.f1391g != null) {
            fVar.mo2309a(this);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            LayoutParams layoutParams2 = new LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f1387e.addView(view, layoutParams2);
            this.f1387e.setLayoutParams(layoutParams);
            mo2237n();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public final void mo2187b() {
        mo2183a(this.f1379T, this.f1382W, this.f1381V, this.f1384b0, this.f1383a0);
    }

    /* renamed from: c */
    public final void mo2188c() {
        mo2183a(this.f1369J, this.f1371L, this.f1370K, this.f1373N, this.f1372M);
    }

    /* renamed from: d */
    public final int mo2189d() {
        float b;
        if (!this.f1413r) {
            return 0;
        }
        int i = this.f1424y;
        if (i == 0 || i == 1) {
            b = this.f1412q0.mo8999b();
        } else if (i != 2) {
            return 0;
        } else {
            b = this.f1412q0.mo8999b() / 2.0f;
        }
        return (int) b;
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.f1393h != null) {
            EditText editText = this.f1391g;
            if (editText != null) {
                boolean z = this.f1417t;
                this.f1417t = false;
                CharSequence hint = editText.getHint();
                this.f1391g.setHint(this.f1393h);
                try {
                    super.dispatchProvideAutofillStructure(viewStructure, i);
                    return;
                } finally {
                    this.f1391g.setHint(hint);
                    this.f1417t = z;
                }
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i);
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f1420u0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1420u0 = false;
    }

    public void draw(Canvas canvas) {
        float f;
        super.draw(canvas);
        if (this.f1413r) {
            C3296b bVar = this.f1412q0;
            if (bVar != null) {
                int save = canvas.save();
                if (bVar.f8271x != null && bVar.f8249b) {
                    float f2 = bVar.f8264q;
                    float f3 = bVar.f8265r;
                    boolean z = bVar.f8273z && bVar.f8229A != null;
                    if (z) {
                        f = bVar.f8231C * bVar.f8233E;
                    } else {
                        f = bVar.f8237I.ascent() * bVar.f8233E;
                        bVar.f8237I.descent();
                    }
                    if (z) {
                        f3 += f;
                    }
                    float f4 = f3;
                    float f5 = bVar.f8233E;
                    if (f5 != 1.0f) {
                        canvas.scale(f5, f5, f2, f4);
                    }
                    if (z) {
                        canvas.drawBitmap(bVar.f8229A, f2, f4, bVar.f8230B);
                    } else {
                        CharSequence charSequence = bVar.f8271x;
                        canvas.drawText(charSequence, 0, charSequence.length(), f2, f4, bVar.f8237I);
                    }
                }
                canvas.restoreToCount(save);
            } else {
                throw null;
            }
        }
        C3337g gVar = this.f1421v;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f1360A;
            this.f1421v.draw(canvas);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f1418t0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.f1418t0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            q.b.a.c.b0.b r2 = r4.f1412q0
            r3 = 0
            if (r2 == 0) goto L_0x0037
            r2.f8235G = r1
            android.content.res.ColorStateList r1 = r2.f8259l
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r2.f8258k
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r1 = r0
            goto L_0x002d
        L_0x002c:
            r1 = r3
        L_0x002d:
            if (r1 == 0) goto L_0x0034
            r2.mo9006e()
            r1 = r0
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            r1 = r1 | r3
            goto L_0x0038
        L_0x0037:
            r1 = r3
        L_0x0038:
            boolean r2 = p124p.p150h.p162l.C1404o.m3563x(r4)
            if (r2 == 0) goto L_0x0045
            boolean r2 = r4.isEnabled()
            if (r2 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r0 = r3
        L_0x0046:
            r4.mo2185a(r0, r3)
            r4.mo2235l()
            r4.mo2238o()
            if (r1 == 0) goto L_0x0054
            r4.invalidate()
        L_0x0054:
            r4.f1418t0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    /* renamed from: e */
    public final boolean mo2194e() {
        return this.f1413r && !TextUtils.isEmpty(this.f1415s) && (this.f1419u instanceof C3379g);
    }

    /* renamed from: f */
    public final boolean mo2195f() {
        return this.f1377R != 0;
    }

    /* renamed from: g */
    public boolean mo2196g() {
        return this.f1389f.getVisibility() == 0 && this.f1379T.getVisibility() == 0;
    }

    public int getBaseline() {
        EditText editText = this.f1391g;
        if (editText == null) {
            return super.getBaseline();
        }
        return mo2189d() + getPaddingTop() + editText.getBaseline();
    }

    public C3337g getBoxBackground() {
        int i = this.f1424y;
        if (i == 1 || i == 2) {
            return this.f1419u;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1364E;
    }

    public int getBoxBackgroundMode() {
        return this.f1424y;
    }

    public float getBoxCornerRadiusBottomEnd() {
        C3337g gVar = this.f1419u;
        return gVar.f8365e.f8387a.f8418h.mo9050a(gVar.mo9067b());
    }

    public float getBoxCornerRadiusBottomStart() {
        C3337g gVar = this.f1419u;
        return gVar.f8365e.f8387a.f8417g.mo9050a(gVar.mo9067b());
    }

    public float getBoxCornerRadiusTopEnd() {
        C3337g gVar = this.f1419u;
        return gVar.f8365e.f8387a.f8416f.mo9050a(gVar.mo9067b());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f1419u.mo9076g();
    }

    public int getBoxStrokeColor() {
        return this.f1400k0;
    }

    public int getCounterMaxLength() {
        return this.f1399k;
    }

    public CharSequence getCounterOverflowDescription() {
        if (this.f1397j && this.f1401l) {
            TextView textView = this.f1403m;
            if (textView != null) {
                return textView.getContentDescription();
            }
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f1409p;
    }

    public ColorStateList getCounterTextColor() {
        return this.f1409p;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1392g0;
    }

    public EditText getEditText() {
        return this.f1391g;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1379T.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1379T.getDrawable();
    }

    public int getEndIconMode() {
        return this.f1377R;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1379T;
    }

    public CharSequence getError() {
        C3392o oVar = this.f1395i;
        if (oVar.f8530l) {
            return oVar.f8529k;
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f1395i.mo9170d();
    }

    public Drawable getErrorIconDrawable() {
        return this.f1388e0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f1395i.mo9170d();
    }

    public CharSequence getHelperText() {
        C3392o oVar = this.f1395i;
        if (oVar.f8535q) {
            return oVar.f8534p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f1395i.f8536r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1413r) {
            return this.f1415s;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f1412q0.mo8999b();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f1412q0.mo9002c();
    }

    public ColorStateList getHintTextColor() {
        return this.f1394h0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1379T.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1379T.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1369J.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1369J.getDrawable();
    }

    public Typeface getTypeface() {
        return this.f1368I;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2231h() {
        /*
            r4 = this;
            int r0 = r4.f1424y
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x004b
            if (r0 == r2) goto L_0x003a
            r3 = 2
            if (r0 != r3) goto L_0x0027
            boolean r0 = r4.f1413r
            if (r0 == 0) goto L_0x001d
            q.b.a.c.g0.g r0 = r4.f1419u
            boolean r0 = r0 instanceof p213q.p217b.p218a.p271c.p281j0.C3379g
            if (r0 != 0) goto L_0x001d
            q.b.a.c.j0.g r0 = new q.b.a.c.j0.g
            q.b.a.c.g0.j r3 = r4.f1422w
            r0.<init>(r3)
            goto L_0x0024
        L_0x001d:
            q.b.a.c.g0.g r0 = new q.b.a.c.g0.g
            q.b.a.c.g0.j r3 = r4.f1422w
            r0.<init>(r3)
        L_0x0024:
            r4.f1419u = r0
            goto L_0x004d
        L_0x0027:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r4.f1424y
            java.lang.String r3 = " is illegal; only @BoxBackgroundMode constants are supported."
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4753a(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x003a:
            q.b.a.c.g0.g r0 = new q.b.a.c.g0.g
            q.b.a.c.g0.j r1 = r4.f1422w
            r0.<init>(r1)
            r4.f1419u = r0
            q.b.a.c.g0.g r0 = new q.b.a.c.g0.g
            r0.<init>()
            r4.f1421v = r0
            goto L_0x004f
        L_0x004b:
            r4.f1419u = r1
        L_0x004d:
            r4.f1421v = r1
        L_0x004f:
            android.widget.EditText r0 = r4.f1391g
            if (r0 == 0) goto L_0x0062
            q.b.a.c.g0.g r1 = r4.f1419u
            if (r1 == 0) goto L_0x0062
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L_0x0062
            int r0 = r4.f1424y
            if (r0 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r2 = 0
        L_0x0063:
            if (r2 == 0) goto L_0x006c
            android.widget.EditText r0 = r4.f1391g
            q.b.a.c.g0.g r1 = r4.f1419u
            p124p.p150h.p162l.C1404o.m3522a(r0, r1)
        L_0x006c:
            r4.mo2238o()
            int r0 = r4.f1424y
            if (r0 == 0) goto L_0x0076
            r4.mo2237n()
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo2231h():void");
    }

    /* renamed from: i */
    public final void mo2232i() {
        if (mo2194e()) {
            RectF rectF = this.f1367H;
            C3296b bVar = this.f1412q0;
            boolean a = bVar.mo8998a(bVar.f8270w);
            Rect rect = bVar.f8252e;
            float a2 = !a ? (float) rect.left : ((float) rect.right) - bVar.mo8994a();
            rectF.left = a2;
            Rect rect2 = bVar.f8252e;
            rectF.top = (float) rect2.top;
            rectF.right = !a ? bVar.mo8994a() + a2 : (float) rect2.right;
            float b = bVar.mo8999b() + ((float) bVar.f8252e.top);
            rectF.bottom = b;
            float f = (float) this.f1423x;
            rectF.left -= f;
            rectF.top -= f;
            rectF.right += f;
            rectF.bottom = b + f;
            rectF.offset((float) (-getPaddingLeft()), 0.0f);
            C3379g gVar = (C3379g) this.f1419u;
            if (gVar != null) {
                gVar.mo9146a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            throw null;
        }
    }

    /* renamed from: j */
    public final void mo2233j() {
        if (this.f1403m != null) {
            EditText editText = this.f1391g;
            mo2181a(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: k */
    public final void mo2234k() {
        TextView textView = this.f1403m;
        if (textView != null) {
            mo2182a(textView, this.f1401l ? this.f1405n : this.f1407o);
            if (!this.f1401l) {
                ColorStateList colorStateList = this.f1409p;
                if (colorStateList != null) {
                    this.f1403m.setTextColor(colorStateList);
                }
            }
            if (this.f1401l) {
                ColorStateList colorStateList2 = this.f1411q;
                if (colorStateList2 != null) {
                    this.f1403m.setTextColor(colorStateList2);
                }
            }
        }
    }

    /* renamed from: l */
    public void mo2235l() {
        int currentTextColor;
        EditText editText = this.f1391g;
        if (editText != null && this.f1424y == 0) {
            Drawable background = editText.getBackground();
            if (background != null) {
                if (C1145b0.m2890a(background)) {
                    background = background.mutate();
                }
                if (this.f1395i.mo9169c()) {
                    currentTextColor = this.f1395i.mo9170d();
                } else {
                    if (this.f1401l) {
                        TextView textView = this.f1403m;
                        if (textView != null) {
                            currentTextColor = textView.getCurrentTextColor();
                        }
                    }
                    background.clearColorFilter();
                    this.f1391g.refreshDrawableState();
                }
                background.setColorFilter(C1178i.m2950a(currentTextColor, Mode.SRC_IN));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2236m() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f1391g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 1
            if (r0 == 0) goto L_0x000f
            r0 = r2
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            r3 = 0
            r4 = 3
            r5 = 2
            if (r0 == 0) goto L_0x006c
            com.google.android.material.internal.CheckableImageButton r0 = r10.f1369J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x001f
            r0 = r2
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            if (r0 == 0) goto L_0x006c
            com.google.android.material.internal.CheckableImageButton r0 = r10.f1369J
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x006c
            android.graphics.drawable.Drawable r0 = r10.f1374O
            if (r0 != 0) goto L_0x0054
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r10.f1374O = r0
            com.google.android.material.internal.CheckableImageButton r0 = r10.f1369J
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f1391g
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.f1369J
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = r6.getMarginEnd()
            int r0 = r0 + r6
            android.graphics.drawable.Drawable r6 = r10.f1374O
            r6.setBounds(r1, r1, r0, r2)
        L_0x0054:
            android.widget.EditText r0 = r10.f1391g
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f1374O
            if (r6 == r7) goto L_0x0085
            android.widget.EditText r6 = r10.f1391g
            r8 = r0[r2]
            r9 = r0[r5]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L_0x0083
        L_0x006c:
            android.graphics.drawable.Drawable r0 = r10.f1374O
            if (r0 == 0) goto L_0x0085
            android.widget.EditText r0 = r10.f1391g
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.f1391g
            r7 = r0[r2]
            r8 = r0[r5]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r3, r7, r8, r0)
            r10.f1374O = r3
        L_0x0083:
            r0 = r2
            goto L_0x0086
        L_0x0085:
            r0 = r1
        L_0x0086:
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x00d6
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L_0x00d6
            android.graphics.drawable.Drawable r3 = r10.f1385c0
            if (r3 != 0) goto L_0x00b8
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r3.<init>()
            r10.f1385c0 = r3
            int r3 = r6.getMeasuredWidth()
            android.widget.EditText r7 = r10.f1391g
            int r7 = r7.getPaddingRight()
            int r3 = r3 - r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = r6.getMarginStart()
            int r3 = r3 + r6
            android.graphics.drawable.Drawable r6 = r10.f1385c0
            r6.setBounds(r1, r1, r3, r2)
        L_0x00b8:
            android.widget.EditText r3 = r10.f1391g
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawablesRelative()
            r6 = r3[r5]
            android.graphics.drawable.Drawable r7 = r10.f1385c0
            if (r6 == r7) goto L_0x00d4
            r0 = r3[r5]
            r10.f1386d0 = r0
            android.widget.EditText r0 = r10.f1391g
            r1 = r3[r1]
            r5 = r3[r2]
            r3 = r3[r4]
            r0.setCompoundDrawablesRelative(r1, r5, r7, r3)
            goto L_0x00f7
        L_0x00d4:
            r2 = r0
            goto L_0x00f7
        L_0x00d6:
            android.graphics.drawable.Drawable r6 = r10.f1385c0
            if (r6 == 0) goto L_0x00f8
            android.widget.EditText r6 = r10.f1391g
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r5 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f1385c0
            if (r5 != r7) goto L_0x00f4
            android.widget.EditText r0 = r10.f1391g
            r1 = r6[r1]
            r5 = r6[r2]
            android.graphics.drawable.Drawable r7 = r10.f1386d0
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r5, r7, r4)
            goto L_0x00f5
        L_0x00f4:
            r2 = r0
        L_0x00f5:
            r10.f1385c0 = r3
        L_0x00f7:
            r0 = r2
        L_0x00f8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo2236m():boolean");
    }

    /* renamed from: n */
    public final void mo2237n() {
        if (this.f1424y != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1387e.getLayoutParams();
            int d = mo2189d();
            if (d != layoutParams.topMargin) {
                layoutParams.topMargin = d;
                this.f1387e.requestLayout();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ca  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2238o() {
        /*
            r6 = this;
            q.b.a.c.g0.g r0 = r6.f1419u
            if (r0 == 0) goto L_0x00e0
            int r0 = r6.f1424y
            if (r0 != 0) goto L_0x000a
            goto L_0x00e0
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f1391g
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.f1391g
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = r1
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.f1408o0
        L_0x003c:
            r6.f1363D = r4
            goto L_0x0068
        L_0x003f:
            q.b.a.c.j0.o r4 = r6.f1395i
            boolean r4 = r4.mo9169c()
            if (r4 == 0) goto L_0x004e
            q.b.a.c.j0.o r4 = r6.f1395i
            int r4 = r4.mo9170d()
            goto L_0x003c
        L_0x004e:
            boolean r4 = r6.f1401l
            if (r4 == 0) goto L_0x005b
            android.widget.TextView r4 = r6.f1403m
            if (r4 == 0) goto L_0x005b
            int r4 = r4.getCurrentTextColor()
            goto L_0x003c
        L_0x005b:
            if (r0 == 0) goto L_0x0060
            int r4 = r6.f1400k0
            goto L_0x003c
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            int r4 = r6.f1398j0
            goto L_0x003c
        L_0x0065:
            int r4 = r6.f1396i0
            goto L_0x003c
        L_0x0068:
            q.b.a.c.j0.o r4 = r6.f1395i
            boolean r4 = r4.mo9169c()
            if (r4 == 0) goto L_0x007c
            q.b.a.c.j0.n r4 = r6.getEndIconDelegate()
            boolean r4 = r4.mo9149b()
            if (r4 == 0) goto L_0x007c
            r4 = r2
            goto L_0x007d
        L_0x007c:
            r4 = r1
        L_0x007d:
            if (r4 == 0) goto L_0x009c
            android.graphics.drawable.Drawable r4 = r6.getEndIconDrawable()
            if (r4 == 0) goto L_0x009c
            android.graphics.drawable.Drawable r4 = r6.getEndIconDrawable()
            android.graphics.drawable.Drawable r4 = r4.mutate()
            q.b.a.c.j0.o r5 = r6.f1395i
            int r5 = r5.mo9170d()
            r4.setTint(r5)
            com.google.android.material.internal.CheckableImageButton r5 = r6.f1379T
            r5.setImageDrawable(r4)
            goto L_0x009f
        L_0x009c:
            r6.mo2187b()
        L_0x009f:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x00b2
            q.b.a.c.j0.o r4 = r6.f1395i
            boolean r5 = r4.f8530l
            if (r5 == 0) goto L_0x00b2
            boolean r4 = r4.mo9169c()
            if (r4 == 0) goto L_0x00b2
            r1 = r2
        L_0x00b2:
            r6.setErrorIconVisible(r1)
            if (r3 != 0) goto L_0x00b9
            if (r0 == 0) goto L_0x00c2
        L_0x00b9:
            boolean r0 = r6.isEnabled()
            if (r0 == 0) goto L_0x00c2
            int r0 = r6.f1362C
            goto L_0x00c4
        L_0x00c2:
            int r0 = r6.f1361B
        L_0x00c4:
            r6.f1360A = r0
            int r0 = r6.f1424y
            if (r0 != r2) goto L_0x00dd
            boolean r0 = r6.isEnabled()
            if (r0 != 0) goto L_0x00d5
            int r0 = r6.f1404m0
        L_0x00d2:
            r6.f1364E = r0
            goto L_0x00dd
        L_0x00d5:
            if (r3 == 0) goto L_0x00da
            int r0 = r6.f1406n0
            goto L_0x00d2
        L_0x00da:
            int r0 = r6.f1402l0
            goto L_0x00d2
        L_0x00dd:
            r6.mo2179a()
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo2238o():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.widget.EditText r5 = r4.f1391g
            if (r5 == 0) goto L_0x013d
            android.graphics.Rect r6 = r4.f1365F
            p213q.p217b.p218a.p271c.p273b0.C3297c.m7673a(r4, r5, r6)
            q.b.a.c.g0.g r5 = r4.f1421v
            if (r5 == 0) goto L_0x001d
            int r7 = r6.bottom
            int r8 = r4.f1362C
            int r8 = r7 - r8
            int r9 = r6.left
            int r0 = r6.right
            r5.setBounds(r9, r8, r0, r7)
        L_0x001d:
            boolean r5 = r4.f1413r
            if (r5 == 0) goto L_0x013d
            q.b.a.c.b0.b r5 = r4.f1412q0
            android.widget.EditText r7 = r4.f1391g
            if (r7 == 0) goto L_0x0137
            android.graphics.Rect r8 = r4.f1366G
            int r9 = r6.bottom
            r8.bottom = r9
            int r9 = r4.f1424y
            r0 = 1
            if (r9 == r0) goto L_0x005e
            r1 = 2
            if (r9 == r1) goto L_0x0043
            int r9 = r6.left
            int r7 = r7.getCompoundPaddingLeft()
            int r7 = r7 + r9
            r8.left = r7
            int r7 = r4.getPaddingTop()
            goto L_0x006c
        L_0x0043:
            int r9 = r6.left
            int r7 = r7.getPaddingLeft()
            int r7 = r7 + r9
            r8.left = r7
            int r7 = r6.top
            int r9 = r4.mo2189d()
            int r7 = r7 - r9
            r8.top = r7
            int r7 = r6.right
            android.widget.EditText r9 = r4.f1391g
            int r9 = r9.getPaddingRight()
            goto L_0x0076
        L_0x005e:
            int r9 = r6.left
            int r7 = r7.getCompoundPaddingLeft()
            int r7 = r7 + r9
            r8.left = r7
            int r7 = r6.top
            int r9 = r4.f1425z
            int r7 = r7 + r9
        L_0x006c:
            r8.top = r7
            int r7 = r6.right
            android.widget.EditText r9 = r4.f1391g
            int r9 = r9.getCompoundPaddingRight()
        L_0x0076:
            int r7 = r7 - r9
            r8.right = r7
            r9 = 0
            if (r5 == 0) goto L_0x0136
            int r1 = r8.left
            int r2 = r8.top
            int r8 = r8.bottom
            android.graphics.Rect r3 = r5.f8252e
            boolean r3 = p213q.p217b.p218a.p271c.p273b0.C3296b.m7659a(r3, r1, r2, r7, r8)
            if (r3 != 0) goto L_0x0094
            android.graphics.Rect r3 = r5.f8252e
            r3.set(r1, r2, r7, r8)
            r5.f8236H = r0
            r5.mo9004d()
        L_0x0094:
            q.b.a.c.b0.b r5 = r4.f1412q0
            android.widget.EditText r7 = r4.f1391g
            if (r7 == 0) goto L_0x0130
            android.graphics.Rect r7 = r4.f1366G
            android.text.TextPaint r8 = r5.f8238J
            float r1 = r5.f8256i
            r8.setTextSize(r1)
            android.graphics.Typeface r1 = r5.f8267t
            r8.setTypeface(r1)
            android.text.TextPaint r8 = r5.f8238J
            float r8 = r8.ascent()
            float r8 = -r8
            int r1 = r6.left
            android.widget.EditText r2 = r4.f1391g
            int r2 = r2.getCompoundPaddingLeft()
            int r2 = r2 + r1
            r7.left = r2
            int r1 = r4.f1424y
            if (r1 != r0) goto L_0x00c8
            android.widget.EditText r1 = r4.f1391g
            int r1 = r1.getMinLines()
            if (r1 > r0) goto L_0x00c8
            r1 = r0
            goto L_0x00c9
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            if (r1 == 0) goto L_0x00d7
            int r1 = r6.centerY()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r8 / r2
            float r1 = r1 - r2
            int r1 = (int) r1
            goto L_0x00e0
        L_0x00d7:
            int r1 = r6.top
            android.widget.EditText r2 = r4.f1391g
            int r2 = r2.getCompoundPaddingTop()
            int r1 = r1 + r2
        L_0x00e0:
            r7.top = r1
            int r1 = r6.right
            android.widget.EditText r2 = r4.f1391g
            int r2 = r2.getCompoundPaddingRight()
            int r1 = r1 - r2
            r7.right = r1
            int r1 = r4.f1424y
            if (r1 != r0) goto L_0x00f7
            int r6 = r7.top
            float r6 = (float) r6
            float r6 = r6 + r8
            int r6 = (int) r6
            goto L_0x0100
        L_0x00f7:
            int r6 = r6.bottom
            android.widget.EditText r8 = r4.f1391g
            int r8 = r8.getCompoundPaddingBottom()
            int r6 = r6 - r8
        L_0x0100:
            r7.bottom = r6
            if (r5 == 0) goto L_0x012f
            int r8 = r7.left
            int r9 = r7.top
            int r7 = r7.right
            android.graphics.Rect r1 = r5.f8251d
            boolean r1 = p213q.p217b.p218a.p271c.p273b0.C3296b.m7659a(r1, r8, r9, r7, r6)
            if (r1 != 0) goto L_0x011c
            android.graphics.Rect r1 = r5.f8251d
            r1.set(r8, r9, r7, r6)
            r5.f8236H = r0
            r5.mo9004d()
        L_0x011c:
            q.b.a.c.b0.b r5 = r4.f1412q0
            r5.mo9006e()
            boolean r5 = r4.mo2194e()
            if (r5 == 0) goto L_0x013d
            boolean r5 = r4.f1410p0
            if (r5 != 0) goto L_0x013d
            r4.mo2232i()
            goto L_0x013d
        L_0x012f:
            throw r9
        L_0x0130:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L_0x0136:
            throw r9
        L_0x0137:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L_0x013d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.f1391g != null) {
            int max = Math.max(this.f1379T.getMeasuredHeight(), this.f1369J.getMeasuredHeight());
            if (this.f1391g.getMeasuredHeight() < max) {
                this.f1391g.setMinimumHeight(max);
                z = true;
            }
        }
        boolean m = mo2236m();
        if (z || m) {
            this.f1391g.post(new C0246c());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0251h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0251h hVar = (C0251h) parcelable;
        super.onRestoreInstanceState(hVar.f4274e);
        setError(hVar.f1431g);
        if (hVar.f1432h) {
            this.f1379T.post(new C0245b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0251h hVar = new C0251h(super.onSaveInstanceState());
        if (this.f1395i.mo9169c()) {
            hVar.f1431g = getError();
        }
        hVar.f1432h = mo2195f() && this.f1379T.f1337g;
        return hVar;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1364E != i) {
            this.f1364E = i;
            this.f1402l0 = i;
            mo2179a();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C1325a.m3373a(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f1424y) {
            this.f1424y = i;
            if (this.f1391g != null) {
                mo2231h();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f1400k0 != i) {
            this.f1400k0 = i;
            mo2238o();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.f1397j != z) {
            if (z) {
                C1218w wVar = new C1218w(getContext());
                this.f1403m = wVar;
                wVar.setId(C3327f.textinput_counter);
                Typeface typeface = this.f1368I;
                if (typeface != null) {
                    this.f1403m.setTypeface(typeface);
                }
                this.f1403m.setMaxLines(1);
                this.f1395i.mo9164a(this.f1403m, 2);
                mo2234k();
                mo2233j();
            } else {
                this.f1395i.mo9168b(this.f1403m, 2);
                this.f1403m = null;
            }
            this.f1397j = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f1399k != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f1399k = i;
            if (this.f1397j) {
                mo2233j();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f1405n != i) {
            this.f1405n = i;
            mo2234k();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f1411q != colorStateList) {
            this.f1411q = colorStateList;
            mo2234k();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f1407o != i) {
            this.f1407o = i;
            mo2234k();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f1409p != colorStateList) {
            this.f1409p = colorStateList;
            mo2234k();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1392g0 = colorStateList;
        this.f1394h0 = colorStateList;
        if (this.f1391g != null) {
            mo2185a(false, false);
        }
    }

    public void setEnabled(boolean z) {
        m1091a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f1379T.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f1379T.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f1379T.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C1070a.m2602b(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f1379T.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f1377R;
        this.f1377R = i;
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo9148a(this.f1424y)) {
            getEndIconDelegate().mo9137a();
            mo2187b();
            Iterator it = this.f1380U.iterator();
            while (it.hasNext()) {
                ((C0250g) it.next()).mo2310a(this, i2);
            }
            return;
        }
        StringBuilder a = C1965a.m4756a("The current box background mode ");
        a.append(this.f1424y);
        a.append(" is not supported by the end icon mode ");
        a.append(i);
        throw new IllegalStateException(a.toString());
    }

    public void setEndIconOnClickListener(OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f1379T;
        OnLongClickListener onLongClickListener = this.f1390f0;
        checkableImageButton.setOnClickListener(onClickListener);
        m1092a(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f1390f0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f1379T;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m1092a(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f1381V != colorStateList) {
            this.f1381V = colorStateList;
            this.f1382W = true;
            mo2187b();
        }
    }

    public void setEndIconTintMode(Mode mode) {
        if (this.f1383a0 != mode) {
            this.f1383a0 = mode;
            this.f1384b0 = true;
            mo2187b();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (mo2196g() != z) {
            this.f1379T.setVisibility(z ? 0 : 4);
            mo2236m();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f1395i.f8530l) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C3392o oVar = this.f1395i;
            oVar.mo9167b();
            oVar.f8529k = charSequence;
            oVar.f8531m.setText(charSequence);
            if (oVar.f8527i != 1) {
                oVar.f8528j = 1;
            }
            oVar.mo9163a(oVar.f8527i, oVar.f8528j, oVar.mo9166a(oVar.f8531m, charSequence));
        } else {
            this.f1395i.mo9171e();
        }
    }

    public void setErrorEnabled(boolean z) {
        C3392o oVar = this.f1395i;
        if (oVar.f8530l != z) {
            oVar.mo9167b();
            if (z) {
                C1218w wVar = new C1218w(oVar.f8519a);
                oVar.f8531m = wVar;
                wVar.setId(C3327f.textinput_error);
                Typeface typeface = oVar.f8539u;
                if (typeface != null) {
                    oVar.f8531m.setTypeface(typeface);
                }
                int i = oVar.f8532n;
                oVar.f8532n = i;
                TextView textView = oVar.f8531m;
                if (textView != null) {
                    oVar.f8520b.mo2182a(textView, i);
                }
                ColorStateList colorStateList = oVar.f8533o;
                oVar.f8533o = colorStateList;
                TextView textView2 = oVar.f8531m;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                oVar.f8531m.setVisibility(4);
                C1404o.m3543e(oVar.f8531m, 1);
                oVar.mo9164a(oVar.f8531m, 0);
            } else {
                oVar.mo9171e();
                oVar.mo9168b(oVar.f8531m, 0);
                oVar.f8531m = null;
                oVar.f8520b.mo2235l();
                oVar.f8520b.mo2238o();
            }
            oVar.f8530l = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C1070a.m2602b(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1388e0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f1395i.f8530l);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1388e0.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (this.f1388e0.getDrawable() != drawable) {
            this.f1388e0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(Mode mode) {
        Drawable drawable = this.f1388e0.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (this.f1388e0.getDrawable() != drawable) {
            this.f1388e0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        C3392o oVar = this.f1395i;
        oVar.f8532n = i;
        TextView textView = oVar.f8531m;
        if (textView != null) {
            oVar.f8520b.mo2182a(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C3392o oVar = this.f1395i;
        oVar.f8533o = colorStateList;
        TextView textView = oVar.f8531m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.f1395i.f8535q) {
                setHelperTextEnabled(true);
            }
            C3392o oVar = this.f1395i;
            oVar.mo9167b();
            oVar.f8534p = charSequence;
            oVar.f8536r.setText(charSequence);
            if (oVar.f8527i != 2) {
                oVar.f8528j = 2;
            }
            oVar.mo9163a(oVar.f8527i, oVar.f8528j, oVar.mo9166a(oVar.f8536r, charSequence));
        } else if (this.f1395i.f8535q) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C3392o oVar = this.f1395i;
        oVar.f8538t = colorStateList;
        TextView textView = oVar.f8536r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C3392o oVar = this.f1395i;
        if (oVar.f8535q != z) {
            oVar.mo9167b();
            if (z) {
                C1218w wVar = new C1218w(oVar.f8519a);
                oVar.f8536r = wVar;
                wVar.setId(C3327f.textinput_helper_text);
                Typeface typeface = oVar.f8539u;
                if (typeface != null) {
                    oVar.f8536r.setTypeface(typeface);
                }
                oVar.f8536r.setVisibility(4);
                C1404o.m3543e(oVar.f8536r, 1);
                int i = oVar.f8537s;
                oVar.f8537s = i;
                TextView textView = oVar.f8536r;
                if (textView != null) {
                    textView.setTextAppearance(i);
                }
                ColorStateList colorStateList = oVar.f8538t;
                oVar.f8538t = colorStateList;
                TextView textView2 = oVar.f8536r;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                oVar.mo9164a(oVar.f8536r, 1);
            } else {
                oVar.mo9167b();
                if (oVar.f8527i == 2) {
                    oVar.f8528j = 0;
                }
                oVar.mo9163a(oVar.f8527i, oVar.f8528j, oVar.mo9166a(oVar.f8536r, (CharSequence) null));
                oVar.mo9168b(oVar.f8536r, 1);
                oVar.f8536r = null;
                oVar.f8520b.mo2235l();
                oVar.f8520b.mo2238o();
            }
            oVar.f8535q = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        C3392o oVar = this.f1395i;
        oVar.f8537s = i;
        TextView textView = oVar.f8536r;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1413r) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f1414r0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f1413r) {
            this.f1413r = z;
            if (!z) {
                this.f1417t = false;
                if (!TextUtils.isEmpty(this.f1415s) && TextUtils.isEmpty(this.f1391g.getHint())) {
                    this.f1391g.setHint(this.f1415s);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f1391g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1415s)) {
                        setHint(hint);
                    }
                    this.f1391g.setHint(null);
                }
                this.f1417t = true;
            }
            if (this.f1391g != null) {
                mo2237n();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C3296b bVar = this.f1412q0;
        C3321b bVar2 = new C3321b(bVar.f8248a.getContext(), i);
        ColorStateList colorStateList = bVar2.f8319b;
        if (colorStateList != null) {
            bVar.f8259l = colorStateList;
        }
        float f = bVar2.f8318a;
        if (f != 0.0f) {
            bVar.f8257j = f;
        }
        ColorStateList colorStateList2 = bVar2.f8323f;
        if (colorStateList2 != null) {
            bVar.f8244P = colorStateList2;
        }
        bVar.f8242N = bVar2.f8324g;
        bVar.f8243O = bVar2.f8325h;
        bVar.f8241M = bVar2.f8326i;
        C3319a aVar = bVar.f8269v;
        if (aVar != null) {
            aVar.f8317c = true;
        }
        C3295a aVar2 = new C3295a(bVar);
        bVar2.mo9045a();
        bVar.f8269v = new C3319a(aVar2, bVar2.f8329l);
        bVar2.mo9047a(bVar.f8248a.getContext(), (C3324d) bVar.f8269v);
        bVar.mo9006e();
        this.f1394h0 = this.f1412q0.f8259l;
        if (this.f1391g != null) {
            mo2185a(false, false);
            mo2237n();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1394h0 != colorStateList) {
            if (this.f1392g0 == null) {
                C3296b bVar = this.f1412q0;
                if (bVar.f8259l != colorStateList) {
                    bVar.f8259l = colorStateList;
                    bVar.mo9006e();
                }
            }
            this.f1394h0 = colorStateList;
            if (this.f1391g != null) {
                mo2185a(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1379T.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C1070a.m2602b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1379T.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f1377R != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f1381V = colorStateList;
        this.f1382W = true;
        mo2187b();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(Mode mode) {
        this.f1383a0 = mode;
        this.f1384b0 = true;
        mo2187b();
    }

    public void setStartIconCheckable(boolean z) {
        this.f1369J.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f1369J.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C1070a.m2602b(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1369J.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            mo2188c();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f1369J;
        OnLongClickListener onLongClickListener = this.f1375P;
        checkableImageButton.setOnClickListener(onClickListener);
        m1092a(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f1375P = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f1369J;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m1092a(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f1370K != colorStateList) {
            this.f1370K = colorStateList;
            this.f1371L = true;
            mo2188c();
        }
    }

    public void setStartIconTintMode(Mode mode) {
        if (this.f1372M != mode) {
            this.f1372M = mode;
            this.f1373N = true;
            mo2188c();
        }
    }

    public void setStartIconVisible(boolean z) {
        int i = 0;
        if ((this.f1369J.getVisibility() == 0) != z) {
            CheckableImageButton checkableImageButton = this.f1369J;
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            mo2236m();
        }
    }

    public void setTextInputAccessibilityDelegate(C0248e eVar) {
        EditText editText = this.f1391g;
        if (editText != null) {
            C1404o.m3526a((View) editText, (C1387a) eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1368I) {
            this.f1368I = typeface;
            this.f1412q0.mo8997a(typeface);
            C3392o oVar = this.f1395i;
            if (typeface != oVar.f8539u) {
                oVar.f8539u = typeface;
                TextView textView = oVar.f8531m;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = oVar.f8536r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f1403m;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2179a() {
        /*
            r6 = this;
            q.b.a.c.g0.g r0 = r6.f1419u
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            q.b.a.c.g0.j r1 = r6.f1422w
            r0.setShapeAppearanceModel(r1)
            int r0 = r6.f1424y
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0021
            int r0 = r6.f1360A
            if (r0 <= r2) goto L_0x001c
            int r0 = r6.f1363D
            if (r0 == 0) goto L_0x001c
            r0 = r4
            goto L_0x001d
        L_0x001c:
            r0 = r3
        L_0x001d:
            if (r0 == 0) goto L_0x0021
            r0 = r4
            goto L_0x0022
        L_0x0021:
            r0 = r3
        L_0x0022:
            if (r0 == 0) goto L_0x002e
            q.b.a.c.g0.g r0 = r6.f1419u
            int r1 = r6.f1360A
            float r1 = (float) r1
            int r5 = r6.f1363D
            r0.mo9060a(r1, r5)
        L_0x002e:
            int r0 = r6.f1364E
            int r1 = r6.f1424y
            if (r1 != r4) goto L_0x0044
            int r0 = p213q.p217b.p218a.p271c.C3294b.colorSurface
            android.content.Context r1 = r6.getContext()
            int r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5154a(r1, r0, r3)
            int r1 = r6.f1364E
            int r0 = p124p.p150h.p154f.C1335a.m3387a(r1, r0)
        L_0x0044:
            r6.f1364E = r0
            q.b.a.c.g0.g r1 = r6.f1419u
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.mo9063a(r0)
            int r0 = r6.f1377R
            r1 = 3
            if (r0 != r1) goto L_0x005d
            android.widget.EditText r0 = r6.f1391g
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L_0x005d:
            q.b.a.c.g0.g r0 = r6.f1421v
            if (r0 != 0) goto L_0x0062
            goto L_0x007b
        L_0x0062:
            int r0 = r6.f1360A
            if (r0 <= r2) goto L_0x006b
            int r0 = r6.f1363D
            if (r0 == 0) goto L_0x006b
            r3 = r4
        L_0x006b:
            if (r3 == 0) goto L_0x0078
            q.b.a.c.g0.g r0 = r6.f1421v
            int r1 = r6.f1363D
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.mo9063a(r1)
        L_0x0078:
            r6.invalidate()
        L_0x007b:
            r6.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo2179a():void");
    }

    /* renamed from: a */
    public final void mo2183a(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m1092a(CheckableImageButton checkableImageButton, OnLongClickListener onLongClickListener) {
        boolean t = C1404o.m3559t(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (t || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(t);
        checkableImageButton.setPressable(t);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    /* renamed from: a */
    public void mo2182a(TextView textView, int i) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(C3400k.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C1325a.m3373a(getContext(), C3316c.design_error));
        }
    }

    /* renamed from: a */
    public void mo2181a(int i) {
        boolean z = this.f1401l;
        if (this.f1399k == -1) {
            this.f1403m.setText(String.valueOf(i));
            this.f1403m.setContentDescription(null);
            this.f1401l = false;
        } else {
            if (C1404o.m3540d(this.f1403m) == 1) {
                this.f1403m.setAccessibilityLiveRegion(0);
            }
            this.f1401l = i > this.f1399k;
            Context context = getContext();
            this.f1403m.setContentDescription(context.getString(this.f1401l ? C3369j.character_counter_overflowed_content_description : C3369j.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f1399k)}));
            if (z != this.f1401l) {
                mo2234k();
                if (this.f1401l) {
                    this.f1403m.setAccessibilityLiveRegion(1);
                }
            }
            this.f1403m.setText(getContext().getString(C3369j.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f1399k)}));
        }
        if (this.f1391g != null && z != this.f1401l) {
            mo2185a(false, false);
            mo2238o();
            mo2235l();
        }
    }

    /* renamed from: a */
    public final void mo2185a(boolean z, boolean z2) {
        C3296b bVar;
        ColorStateList colorStateList;
        boolean isEnabled = isEnabled();
        EditText editText = this.f1391g;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f1391g;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean c = this.f1395i.mo9169c();
        ColorStateList colorStateList2 = this.f1392g0;
        if (colorStateList2 != null) {
            C3296b bVar2 = this.f1412q0;
            if (bVar2.f8259l != colorStateList2) {
                bVar2.f8259l = colorStateList2;
                bVar2.mo9006e();
            }
            C3296b bVar3 = this.f1412q0;
            ColorStateList colorStateList3 = this.f1392g0;
            if (bVar3.f8258k != colorStateList3) {
                bVar3.f8258k = colorStateList3;
                bVar3.mo9006e();
            }
        }
        if (!isEnabled) {
            this.f1412q0.mo9001b(ColorStateList.valueOf(this.f1408o0));
            C3296b bVar4 = this.f1412q0;
            ColorStateList valueOf = ColorStateList.valueOf(this.f1408o0);
            if (bVar4.f8258k != valueOf) {
                bVar4.f8258k = valueOf;
                bVar4.mo9006e();
            }
        } else if (c) {
            C3296b bVar5 = this.f1412q0;
            TextView textView = this.f1395i.f8531m;
            bVar5.mo9001b(textView != null ? textView.getTextColors() : null);
        } else {
            if (this.f1401l) {
                TextView textView2 = this.f1403m;
                if (textView2 != null) {
                    bVar = this.f1412q0;
                    colorStateList = textView2.getTextColors();
                    bVar.mo9001b(colorStateList);
                }
            }
            if (z4) {
                colorStateList = this.f1394h0;
                if (colorStateList != null) {
                    bVar = this.f1412q0;
                    bVar.mo9001b(colorStateList);
                }
            }
        }
        if (z3 || (isEnabled() && (z4 || c))) {
            if (z2 || this.f1410p0) {
                ValueAnimator valueAnimator = this.f1416s0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1416s0.cancel();
                }
                if (!z || !this.f1414r0) {
                    this.f1412q0.mo9003c(1.0f);
                } else {
                    mo2180a(1.0f);
                }
                this.f1410p0 = false;
                if (mo2194e()) {
                    mo2232i();
                }
            }
        } else if (z2 || !this.f1410p0) {
            ValueAnimator valueAnimator2 = this.f1416s0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f1416s0.cancel();
            }
            if (!z || !this.f1414r0) {
                this.f1412q0.mo9003c(0.0f);
            } else {
                mo2180a(0.0f);
            }
            if (mo2194e() && (!((C3379g) this.f1419u).f8491B.isEmpty()) && mo2194e()) {
                ((C3379g) this.f1419u).mo9146a(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f1410p0 = true;
        }
    }
}
