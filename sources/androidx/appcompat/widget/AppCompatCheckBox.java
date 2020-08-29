package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p124p.p126b.C1018a;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p126b.p136q.C1162e;
import p124p.p126b.p136q.C1171h;
import p124p.p126b.p136q.C1207r0;
import p124p.p126b.p136q.C1214v;

public class AppCompatCheckBox extends CheckBox {

    /* renamed from: e */
    public final C1171h f199e;

    /* renamed from: f */
    public final C1162e f200f;

    /* renamed from: g */
    public final C1214v f201g;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1018a.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        C1207r0.m3007a(context);
        super(context, attributeSet, i);
        C1171h hVar = new C1171h(this);
        this.f199e = hVar;
        hVar.mo5157a(attributeSet, i);
        C1162e eVar = new C1162e(this);
        this.f200f = eVar;
        eVar.mo5097a(attributeSet, i);
        C1214v vVar = new C1214v(this);
        this.f201g = vVar;
        vVar.mo5334a(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1162e eVar = this.f200f;
        if (eVar != null) {
            eVar.mo5093a();
        }
        C1214v vVar = this.f201g;
        if (vVar != null) {
            vVar.mo5328a();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C1171h hVar = this.f199e;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1162e eVar = this.f200f;
        if (eVar != null) {
            return eVar.mo5098b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C1162e eVar = this.f200f;
        if (eVar != null) {
            return eVar.mo5100c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C1171h hVar = this.f199e;
        if (hVar != null) {
            return hVar.f3284b;
        }
        return null;
    }

    public Mode getSupportButtonTintMode() {
        C1171h hVar = this.f199e;
        if (hVar != null) {
            return hVar.f3285c;
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1162e eVar = this.f200f;
        if (eVar != null) {
            eVar.mo5101d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1162e eVar = this.f200f;
        if (eVar != null) {
            eVar.mo5094a(i);
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C1070a.m2602b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1171h hVar = this.f199e;
        if (hVar == null) {
            return;
        }
        if (hVar.f3288f) {
            hVar.f3288f = false;
            return;
        }
        hVar.f3288f = true;
        hVar.mo5156a();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1162e eVar = this.f200f;
        if (eVar != null) {
            eVar.mo5099b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C1162e eVar = this.f200f;
        if (eVar != null) {
            eVar.mo5096a(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1171h hVar = this.f199e;
        if (hVar != null) {
            hVar.f3284b = colorStateList;
            hVar.f3286d = true;
            hVar.mo5156a();
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        C1171h hVar = this.f199e;
        if (hVar != null) {
            hVar.f3285c = mode;
            hVar.f3287e = true;
            hVar.mo5156a();
        }
    }
}
