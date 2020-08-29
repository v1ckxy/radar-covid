package p002es.gob.radarcovid.common.view;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import p003f.p004a.p005a.p108g.p114c.C0834a;
import p003f.p004a.p005a.p108g.p114c.C0835b;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.common.view.AnimatedCircleView */
public final class AnimatedCircleView extends View implements Animatable {

    /* renamed from: e */
    public ValueAnimator f1699e;

    /* renamed from: f */
    public ValueAnimator f1700f;

    /* renamed from: g */
    public int f1701g;

    /* renamed from: h */
    public int f1702h;

    /* renamed from: i */
    public final long f1703i;

    /* renamed from: j */
    public final float f1704j;

    /* renamed from: k */
    public final int f1705k;

    /* renamed from: l */
    public final Paint f1706l;

    /* renamed from: es.gob.radarcovid.common.view.AnimatedCircleView$a */
    public static final class C0385a implements OnGlobalLayoutListener {

        /* renamed from: e */
        public final /* synthetic */ AnimatedCircleView f1707e;

        public C0385a(AnimatedCircleView animatedCircleView) {
            this.f1707e = animatedCircleView;
        }

        public void onGlobalLayout() {
            this.f1707e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            AnimatedCircleView animatedCircleView = this.f1707e;
            animatedCircleView.f1699e = AnimatedCircleView.m1300a(animatedCircleView);
            AnimatedCircleView animatedCircleView2 = this.f1707e;
            if (animatedCircleView2 != null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("width", new int[]{1, (((int) animatedCircleView2.f1704j) * animatedCircleView2.f1705k) + animatedCircleView2.getWidth()})});
                valueAnimator.setDuration(animatedCircleView2.f1703i);
                valueAnimator.setRepeatCount(-1);
                valueAnimator.addUpdateListener(new C0835b(animatedCircleView2));
                animatedCircleView2.f1700f = valueAnimator;
                ValueAnimator valueAnimator2 = this.f1707e.f1699e;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
                ValueAnimator valueAnimator3 = this.f1707e.f1700f;
                if (valueAnimator3 != null) {
                    valueAnimator3.start();
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public AnimatedCircleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AnimatedCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AnimatedCircleView(Context context, AttributeSet attributeSet, int i) {
        if (context != null) {
            super(context, attributeSet, i);
            this.f1703i = 2000;
            this.f1704j = 70.0f;
            this.f1705k = 3;
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setStyle(Style.FILL);
            paint.setAntiAlias(true);
            this.f1706l = paint;
            return;
        }
        C4638h.m10271a("context");
        throw null;
    }

    public /* synthetic */ AnimatedCircleView(Context context, AttributeSet attributeSet, int i, int i2, C4636f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public static final /* synthetic */ ValueAnimator m1300a(AnimatedCircleView animatedCircleView) {
        if (animatedCircleView != null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("width", new int[]{1, (((int) animatedCircleView.f1704j) * animatedCircleView.f1705k) + animatedCircleView.getWidth()})});
            valueAnimator.setDuration(animatedCircleView.f1703i);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setCurrentFraction(0.4f);
            valueAnimator.addUpdateListener(new C0834a(animatedCircleView));
            return valueAnimator;
        }
        throw null;
    }

    public void draw(Canvas canvas) {
        if (canvas != null) {
            super.draw(canvas);
            int i = this.f1705k;
            while (true) {
                String str = "Cannot round NaN value.";
                int i2 = 0;
                if (i >= 1) {
                    int i3 = this.f1701g - (((int) this.f1704j) * i);
                    if (i3 >= 0 && i3 <= getWidth()) {
                        i2 = i3;
                    }
                    Paint paint = this.f1706l;
                    float f = (float) i2;
                    float width = (f / ((float) getWidth())) * 255.0f;
                    if (!Float.isNaN(width)) {
                        paint.setAlpha(255 - Math.round(width));
                        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getWidth()) / 2.0f, f / 2.0f, this.f1706l);
                        i--;
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                } else {
                    int i4 = 3;
                    while (i4 >= 1) {
                        int i5 = this.f1702h - (((int) this.f1704j) * i4);
                        if (i5 < 0 || i5 > getWidth()) {
                            i5 = 0;
                        }
                        Paint paint2 = this.f1706l;
                        float f2 = (float) i5;
                        float width2 = (f2 / ((float) getWidth())) * 255.0f;
                        if (!Float.isNaN(width2)) {
                            paint2.setAlpha(255 - Math.round(width2));
                            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getWidth()) / 2.0f, f2 / 2.0f, this.f1706l);
                            i4--;
                        } else {
                            throw new IllegalArgumentException(str);
                        }
                    }
                    return;
                }
            }
        } else {
            C4638h.m10271a("canvas");
            throw null;
        }
    }

    public boolean isRunning() {
        ValueAnimator valueAnimator = this.f1699e;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.f1700f;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        start();
    }

    public void start() {
        getViewTreeObserver().addOnGlobalLayoutListener(new C0385a(this));
    }

    public void stop() {
        ValueAnimator valueAnimator = this.f1699e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f1700f;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }
}
