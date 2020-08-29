package p124p.p126b.p136q;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p124p.p126b.C1027j;
import p124p.p150h.p162l.C1404o;

/* renamed from: p.b.q.t */
public class C1210t extends C1202p {

    /* renamed from: d */
    public final SeekBar f3417d;

    /* renamed from: e */
    public Drawable f3418e;

    /* renamed from: f */
    public ColorStateList f3419f = null;

    /* renamed from: g */
    public Mode f3420g = null;

    /* renamed from: h */
    public boolean f3421h = false;

    /* renamed from: i */
    public boolean f3422i = false;

    public C1210t(SeekBar seekBar) {
        super(seekBar);
        this.f3417d = seekBar;
    }

    /* renamed from: a */
    public final void mo5309a() {
        if (this.f3418e == null) {
            return;
        }
        if (this.f3421h || this.f3422i) {
            Drawable mutate = this.f3418e.mutate();
            this.f3418e = mutate;
            if (this.f3421h) {
                mutate.setTintList(this.f3419f);
            }
            if (this.f3422i) {
                this.f3418e.setTintMode(this.f3420g);
            }
            if (this.f3418e.isStateful()) {
                this.f3418e.setState(this.f3417d.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    public void mo5310a(Canvas canvas) {
        if (this.f3418e != null) {
            int max = this.f3417d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f3418e.getIntrinsicWidth();
                int intrinsicHeight = this.f3418e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f3418e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f3417d.getWidth() - this.f3417d.getPaddingLeft()) - this.f3417d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f3417d.getPaddingLeft(), (float) (this.f3417d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f3418e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: a */
    public void mo5288a(AttributeSet attributeSet, int i) {
        super.mo5288a(attributeSet, i);
        C1213u0 a = C1213u0.m3013a(this.f3417d.getContext(), attributeSet, C1027j.AppCompatSeekBar, i, 0);
        Drawable c = a.mo5320c(C1027j.AppCompatSeekBar_android_thumb);
        if (c != null) {
            this.f3417d.setThumb(c);
        }
        Drawable b = a.mo5318b(C1027j.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f3418e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f3418e = b;
        if (b != null) {
            b.setCallback(this.f3417d);
            b.setLayoutDirection(C1404o.m3551l(this.f3417d));
            if (b.isStateful()) {
                b.setState(this.f3417d.getDrawableState());
            }
            mo5309a();
        }
        this.f3417d.invalidate();
        if (a.mo5326f(C1027j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f3420g = C1145b0.m2889a(a.mo5321d(C1027j.AppCompatSeekBar_tickMarkTintMode, -1), this.f3420g);
            this.f3422i = true;
        }
        if (a.mo5326f(C1027j.AppCompatSeekBar_tickMarkTint)) {
            this.f3419f = a.mo5314a(C1027j.AppCompatSeekBar_tickMarkTint);
            this.f3421h = true;
        }
        a.f3426b.recycle();
        mo5309a();
    }
}
