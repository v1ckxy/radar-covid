package p124p.p126b.p136q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: p.b.q.h */
public class C1171h {

    /* renamed from: a */
    public final CompoundButton f3283a;

    /* renamed from: b */
    public ColorStateList f3284b = null;

    /* renamed from: c */
    public Mode f3285c = null;

    /* renamed from: d */
    public boolean f3286d = false;

    /* renamed from: e */
    public boolean f3287e = false;

    /* renamed from: f */
    public boolean f3288f;

    public C1171h(CompoundButton compoundButton) {
        this.f3283a = compoundButton;
    }

    /* renamed from: a */
    public void mo5156a() {
        Drawable buttonDrawable = this.f3283a.getButtonDrawable();
        if (buttonDrawable == null) {
            return;
        }
        if (this.f3286d || this.f3287e) {
            Drawable mutate = buttonDrawable.mutate();
            if (this.f3286d) {
                mutate.setTintList(this.f3284b);
            }
            if (this.f3287e) {
                mutate.setTintMode(this.f3285c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f3283a.getDrawableState());
            }
            this.f3283a.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[SYNTHETIC, Splitter:B:12:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[Catch:{ all -> 0x0080 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5157a(android.util.AttributeSet r4, int r5) {
        /*
            r3 = this;
            android.widget.CompoundButton r0 = r3.f3283a
            android.content.Context r0 = r0.getContext()
            int[] r1 = p124p.p126b.C1027j.CompoundButton
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = p124p.p126b.C1027j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            int r5 = p124p.p126b.C1027j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            android.widget.CompoundButton r0 = r3.f3283a     // Catch:{ NotFoundException -> 0x002e }
            android.widget.CompoundButton r1 = r3.f3283a     // Catch:{ NotFoundException -> 0x002e }
            android.content.Context r1 = r1.getContext()     // Catch:{ NotFoundException -> 0x002e }
            android.graphics.drawable.Drawable r5 = p124p.p126b.p128l.p129a.C1070a.m2602b(r1, r5)     // Catch:{ NotFoundException -> 0x002e }
            r0.setButtonDrawable(r5)     // Catch:{ NotFoundException -> 0x002e }
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = r2
        L_0x002f:
            if (r5 != 0) goto L_0x0050
            int r5 = p124p.p126b.C1027j.CompoundButton_android_button     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            int r5 = p124p.p126b.C1027j.CompoundButton_android_button     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            android.widget.CompoundButton r0 = r3.f3283a     // Catch:{ all -> 0x0080 }
            android.widget.CompoundButton r1 = r3.f3283a     // Catch:{ all -> 0x0080 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0080 }
            android.graphics.drawable.Drawable r5 = p124p.p126b.p128l.p129a.C1070a.m2602b(r1, r5)     // Catch:{ all -> 0x0080 }
            r0.setButtonDrawable(r5)     // Catch:{ all -> 0x0080 }
        L_0x0050:
            int r5 = p124p.p126b.C1027j.CompoundButton_buttonTint     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0063
            android.widget.CompoundButton r5 = r3.f3283a     // Catch:{ all -> 0x0080 }
            int r0 = p124p.p126b.C1027j.CompoundButton_buttonTint     // Catch:{ all -> 0x0080 }
            android.content.res.ColorStateList r0 = r4.getColorStateList(r0)     // Catch:{ all -> 0x0080 }
            r5.setButtonTintList(r0)     // Catch:{ all -> 0x0080 }
        L_0x0063:
            int r5 = p124p.p126b.C1027j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x007c
            android.widget.CompoundButton r5 = r3.f3283a     // Catch:{ all -> 0x0080 }
            int r0 = p124p.p126b.C1027j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0080 }
            r1 = -1
            int r0 = r4.getInt(r0, r1)     // Catch:{ all -> 0x0080 }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = p124p.p126b.p136q.C1145b0.m2889a(r0, r1)     // Catch:{ all -> 0x0080 }
            r5.setButtonTintMode(r0)     // Catch:{ all -> 0x0080 }
        L_0x007c:
            r4.recycle()
            return
        L_0x0080:
            r5 = move-exception
            r4.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1171h.mo5157a(android.util.AttributeSet, int):void");
    }
}
