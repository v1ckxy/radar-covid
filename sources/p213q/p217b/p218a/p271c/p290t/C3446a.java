package p213q.p217b.p218a.p271c.p290t;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p141d.p142a.C1242a;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.p278g0.C3342j;
import p213q.p217b.p218a.p271c.p278g0.C3355n;

/* renamed from: q.b.a.c.t.a */
public class C3446a extends C1242a implements Checkable, C3355n {

    /* renamed from: k */
    public static final int[] f8732k = {16842911};

    /* renamed from: l */
    public static final int[] f8733l = {16842912};

    /* renamed from: m */
    public static final int[] f8734m = {C3294b.state_dragged};

    /* renamed from: h */
    public boolean f8735h;

    /* renamed from: i */
    public boolean f8736i;

    /* renamed from: j */
    public C3447a f8737j;

    /* renamed from: q.b.a.c.t.a$a */
    public interface C3447a {
    }

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
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

    public float getProgress() {
        throw null;
    }

    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public C3342j getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    public boolean isChecked() {
        return this.f8735h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (this.f8735h) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f8733l);
        }
        if (this.f8736i) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f8734m);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C1242a.class.getName());
        accessibilityEvent.setChecked(this.f8735h);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C1242a.class.getName());
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f8735h);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        throw null;
    }

    public void setCheckable(boolean z) {
        throw null;
    }

    public void setChecked(boolean z) {
        boolean z2 = this.f8735h;
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconResource(int i) {
        C1070a.m2602b(getContext(), i);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        throw null;
    }

    public void setDragged(boolean z) {
        if (this.f8736i != z) {
            this.f8736i = z;
            refreshDrawableState();
            if (VERSION.SDK_INT <= 26) {
                invalidate();
                return;
            }
            throw null;
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        throw null;
    }

    public void setOnCheckedChangeListener(C3447a aVar) {
        this.f8737j = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        throw null;
    }

    public void setProgress(float f) {
        throw null;
    }

    public void setRadius(float f) {
        super.setRadius(f);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i) {
        C1070a.m2601a(getContext(), i);
        throw null;
    }

    public void setShapeAppearanceModel(C3342j jVar) {
        throw null;
    }

    public void setStrokeColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(int i) {
        throw null;
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        throw null;
    }

    public void toggle() {
    }
}
