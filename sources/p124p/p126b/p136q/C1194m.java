package p124p.p126b.p136q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: p.b.q.m */
public class C1194m extends ImageView {

    /* renamed from: e */
    public final C1162e f3357e;

    /* renamed from: f */
    public final C1192l f3358f;

    public C1194m(Context context, AttributeSet attributeSet, int i) {
        C1207r0.m3007a(context);
        super(context, attributeSet, i);
        C1162e eVar = new C1162e(this);
        this.f3357e = eVar;
        eVar.mo5097a(attributeSet, i);
        C1192l lVar = new C1192l(this);
        this.f3358f = lVar;
        lVar.mo5229a(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1162e eVar = this.f3357e;
        if (eVar != null) {
            eVar.mo5093a();
        }
        C1192l lVar = this.f3358f;
        if (lVar != null) {
            lVar.mo5225a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1162e eVar = this.f3357e;
        if (eVar != null) {
            return eVar.mo5098b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C1162e eVar = this.f3357e;
        if (eVar != null) {
            return eVar.mo5100c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1192l lVar = this.f3358f;
        if (lVar != null) {
            C1209s0 s0Var = lVar.f3356b;
            if (s0Var != null) {
                return s0Var.f3413a;
            }
        }
        return null;
    }

    public Mode getSupportImageTintMode() {
        C1192l lVar = this.f3358f;
        if (lVar != null) {
            C1209s0 s0Var = lVar.f3356b;
            if (s0Var != null) {
                return s0Var.f3414b;
            }
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        if (!(!(this.f3358f.f3355a.getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1162e eVar = this.f3357e;
        if (eVar != null) {
            eVar.mo5101d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1162e eVar = this.f3357e;
        if (eVar != null) {
            eVar.mo5094a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1192l lVar = this.f3358f;
        if (lVar != null) {
            lVar.mo5225a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C1192l lVar = this.f3358f;
        if (lVar != null) {
            lVar.mo5225a();
        }
    }

    public void setImageResource(int i) {
        C1192l lVar = this.f3358f;
        if (lVar != null) {
            lVar.mo5226a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1192l lVar = this.f3358f;
        if (lVar != null) {
            lVar.mo5225a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1162e eVar = this.f3357e;
        if (eVar != null) {
            eVar.mo5099b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C1162e eVar = this.f3357e;
        if (eVar != null) {
            eVar.mo5096a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1192l lVar = this.f3358f;
        if (lVar != null) {
            lVar.mo5227a(colorStateList);
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        C1192l lVar = this.f3358f;
        if (lVar != null) {
            lVar.mo5228a(mode);
        }
    }
}
