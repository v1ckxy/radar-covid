package p124p.p126b.p130m.p131a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: p.b.m.a.c */
public class C1083c extends Drawable implements Callback {

    /* renamed from: e */
    public Drawable f2912e;

    public C1083c(Drawable drawable) {
        Drawable drawable2 = this.f2912e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2912e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f2912e.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f2912e.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f2912e.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2912e.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2912e.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2912e.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2912e.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2912e.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2912e.getPadding(rect);
    }

    public int[] getState() {
        return this.f2912e.getState();
    }

    public Region getTransparentRegion() {
        return this.f2912e.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f2912e.isAutoMirrored();
    }

    public boolean isStateful() {
        return this.f2912e.isStateful();
    }

    public void jumpToCurrentState() {
        this.f2912e.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f2912e.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.f2912e.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2912e.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f2912e.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f2912e.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2912e.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2912e.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2912e.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        this.f2912e.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2912e.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f2912e.setState(iArr);
    }

    public void setTint(int i) {
        this.f2912e.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2912e.setTintList(colorStateList);
    }

    public void setTintMode(Mode mode) {
        this.f2912e.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2912e.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
