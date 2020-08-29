package p213q.p217b.p218a.p271c.p274c0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import p124p.p126b.p136q.C1204q;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.C3400k;
import p213q.p217b.p218a.p271c.C3406l;
import p213q.p217b.p218a.p271c.p273b0.C3310j;

/* renamed from: q.b.a.c.c0.a */
public class C3317a extends C1204q {

    /* renamed from: j */
    public static final int f8311j = C3400k.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: k */
    public static final int[][] f8312k = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: h */
    public ColorStateList f8313h;

    /* renamed from: i */
    public boolean f8314i;

    public C3317a(Context context, AttributeSet attributeSet) {
        int i = C3294b.radioButtonStyle;
        super(C3310j.m7690b(context, attributeSet, i, f8311j), attributeSet, i);
        TypedArray b = C3310j.m7691b(getContext(), attributeSet, C3406l.MaterialRadioButton, i, f8311j, new int[0]);
        this.f8314i = b.getBoolean(C3406l.MaterialRadioButton_useMaterialThemeColors, false);
        b.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f8313h == null) {
            int a = C2286e.m5156a((View) this, C3294b.colorControlActivated);
            int a2 = C2286e.m5156a((View) this, C3294b.colorOnSurface);
            int a3 = C2286e.m5156a((View) this, C3294b.colorSurface);
            int[] iArr = new int[f8312k.length];
            iArr[0] = C2286e.m5145a(a3, a, 1.0f);
            iArr[1] = C2286e.m5145a(a3, a2, 0.54f);
            iArr[2] = C2286e.m5145a(a3, a2, 0.38f);
            iArr[3] = C2286e.m5145a(a3, a2, 0.38f);
            this.f8313h = new ColorStateList(f8312k, iArr);
        }
        return this.f8313h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8314i && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f8314i = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }
}
