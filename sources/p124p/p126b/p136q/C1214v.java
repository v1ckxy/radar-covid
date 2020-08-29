package p124p.p126b.p136q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import p124p.p126b.C1027j;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p152e.p153b.C1332g;
import p124p.p150h.p164m.C1448b;
import p124p.p150h.p164m.C1451e;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.b.q.v */
public class C1214v {

    /* renamed from: a */
    public final TextView f3428a;

    /* renamed from: b */
    public C1209s0 f3429b;

    /* renamed from: c */
    public C1209s0 f3430c;

    /* renamed from: d */
    public C1209s0 f3431d;

    /* renamed from: e */
    public C1209s0 f3432e;

    /* renamed from: f */
    public C1209s0 f3433f;

    /* renamed from: g */
    public C1209s0 f3434g;

    /* renamed from: h */
    public C1209s0 f3435h;

    /* renamed from: i */
    public final C1221x f3436i;

    /* renamed from: j */
    public int f3437j = 0;

    /* renamed from: k */
    public int f3438k = -1;

    /* renamed from: l */
    public Typeface f3439l;

    /* renamed from: m */
    public boolean f3440m;

    /* renamed from: p.b.q.v$a */
    public static class C1215a extends C1332g {

        /* renamed from: a */
        public final WeakReference<C1214v> f3441a;

        /* renamed from: b */
        public final int f3442b;

        /* renamed from: c */
        public final int f3443c;

        /* renamed from: p.b.q.v$a$a */
        public class C1216a implements Runnable {

            /* renamed from: e */
            public final WeakReference<C1214v> f3444e;

            /* renamed from: f */
            public final Typeface f3445f;

            public C1216a(C1215a aVar, WeakReference<C1214v> weakReference, Typeface typeface) {
                this.f3444e = weakReference;
                this.f3445f = typeface;
            }

            public void run() {
                C1214v vVar = (C1214v) this.f3444e.get();
                if (vVar != null) {
                    Typeface typeface = this.f3445f;
                    if (vVar.f3440m) {
                        vVar.f3428a.setTypeface(typeface);
                        vVar.f3439l = typeface;
                    }
                }
            }
        }

        public C1215a(C1214v vVar, int i, int i2) {
            this.f3441a = new WeakReference<>(vVar);
            this.f3442b = i;
            this.f3443c = i2;
        }

        /* renamed from: a */
        public void mo5337a(int i) {
        }

        /* renamed from: a */
        public void mo5338a(Typeface typeface) {
            C1214v vVar = (C1214v) this.f3441a.get();
            if (vVar != null) {
                if (VERSION.SDK_INT >= 28) {
                    int i = this.f3442b;
                    if (i != -1) {
                        typeface = Typeface.create(typeface, i, (this.f3443c & 2) != 0);
                    }
                }
                vVar.f3428a.post(new C1216a(this, this.f3441a, typeface));
            }
        }
    }

    public C1214v(TextView textView) {
        this.f3428a = textView;
        this.f3436i = new C1221x(this.f3428a);
    }

    /* renamed from: a */
    public static C1209s0 m3030a(Context context, C1178i iVar, int i) {
        ColorStateList b = iVar.mo5177b(context, i);
        if (b == null) {
            return null;
        }
        C1209s0 s0Var = new C1209s0();
        s0Var.f3416d = true;
        s0Var.f3413a = b;
        return s0Var;
    }

    /* renamed from: a */
    public void mo5328a() {
        if (!(this.f3429b == null && this.f3430c == null && this.f3431d == null && this.f3432e == null)) {
            Drawable[] compoundDrawables = this.f3428a.getCompoundDrawables();
            mo5333a(compoundDrawables[0], this.f3429b);
            mo5333a(compoundDrawables[1], this.f3430c);
            mo5333a(compoundDrawables[2], this.f3431d);
            mo5333a(compoundDrawables[3], this.f3432e);
        }
        if (this.f3433f != null || this.f3434g != null) {
            Drawable[] compoundDrawablesRelative = this.f3428a.getCompoundDrawablesRelative();
            mo5333a(compoundDrawablesRelative[0], this.f3433f);
            mo5333a(compoundDrawablesRelative[2], this.f3434g);
        }
    }

    /* renamed from: a */
    public final void mo5332a(Context context, C1213u0 u0Var) {
        Typeface typeface;
        Typeface typeface2;
        this.f3437j = u0Var.mo5321d(C1027j.TextAppearance_android_textStyle, this.f3437j);
        boolean z = false;
        if (VERSION.SDK_INT >= 28) {
            int d = u0Var.mo5321d(C1027j.TextAppearance_android_textFontWeight, -1);
            this.f3438k = d;
            if (d != -1) {
                this.f3437j = (this.f3437j & 2) | 0;
            }
        }
        if (u0Var.mo5326f(C1027j.TextAppearance_android_fontFamily) || u0Var.mo5326f(C1027j.TextAppearance_fontFamily)) {
            this.f3439l = null;
            int i = u0Var.mo5326f(C1027j.TextAppearance_fontFamily) ? C1027j.TextAppearance_fontFamily : C1027j.TextAppearance_android_fontFamily;
            int i2 = this.f3438k;
            int i3 = this.f3437j;
            if (!context.isRestricted()) {
                try {
                    Typeface a = u0Var.mo5315a(i, this.f3437j, (C1332g) new C1215a(this, i2, i3));
                    if (a != null) {
                        if (VERSION.SDK_INT >= 28 && this.f3438k != -1) {
                            a = Typeface.create(Typeface.create(a, 0), this.f3438k, (this.f3437j & 2) != 0);
                        }
                        this.f3439l = a;
                    }
                    this.f3440m = this.f3439l == null;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f3439l == null) {
                String d2 = u0Var.mo5322d(i);
                if (d2 != null) {
                    if (VERSION.SDK_INT < 28 || this.f3438k == -1) {
                        typeface = Typeface.create(d2, this.f3437j);
                    } else {
                        Typeface create = Typeface.create(d2, 0);
                        int i4 = this.f3438k;
                        if ((this.f3437j & 2) != 0) {
                            z = true;
                        }
                        typeface = Typeface.create(create, i4, z);
                    }
                    this.f3439l = typeface;
                }
            }
            return;
        }
        if (u0Var.mo5326f(C1027j.TextAppearance_android_typeface)) {
            this.f3440m = false;
            int d3 = u0Var.mo5321d(C1027j.TextAppearance_android_typeface, 1);
            if (d3 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (d3 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (d3 == 3) {
                typeface2 = Typeface.MONOSPACE;
            }
            this.f3439l = typeface2;
        }
    }

    /* renamed from: a */
    public final void mo5333a(Drawable drawable, C1209s0 s0Var) {
        if (drawable != null && s0Var != null) {
            C1178i.m2952a(drawable, s0Var, this.f3428a.getDrawableState());
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo5334a(AttributeSet attributeSet, int i) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        Context context = this.f3428a.getContext();
        C1178i a = C1178i.m2951a();
        C1213u0 a2 = C1213u0.m3013a(context, attributeSet2, C1027j.AppCompatTextHelper, i2, 0);
        int g = a2.mo5327g(C1027j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.mo5326f(C1027j.AppCompatTextHelper_android_drawableLeft)) {
            this.f3429b = m3030a(context, a, a2.mo5327g(C1027j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.mo5326f(C1027j.AppCompatTextHelper_android_drawableTop)) {
            this.f3430c = m3030a(context, a, a2.mo5327g(C1027j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.mo5326f(C1027j.AppCompatTextHelper_android_drawableRight)) {
            this.f3431d = m3030a(context, a, a2.mo5327g(C1027j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.mo5326f(C1027j.AppCompatTextHelper_android_drawableBottom)) {
            this.f3432e = m3030a(context, a, a2.mo5327g(C1027j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (a2.mo5326f(C1027j.AppCompatTextHelper_android_drawableStart)) {
            this.f3433f = m3030a(context, a, a2.mo5327g(C1027j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (a2.mo5326f(C1027j.AppCompatTextHelper_android_drawableEnd)) {
            this.f3434g = m3030a(context, a, a2.mo5327g(C1027j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        a2.f3426b.recycle();
        boolean z3 = this.f3428a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g != -1) {
            C1213u0 u0Var = new C1213u0(context, context.obtainStyledAttributes(g, C1027j.TextAppearance));
            if (z3 || !u0Var.mo5326f(C1027j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z2 = u0Var.mo5316a(C1027j.TextAppearance_textAllCaps, false);
                z = true;
            }
            mo5332a(context, u0Var);
            str2 = u0Var.mo5326f(C1027j.TextAppearance_textLocale) ? u0Var.mo5322d(C1027j.TextAppearance_textLocale) : null;
            str = (VERSION.SDK_INT < 26 || !u0Var.mo5326f(C1027j.TextAppearance_fontVariationSettings)) ? null : u0Var.mo5322d(C1027j.TextAppearance_fontVariationSettings);
            u0Var.f3426b.recycle();
        } else {
            z2 = false;
            z = false;
            str2 = null;
            str = null;
        }
        C1213u0 u0Var2 = new C1213u0(context, context.obtainStyledAttributes(attributeSet2, C1027j.TextAppearance, i2, 0));
        if (!z3 && u0Var2.mo5326f(C1027j.TextAppearance_textAllCaps)) {
            z2 = u0Var2.mo5316a(C1027j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (u0Var2.mo5326f(C1027j.TextAppearance_textLocale)) {
            str2 = u0Var2.mo5322d(C1027j.TextAppearance_textLocale);
        }
        if (VERSION.SDK_INT >= 26 && u0Var2.mo5326f(C1027j.TextAppearance_fontVariationSettings)) {
            str = u0Var2.mo5322d(C1027j.TextAppearance_fontVariationSettings);
        }
        if (VERSION.SDK_INT >= 28 && u0Var2.mo5326f(C1027j.TextAppearance_android_textSize) && u0Var2.mo5319c(C1027j.TextAppearance_android_textSize, -1) == 0) {
            this.f3428a.setTextSize(0, 0.0f);
        }
        mo5332a(context, u0Var2);
        u0Var2.f3426b.recycle();
        if (!z3 && z) {
            this.f3428a.setAllCaps(z2);
        }
        Typeface typeface = this.f3439l;
        if (typeface != null) {
            if (this.f3438k == -1) {
                this.f3428a.setTypeface(typeface, this.f3437j);
            } else {
                this.f3428a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.f3428a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            if (VERSION.SDK_INT >= 24) {
                this.f3428a.setTextLocales(LocaleList.forLanguageTags(str2));
            } else {
                this.f3428a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
            }
        }
        C1221x xVar = this.f3436i;
        TypedArray obtainStyledAttributes = xVar.f3484j.obtainStyledAttributes(attributeSet2, C1027j.AppCompatTextView, i2, 0);
        if (obtainStyledAttributes.hasValue(C1027j.AppCompatTextView_autoSizeTextType)) {
            xVar.f3475a = obtainStyledAttributes.getInt(C1027j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C1027j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C1027j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C1027j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C1027j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C1027j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C1027j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C1027j.AppCompatTextView_autoSizePresetSizes)) {
            int resourceId = obtainStyledAttributes.getResourceId(C1027j.AppCompatTextView_autoSizePresetSizes, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                int length = obtainTypedArray.length();
                int[] iArr = new int[length];
                if (length > 0) {
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = obtainTypedArray.getDimensionPixelSize(i3, -1);
                    }
                    xVar.f3480f = xVar.mo5391a(iArr);
                    xVar.mo5393c();
                }
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!xVar.mo5394d()) {
            xVar.f3475a = 0;
        } else if (xVar.f3475a == 1) {
            if (!xVar.f3481g) {
                DisplayMetrics displayMetrics = xVar.f3484j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                xVar.mo5389a(dimension2, dimension3, dimension);
            }
            xVar.mo5392b();
        }
        if (C1448b.f4251a) {
            C1221x xVar2 = this.f3436i;
            if (xVar2.f3475a != 0) {
                int[] iArr2 = xVar2.f3480f;
                if (iArr2.length > 0) {
                    if (((float) this.f3428a.getAutoSizeStepGranularity()) != -1.0f) {
                        this.f3428a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f3436i.f3478d), Math.round(this.f3436i.f3479e), Math.round(this.f3436i.f3477c), 0);
                    } else {
                        this.f3428a.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
                    }
                }
            }
        }
        C1213u0 u0Var3 = new C1213u0(context, context.obtainStyledAttributes(attributeSet2, C1027j.AppCompatTextView));
        int g2 = u0Var3.mo5327g(C1027j.AppCompatTextView_drawableLeftCompat, -1);
        Drawable a3 = g2 != -1 ? a.mo5174a(context, g2) : null;
        int g3 = u0Var3.mo5327g(C1027j.AppCompatTextView_drawableTopCompat, -1);
        Drawable a4 = g3 != -1 ? a.mo5174a(context, g3) : null;
        int g4 = u0Var3.mo5327g(C1027j.AppCompatTextView_drawableRightCompat, -1);
        Drawable a5 = g4 != -1 ? a.mo5174a(context, g4) : null;
        int g5 = u0Var3.mo5327g(C1027j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable a6 = g5 != -1 ? a.mo5174a(context, g5) : null;
        int g6 = u0Var3.mo5327g(C1027j.AppCompatTextView_drawableStartCompat, -1);
        Drawable a7 = g6 != -1 ? a.mo5174a(context, g6) : null;
        int g7 = u0Var3.mo5327g(C1027j.AppCompatTextView_drawableEndCompat, -1);
        Drawable a8 = g7 != -1 ? a.mo5174a(context, g7) : null;
        if (a7 != null || a8 != null) {
            Drawable[] compoundDrawablesRelative = this.f3428a.getCompoundDrawablesRelative();
            TextView textView = this.f3428a;
            if (a7 == null) {
                a7 = compoundDrawablesRelative[0];
            }
            if (a4 == null) {
                a4 = compoundDrawablesRelative[1];
            }
            if (a8 == null) {
                a8 = compoundDrawablesRelative[2];
            }
            if (a6 == null) {
                a6 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a7, a4, a8, a6);
        } else if (!(a3 == null && a4 == null && a5 == null && a6 == null)) {
            Drawable[] compoundDrawablesRelative2 = this.f3428a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f3428a.getCompoundDrawables();
                TextView textView2 = this.f3428a;
                if (a3 == null) {
                    a3 = compoundDrawables[0];
                }
                if (a4 == null) {
                    a4 = compoundDrawables[1];
                }
                if (a5 == null) {
                    a5 = compoundDrawables[2];
                }
                if (a6 == null) {
                    a6 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(a3, a4, a5, a6);
            } else {
                TextView textView3 = this.f3428a;
                Drawable drawable = compoundDrawablesRelative2[0];
                if (a4 == null) {
                    a4 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (a6 == null) {
                    a6 = compoundDrawablesRelative2[3];
                }
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, a4, drawable2, a6);
            }
        }
        if (u0Var3.mo5326f(C1027j.AppCompatTextView_drawableTint)) {
            ColorStateList a9 = u0Var3.mo5314a(C1027j.AppCompatTextView_drawableTint);
            TextView textView4 = this.f3428a;
            if (textView4 == null) {
                throw null;
            } else if (VERSION.SDK_INT >= 24) {
                textView4.setCompoundDrawableTintList(a9);
            } else if (textView4 instanceof C1451e) {
                ((C1451e) textView4).setSupportCompoundDrawablesTintList(a9);
            }
        }
        if (u0Var3.mo5326f(C1027j.AppCompatTextView_drawableTintMode)) {
            Mode a10 = C1145b0.m2889a(u0Var3.mo5321d(C1027j.AppCompatTextView_drawableTintMode, -1), null);
            TextView textView5 = this.f3428a;
            if (textView5 == null) {
                throw null;
            } else if (VERSION.SDK_INT >= 24) {
                textView5.setCompoundDrawableTintMode(a10);
            } else if (textView5 instanceof C1451e) {
                ((C1451e) textView5).setSupportCompoundDrawablesTintMode(a10);
            }
        }
        int c = u0Var3.mo5319c(C1027j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int c2 = u0Var3.mo5319c(C1027j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int c3 = u0Var3.mo5319c(C1027j.AppCompatTextView_lineHeight, -1);
        u0Var3.f3426b.recycle();
        if (c != -1) {
            C1061o.m2493a(this.f3428a, c);
        }
        if (c2 != -1) {
            C1061o.m2532b(this.f3428a, c2);
        }
        if (c3 != -1) {
            C1061o.m2542c(this.f3428a, c3);
        }
    }

    /* renamed from: b */
    public boolean mo5336b() {
        C1221x xVar = this.f3436i;
        return xVar.mo5394d() && xVar.f3475a != 0;
    }

    /* renamed from: a */
    public void mo5331a(Context context, int i) {
        C1213u0 u0Var = new C1213u0(context, context.obtainStyledAttributes(i, C1027j.TextAppearance));
        if (u0Var.mo5326f(C1027j.TextAppearance_textAllCaps)) {
            this.f3428a.setAllCaps(u0Var.mo5316a(C1027j.TextAppearance_textAllCaps, false));
        }
        if (u0Var.mo5326f(C1027j.TextAppearance_android_textSize) && u0Var.mo5319c(C1027j.TextAppearance_android_textSize, -1) == 0) {
            this.f3428a.setTextSize(0, 0.0f);
        }
        mo5332a(context, u0Var);
        if (VERSION.SDK_INT >= 26 && u0Var.mo5326f(C1027j.TextAppearance_fontVariationSettings)) {
            String d = u0Var.mo5322d(C1027j.TextAppearance_fontVariationSettings);
            if (d != null) {
                this.f3428a.setFontVariationSettings(d);
            }
        }
        u0Var.f3426b.recycle();
        Typeface typeface = this.f3439l;
        if (typeface != null) {
            this.f3428a.setTypeface(typeface, this.f3437j);
        }
    }

    /* renamed from: a */
    public void mo5330a(int i, int i2, int i3, int i4) {
        C1221x xVar = this.f3436i;
        if (xVar.mo5394d()) {
            DisplayMetrics displayMetrics = xVar.f3484j.getResources().getDisplayMetrics();
            xVar.mo5389a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (xVar.mo5392b()) {
                xVar.mo5388a();
            }
        }
    }

    /* renamed from: a */
    public void mo5335a(int[] iArr, int i) {
        C1221x xVar = this.f3436i;
        if (xVar.mo5394d()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = xVar.f3484j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                xVar.f3480f = xVar.mo5391a(iArr2);
                if (!xVar.mo5393c()) {
                    StringBuilder a = C1965a.m4756a("None of the preset sizes is valid: ");
                    a.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(a.toString());
                }
            } else {
                xVar.f3481g = false;
            }
            if (xVar.mo5392b()) {
                xVar.mo5388a();
            }
        }
    }

    /* renamed from: a */
    public void mo5329a(int i) {
        C1221x xVar = this.f3436i;
        if (!xVar.mo5394d()) {
            return;
        }
        if (i == 0) {
            xVar.f3475a = 0;
            xVar.f3478d = -1.0f;
            xVar.f3479e = -1.0f;
            xVar.f3477c = -1.0f;
            xVar.f3480f = new int[0];
            xVar.f3476b = false;
        } else if (i == 1) {
            DisplayMetrics displayMetrics = xVar.f3484j.getResources().getDisplayMetrics();
            xVar.mo5389a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (xVar.mo5392b()) {
                xVar.mo5388a();
            }
        } else {
            throw new IllegalArgumentException(C1965a.m4761b("Unknown auto-size text type: ", i));
        }
    }
}
