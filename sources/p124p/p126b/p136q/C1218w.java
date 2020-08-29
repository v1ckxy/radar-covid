package p124p.p126b.p136q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p150h.p154f.C1338d;
import p124p.p150h.p160j.C1371b;
import p124p.p150h.p160j.C1371b.C1372a;
import p124p.p150h.p164m.C1448b;
import p124p.p150h.p164m.C1451e;

/* renamed from: p.b.q.w */
public class C1218w extends TextView implements C1451e, C1448b {

    /* renamed from: e */
    public final C1162e f3448e;

    /* renamed from: f */
    public final C1214v f3449f;

    /* renamed from: g */
    public final C1212u f3450g;

    /* renamed from: h */
    public Future<C1371b> f3451h;

    public C1218w(Context context) {
        this(context, null);
    }

    public C1218w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C1218w(Context context, AttributeSet attributeSet, int i) {
        C1207r0.m3007a(context);
        super(context, attributeSet, i);
        C1162e eVar = new C1162e(this);
        this.f3448e = eVar;
        eVar.mo5097a(attributeSet, i);
        C1214v vVar = new C1214v(this);
        this.f3449f = vVar;
        vVar.mo5334a(attributeSet, i);
        this.f3449f.mo5328a();
        this.f3450g = new C1212u(this);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1162e eVar = this.f3448e;
        if (eVar != null) {
            eVar.mo5093a();
        }
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            vVar.mo5328a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C1448b.f4251a) {
            return super.getAutoSizeMaxTextSize();
        }
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            return Math.round(vVar.f3436i.f3479e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C1448b.f4251a) {
            return super.getAutoSizeMinTextSize();
        }
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            return Math.round(vVar.f3436i.f3478d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C1448b.f4251a) {
            return super.getAutoSizeStepGranularity();
        }
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            return Math.round(vVar.f3436i.f3477c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C1448b.f4251a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1214v vVar = this.f3449f;
        return vVar != null ? vVar.f3436i.f3480f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        int i = 0;
        if (C1448b.f4251a) {
            if (super.getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        }
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            return vVar.f3436i.f3475a;
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1162e eVar = this.f3448e;
        if (eVar != null) {
            return eVar.mo5098b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C1162e eVar = this.f3448e;
        if (eVar != null) {
            return eVar.mo5100c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C1209s0 s0Var = this.f3449f.f3435h;
        if (s0Var != null) {
            return s0Var.f3413a;
        }
        return null;
    }

    public Mode getSupportCompoundDrawablesTintMode() {
        C1209s0 s0Var = this.f3449f.f3435h;
        if (s0Var != null) {
            return s0Var.f3414b;
        }
        return null;
    }

    public CharSequence getText() {
        Future<C1371b> future = this.f3451h;
        if (future != null) {
            try {
                this.f3451h = null;
                C1061o.m2494a((TextView) this, (C1371b) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        if (VERSION.SDK_INT < 28) {
            C1212u uVar = this.f3450g;
            if (uVar != null) {
                return uVar.mo5311a();
            }
        }
        return super.getTextClassifier();
    }

    public C1372a getTextMetricsParamsCompat() {
        return C1061o.m2473a((TextView) this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C1061o.m2461a(onCreateInputConnection, editorInfo, (View) this);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1214v vVar = this.f3449f;
        if (vVar != null && !C1448b.f4251a) {
            vVar.f3436i.mo5388a();
        }
    }

    public void onMeasure(int i, int i2) {
        Future<C1371b> future = this.f3451h;
        if (future != null) {
            try {
                this.f3451h = null;
                C1061o.m2494a((TextView) this, (C1371b) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C1214v vVar = this.f3449f;
        if (vVar != null && !C1448b.f4251a && vVar.mo5336b()) {
            this.f3449f.f3436i.mo5388a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C1448b.f4251a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            vVar.mo5330a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C1448b.f4251a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            vVar.mo5335a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C1448b.f4251a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            vVar.mo5329a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1162e eVar = this.f3448e;
        if (eVar != null) {
            eVar.mo5101d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1162e eVar = this.f3448e;
        if (eVar != null) {
            eVar.mo5094a(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            vVar.mo5328a();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            vVar.mo5328a();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C1070a.m2602b(context, i) : null;
        Drawable b2 = i2 != 0 ? C1070a.m2602b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C1070a.m2602b(context, i3) : null;
        if (i4 != 0) {
            drawable = C1070a.m2602b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b3, drawable);
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            vVar.mo5328a();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C1070a.m2602b(context, i) : null;
        Drawable b2 = i2 != 0 ? C1070a.m2602b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C1070a.m2602b(context, i3) : null;
        if (i4 != 0) {
            drawable = C1070a.m2602b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, drawable);
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            vVar.mo5328a();
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1061o.m2460a((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C1061o.m2493a((TextView) this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C1061o.m2532b((TextView) this, i);
        }
    }

    public void setLineHeight(int i) {
        C1061o.m2542c((TextView) this, i);
    }

    public void setPrecomputedText(C1371b bVar) {
        C1061o.m2494a((TextView) this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1162e eVar = this.f3448e;
        if (eVar != null) {
            eVar.mo5099b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C1162e eVar = this.f3448e;
        if (eVar != null) {
            eVar.mo5096a(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1214v vVar = this.f3449f;
        if (vVar.f3435h == null) {
            vVar.f3435h = new C1209s0();
        }
        C1209s0 s0Var = vVar.f3435h;
        s0Var.f3413a = colorStateList;
        s0Var.f3416d = colorStateList != null;
        C1209s0 s0Var2 = vVar.f3435h;
        vVar.f3429b = s0Var2;
        vVar.f3430c = s0Var2;
        vVar.f3431d = s0Var2;
        vVar.f3432e = s0Var2;
        vVar.f3433f = s0Var2;
        vVar.f3434g = s0Var2;
        this.f3449f.mo5328a();
    }

    public void setSupportCompoundDrawablesTintMode(Mode mode) {
        C1214v vVar = this.f3449f;
        if (vVar.f3435h == null) {
            vVar.f3435h = new C1209s0();
        }
        C1209s0 s0Var = vVar.f3435h;
        s0Var.f3414b = mode;
        s0Var.f3415c = mode != null;
        C1209s0 s0Var2 = vVar.f3435h;
        vVar.f3429b = s0Var2;
        vVar.f3430c = s0Var2;
        vVar.f3431d = s0Var2;
        vVar.f3432e = s0Var2;
        vVar.f3433f = s0Var2;
        vVar.f3434g = s0Var2;
        this.f3449f.mo5328a();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            vVar.mo5331a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        if (VERSION.SDK_INT < 28) {
            C1212u uVar = this.f3450g;
            if (uVar != null) {
                uVar.f3424b = textClassifier;
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<C1371b> future) {
        this.f3451h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C1372a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.f4125b;
        int i = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.f4124a);
        setBreakStrategy(aVar.f4126c);
        setHyphenationFrequency(aVar.f4127d);
    }

    public void setTextSize(int i, float f) {
        boolean z = C1448b.f4251a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C1214v vVar = this.f3449f;
        if (vVar != null && !z && !vVar.mo5336b()) {
            vVar.f3436i.mo5390a(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface a = (typeface == null || i <= 0) ? null : C1338d.m3394a(getContext(), typeface, i);
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, i);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            vVar.mo5328a();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1214v vVar = this.f3449f;
        if (vVar != null) {
            vVar.mo5328a();
        }
    }
}
