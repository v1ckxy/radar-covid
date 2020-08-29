package p124p.p141d.p142a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: p.d.a.e */
public class C1246e extends Drawable {

    /* renamed from: a */
    public float f3531a;

    /* renamed from: b */
    public float f3532b;

    /* renamed from: c */
    public boolean f3533c;

    /* renamed from: d */
    public boolean f3534d;

    /* renamed from: e */
    public ColorStateList f3535e;

    /* renamed from: f */
    public PorterDuffColorFilter f3536f;

    /* renamed from: g */
    public ColorStateList f3537g;

    /* renamed from: h */
    public Mode f3538h;

    /* renamed from: a */
    public final PorterDuffColorFilter mo5464a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: a */
    public final void mo5465a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        int i = rect.left;
        throw null;
    }

    public void draw(Canvas canvas) {
        if (this.f3536f == null) {
            float f = this.f3531a;
            canvas.drawRoundRect(null, f, f, null);
            return;
        }
        throw null;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(null, this.f3531a);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f3537g;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f3535e;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo5465a(rect);
        throw null;
    }

    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f3535e;
        colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        throw null;
    }

    public void setAlpha(int i) {
        throw null;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3537g = colorStateList;
        this.f3536f = mo5464a(colorStateList, this.f3538h);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.f3538h = mode;
        this.f3536f = mo5464a(this.f3537g, mode);
        invalidateSelf();
    }
}
