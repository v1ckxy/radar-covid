package p124p.p126b.p136q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import p124p.p126b.C1018a;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p164m.C1448b;

/* renamed from: p.b.q.f */
public class C1166f extends Button implements C1448b {

    /* renamed from: e */
    public final C1162e f3261e;

    /* renamed from: f */
    public final C1214v f3262f;

    public C1166f(Context context) {
        this(context, null);
    }

    public C1166f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1018a.buttonStyle);
    }

    public C1166f(Context context, AttributeSet attributeSet, int i) {
        C1207r0.m3007a(context);
        super(context, attributeSet, i);
        C1162e eVar = new C1162e(this);
        this.f3261e = eVar;
        eVar.mo5097a(attributeSet, i);
        C1214v vVar = new C1214v(this);
        this.f3262f = vVar;
        vVar.mo5334a(attributeSet, i);
        this.f3262f.mo5328a();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1162e eVar = this.f3261e;
        if (eVar != null) {
            eVar.mo5093a();
        }
        C1214v vVar = this.f3262f;
        if (vVar != null) {
            vVar.mo5328a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C1448b.f4251a) {
            return super.getAutoSizeMaxTextSize();
        }
        C1214v vVar = this.f3262f;
        if (vVar != null) {
            return Math.round(vVar.f3436i.f3479e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C1448b.f4251a) {
            return super.getAutoSizeMinTextSize();
        }
        C1214v vVar = this.f3262f;
        if (vVar != null) {
            return Math.round(vVar.f3436i.f3478d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C1448b.f4251a) {
            return super.getAutoSizeStepGranularity();
        }
        C1214v vVar = this.f3262f;
        if (vVar != null) {
            return Math.round(vVar.f3436i.f3477c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C1448b.f4251a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1214v vVar = this.f3262f;
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
        C1214v vVar = this.f3262f;
        if (vVar != null) {
            return vVar.f3436i.f3475a;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1162e eVar = this.f3261e;
        if (eVar != null) {
            return eVar.mo5098b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C1162e eVar = this.f3261e;
        if (eVar != null) {
            return eVar.mo5100c();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1214v vVar = this.f3262f;
        if (vVar != null && !C1448b.f4251a) {
            vVar.f3436i.mo5388a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C1214v vVar = this.f3262f;
        if (vVar != null && !C1448b.f4251a && vVar.mo5336b()) {
            this.f3262f.f3436i.mo5388a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C1448b.f4251a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1214v vVar = this.f3262f;
        if (vVar != null) {
            vVar.mo5330a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C1448b.f4251a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1214v vVar = this.f3262f;
        if (vVar != null) {
            vVar.mo5335a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C1448b.f4251a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1214v vVar = this.f3262f;
        if (vVar != null) {
            vVar.mo5329a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1162e eVar = this.f3261e;
        if (eVar != null) {
            eVar.mo5101d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1162e eVar = this.f3261e;
        if (eVar != null) {
            eVar.mo5094a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1061o.m2460a((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C1214v vVar = this.f3262f;
        if (vVar != null) {
            vVar.f3428a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1162e eVar = this.f3261e;
        if (eVar != null) {
            eVar.mo5099b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C1162e eVar = this.f3261e;
        if (eVar != null) {
            eVar.mo5096a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1214v vVar = this.f3262f;
        if (vVar != null) {
            vVar.mo5331a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        boolean z = C1448b.f4251a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C1214v vVar = this.f3262f;
        if (vVar != null && !z && !vVar.mo5336b()) {
            vVar.f3436i.mo5390a(i, f);
        }
    }
}
