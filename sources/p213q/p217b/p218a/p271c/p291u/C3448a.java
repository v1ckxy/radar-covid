package p213q.p217b.p218a.p271c.p291u;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.C3400k;
import p213q.p217b.p218a.p271c.C3406l;
import p213q.p217b.p218a.p271c.p273b0.C3310j;

/* renamed from: q.b.a.c.u.a */
public class C3448a extends AppCompatCheckBox {

    /* renamed from: j */
    public static final int f8738j = C3400k.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: k */
    public static final int[][] f8739k = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: h */
    public ColorStateList f8740h;

    /* renamed from: i */
    public boolean f8741i;

    public C3448a(Context context, AttributeSet attributeSet) {
        int i = C3294b.checkboxStyle;
        super(C3310j.m7690b(context, attributeSet, i, f8738j), attributeSet, i);
        Context context2 = getContext();
        TypedArray b = C3310j.m7691b(context2, attributeSet, C3406l.MaterialCheckBox, i, f8738j, new int[0]);
        if (b.hasValue(C3406l.MaterialCheckBox_buttonTint)) {
            setButtonTintList(C2286e.m5173a(context2, b, C3406l.MaterialCheckBox_buttonTint));
        }
        this.f8741i = b.getBoolean(C3406l.MaterialCheckBox_useMaterialThemeColors, false);
        b.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f8740h == null) {
            int[] iArr = new int[f8739k.length];
            int a = C2286e.m5156a((View) this, C3294b.colorControlActivated);
            int a2 = C2286e.m5156a((View) this, C3294b.colorSurface);
            int a3 = C2286e.m5156a((View) this, C3294b.colorOnSurface);
            iArr[0] = C2286e.m5145a(a2, a, 1.0f);
            iArr[1] = C2286e.m5145a(a2, a3, 0.54f);
            iArr[2] = C2286e.m5145a(a2, a3, 0.38f);
            iArr[3] = C2286e.m5145a(a2, a3, 0.38f);
            this.f8740h = new ColorStateList(f8739k, iArr);
        }
        return this.f8740h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8741i && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f8741i = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }
}
