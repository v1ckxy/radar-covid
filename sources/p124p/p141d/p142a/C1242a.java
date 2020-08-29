package p124p.p141d.p142a;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;

/* renamed from: p.d.a.a */
public class C1242a extends FrameLayout {

    /* renamed from: g */
    public static final C1245d f3528g = new C1243b();

    /* renamed from: e */
    public boolean f3529e;

    /* renamed from: f */
    public boolean f3530f;

    public ColorStateList getCardBackgroundColor() {
        C1243b bVar = (C1243b) f3528g;
        throw null;
    }

    public float getCardElevation() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getMaxCardElevation() {
        return ((C1243b) f3528g).mo5458b(null);
    }

    public boolean getPreventCornerOverlap() {
        return this.f3530f;
    }

    public float getRadius() {
        return ((C1243b) f3528g).mo5459c(null);
    }

    public boolean getUseCompatPadding() {
        return this.f3529e;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ((C1243b) f3528g).mo5457a((C1244c) null, ColorStateList.valueOf(i));
        throw null;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        ((C1243b) f3528g).mo5457a((C1244c) null, colorStateList);
        throw null;
    }

    public void setCardElevation(float f) {
        throw null;
    }

    public void setMaxCardElevation(float f) {
        ((C1243b) f3528g).mo5456a((C1244c) null, f);
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f3530f) {
            this.f3530f = z;
            C1243b bVar = (C1243b) f3528g;
            throw null;
        }
    }

    public void setRadius(float f) {
        C1243b bVar = (C1243b) f3528g;
        throw null;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f3529e != z) {
            this.f3529e = z;
            C1243b bVar = (C1243b) f3528g;
            throw null;
        }
    }
}
