package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.C3400k;
import p213q.p217b.p218a.p271c.p273b0.C3310j;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p296y.C3495a;

public class MaterialToolbar extends Toolbar {

    /* renamed from: R */
    public static final int f1163R = C3400k.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3294b.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C3310j.m7690b(context, attributeSet, i, f1163R), attributeSet, i);
        Context context2 = getContext();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C3337g gVar = new C3337g();
            gVar.mo9063a(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.f8365e.f8388b = new C3495a(context2);
            gVar.mo9086j();
            gVar.mo9059a(C1404o.m3547h(this));
            setBackground(gVar);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C3337g) {
            C2286e.m5230a((View) this, (C3337g) background);
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C2286e.m5229a((View) this, f);
    }
}
