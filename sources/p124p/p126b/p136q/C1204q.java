package p124p.p126b.p136q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import p124p.p126b.p128l.p129a.C1070a;

/* renamed from: p.b.q.q */
public class C1204q extends RadioButton {

    /* renamed from: e */
    public final C1171h f3407e;

    /* renamed from: f */
    public final C1162e f3408f;

    /* renamed from: g */
    public final C1214v f3409g;

    public C1204q(Context context, AttributeSet attributeSet, int i) {
        C1207r0.m3007a(context);
        super(context, attributeSet, i);
        C1171h hVar = new C1171h(this);
        this.f3407e = hVar;
        hVar.mo5157a(attributeSet, i);
        C1162e eVar = new C1162e(this);
        this.f3408f = eVar;
        eVar.mo5097a(attributeSet, i);
        C1214v vVar = new C1214v(this);
        this.f3409g = vVar;
        vVar.mo5334a(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1162e eVar = this.f3408f;
        if (eVar != null) {
            eVar.mo5093a();
        }
        C1214v vVar = this.f3409g;
        if (vVar != null) {
            vVar.mo5328a();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C1171h hVar = this.f3407e;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1162e eVar = this.f3408f;
        if (eVar != null) {
            return eVar.mo5098b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C1162e eVar = this.f3408f;
        if (eVar != null) {
            return eVar.mo5100c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C1171h hVar = this.f3407e;
        if (hVar != null) {
            return hVar.f3284b;
        }
        return null;
    }

    public Mode getSupportButtonTintMode() {
        C1171h hVar = this.f3407e;
        if (hVar != null) {
            return hVar.f3285c;
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1162e eVar = this.f3408f;
        if (eVar != null) {
            eVar.mo5101d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1162e eVar = this.f3408f;
        if (eVar != null) {
            eVar.mo5094a(i);
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C1070a.m2602b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1171h hVar = this.f3407e;
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
        C1162e eVar = this.f3408f;
        if (eVar != null) {
            eVar.mo5099b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C1162e eVar = this.f3408f;
        if (eVar != null) {
            eVar.mo5096a(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1171h hVar = this.f3407e;
        if (hVar != null) {
            hVar.f3284b = colorStateList;
            hVar.f3286d = true;
            hVar.mo5156a();
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        C1171h hVar = this.f3407e;
        if (hVar != null) {
            hVar.f3285c = mode;
            hVar.f3287e = true;
            hVar.mo5156a();
        }
    }
}
